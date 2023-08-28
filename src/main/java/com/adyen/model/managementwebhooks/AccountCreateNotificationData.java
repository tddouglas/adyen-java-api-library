/*
 * Management Webhooks
 *
 * The version of the OpenAPI document: 1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.managementwebhooks;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.adyen.model.managementwebhooks.AccountCapabilityData;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.JsonProcessingException;


/**
 * AccountCreateNotificationData
 */
@JsonPropertyOrder({
  AccountCreateNotificationData.JSON_PROPERTY_CAPABILITIES,
  AccountCreateNotificationData.JSON_PROPERTY_COMPANY_ID,
  AccountCreateNotificationData.JSON_PROPERTY_LEGAL_ENTITY_ID,
  AccountCreateNotificationData.JSON_PROPERTY_MERCHANT_ID,
  AccountCreateNotificationData.JSON_PROPERTY_STATUS
})

public class AccountCreateNotificationData {
  public static final String JSON_PROPERTY_CAPABILITIES = "capabilities";
  private Map<String, AccountCapabilityData> capabilities = new HashMap<>();

  public static final String JSON_PROPERTY_COMPANY_ID = "companyId";
  private String companyId;

  public static final String JSON_PROPERTY_LEGAL_ENTITY_ID = "legalEntityId";
  private String legalEntityId;

  public static final String JSON_PROPERTY_MERCHANT_ID = "merchantId";
  private String merchantId;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public AccountCreateNotificationData() { 
  }

  public AccountCreateNotificationData capabilities(Map<String, AccountCapabilityData> capabilities) {
    this.capabilities = capabilities;
    return this;
  }

  public AccountCreateNotificationData putCapabilitiesItem(String key, AccountCapabilityData capabilitiesItem) {
    this.capabilities.put(key, capabilitiesItem);
    return this;
  }

   /**
   * Key-value pairs that specify the actions that the merchant account can do and its settings. The key is a capability. For example, the **sendToTransferInstrument** is the capability required before you can pay out funds to the bank account. The value is an object containing the settings for the capability.
   * @return capabilities
  **/
  @ApiModelProperty(required = true, value = "Key-value pairs that specify the actions that the merchant account can do and its settings. The key is a capability. For example, the **sendToTransferInstrument** is the capability required before you can pay out funds to the bank account. The value is an object containing the settings for the capability.")
  @JsonProperty(JSON_PROPERTY_CAPABILITIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, AccountCapabilityData> getCapabilities() {
    return capabilities;
  }


  @JsonProperty(JSON_PROPERTY_CAPABILITIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCapabilities(Map<String, AccountCapabilityData> capabilities) {
    this.capabilities = capabilities;
  }


  public AccountCreateNotificationData companyId(String companyId) {
    this.companyId = companyId;
    return this;
  }

   /**
   * The unique identifier of the company account.
   * @return companyId
  **/
  @ApiModelProperty(required = true, value = "The unique identifier of the company account.")
  @JsonProperty(JSON_PROPERTY_COMPANY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCompanyId() {
    return companyId;
  }


  @JsonProperty(JSON_PROPERTY_COMPANY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCompanyId(String companyId) {
    this.companyId = companyId;
  }


  public AccountCreateNotificationData legalEntityId(String legalEntityId) {
    this.legalEntityId = legalEntityId;
    return this;
  }

   /**
   * The unique identifier of the [legal entity](https://docs.adyen.com/api-explorer/legalentity/latest/post/legalEntities#responses-200-id).
   * @return legalEntityId
  **/
  @ApiModelProperty(value = "The unique identifier of the [legal entity](https://docs.adyen.com/api-explorer/legalentity/latest/post/legalEntities#responses-200-id).")
  @JsonProperty(JSON_PROPERTY_LEGAL_ENTITY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLegalEntityId() {
    return legalEntityId;
  }


  @JsonProperty(JSON_PROPERTY_LEGAL_ENTITY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLegalEntityId(String legalEntityId) {
    this.legalEntityId = legalEntityId;
  }


  public AccountCreateNotificationData merchantId(String merchantId) {
    this.merchantId = merchantId;
    return this;
  }

   /**
   * The unique identifier of the merchant account.
   * @return merchantId
  **/
  @ApiModelProperty(required = true, value = "The unique identifier of the merchant account.")
  @JsonProperty(JSON_PROPERTY_MERCHANT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMerchantId() {
    return merchantId;
  }


  @JsonProperty(JSON_PROPERTY_MERCHANT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMerchantId(String merchantId) {
    this.merchantId = merchantId;
  }


  public AccountCreateNotificationData status(String status) {
    this.status = status;
    return this;
  }

   /**
   * The status of the merchant account.  Possible values:  * **PreActive**: The merchant account has been created. Users cannot access the merchant account in the Customer Area. The account cannot process payments. * **Active**: Users can access the merchant account in the Customer Area. If the company account is also **Active**, then payment processing and payouts are enabled. * **InactiveWithModifications**: Users can access the merchant account in the Customer Area. The account cannot process new payments but can still modify payments, for example issue refunds. The account can still receive payouts. * **Inactive**: Users can access the merchant account in the Customer Area. Payment processing and payouts are disabled. * **Closed**: The account is closed and this cannot be reversed. Users cannot log in. Payment processing and payouts are disabled.
   * @return status
  **/
  @ApiModelProperty(required = true, value = "The status of the merchant account.  Possible values:  * **PreActive**: The merchant account has been created. Users cannot access the merchant account in the Customer Area. The account cannot process payments. * **Active**: Users can access the merchant account in the Customer Area. If the company account is also **Active**, then payment processing and payouts are enabled. * **InactiveWithModifications**: Users can access the merchant account in the Customer Area. The account cannot process new payments but can still modify payments, for example issue refunds. The account can still receive payouts. * **Inactive**: Users can access the merchant account in the Customer Area. Payment processing and payouts are disabled. * **Closed**: The account is closed and this cannot be reversed. Users cannot log in. Payment processing and payouts are disabled.")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(String status) {
    this.status = status;
  }


  /**
   * Return true if this AccountCreateNotificationData object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountCreateNotificationData accountCreateNotificationData = (AccountCreateNotificationData) o;
    return Objects.equals(this.capabilities, accountCreateNotificationData.capabilities) &&
        Objects.equals(this.companyId, accountCreateNotificationData.companyId) &&
        Objects.equals(this.legalEntityId, accountCreateNotificationData.legalEntityId) &&
        Objects.equals(this.merchantId, accountCreateNotificationData.merchantId) &&
        Objects.equals(this.status, accountCreateNotificationData.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(capabilities, companyId, legalEntityId, merchantId, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountCreateNotificationData {\n");
    sb.append("    capabilities: ").append(toIndentedString(capabilities)).append("\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    legalEntityId: ").append(toIndentedString(legalEntityId)).append("\n");
    sb.append("    merchantId: ").append(toIndentedString(merchantId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

/**
   * Create an instance of AccountCreateNotificationData given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AccountCreateNotificationData
   * @throws JsonProcessingException if the JSON string is invalid with respect to AccountCreateNotificationData
   */
  public static AccountCreateNotificationData fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, AccountCreateNotificationData.class);
  }
/**
  * Convert an instance of AccountCreateNotificationData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

