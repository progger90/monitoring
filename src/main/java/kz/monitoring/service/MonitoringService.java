package kz.monitoring.service;

import kz.monitoring.dto.EmployeeResponse;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MonitoringService {

    public List<EmployeeResponse> getEmployeePositions() {
        return new ArrayList<>() {{
            for(int i = 0; i < 50; i++) {
                add(new EmployeeResponse("tester " + i, randomPosition(0, 480), randomPosition(0, 700)));
            }
        }};
    }

    public int randomPosition(int min, int max) {
        return (int)Math.floor(Math.random() * (max - min + 1) + min);
    }
}
