package com.marom.graphqlserver.repository;

import com.marom.graphqlserver.model.Hotel;
import org.springframework.data.mongodb.repository.Tailable;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface HotelRepository extends ReactiveCrudRepository<Hotel, String> {

    @Tailable
    Flux<Hotel> findWithTailableCursorBy();
}
