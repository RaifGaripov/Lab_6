package com.company;

import com.google.gson.*;
import com.company.shapes.*;

import java.lang.reflect.Type;

public class InterfaceAdapter implements JsonSerializer<Shape>, JsonDeserializer<Shape> {
    private static final String CLASSNAME = "CLASSNAME";
    private static final String DATA = "DATA";

    @Override
    public JsonElement serialize(Shape o, Type type, JsonSerializationContext jsonSerializationContext) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty(CLASSNAME, o.getClass().getName());
        jsonObject.add(DATA, jsonSerializationContext.serialize(o));
        return jsonObject;
    }

    @Override
    public Shape deserialize(JsonElement json, Type type, JsonDeserializationContext context) {
        JsonObject jsonObject = json.getAsJsonObject();
        JsonPrimitive prim = (JsonPrimitive) jsonObject.get(CLASSNAME);
        String className = prim.getAsString();
        Class name = getObjectClass(className);
        return context.deserialize(jsonObject.get(DATA), name);
    }

    public Class getObjectClass(String className) {
        try {
            return Class.forName(className);
        } catch (ClassNotFoundException e) {
            throw new JsonParseException(e.getMessage());
        }
    }
}
