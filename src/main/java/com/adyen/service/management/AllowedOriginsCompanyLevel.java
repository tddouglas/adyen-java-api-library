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
import com.adyen.model.management.AllowedOrigin;
import com.adyen.model.management.AllowedOriginsResponse;
import com.adyen.model.management.RestServiceError;
import com.adyen.service.exception.ApiException;
import com.adyen.service.resource.ManagementResource;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class AllowedOriginsCompanyLevel extends ApiKeyAuthenticatedService {
    public AllowedOriginsCompanyLevel(Client client) {
        super(client);
    }

    /**
     * Delete an allowed origin
     *
     * @param companyId The unique identifier of the company account. (required)
     * @param apiCredentialId Unique identifier of the API credential. (required)
     * @param originId Unique identifier of the allowed origin. (required)
     * @throws ApiException if fails to make API call
     */
    public void deleteAllowedOrigin(String companyId, String apiCredentialId, String originId) throws ApiException, IOException {
        if (companyId == null) {
            throw new ApiException("Missing the required parameter 'companyId'", 400);
        }
        if (apiCredentialId == null) {
            throw new ApiException("Missing the required parameter 'apiCredentialId'", 400);
        }
        if (originId == null) {
            throw new ApiException("Missing the required parameter 'originId'", 400);
        }

        Map<String, String> pathParams = new HashMap<>();
        pathParams.put("companyId", companyId);
        pathParams.put("apiCredentialId", apiCredentialId);
        pathParams.put("originId", originId);

        String requestBody = null;
        ManagementResource resource = new ManagementResource(this, "/companies/{companyId}/apiCredentials/{apiCredentialId}/allowedOrigins/{originId}");
        resource.request(requestBody, null, ApiConstants.HttpMethod.DELETE, pathParams);
    }
    
    /**
     * Get a list of allowed origins
     *
     * @param companyId The unique identifier of the company account. (required)
     * @param apiCredentialId Unique identifier of the API credential. (required)
     * @return AllowedOriginsResponse
     * @throws ApiException if fails to make API call
     */
    public AllowedOriginsResponse listAllowedOrigins(String companyId, String apiCredentialId) throws ApiException, IOException {
        if (companyId == null) {
            throw new ApiException("Missing the required parameter 'companyId'", 400);
        }
        if (apiCredentialId == null) {
            throw new ApiException("Missing the required parameter 'apiCredentialId'", 400);
        }

        Map<String, String> pathParams = new HashMap<>();
        pathParams.put("companyId", companyId);
        pathParams.put("apiCredentialId", apiCredentialId);

        String requestBody = null;
        ManagementResource resource = new ManagementResource(this, "/companies/{companyId}/apiCredentials/{apiCredentialId}/allowedOrigins");
        String jsonResult = resource.request(requestBody, null, ApiConstants.HttpMethod.GET, pathParams);
        return AllowedOriginsResponse.fromJson(jsonResult);
    }
    
    /**
     * Get an allowed origin
     *
     * @param companyId The unique identifier of the company account. (required)
     * @param apiCredentialId Unique identifier of the API credential. (required)
     * @param originId Unique identifier of the allowed origin. (required)
     * @return AllowedOrigin
     * @throws ApiException if fails to make API call
     */
    public AllowedOrigin getAllowedOrigin(String companyId, String apiCredentialId, String originId) throws ApiException, IOException {
        if (companyId == null) {
            throw new ApiException("Missing the required parameter 'companyId'", 400);
        }
        if (apiCredentialId == null) {
            throw new ApiException("Missing the required parameter 'apiCredentialId'", 400);
        }
        if (originId == null) {
            throw new ApiException("Missing the required parameter 'originId'", 400);
        }

        Map<String, String> pathParams = new HashMap<>();
        pathParams.put("companyId", companyId);
        pathParams.put("apiCredentialId", apiCredentialId);
        pathParams.put("originId", originId);

        String requestBody = null;
        ManagementResource resource = new ManagementResource(this, "/companies/{companyId}/apiCredentials/{apiCredentialId}/allowedOrigins/{originId}");
        String jsonResult = resource.request(requestBody, null, ApiConstants.HttpMethod.GET, pathParams);
        return AllowedOrigin.fromJson(jsonResult);
    }
    
    /**
     * Create an allowed origin
     *
     * @param companyId The unique identifier of the company account. (required)
     * @param apiCredentialId Unique identifier of the API credential. (required)
     * @param allowedOrigin  (optional)
     * @return AllowedOriginsResponse
     * @throws ApiException if fails to make API call
     */
    public AllowedOriginsResponse createAllowedOrigin(String companyId, String apiCredentialId, AllowedOrigin allowedOrigin) throws ApiException, IOException {
        if (companyId == null) {
            throw new ApiException("Missing the required parameter 'companyId'", 400);
        }
        if (apiCredentialId == null) {
            throw new ApiException("Missing the required parameter 'apiCredentialId'", 400);
        }

        Map<String, String> pathParams = new HashMap<>();
        pathParams.put("companyId", companyId);
        pathParams.put("apiCredentialId", apiCredentialId);

        String requestBody = allowedOrigin.toJson();
        ManagementResource resource = new ManagementResource(this, "/companies/{companyId}/apiCredentials/{apiCredentialId}/allowedOrigins");
        String jsonResult = resource.request(requestBody, null, ApiConstants.HttpMethod.POST, pathParams);
        return AllowedOriginsResponse.fromJson(jsonResult);
    }
    
}
