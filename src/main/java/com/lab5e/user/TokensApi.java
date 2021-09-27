/*
 * The User API
 * API to manage teams, members and tokens
 *
 * The version of the OpenAPI document: 1.3.11 lucky-fremont
 * Contact: dev@lab5e.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.lab5e.user;

import com.lab5e.ApiCallback;
import com.lab5e.ApiClient;
import com.lab5e.ApiException;
import com.lab5e.ApiResponse;
import com.lab5e.Configuration;
import com.lab5e.Pair;
import com.lab5e.ProgressRequestBody;
import com.lab5e.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.lab5e.user.model.DeleteTokenResponse;
import com.lab5e.user.model.RpcStatus;
import com.lab5e.user.model.Token;
import com.lab5e.user.model.TokenList;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TokensApi {
    private ApiClient localVarApiClient;

    public TokensApi() {
        this(Configuration.getDefaultApiClient());
    }

    public TokensApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for createToken
     * @param body  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A successful response. </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> It&#39;s created. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The request has an error. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> You can&#39;t touch this </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Couldn&#39;t find the resource. </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> There&#39;s a resource conflict here. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> I&#39;m sorry. We are broken </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected error response. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createTokenCall(Token body, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/user/tokens";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "APIToken" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call createTokenValidateBeforeCall(Token body, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling createToken(Async)");
        }
        

        okhttp3.Call localVarCall = createTokenCall(body, _callback);
        return localVarCall;

    }

    /**
     * Create token
     * 
     * @param body  (required)
     * @return Token
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A successful response. </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> It&#39;s created. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The request has an error. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> You can&#39;t touch this </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Couldn&#39;t find the resource. </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> There&#39;s a resource conflict here. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> I&#39;m sorry. We are broken </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected error response. </td><td>  -  </td></tr>
     </table>
     */
    public Token createToken(Token body) throws ApiException {
        ApiResponse<Token> localVarResp = createTokenWithHttpInfo(body);
        return localVarResp.getData();
    }

    /**
     * Create token
     * 
     * @param body  (required)
     * @return ApiResponse&lt;Token&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A successful response. </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> It&#39;s created. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The request has an error. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> You can&#39;t touch this </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Couldn&#39;t find the resource. </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> There&#39;s a resource conflict here. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> I&#39;m sorry. We are broken </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected error response. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Token> createTokenWithHttpInfo(Token body) throws ApiException {
        okhttp3.Call localVarCall = createTokenValidateBeforeCall(body, null);
        Type localVarReturnType = new TypeToken<Token>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create token (asynchronously)
     * 
     * @param body  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A successful response. </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> It&#39;s created. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The request has an error. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> You can&#39;t touch this </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Couldn&#39;t find the resource. </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> There&#39;s a resource conflict here. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> I&#39;m sorry. We are broken </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected error response. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createTokenAsync(Token body, final ApiCallback<Token> _callback) throws ApiException {

        okhttp3.Call localVarCall = createTokenValidateBeforeCall(body, _callback);
        Type localVarReturnType = new TypeToken<Token>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteToken
     * @param token The token to delete. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A successful response. </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> It&#39;s created. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The request has an error. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> You can&#39;t touch this </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Couldn&#39;t find the resource. </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> There&#39;s a resource conflict here. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> I&#39;m sorry. We are broken </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected error response. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteTokenCall(String token, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/user/tokens/{token}"
            .replaceAll("\\{" + "token" + "\\}", localVarApiClient.escapeString(token.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "APIToken" };
        return localVarApiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call deleteTokenValidateBeforeCall(String token, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'token' is set
        if (token == null) {
            throw new ApiException("Missing the required parameter 'token' when calling deleteToken(Async)");
        }
        

        okhttp3.Call localVarCall = deleteTokenCall(token, _callback);
        return localVarCall;

    }

    /**
     * Remove token
     * 
     * @param token The token to delete. (required)
     * @return DeleteTokenResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A successful response. </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> It&#39;s created. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The request has an error. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> You can&#39;t touch this </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Couldn&#39;t find the resource. </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> There&#39;s a resource conflict here. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> I&#39;m sorry. We are broken </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected error response. </td><td>  -  </td></tr>
     </table>
     */
    public DeleteTokenResponse deleteToken(String token) throws ApiException {
        ApiResponse<DeleteTokenResponse> localVarResp = deleteTokenWithHttpInfo(token);
        return localVarResp.getData();
    }

    /**
     * Remove token
     * 
     * @param token The token to delete. (required)
     * @return ApiResponse&lt;DeleteTokenResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A successful response. </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> It&#39;s created. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The request has an error. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> You can&#39;t touch this </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Couldn&#39;t find the resource. </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> There&#39;s a resource conflict here. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> I&#39;m sorry. We are broken </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected error response. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<DeleteTokenResponse> deleteTokenWithHttpInfo(String token) throws ApiException {
        okhttp3.Call localVarCall = deleteTokenValidateBeforeCall(token, null);
        Type localVarReturnType = new TypeToken<DeleteTokenResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Remove token (asynchronously)
     * 
     * @param token The token to delete. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A successful response. </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> It&#39;s created. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The request has an error. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> You can&#39;t touch this </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Couldn&#39;t find the resource. </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> There&#39;s a resource conflict here. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> I&#39;m sorry. We are broken </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected error response. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteTokenAsync(String token, final ApiCallback<DeleteTokenResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteTokenValidateBeforeCall(token, _callback);
        Type localVarReturnType = new TypeToken<DeleteTokenResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for listTokens
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A successful response. </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> It&#39;s created. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The request has an error. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> You can&#39;t touch this </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Couldn&#39;t find the resource. </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> There&#39;s a resource conflict here. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> I&#39;m sorry. We are broken </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected error response. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listTokensCall(final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/user/tokens";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "APIToken" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call listTokensValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = listTokensCall(_callback);
        return localVarCall;

    }

    /**
     * List tokens
     * 
     * @return TokenList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A successful response. </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> It&#39;s created. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The request has an error. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> You can&#39;t touch this </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Couldn&#39;t find the resource. </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> There&#39;s a resource conflict here. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> I&#39;m sorry. We are broken </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected error response. </td><td>  -  </td></tr>
     </table>
     */
    public TokenList listTokens() throws ApiException {
        ApiResponse<TokenList> localVarResp = listTokensWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * List tokens
     * 
     * @return ApiResponse&lt;TokenList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A successful response. </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> It&#39;s created. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The request has an error. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> You can&#39;t touch this </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Couldn&#39;t find the resource. </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> There&#39;s a resource conflict here. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> I&#39;m sorry. We are broken </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected error response. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<TokenList> listTokensWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = listTokensValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<TokenList>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * List tokens (asynchronously)
     * 
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A successful response. </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> It&#39;s created. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The request has an error. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> You can&#39;t touch this </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Couldn&#39;t find the resource. </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> There&#39;s a resource conflict here. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> I&#39;m sorry. We are broken </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected error response. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listTokensAsync(final ApiCallback<TokenList> _callback) throws ApiException {

        okhttp3.Call localVarCall = listTokensValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<TokenList>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for retrieveToken
     * @param token  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A successful response. </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> It&#39;s created. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The request has an error. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> You can&#39;t touch this </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Couldn&#39;t find the resource. </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> There&#39;s a resource conflict here. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> I&#39;m sorry. We are broken </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected error response. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call retrieveTokenCall(String token, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/user/tokens/{token}"
            .replaceAll("\\{" + "token" + "\\}", localVarApiClient.escapeString(token.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "APIToken" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call retrieveTokenValidateBeforeCall(String token, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'token' is set
        if (token == null) {
            throw new ApiException("Missing the required parameter 'token' when calling retrieveToken(Async)");
        }
        

        okhttp3.Call localVarCall = retrieveTokenCall(token, _callback);
        return localVarCall;

    }

    /**
     * Retrieve token
     * 
     * @param token  (required)
     * @return Token
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A successful response. </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> It&#39;s created. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The request has an error. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> You can&#39;t touch this </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Couldn&#39;t find the resource. </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> There&#39;s a resource conflict here. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> I&#39;m sorry. We are broken </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected error response. </td><td>  -  </td></tr>
     </table>
     */
    public Token retrieveToken(String token) throws ApiException {
        ApiResponse<Token> localVarResp = retrieveTokenWithHttpInfo(token);
        return localVarResp.getData();
    }

    /**
     * Retrieve token
     * 
     * @param token  (required)
     * @return ApiResponse&lt;Token&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A successful response. </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> It&#39;s created. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The request has an error. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> You can&#39;t touch this </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Couldn&#39;t find the resource. </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> There&#39;s a resource conflict here. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> I&#39;m sorry. We are broken </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected error response. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Token> retrieveTokenWithHttpInfo(String token) throws ApiException {
        okhttp3.Call localVarCall = retrieveTokenValidateBeforeCall(token, null);
        Type localVarReturnType = new TypeToken<Token>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Retrieve token (asynchronously)
     * 
     * @param token  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A successful response. </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> It&#39;s created. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The request has an error. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> You can&#39;t touch this </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Couldn&#39;t find the resource. </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> There&#39;s a resource conflict here. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> I&#39;m sorry. We are broken </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected error response. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call retrieveTokenAsync(String token, final ApiCallback<Token> _callback) throws ApiException {

        okhttp3.Call localVarCall = retrieveTokenValidateBeforeCall(token, _callback);
        Type localVarReturnType = new TypeToken<Token>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateToken
     * @param token The token  Use this in the &#x60;X-API-Token&#x60; header when using the API. (required)
     * @param body  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A successful response. </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> It&#39;s created. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The request has an error. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> You can&#39;t touch this </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Couldn&#39;t find the resource. </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> There&#39;s a resource conflict here. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> I&#39;m sorry. We are broken </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected error response. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateTokenCall(String token, Token body, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/user/tokens/{token}"
            .replaceAll("\\{" + "token" + "\\}", localVarApiClient.escapeString(token.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "APIToken" };
        return localVarApiClient.buildCall(localVarPath, "PATCH", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call updateTokenValidateBeforeCall(String token, Token body, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'token' is set
        if (token == null) {
            throw new ApiException("Missing the required parameter 'token' when calling updateToken(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling updateToken(Async)");
        }
        

        okhttp3.Call localVarCall = updateTokenCall(token, body, _callback);
        return localVarCall;

    }

    /**
     * Update token
     * 
     * @param token The token  Use this in the &#x60;X-API-Token&#x60; header when using the API. (required)
     * @param body  (required)
     * @return Token
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A successful response. </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> It&#39;s created. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The request has an error. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> You can&#39;t touch this </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Couldn&#39;t find the resource. </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> There&#39;s a resource conflict here. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> I&#39;m sorry. We are broken </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected error response. </td><td>  -  </td></tr>
     </table>
     */
    public Token updateToken(String token, Token body) throws ApiException {
        ApiResponse<Token> localVarResp = updateTokenWithHttpInfo(token, body);
        return localVarResp.getData();
    }

    /**
     * Update token
     * 
     * @param token The token  Use this in the &#x60;X-API-Token&#x60; header when using the API. (required)
     * @param body  (required)
     * @return ApiResponse&lt;Token&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A successful response. </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> It&#39;s created. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The request has an error. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> You can&#39;t touch this </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Couldn&#39;t find the resource. </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> There&#39;s a resource conflict here. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> I&#39;m sorry. We are broken </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected error response. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Token> updateTokenWithHttpInfo(String token, Token body) throws ApiException {
        okhttp3.Call localVarCall = updateTokenValidateBeforeCall(token, body, null);
        Type localVarReturnType = new TypeToken<Token>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update token (asynchronously)
     * 
     * @param token The token  Use this in the &#x60;X-API-Token&#x60; header when using the API. (required)
     * @param body  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A successful response. </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> It&#39;s created. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The request has an error. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> You can&#39;t touch this </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Couldn&#39;t find the resource. </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> There&#39;s a resource conflict here. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> I&#39;m sorry. We are broken </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected error response. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateTokenAsync(String token, Token body, final ApiCallback<Token> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateTokenValidateBeforeCall(token, body, _callback);
        Type localVarReturnType = new TypeToken<Token>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
