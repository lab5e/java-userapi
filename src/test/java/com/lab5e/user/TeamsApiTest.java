/*
 * The User API
 * API to manage teams, members and tokens
 *
 * The version of the OpenAPI document: 1.3.10 constant-champ
 * Contact: dev@lab5e.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.lab5e.user;

import com.lab5e.ApiException;
import com.lab5e.user.model.AcceptInviteRequest;
import com.lab5e.user.model.DeleteInviteResponse;
import com.lab5e.user.model.Invite;
import com.lab5e.user.model.InviteList;
import com.lab5e.user.model.InviteRequest;
import com.lab5e.user.model.Member;
import com.lab5e.user.model.MemberList;
import com.lab5e.user.model.RpcStatus;
import com.lab5e.user.model.Team;
import com.lab5e.user.model.TeamList;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TeamsApi
 */
@Ignore
public class TeamsApiTest {

    private final TeamsApi api = new TeamsApi();

    
    /**
     * Accept invite
     *
     * Accept an invite from another user. This will add the currently logged in user to the team as a regular memeber. When the invite is accepted it is removed from the team&#39;s invites and cannot be reused.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void acceptInviteTest() throws ApiException {
        AcceptInviteRequest body = null;
        Team response = api.acceptInvite(body);

        // TODO: test validations
    }
    
    /**
     * Create team
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createTeamTest() throws ApiException {
        Team body = null;
        Team response = api.createTeam(body);

        // TODO: test validations
    }
    
    /**
     * Delete invite
     *
     * Delete an invite created earlier. You must be an administrator of the team to perform this action
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteInviteTest() throws ApiException {
        String teamId = null;
        String code = null;
        DeleteInviteResponse response = api.deleteInvite(teamId, code);

        // TODO: test validations
    }
    
    /**
     * Remove member
     *
     * Remove a member from the team. You must be an administrator to do this. You can&#39;t remove yourself from the team.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteMemberTest() throws ApiException {
        String teamId = null;
        String userId = null;
        Member response = api.deleteMember(teamId, userId);

        // TODO: test validations
    }
    
    /**
     * Remove team
     *
     * Update the team. You must be an administrator of the team to edit it.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteTeamTest() throws ApiException {
        String teamId = null;
        Team response = api.deleteTeam(teamId);

        // TODO: test validations
    }
    
    /**
     * Generate invite
     *
     * Update the team. You must be an administrator of the team to edit it.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void generateInviteTest() throws ApiException {
        String teamId = null;
        InviteRequest body = null;
        Invite response = api.generateInvite(teamId, body);

        // TODO: test validations
    }
    
    /**
     * List invites
     *
     * Update the team. You must be an administrator of the team to edit it.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listInvitesTest() throws ApiException {
        String teamId = null;
        InviteList response = api.listInvites(teamId);

        // TODO: test validations
    }
    
    /**
     * List teams
     *
     * Update the team. You must be an administrator of the team to edit it.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listTeamsTest() throws ApiException {
        TeamList response = api.listTeams();

        // TODO: test validations
    }
    
    /**
     * Retrieve invite
     *
     * Read a single invite from the team&#39;s set of non-redeemed invites.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveInviteTest() throws ApiException {
        String teamId = null;
        String code = null;
        Invite response = api.retrieveInvite(teamId, code);

        // TODO: test validations
    }
    
    /**
     * Retrieve member
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveMemberTest() throws ApiException {
        String teamId = null;
        String userId = null;
        Member response = api.retrieveMember(teamId, userId);

        // TODO: test validations
    }
    
    /**
     * Retrieve team
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveTeamTest() throws ApiException {
        String teamId = null;
        Team response = api.retrieveTeam(teamId);

        // TODO: test validations
    }
    
    /**
     * List members
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveTeamMembersTest() throws ApiException {
        String teamId = null;
        MemberList response = api.retrieveTeamMembers(teamId);

        // TODO: test validations
    }
    
    /**
     * Update member
     *
     * You must be an administrator of the team to update member settings
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateMemberTest() throws ApiException {
        String teamId = null;
        String userId = null;
        Member body = null;
        Member response = api.updateMember(teamId, userId, body);

        // TODO: test validations
    }
    
    /**
     * Update team
     *
     * Update the team. You must be an administrator of the team to edit it.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateTeamTest() throws ApiException {
        String teamId = null;
        Team body = null;
        Team response = api.updateTeam(teamId, body);

        // TODO: test validations
    }
    
}
