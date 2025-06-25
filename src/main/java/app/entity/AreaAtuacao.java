
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
* Classe que representa a tabela AREAATUACAO
* @generated
*/
@jakarta.persistence.Entity
@jakarta.persistence.Table(name = "\"AREAATUACAO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.AreaAtuacao")
@CronappTable(role=CronappTableRole.CLASS)
public class AreaAtuacao implements Serializable {
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
    @CronappColumn(attributeType="STRING", label="Nome Area")
    @Column(name = "nomeArea", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String nomeArea;


    /**
    * @generated
    */
    @CronappColumn(attributeType="BOOLEAN", label="Participa da Alocação?")
    @Column(name = "IsparticipaAlocacaoTimeSheet", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Boolean isparticipaAlocacaoTimeSheet;


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_areaAtuacao_0", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
        
        private AreaAtuacao areaAtuacao_0;


    /**
    * Construtor
    * @generated
    */
    public AreaAtuacao(){
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
    public AreaAtuacao setId(java.lang.String id) {
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
    public AreaAtuacao setNomeArea(java.lang.String nomeArea) {
        this.nomeArea = nomeArea;
        return this;
    }
    /**
    * Obtém isparticipaAlocacaoTimeSheet
    * return isparticipaAlocacaoTimeSheet
    * @generated
    */
    public java.lang.Boolean getIsparticipaAlocacaoTimeSheet() {
        return this.isparticipaAlocacaoTimeSheet;
    }

    /**
    * Define isparticipaAlocacaoTimeSheet
    * @param isparticipaAlocacaoTimeSheet isparticipaAlocacaoTimeSheet
    * @generated
    */
    public AreaAtuacao setIsparticipaAlocacaoTimeSheet(java.lang.Boolean isparticipaAlocacaoTimeSheet) {
        this.isparticipaAlocacaoTimeSheet = isparticipaAlocacaoTimeSheet;
        return this;
    }
    /**
    * Obtém areaAtuacao_0
    * return areaAtuacao_0
    * @generated
    */
    public AreaAtuacao getAreaAtuacao_0() {
        return this.areaAtuacao_0;
    }

    /**
    * Define areaAtuacao_0
    * @param areaAtuacao_0 areaAtuacao_0
    * @generated
    */
    public AreaAtuacao setAreaAtuacao_0(AreaAtuacao areaAtuacao_0) {
        this.areaAtuacao_0 = areaAtuacao_0;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
AreaAtuacao object = (AreaAtuacao)obj;
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
