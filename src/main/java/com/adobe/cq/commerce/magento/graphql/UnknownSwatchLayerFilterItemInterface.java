/*******************************************************************************
 *
 *    Copyright 2019 Adobe. All rights reserved.
 *    This file is licensed to you under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License. You may obtain a copy
 *    of the License at http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software distributed under
 *    the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR REPRESENTATIONS
 *    OF ANY KIND, either express or implied. See the License for the specific language
 *    governing permissions and limitations under the License.
 *
 ******************************************************************************/

package com.adobe.cq.commerce.magento.graphql;

import java.util.Map;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;

/**
 * 
 */
public class UnknownSwatchLayerFilterItemInterface extends AbstractResponse<UnknownSwatchLayerFilterItemInterface> implements SwatchLayerFilterItemInterface {
    public UnknownSwatchLayerFilterItemInterface() {
    }

    public UnknownSwatchLayerFilterItemInterface(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "swatch_data": {
                    SwatchData optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new SwatchData(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "__typename": {
                    responseData.put(key, jsonAsString(field.getValue(), key));
                    break;
                }
                default: {
                    throw new SchemaViolationError(this, key, field.getValue());
                }
            }
        }
    }

    public static SwatchLayerFilterItemInterface create(JsonObject fields) throws SchemaViolationError {
        String typeName = fields.getAsJsonPrimitive("__typename").getAsString();
        switch (typeName) {
            case "SwatchLayerFilterItem": {
                return new SwatchLayerFilterItem(fields);
            }

            default: {
                return new UnknownSwatchLayerFilterItemInterface(fields);
            }
        }
    }

    public String getGraphQlTypeName() {
        return (String) get("__typename");
    }

    /**
     * Data required to render swatch filter item
     */

    public SwatchData getSwatchData() {
        return (SwatchData) get("swatch_data");
    }

    public UnknownSwatchLayerFilterItemInterface setSwatchData(SwatchData arg) {
        optimisticData.put(getKey("swatch_data"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "swatch_data": return true;

            default: return false;
        }
    }
}
