package com.marom.graphqlserver.repository;

import com.marom.graphqlserver.model.Room;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

public interface RoomRepository extends ReactiveMongoRepository<Room, String> {

    @Query("{ 'hotelId' :  ?0 }")
    Flux<Room> findAllByHotelId(String hotelId);
}
