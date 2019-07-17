package net.cartola.domain;

 import java.io.Serializable;
 import java.util.Objects;

 //javax.persistence.Basic;
//  //javax.persistence.Column;
 //javax.persistence.Entity;
 //javax.persistence.EnumType;
 //javax.persistence.Enumerated;
 //javax.persistence.GeneratedValue;
 //javax.persistence.GenerationType;
 //javax.persistence.Id;
 //javax.persistence.JoinColumn;
 //javax.persistence.ManyToOne;
 //javax.persistence.NamedQueries;
 //javax.persistence.NamedQuery;
 //javax.persistence.SequenceGenerator;
 //javax.persistence.Table;
 //javax.persistence.Transient;
 //javax.validation.constraints.Pattern;
 //javax.xml.bind.annotation.XmlRootElement;

//////@Entity
//@Table(name = "pess_ende")
//@XmlRootElement
//@NamedQueries({
    //@NamedQuery(name = "PessoaEndereco.findAll", query = "SELECT c FROM PessoaEndereco c"),
    //@NamedQuery(name = "PessoaEndereco.findByPessoaEnderecoId", query = "SELECT c FROM PessoaEndereco c WHERE c.id = :id"),
    //@NamedQuery(name = "PessoaEndereco.findByPessoaEnderecoTipo", query = "SELECT c FROM PessoaEndereco c WHERE c.pessoaEnderecoTipo = :pessoaEnderecoTipo"),
    //@NamedQuery(name = "PessoaEndereco.findByCep", query = "SELECT c FROM PessoaEndereco c WHERE c.cep = :cep"),
    //@NamedQuery(name = "PessoaEndereco.findByLogradouro", query = "SELECT c FROM PessoaEndereco c WHERE c.logradouro = :logradouro"),
    //@NamedQuery(name = "PessoaEndereco.findByNumero", query = "SELECT c FROM PessoaEndereco c WHERE c.numero = :numero"),
    //@NamedQuery(name = "PessoaEndereco.findByComplemento", query = "SELECT c FROM PessoaEndereco c WHERE c.complemento = :complemento"),
    //@NamedQuery(name = "PessoaEndereco.findByBairro", query = "SELECT c FROM PessoaEndereco c WHERE c.bairro = :bairro"),
    //@NamedQuery(name = "PessoaEndereco.findByCaixaPostal", query = "SELECT c FROM PessoaEndereco c WHERE c.caixaPostal = :caixaPostal"),
    //@NamedQuery(name = "PessoaEndereco.findByObs", query = "SELECT c FROM PessoaEndereco c WHERE c.obs = :obs")//})
//@Audited //Hibernate Envers
public class PessoaEndereco extends RegistroBase implements Serializable {

    private static final long serialVersionUID = 55912111L;
    private Long id;
    private Pessoa pessoa;
    private PessoaEnderecoTipo pessoaEnderecoTipo = PessoaEnderecoTipo.PRINCIPAL;
    private String cep;
    private String logradouro;
    private Integer numero;
    private String complemento;
    private String bairro;
    private Cidade cidade;
    private String caixaPostal;
    private String obs;
    private double latitude;
    private double longitude;
    /**
     * @see https://developers.google.com/maps/articles/phpsqlsearch_v3
     * Here's the SQL statement that will find the closest 20 locations that are within a radius of 25 miles to the 37, -122 coordinate. It calculates the distance based on the latitude/longitude of that row and the target latitude/longitude, and then asks for only rows where the distance value is less than 25, orders the whole query by distance, and limits it to 20 results. To search by kilometers instead of miles, replace 3959 with 6371.
     * SELECT CODIGO, ( 3959 * acos( cos( radians(37) ) * cos( radians( lat ) ) * cos( radians( lng ) - radians(-122) ) + sin( radians(37) ) * sin( radians( lat ) ) ) ) AS distance FROM markers HAVING distance < 25 ORDER BY distance LIMIT 0 , 20;
     */

    

    //@Id
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_pessoa_endereco_id")
   // @SequenceGenerator(name = "seq_pessoa_endereco_id", sequenceName = "seq_pessoa_endereco_id", allocationSize = 1)
    //@Column(name = "pessoa_endereco_id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    //@ManyToOne(optional = false)
    //@JoinColumn(name = "pess_id", referencedColumnName = "pess_id", nullable = false)
    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

//    ////@NotNull
    //@Enumerated(EnumType.STRING)
    ////@Column(name = "endereco_tipo", nullable = false//,//columnDefinition = "enum('PRINCIPAL','FATURAMENTO','FINANCEIRO','ENTREGA') NOT NULL")
    //@Column(name = "ende_tipo", nullable = false, length = 12, 
    ////columnDefinition = "character varying(12) default 'PRINCIPAL'")
    public PessoaEnderecoTipo getPessoaEnderecoTipo() {
        return pessoaEnderecoTipo;
    }

