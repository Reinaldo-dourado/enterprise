
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
* Classe que representa a tabela PROJETOSCONTRATOITENS
* @generated
*/
@jakarta.persistence.Entity
@jakarta.persistence.Table(name = "\"PROJETOSCONTRATOITENS\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.ProjetosContratoItens")
@CronappTable(role=CronappTableRole.ASSOCIATION_CLASS)
public class ProjetosContratoItens implements Serializable {
    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @CronappColumn(attributeType="STRING", label="Id")
    @Column(name = "id", nullable = false, insertable=true, updatable=true)
        private java.lang.String id = UUID.randomUUID().toString().toUpperCase();


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_projetos", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
        
        private Projetos projetos;


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_contratoItens", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
        
        private ContratoItens contratoItens;


    /**
    * Construtor
    * @generated
    */
    public ProjetosContratoItens(){
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
    public ProjetosContratoItens setId(java.lang.String id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém projetos
    * return projetos
    * @generated
    */
    public Projetos getProjetos() {
        return this.projetos;
    }

    /**
    * Define projetos
    * @param projetos projetos
    * @generated
    */
    public ProjetosContratoItens setProjetos(Projetos projetos) {
        this.projetos = projetos;
        return this;
    }
    /**
    * Obtém contratoItens
    * return contratoItens
    * @generated
    */
    public ContratoItens getContratoItens() {
        return this.contratoItens;
    }

    /**
    * Define contratoItens
    * @param contratoItens contratoItens
    * @generated
    */
    public ProjetosContratoItens setContratoItens(ContratoItens contratoItens) {
        this.contratoItens = contratoItens;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
ProjetosContratoItens object = (ProjetosContratoItens)obj;
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
