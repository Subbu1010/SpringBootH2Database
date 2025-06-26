package com.example.service;

import com.example.dto.ChannelResponse;
import com.example.entity.Channel;
import com.example.repository.ChannelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ChannelService {
    
    @Autowired
    private ChannelRepository channelRepository;
    
    public List<ChannelResponse> getAllChannels() {
        List<Channel> channels = channelRepository.findAll();
        return channels.stream()
                .map(channel -> new ChannelResponse(
                        channel.getChannelId(),
                        channel.getChannelNm(),
                        channel.getAdGroup(),
                        null // default_flag is null as per requirement
                ))
                .collect(Collectors.toList());
    }
} 