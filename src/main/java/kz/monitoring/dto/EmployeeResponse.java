package kz.monitoring.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class EmployeeResponse {
    String name;
    int top;
    int left;
}
