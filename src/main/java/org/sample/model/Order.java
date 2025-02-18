package org.sample.model;

import java.time.LocalDate;

public record Order(long id,
                    String customerName,
                    String customerSurname,
                    double price,
                    LocalDate orderDate,
                    double customerRating) {
}