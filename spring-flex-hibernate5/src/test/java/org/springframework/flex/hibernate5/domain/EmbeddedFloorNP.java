package org.springframework.flex.hibernate5.domain;

import javax.persistence.Embeddable;

@Embeddable
public class EmbeddedFloorNP {

    public Integer units;

    public EmbeddedFloorAttributesNP embeddedFloorAttributes;
}
