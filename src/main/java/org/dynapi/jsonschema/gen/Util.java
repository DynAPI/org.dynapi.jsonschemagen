package org.dynapi.jsonschema.gen;

import org.json.JSONArray;
import org.json.JSONObject;

class Util {
    protected static Object parseStringToJsonX(String string) {
        if (string.startsWith("{") && string.endsWith("}")) return new JSONObject(string);
        if (string.startsWith("[") && string.endsWith("]")) return new JSONArray(string);
        if (string.startsWith("\"") && string.endsWith("\"")) return string.substring(1, string.length() - 1);
        if (string.matches("\\d+")) return Integer.parseInt(string);
        if (string.matches("\\d*\\.\\d+")) return Double.parseDouble(string);
        return switch (string) {
            case "true" -> true;
            case "false" -> false;
            case "null" -> null;
            default -> string;
        };
    }
}
