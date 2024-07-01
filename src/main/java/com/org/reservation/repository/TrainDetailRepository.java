package com.org.reservation.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.org.reservation.model.Offer;
import com.org.reservation.model.TrainDetails;

import jakarta.transaction.Transactional;

@Repository
public interface TrainDetailRepository extends JpaRepository<TrainDetails, Integer> {

	@Query(nativeQuery = false, value = "from Offer where place=:place")
	public List<Offer> getOffers(@Param("place") String place);

	 @Modifying
    @Transactional
	@Query("UPDATE  TrainDetails t SET t.totalAvailableSeat=:pendingTicket WHERE t.trainNo=:trainNo")
	public int updateTainDetails(@Param("trainNo") Integer trainNo, @Param("pendingTicket") Integer pendingTicket);

}
