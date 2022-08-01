package com.springboot.notification_service.repository;

import com.springboot.notification_service.model.SMS;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface SMSRepository extends JpaRepository<SMS, Long> {


}
