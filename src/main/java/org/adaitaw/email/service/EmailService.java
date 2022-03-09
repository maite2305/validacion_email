package org.adaitaw.email.service;


import org.adaitaw.email.emaildto.EmailDTO;

public interface EmailService {
    EmailDTO save(String email);
    boolean validacion(String email);
}
