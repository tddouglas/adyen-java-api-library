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
import com.adyen.model.binlookup.CostEstimateAssumptions;
import com.adyen.model.binlookup.MerchantDetails;
import com.adyen.model.binlookup.Recurring;
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
 * CostEstimateRequest
 */

public class CostEstimateRequest {
  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Amount amount;

  public static final String SERIALIZED_NAME_ASSUMPTIONS = "assumptions";
  @SerializedName(SERIALIZED_NAME_ASSUMPTIONS)
  private CostEstimateAssumptions assumptions;

  public static final String SERIALIZED_NAME_CARD_NUMBER = "cardNumber";
  @SerializedName(SERIALIZED_NAME_CARD_NUMBER)
  private String cardNumber;

  public static final String SERIALIZED_NAME_ENCRYPTED_CARD_NUMBER = "encryptedCardNumber";
  @SerializedName(SERIALIZED_NAME_ENCRYPTED_CARD_NUMBER)
  private String encryptedCardNumber;

  public static final String SERIALIZED_NAME_MERCHANT_ACCOUNT = "merchantAccount";
  @SerializedName(SERIALIZED_NAME_MERCHANT_ACCOUNT)
  private String merchantAccount;

  public static final String SERIALIZED_NAME_MERCHANT_DETAILS = "merchantDetails";
  @SerializedName(SERIALIZED_NAME_MERCHANT_DETAILS)
  private MerchantDetails merchantDetails;

  public static final String SERIALIZED_NAME_RECURRING = "recurring";
  @SerializedName(SERIALIZED_NAME_RECURRING)
  private Recurring recurring;

  public static final String SERIALIZED_NAME_SELECTED_RECURRING_DETAIL_REFERENCE = "selectedRecurringDetailReference";
  @SerializedName(SERIALIZED_NAME_SELECTED_RECURRING_DETAIL_REFERENCE)
  private String selectedRecurringDetailReference;

  /**
   * Specifies the sales channel, through which the shopper gives their card details, and whether the shopper is a returning customer. For the web service API, Adyen assumes Ecommerce shopper interaction by default.  This field has the following possible values: * &#x60;Ecommerce&#x60; - Online transactions where the cardholder is present (online). For better authorisation rates, we recommend sending the card security code (CSC) along with the request. * &#x60;ContAuth&#x60; - Card on file and/or subscription transactions, where the card holder is known to the merchant (returning customer). If the shopper is present (online), you can supply also the CSC to improve authorisation (one-click payment). * &#x60;Moto&#x60; - Mail-order and telephone-order transactions where the shopper is in contact with the merchant via email or telephone. * &#x60;POS&#x60; - Point-of-sale transactions where the shopper is physically present to make a payment using a secure payment terminal.
   */
  @JsonAdapter(ShopperInteractionEnum.Adapter.class)
  public enum ShopperInteractionEnum {
    ECOMMERCE("Ecommerce"),
    
    CONTAUTH("ContAuth"),
    
    MOTO("Moto"),
    
    POS("POS");

    private String value;

    ShopperInteractionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ShopperInteractionEnum fromValue(String value) {
      for (ShopperInteractionEnum b : ShopperInteractionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ShopperInteractionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ShopperInteractionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ShopperInteractionEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ShopperInteractionEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SHOPPER_INTERACTION = "shopperInteraction";
  @SerializedName(SERIALIZED_NAME_SHOPPER_INTERACTION)
  private ShopperInteractionEnum shopperInteraction;

  public static final String SERIALIZED_NAME_SHOPPER_REFERENCE = "shopperReference";
  @SerializedName(SERIALIZED_NAME_SHOPPER_REFERENCE)
  private String shopperReference;

  public CostEstimateRequest() { 
  }

  public CostEstimateRequest amount(Amount amount) {
    
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


  public CostEstimateRequest assumptions(CostEstimateAssumptions assumptions) {
    
    this.assumptions = assumptions;
    return this;
  }

   /**
   * Get assumptions
   * @return assumptions
  **/
  @ApiModelProperty(value = "")

  public CostEstimateAssumptions getAssumptions() {
    return assumptions;
  }


  public void setAssumptions(CostEstimateAssumptions assumptions) {
    this.assumptions = assumptions;
  }


  public CostEstimateRequest cardNumber(String cardNumber) {
    
    this.cardNumber = cardNumber;
    return this;
  }

   /**
   * The card number (4-19 characters) for PCI compliant use cases. Do not use any separators.  &gt; Either the &#x60;cardNumber&#x60; or &#x60;encryptedCardNumber&#x60; field must be provided in a payment request.
   * @return cardNumber
  **/
  @ApiModelProperty(value = "The card number (4-19 characters) for PCI compliant use cases. Do not use any separators.  > Either the `cardNumber` or `encryptedCardNumber` field must be provided in a payment request.")

  public String getCardNumber() {
    return cardNumber;
  }


  public void setCardNumber(String cardNumber) {
    this.cardNumber = cardNumber;
  }


  public CostEstimateRequest encryptedCardNumber(String encryptedCardNumber) {
    
    this.encryptedCardNumber = encryptedCardNumber;
    return this;
  }

   /**
   * Encrypted data that stores card information for non PCI-compliant use cases. The encrypted data must be created with the Checkout Card Component or Secured Fields Component, and must contain the &#x60;encryptedCardNumber&#x60; field.  &gt; Either the &#x60;cardNumber&#x60; or &#x60;encryptedCardNumber&#x60; field must be provided in a payment request.
   * @return encryptedCardNumber
  **/
  @ApiModelProperty(value = "Encrypted data that stores card information for non PCI-compliant use cases. The encrypted data must be created with the Checkout Card Component or Secured Fields Component, and must contain the `encryptedCardNumber` field.  > Either the `cardNumber` or `encryptedCardNumber` field must be provided in a payment request.")

  public String getEncryptedCardNumber() {
    return encryptedCardNumber;
  }


  public void setEncryptedCardNumber(String encryptedCardNumber) {
    this.encryptedCardNumber = encryptedCardNumber;
  }


  public CostEstimateRequest merchantAccount(String merchantAccount) {
    
    this.merchantAccount = merchantAccount;
    return this;
  }

   /**
   * The merchant account identifier you want to process the (transaction) request with.
   * @return merchantAccount
  **/
  @ApiModelProperty(required = true, value = "The merchant account identifier you want to process the (transaction) request with.")

  public String getMerchantAccount() {
    return merchantAccount;
  }


  public void setMerchantAccount(String merchantAccount) {
    this.merchantAccount = merchantAccount;
  }


  public CostEstimateRequest merchantDetails(MerchantDetails merchantDetails) {
    
    this.merchantDetails = merchantDetails;
    return this;
  }

   /**
   * Get merchantDetails
   * @return merchantDetails
  **/
  @ApiModelProperty(value = "")

  public MerchantDetails getMerchantDetails() {
    return merchantDetails;
  }


  public void setMerchantDetails(MerchantDetails merchantDetails) {
    this.merchantDetails = merchantDetails;
  }


  public CostEstimateRequest recurring(Recurring recurring) {
    
    this.recurring = recurring;
    return this;
  }

   /**
   * Get recurring
   * @return recurring
  **/
  @ApiModelProperty(value = "")

  public Recurring getRecurring() {
    return recurring;
  }


  public void setRecurring(Recurring recurring) {
    this.recurring = recurring;
  }


  public CostEstimateRequest selectedRecurringDetailReference(String selectedRecurringDetailReference) {
    
    this.selectedRecurringDetailReference = selectedRecurringDetailReference;
    return this;
  }

   /**
   * The &#x60;recurringDetailReference&#x60; you want to use for this cost estimate. The value &#x60;LATEST&#x60; can be used to select the most recently stored recurring detail.
   * @return selectedRecurringDetailReference
  **/
  @ApiModelProperty(value = "The `recurringDetailReference` you want to use for this cost estimate. The value `LATEST` can be used to select the most recently stored recurring detail.")

  public String getSelectedRecurringDetailReference() {
    return selectedRecurringDetailReference;
  }


  public void setSelectedRecurringDetailReference(String selectedRecurringDetailReference) {
    this.selectedRecurringDetailReference = selectedRecurringDetailReference;
  }


  public CostEstimateRequest shopperInteraction(ShopperInteractionEnum shopperInteraction) {
    
    this.shopperInteraction = shopperInteraction;
    return this;
  }

   /**
   * Specifies the sales channel, through which the shopper gives their card details, and whether the shopper is a returning customer. For the web service API, Adyen assumes Ecommerce shopper interaction by default.  This field has the following possible values: * &#x60;Ecommerce&#x60; - Online transactions where the cardholder is present (online). For better authorisation rates, we recommend sending the card security code (CSC) along with the request. * &#x60;ContAuth&#x60; - Card on file and/or subscription transactions, where the card holder is known to the merchant (returning customer). If the shopper is present (online), you can supply also the CSC to improve authorisation (one-click payment). * &#x60;Moto&#x60; - Mail-order and telephone-order transactions where the shopper is in contact with the merchant via email or telephone. * &#x60;POS&#x60; - Point-of-sale transactions where the shopper is physically present to make a payment using a secure payment terminal.
   * @return shopperInteraction
  **/
  @ApiModelProperty(value = "Specifies the sales channel, through which the shopper gives their card details, and whether the shopper is a returning customer. For the web service API, Adyen assumes Ecommerce shopper interaction by default.  This field has the following possible values: * `Ecommerce` - Online transactions where the cardholder is present (online). For better authorisation rates, we recommend sending the card security code (CSC) along with the request. * `ContAuth` - Card on file and/or subscription transactions, where the card holder is known to the merchant (returning customer). If the shopper is present (online), you can supply also the CSC to improve authorisation (one-click payment). * `Moto` - Mail-order and telephone-order transactions where the shopper is in contact with the merchant via email or telephone. * `POS` - Point-of-sale transactions where the shopper is physically present to make a payment using a secure payment terminal.")

  public ShopperInteractionEnum getShopperInteraction() {
    return shopperInteraction;
  }


  public void setShopperInteraction(ShopperInteractionEnum shopperInteraction) {
    this.shopperInteraction = shopperInteraction;
  }


  public CostEstimateRequest shopperReference(String shopperReference) {
    
    this.shopperReference = shopperReference;
    return this;
  }

   /**
   * Required for recurring payments.  Your reference to uniquely identify this shopper, for example user ID or account ID. Minimum length: 3 characters. &gt; Your reference must not include personally identifiable information (PII), for example name or email address.
   * @return shopperReference
  **/
  @ApiModelProperty(value = "Required for recurring payments.  Your reference to uniquely identify this shopper, for example user ID or account ID. Minimum length: 3 characters. > Your reference must not include personally identifiable information (PII), for example name or email address.")

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
    CostEstimateRequest costEstimateRequest = (CostEstimateRequest) o;
    return Objects.equals(this.amount, costEstimateRequest.amount) &&
        Objects.equals(this.assumptions, costEstimateRequest.assumptions) &&
        Objects.equals(this.cardNumber, costEstimateRequest.cardNumber) &&
        Objects.equals(this.encryptedCardNumber, costEstimateRequest.encryptedCardNumber) &&
        Objects.equals(this.merchantAccount, costEstimateRequest.merchantAccount) &&
        Objects.equals(this.merchantDetails, costEstimateRequest.merchantDetails) &&
        Objects.equals(this.recurring, costEstimateRequest.recurring) &&
        Objects.equals(this.selectedRecurringDetailReference, costEstimateRequest.selectedRecurringDetailReference) &&
        Objects.equals(this.shopperInteraction, costEstimateRequest.shopperInteraction) &&
        Objects.equals(this.shopperReference, costEstimateRequest.shopperReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, assumptions, cardNumber, encryptedCardNumber, merchantAccount, merchantDetails, recurring, selectedRecurringDetailReference, shopperInteraction, shopperReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CostEstimateRequest {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    assumptions: ").append(toIndentedString(assumptions)).append("\n");
    sb.append("    cardNumber: ").append(toIndentedString(cardNumber)).append("\n");
    sb.append("    encryptedCardNumber: ").append(toIndentedString(encryptedCardNumber)).append("\n");
    sb.append("    merchantAccount: ").append(toIndentedString(merchantAccount)).append("\n");
    sb.append("    merchantDetails: ").append(toIndentedString(merchantDetails)).append("\n");
    sb.append("    recurring: ").append(toIndentedString(recurring)).append("\n");
    sb.append("    selectedRecurringDetailReference: ").append(toIndentedString(selectedRecurringDetailReference)).append("\n");
    sb.append("    shopperInteraction: ").append(toIndentedString(shopperInteraction)).append("\n");
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
    openapiFields.add("amount");
    openapiFields.add("assumptions");
    openapiFields.add("cardNumber");
    openapiFields.add("encryptedCardNumber");
    openapiFields.add("merchantAccount");
    openapiFields.add("merchantDetails");
    openapiFields.add("recurring");
    openapiFields.add("selectedRecurringDetailReference");
    openapiFields.add("shopperInteraction");
    openapiFields.add("shopperReference");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("amount");
    openapiRequiredFields.add("merchantAccount");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CostEstimateRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CostEstimateRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CostEstimateRequest is not found in the empty JSON string", CostEstimateRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CostEstimateRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CostEstimateRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CostEstimateRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field `amount`
      if (jsonObj.getAsJsonObject("amount") != null) {
        Amount.validateJsonObject(jsonObj.getAsJsonObject("amount"));
      }
      // validate the optional field `assumptions`
      if (jsonObj.getAsJsonObject("assumptions") != null) {
        CostEstimateAssumptions.validateJsonObject(jsonObj.getAsJsonObject("assumptions"));
      }
      // validate the optional field cardNumber
      if (jsonObj.get("cardNumber") != null && !jsonObj.get("cardNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cardNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cardNumber").toString()));
      }
      // validate the optional field encryptedCardNumber
      if (jsonObj.get("encryptedCardNumber") != null && !jsonObj.get("encryptedCardNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `encryptedCardNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("encryptedCardNumber").toString()));
      }
      // validate the optional field merchantAccount
      if (jsonObj.get("merchantAccount") != null && !jsonObj.get("merchantAccount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchantAccount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchantAccount").toString()));
      }
      // validate the optional field `merchantDetails`
      if (jsonObj.getAsJsonObject("merchantDetails") != null) {
        MerchantDetails.validateJsonObject(jsonObj.getAsJsonObject("merchantDetails"));
      }
      // validate the optional field `recurring`
      if (jsonObj.getAsJsonObject("recurring") != null) {
        Recurring.validateJsonObject(jsonObj.getAsJsonObject("recurring"));
      }
      // validate the optional field selectedRecurringDetailReference
      if (jsonObj.get("selectedRecurringDetailReference") != null && !jsonObj.get("selectedRecurringDetailReference").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `selectedRecurringDetailReference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("selectedRecurringDetailReference").toString()));
      }
      // ensure the field shopperInteraction can be parsed to an enum value
      if (jsonObj.get("shopperInteraction") != null) {
        if(!jsonObj.get("shopperInteraction").isJsonPrimitive()) {
          throw new IllegalArgumentException(String.format("Expected the field `shopperInteraction` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shopperInteraction").toString()));
        }
        ShopperInteractionEnum.fromValue(jsonObj.get("shopperInteraction").getAsString());
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
       if (!CostEstimateRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CostEstimateRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CostEstimateRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CostEstimateRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CostEstimateRequest>() {
           @Override
           public void write(JsonWriter out, CostEstimateRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CostEstimateRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CostEstimateRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CostEstimateRequest
  * @throws IOException if the JSON string is invalid with respect to CostEstimateRequest
  */
  public static CostEstimateRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CostEstimateRequest.class);
  }

 /**
  * Convert an instance of CostEstimateRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

