
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
* Classe que representa a tabela AREAATUACAODELIVERY
* @generated
*/
@jakarta.persistence.Entity
@jakarta.persistence.Table(name = "\"AREAATUACAODELIVERY\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.AreaAtuacaoDelivery")
@CronappTable(role=CronappTableRole.CLASS)
public class AreaAtuacaoDelivery implements Serializable {
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
    @CronappColumn(attributeType="STRING", label="Área")
    @Column(name = "nomeArea", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String nomeArea;


    /**
    * Construtor
    * @generated
    */
    public AreaAtuacaoDelivery(){
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
    public AreaAtuacaoDelivery setId(java.lang.String id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém nomeArea
    * return nomeArea
    * @generated
    */
    public java.lang.String getNomeArea() {
        return this.nomeArea;
    }

    /**
    * Define nomeArea
    * @param nomeArea nomeArea
    * @generated
    */
    public AreaAtuacaoDelivery setNomeArea(java.lang.String nomeArea) {
        this.nomeArea = nomeArea;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
AreaAtuacaoDelivery object = (AreaAtuacaoDelivery)obj;
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
