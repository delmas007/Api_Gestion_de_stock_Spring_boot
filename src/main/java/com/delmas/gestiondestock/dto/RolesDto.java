package com.delmas.gestiondestock.dto;

import com.delmas.gestiondestock.Model.MvtStk;
import com.delmas.gestiondestock.Model.Roles;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RolesDto {

    private Integer id;

    private String roleName;

    private UtilisateurDto utilisateur;

    public static RolesDto fromEntity(Roles roles){
        if(roles == null){
            return null;
        }

        return  RolesDto.builder()
                .id(roles.getId())
                .roleName(roles.getRoleName())
                .build();
    }
    public static Roles toEntity(RolesDto rolesDto){
        if(rolesDto == null){
            return null;
        }

        return  Roles.builder()
                .roleName(rolesDto.getRoleName())
                .build();
    }
}
