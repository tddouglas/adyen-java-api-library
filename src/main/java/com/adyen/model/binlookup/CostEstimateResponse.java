/*
 * Adyen BinLookup API
 * The BIN Lookup API provides endpoints for retrieving information, such as cost estimates, and 3D Secure supported version based on a given BIN.  ## Authentication You need an [API credential](https://docs.adyen.com/development-resources/api-credentials) to authenticate to the API.  If using an API key, add an `X-API-Key` header with the API key as the value, for example:   ``` curl -H \"Content-Type: application/json\" \\ -H \"X-API-Key: YOUR_API_KEY\" \\ ... ```  Alternatively, you can use the username and password to connect to the API using basic authentication, for example:  ``` curl -U \"ws@Company.YOUR_COMPANY_ACCOUNT\":\"YOUR_BASIC_AUTHENTICATION_PASSWORD\" \\ -H \"Content-Type: application/json\" \\ ... ```  ## Versioning The BinLookup API supports [versioning](https://docs.adyen.com/development-resources/versioning) using a version suffix in the endpoint URL. This suffix has the following format: \"vXX\", where XX is the version number.  For example: ``` https://pal-test.adyen.com/pal/servlet/BinLookup/v54/get3dsAvailability ```## Going live  To authneticate to the live endpoints, you need an [API credential](https://docs.adyen.com/development-resources/api-credentials) from your live Customer Area.  The live endpoint URLs contain a prefix which is unique to your company account: ```  https://{PREFIX}-pal-live.adyenpayments.com/pal/servlet/BinLookup/v54/get3dsAvailability ```  Get your `{PREFIX}` from your live Customer Area under **Developers** > **API URLs** > **Prefix**.
 *
 * The version of the OpenAPI document: 54
 * Contact: developer-experience@adyen.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.binlookup;

import java.util.Objects;
import java.util.Arrays;
import com.adyen.model.binlookup.Amount;
import com.adyen.model.binlookup.CardBin;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.adyen.model.binlookup.JSON;

/**
 * CostEstimateResponse
 */

public class CostEstimateResponse {
  public static final String SERIALIZED_NAME_CARD_BIN = "cardBin";
  @SerializedName(SERIALIZED_NAME_CARD_BIN)
  private CardBin cardBin;

  public static final String SERIALIZED_NAME_COST_ESTIMATE_AMOUNT = "costEstimateAmount";
  @SerializedName(SERIALIZED_NAME_COST_ESTIMATE_AMOUNT)
  private Amount costEstimateAmount;

  public static final String SERIALIZED_NAME_COST_ESTIMATE_REFERENCE = "costEstimateReference";
  @SerializedName(SERIALIZED_NAME_COST_ESTIMATE_REFERENCE)
  private String costEstimateReference;

  public static final String SERIALIZED_NAME_RESULT_CODE = "resultCode";
  @SerializedName(SERIALIZED_NAME_RESULT_CODE)
  private String resultCode;

  public static final String SERIALIZED_NAME_SURCHARGE_TYPE = "surchargeType";
  @SerializedName(SERIALIZED_NAME_SURCHARGE_TYPE)
  private String surchargeType;

  public CostEstimateResponse() { 
  }

  public CostEstimateResponse cardBin(CardBin cardBin) {
    
    this.cardBin = cardBin;
    return this;
  }

   /**
   * Get cardBin
   * @return cardBin
  **/
  @ApiModelProperty(value = "")

  public CardBin getCardBin() {
    return cardBin;
  }


  public void setCardBin(CardBin cardBin) {
    this.cardBin = cardBin;
  }


  public CostEstimateResponse costEstimateAmount(Amount costEstimateAmount) {
    
    this.costEstimateAmount = costEstimateAmount;
    return this;
  }

   /**
   * Get costEstimateAmount
   * @return costEstimateAmount
  **/
  @ApiModelProperty(value = "")

  public Amount getCostEstimateAmount() {
    return costEstimateAmount;
  }


  public void setCostEstimateAmount(Amount costEstimateAmount) {
    this.costEstimateAmount = costEstimateAmount;
  }


  public CostEstimateResponse costEstimateReference(String costEstimateReference) {
    
    this.costEstimateReference = costEstimateReference;
    return this;
  }

   /**
   * Adyen&#39;s 16-character reference associated with the request.
   * @return costEstimateReference
  **/
  @ApiModelProperty(value = "Adyen's 16-character reference associated with the request.")

