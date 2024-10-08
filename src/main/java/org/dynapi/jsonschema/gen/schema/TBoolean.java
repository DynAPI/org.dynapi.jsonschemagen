package org.dynapi.jsonschema.gen.schema;

import lombok.*;
import org.json.JSONObject;

@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class TBoolean extends Schema<TBoolean, Boolean> {
    @Override
    protected JSONObject extraSchemaData() {
        return new JSONObject()
                .put("type", "boolean");
    }
}
