package org.adaitaw.email.mapper;


import org.adaitaw.email.emaildto.EmailDTO;
import org.adaitaw.email.entities.EmailEntity;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class EmailMapper {
    public EmailEntity emailValDTO2Entity(String email, boolean validar) {
        EmailEntity emailEntity = new EmailEntity();
        emailEntity.setEmail(email);
        emailEntity.setValidacion(validar);
        emailEntity.setFechaValidacion(LocalDate.now());
        return emailEntity;
    }

    public EmailDTO emailValEntity2DTO(EmailEntity entity){
        EmailDTO emailDTO = new EmailDTO();
        emailDTO.setId(entity.getId());
        emailDTO.setEmail(entity.getEmail());
        emailDTO.setValidacion(entity.isValidacion());
        emailDTO.setFechaValidacion(entity.getFechaValidacion());
        return emailDTO;
    }


}
