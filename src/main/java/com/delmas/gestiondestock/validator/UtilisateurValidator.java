package com.delmas.gestiondestock.validator;

import com.delmas.gestiondestock.dto.UtilisateurDto;
import org.springframework.util.StringUtils;
import java.util.ArrayList;
import java.util.List;

public class UtilisateurValidator {

    public static List<String> validate(UtilisateurDto utilisateurDto){
        List<String> errors = new ArrayList<>();

        if(utilisateurDto== null){
            errors.add("Veillez renseigner le nom d'utilisateur");
            errors.add("Veillez renseigner le prenom de l'utilisateur");
            errors.add("Veillez renseigner le mot de passe de l'utilisateur");
            errors.add("Veillez renseigner l'adresse de l'utilisateur");
            errors.add("Veillez renseigner l'adresse de l'utilisateur");

            return errors;
        }

        if(!StringUtils.hasLength(utilisateurDto.getNom())){
            errors.add("Veillez renseigner le nom d'utilisateur");
        }
        if(!StringUtils.hasLength(utilisateurDto.getPrenom())){
            errors.add("Veillez renseigner le prenom de l'utilisateur");
        }
        if(!StringUtils.hasLength(utilisateurDto.getEmail())){
            errors.add("Veillez renseigner l'email de l'utilisateur");
        }
        if(utilisateurDto.getDateDeNaissance() == null){
            errors.add("Veillez renseigner la date de naissance de l'utilisateur");
        }
        if(!StringUtils.hasLength(utilisateurDto.getMotDePasse())){
            errors.add("Veillez renseigner le mot de passe de l'utilisateur");
        }
        if(utilisateurDto.getAdresse() == null){
            errors.add("Veillez renseigner l'adresse de l'utilisateur");
        }else {
            if(utilisateurDto.getAdresse().getAdresse1() == null){
                errors.add("le champs 'adresse 1' est obligatoire");
            }
            if(utilisateurDto.getAdresse().getAdresse2() == null){
                errors.add("le champs 'adresse 2' est obligatoire");
            }
            if(utilisateurDto.getAdresse().getPays() == null){
                errors.add("le champs 'pays' est obligatoire");
            }
            if(utilisateurDto.getAdresse().getVille() == null){
                errors.add("le champs 'ville' est obligatoire");
            }
            if(utilisateurDto.getAdresse().getCodePostale() == null){
                errors.add("le champs 'code postale' est obligatoire");
            }
        }

        return errors;
    }
}
