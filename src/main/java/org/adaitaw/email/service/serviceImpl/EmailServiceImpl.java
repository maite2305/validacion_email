package org.adaitaw.email.service.serviceImpl;


import org.adaitaw.email.emaildto.EmailDTO;
import org.adaitaw.email.entities.EmailEntity;
import org.adaitaw.email.mapper.EmailMapper;
import org.adaitaw.email.repository.EmailRepository;
import org.adaitaw.email.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class EmailServiceImpl implements EmailService {

    @Autowired
    private EmailMapper emailMapper;

    @Autowired
    private EmailRepository emailRepository;

    public EmailDTO save(String email) {
        boolean validar =  validacion(email);
        EmailEntity emailEntity = emailMapper.emailValDTO2Entity(email, validar);
        EmailEntity savedEntity = emailRepository.save(emailEntity);
        EmailDTO result = emailMapper.emailValEntity2DTO(savedEntity);
        return result;
    }

    public boolean validacion(String email){
        Pattern pattern = Pattern.compile("^([0-9a-zA-Z]+[-._+&])*[0-9a-zA-Z]+@([-0-9a-zA-Z]+[.])+[a-zA-Z]{2,6}$");
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }


}
