/*
 * Adyen Checkout API
 *
 * The version of the OpenAPI document: 70
 * Contact: developer-experience@adyen.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.checkout;

import java.util.Objects;
import java.util.Arrays;
import com.adyen.model.checkout.Amount;
import com.adyen.model.checkout.Split;
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

import com.adyen.model.checkout.JSON;

/**
 * CreatePaymentAmountUpdateRequest
 */

public class CreatePaymentAmountUpdateRequest {
  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Amount amount;

  /**
   * The reason for the amount update. Possible values:  * **delayedCharge**  * **noShow**  * **installment**
   */
  @JsonAdapter(IndustryUsageEnum.Adapter.class)
  public enum IndustryUsageEnum {
    DELAYEDCHARGE("delayedCharge"),
    
    INSTALLMENT("installment"),
    
    NOSHOW("noShow");

    private String value;

    IndustryUsageEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static IndustryUsageEnum fromValue(String value) {
      for (IndustryUsageEnum b : IndustryUsageEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<IndustryUsageEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final IndustryUsageEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public IndustryUsageEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return IndustryUsageEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_INDUSTRY_USAGE = "industryUsage";
  @SerializedName(SERIALIZED_NAME_INDUSTRY_USAGE)
  private IndustryUsageEnum industryUsage;

  public static final String SERIALIZED_NAME_MERCHANT_ACCOUNT = "merchantAccount";
  @SerializedName(SERIALIZED_NAME_MERCHANT_ACCOUNT)
  private String merchantAccount;

  public static final String SERIALIZED_NAME_REFERENCE = "reference";
  @SerializedName(SERIALIZED_NAME_REFERENCE)
  private String reference;

  public static final String SERIALIZED_NAME_SPLITS = "splits";
  @SerializedName(SERIALIZED_NAME_SPLITS)
  private List<Split> splits = null;

  public CreatePaymentAmountUpdateRequest() { 
  }

  public CreatePaymentAmountUpdateRequest amount(Amount amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(required = true, value = "")

  public Amount getAmount() {
    return amount;
  }


  public void setAmount(Amount amount) {
    this.amount = amount;
  }


  public CreatePaymentAmountUpdateRequest industryUsage(IndustryUsageEnum industryUsage) {
    
    this.industryUsage = industryUsage;
    return this;
  }

   /**
   * The reason for the amount update. Possible values:  * **delayedCharge**  * **noShow**  * **installment**
   * @return industryUsage
  **/
  @ApiModelProperty(value = "The reason for the amount update. Possible values:  * **delayedCharge**  * **noShow**  * **installment**")

  public IndustryUsageEnum getIndustryUsage() {
    return industryUsage;
  }


  public void setIndustryUsage(IndustryUsageEnum industryUsage) {
    this.industryUsage = industryUsage;
  }


  public CreatePaymentAmountUpdateRequest merchantAccount(String merchantAccount) {
    
    this.merchantAccount = merchantAccount;
    return this;
  }

   /**
   * The merchant account that is used to process the payment.
   * @return merchantAccount
  **/
  @ApiModelProperty(required = true, value = "The merchant account that is used to process the payment.")

  public String getMerchantAccount() {
    return merchantAccount;
  }


  public void setMerchantAccount(String merchantAccount) {
    this.merchantAccount = merchantAccount;
  }


  public CreatePaymentAmountUpdateRequest reference(String reference) {
    
    this.reference = reference;
    return this;
  }

   /**
   * Your reference for the amount update request. Maximum length: 80 characters.
   * @return reference
  **/
  @ApiModelProperty(value = "Your reference for the amount update request. Maximum length: 80 characters.")

  public String getReference() {
    return reference;
  }


  public void setReference(String reference) {
    this.reference = reference;
  }


  public CreatePaymentAmountUpdateRequest splits(List<Split> splits) {
    
    this.splits = splits;
    return this;
  }

  public CreatePaymentAmountUpdateRequest addSplitsItem(Split splitsItem) {
    if (this.splits == null) {
      this.splits = new ArrayList<>();
    }
    this.splits.add(splitsItem);
    return this;
  }

   /**
   * An array of objects specifying how the amount should be split between accounts when using Adyen for Platforms. For details, refer to [Providing split information](https://docs.adyen.com/marketplaces-and-platforms/processing-payments#providing-split-information).
   * @return splits
  **/
  @ApiModelProperty(value = "An array of objects specifying how the amount should be split between accounts when using Adyen for Platforms. For details, refer to [Providing split information](https://docs.adyen.com/marketplaces-and-platforms/processing-payments#providing-split-information).")

  public List<Split> getSplits() {
    return splits;
  }


  public void setSplits(List<Split> splits) {
    this.splits = splits;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreatePaymentAmountUpdateRequest createPaymentAmountUpdateRequest = (CreatePaymentAmountUpdateRequest) o;
    return Objects.equals(this.amount, createPaymentAmountUpdateRequest.amount) &&
        Objects.equals(this.industryUsage, createPaymentAmountUpdateRequest.industryUsage) &&
        Objects.equals(this.merchantAccount, createPaymentAmountUpdateRequest.merchantAccount) &&
        Objects.equals(this.reference, createPaymentAmountUpdateRequest.reference) &&
        Objects.equals(this.splits, createPaymentAmountUpdateRequest.splits);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, industryUsage, merchantAccount, reference, splits);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreatePaymentAmountUpdateRequest {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    industryUsage: ").append(toIndentedString(industryUsage)).append("\n");
    sb.append("    merchantAccount: ").append(toIndentedString(merchantAccount)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    splits: ").append(toIndentedString(splits)).append("\n");
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
    openapiFields.add("amount");
    openapiFields.add("industryUsage");
    openapiFields.add("merchantAccount");
    openapiFields.add("reference");
    openapiFields.add("splits");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("amount");
    openapiRequiredFields.add("merchantAccount");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreatePaymentAmountUpdateRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CreatePaymentAmountUpdateRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreatePaymentAmountUpdateRequest is not found in the empty JSON string", CreatePaymentAmountUpdateRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CreatePaymentAmountUpdateRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreatePaymentAmountUpdateRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreatePaymentAmountUpdateRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field `amount`
      if (jsonObj.getAsJsonObject("amount") != null) {
        Amount.validateJsonObject(jsonObj.getAsJsonObject("amount"));
      }
      // ensure the field industryUsage can be parsed to an enum value
      if (jsonObj.get("industryUsage") != null) {
        if(!jsonObj.get("industryUsage").isJsonPrimitive()) {
          throw new IllegalArgumentException(String.format("Expected the field `industryUsage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("industryUsage").toString()));
        }
        IndustryUsageEnum.fromValue(jsonObj.get("industryUsage").getAsString());
      }
      // validate the optional field merchantAccount
      if (jsonObj.get("merchantAccount") != null && !jsonObj.get("merchantAccount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchantAccount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchantAccount").toString()));
      }
      // validate the optional field reference
      if (jsonObj.get("reference") != null && !jsonObj.get("reference").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reference").toString()));
      }
      JsonArray jsonArraysplits = jsonObj.getAsJsonArray("splits");
      if (jsonArraysplits != null) {
        // ensure the json data is an array
        if (!jsonObj.get("splits").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `splits` to be an array in the JSON string but got `%s`", jsonObj.get("splits").toString()));
        }

        // validate the optional field `splits` (array)
        for (int i = 0; i < jsonArraysplits.size(); i++) {
          Split.validateJsonObject(jsonArraysplits.get(i).getAsJsonObject());
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreatePaymentAmountUpdateRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreatePaymentAmountUpdateRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreatePaymentAmountUpdateRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreatePaymentAmountUpdateRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreatePaymentAmountUpdateRequest>() {
           @Override
           public void write(JsonWriter out, CreatePaymentAmountUpdateRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreatePaymentAmountUpdateRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreatePaymentAmountUpdateRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreatePaymentAmountUpdateRequest
  * @throws IOException if the JSON string is invalid with respect to CreatePaymentAmountUpdateRequest
  */
  public static CreatePaymentAmountUpdateRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreatePaymentAmountUpdateRequest.class);
  }

 /**
  * Convert an instance of CreatePaymentAmountUpdateRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

