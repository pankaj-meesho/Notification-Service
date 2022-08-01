package com.springboot.notification_service.repository;

import com.springboot.notification_service.model.SMS;
import com.springboot.notification_service.model.Blacklist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface blacklistRepository extends JpaRepository<Blacklist, Long> {

}
