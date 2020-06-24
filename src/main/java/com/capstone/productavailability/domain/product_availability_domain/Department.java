package com.capstone.productavailability.domain.product_availability_domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class Department {
    String deptId;
    String deptName;
}
