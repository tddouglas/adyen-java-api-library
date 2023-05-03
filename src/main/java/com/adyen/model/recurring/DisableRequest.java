/*
 * Adyen Recurring API
 * The Recurring APIs allow you to manage and remove your tokens or saved payment details. Tokens should be created with validation during a payment request.  For more information, refer to our [Tokenization documentation](https://docs.adyen.com/online-payments/tokenization). ## Authentication You need an [API credential](https://docs.adyen.com/development-resources/api-credentials) to authenticate to the API.  If using an API key, add an `X-API-Key` header with the API key as the value, for example:   ``` curl -H \"Content-Type: application/json\" \\ -H \"X-API-Key: YOUR_API_KEY\" \\ ... ```  Alternatively, you can use the username and password to connect to the API using basic authentication, for example:  ``` curl -U \"ws@Company.YOUR_COMPANY_ACCOUNT\":\"YOUR_BASIC_AUTHENTICATION_PASSWORD\" \\ -H \"Content-Type: application/json\" \\ ... ```  ## Versioning Recurring API supports [versioning](https://docs.adyen.com/development-resources/versioning) using a version suffix in the endpoint URL. This suffix has the following format: \"vXX\", where XX is the version number.  For example: ``` https://pal-test.adyen.com/pal/servlet/Recurring/v68/disable ```  ## Going live  To authenticate to the live endpoints, you need an [API credential](https://docs.adyen.com/development-resources/api-credentials) from your live Customer Area.  The live endpoint URLs contain a prefix which is unique to your company account: ```  https://{PREFIX}-pal-live.adyenpayments.com/pal/servlet/Recurring/v68/disable ```  Get your `{PREFIX}` from your live Customer Area under **Developers** > **API URLs** > **Prefix**.
 *
 * The version of the OpenAPI document: 68
 * Contact: developer-experience@adyen.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.recurring;

import java.util.Objects;
import java.util.Arrays;
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

import com.adyen.model.recurring.JSON;

/**
 * DisableRequest
 */

public class DisableRequest {
  public static final String SERIALIZED_NAME_CONTRACT = "contract";
  @SerializedName(SERIALIZED_NAME_CONTRACT)
  private String contract;

  public static final String SERIALIZED_NAME_MERCHANT_ACCOUNT = "merchantAccount";
  @SerializedName(SERIALIZED_NAME_MERCHANT_ACCOUNT)
  private String merchantAccount;

  public static final String SERIALIZED_NAME_RECURRING_DETAIL_REFERENCE = "recurringDetailReference";
  @SerializedName(SERIALIZED_NAME_RECURRING_DETAIL_REFERENCE)
  private String recurringDetailReference;

  public static final String SERIALIZED_NAME_SHOPPER_REFERENCE = "shopperReference";
  @SerializedName(SERIALIZED_NAME_SHOPPER_REFERENCE)
  private String shopperReference;

  public DisableRequest() { 
  }

  public DisableRequest contract(String contract) {
    
    this.contract = contract;
    return this;
  }

   /**
   * Specify the contract if you only want to disable a specific use.  This field can be set to one of the following values, or to their combination (comma-separated): * ONECLICK * RECURRING * PAYOUT
   * @return contract
  **/
  @ApiModelProperty(value = "Specify the contract if you only want to disable a specific use.  This field can be set to one of the following values, or to their combination (comma-separated): * ONECLICK * RECURRING * PAYOUT")

  public String getContract() {
    return contract;
  }


  public void setContract(String contract) {
    this.contract = contract;
  }


  public DisableRequest merchantAccount(String merchantAccount) {
    
    this.merchantAccount = merchantAccount;
    return this;
  }

   /**
   * The merchant account identifier with which you want to process the transaction.
   * @return merchantAccount
  **/
  @ApiModelProperty(required = true, value = "The merchant account identifier with which you want to process the transaction.")

  public String getMerchantAccount() {
    return merchantAccount;
  }


  public void setMerchantAccount(String merchantAccount) {
    this.merchantAccount = merchantAccount;
  }


  public DisableRequest recurringDetailReference(String recurringDetailReference) {
    
    this.recurringDetailReference = recurringDetailReference;
    return this;
  }

   /**
   * The ID that uniquely identifies the recurring detail reference.  If it is not provided, the whole recurring contract of the &#x60;shopperReference&#x60; will be disabled, which includes all recurring details.
   * @return recurringDetailReference
  **/
  @ApiModelProperty(value = "The ID that uniquely identifies the recurring detail reference.  If it is not provided, the whole recurring contract of the `shopperReference` will be disabled, which includes all recurring details.")

  public String getRecurringDetailReference() {
    return recurringDetailReference;
  }


  public void setRecurringDetailReference(String recurringDetailReference) {
    this.recurringDetailReference = recurringDetailReference;
  }


  public DisableRequest shopperReference(String shopperReference) {
    
    this.shopperReference = shopperReference;
    return this;
  }

   /**
   * The ID that uniquely identifies the shopper.  This &#x60;shopperReference&#x60; must be the same as the &#x60;shopperReference&#x60; used in the initial payment.
   * @return shopperReference
  **/
  @ApiModelProperty(required = true, value = "The ID that uniquely identifies the shopper.  This `shopperReference` must be the same as the `shopperReference` used in the initial payment.")

  public String getShopperReference() {
    return shopperReference;
  }


  public void setShopperReference(String shopperReference) {
    this.shopperReference = shopperReference;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DisableRequest disableRequest = (DisableRequest) o;
    return Objects.equals(this.contract, disableRequest.contract) &&
        Objects.equals(this.merchantAccount, disableRequest.merchantAccount) &&
        Objects.equals(this.recurringDetailReference, disableRequest.recurringDetailReference) &&
        Objects.equals(this.shopperReference, disableRequest.shopperReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contract, merchantAccount, recurringDetailReference, shopperReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DisableRequest {\n");
    sb.append("    contract: ").append(toIndentedString(contract)).append("\n");
    sb.append("    merchantAccount: ").append(toIndentedString(merchantAccount)).append("\n");
    sb.append("    recurringDetailReference: ").append(toIndentedString(recurringDetailReference)).append("\n");
    sb.append("    shopperReference: ").append(toIndentedString(shopperReference)).append("\n");
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
    openapiFields.add("contract");
    openapiFields.add("merchantAccount");
    openapiFields.add("recurringDetailReference");
    openapiFields.add("shopperReference");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("merchantAccount");
    openapiRequiredFields.add("shopperReference");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DisableRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (DisableRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in DisableRequest is not found in the empty JSON string", DisableRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!DisableRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DisableRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DisableRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field contract
      if (jsonObj.get("contract") != null && !jsonObj.get("contract").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contract` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contract").toString()));
      }
      // validate the optional field merchantAccount
      if (jsonObj.get("merchantAccount") != null && !jsonObj.get("merchantAccount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchantAccount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchantAccount").toString()));
      }
      // validate the optional field recurringDetailReference
      if (jsonObj.get("recurringDetailReference") != null && !jsonObj.get("recurringDetailReference").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `recurringDetailReference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("recurringDetailReference").toString()));
      }
      // validate the optional field shopperReference
      if (jsonObj.get("shopperReference") != null && !jsonObj.get("shopperReference").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shopperReference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shopperReference").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DisableRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DisableRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DisableRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DisableRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<DisableRequest>() {
           @Override
           public void write(JsonWriter out, DisableRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DisableRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DisableRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DisableRequest
  * @throws IOException if the JSON string is invalid with respect to DisableRequest
  */
  public static DisableRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DisableRequest.class);
  }

 /**
  * Convert an instance of DisableRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

