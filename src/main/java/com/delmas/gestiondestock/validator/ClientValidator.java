package com.delmas.gestiondestock.validator;

import com.delmas.gestiondestock.dto.CategoryDto;
import com.delmas.gestiondestock.dto.ClientDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class ClientValidator {

    public static List<String> validate(ClientDto clientDto){
        List<String> errors = new ArrayList<>();

        if(clientDto == null){
            errors.add("Veillez renseigner le nom du client");
            errors.add("Veillez renseigner le prenom du client");
            errors.add("Veillez renseigner le mail du client");
            errors.add("Veillez renseigner le numero de telephone du client");

            return errors;
        }

        if(!StringUtils.hasLength(clientDto.getNom())){
            errors.add("Veillez renseigner le nom du client");
        }
        if(!StringUtils.hasLength(clientDto.getPrenom())){
            errors.add("Veillez renseigner le prenom du client");
        }
        if(!StringUtils.hasLength(clientDto.getEmail())){
            errors.add("Veillez renseigner le mail du client");
        }
        if(!StringUtils.hasLength(clientDto.getNumTel())){
            errors.add("Veillez renseigner le numero de telephone du client");
        }

        return errors;
    }
}
