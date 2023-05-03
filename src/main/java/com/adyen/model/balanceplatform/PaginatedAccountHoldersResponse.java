/*
 * Configuration API
 *
 * The version of the OpenAPI document: 2
 * Contact: developer-experience@adyen.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.balanceplatform;

import java.util.Objects;
import java.util.Arrays;
import com.adyen.model.balanceplatform.AccountHolder;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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

import com.adyen.model.balanceplatform.JSON;

/**
 * PaginatedAccountHoldersResponse
 */

public class PaginatedAccountHoldersResponse {
  public static final String SERIALIZED_NAME_ACCOUNT_HOLDERS = "accountHolders";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_HOLDERS)
  private List<AccountHolder> accountHolders = new ArrayList<>();

  public static final String SERIALIZED_NAME_HAS_NEXT = "hasNext";
  @SerializedName(SERIALIZED_NAME_HAS_NEXT)
  private Boolean hasNext;

  public static final String SERIALIZED_NAME_HAS_PREVIOUS = "hasPrevious";
  @SerializedName(SERIALIZED_NAME_HAS_PREVIOUS)
  private Boolean hasPrevious;

  public PaginatedAccountHoldersResponse() { 
  }

  public PaginatedAccountHoldersResponse accountHolders(List<AccountHolder> accountHolders) {
    
    this.accountHolders = accountHolders;
    return this;
  }

  public PaginatedAccountHoldersResponse addAccountHoldersItem(AccountHolder accountHoldersItem) {
    this.accountHolders.add(accountHoldersItem);
    return this;
  }

   /**
   * List of account holders.
   * @return accountHolders
  **/
  @ApiModelProperty(required = true, value = "List of account holders.")

  public List<AccountHolder> getAccountHolders() {
    return accountHolders;
  }


  public void setAccountHolders(List<AccountHolder> accountHolders) {
    this.accountHolders = accountHolders;
  }


  public PaginatedAccountHoldersResponse hasNext(Boolean hasNext) {
    
    this.hasNext = hasNext;
    return this;
  }

   /**
   * Indicates whether there are more items on the next page.
   * @return hasNext
  **/
  @ApiModelProperty(required = true, value = "Indicates whether there are more items on the next page.")

  public Boolean getHasNext() {
    return hasNext;
  }


  public void setHasNext(Boolean hasNext) {
    this.hasNext = hasNext;
  }


  public PaginatedAccountHoldersResponse hasPrevious(Boolean hasPrevious) {
    
    this.hasPrevious = hasPrevious;
    return this;
  }

   /**
   * Indicates whether there are more items on the previous page.
   * @return hasPrevious
  **/
  @ApiModelProperty(required = true, value = "Indicates whether there are more items on the previous page.")

  public Boolean getHasPrevious() {
    return hasPrevious;
  }


  public void setHasPrevious(Boolean hasPrevious) {
    this.hasPrevious = hasPrevious;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaginatedAccountHoldersResponse paginatedAccountHoldersResponse = (PaginatedAccountHoldersResponse) o;
    return Objects.equals(this.accountHolders, paginatedAccountHoldersResponse.accountHolders) &&
        Objects.equals(this.hasNext, paginatedAccountHoldersResponse.hasNext) &&
        Objects.equals(this.hasPrevious, paginatedAccountHoldersResponse.hasPrevious);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountHolders, hasNext, hasPrevious);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaginatedAccountHoldersResponse {\n");
    sb.append("    accountHolders: ").append(toIndentedString(accountHolders)).append("\n");
    sb.append("    hasNext: ").append(toIndentedString(hasNext)).append("\n");
    sb.append("    hasPrevious: ").append(toIndentedString(hasPrevious)).append("\n");
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
    openapiFields.add("accountHolders");
    openapiFields.add("hasNext");
    openapiFields.add("hasPrevious");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("accountHolders");
    openapiRequiredFields.add("hasNext");
    openapiRequiredFields.add("hasPrevious");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PaginatedAccountHoldersResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (PaginatedAccountHoldersResponse.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in PaginatedAccountHoldersResponse is not found in the empty JSON string", PaginatedAccountHoldersResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PaginatedAccountHoldersResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PaginatedAccountHoldersResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PaginatedAccountHoldersResponse.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      JsonArray jsonArrayaccountHolders = jsonObj.getAsJsonArray("accountHolders");
      if (jsonArrayaccountHolders != null) {
        // ensure the json data is an array
        if (!jsonObj.get("accountHolders").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `accountHolders` to be an array in the JSON string but got `%s`", jsonObj.get("accountHolders").toString()));
        }

        // validate the optional field `accountHolders` (array)
        for (int i = 0; i < jsonArrayaccountHolders.size(); i++) {
          AccountHolder.validateJsonObject(jsonArrayaccountHolders.get(i).getAsJsonObject());
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PaginatedAccountHoldersResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PaginatedAccountHoldersResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PaginatedAccountHoldersResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PaginatedAccountHoldersResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<PaginatedAccountHoldersResponse>() {
           @Override
           public void write(JsonWriter out, PaginatedAccountHoldersResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PaginatedAccountHoldersResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PaginatedAccountHoldersResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PaginatedAccountHoldersResponse
  * @throws IOException if the JSON string is invalid with respect to PaginatedAccountHoldersResponse
  */
  public static PaginatedAccountHoldersResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PaginatedAccountHoldersResponse.class);
  }

 /**
  * Convert an instance of PaginatedAccountHoldersResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

