package com.socialapp.auth_server.controller;

import com.socialapp.auth_server.dto.AuthServerContactInfoDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class Info {

        @Value("${build.version}")
        private String buildVersion;

        @Autowired
        private AuthServerContactInfoDto authServerContactInfoDto;

        @GetMapping("/build-info")
        public ResponseEntity<String> getBuildInfo() {
                return ResponseEntity.status(HttpStatus.OK).body(buildVersion);
        }

        @GetMapping("/contact-info")
        public ResponseEntity<AuthServerContactInfoDto> getContactInfo() {
                return ResponseEntity.ok(authServerContactInfoDto);
        }
//        @GetMapping("/test")
//        public String test() {
//                return "Auth server is running!";
//        }
}
