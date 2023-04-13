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

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.bind.util.ISO8601Utils;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonElement;
import io.gsonfire.GsonFireBuilder;
import io.gsonfire.TypeSelector;

import org.apache.commons.codec.binary.Base64;

import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.HashMap;

/*
 * A JSON utility class
 *
 * NOTE: in the future, this class may be converted to static, which may break
 *       backward-compatibility
 */
public class JSON {
    private static Gson gson;
    private static boolean isLenientOnJson = false;
    private static DateTypeAdapter dateTypeAdapter = new DateTypeAdapter();
    private static SqlDateTypeAdapter sqlDateTypeAdapter = new SqlDateTypeAdapter();
    private static OffsetDateTimeTypeAdapter offsetDateTimeTypeAdapter = new OffsetDateTimeTypeAdapter();
    private static LocalDateTypeAdapter localDateTypeAdapter = new LocalDateTypeAdapter();
    private static ByteArrayAdapter byteArrayAdapter = new ByteArrayAdapter();

    @SuppressWarnings("unchecked")
    public static GsonBuilder createGson() {
        GsonFireBuilder fireBuilder = new GsonFireBuilder()
        ;
        GsonBuilder builder = fireBuilder.createGsonBuilder();
        return builder;
    }

    private static String getDiscriminatorValue(JsonElement readElement, String discriminatorField) {
        JsonElement element = readElement.getAsJsonObject().get(discriminatorField);
        if (null == element) {
            throw new IllegalArgumentException("missing discriminator field: <" + discriminatorField + ">");
        }
        return element.getAsString();
    }

    /**
     * Returns the Java class that implements the OpenAPI schema for the specified discriminator value.
     *
     * @param classByDiscriminatorValue The map of discriminator values to Java classes.
     * @param discriminatorValue The value of the OpenAPI discriminator in the input data.
     * @return The Java class that implements the OpenAPI schema
     */
    private static Class getClassByDiscriminator(Map classByDiscriminatorValue, String discriminatorValue) {
        Class clazz = (Class) classByDiscriminatorValue.get(discriminatorValue);
        if (null == clazz) {
            throw new IllegalArgumentException("cannot determine model class of name: <" + discriminatorValue + ">");
        }
        return clazz;
    }

