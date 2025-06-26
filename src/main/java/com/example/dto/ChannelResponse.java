package com.example.dto;

public class ChannelResponse {
    private Long channelId;
    private String channelNm;
    private String adGroup;
    private String defaultFlag;
    
    // Constructors
    public ChannelResponse() {}
    
    public ChannelResponse(Long channelId, String channelNm, String adGroup, String defaultFlag) {
        this.channelId = channelId;
        this.channelNm = channelNm;
        this.adGroup = adGroup;
        this.defaultFlag = defaultFlag;
    }
    
    // Getters and Setters
    public Long getChannelId() {
        return channelId;
    }
    
    public void setChannelId(Long channelId) {
        this.channelId = channelId;
    }
    
    public String getChannelNm() {
        return channelNm;
    }
    
    public void setChannelNm(String channelNm) {
        this.channelNm = channelNm;
    }
    
    public String getAdGroup() {
        return adGroup;
    }
    
    public void setAdGroup(String adGroup) {
        this.adGroup = adGroup;
    }
    
    public String getDefaultFlag() {
        return defaultFlag;
    }
    
    public void setDefaultFlag(String defaultFlag) {
        this.defaultFlag = defaultFlag;
    }
} 