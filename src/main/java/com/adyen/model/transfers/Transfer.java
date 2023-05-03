/*
 * Transfers API
 *
 * The version of the OpenAPI document: 3
 * Contact: developer-experience@adyen.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.transfers;

import java.util.Objects;
import java.util.Arrays;
import com.adyen.model.transfers.Amount;
import com.adyen.model.transfers.CounterpartyV3;
import com.adyen.model.transfers.PaymentInstrument;
import com.adyen.model.transfers.ResourceReference;
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

import com.adyen.model.transfers.JSON;

/**
 * Transfer
 */

public class Transfer {
  public static final String SERIALIZED_NAME_ACCOUNT_HOLDER = "accountHolder";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_HOLDER)
  private ResourceReference accountHolder;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Amount amount;

  public static final String SERIALIZED_NAME_BALANCE_ACCOUNT = "balanceAccount";
  @SerializedName(SERIALIZED_NAME_BALANCE_ACCOUNT)
  private ResourceReference balanceAccount;

  public static final String SERIALIZED_NAME_BALANCE_ACCOUNT_ID = "balanceAccountId";
  @SerializedName(SERIALIZED_NAME_BALANCE_ACCOUNT_ID)
  private String balanceAccountId;

  /**
   * The type of transfer.  Possible values:   - **bank**: Transfer to a [transfer instrument](https://docs.adyen.com/api-explorer/#/legalentity/latest/post/transferInstruments__resParam_id) or a bank account.  - **internal**: Transfer to another [balance account](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/post/balanceAccounts__resParam_id) within your platform.  - **issuedCard**: Transfer initiated by a Adyen-issued card.  - **platformPayment**: Fund movements related to payments that are acquired for your users.
   */
  @JsonAdapter(CategoryEnum.Adapter.class)
  public enum CategoryEnum {
    BANK("bank"),
    
    INTERNAL("internal"),
    
    ISSUEDCARD("issuedCard"),
    
    PLATFORMPAYMENT("platformPayment");

    private String value;

    CategoryEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CategoryEnum fromValue(String value) {
      for (CategoryEnum b : CategoryEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<CategoryEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CategoryEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CategoryEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return CategoryEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CATEGORY = "category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private CategoryEnum category;

  public static final String SERIALIZED_NAME_COUNTERPARTY = "counterparty";
  @SerializedName(SERIALIZED_NAME_COUNTERPARTY)
  private CounterpartyV3 counterparty;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  /**
   * The direction of the transfer.  Possible values: **incoming**, **outgoing**.
   */
  @JsonAdapter(DirectionEnum.Adapter.class)
  public enum DirectionEnum {
    INCOMING("incoming"),
    
    OUTGOING("outgoing");

    private String value;

    DirectionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DirectionEnum fromValue(String value) {
      for (DirectionEnum b : DirectionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<DirectionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DirectionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DirectionEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return DirectionEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_DIRECTION = "direction";
  @SerializedName(SERIALIZED_NAME_DIRECTION)
  private DirectionEnum direction;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_PAYMENT_INSTRUMENT = "paymentInstrument";
  @SerializedName(SERIALIZED_NAME_PAYMENT_INSTRUMENT)
  private PaymentInstrument paymentInstrument;

  public static final String SERIALIZED_NAME_PAYMENT_INSTRUMENT_ID = "paymentInstrumentId";
  @SerializedName(SERIALIZED_NAME_PAYMENT_INSTRUMENT_ID)
  private String paymentInstrumentId;

  /**
   * The priority for the bank transfer. This sets the speed at which the transfer is sent and the fees that you have to pay. Required for transfers with &#x60;category&#x60; **bank**.  Possible values:  * **regular**: For normal, low-value transactions.  * **fast**: Faster way to transfer funds but has higher fees. Recommended for high-priority, low-value transactions.  * **wire**: Fastest way to transfer funds but has the highest fees. Recommended for high-priority, high-value transactions.  * **instant**: Instant way to transfer funds in [SEPA countries](https://www.ecb.europa.eu/paym/integration/retail/sepa/html/index.en.html).  * **crossBorder**: High-value transfer to a recipient in a different country.  * **internal**: Transfer to an Adyen-issued business bank account (by bank account number/IBAN).
   */
  @JsonAdapter(PriorityEnum.Adapter.class)
  public enum PriorityEnum {
    CROSSBORDER("crossBorder"),
    
    DIRECTDEBIT("directDebit"),
    
    FAST("fast"),
    
    INSTANT("instant"),
    
    INTERNAL("internal"),
    
    REGULAR("regular"),
    
    WIRE("wire");

    private String value;

    PriorityEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PriorityEnum fromValue(String value) {
      for (PriorityEnum b : PriorityEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PriorityEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PriorityEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PriorityEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PriorityEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PRIORITY = "priority";
  @SerializedName(SERIALIZED_NAME_PRIORITY)
  private PriorityEnum priority;

  /**
   * Additional information about the status of the transfer.
   */
  @JsonAdapter(ReasonEnum.Adapter.class)
  public enum ReasonEnum {
    AMOUNTLIMITEXCEEDED("amountLimitExceeded"),
    
    APPROVED("approved"),
    
    COUNTERPARTYACCOUNTBLOCKED("counterpartyAccountBlocked"),
    
    COUNTERPARTYACCOUNTCLOSED("counterpartyAccountClosed"),
    
    COUNTERPARTYACCOUNTNOTFOUND("counterpartyAccountNotFound"),
    
    COUNTERPARTYADDRESSREQUIRED("counterpartyAddressRequired"),
    
    COUNTERPARTYBANKTIMEDOUT("counterpartyBankTimedOut"),
    
    COUNTERPARTYBANKUNAVAILABLE("counterpartyBankUnavailable"),
    
    ERROR("error"),
    
    NOTENOUGHBALANCE("notEnoughBalance"),
    
    REFUSEDBYCOUNTERPARTYBANK("refusedByCounterpartyBank"),
    
    ROUTENOTFOUND("routeNotFound"),
    
    UNKNOWN("unknown");

    private String value;

    ReasonEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ReasonEnum fromValue(String value) {
      for (ReasonEnum b : ReasonEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ReasonEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ReasonEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ReasonEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ReasonEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_REASON = "reason";
  @SerializedName(SERIALIZED_NAME_REASON)
  private ReasonEnum reason;

  public static final String SERIALIZED_NAME_REFERENCE = "reference";
  @SerializedName(SERIALIZED_NAME_REFERENCE)
  private String reference;

  public static final String SERIALIZED_NAME_REFERENCE_FOR_BENEFICIARY = "referenceForBeneficiary";
  @SerializedName(SERIALIZED_NAME_REFERENCE_FOR_BENEFICIARY)
  private String referenceForBeneficiary;

  /**
   * The result of the transfer.   For example, **authorised**, **refused**, or **error**.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    APPROVALPENDING("approvalPending"),
    
    ATMWITHDRAWAL("atmWithdrawal"),
    
    ATMWITHDRAWALREVERSALPENDING("atmWithdrawalReversalPending"),
    
    ATMWITHDRAWALREVERSED("atmWithdrawalReversed"),
    
    AUTHADJUSTMENTAUTHORISED("authAdjustmentAuthorised"),
    
    AUTHADJUSTMENTERROR("authAdjustmentError"),
    
    AUTHADJUSTMENTREFUSED("authAdjustmentRefused"),
    
    AUTHORISED("authorised"),
    
    BANKTRANSFER("bankTransfer"),
    
    BANKTRANSFERPENDING("bankTransferPending"),
    
    BOOKED("booked"),
    
    BOOKINGPENDING("bookingPending"),
    
    CANCELLED("cancelled"),
    
    CAPTUREPENDING("capturePending"),
    
    CAPTUREREVERSALPENDING("captureReversalPending"),
    
    CAPTUREREVERSED("captureReversed"),
    
    CAPTURED("captured"),
    
    CHARGEBACK("chargeback"),
    
    CHARGEBACKPENDING("chargebackPending"),
    
    CHARGEBACKREVERSALPENDING("chargebackReversalPending"),
    
    CHARGEBACKREVERSED("chargebackReversed"),
    
    CREDITED("credited"),
    
    DEPOSITCORRECTION("depositCorrection"),
    
    DEPOSITCORRECTIONPENDING("depositCorrectionPending"),
    
    DISPUTE("dispute"),
    
    DISPUTECLOSED("disputeClosed"),
    
    DISPUTEEXPIRED("disputeExpired"),
    
    DISPUTENEEDSREVIEW("disputeNeedsReview"),
    
    ERROR("error"),
    
    EXPIRED("expired"),
    
    FAILED("failed"),
    
    FEE("fee"),
    
    FEEPENDING("feePending"),
    
    INTERNALTRANSFER("internalTransfer"),
    
    INTERNALTRANSFERPENDING("internalTransferPending"),
    
    INVOICEDEDUCTION("invoiceDeduction"),
    
    INVOICEDEDUCTIONPENDING("invoiceDeductionPending"),
    
    MANUALCORRECTIONPENDING("manualCorrectionPending"),
    
    MANUALLYCORRECTED("manuallyCorrected"),
    
    MATCHEDSTATEMENT("matchedStatement"),
    
    MATCHEDSTATEMENTPENDING("matchedStatementPending"),
    
    MERCHANTPAYIN("merchantPayin"),
    
    MERCHANTPAYINPENDING("merchantPayinPending"),
    
    MERCHANTPAYINREVERSED("merchantPayinReversed"),
    
    MERCHANTPAYINREVERSEDPENDING("merchantPayinReversedPending"),
    
    MISCCOST("miscCost"),
    
    MISCCOSTPENDING("miscCostPending"),
    
    PAYMENTCOST("paymentCost"),
    
    PAYMENTCOSTPENDING("paymentCostPending"),
    
    RECEIVED("received"),
    
    REFUNDPENDING("refundPending"),
    
    REFUNDREVERSALPENDING("refundReversalPending"),
    
    REFUNDREVERSED("refundReversed"),
    
    REFUNDED("refunded"),
    
    REFUSED("refused"),
    
    RESERVEADJUSTMENT("reserveAdjustment"),
    
    RESERVEADJUSTMENTPENDING("reserveAdjustmentPending"),
    
    RETURNED("returned"),
    
    SECONDCHARGEBACK("secondChargeback"),
    
    SECONDCHARGEBACKPENDING("secondChargebackPending"),
    
    UNDEFINED("undefined");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public Transfer() { 
  }

  public Transfer accountHolder(ResourceReference accountHolder) {
    
    this.accountHolder = accountHolder;
    return this;
  }

   /**
   * Get accountHolder
   * @return accountHolder
  **/
  @ApiModelProperty(value = "")

  public ResourceReference getAccountHolder() {
    return accountHolder;
  }


  public void setAccountHolder(ResourceReference accountHolder) {
    this.accountHolder = accountHolder;
  }


  public Transfer amount(Amount amount) {
    
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


  public Transfer balanceAccount(ResourceReference balanceAccount) {
    
    this.balanceAccount = balanceAccount;
    return this;
  }

   /**
   * Get balanceAccount
   * @return balanceAccount
  **/
  @ApiModelProperty(value = "")

  public ResourceReference getBalanceAccount() {
    return balanceAccount;
  }


  public void setBalanceAccount(ResourceReference balanceAccount) {
    this.balanceAccount = balanceAccount;
  }


  public Transfer balanceAccountId(String balanceAccountId) {
    
    this.balanceAccountId = balanceAccountId;
    return this;
  }

   /**
   * The unique identifier of the source [balance account](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/post/balanceAccounts__resParam_id).
   * @return balanceAccountId
   * @deprecated
  **/
  @Deprecated
  @ApiModelProperty(value = "The unique identifier of the source [balance account](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/post/balanceAccounts__resParam_id).")

  public String getBalanceAccountId() {
    return balanceAccountId;
  }


  public void setBalanceAccountId(String balanceAccountId) {
    this.balanceAccountId = balanceAccountId;
  }


  public Transfer category(CategoryEnum category) {
    
    this.category = category;
    return this;
  }

   /**
   * The type of transfer.  Possible values:   - **bank**: Transfer to a [transfer instrument](https://docs.adyen.com/api-explorer/#/legalentity/latest/post/transferInstruments__resParam_id) or a bank account.  - **internal**: Transfer to another [balance account](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/post/balanceAccounts__resParam_id) within your platform.  - **issuedCard**: Transfer initiated by a Adyen-issued card.  - **platformPayment**: Fund movements related to payments that are acquired for your users.
   * @return category
  **/
  @ApiModelProperty(required = true, value = "The type of transfer.  Possible values:   - **bank**: Transfer to a [transfer instrument](https://docs.adyen.com/api-explorer/#/legalentity/latest/post/transferInstruments__resParam_id) or a bank account.  - **internal**: Transfer to another [balance account](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/post/balanceAccounts__resParam_id) within your platform.  - **issuedCard**: Transfer initiated by a Adyen-issued card.  - **platformPayment**: Fund movements related to payments that are acquired for your users.")

  public CategoryEnum getCategory() {
    return category;
  }


  public void setCategory(CategoryEnum category) {
    this.category = category;
  }


  public Transfer counterparty(CounterpartyV3 counterparty) {
    
    this.counterparty = counterparty;
    return this;
  }

   /**
   * Get counterparty
   * @return counterparty
  **/
  @ApiModelProperty(required = true, value = "")

  public CounterpartyV3 getCounterparty() {
    return counterparty;
  }


  public void setCounterparty(CounterpartyV3 counterparty) {
    this.counterparty = counterparty;
  }


  public Transfer description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Your description for the transfer. It is used by most banks as the transfer description. We recommend sending a maximum of 140 characters, otherwise the description may be truncated.  Supported characters: **[a-z] [A-Z] [0-9] / - ?** **: ( ) . , &#39; + Space**  Supported characters for **regular** and **fast** transfers to a US counterparty: **[a-z] [A-Z] [0-9] &amp; $ % # @** **~ &#x3D; + - _ &#39; \&quot; ! ?**
   * @return description
  **/
  @ApiModelProperty(value = "Your description for the transfer. It is used by most banks as the transfer description. We recommend sending a maximum of 140 characters, otherwise the description may be truncated.  Supported characters: **[a-z] [A-Z] [0-9] / - ?** **: ( ) . , ' + Space**  Supported characters for **regular** and **fast** transfers to a US counterparty: **[a-z] [A-Z] [0-9] & $ % # @** **~ = + - _ ' \" ! ?**")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public Transfer direction(DirectionEnum direction) {
    
    this.direction = direction;
    return this;
  }

   /**
   * The direction of the transfer.  Possible values: **incoming**, **outgoing**.
   * @return direction
  **/
  @ApiModelProperty(value = "The direction of the transfer.  Possible values: **incoming**, **outgoing**.")

  public DirectionEnum getDirection() {
    return direction;
  }


  public void setDirection(DirectionEnum direction) {
    this.direction = direction;
  }


  public Transfer id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The ID of the resource.
   * @return id
  **/
  @ApiModelProperty(value = "The ID of the resource.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public Transfer paymentInstrument(PaymentInstrument paymentInstrument) {
    
    this.paymentInstrument = paymentInstrument;
    return this;
  }

   /**
   * Get paymentInstrument
   * @return paymentInstrument
  **/
  @ApiModelProperty(value = "")

  public PaymentInstrument getPaymentInstrument() {
    return paymentInstrument;
  }


  public void setPaymentInstrument(PaymentInstrument paymentInstrument) {
    this.paymentInstrument = paymentInstrument;
  }


  public Transfer paymentInstrumentId(String paymentInstrumentId) {
    
    this.paymentInstrumentId = paymentInstrumentId;
    return this;
  }

   /**
   * The unique identifier of the [payment instrument](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/post/balanceAccounts__resParam_id) used in the transfer.
   * @return paymentInstrumentId
   * @deprecated
  **/
  @Deprecated
  @ApiModelProperty(value = "The unique identifier of the [payment instrument](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/post/balanceAccounts__resParam_id) used in the transfer.")

  public String getPaymentInstrumentId() {
    return paymentInstrumentId;
  }


  public void setPaymentInstrumentId(String paymentInstrumentId) {
    this.paymentInstrumentId = paymentInstrumentId;
  }


  public Transfer priority(PriorityEnum priority) {
    
    this.priority = priority;
    return this;
  }

   /**
   * The priority for the bank transfer. This sets the speed at which the transfer is sent and the fees that you have to pay. Required for transfers with &#x60;category&#x60; **bank**.  Possible values:  * **regular**: For normal, low-value transactions.  * **fast**: Faster way to transfer funds but has higher fees. Recommended for high-priority, low-value transactions.  * **wire**: Fastest way to transfer funds but has the highest fees. Recommended for high-priority, high-value transactions.  * **instant**: Instant way to transfer funds in [SEPA countries](https://www.ecb.europa.eu/paym/integration/retail/sepa/html/index.en.html).  * **crossBorder**: High-value transfer to a recipient in a different country.  * **internal**: Transfer to an Adyen-issued business bank account (by bank account number/IBAN).
   * @return priority
  **/
  @ApiModelProperty(value = "The priority for the bank transfer. This sets the speed at which the transfer is sent and the fees that you have to pay. Required for transfers with `category` **bank**.  Possible values:  * **regular**: For normal, low-value transactions.  * **fast**: Faster way to transfer funds but has higher fees. Recommended for high-priority, low-value transactions.  * **wire**: Fastest way to transfer funds but has the highest fees. Recommended for high-priority, high-value transactions.  * **instant**: Instant way to transfer funds in [SEPA countries](https://www.ecb.europa.eu/paym/integration/retail/sepa/html/index.en.html).  * **crossBorder**: High-value transfer to a recipient in a different country.  * **internal**: Transfer to an Adyen-issued business bank account (by bank account number/IBAN).")

  public PriorityEnum getPriority() {
    return priority;
  }


  public void setPriority(PriorityEnum priority) {
    this.priority = priority;
  }


  public Transfer reason(ReasonEnum reason) {
    
    this.reason = reason;
    return this;
  }

   /**
   * Additional information about the status of the transfer.
   * @return reason
  **/
  @ApiModelProperty(value = "Additional information about the status of the transfer.")

  public ReasonEnum getReason() {
    return reason;
  }


  public void setReason(ReasonEnum reason) {
    this.reason = reason;
  }


  public Transfer reference(String reference) {
    
    this.reference = reference;
    return this;
  }

   /**
   * Your reference for the transfer, used internally within your platform. If you don&#39;t provide this in the request, Adyen generates a unique reference.
   * @return reference
  **/
  @ApiModelProperty(value = "Your reference for the transfer, used internally within your platform. If you don't provide this in the request, Adyen generates a unique reference.")

  public String getReference() {
    return reference;
  }


  public void setReference(String reference) {
    this.reference = reference;
  }


  public Transfer referenceForBeneficiary(String referenceForBeneficiary) {
    
    this.referenceForBeneficiary = referenceForBeneficiary;
    return this;
  }

   /**
   *  A reference that is sent to the recipient. This reference is also sent in all notification webhooks related to the transfer, so you can use it to track statuses for both the source and recipient of funds.   Supported characters: **a-z**, **A-Z**, **0-9**. The maximum length depends on the &#x60;category&#x60;.  - **internal**: 80 characters  - **bank**: 35 characters when transferring to an IBAN, 15 characters for others.
   * @return referenceForBeneficiary
  **/
  @ApiModelProperty(value = " A reference that is sent to the recipient. This reference is also sent in all notification webhooks related to the transfer, so you can use it to track statuses for both the source and recipient of funds.   Supported characters: **a-z**, **A-Z**, **0-9**. The maximum length depends on the `category`.  - **internal**: 80 characters  - **bank**: 35 characters when transferring to an IBAN, 15 characters for others.")

  public String getReferenceForBeneficiary() {
    return referenceForBeneficiary;
  }


  public void setReferenceForBeneficiary(String referenceForBeneficiary) {
    this.referenceForBeneficiary = referenceForBeneficiary;
  }


  public Transfer status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * The result of the transfer.   For example, **authorised**, **refused**, or **error**.
   * @return status
  **/
  @ApiModelProperty(required = true, value = "The result of the transfer.   For example, **authorised**, **refused**, or **error**.")

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Transfer transfer = (Transfer) o;
    return Objects.equals(this.accountHolder, transfer.accountHolder) &&
        Objects.equals(this.amount, transfer.amount) &&
        Objects.equals(this.balanceAccount, transfer.balanceAccount) &&
        Objects.equals(this.balanceAccountId, transfer.balanceAccountId) &&
        Objects.equals(this.category, transfer.category) &&
        Objects.equals(this.counterparty, transfer.counterparty) &&
        Objects.equals(this.description, transfer.description) &&
        Objects.equals(this.direction, transfer.direction) &&
        Objects.equals(this.id, transfer.id) &&
        Objects.equals(this.paymentInstrument, transfer.paymentInstrument) &&
        Objects.equals(this.paymentInstrumentId, transfer.paymentInstrumentId) &&
        Objects.equals(this.priority, transfer.priority) &&
        Objects.equals(this.reason, transfer.reason) &&
        Objects.equals(this.reference, transfer.reference) &&
        Objects.equals(this.referenceForBeneficiary, transfer.referenceForBeneficiary) &&
        Objects.equals(this.status, transfer.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountHolder, amount, balanceAccount, balanceAccountId, category, counterparty, description, direction, id, paymentInstrument, paymentInstrumentId, priority, reason, reference, referenceForBeneficiary, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Transfer {\n");
    sb.append("    accountHolder: ").append(toIndentedString(accountHolder)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    balanceAccount: ").append(toIndentedString(balanceAccount)).append("\n");
    sb.append("    balanceAccountId: ").append(toIndentedString(balanceAccountId)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    counterparty: ").append(toIndentedString(counterparty)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    paymentInstrument: ").append(toIndentedString(paymentInstrument)).append("\n");
    sb.append("    paymentInstrumentId: ").append(toIndentedString(paymentInstrumentId)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    referenceForBeneficiary: ").append(toIndentedString(referenceForBeneficiary)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("accountHolder");
    openapiFields.add("amount");
    openapiFields.add("balanceAccount");
    openapiFields.add("balanceAccountId");
    openapiFields.add("category");
    openapiFields.add("counterparty");
    openapiFields.add("description");
    openapiFields.add("direction");
    openapiFields.add("id");
    openapiFields.add("paymentInstrument");
    openapiFields.add("paymentInstrumentId");
    openapiFields.add("priority");
    openapiFields.add("reason");
    openapiFields.add("reference");
    openapiFields.add("referenceForBeneficiary");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("amount");
    openapiRequiredFields.add("category");
    openapiRequiredFields.add("counterparty");
    openapiRequiredFields.add("status");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Transfer
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (Transfer.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Transfer is not found in the empty JSON string", Transfer.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Transfer.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Transfer` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Transfer.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field `accountHolder`
      if (jsonObj.getAsJsonObject("accountHolder") != null) {
        ResourceReference.validateJsonObject(jsonObj.getAsJsonObject("accountHolder"));
      }
      // validate the optional field `amount`
      if (jsonObj.getAsJsonObject("amount") != null) {
        Amount.validateJsonObject(jsonObj.getAsJsonObject("amount"));
      }
      // validate the optional field `balanceAccount`
      if (jsonObj.getAsJsonObject("balanceAccount") != null) {
        ResourceReference.validateJsonObject(jsonObj.getAsJsonObject("balanceAccount"));
      }
      // validate the optional field balanceAccountId
      if (jsonObj.get("balanceAccountId") != null && !jsonObj.get("balanceAccountId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `balanceAccountId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("balanceAccountId").toString()));
      }
      // ensure the field category can be parsed to an enum value
      if (jsonObj.get("category") != null) {
        if(!jsonObj.get("category").isJsonPrimitive()) {
          throw new IllegalArgumentException(String.format("Expected the field `category` to be a primitive type in the JSON string but got `%s`", jsonObj.get("category").toString()));
        }
        CategoryEnum.fromValue(jsonObj.get("category").getAsString());
      }
      // validate the optional field `counterparty`
      if (jsonObj.getAsJsonObject("counterparty") != null) {
        CounterpartyV3.validateJsonObject(jsonObj.getAsJsonObject("counterparty"));
      }
      // validate the optional field description
      if (jsonObj.get("description") != null && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // ensure the field direction can be parsed to an enum value
      if (jsonObj.get("direction") != null) {
        if(!jsonObj.get("direction").isJsonPrimitive()) {
          throw new IllegalArgumentException(String.format("Expected the field `direction` to be a primitive type in the JSON string but got `%s`", jsonObj.get("direction").toString()));
        }
        DirectionEnum.fromValue(jsonObj.get("direction").getAsString());
      }
      // validate the optional field id
      if (jsonObj.get("id") != null && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // validate the optional field `paymentInstrument`
      if (jsonObj.getAsJsonObject("paymentInstrument") != null) {
        PaymentInstrument.validateJsonObject(jsonObj.getAsJsonObject("paymentInstrument"));
      }
      // validate the optional field paymentInstrumentId
      if (jsonObj.get("paymentInstrumentId") != null && !jsonObj.get("paymentInstrumentId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `paymentInstrumentId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("paymentInstrumentId").toString()));
      }
      // ensure the field priority can be parsed to an enum value
      if (jsonObj.get("priority") != null) {
        if(!jsonObj.get("priority").isJsonPrimitive()) {
          throw new IllegalArgumentException(String.format("Expected the field `priority` to be a primitive type in the JSON string but got `%s`", jsonObj.get("priority").toString()));
        }
        PriorityEnum.fromValue(jsonObj.get("priority").getAsString());
      }
      // ensure the field reason can be parsed to an enum value
      if (jsonObj.get("reason") != null) {
        if(!jsonObj.get("reason").isJsonPrimitive()) {
          throw new IllegalArgumentException(String.format("Expected the field `reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reason").toString()));
        }
        ReasonEnum.fromValue(jsonObj.get("reason").getAsString());
      }
      // validate the optional field reference
      if (jsonObj.get("reference") != null && !jsonObj.get("reference").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reference").toString()));
      }
      // validate the optional field referenceForBeneficiary
      if (jsonObj.get("referenceForBeneficiary") != null && !jsonObj.get("referenceForBeneficiary").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `referenceForBeneficiary` to be a primitive type in the JSON string but got `%s`", jsonObj.get("referenceForBeneficiary").toString()));
      }
      // ensure the field status can be parsed to an enum value
      if (jsonObj.get("status") != null) {
        if(!jsonObj.get("status").isJsonPrimitive()) {
          throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
        }
        StatusEnum.fromValue(jsonObj.get("status").getAsString());
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Transfer.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Transfer' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Transfer> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Transfer.class));

       return (TypeAdapter<T>) new TypeAdapter<Transfer>() {
           @Override
           public void write(JsonWriter out, Transfer value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Transfer read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Transfer given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Transfer
  * @throws IOException if the JSON string is invalid with respect to Transfer
  */
  public static Transfer fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Transfer.class);
  }

 /**
  * Convert an instance of Transfer to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

