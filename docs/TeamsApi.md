# TeamsApi

All URIs are relative to *https://api.lab5e.com/user*

Method | HTTP request | Description
------------- | ------------- | -------------
[**userAcceptInvite**](TeamsApi.md#userAcceptInvite) | **POST** /user/teams/accept | Accept invite
[**userCreateTeam**](TeamsApi.md#userCreateTeam) | **POST** /user/teams | Create team
[**userDeleteInvite**](TeamsApi.md#userDeleteInvite) | **DELETE** /user/teams/{teamId}/invites/{code} | Delete invite
[**userDeleteMember**](TeamsApi.md#userDeleteMember) | **DELETE** /user/teams/{teamId}/members/{userId} | Remove member
[**userDeleteTeam**](TeamsApi.md#userDeleteTeam) | **DELETE** /user/teams/{teamId} | Remove team
[**userGenerateInvite**](TeamsApi.md#userGenerateInvite) | **POST** /user/teams/{teamId}/invites | Generate invite
[**userListInvites**](TeamsApi.md#userListInvites) | **GET** /user/teams/{teamId}/invites | List invites
[**userListTeams**](TeamsApi.md#userListTeams) | **GET** /user/teams | List teams
[**userRetrieveInvite**](TeamsApi.md#userRetrieveInvite) | **GET** /user/teams/{teamId}/invites/{code} | Retrieve invite
[**userRetrieveMember**](TeamsApi.md#userRetrieveMember) | **GET** /user/teams/{teamId}/members/{userId} | Retrieve member
[**userRetrieveTeam**](TeamsApi.md#userRetrieveTeam) | **GET** /user/teams/{teamId} | Retrieve team
[**userRetrieveTeamMembers**](TeamsApi.md#userRetrieveTeamMembers) | **GET** /user/teams/{teamId}/members | List members
[**userUpdateMember**](TeamsApi.md#userUpdateMember) | **PATCH** /user/teams/{teamId}/members/{userId} | Update member
[**userUpdateTeam**](TeamsApi.md#userUpdateTeam) | **PATCH** /user/teams/{teamId} | Update team


<a name="userAcceptInvite"></a>
# **userAcceptInvite**
> Team userAcceptInvite(body)

Accept invite

Accept an invite from another user. This will add the currently logged in user to the team as a regular memeber. When the invite is accepted it is removed from the team&#39;s invites and cannot be reused.

### Example
```java
// Import classes:
import com.lab5e.ApiClient;
import com.lab5e.ApiException;
import com.lab5e.Configuration;
import com.lab5e.auth.*;
import com.lab5e.models.*;
import com.lab5e.user.TeamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.lab5e.com/user");
    
    // Configure API key authorization: APIToken
    ApiKeyAuth APIToken = (ApiKeyAuth) defaultClient.getAuthentication("APIToken");
    APIToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIToken.setApiKeyPrefix("Token");

    TeamsApi apiInstance = new TeamsApi(defaultClient);
    AcceptInviteRequest body = new AcceptInviteRequest(); // AcceptInviteRequest | 
    try {
      Team result = apiInstance.userAcceptInvite(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#userAcceptInvite");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AcceptInviteRequest**](AcceptInviteRequest.md)|  |

### Return type

[**Team**](Team.md)

### Authorization

[APIToken](../README.md#APIToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**201** | It&#39;s created. |  -  |
**400** | The request has an error. |  -  |
**401** | You can&#39;t touch this |  -  |
**404** | Couldn&#39;t find the resource. |  -  |
**409** | There&#39;s a resource conflict here. |  -  |
**500** | I&#39;m sorry. We are broken |  -  |
**0** | An unexpected error response. |  -  |

<a name="userCreateTeam"></a>
# **userCreateTeam**
> Team userCreateTeam(body)

Create team

### Example
```java
// Import classes:
import com.lab5e.ApiClient;
import com.lab5e.ApiException;
import com.lab5e.Configuration;
import com.lab5e.auth.*;
import com.lab5e.models.*;
import com.lab5e.user.TeamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.lab5e.com/user");
    
    // Configure API key authorization: APIToken
    ApiKeyAuth APIToken = (ApiKeyAuth) defaultClient.getAuthentication("APIToken");
    APIToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIToken.setApiKeyPrefix("Token");

    TeamsApi apiInstance = new TeamsApi(defaultClient);
    Team body = new Team(); // Team | 
    try {
      Team result = apiInstance.userCreateTeam(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#userCreateTeam");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Team**](Team.md)|  |

### Return type

[**Team**](Team.md)

### Authorization

[APIToken](../README.md#APIToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**201** | It&#39;s created. |  -  |
**400** | The request has an error. |  -  |
**401** | You can&#39;t touch this |  -  |
**404** | Couldn&#39;t find the resource. |  -  |
**409** | There&#39;s a resource conflict here. |  -  |
**500** | I&#39;m sorry. We are broken |  -  |
**0** | An unexpected error response. |  -  |

<a name="userDeleteInvite"></a>
# **userDeleteInvite**
> Object userDeleteInvite(teamId, code)

Delete invite

Delete an invite created earlier. You must be an administrator of the team to perform this action

### Example
```java
// Import classes:
import com.lab5e.ApiClient;
import com.lab5e.ApiException;
import com.lab5e.Configuration;
import com.lab5e.auth.*;
import com.lab5e.models.*;
import com.lab5e.user.TeamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.lab5e.com/user");
    
    // Configure API key authorization: APIToken
    ApiKeyAuth APIToken = (ApiKeyAuth) defaultClient.getAuthentication("APIToken");
    APIToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIToken.setApiKeyPrefix("Token");

    TeamsApi apiInstance = new TeamsApi(defaultClient);
    String teamId = "teamId_example"; // String | The team ID
    String code = "code_example"; // String | The invite code.
    try {
      Object result = apiInstance.userDeleteInvite(teamId, code);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#userDeleteInvite");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamId** | **String**| The team ID |
 **code** | **String**| The invite code. |

### Return type

**Object**

### Authorization

[APIToken](../README.md#APIToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**201** | It&#39;s created. |  -  |
**400** | The request has an error. |  -  |
**401** | You can&#39;t touch this |  -  |
**404** | Couldn&#39;t find the resource. |  -  |
**409** | There&#39;s a resource conflict here. |  -  |
**500** | I&#39;m sorry. We are broken |  -  |
**0** | An unexpected error response. |  -  |

<a name="userDeleteMember"></a>
# **userDeleteMember**
> Member userDeleteMember(teamId, userId)

Remove member

Remove a member from the team. You must be an administrator to do this. You can&#39;t remove yourself from the team.

### Example
```java
// Import classes:
import com.lab5e.ApiClient;
import com.lab5e.ApiException;
import com.lab5e.Configuration;
import com.lab5e.auth.*;
import com.lab5e.models.*;
import com.lab5e.user.TeamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.lab5e.com/user");
    
    // Configure API key authorization: APIToken
    ApiKeyAuth APIToken = (ApiKeyAuth) defaultClient.getAuthentication("APIToken");
    APIToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIToken.setApiKeyPrefix("Token");

    TeamsApi apiInstance = new TeamsApi(defaultClient);
    String teamId = "teamId_example"; // String | The team ID
    String userId = "userId_example"; // String | The user ID
    try {
      Member result = apiInstance.userDeleteMember(teamId, userId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#userDeleteMember");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamId** | **String**| The team ID |
 **userId** | **String**| The user ID |

### Return type

[**Member**](Member.md)

### Authorization

[APIToken](../README.md#APIToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**201** | It&#39;s created. |  -  |
**400** | The request has an error. |  -  |
**401** | You can&#39;t touch this |  -  |
**404** | Couldn&#39;t find the resource. |  -  |
**409** | There&#39;s a resource conflict here. |  -  |
**500** | I&#39;m sorry. We are broken |  -  |
**0** | An unexpected error response. |  -  |

<a name="userDeleteTeam"></a>
# **userDeleteTeam**
> Team userDeleteTeam(teamId)

Remove team

Update the team. You must be an administrator of the team to edit it.

### Example
```java
// Import classes:
import com.lab5e.ApiClient;
import com.lab5e.ApiException;
import com.lab5e.Configuration;
import com.lab5e.auth.*;
import com.lab5e.models.*;
import com.lab5e.user.TeamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.lab5e.com/user");
    
    // Configure API key authorization: APIToken
    ApiKeyAuth APIToken = (ApiKeyAuth) defaultClient.getAuthentication("APIToken");
    APIToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIToken.setApiKeyPrefix("Token");

    TeamsApi apiInstance = new TeamsApi(defaultClient);
    String teamId = "teamId_example"; // String | The team ID
    try {
      Team result = apiInstance.userDeleteTeam(teamId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#userDeleteTeam");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamId** | **String**| The team ID |

### Return type

[**Team**](Team.md)

### Authorization

[APIToken](../README.md#APIToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**201** | It&#39;s created. |  -  |
**400** | The request has an error. |  -  |
**401** | You can&#39;t touch this |  -  |
**404** | Couldn&#39;t find the resource. |  -  |
**409** | There&#39;s a resource conflict here. |  -  |
**500** | I&#39;m sorry. We are broken |  -  |
**0** | An unexpected error response. |  -  |

<a name="userGenerateInvite"></a>
# **userGenerateInvite**
> Invite userGenerateInvite(teamId, body)

Generate invite

Update the team. You must be an administrator of the team to edit it.

### Example
```java
// Import classes:
import com.lab5e.ApiClient;
import com.lab5e.ApiException;
import com.lab5e.Configuration;
import com.lab5e.auth.*;
import com.lab5e.models.*;
import com.lab5e.user.TeamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.lab5e.com/user");
    
    // Configure API key authorization: APIToken
    ApiKeyAuth APIToken = (ApiKeyAuth) defaultClient.getAuthentication("APIToken");
    APIToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIToken.setApiKeyPrefix("Token");

    TeamsApi apiInstance = new TeamsApi(defaultClient);
    String teamId = "teamId_example"; // String | The team ID
    InviteRequest body = new InviteRequest(); // InviteRequest | 
    try {
      Invite result = apiInstance.userGenerateInvite(teamId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#userGenerateInvite");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamId** | **String**| The team ID |
 **body** | [**InviteRequest**](InviteRequest.md)|  |

### Return type

[**Invite**](Invite.md)

### Authorization

[APIToken](../README.md#APIToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**201** | It&#39;s created. |  -  |
**400** | The request has an error. |  -  |
**401** | You can&#39;t touch this |  -  |
**404** | Couldn&#39;t find the resource. |  -  |
**409** | There&#39;s a resource conflict here. |  -  |
**500** | I&#39;m sorry. We are broken |  -  |
**0** | An unexpected error response. |  -  |

<a name="userListInvites"></a>
# **userListInvites**
> InviteList userListInvites(teamId)

List invites

Update the team. You must be an administrator of the team to edit it.

### Example
```java
// Import classes:
import com.lab5e.ApiClient;
import com.lab5e.ApiException;
import com.lab5e.Configuration;
import com.lab5e.auth.*;
import com.lab5e.models.*;
import com.lab5e.user.TeamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.lab5e.com/user");
    
    // Configure API key authorization: APIToken
    ApiKeyAuth APIToken = (ApiKeyAuth) defaultClient.getAuthentication("APIToken");
    APIToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIToken.setApiKeyPrefix("Token");

    TeamsApi apiInstance = new TeamsApi(defaultClient);
    String teamId = "teamId_example"; // String | The team ID
    try {
      InviteList result = apiInstance.userListInvites(teamId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#userListInvites");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamId** | **String**| The team ID |

### Return type

[**InviteList**](InviteList.md)

### Authorization

[APIToken](../README.md#APIToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**201** | It&#39;s created. |  -  |
**400** | The request has an error. |  -  |
**401** | You can&#39;t touch this |  -  |
**404** | Couldn&#39;t find the resource. |  -  |
**409** | There&#39;s a resource conflict here. |  -  |
**500** | I&#39;m sorry. We are broken |  -  |
**0** | An unexpected error response. |  -  |

<a name="userListTeams"></a>
# **userListTeams**
> TeamList userListTeams()

List teams

Update the team. You must be an administrator of the team to edit it.

### Example
```java
// Import classes:
import com.lab5e.ApiClient;
import com.lab5e.ApiException;
import com.lab5e.Configuration;
import com.lab5e.auth.*;
import com.lab5e.models.*;
import com.lab5e.user.TeamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.lab5e.com/user");
    
    // Configure API key authorization: APIToken
    ApiKeyAuth APIToken = (ApiKeyAuth) defaultClient.getAuthentication("APIToken");
    APIToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIToken.setApiKeyPrefix("Token");

    TeamsApi apiInstance = new TeamsApi(defaultClient);
    try {
      TeamList result = apiInstance.userListTeams();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#userListTeams");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**TeamList**](TeamList.md)

### Authorization

[APIToken](../README.md#APIToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**201** | It&#39;s created. |  -  |
**400** | The request has an error. |  -  |
**401** | You can&#39;t touch this |  -  |
**404** | Couldn&#39;t find the resource. |  -  |
**409** | There&#39;s a resource conflict here. |  -  |
**500** | I&#39;m sorry. We are broken |  -  |
**0** | An unexpected error response. |  -  |

<a name="userRetrieveInvite"></a>
# **userRetrieveInvite**
> Invite userRetrieveInvite(teamId, code)

Retrieve invite

Read a single invite from the team&#39;s set of non-redeemed invites.

### Example
```java
// Import classes:
import com.lab5e.ApiClient;
import com.lab5e.ApiException;
import com.lab5e.Configuration;
import com.lab5e.auth.*;
import com.lab5e.models.*;
import com.lab5e.user.TeamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.lab5e.com/user");
    
    // Configure API key authorization: APIToken
    ApiKeyAuth APIToken = (ApiKeyAuth) defaultClient.getAuthentication("APIToken");
    APIToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIToken.setApiKeyPrefix("Token");

    TeamsApi apiInstance = new TeamsApi(defaultClient);
    String teamId = "teamId_example"; // String | The team ID
    String code = "code_example"; // String | The invite code.
    try {
      Invite result = apiInstance.userRetrieveInvite(teamId, code);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#userRetrieveInvite");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamId** | **String**| The team ID |
 **code** | **String**| The invite code. |

### Return type

[**Invite**](Invite.md)

### Authorization

[APIToken](../README.md#APIToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**201** | It&#39;s created. |  -  |
**400** | The request has an error. |  -  |
**401** | You can&#39;t touch this |  -  |
**404** | Couldn&#39;t find the resource. |  -  |
**409** | There&#39;s a resource conflict here. |  -  |
**500** | I&#39;m sorry. We are broken |  -  |
**0** | An unexpected error response. |  -  |

<a name="userRetrieveMember"></a>
# **userRetrieveMember**
> Member userRetrieveMember(teamId, userId)

Retrieve member

### Example
```java
// Import classes:
import com.lab5e.ApiClient;
import com.lab5e.ApiException;
import com.lab5e.Configuration;
import com.lab5e.auth.*;
import com.lab5e.models.*;
import com.lab5e.user.TeamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.lab5e.com/user");
    
    // Configure API key authorization: APIToken
    ApiKeyAuth APIToken = (ApiKeyAuth) defaultClient.getAuthentication("APIToken");
    APIToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIToken.setApiKeyPrefix("Token");

    TeamsApi apiInstance = new TeamsApi(defaultClient);
    String teamId = "teamId_example"; // String | The team ID
    String userId = "userId_example"; // String | The user ID
    try {
      Member result = apiInstance.userRetrieveMember(teamId, userId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#userRetrieveMember");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamId** | **String**| The team ID |
 **userId** | **String**| The user ID |

### Return type

[**Member**](Member.md)

### Authorization

[APIToken](../README.md#APIToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**201** | It&#39;s created. |  -  |
**400** | The request has an error. |  -  |
**401** | You can&#39;t touch this |  -  |
**404** | Couldn&#39;t find the resource. |  -  |
**409** | There&#39;s a resource conflict here. |  -  |
**500** | I&#39;m sorry. We are broken |  -  |
**0** | An unexpected error response. |  -  |

<a name="userRetrieveTeam"></a>
# **userRetrieveTeam**
> Team userRetrieveTeam(teamId)

Retrieve team

### Example
```java
// Import classes:
import com.lab5e.ApiClient;
import com.lab5e.ApiException;
import com.lab5e.Configuration;
import com.lab5e.auth.*;
import com.lab5e.models.*;
import com.lab5e.user.TeamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.lab5e.com/user");
    
    // Configure API key authorization: APIToken
    ApiKeyAuth APIToken = (ApiKeyAuth) defaultClient.getAuthentication("APIToken");
    APIToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIToken.setApiKeyPrefix("Token");

    TeamsApi apiInstance = new TeamsApi(defaultClient);
    String teamId = "teamId_example"; // String | The team ID
    try {
      Team result = apiInstance.userRetrieveTeam(teamId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#userRetrieveTeam");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamId** | **String**| The team ID |

### Return type

[**Team**](Team.md)

### Authorization

[APIToken](../README.md#APIToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**201** | It&#39;s created. |  -  |
**400** | The request has an error. |  -  |
**401** | You can&#39;t touch this |  -  |
**404** | Couldn&#39;t find the resource. |  -  |
**409** | There&#39;s a resource conflict here. |  -  |
**500** | I&#39;m sorry. We are broken |  -  |
**0** | An unexpected error response. |  -  |

<a name="userRetrieveTeamMembers"></a>
# **userRetrieveTeamMembers**
> MemberList userRetrieveTeamMembers(teamId)

List members

### Example
```java
// Import classes:
import com.lab5e.ApiClient;
import com.lab5e.ApiException;
import com.lab5e.Configuration;
import com.lab5e.auth.*;
import com.lab5e.models.*;
import com.lab5e.user.TeamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.lab5e.com/user");
    
    // Configure API key authorization: APIToken
    ApiKeyAuth APIToken = (ApiKeyAuth) defaultClient.getAuthentication("APIToken");
    APIToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIToken.setApiKeyPrefix("Token");

    TeamsApi apiInstance = new TeamsApi(defaultClient);
    String teamId = "teamId_example"; // String | The team ID
    try {
      MemberList result = apiInstance.userRetrieveTeamMembers(teamId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#userRetrieveTeamMembers");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamId** | **String**| The team ID |

### Return type

[**MemberList**](MemberList.md)

### Authorization

[APIToken](../README.md#APIToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**201** | It&#39;s created. |  -  |
**400** | The request has an error. |  -  |
**401** | You can&#39;t touch this |  -  |
**404** | Couldn&#39;t find the resource. |  -  |
**409** | There&#39;s a resource conflict here. |  -  |
**500** | I&#39;m sorry. We are broken |  -  |
**0** | An unexpected error response. |  -  |

<a name="userUpdateMember"></a>
# **userUpdateMember**
> Member userUpdateMember(teamId, userId, body)

Update member

You must be an administrator of the team to update member settings

### Example
```java
// Import classes:
import com.lab5e.ApiClient;
import com.lab5e.ApiException;
import com.lab5e.Configuration;
import com.lab5e.auth.*;
import com.lab5e.models.*;
import com.lab5e.user.TeamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.lab5e.com/user");
    
    // Configure API key authorization: APIToken
    ApiKeyAuth APIToken = (ApiKeyAuth) defaultClient.getAuthentication("APIToken");
    APIToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIToken.setApiKeyPrefix("Token");

    TeamsApi apiInstance = new TeamsApi(defaultClient);
    String teamId = "teamId_example"; // String | 
    String userId = "userId_example"; // String | 
    Member body = new Member(); // Member | 
    try {
      Member result = apiInstance.userUpdateMember(teamId, userId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#userUpdateMember");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamId** | **String**|  |
 **userId** | **String**|  |
 **body** | [**Member**](Member.md)|  |

### Return type

[**Member**](Member.md)

### Authorization

[APIToken](../README.md#APIToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**201** | It&#39;s created. |  -  |
**400** | The request has an error. |  -  |
**401** | You can&#39;t touch this |  -  |
**404** | Couldn&#39;t find the resource. |  -  |
**409** | There&#39;s a resource conflict here. |  -  |
**500** | I&#39;m sorry. We are broken |  -  |
**0** | An unexpected error response. |  -  |

<a name="userUpdateTeam"></a>
# **userUpdateTeam**
> Team userUpdateTeam(teamId, body)

Update team

Update the team. You must be an administrator of the team to edit it.

### Example
```java
// Import classes:
import com.lab5e.ApiClient;
import com.lab5e.ApiException;
import com.lab5e.Configuration;
import com.lab5e.auth.*;
import com.lab5e.models.*;
import com.lab5e.user.TeamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.lab5e.com/user");
    
    // Configure API key authorization: APIToken
    ApiKeyAuth APIToken = (ApiKeyAuth) defaultClient.getAuthentication("APIToken");
    APIToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIToken.setApiKeyPrefix("Token");

    TeamsApi apiInstance = new TeamsApi(defaultClient);
    String teamId = "teamId_example"; // String | 
    Team body = new Team(); // Team | 
    try {
      Team result = apiInstance.userUpdateTeam(teamId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#userUpdateTeam");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **teamId** | **String**|  |
 **body** | [**Team**](Team.md)|  |

### Return type

[**Team**](Team.md)

### Authorization

[APIToken](../README.md#APIToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**201** | It&#39;s created. |  -  |
**400** | The request has an error. |  -  |
**401** | You can&#39;t touch this |  -  |
**404** | Couldn&#39;t find the resource. |  -  |
**409** | There&#39;s a resource conflict here. |  -  |
**500** | I&#39;m sorry. We are broken |  -  |
**0** | An unexpected error response. |  -  |

