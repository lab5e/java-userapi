package com.lab5e.userapi.examples.profile;
import com.lab5e.user.ProfileApi;
import com.lab5e.ApiClient;
import com.lab5e.user.model.UserProfile;
import com.lab5e.ApiException;

public class ProfileDemo {
    public static void main(String args[]) {
        if (args.length < 1) {
            System.out.println("Must specify token on command line");
            return;
        }
        final String token = args[0];
        System.out.println("Hello there. Token = " + token);

        final ApiClient client = new ApiClient();
        client.setApiKey(token);

        final ProfileApi profileApi = new ProfileApi(client);

        try {
            final UserProfile profile = profileApi.userGetUserProfile();
            System.out.println("Your profile");
            System.out.println("Name:      " + profile.getName());
            System.out.println("Email:     " + profile.getEmail());
            System.out.println("AvatarUrl: " + profile.getAvatarUrl());
        } catch (ApiException ex) {
            System.out.println("Got exception calling API: code = " + ex.getCode());
        }
    }
}
