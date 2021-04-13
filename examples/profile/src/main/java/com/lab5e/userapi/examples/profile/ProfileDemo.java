package com.lab5e.userapi.examples.profile;
import com.lab5e.user.ProfileApi;
import com.lab5e.ApiClient;
import com.lab5e.user.model.UserProfile;
import com.lab5e.ApiException;

public class ProfileDemo {
    public static void main(String args[]) {

        // Pull the token from the command line
        if (args.length < 1) {
            System.out.println("Must specify token on command line");
            return;
        }
        final String token = args[0];

        // Create the API client class and set the API token for it.
        final ApiClient client = new ApiClient();
        client.setApiKey(token);

        // Use the ProfileApi class to retrieve the profile
        final ProfileApi profileApi = new ProfileApi(client);

        try {
            // This will retrieve the profile. If there's an error retrieving
            // the profile an ApiException is thrown.
            final UserProfile profile = profileApi.userGetUserProfile();

            // Finally - print the profile
            System.out.println("Your profile");
            System.out.println("Name:      " + profile.getName());
            System.out.println("Email:     " + profile.getEmail());
            System.out.println("AvatarUrl: " + profile.getAvatarUrl());

        } catch (ApiException ex) {
            System.out.println("Got exception calling API: code = " + ex.getCode());
        }
    }
}
