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
import com.adyen.model.management.RestServiceError;
import com.adyen.model.management.ScheduleTerminalActionsRequest;
import com.adyen.model.management.ScheduleTerminalActionsResponse;
import com.adyen.service.exception.ApiException;
import com.adyen.service.resource.ManagementResource;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class TerminalActionsTerminalLevel extends ApiKeyAuthenticatedService {
    public TerminalActionsTerminalLevel(Client client) {
        super(client);
    }

    /**
     * Create a terminal action
     *
     * @param scheduleTerminalActionsRequest  (optional)
     * @return ScheduleTerminalActionsResponse
     * @throws ApiException if fails to make API call
     */
    public ScheduleTerminalActionsResponse createTerminalAction(ScheduleTerminalActionsRequest scheduleTerminalActionsRequest) throws ApiException, IOException {

        Map<String, String> pathParams = new HashMap<>();

        String requestBody = scheduleTerminalActionsRequest.toJson();
        ManagementResource resource = new ManagementResource(this, "/terminals/scheduleActions");
        String jsonResult = resource.request(requestBody, null, ApiConstants.HttpMethod.POST, pathParams);
        return ScheduleTerminalActionsResponse.fromJson(jsonResult);
    }
    
}
