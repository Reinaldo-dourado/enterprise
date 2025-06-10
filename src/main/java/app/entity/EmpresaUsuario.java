
package app.entity;

import java.io.*;
import jakarta.persistence.*;
import java.util.*;
import jakarta.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;
import cronapi.swagger.CronappSwagger;



import cronapp.framework.core.persistence.*;

/**
* Classe que representa a tabela EMPRESAUSUARIO
* @generated
*/
@jakarta.persistence.Entity
@jakarta.persistence.Table(name = "\"EMPRESAUSUARIO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.EmpresaUsuario")
@CronappTable(role=CronappTableRole.CLASS)
public class EmpresaUsuario implements Serializable {
    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @CronappColumn(attributeType="STRING", label="Id", defaultValue = "UUID.randomUUID().toString().toUpperCase()")
    @Column(name = "id", nullable = false, insertable=true, updatable=true)
        private java.lang.String id = UUID.randomUUID().toString().toUpperCase();


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Razão Social")
    @Column(name = "razaoSocial", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String razaoSocial;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Nome Fantasial")
    @Column(name = "nomeFantasial", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String nomeFantasial;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="CNPJ", mask="99.999.999/9999-99;0")
    @Column(name = "CNPJ", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String cnPJ;


    /**
    * Construtor
    * @generated
    */
    public EmpresaUsuario(){
    }

    /**
    * Obtém id
    * return id
    * @generated
    */
    public java.lang.String getId() {
        return this.id;
    }

    /**
    * Define id
    * @param id id
    * @generated
    */
    public EmpresaUsuario setId(java.lang.String id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém razaoSocial
    * return razaoSocial
    * @generated
    */
    public java.lang.String getRazaoSocial() {
        return this.razaoSocial;
    }

    /**
    * Define razaoSocial
    * @param razaoSocial razaoSocial
    * @generated
    */
    public EmpresaUsuario setRazaoSocial(java.lang.String razaoSocial) {
        this.razaoSocial = razaoSocial;
        return this;
    }
    /**
    * Obtém nomeFantasial
    * return nomeFantasial
    * @generated
    */
    public java.lang.String getNomeFantasial() {
        return this.nomeFantasial;
    }

    /**
    * Define nomeFantasial
    * @param nomeFantasial nomeFantasial
    * @generated
    */
    public EmpresaUsuario setNomeFantasial(java.lang.String nomeFantasial) {
        this.nomeFantasial = nomeFantasial;
        return this;
    }
    /**
    * Obtém cnPJ
    * return cnPJ
    * @generated
    */
    public java.lang.String getCnPJ() {
        return this.cnPJ;
    }

    /**
    * Define cnPJ
    * @param cnPJ cnPJ
    * @generated
    */
    public EmpresaUsuario setCnPJ(java.lang.String cnPJ) {
        this.cnPJ = cnPJ;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
EmpresaUsuario object = (EmpresaUsuario)obj;
        if (id != null ? !id.equals(object.id) : object.id != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

}
