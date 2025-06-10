
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
* Classe que representa a tabela AlocacaoOS
* @generated
*/
@jakarta.persistence.Entity
@jakarta.persistence.Table(name = "\"AlocacaoOS\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.AlocacaoOrdemServico")
@CronappTable(role=CronappTableRole.ASSOCIATION_CLASS)
public class AlocacaoOrdemServico implements Serializable {
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
    @Temporal(TemporalType.DATE)
    @CronappColumn(attributeType="DATE", label="Data Inicial")
    @Column(name = "dataInicial", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.util.Date dataInicial;


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
    @ManyToOne
    @JoinColumn(name="fk_ordemDeServicos", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
        
        private OrdemDeServicos ordemDeServicos;


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_user", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
        
        private User user;


    /**
    * @generated
    */
    @CronappColumn(attributeType="INTEGER", label="Quantidade Prevista")
    @Column(name = "quantidadePrevista", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer quantidadePrevista;


    /**
    * @generated
    */
    @CronappColumn(attributeType="INTEGER", label="Quantidade Em Dias Uteis Prazo")
    @Column(name = "quantidadeEmDiasUteisPrazo", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer quantidadeEmDiasUteisPrazo;


    /**
    * @generated
    */
    @Temporal(TemporalType.DATE)
    @CronappColumn(attributeType="DATE", label="Data Prevista")
    @Column(name = "dataPrevistaEntrega", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.util.Date dataPrevistaEntrega;


    /**
    * Construtor
    * @generated
    */
    public AlocacaoOrdemServico(){
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
    public AlocacaoOrdemServico setId(java.lang.String id) {
        this.id = id;
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
    public AlocacaoOrdemServico setDataInicial(java.util.Date dataInicial) {
        this.dataInicial = dataInicial;
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
    public AlocacaoOrdemServico setDataFinal(java.util.Date dataFinal) {
        this.dataFinal = dataFinal;
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
    public AlocacaoOrdemServico setOrdemDeServicos(OrdemDeServicos ordemDeServicos) {
        this.ordemDeServicos = ordemDeServicos;
        return this;
    }
    /**
    * Obtém user
    * return user
    * @generated
    */
    public User getUser() {
        return this.user;
    }

    /**
    * Define user
    * @param user user
    * @generated
    */
    public AlocacaoOrdemServico setUser(User user) {
        this.user = user;
        return this;
    }
    /**
    * Obtém quantidadePrevista
    * return quantidadePrevista
    * @generated
    */
    public java.lang.Integer getQuantidadePrevista() {
        return this.quantidadePrevista;
    }

    /**
    * Define quantidadePrevista
    * @param quantidadePrevista quantidadePrevista
    * @generated
    */
    public AlocacaoOrdemServico setQuantidadePrevista(java.lang.Integer quantidadePrevista) {
        this.quantidadePrevista = quantidadePrevista;
        return this;
    }
    /**
    * Obtém quantidadeEmDiasUteisPrazo
    * return quantidadeEmDiasUteisPrazo
    * @generated
    */
    public java.lang.Integer getQuantidadeEmDiasUteisPrazo() {
        return this.quantidadeEmDiasUteisPrazo;
    }

    /**
    * Define quantidadeEmDiasUteisPrazo
    * @param quantidadeEmDiasUteisPrazo quantidadeEmDiasUteisPrazo
    * @generated
    */
    public AlocacaoOrdemServico setQuantidadeEmDiasUteisPrazo(java.lang.Integer quantidadeEmDiasUteisPrazo) {
        this.quantidadeEmDiasUteisPrazo = quantidadeEmDiasUteisPrazo;
        return this;
    }
    /**
    * Obtém dataPrevistaEntrega
    * return dataPrevistaEntrega
    * @generated
    */
    public java.util.Date getDataPrevistaEntrega() {
        return this.dataPrevistaEntrega;
    }

    /**
    * Define dataPrevistaEntrega
    * @param dataPrevistaEntrega dataPrevistaEntrega
    * @generated
    */
    public AlocacaoOrdemServico setDataPrevistaEntrega(java.util.Date dataPrevistaEntrega) {
        this.dataPrevistaEntrega = dataPrevistaEntrega;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
AlocacaoOrdemServico object = (AlocacaoOrdemServico)obj;
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
