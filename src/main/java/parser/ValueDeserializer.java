package parser;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.node.ArrayNode;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ValueDeserializer extends StdDeserializer<Condition> {

    public ValueDeserializer() {
        this(null);
    }

    public ValueDeserializer(Class<?> vc) {
        super(vc);
    }

    @Override
    public Condition deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException {
        JsonNode node = jp.getCodec().readTree(jp);

        // Safe check for 'property' field
        JsonNode propertyNode = node.get("property");
        if (propertyNode == null) {
            throw new IllegalArgumentException("Missing 'property' field in JSON");
        }
        String property = propertyNode.asText();

        // Safe check for 'value' field
        JsonNode valueNode = node.get("value");
        if (valueNode == null) {
            throw new IllegalArgumentException("Missing 'value' field in JSON for property: " + property);
        }

        JsonNode operatorNode = node.get("operator");
        if (operatorNode == null) {
            throw new IllegalArgumentException("Missing 'operator' field in JSON");
        }
        String operator = operatorNode.asText();

        // Handling different types of 'value' based on 'property'
        switch (property) {
            case "amount":
                return new Condition(property,operator,valueNode.asDouble());
            case "currency":

                ArrayNode currenciesNode = (ArrayNode) node.get("value");

                // Convert ArrayNode to ArrayList
                List<String> currenciesList = new ArrayList<>();
                Iterator<JsonNode> elements = currenciesNode.elements();
                while (elements.hasNext()) {
                    currenciesList.add(elements.next().asText());  // Convert each element to a String
                }

                return new Condition(property, operator, currenciesList);  // Parse as array of strings for 'currency'
            case "dateOfBirth":
                // Parse as DateOfBirth object for 'dateOfBirth'



                return new Condition(property,operator,new DateOfBirth());



            default:
                throw new IllegalArgumentException("Unsupported property type: " + property);
        }
    }
}