
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
* Classe que representa a tabela ContratoItens
* @generated
*/
@jakarta.persistence.Entity
@jakarta.persistence.Table(name = "\"ContratoItens\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.ContratoItens")
@CronappTable(role=CronappTableRole.ASSOCIATION_CLASS)
public class ContratoItens implements Serializable {
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
    @CronappColumn(attributeType="STRING", label="Descricao Item")
    @Column(name = "descricaoItem", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String descricaoItem;


    /**
    * @generated
    */
    @CronappColumn(attributeType="DOUBLE", label="Valor Item", mask="#.#00,00")
    @Column(name = "valorItem", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Double valorItem;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Perc  Comissao Parceiro")
    @Column(name = "perc_ComissaoParceiro", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String perc_ComissaoParceiro;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Comissao Parceiro")
    @Column(name = "comissaoParceiro", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String comissaoParceiro;


    /**
    * @generated
    */
    @CronappColumn(attributeType="DOUBLE", label="Valor Fixo Tayta", mask="#.#00,00")
    @Column(name = "valorFixoTayta", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Double valorFixoTayta;


    /**
    * @generated
    */
    @CronappColumn(attributeType="DOUBLE", label="Valor Variavel Tayta", mask="#.#00,00")
    @Column(name = "valorVariavelTayta", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Double valorVariavelTayta;


    /**
    * @generated
    */
    @CronappColumn(attributeType="DOUBLE", label="Valor Unitario Tayta", mask="#.#00,00")
    @Column(name = "valorUnitarioTayta", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Double valorUnitarioTayta;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Conversao Metrica")
    @Column(name = "conversaoMetrica", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String conversaoMetrica;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Unidade Contratada Item")
    @Column(name = "unidadeContratadaItem", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String unidadeContratadaItem;


    /**
    * @generated
    */
    @CronappColumn(attributeType="DOUBLE", label="Valor Total Item", mask="#.#00,00")
    @Column(name = "valorTotalItem", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Double valorTotalItem;


    /**
    * @generated
    */
    @CronappColumn(attributeType="DOUBLE", label="Valor Total Item Tayta", mask="#.#00,00")
    @Column(name = "valorTotalItemTayta", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Double valorTotalItemTayta;


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_contrato", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
        
        private Contrato contrato;


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_tipoMetrica", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
        
        private TipoMetrica tipoMetrica;


    /**
    * Construtor
    * @generated
    */
    public ContratoItens(){
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
    public ContratoItens setId(java.lang.String id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém descricaoItem
    * return descricaoItem
    * @generated
    */
    public java.lang.String getDescricaoItem() {
        return this.descricaoItem;
    }

    /**
    * Define descricaoItem
    * @param descricaoItem descricaoItem
    * @generated
    */
    public ContratoItens setDescricaoItem(java.lang.String descricaoItem) {
        this.descricaoItem = descricaoItem;
        return this;
    }
    /**
    * Obtém valorItem
    * return valorItem
    * @generated
    */
    public java.lang.Double getValorItem() {
        return this.valorItem;
    }

    /**
    * Define valorItem
    * @param valorItem valorItem
    * @generated
    */
    public ContratoItens setValorItem(java.lang.Double valorItem) {
        this.valorItem = valorItem;
        return this;
    }
    /**
    * Obtém perc_ComissaoParceiro
    * return perc_ComissaoParceiro
    * @generated
    */
    public java.lang.String getPerc_ComissaoParceiro() {
        return this.perc_ComissaoParceiro;
    }

    /**
    * Define perc_ComissaoParceiro
    * @param perc_ComissaoParceiro perc_ComissaoParceiro
    * @generated
    */
    public ContratoItens setPerc_ComissaoParceiro(java.lang.String perc_ComissaoParceiro) {
        this.perc_ComissaoParceiro = perc_ComissaoParceiro;
        return this;
    }
    /**
    * Obtém comissaoParceiro
    * return comissaoParceiro
    * @generated
    */
    public java.lang.String getComissaoParceiro() {
        return this.comissaoParceiro;
    }

    /**
    * Define comissaoParceiro
    * @param comissaoParceiro comissaoParceiro
    * @generated
    */
    public ContratoItens setComissaoParceiro(java.lang.String comissaoParceiro) {
        this.comissaoParceiro = comissaoParceiro;
        return this;
    }
    /**
    * Obtém valorFixoTayta
    * return valorFixoTayta
    * @generated
    */
    public java.lang.Double getValorFixoTayta() {
        return this.valorFixoTayta;
    }

    /**
    * Define valorFixoTayta
    * @param valorFixoTayta valorFixoTayta
    * @generated
    */
    public ContratoItens setValorFixoTayta(java.lang.Double valorFixoTayta) {
        this.valorFixoTayta = valorFixoTayta;
        return this;
    }
    /**
    * Obtém valorVariavelTayta
    * return valorVariavelTayta
    * @generated
    */
    public java.lang.Double getValorVariavelTayta() {
        return this.valorVariavelTayta;
    }

    /**
    * Define valorVariavelTayta
    * @param valorVariavelTayta valorVariavelTayta
    * @generated
    */
    public ContratoItens setValorVariavelTayta(java.lang.Double valorVariavelTayta) {
        this.valorVariavelTayta = valorVariavelTayta;
        return this;
    }
    /**
    * Obtém valorUnitarioTayta
    * return valorUnitarioTayta
    * @generated
    */
    public java.lang.Double getValorUnitarioTayta() {
        return this.valorUnitarioTayta;
    }

    /**
    * Define valorUnitarioTayta
    * @param valorUnitarioTayta valorUnitarioTayta
    * @generated
    */
    public ContratoItens setValorUnitarioTayta(java.lang.Double valorUnitarioTayta) {
        this.valorUnitarioTayta = valorUnitarioTayta;
        return this;
    }
    /**
    * Obtém conversaoMetrica
    * return conversaoMetrica
    * @generated
    */
    public java.lang.String getConversaoMetrica() {
        return this.conversaoMetrica;
    }

    /**
    * Define conversaoMetrica
    * @param conversaoMetrica conversaoMetrica
    * @generated
    */
    public ContratoItens setConversaoMetrica(java.lang.String conversaoMetrica) {
        this.conversaoMetrica = conversaoMetrica;
        return this;
    }
    /**
    * Obtém unidadeContratadaItem
    * return unidadeContratadaItem
    * @generated
    */
    public java.lang.String getUnidadeContratadaItem() {
        return this.unidadeContratadaItem;
    }

    /**
    * Define unidadeContratadaItem
    * @param unidadeContratadaItem unidadeContratadaItem
    * @generated
    */
    public ContratoItens setUnidadeContratadaItem(java.lang.String unidadeContratadaItem) {
        this.unidadeContratadaItem = unidadeContratadaItem;
        return this;
    }
    /**
    * Obtém valorTotalItem
    * return valorTotalItem
    * @generated
    */
    public java.lang.Double getValorTotalItem() {
        return this.valorTotalItem;
    }

    /**
    * Define valorTotalItem
    * @param valorTotalItem valorTotalItem
    * @generated
    */
    public ContratoItens setValorTotalItem(java.lang.Double valorTotalItem) {
        this.valorTotalItem = valorTotalItem;
        return this;
    }
    /**
    * Obtém valorTotalItemTayta
    * return valorTotalItemTayta
    * @generated
    */
    public java.lang.Double getValorTotalItemTayta() {
        return this.valorTotalItemTayta;
    }

    /**
    * Define valorTotalItemTayta
    * @param valorTotalItemTayta valorTotalItemTayta
    * @generated
    */
    public ContratoItens setValorTotalItemTayta(java.lang.Double valorTotalItemTayta) {
        this.valorTotalItemTayta = valorTotalItemTayta;
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
    public ContratoItens setContrato(Contrato contrato) {
        this.contrato = contrato;
        return this;
    }
    /**
    * Obtém tipoMetrica
    * return tipoMetrica
    * @generated
    */
    public TipoMetrica getTipoMetrica() {
        return this.tipoMetrica;
    }

    /**
    * Define tipoMetrica
    * @param tipoMetrica tipoMetrica
    * @generated
    */
    public ContratoItens setTipoMetrica(TipoMetrica tipoMetrica) {
        this.tipoMetrica = tipoMetrica;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
ContratoItens object = (ContratoItens)obj;
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
