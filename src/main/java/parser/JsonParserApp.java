package parser;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;

import java.math.BigDecimal;
import java.util.List;

public class JsonParserApp {
    public static void main(String[] args) {
        // Sample JSON string
        String jsonString = """
        {
          "name":"Santossh",
          "status":"GC",
          "conditions": [
            {
              "property": "amount",
              "operator": ">",
              "value": 1000.50
            },
            {
              "property": "currency",
              "operator": "in",
              "value": ["USD", "EUR"]
            },
            {
              "property": "dateOfBirth",
              "operator": "=",
              "value": {
                "date": "1990-01-01",
                "time": "12:00:00",
                "placeOfBirth": "New York"
              }
            }
          ]
        }
        """;

/*        String jsonString = """
        {
            {
              "property": "dateOfBirth",
              "operator": "=",
              "value": {
                "date": "1990-01-01",
                "time": "12:00:00",
                "placeOfBirth": "New York"
              }
            }
        }
        """;*/

        try {
            // Create ObjectMapper
            ObjectMapper  objectMapper = new ObjectMapper();


            SimpleModule module = new SimpleModule();
            module.addDeserializer(Condition.class, new ValueDeserializer());
            objectMapper.registerModule(module);

            // Deserialize JSON string to ConditionsWrapper
            ConditionsWrapper wrapper = objectMapper.readValue(jsonString, ConditionsWrapper.class);
            List<Condition> conditions = wrapper.getConditions();
            for(Condition c :conditions){
                if(c.getProperty().equalsIgnoreCase("amount")){
                    Double amountVal = (Double) c.getValue();
                    System.out.println("VALUE"+amountVal+"  itsType"+amountVal.getClass().getTypeName());
                    BigDecimal bigDecimalAmount = BigDecimal.valueOf(amountVal);
                    System.out.println("Amount Value: " + bigDecimalAmount + "  Type: " + bigDecimalAmount.getClass().getTypeName());
                } else if (c.getProperty().equalsIgnoreCase("currency")) {
                    List<String> currencyList = (List<String>) c.getValue();
                    System.out.println("VALUE"+currencyList+"  itsType"+currencyList.getClass().getTypeName());
                } else if (c.getProperty().equalsIgnoreCase("dateOfBirth")) {
                    DateOfBirth dateOfBirth = (DateOfBirth) c.getValue();
                    System.out.println("VALUE"+dateOfBirth+"  itsType"+dateOfBirth.getClass().getTypeName());
                }else {

                }
            }


            // Print the parsed object
            System.out.println("Parsed ConditionsWrapper: ");
            System.out.println(wrapper);
        } catch (Exception e) {
            System.err.println("Error parsing JSON: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
