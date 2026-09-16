package com.biolab.ecommerce.DTOs;

import com.biolab.ecommerce.entities.Role;
import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioDTO {

    private long id;
    @NotBlank
    private String nome;
    @NotBlank
    @Email
    @Size(max = 150)
    @Column(length = 150)
    private String email;
    @Size(max = 20, message = "O máximo são 20 caracteres")
    @Column(length = 20)
    private String telefone;
    @NotBlank @Size(min = 6)
    @Size(min = 6, max = 20)
    private String senha;
    private Role roles;

    public UsuarioDTO(String nome, String email, String telefone, String senha, Role roles) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.senha = senha;
        this.roles = roles;
    }
}
