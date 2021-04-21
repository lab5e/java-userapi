# user-java-client

The User API
- API version: 1.3.7 frequent-amara
  - Build date: 2021-04-21T15:24:30.863Z[GMT]

API to manage teams, members and tokens

  For more information, please visit [https://docs.lab5e.com](https://docs.lab5e.com)

*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.8+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.lab5e</groupId>
  <artifactId>user-java-client</artifactId>
  <version>1.3.7</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.lab5e:user-java-client:1.3.7"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/user-java-client-1.3.7.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

// Import classes:
import com.lab5e.ApiClient;
import com.lab5e.ApiException;
import com.lab5e.Configuration;
import com.lab5e.auth.*;
import com.lab5e.models.*;
import com.lab5e.user.ProfileApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.lab5e.com");
    
    // Configure API key authorization: APIToken
    ApiKeyAuth APIToken = (ApiKeyAuth) defaultClient.getAuthentication("APIToken");
    APIToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIToken.setApiKeyPrefix("Token");

    ProfileApi apiInstance = new ProfileApi(defaultClient);
    try {
      UserProfile result = apiInstance.getUserProfile();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProfileApi#getUserProfile");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.lab5e.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ProfileApi* | [**getUserProfile**](docs/ProfileApi.md#getUserProfile) | **GET** /user/profile | Logged in profile
*TeamsApi* | [**acceptInvite**](docs/TeamsApi.md#acceptInvite) | **POST** /user/teams/accept | Accept invite
*TeamsApi* | [**createTeam**](docs/TeamsApi.md#createTeam) | **POST** /user/teams | Create team
*TeamsApi* | [**deleteInvite**](docs/TeamsApi.md#deleteInvite) | **DELETE** /user/teams/{teamId}/invites/{code} | Delete invite
*TeamsApi* | [**deleteMember**](docs/TeamsApi.md#deleteMember) | **DELETE** /user/teams/{teamId}/members/{userId} | Remove member
*TeamsApi* | [**deleteTeam**](docs/TeamsApi.md#deleteTeam) | **DELETE** /user/teams/{teamId} | Remove team
*TeamsApi* | [**generateInvite**](docs/TeamsApi.md#generateInvite) | **POST** /user/teams/{teamId}/invites | Generate invite
*TeamsApi* | [**listInvites**](docs/TeamsApi.md#listInvites) | **GET** /user/teams/{teamId}/invites | List invites
*TeamsApi* | [**listTeams**](docs/TeamsApi.md#listTeams) | **GET** /user/teams | List teams
*TeamsApi* | [**retrieveInvite**](docs/TeamsApi.md#retrieveInvite) | **GET** /user/teams/{teamId}/invites/{code} | Retrieve invite
*TeamsApi* | [**retrieveMember**](docs/TeamsApi.md#retrieveMember) | **GET** /user/teams/{teamId}/members/{userId} | Retrieve member
*TeamsApi* | [**retrieveTeam**](docs/TeamsApi.md#retrieveTeam) | **GET** /user/teams/{teamId} | Retrieve team
*TeamsApi* | [**retrieveTeamMembers**](docs/TeamsApi.md#retrieveTeamMembers) | **GET** /user/teams/{teamId}/members | List members
*TeamsApi* | [**updateMember**](docs/TeamsApi.md#updateMember) | **PATCH** /user/teams/{teamId}/members/{userId} | Update member
*TeamsApi* | [**updateTeam**](docs/TeamsApi.md#updateTeam) | **PATCH** /user/teams/{teamId} | Update team
*TokensApi* | [**createToken**](docs/TokensApi.md#createToken) | **POST** /user/tokens | Create token
*TokensApi* | [**deleteToken**](docs/TokensApi.md#deleteToken) | **DELETE** /user/tokens/{token} | Remove token
*TokensApi* | [**listTokens**](docs/TokensApi.md#listTokens) | **GET** /user/tokens | List tokens
*TokensApi* | [**retrieveToken**](docs/TokensApi.md#retrieveToken) | **GET** /user/tokens/{token} | Retrieve token
*TokensApi* | [**updateToken**](docs/TokensApi.md#updateToken) | **PATCH** /user/tokens/{token} | Update token


## Documentation for Models

 - [AcceptInviteRequest](docs/AcceptInviteRequest.md)
 - [DeleteInviteResponse](docs/DeleteInviteResponse.md)
 - [DeleteTokenResponse](docs/DeleteTokenResponse.md)
 - [Invite](docs/Invite.md)
 - [InviteList](docs/InviteList.md)
 - [InviteRequest](docs/InviteRequest.md)
 - [Member](docs/Member.md)
 - [MemberList](docs/MemberList.md)
 - [ProtobufAny](docs/ProtobufAny.md)
 - [RpcStatus](docs/RpcStatus.md)
 - [Team](docs/Team.md)
 - [TeamList](docs/TeamList.md)
 - [Token](docs/Token.md)
 - [TokenList](docs/TokenList.md)
 - [UserProfile](docs/UserProfile.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### APIToken

- **Type**: API key
- **API key parameter name**: X-API-Token
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

dev@lab5e.com

