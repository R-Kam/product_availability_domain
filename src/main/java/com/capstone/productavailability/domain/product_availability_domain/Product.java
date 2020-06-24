package com.capstone.productavailability.domain.product_availability_domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class Product {
    String productId;
    String productName;
    String deptId;
}
