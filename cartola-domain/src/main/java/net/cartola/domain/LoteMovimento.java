package net.cartola.domain;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 05/09/2016 16:26:12
 * @author ALEXANDRE.SCAVACINI
 */
@XmlRootElement(name = "loteMovi")
@XmlAccessorType(XmlAccessType.FIELD)
public class LoteMovimento {
    private List<Movimento> mov;
//    
    public List<Movimento> getMovimentos() {
        if(this.mov == null) {
            this.mov = new ArrayList<>();
        }
        return mov;
    }
}
