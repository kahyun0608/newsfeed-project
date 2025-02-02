package org.sparta.newsfeed.domain.friend.repository;

import org.sparta.newsfeed.global.entity.Friend;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface FriendRepository extends JpaRepository<Friend, Long> {

    Optional<Friend> findByPostedUserIdAndRequestedUserId(Long postedUserId, Long requestedUserId);

    List<Friend> findByRequestedUserId(Long requestedUserId);
}
