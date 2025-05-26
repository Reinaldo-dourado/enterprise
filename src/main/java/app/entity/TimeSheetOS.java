
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
* Classe que representa a tabela TimeSheetOS
* @generated
*/
@jakarta.persistence.Entity
@jakarta.persistence.Table(name = "\"TimeSheetOS\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.TimeSheetOS")
@CronappTable(role=CronappTableRole.CLASS)
public class TimeSheetOS implements Serializable {
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
    @JoinColumn(name="fk_ordemDeServicos", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
        
        private OrdemDeServicos ordemDeServicos;


    /**
    * @generated
    */
    @Temporal(TemporalType.DATE)
    @CronappColumn(attributeType="DATE", label="Data Inicial")
    @Column(name = "dataInicial", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.util.Date dataInicial;


    /**
    * @generated
    */
    @Temporal(TemporalType.TIME)
    @CronappColumn(attributeType="TIME", label="Hora Inicial")
    @Column(name = "horaInicial", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.util.Date horaInicial;


    /**
    * @generated
    */
    @Temporal(TemporalType.DATE)
    @CronappColumn(attributeType="DATE", label="Data Final")
    @Column(name = "dataFinal", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.util.Date dataFinal;


    /**
    * @generated
    */
    @Temporal(TemporalType.TIME)
    @CronappColumn(attributeType="TIME", label="Horafinal")
    @Column(name = "horafinal", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.util.Date horafinal;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Descricao Atividade")
    @Column(name = "DescricaoAtividade", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String descricaoAtividade;


    /**
    * Construtor
    * @generated
    */
    public TimeSheetOS(){
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
    public TimeSheetOS setId(java.lang.String id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém ordemDeServicos
    * return ordemDeServicos
    * @generated
    */
    public OrdemDeServicos getOrdemDeServicos() {
        return this.ordemDeServicos;
    }

    /**
    * Define ordemDeServicos
    * @param ordemDeServicos ordemDeServicos
    * @generated
    */
    public TimeSheetOS setOrdemDeServicos(OrdemDeServicos ordemDeServicos) {
        this.ordemDeServicos = ordemDeServicos;
        return this;
    }
    /**
    * Obtém dataInicial
    * return dataInicial
    * @generated
    */
    public java.util.Date getDataInicial() {
        return this.dataInicial;
    }

    /**
    * Define dataInicial
    * @param dataInicial dataInicial
    * @generated
    */
    public TimeSheetOS setDataInicial(java.util.Date dataInicial) {
        this.dataInicial = dataInicial;
        return this;
    }
    /**
    * Obtém horaInicial
    * return horaInicial
    * @generated
    */
    public java.util.Date getHoraInicial() {
        return this.horaInicial;
    }

    /**
    * Define horaInicial
    * @param horaInicial horaInicial
    * @generated
    */
    public TimeSheetOS setHoraInicial(java.util.Date horaInicial) {
        this.horaInicial = horaInicial;
        return this;
    }
    /**
    * Obtém dataFinal
    * return dataFinal
    * @generated
    */
    public java.util.Date getDataFinal() {
        return this.dataFinal;
    }

    /**
    * Define dataFinal
    * @param dataFinal dataFinal
    * @generated
    */
    public TimeSheetOS setDataFinal(java.util.Date dataFinal) {
        this.dataFinal = dataFinal;
        return this;
    }
    /**
    * Obtém horafinal
    * return horafinal
    * @generated
    */
    public java.util.Date getHorafinal() {
        return this.horafinal;
    }

    /**
    * Define horafinal
    * @param horafinal horafinal
    * @generated
    */
    public TimeSheetOS setHorafinal(java.util.Date horafinal) {
        this.horafinal = horafinal;
        return this;
    }
    /**
    * Obtém descricaoAtividade
    * return descricaoAtividade
    * @generated
    */
    public java.lang.String getDescricaoAtividade() {
        return this.descricaoAtividade;
    }

    /**
    * Define descricaoAtividade
    * @param descricaoAtividade descricaoAtividade
    * @generated
    */
    public TimeSheetOS setDescricaoAtividade(java.lang.String descricaoAtividade) {
        this.descricaoAtividade = descricaoAtividade;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
TimeSheetOS object = (TimeSheetOS)obj;
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
