package net.cartola.domain;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 02/11/2015 00:23:08
 *
 * //@author murilo
 */

public abstract class RegistroBase implements Serializable, Cloneable {

    private Date criadoEm;
    private Usuario criadoPor;
    private Date alteradoEm;
    private Usuario alteradoPor;
    private Long versao;

    public abstract Long getId();

    public abstract void setId(Long id);

    //@Column(name = "cria_em")
    //@Temporal(TemporalType.TIMESTAMP)
    public Date getCriadoEm() {
        return criadoEm;
    }

    //@Field("cria_em")
    public void setCriadoEm(Date criadoEm) {
        this.criadoEm = criadoEm;
    }

    //@ManyToOne
    //@JoinColumn(name = "cria_por_id")
    public Usuario getCriadoPor() {
        return criadoPor;
    }

    public void setCriadoPor(Usuario criadoPor) {
        this.criadoPor = criadoPor;
    }

    //@Column(name = "alte_em")
    //@Temporal(TemporalType.TIMESTAMP)
    public Date getAlteradoEm() {
        return alteradoEm;
    }

    //@Field("alte_em")
    public void setAlteradoEm(Date alteradoEm) {
        this.alteradoEm = alteradoEm;
    }

    //@ManyToOne
    //@JoinColumn(name = "alte_por_id")
    public Usuario getAlteradoPor() {
        return alteradoPor;
    }

    public void setAlteradoPor(Usuario alteradoPor) {
        this.alteradoPor = alteradoPor;
    }

    //@Version
    //@Column(name = "vers")
    public Long getVersao() {
        return versao;
    }

    //@Field("vers")
    public void setVersao(Long versao) {
        this.versao = versao;
    }

    //@Transient
    public String getDataHorarioCriadoEmString() {
        SimpleDateFormat dataFormat = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat horaFormat = new SimpleDateFormat("HH:mm");
        if (this.criadoEm == null) {
            return "";
        } else {
            return dataFormat.format(this.criadoEm) + " �s " + horaFormat.format(this.criadoEm);
        }
    }

   // @Transient
    public String getDataHorarioAlteradoEmString() {
        SimpleDateFormat dataFormat = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat horaFormat = new SimpleDateFormat("HH:mm");
        if (this.alteradoEm == null) {
            return "";
        } else {
            return dataFormat.format(this.alteradoEm) + " �s " + horaFormat.format(this.alteradoEm);
        }
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        RegistroBase o = (RegistroBase) super.clone();
        o.setId(this.getId());
        if (this.criadoPor != null) {
            o.criadoPor = this.criadoPor.clone();
        }
//        o.setCriadoPor(this.getCriadoPor());
        o.setCriadoEm(this.getCriadoEm());
        if (this.alteradoPor != null) {
            o.alteradoPor = this.alteradoPor.clone();
        }
        o.setAlteradoEm(this.getAlteradoEm());
        o.setVersao(this.getVersao());
        return o;
    }

}
