package com.marom.graphqlserver.resolver;

import com.coxautodev.graphql.tools.GraphQLSubscriptionResolver;
import com.marom.graphqlserver.model.Hotel;
import com.marom.graphqlserver.repository.HotelRepository;
import org.reactivestreams.Publisher;
import org.springframework.stereotype.Component;

@Component
public class Subscription implements GraphQLSubscriptionResolver {

    private final HotelRepository hotelRepository;

    public Subscription(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    public Publisher<Hotel> getNewHotel() {
        return hotelRepository.findWithTailableCursorBy();
    }
}
