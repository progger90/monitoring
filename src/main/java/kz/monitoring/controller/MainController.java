package kz.monitoring.controller;

import kz.monitoring.service.MonitoringService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {


    @Autowired
    MonitoringService monitoringService;

    @CrossOrigin("*")
    @PostMapping("/get-positions")
    public ResponseEntity<?> getPositions() {
        return new ResponseEntity<>(monitoringService.getEmployeePositions(), HttpStatus.OK);
    }
}
