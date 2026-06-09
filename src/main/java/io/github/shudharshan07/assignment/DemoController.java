package io.github.shudharshan07.assignment;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;

@RestController
public class DemoController {

    @GetMapping("/")
    public ResponseEntity<Health> health() {
        return ResponseEntity.ok(new Health(LocalTime.now(), true));
    }
}
