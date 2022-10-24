package org.example;

import org.springframework.stereotype.Component;

@Component
public class UserService {

    public NotificacionService ns;

    public UserService(NotificacionService ns) {
        this.ns = ns;
    }
}
