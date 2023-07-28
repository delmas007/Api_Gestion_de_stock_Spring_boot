package com.delmas.gestiondestock.validator;

import com.delmas.gestiondestock.dto.ClientDto;
import com.delmas.gestiondestock.dto.EntrepriseDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class EntrepriseValidator {

    public static List<String> validate(EntrepriseDto entrepriseDto){
        List<String> errors = new ArrayList<>();

        if(entrepriseDto == null){
            errors.add("Veillez renseigner le nom de l'entreprise ");
            errors.add("Veillez renseigner le prenom de l'entreprise ");
            errors.add("Veillez renseigner le mail de l'entreprise ");
            errors.add("Veillez renseigner le numero de telephone de l'entreprise ");

            return errors;
        }

        if(!StringUtils.hasLength(entrepriseDto.getNom())){
            errors.add("Veillez renseigner le nom de l'entreprise ");
        }
        if(entrepriseDto.getAdresse() == null){
            errors.add("Veillez renseigner l'adresse de l'entreprise ");
        }
        if(!StringUtils.hasLength(entrepriseDto.getEmail())){
            errors.add("Veillez renseigner le mail de l'entreprise ");
        }
        if(!StringUtils.hasLength(entrepriseDto.getNumTel())){
            errors.add("Veillez renseigner le numero de telephone de l'entreprise ");
        }

        return errors;
    }
}
