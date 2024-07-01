package com.org.reservation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.org.reservation.model.TicketBookedHistory;

@Repository
public interface TicketBookedHistoryRepository extends JpaRepository<TicketBookedHistory, Integer> {

}
