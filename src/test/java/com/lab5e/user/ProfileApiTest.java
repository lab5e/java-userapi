/*
 * The User API
 * API to manage teams, members and tokens
 *
 * The version of the OpenAPI document: 1.3.13 bordering-jerilyn
 * Contact: dev@lab5e.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.lab5e.user;

import com.lab5e.ApiException;
import com.lab5e.user.model.RpcStatus;
import com.lab5e.user.model.UserProfile;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ProfileApi
 */
@Ignore
public class ProfileApiTest {

    private final ProfileApi api = new ProfileApi();

    
    /**
     * Logged in profile
     *
     * Show your user profile information
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUserProfileTest() throws ApiException {
        UserProfile response = api.getUserProfile();

        // TODO: test validations
    }
    
}
