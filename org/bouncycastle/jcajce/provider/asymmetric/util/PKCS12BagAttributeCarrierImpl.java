package org.bouncycastle.jcajce.provider.asymmetric.util;

import idpa;
import idph;
import idpv;
import idqg;
import idqk;
import idvi;
import iexe;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

public class PKCS12BagAttributeCarrierImpl implements iexe {
    private Hashtable pkcs12Attributes;
    private Vector pkcs12Ordering;

    public PKCS12BagAttributeCarrierImpl() {
        this(new Hashtable(), new Vector());
    }

    public PKCS12BagAttributeCarrierImpl(Hashtable hashtable0, Vector vector0) {
        this.pkcs12Attributes = hashtable0;
        this.pkcs12Ordering = vector0;
    }

    Hashtable getAttributes() {
        return this.pkcs12Attributes;
    }

    @Override  // iexe
    public idph getBagAttribute(idqg idqg0) {
        return (idph)this.pkcs12Attributes.get(idqg0);
    }

    @Override  // iexe
    public Enumeration getBagAttributeKeys() {
        return this.pkcs12Ordering.elements();
    }

    Vector getOrdering() {
        return this.pkcs12Ordering;
    }

    @Override  // iexe
    public boolean hasFriendlyName() {
        return this.getBagAttribute(idvi.ab) != null;
    }

    public void readObject(ObjectInputStream objectInputStream0) {
        Object object0 = objectInputStream0.readObject();
        if((object0 instanceof Hashtable)) {
            this.pkcs12Attributes = (Hashtable)object0;
            this.pkcs12Ordering = (Vector)objectInputStream0.readObject();
            return;
        }
        idpv idpv0 = new idpv(((byte[])object0));
        idqg idqg0;
        while((idqg0 = (idqg)idpv0.b()) != null) {
            this.setBagAttribute(idqg0, idpv0.b());
        }
    }

    @Override  // iexe
    public void setBagAttribute(idqg idqg0, idph idph0) {
        if(this.pkcs12Attributes.containsKey(idqg0)) {
            this.pkcs12Attributes.put(idqg0, idph0);
            return;
        }
        this.pkcs12Attributes.put(idqg0, idph0);
        this.pkcs12Ordering.addElement(idqg0);
    }

    @Override  // iexe
    public void setFriendlyName(String s) {
        idpa idpa0 = new idpa(s);
        this.setBagAttribute(idvi.ab, idpa0);
    }

    int size() {
        return this.pkcs12Ordering.size();
    }

    public void writeObject(ObjectOutputStream objectOutputStream0) {
        if(this.pkcs12Ordering.size() == 0) {
            objectOutputStream0.writeObject(new Hashtable());
            objectOutputStream0.writeObject(new Vector());
            return;
        }
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        idqk idqk0 = new idqk(byteArrayOutputStream0);
        Enumeration enumeration0 = this.getBagAttributeKeys();
        while(enumeration0.hasMoreElements()) {
            idqg idqg0 = idqg.h(enumeration0.nextElement());
            idqk0.o(idqg0);
            idph idph0 = (idph)this.pkcs12Attributes.get(idqg0);
            if(idph0 == null) {
                throw new IOException("null object detected");
            }
            idqk0.r(idph0.p());
            continue;
        }
        objectOutputStream0.writeObject(byteArrayOutputStream0.toByteArray());
    }
}

