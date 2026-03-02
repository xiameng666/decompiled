package org.bouncycastle.jcajce.provider.keystore.pkcs12;

import ifuf;
import java.util.Enumeration;
import java.util.Hashtable;

class PKCS12KeyStoreSpi.IgnoresCaseHashtable {
    private Hashtable keys;
    private Hashtable orig;

    static Hashtable -$$Nest$fgetkeys(PKCS12KeyStoreSpi.IgnoresCaseHashtable pKCS12KeyStoreSpi$IgnoresCaseHashtable0) {
        return pKCS12KeyStoreSpi$IgnoresCaseHashtable0.keys;
    }

    private PKCS12KeyStoreSpi.IgnoresCaseHashtable() {
        this.orig = new Hashtable();
        this.keys = new Hashtable();
    }

    public PKCS12KeyStoreSpi.IgnoresCaseHashtable(PKCS12KeyStoreSpi-IA pKCS12KeyStoreSpi-IA0) {
    }

    public Enumeration elements() {
        return this.orig.elements();
    }

    public Object get(String s) {
        String s1 = (String)this.keys.get((s == null ? null : ifuf.b(s)));
        return s1 == null ? null : this.orig.get(s1);
    }

    public Enumeration keys() {
        return new Hashtable(this.orig).keys();
    }

    public void put(String s, Object object0) {
        String s1 = s == null ? null : ifuf.b(s);
        String s2 = (String)this.keys.get(s1);
        if(s2 != null) {
            this.orig.remove(s2);
        }
        this.keys.put(s1, s);
        this.orig.put(s, object0);
    }

    public Object remove(String s) {
        String s1 = (String)this.keys.remove((s == null ? null : ifuf.b(s)));
        return s1 == null ? null : this.orig.remove(s1);
    }

    public int size() {
        return this.orig.size();
    }
}

