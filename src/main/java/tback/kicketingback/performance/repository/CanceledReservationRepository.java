package tback.kicketingback.performance.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tback.kicketingback.performance.domain.CanceledReservation;

public interface CanceledReservationRepository extends JpaRepository<CanceledReservation, Long> {
}
