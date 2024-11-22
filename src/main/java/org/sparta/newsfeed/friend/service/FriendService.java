package org.sparta.newsfeed.friend.service;

import org.sparta.newsfeed.friend.dto.FriendRelationResponseDto;
import org.sparta.newsfeed.friend.dto.FriendResponseDto;
import org.sparta.newsfeed.friend.dto.RequestAcceptResponseDto;

import java.util.List;

public interface FriendService {

    List<FriendRelationResponseDto> findUsersFriendList(Long targetId, Long loginUserId);

    List<FriendResponseDto> findRequestFriends(Long userId);

    void sendFriendRequest(Long targetId, Long loginUserId);

    RequestAcceptResponseDto acceptRequest(Long targetId, Long loginUserId);

    void refuseRequset(Long targetId, Long loginUserId);

    void removeFriend(Long targetId, Long loginUserId);
}