  public String getCostEstimateReference() {
    return costEstimateReference;
  }


  public void setCostEstimateReference(String costEstimateReference) {
    this.costEstimateReference = costEstimateReference;
  }


  public CostEstimateResponse resultCode(String resultCode) {
    
    this.resultCode = resultCode;
    return this;
  }

   /**
   * The result of the cost estimation.
   * @return resultCode
  **/
  @ApiModelProperty(value = "The result of the cost estimation.")

  public String getResultCode() {
    return resultCode;
  }


  public void setResultCode(String resultCode) {
    this.resultCode = resultCode;
  }


  public CostEstimateResponse surchargeType(String surchargeType) {
    
    this.surchargeType = surchargeType;
    return this;
  }

   /**
   * Indicates the way the charges can be passed on to the cardholder. The following values are possible: * &#x60;ZERO&#x60; - the charges are not allowed to pass on * &#x60;PASSTHROUGH&#x60; - the charges can be passed on * &#x60;UNLIMITED&#x60; - there is no limit on how much surcharge is passed on
   * @return surchargeType
  **/
  @ApiModelProperty(value = "Indicates the way the charges can be passed on to the cardholder. The following values are possible: * `ZERO` - the charges are not allowed to pass on * `PASSTHROUGH` - the charges can be passed on * `UNLIMITED` - there is no limit on how much surcharge is passed on")

  public String getSurchargeType() {
    return surchargeType;
  }


  public void setSurchargeType(String surchargeType) {
    this.surchargeType = surchargeType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CostEstimateResponse costEstimateResponse = (CostEstimateResponse) o;
    return Objects.equals(this.cardBin, costEstimateResponse.cardBin) &&
        Objects.equals(this.costEstimateAmount, costEstimateResponse.costEstimateAmount) &&
        Objects.equals(this.costEstimateReference, costEstimateResponse.costEstimateReference) &&
        Objects.equals(this.resultCode, costEstimateResponse.resultCode) &&
        Objects.equals(this.surchargeType, costEstimateResponse.surchargeType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cardBin, costEstimateAmount, costEstimateReference, resultCode, surchargeType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CostEstimateResponse {\n");
    sb.append("    cardBin: ").append(toIndentedString(cardBin)).append("\n");
    sb.append("    costEstimateAmount: ").append(toIndentedString(costEstimateAmount)).append("\n");
    sb.append("    costEstimateReference: ").append(toIndentedString(costEstimateReference)).append("\n");
    sb.append("    resultCode: ").append(toIndentedString(resultCode)).append("\n");
    sb.append("    surchargeType: ").append(toIndentedString(surchargeType)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("cardBin");
    openapiFields.add("costEstimateAmount");
    openapiFields.add("costEstimateReference");
    openapiFields.add("resultCode");
    openapiFields.add("surchargeType");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CostEstimateResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CostEstimateResponse.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CostEstimateResponse is not found in the empty JSON string", CostEstimateResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CostEstimateResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CostEstimateResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `cardBin`
      if (jsonObj.getAsJsonObject("cardBin") != null) {
        CardBin.validateJsonObject(jsonObj.getAsJsonObject("cardBin"));
      }
      // validate the optional field `costEstimateAmount`
      if (jsonObj.getAsJsonObject("costEstimateAmount") != null) {
        Amount.validateJsonObject(jsonObj.getAsJsonObject("costEstimateAmount"));
      }
      // validate the optional field costEstimateReference
      if (jsonObj.get("costEstimateReference") != null && !jsonObj.get("costEstimateReference").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `costEstimateReference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("costEstimateReference").toString()));
      }
      // validate the optional field resultCode
      if (jsonObj.get("resultCode") != null && !jsonObj.get("resultCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `resultCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("resultCode").toString()));
      }
      // validate the optional field surchargeType
      if (jsonObj.get("surchargeType") != null && !jsonObj.get("surchargeType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `surchargeType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("surchargeType").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CostEstimateResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CostEstimateResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CostEstimateResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CostEstimateResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<CostEstimateResponse>() {
           @Override
           public void write(JsonWriter out, CostEstimateResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CostEstimateResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CostEstimateResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CostEstimateResponse
  * @throws IOException if the JSON string is invalid with respect to CostEstimateResponse
  */
  public static CostEstimateResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CostEstimateResponse.class);
  }

 /**
  * Convert an instance of CostEstimateResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

