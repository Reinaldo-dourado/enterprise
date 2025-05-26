
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
* Classe que representa a tabela Cliente
* @generated
*/
@jakarta.persistence.Entity
@jakarta.persistence.Table(name = "\"Cliente\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Cliente")
@CronappTable(role=CronappTableRole.CLASS)
public class Cliente implements Serializable {
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
    @CronappColumn(attributeType="STRING", label="Cnpj", mask="99.999.999/9999-99;0")
    @Column(name = "cnpj", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String cnpj;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Razao Social")
    @Column(name = "razaoSocial", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String razaoSocial;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Nome Fantasia")
    @Column(name = "nomeFantasia", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String nomeFantasia;


    /**
    * Construtor
    * @generated
    */
    public Cliente(){
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
    public Cliente setId(java.lang.String id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém cnpj
    * return cnpj
    * @generated
    */
    public java.lang.String getCnpj() {
        return this.cnpj;
    }

    /**
    * Define cnpj
    * @param cnpj cnpj
    * @generated
    */
    public Cliente setCnpj(java.lang.String cnpj) {
        this.cnpj = cnpj;
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
    public Cliente setRazaoSocial(java.lang.String razaoSocial) {
        this.razaoSocial = razaoSocial;
        return this;
    }
    /**
    * Obtém nomeFantasia
    * return nomeFantasia
    * @generated
    */
    public java.lang.String getNomeFantasia() {
        return this.nomeFantasia;
    }

    /**
    * Define nomeFantasia
    * @param nomeFantasia nomeFantasia
    * @generated
    */
    public Cliente setNomeFantasia(java.lang.String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Cliente object = (Cliente)obj;
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
