package net.cartola.domain;

import javax.xml.bind.annotation.XmlRegistry;

/**
 * 01/09/2016 23:22:59
 * @author murilo
 */
@XmlRegistry
public class ObjectFactory {
    
    public LoteMovimento createLoteMovimento() {        
        return new LoteMovimento();
    }
    
    public Movimento createMovimento() {
        return new Movimento();
    }

}
