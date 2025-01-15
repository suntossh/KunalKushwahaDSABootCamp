package parser.bd;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;

public class BDJsonParserApp {
    public static void main(String[] args) {
        // Sample JSON string
//        String jsonString = """
//                {
//                     "id": 1,
//                     "itemName": "theItem",
//                     "owner": {
//                         "id": 2,
//                         "name": "theUser"
//                     }
//                 }
//        """;

        String jsonString = """
                        {
                                    "id": 1,
                                    "itemName": "theItem",
                                    "createdBy": 2,
                                    "owner": {
                                                "id": 2,
                                                "name": "theUser"
                                            }
                                            
    
                                
                                
                         }
                """;


        try {
//            // Create ObjectMapper
//            ObjectMapper objectMapper = new ObjectMapper();
//
//            // Deserialize JSON string to ConditionsWrapper
//            Item itemWithOwner = new ObjectMapper().readValue(jsonString, Item.class);


            ObjectMapper mapper = new ObjectMapper();
            SimpleModule module = new SimpleModule();
            module.addDeserializer(Item.class, new ItemDeserializer());
            mapper.registerModule(module);

            Item itemWithOutOwner = mapper.readValue(jsonString, Item.class);


            // Print the parsed object
            System.out.println("Parsed ConditionsWrapper: ");
            System.out.println(itemWithOutOwner);


        } catch (Exception e) {
            System.err.println("Error parsing JSON: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