    static {
        GsonBuilder gsonBuilder = createGson();
        gsonBuilder.registerTypeAdapter(Date.class, dateTypeAdapter);
        gsonBuilder.registerTypeAdapter(java.sql.Date.class, sqlDateTypeAdapter);
        gsonBuilder.registerTypeAdapter(OffsetDateTime.class, offsetDateTimeTypeAdapter);
        gsonBuilder.registerTypeAdapter(LocalDate.class, localDateTypeAdapter);
        gsonBuilder.registerTypeAdapter(byte[].class, byteArrayAdapter);
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.AccountInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.AcctInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.AchDetails.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.AdditionalData3DSecure.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.AdditionalDataAirline.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.AdditionalDataCarRental.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.AdditionalDataCommon.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.AdditionalDataLevel23.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.AdditionalDataLodging.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.AdditionalDataOpenInvoice.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.AdditionalDataOpi.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.AdditionalDataRatepay.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.AdditionalDataRetry.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.AdditionalDataRisk.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.AdditionalDataRiskStandalone.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.AdditionalDataSubMerchant.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.AdditionalDataTemporaryServices.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.AdditionalDataWallets.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.Address.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.AfterpayDetails.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.AmazonPayDetails.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.Amount.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.AndroidPayDetails.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.ApplePayDetails.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.ApplePaySessionResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.ApplicationInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.AuthenticationData.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.Avs.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.BacsDirectDebitDetails.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.BankAccount.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.BillDeskDetails.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.BlikDetails.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.BrowserInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.Card.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.CardBrandDetails.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.CardDetails.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.CardDetailsRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.CardDetailsResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.CellulantDetails.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.CheckoutAwaitAction.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.CheckoutBalanceCheckRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.CheckoutBalanceCheckResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.CheckoutCancelOrderRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.CheckoutCancelOrderResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.CheckoutCreateOrderRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.CheckoutCreateOrderResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.CheckoutNativeRedirectAction.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.CheckoutOrder.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.CheckoutOrderResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.CheckoutQrCodeAction.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.CheckoutRedirectAction.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.CheckoutSDKAction.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.CheckoutSessionInstallmentOption.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.CheckoutThreeDS2Action.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.CheckoutUtilityRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.CheckoutUtilityResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.CheckoutVoucherAction.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.CommonField.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.Company.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.CreateApplePaySessionRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.CreateCheckoutSessionRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.CreateCheckoutSessionResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.CreatePaymentAmountUpdateRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.CreatePaymentCancelRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.CreatePaymentCaptureRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.CreatePaymentLinkRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.CreatePaymentRefundRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.CreatePaymentReversalRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.CreateStandalonePaymentCancelRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.DetailsRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.DetailsRequestAuthenticationData.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.DeviceRenderOptions.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.DokuDetails.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.DonationResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.DotpayDetails.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.DragonpayDetails.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.EcontextVoucherDetails.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.ExternalPlatform.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.ForexQuote.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.FraudCheckResult.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.FraudResult.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.FundOrigin.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.FundRecipient.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.GenericIssuerPaymentMethodDetails.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.GiropayDetails.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.GooglePayDetails.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.IdealDetails.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.InputDetail.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.InstallmentOption.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.Installments.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.InstallmentsNumber.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.Item.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.KlarnaDetails.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.LineItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.ListStoredPaymentMethodsResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.Mandate.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.MasterpassDetails.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.MbwayDetails.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.MerchantDevice.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.MerchantRiskIndicator.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.MobilePayDetails.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.ModelConfiguration.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.MolPayDetails.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.Name.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.OpenInvoiceDetails.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.PayPalDetails.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.PayUUpiDetails.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.PayWithGoogleDetails.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.PaymentAmountUpdateResource.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.PaymentCancelResource.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.PaymentCaptureResource.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.PaymentCompletionDetails.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.PaymentDetails.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.PaymentDetailsResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.PaymentDonationRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.PaymentDonationRequestPaymentMethod.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.PaymentLinkResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.PaymentMethod.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.PaymentMethodGroup.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.PaymentMethodIssuer.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.PaymentMethodsRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.PaymentMethodsResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.PaymentRefundResource.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.PaymentRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.PaymentResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.PaymentResponseAction.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.PaymentReversalResource.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.PaymentSetupRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.PaymentSetupResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.PaymentVerificationRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.PaymentVerificationResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.Phone.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.PlatformChargebackLogic.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.RatepayDetails.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.Recurring.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.RecurringDetail.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.ResponseAdditionalData3DSecure.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.ResponseAdditionalDataBillingAddress.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.ResponseAdditionalDataCard.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.ResponseAdditionalDataCommon.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.ResponseAdditionalDataInstallments.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.ResponseAdditionalDataNetworkTokens.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.ResponseAdditionalDataOpi.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.ResponseAdditionalDataSepa.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.ResponsePaymentMethod.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.RiskData.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.SDKEphemPubKey.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.SamsungPayDetails.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.SepaDirectDebitDetails.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.ServiceError.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.ServiceError2.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.ShopperInput.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.ShopperInteractionDevice.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.Split.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.SplitAmount.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.StandalonePaymentCancelResource.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.StoredDetails.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.StoredPaymentMethod.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.StoredPaymentMethodDetails.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.StoredPaymentMethodResource.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.SubInputDetail.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.SubMerchant.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.ThreeDS2RequestData.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.ThreeDS2ResponseData.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.ThreeDS2Result.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.ThreeDSRequestData.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.ThreeDSRequestorAuthenticationInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.ThreeDSRequestorPriorAuthenticationInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.ThreeDSecureData.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.UpdatePaymentLinkRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.UpiCollectDetails.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.UpiIntentDetails.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.VippsDetails.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.VisaCheckoutDetails.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.WeChatPayDetails.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.WeChatPayMiniProgramDetails.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.adyen.model.checkout.ZipDetails.CustomTypeAdapterFactory());
        gson = gsonBuilder.create();
    }

    /**
     * Get Gson.
     *
     * @return Gson
     */
    public static Gson getGson() {
        return gson;
    }

    /**
     * Set Gson.
     *
     * @param gson Gson
     */
    public static void setGson(Gson gson) {
        JSON.gson = gson;
    }

    public static void setLenientOnJson(boolean lenientOnJson) {
        isLenientOnJson = lenientOnJson;
    }

    /**
     * Serialize the given Java object into JSON string.
     *
     * @param obj Object
     * @return String representation of the JSON
     */
    public static String serialize(Object obj) {
        return gson.toJson(obj);
    }

    /**
     * Deserialize the given JSON string to Java object.
     *
     * @param <T>        Type
     * @param body       The JSON string
     * @param returnType The type to deserialize into
     * @return The deserialized Java object
     */
    @SuppressWarnings("unchecked")
    public static <T> T deserialize(String body, Type returnType) {
        try {
            if (isLenientOnJson) {
                JsonReader jsonReader = new JsonReader(new StringReader(body));
                // see https://google-gson.googlecode.com/svn/trunk/gson/docs/javadocs/com/google/gson/stream/JsonReader.html#setLenient(boolean)
                jsonReader.setLenient(true);
                return gson.fromJson(jsonReader, returnType);
            } else {
                return gson.fromJson(body, returnType);
            }
        } catch (JsonParseException e) {
            // Fallback processing when failed to parse JSON form response body:
            // return the response body string directly for the String return type;
            if (returnType.equals(String.class)) {
                return (T) body;
            } else {
                throw (e);
            }
        }
    }

    /**
     * Gson TypeAdapter for Byte Array type
     */
    public static class ByteArrayAdapter extends TypeAdapter<byte[]> {

        @Override
        public void write(JsonWriter out, byte[] value) throws IOException {
            if (value == null) {
                out.nullValue();
            } else {
                out.value(new String(value));
            }
        }

        @Override
        public byte[] read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String bytesAsBase64 = in.nextString();
                    return Base64.decodeBase64(bytesAsBase64);
            }
        }
    }

    /**
     * Gson TypeAdapter for JSR310 OffsetDateTime type
     */
    public static class OffsetDateTimeTypeAdapter extends TypeAdapter<OffsetDateTime> {

        private DateTimeFormatter formatter;

        public OffsetDateTimeTypeAdapter() {
            this(DateTimeFormatter.ISO_OFFSET_DATE_TIME);
        }

        public OffsetDateTimeTypeAdapter(DateTimeFormatter formatter) {
            this.formatter = formatter;
        }

        public void setFormat(DateTimeFormatter dateFormat) {
            this.formatter = dateFormat;
        }

        @Override
        public void write(JsonWriter out, OffsetDateTime date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                out.value(formatter.format(date));
            }
        }

        @Override
        public OffsetDateTime read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    if (date.endsWith("+0000")) {
                        date = date.substring(0, date.length()-5) + "Z";
                    }
                    return OffsetDateTime.parse(date, formatter);
            }
        }
    }

    /**
     * Gson TypeAdapter for JSR310 LocalDate type
     */
    public static class LocalDateTypeAdapter extends TypeAdapter<LocalDate> {

        private DateTimeFormatter formatter;

        public LocalDateTypeAdapter() {
            this(DateTimeFormatter.ISO_LOCAL_DATE);
        }

        public LocalDateTypeAdapter(DateTimeFormatter formatter) {
            this.formatter = formatter;
        }

        public void setFormat(DateTimeFormatter dateFormat) {
            this.formatter = dateFormat;
        }

        @Override
        public void write(JsonWriter out, LocalDate date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                out.value(formatter.format(date));
            }
        }

        @Override
        public LocalDate read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    return LocalDate.parse(date, formatter);
            }
        }
    }

    public static void setOffsetDateTimeFormat(DateTimeFormatter dateFormat) {
        offsetDateTimeTypeAdapter.setFormat(dateFormat);
    }

    public static void setLocalDateFormat(DateTimeFormatter dateFormat) {
        localDateTypeAdapter.setFormat(dateFormat);
    }

    /**
     * Gson TypeAdapter for java.sql.Date type
     * If the dateFormat is null, a simple "yyyy-MM-dd" format will be used
     * (more efficient than SimpleDateFormat).
     */
    public static class SqlDateTypeAdapter extends TypeAdapter<java.sql.Date> {

        private DateFormat dateFormat;

        public SqlDateTypeAdapter() {}

        public SqlDateTypeAdapter(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        public void setFormat(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        @Override
        public void write(JsonWriter out, java.sql.Date date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                String value;
                if (dateFormat != null) {
                    value = dateFormat.format(date);
                } else {
                    value = date.toString();
                }
                out.value(value);
            }
        }

        @Override
        public java.sql.Date read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    try {
                        if (dateFormat != null) {
                            return new java.sql.Date(dateFormat.parse(date).getTime());
                        }
                        return new java.sql.Date(ISO8601Utils.parse(date, new ParsePosition(0)).getTime());
                    } catch (ParseException e) {
                        throw new JsonParseException(e);
                    }
            }
        }
    }

    /**
     * Gson TypeAdapter for java.util.Date type
     * If the dateFormat is null, ISO8601Utils will be used.
     */
    public static class DateTypeAdapter extends TypeAdapter<Date> {

        private DateFormat dateFormat;

        public DateTypeAdapter() {}

        public DateTypeAdapter(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        public void setFormat(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        @Override
        public void write(JsonWriter out, Date date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                String value;
                if (dateFormat != null) {
                    value = dateFormat.format(date);
                } else {
                    value = ISO8601Utils.format(date, true);
                }
                out.value(value);
            }
        }

        @Override
        public Date read(JsonReader in) throws IOException {
            try {
                switch (in.peek()) {
                    case NULL:
                        in.nextNull();
                        return null;
                    default:
                        String date = in.nextString();
                        try {
                            if (dateFormat != null) {
                                return dateFormat.parse(date);
                            }
                            return ISO8601Utils.parse(date, new ParsePosition(0));
                        } catch (ParseException e) {
                            throw new JsonParseException(e);
                        }
                }
            } catch (IllegalArgumentException e) {
                throw new JsonParseException(e);
            }
        }
    }

    public static void setDateFormat(DateFormat dateFormat) {
        dateTypeAdapter.setFormat(dateFormat);
    }

    public static void setSqlDateFormat(DateFormat dateFormat) {
        sqlDateTypeAdapter.setFormat(dateFormat);
    }
}
