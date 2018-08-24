package com.security;

import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;

class GrantedAuthorityImpl implements GrantedAuthority {
    @Setter
    private String authority;

    public GrantedAuthorityImpl(String authority) {
        this.authority = authority;
    }

    @Override
    public String getAuthority() {
        return this.authority;
    }
}