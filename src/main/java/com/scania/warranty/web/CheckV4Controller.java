/**
 * REST controller for warranty claim APIs.
 * <p>
 * Generated from RPG: unit {@code HS1210}, node {@code n1983}.
 */

package com.scania.warranty.web;

import com.scania.warranty.dto.CheckV4Request;
import com.scania.warranty.dto.CheckV4Response;
import com.scania.warranty.service.CheckV4Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
@RequestMapping("/api/warranty")
public class CheckV4Controller {

    private final CheckV4Service checkV4Service;

    @Autowired
    public CheckV4Controller(CheckV4Service checkV4Service) {
        this.checkV4Service = checkV4Service;
    }

    @PostMapping("/check-v4")
    public ResponseEntity<CheckV4Response> checkV4(@RequestBody CheckV4Request request) {
        LocalDate refDate = request.referenceDate() != null ? request.referenceDate() : LocalDate.now();
        CheckV4Response response = checkV4Service.checkV4(request.hauptgruppe(), refDate);
        return ResponseEntity.ok(response);
    }
}