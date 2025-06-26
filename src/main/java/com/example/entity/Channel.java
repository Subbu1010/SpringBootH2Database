package com.example.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tbl_channel")
public class Channel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "channel_id")
    private Long channelId;
    
    @Column(name = "channel_nm")
    private String channelNm;
    
    @Column(name = "ad_group")
    private String adGroup;
    
    // Constructors
    public Channel() {}
    
    public Channel(String channelNm, String adGroup) {
        this.channelNm = channelNm;
        this.adGroup = adGroup;
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
} 