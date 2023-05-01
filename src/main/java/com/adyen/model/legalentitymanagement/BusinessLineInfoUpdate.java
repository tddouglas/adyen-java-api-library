/*
 * Legal Entity Management API
 *
 * The version of the OpenAPI document: 3
 * Contact: developer-experience@adyen.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.legalentitymanagement;

import java.util.Objects;
import java.util.Arrays;
import com.adyen.model.legalentitymanagement.SourceOfFunds;
import com.adyen.model.legalentitymanagement.WebData;
import com.adyen.model.legalentitymanagement.WebDataExemption;
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

import com.adyen.model.legalentitymanagement.JSON;

/**
 * BusinessLineInfoUpdate
 */

public class BusinessLineInfoUpdate {
  public static final String SERIALIZED_NAME_CAPABILITY = "capability";
  @SerializedName(SERIALIZED_NAME_CAPABILITY)
  private String capability;

  public static final String SERIALIZED_NAME_INDUSTRY_CODE = "industryCode";
  @SerializedName(SERIALIZED_NAME_INDUSTRY_CODE)
  private String industryCode;

  public static final String SERIALIZED_NAME_LEGAL_ENTITY_ID = "legalEntityId";
  @SerializedName(SERIALIZED_NAME_LEGAL_ENTITY_ID)
  private String legalEntityId;

  public static final String SERIALIZED_NAME_SALES_CHANNELS = "salesChannels";
  @SerializedName(SERIALIZED_NAME_SALES_CHANNELS)
  private List<String> salesChannels = null;

  /**
   * The service for which you are creating the business line.  Possible values:**paymentProcessing**, **issuing**, **banking**
   */
  @JsonAdapter(ServiceEnum.Adapter.class)
  public enum ServiceEnum {
    PAYMENTPROCESSING("paymentProcessing"),
    
    ISSUING("issuing"),
    
    BANKING("banking");

    private String value;

    ServiceEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ServiceEnum fromValue(String value) {
      for (ServiceEnum b : ServiceEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ServiceEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ServiceEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ServiceEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ServiceEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SERVICE = "service";
  @SerializedName(SERIALIZED_NAME_SERVICE)
  private ServiceEnum service;

  public static final String SERIALIZED_NAME_SOURCE_OF_FUNDS = "sourceOfFunds";
  @SerializedName(SERIALIZED_NAME_SOURCE_OF_FUNDS)
  private SourceOfFunds sourceOfFunds;

  public static final String SERIALIZED_NAME_WEB_DATA = "webData";
  @SerializedName(SERIALIZED_NAME_WEB_DATA)
  private List<WebData> webData = null;

  public static final String SERIALIZED_NAME_WEB_DATA_EXEMPTION = "webDataExemption";
  @SerializedName(SERIALIZED_NAME_WEB_DATA_EXEMPTION)
  private WebDataExemption webDataExemption;

  public BusinessLineInfoUpdate() { 
  }

  public BusinessLineInfoUpdate capability(String capability) {
    
    this.capability = capability;
    return this;
  }

   /**
   * The capability for which you are creating the business line. For example, **receivePayments**.
   * @return capability
   * @deprecated
  **/
  @Deprecated
  @ApiModelProperty(value = "The capability for which you are creating the business line. For example, **receivePayments**.")

  public String getCapability() {
    return capability;
  }


  public void setCapability(String capability) {
    this.capability = capability;
  }


  public BusinessLineInfoUpdate industryCode(String industryCode) {
    
    this.industryCode = industryCode;
    return this;
  }

   /**
   * A code that represents the industry of your legal entity. For example, **4431A** for computer software stores.
   * @return industryCode
  **/
  @ApiModelProperty(value = "A code that represents the industry of your legal entity. For example, **4431A** for computer software stores.")

  public String getIndustryCode() {
    return industryCode;
  }


  public void setIndustryCode(String industryCode) {
    this.industryCode = industryCode;
  }


  public BusinessLineInfoUpdate legalEntityId(String legalEntityId) {
    
    this.legalEntityId = legalEntityId;
    return this;
  }

   /**
   * Unique identifier of the [legal entity](https://docs.adyen.com/api-explorer/#/legalentity/latest/post/legalEntities__resParam_id) that owns the business line.
   * @return legalEntityId
  **/
  @ApiModelProperty(value = "Unique identifier of the [legal entity](https://docs.adyen.com/api-explorer/#/legalentity/latest/post/legalEntities__resParam_id) that owns the business line.")

  public String getLegalEntityId() {
    return legalEntityId;
  }


  public void setLegalEntityId(String legalEntityId) {
    this.legalEntityId = legalEntityId;
  }


  public BusinessLineInfoUpdate salesChannels(List<String> salesChannels) {
    
    this.salesChannels = salesChannels;
    return this;
  }

  public BusinessLineInfoUpdate addSalesChannelsItem(String salesChannelsItem) {
    if (this.salesChannels == null) {
      this.salesChannels = new ArrayList<>();
    }
    this.salesChannels.add(salesChannelsItem);
    return this;
  }

   /**
   * A list of channels where goods or services are sold.  Possible values: **pos**, **posMoto**, **eCommerce**, **ecomMoto**, **payByLink**.  Required only in combination with the &#x60;service&#x60; **paymentProcessing**.
   * @return salesChannels
  **/
  @ApiModelProperty(value = "A list of channels where goods or services are sold.  Possible values: **pos**, **posMoto**, **eCommerce**, **ecomMoto**, **payByLink**.  Required only in combination with the `service` **paymentProcessing**.")

  public List<String> getSalesChannels() {
    return salesChannels;
  }


  public void setSalesChannels(List<String> salesChannels) {
    this.salesChannels = salesChannels;
  }


  public BusinessLineInfoUpdate service(ServiceEnum service) {
    
    this.service = service;
    return this;
  }

   /**
   * The service for which you are creating the business line.  Possible values:**paymentProcessing**, **issuing**, **banking**
   * @return service
  **/
  @ApiModelProperty(required = true, value = "The service for which you are creating the business line.  Possible values:**paymentProcessing**, **issuing**, **banking**")

  public ServiceEnum getService() {
    return service;
  }


  public void setService(ServiceEnum service) {
    this.service = service;
  }


  public BusinessLineInfoUpdate sourceOfFunds(SourceOfFunds sourceOfFunds) {
    
    this.sourceOfFunds = sourceOfFunds;
    return this;
  }

   /**
   * Get sourceOfFunds
   * @return sourceOfFunds
  **/
  @ApiModelProperty(value = "")

  public SourceOfFunds getSourceOfFunds() {
    return sourceOfFunds;
  }


  public void setSourceOfFunds(SourceOfFunds sourceOfFunds) {
    this.sourceOfFunds = sourceOfFunds;
  }


  public BusinessLineInfoUpdate webData(List<WebData> webData) {
    
    this.webData = webData;
    return this;
  }

  public BusinessLineInfoUpdate addWebDataItem(WebData webDataItem) {
    if (this.webData == null) {
      this.webData = new ArrayList<>();
    }
    this.webData.add(webDataItem);
    return this;
  }

   /**
   * List of website URLs where your user&#39;s goods or services are sold. When this is required for a service but your user does not have an online presence, provide the reason in the &#x60;webDataExemption&#x60; object.
   * @return webData
  **/
  @ApiModelProperty(value = "List of website URLs where your user's goods or services are sold. When this is required for a service but your user does not have an online presence, provide the reason in the `webDataExemption` object.")

  public List<WebData> getWebData() {
    return webData;
  }


  public void setWebData(List<WebData> webData) {
    this.webData = webData;
  }


  public BusinessLineInfoUpdate webDataExemption(WebDataExemption webDataExemption) {
    
    this.webDataExemption = webDataExemption;
    return this;
  }

   /**
   * Get webDataExemption
   * @return webDataExemption
  **/
  @ApiModelProperty(value = "")

  public WebDataExemption getWebDataExemption() {
    return webDataExemption;
  }


  public void setWebDataExemption(WebDataExemption webDataExemption) {
    this.webDataExemption = webDataExemption;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BusinessLineInfoUpdate businessLineInfoUpdate = (BusinessLineInfoUpdate) o;
    return Objects.equals(this.capability, businessLineInfoUpdate.capability) &&
        Objects.equals(this.industryCode, businessLineInfoUpdate.industryCode) &&
        Objects.equals(this.legalEntityId, businessLineInfoUpdate.legalEntityId) &&
        Objects.equals(this.salesChannels, businessLineInfoUpdate.salesChannels) &&
        Objects.equals(this.service, businessLineInfoUpdate.service) &&
        Objects.equals(this.sourceOfFunds, businessLineInfoUpdate.sourceOfFunds) &&
        Objects.equals(this.webData, businessLineInfoUpdate.webData) &&
        Objects.equals(this.webDataExemption, businessLineInfoUpdate.webDataExemption);
  }

  @Override
  public int hashCode() {
    return Objects.hash(capability, industryCode, legalEntityId, salesChannels, service, sourceOfFunds, webData, webDataExemption);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BusinessLineInfoUpdate {\n");
    sb.append("    capability: ").append(toIndentedString(capability)).append("\n");
    sb.append("    industryCode: ").append(toIndentedString(industryCode)).append("\n");
    sb.append("    legalEntityId: ").append(toIndentedString(legalEntityId)).append("\n");
    sb.append("    salesChannels: ").append(toIndentedString(salesChannels)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    sourceOfFunds: ").append(toIndentedString(sourceOfFunds)).append("\n");
    sb.append("    webData: ").append(toIndentedString(webData)).append("\n");
    sb.append("    webDataExemption: ").append(toIndentedString(webDataExemption)).append("\n");
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
    openapiFields.add("capability");
    openapiFields.add("industryCode");
    openapiFields.add("legalEntityId");
    openapiFields.add("salesChannels");
    openapiFields.add("service");
    openapiFields.add("sourceOfFunds");
    openapiFields.add("webData");
    openapiFields.add("webDataExemption");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("service");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to BusinessLineInfoUpdate
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (BusinessLineInfoUpdate.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in BusinessLineInfoUpdate is not found in the empty JSON string", BusinessLineInfoUpdate.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!BusinessLineInfoUpdate.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BusinessLineInfoUpdate` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : BusinessLineInfoUpdate.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field capability
      if (jsonObj.get("capability") != null && !jsonObj.get("capability").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `capability` to be a primitive type in the JSON string but got `%s`", jsonObj.get("capability").toString()));
      }
      // validate the optional field industryCode
      if (jsonObj.get("industryCode") != null && !jsonObj.get("industryCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `industryCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("industryCode").toString()));
      }
      // validate the optional field legalEntityId
      if (jsonObj.get("legalEntityId") != null && !jsonObj.get("legalEntityId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `legalEntityId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("legalEntityId").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("salesChannels") != null && !jsonObj.get("salesChannels").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `salesChannels` to be an array in the JSON string but got `%s`", jsonObj.get("salesChannels").toString()));
      }
      // ensure the field service can be parsed to an enum value
      if (jsonObj.get("service") != null) {
        if(!jsonObj.get("service").isJsonPrimitive()) {
          throw new IllegalArgumentException(String.format("Expected the field `service` to be a primitive type in the JSON string but got `%s`", jsonObj.get("service").toString()));
        }
        ServiceEnum.fromValue(jsonObj.get("service").getAsString());
      }
      // validate the optional field `sourceOfFunds`
      if (jsonObj.getAsJsonObject("sourceOfFunds") != null) {
        SourceOfFunds.validateJsonObject(jsonObj.getAsJsonObject("sourceOfFunds"));
      }
      JsonArray jsonArraywebData = jsonObj.getAsJsonArray("webData");
      if (jsonArraywebData != null) {
        // ensure the json data is an array
        if (!jsonObj.get("webData").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `webData` to be an array in the JSON string but got `%s`", jsonObj.get("webData").toString()));
        }

        // validate the optional field `webData` (array)
        for (int i = 0; i < jsonArraywebData.size(); i++) {
          WebData.validateJsonObject(jsonArraywebData.get(i).getAsJsonObject());
        }
      }
      // validate the optional field `webDataExemption`
      if (jsonObj.getAsJsonObject("webDataExemption") != null) {
        WebDataExemption.validateJsonObject(jsonObj.getAsJsonObject("webDataExemption"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BusinessLineInfoUpdate.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BusinessLineInfoUpdate' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BusinessLineInfoUpdate> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BusinessLineInfoUpdate.class));

       return (TypeAdapter<T>) new TypeAdapter<BusinessLineInfoUpdate>() {
           @Override
           public void write(JsonWriter out, BusinessLineInfoUpdate value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BusinessLineInfoUpdate read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BusinessLineInfoUpdate given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BusinessLineInfoUpdate
  * @throws IOException if the JSON string is invalid with respect to BusinessLineInfoUpdate
  */
  public static BusinessLineInfoUpdate fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BusinessLineInfoUpdate.class);
  }

 /**
  * Convert an instance of BusinessLineInfoUpdate to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

