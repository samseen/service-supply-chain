package com.samseen.servicesupplychain.security.auth.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class AuthenticationRequest {
    private String username;
    private String password;
}
