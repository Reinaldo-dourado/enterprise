
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
* Classe que representa a tabela Projetos
* @generated
*/
@jakarta.persistence.Entity
@jakarta.persistence.Table(name = "\"Projetos\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Projetos")
@CronappTable(role=CronappTableRole.CLASS)
public class Projetos implements Serializable {
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
    @CronappColumn(attributeType="STRING", label="Name")
    @Column(name = "name", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String name;


    /**
    * @generated
    */
    @Temporal(TemporalType.DATE)
    @CronappColumn(attributeType="DATE", label="Data Inicio")
    @Column(name = "dataInicio", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.util.Date dataInicio;


    /**
    * @generated
    */
    @Temporal(TemporalType.DATE)
    @CronappColumn(attributeType="DATE", label="Data Fim")
    @Column(name = "dataFim", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.util.Date dataFim;


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_contrato", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
        
        private Contrato contrato;


    /**
    * Construtor
    * @generated
    */
    public Projetos(){
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
    public Projetos setId(java.lang.String id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém name
    * return name
    * @generated
    */
    public java.lang.String getName() {
        return this.name;
    }

    /**
    * Define name
    * @param name name
    * @generated
    */
    public Projetos setName(java.lang.String name) {
        this.name = name;
        return this;
    }
    /**
    * Obtém dataInicio
    * return dataInicio
    * @generated
    */
    public java.util.Date getDataInicio() {
        return this.dataInicio;
    }

    /**
    * Define dataInicio
    * @param dataInicio dataInicio
    * @generated
    */
    public Projetos setDataInicio(java.util.Date dataInicio) {
        this.dataInicio = dataInicio;
        return this;
    }
    /**
    * Obtém dataFim
    * return dataFim
    * @generated
    */
    public java.util.Date getDataFim() {
        return this.dataFim;
    }

    /**
    * Define dataFim
    * @param dataFim dataFim
    * @generated
    */
    public Projetos setDataFim(java.util.Date dataFim) {
        this.dataFim = dataFim;
        return this;
    }
    /**
    * Obtém contrato
    * return contrato
    * @generated
    */
    public Contrato getContrato() {
        return this.contrato;
    }

    /**
    * Define contrato
    * @param contrato contrato
    * @generated
    */
    public Projetos setContrato(Contrato contrato) {
        this.contrato = contrato;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Projetos object = (Projetos)obj;
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