    public void setPessoaEnderecoTipo(PessoaEnderecoTipo enderecoTipo) {
        this.pessoaEnderecoTipo = enderecoTipo;
    }
    
    //@Transient
    public String getPessoaEnderecoTipoString() {
        switch (this.pessoaEnderecoTipo) {
            case PRINCIPAL:
                return "Principal";
            case FATURAMENTO:
                return "Faturamento";
            case FINANCEIRO:
                return "Financeiro";
            case ENTREGA:
                return "Entrega";
            default:
                return "-";
        }
    }

    //@ManyToOne(optional = false)
    //@JoinColumn(name = "cida_id", referencedColumnName = "cida_id", nullable = false)
    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    //@Column(name = "cep", length = 9)
    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    //@Basic(optional = false)
//    @Pattern(regexp = "[^0-9]*", message = "O logradouro nao deve conter numero, utilize algarismos romanos")
    //@Column(name = "logr", nullable = false, length = 255)
    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    //@Column(name = "nume", length = 10)
    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    //@Column(name="comp", length = 255)
    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    //@Column(name="bair", length = 255)
    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

//    //@Size(max = 30)
    //@Column(name = "caix_post", length = 30)
    public String getCaixaPostal() {
        return caixaPostal;
    }

    public void setCaixaPostal(String caixaPostal) {
        this.caixaPostal = caixaPostal;
    }

    //@Column(name = "obs", length = 255)
    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

//    //@Column(name = "lati", scale = 2, precision = 7)
//    public double getLatitude() {
//        return latitude;
//    } 
//
//    public void setLatitude(double latitude) {
//        this.latitude = latitude;
//    }
//
//    //@Column(name = "long", scale = 2, precision = 7)
//    public double getLongitude() {
//        return longitude;
//    }
//
//    public void setLongitude(double longitude) {
//        this.longitude = longitude;
//    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
    
    private String valor(String string){
    	if(string.equals(null)){
    		return "-";
    	}
    	
    	if(string.equals("")){
    		return "-";
    	}
    	
    	return string;
    	
    }
    
    //@Transient
    public String getEnderecoCompleto() {
    	
    	return valor(numero.toString())+", "+valor(logradouro)+", "
    	+valor(bairro)+", "+valor(cidade.getNome())+"/"+valor(cidade.getEstado().getSigla())+", "+
    			valor(cep)+", "+valor(complemento);
    	
    }
    
    //@Transient
    public String getEnderecoParcial() {
    	if( this.numero != null && this.logradouro != null && this.cidade != null){
    		return logradouro+" n."+numero+" "+cidade.getNome()+"/"+cidade.getEstado().getSigla();
    	}
    	
    	if( this.numero != null && this.logradouro != null){
    		return logradouro+" n."+numero;
    	}
    	
    	if (this.logradouro != null) {
    		return logradouro;
    	} else {
    		return "";
    	}
    }
    
    @Override
    public boolean equals(Object object) {
        if (!(object instanceof PessoaEndereco)) {
            return false;
        }
        PessoaEndereco other = (PessoaEndereco) object;
            if(this.id == null && other.id == null){
            return super.equals(other);
        } else
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.id);
        return hash;
    }

//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) {
//            return true;
//        }
//        if (obj == null) {
//            return false;
//        }
//        if (getClass() != obj.getClass()) {
//            return false;
//        }
//        final PessoaEndereco other = (PessoaEndereco) obj;
//        if (!Objects.equals(this.logradouro, other.logradouro)) {
//            return false;
//        }
//        if (!Objects.equals(this.id, other.id)) {
//            return false;
//        }
//        if (!Objects.equals(this.pessoa, other.pessoa)) {
//            return false;
//        }
//        if (this.pessoaEnderecoTipo != other.pessoaEnderecoTipo) {
//            return false;
//        }
//        if (!Objects.equals(this.numero, other.numero)) {
//            return false;
//        }
//        if (!Objects.equals(this.cidade, other.cidade)) {
//            return false;
//        }
//        if (!Objects.equals(this.cep, other.cep)) {
//            return false;
//        }
//        return true;
//    }

    @Override
    public String toString() {
        return "PessoaEndereco[ id=" + id + ", logradouro=\"" + logradouro + "\", " + this.numero + " ]";
    }
    
    @Override
    public PessoaEndereco clone() throws CloneNotSupportedException {
        PessoaEndereco clone = (PessoaEndereco) super.clone();
        clone.pessoaEnderecoTipo = this.pessoaEnderecoTipo;
        clone.cep = this.cep;
        clone.logradouro = this.logradouro;
        clone.numero = this.numero;
        clone.complemento = this.complemento;
        clone.bairro = this.bairro;
        clone.cidade = this.cidade.clone();
        clone.caixaPostal = this.caixaPostal;
        clone.obs = this.obs;
        return clone;
    }

}