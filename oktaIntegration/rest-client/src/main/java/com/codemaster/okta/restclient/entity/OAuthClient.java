package com.codemaster.okta.restclient.entity;

import org.hibernate.annotations.ColumnDefault;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class OAuthClient
{
    @Id
    @Column(nullable = false)
    private String clientID;
    @Column(nullable = false)
    private String clientSecret;
    @Column
    @ColumnDefault(value = "null")
    private String resourceIDs;
    @Column
    @ColumnDefault(value = "null")
    private String scope;
    @Column
    @ColumnDefault(value = "null")
    private String authorizedGrantTypes;
    @Column
    @ColumnDefault(value = "null")
    private String webServerRedirectUri;
    @Column
    @ColumnDefault(value = "null")
    private String authorities;
    @Column
    @ColumnDefault(value = "null")
    private Integer accessTokenValidity;
    @Column
    @ColumnDefault(value = "null")
    private Integer refreshTokenValidity;
    @Column
    @ColumnDefault(value = "null")
    private String additionalInformation;
    @Column
    @ColumnDefault(value = "null")
    private String autoApprove;

    public OAuthClient() {
    }

    public String getClientID() {
        return clientID;
    }

    public void setClientID(String clientID) {
        this.clientID = clientID;
    }

    public String getClientSecret() {
        return clientSecret;
    }

    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    public String getResourceIDs() {
        return resourceIDs;
    }

    public void setResourceIDs(String resourceIDs) {
        this.resourceIDs = resourceIDs;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public String getAuthorizedGrantTypes() {
        return authorizedGrantTypes;
    }

    public void setAuthorizedGrantTypes(String authorizedGrantTypes) {
        this.authorizedGrantTypes = authorizedGrantTypes;
    }

    public String getWebServerRedirectUri() {
        return webServerRedirectUri;
    }

    public void setWebServerRedirectUri(String webServerRedirectUri) {
        this.webServerRedirectUri = webServerRedirectUri;
    }

    public String getAuthorities() {
        return authorities;
    }

    public void setAuthorities(String authorities) {
        this.authorities = authorities;
    }

    public Integer getAccessTokenValidity() {
        return accessTokenValidity;
    }

    public void setAccessTokenValidity(Integer accessTokenValidity) {
        this.accessTokenValidity = accessTokenValidity;
    }

    public Integer getRefreshTokenValidity() {
        return refreshTokenValidity;
    }

    public void setRefreshTokenValidity(Integer refreshTokenValidity) {
        this.refreshTokenValidity = refreshTokenValidity;
    }

    public String getAdditionalInformation() {
        return additionalInformation;
    }

    public void setAdditionalInformation(String additionalInformation) {
        this.additionalInformation = additionalInformation;
    }

    public String getAutoApprove() {
        return autoApprove;
    }

    public void setAutoApprove(String autoApprove) {
        this.autoApprove = autoApprove;
    }
}
