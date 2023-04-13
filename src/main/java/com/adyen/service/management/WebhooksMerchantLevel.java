/*
 * Management API
 *
 * The version of the OpenAPI document: 1
 * Contact: developer-experience@adyen.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.service.management;

import com.adyen.ApiKeyAuthenticatedService;
import com.adyen.Client;
import com.adyen.constants.ApiConstants;
import com.adyen.model.management.JSON;
import com.adyen.model.management.CreateMerchantWebhookRequest;
import com.adyen.model.management.GenerateHmacKeyResponse;
import com.adyen.model.management.ListWebhooksResponse;
import com.adyen.model.management.RestServiceError;
import com.adyen.model.management.TestWebhookRequest;
import com.adyen.model.management.TestWebhookResponse;
import com.adyen.model.management.UpdateMerchantWebhookRequest;
import com.adyen.model.management.Webhook;
import com.adyen.service.exception.ApiException;
import com.adyen.service.resource.ManagementResource;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class WebhooksMerchantLevel extends ApiKeyAuthenticatedService {
    public WebhooksMerchantLevel(Client client) {
        super(client);
    }

    /**
     * Remove a webhook
     *
     * @param merchantId The unique identifier of the merchant account. (required)
     * @param webhookId Unique identifier of the webhook configuration. (required)
     * @throws ApiException if fails to make API call
     */
    public void removeWebhook(String merchantId, String webhookId) throws ApiException, IOException {
        if (merchantId == null) {
            throw new ApiException("Missing the required parameter 'merchantId'", 400);
        }
        if (webhookId == null) {
            throw new ApiException("Missing the required parameter 'webhookId'", 400);
        }

        Map<String, String> pathParams = new HashMap<>();
        pathParams.put("merchantId", merchantId);
        pathParams.put("webhookId", webhookId);

        String requestBody = null;
        ManagementResource resource = new ManagementResource(this, "/merchants/{merchantId}/webhooks/{webhookId}");
        resource.request(requestBody, null, ApiConstants.HttpMethod.DELETE, pathParams);
    }
    
    /**
     * List all webhooks
     *
     * @param merchantId The unique identifier of the merchant account. (required)
     * @param queryParams  (optional)
     *    pageNumber: The number of the page to fetch. (optional)
     *    pageSize: The number of items to have on a page, maximum 100. The default is 10 items on a page. (optional)
     * @return ListWebhooksResponse
     * @throws ApiException if fails to make API call
     */
    public ListWebhooksResponse listAllWebhooks(String merchantId, Map<String, String> queryParams) throws ApiException, IOException {
        if (merchantId == null) {
            throw new ApiException("Missing the required parameter 'merchantId'", 400);
        }

        Map<String, String> pathParams = new HashMap<>();
        pathParams.put("merchantId", merchantId);

        String requestBody = null;
        ManagementResource resource = new ManagementResource(this, "/merchants/{merchantId}/webhooks");
        String jsonResult = resource.request(requestBody, null, ApiConstants.HttpMethod.GET, pathParams, queryParams);
        return ListWebhooksResponse.fromJson(jsonResult);
    }
    
    /**
     * Get a webhook
     *
     * @param merchantId The unique identifier of the merchant account. (required)
     * @param webhookId Unique identifier of the webhook configuration. (required)
     * @return Webhook
     * @throws ApiException if fails to make API call
     */
    public Webhook getWebhook(String merchantId, String webhookId) throws ApiException, IOException {
        if (merchantId == null) {
            throw new ApiException("Missing the required parameter 'merchantId'", 400);
        }
        if (webhookId == null) {
            throw new ApiException("Missing the required parameter 'webhookId'", 400);
        }

        Map<String, String> pathParams = new HashMap<>();
        pathParams.put("merchantId", merchantId);
        pathParams.put("webhookId", webhookId);

        String requestBody = null;
        ManagementResource resource = new ManagementResource(this, "/merchants/{merchantId}/webhooks/{webhookId}");
        String jsonResult = resource.request(requestBody, null, ApiConstants.HttpMethod.GET, pathParams);
        return Webhook.fromJson(jsonResult);
    }
    
    /**
     * Update a webhook
     *
     * @param merchantId The unique identifier of the merchant account. (required)
     * @param webhookId Unique identifier of the webhook configuration. (required)
     * @param updateMerchantWebhookRequest  (optional)
     * @return Webhook
     * @throws ApiException if fails to make API call
     */
    public Webhook updateWebhook(String merchantId, String webhookId, UpdateMerchantWebhookRequest updateMerchantWebhookRequest) throws ApiException, IOException {
        if (merchantId == null) {
            throw new ApiException("Missing the required parameter 'merchantId'", 400);
        }
        if (webhookId == null) {
            throw new ApiException("Missing the required parameter 'webhookId'", 400);
        }

        Map<String, String> pathParams = new HashMap<>();
        pathParams.put("merchantId", merchantId);
        pathParams.put("webhookId", webhookId);

        String requestBody = updateMerchantWebhookRequest.toJson();
        ManagementResource resource = new ManagementResource(this, "/merchants/{merchantId}/webhooks/{webhookId}");
        String jsonResult = resource.request(requestBody, null, ApiConstants.HttpMethod.PATCH, pathParams);
        return Webhook.fromJson(jsonResult);
    }
    
    /**
     * Set up a webhook
     *
     * @param merchantId The unique identifier of the merchant account. (required)
     * @param createMerchantWebhookRequest  (optional)
     * @return Webhook
     * @throws ApiException if fails to make API call
     */
    public Webhook setUpWebhook(String merchantId, CreateMerchantWebhookRequest createMerchantWebhookRequest) throws ApiException, IOException {
        if (merchantId == null) {
            throw new ApiException("Missing the required parameter 'merchantId'", 400);
        }

        Map<String, String> pathParams = new HashMap<>();
        pathParams.put("merchantId", merchantId);

        String requestBody = createMerchantWebhookRequest.toJson();
        ManagementResource resource = new ManagementResource(this, "/merchants/{merchantId}/webhooks");
        String jsonResult = resource.request(requestBody, null, ApiConstants.HttpMethod.POST, pathParams);
        return Webhook.fromJson(jsonResult);
    }
    
    /**
     * Generate an HMAC key
     *
     * @param merchantId The unique identifier of the merchant account. (required)
     * @param webhookId  (required)
     * @return GenerateHmacKeyResponse
     * @throws ApiException if fails to make API call
     */
    public GenerateHmacKeyResponse generateHmacKey(String merchantId, String webhookId) throws ApiException, IOException {
        if (merchantId == null) {
            throw new ApiException("Missing the required parameter 'merchantId'", 400);
        }
        if (webhookId == null) {
            throw new ApiException("Missing the required parameter 'webhookId'", 400);
        }

        Map<String, String> pathParams = new HashMap<>();
        pathParams.put("merchantId", merchantId);
        pathParams.put("webhookId", webhookId);

        String requestBody = null;
        ManagementResource resource = new ManagementResource(this, "/merchants/{merchantId}/webhooks/{webhookId}/generateHmac");
        String jsonResult = resource.request(requestBody, null, ApiConstants.HttpMethod.POST, pathParams);
        return GenerateHmacKeyResponse.fromJson(jsonResult);
    }
    
    /**
     * Test a webhook
     *
     * @param merchantId The unique identifier of the merchant account. (required)
     * @param webhookId Unique identifier of the webhook configuration. (required)
     * @param testWebhookRequest  (optional)
     * @return TestWebhookResponse
     * @throws ApiException if fails to make API call
     */
    public TestWebhookResponse testWebhook(String merchantId, String webhookId, TestWebhookRequest testWebhookRequest) throws ApiException, IOException {
        if (merchantId == null) {
            throw new ApiException("Missing the required parameter 'merchantId'", 400);
        }
        if (webhookId == null) {
            throw new ApiException("Missing the required parameter 'webhookId'", 400);
        }

        Map<String, String> pathParams = new HashMap<>();
        pathParams.put("merchantId", merchantId);
        pathParams.put("webhookId", webhookId);

        String requestBody = testWebhookRequest.toJson();
        ManagementResource resource = new ManagementResource(this, "/merchants/{merchantId}/webhooks/{webhookId}/test");
        String jsonResult = resource.request(requestBody, null, ApiConstants.HttpMethod.POST, pathParams);
        return TestWebhookResponse.fromJson(jsonResult);
    }
    
}
