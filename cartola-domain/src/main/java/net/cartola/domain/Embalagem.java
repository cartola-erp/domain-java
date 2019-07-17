package net.cartola.domain;


/**
 * 11/05/2016 16:09:26
 * //@author murilo
 */
//@Entity
//@Cacheable(true)
//@Table(name = "emba")
//@XmlRootElement
//@NamedQueries({//@NamedQuery(name = "Embalagem.findAll", query = "SELECT e FROM Embalagem e")})
public class Embalagem extends RegistroBase {

    private static final long serialVersionUID = 310273283418231L;
    private Long id;
    private String descricao;
    
    //@Id
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_emba_id")
    //@SequenceGenerator(name = "seq_emba_id", sequenceName = "seq_emba_id", allocationSize = 1)
    //@Column(name = "emba_id")
    //@Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    //@Column(name = "dscr", nullable = false)
    //@NotNull(message = "� necess�rio informar a descri��o")
    //@Size(min=2,max=255, message = "tamanho da descri��o deve conter entre 2 e 255")
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
