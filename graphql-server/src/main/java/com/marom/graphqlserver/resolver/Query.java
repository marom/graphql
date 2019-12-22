package com.marom.graphqlserver.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.marom.graphqlserver.model.Hotel;
import com.marom.graphqlserver.model.Payment;
import com.marom.graphqlserver.repository.HotelRepository;
import com.marom.graphqlserver.repository.PaymentRepository;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class Query implements GraphQLQueryResolver {

    private final HotelRepository hotelRepository;
    private final PaymentRepository paymentRepository;

    public Query(HotelRepository hotelRepository, PaymentRepository paymentRepository) {
        this.hotelRepository = hotelRepository;
        this.paymentRepository = paymentRepository;
    }

    public Iterable<Hotel> findAllHotels() {
        return hotelRepository.findAll().toIterable();
    }

    public Optional<Hotel> findHotelById(String id) {
        return hotelRepository.findById(id).blockOptional();
    }

    public Optional<Long> countHotels() {
        return hotelRepository.count().blockOptional();
    }

    public Iterable<Payment> findAllPayments() {
        return paymentRepository.findAll().toIterable();
    }
}
