package org.conscrypt.lite;

import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.PublicKey;

public class HpkeContextRecipient extends HpkeContext {
    private HpkeContextRecipient(HpkeSpi hpkeSpi0) {
        super(hpkeSpi0);
    }

    public static HpkeContextRecipient getInstance(String s) {
        return new HpkeContextRecipient(HpkeContextRecipient.findSpi(s));
    }

    public static HpkeContextRecipient getInstance(String s, String s1) {
        return new HpkeContextRecipient(HpkeContextRecipient.findSpi(s, s1));
    }

    public static HpkeContextRecipient getInstance(String s, Provider provider0) {
        return new HpkeContextRecipient(HpkeContextRecipient.findSpi(s, provider0));
    }

    public void init(byte[] arr_b, PrivateKey privateKey0, byte[] arr_b1) {
        this.spi.engineInitRecipient(arr_b, privateKey0, arr_b1, null, HpkeSpi.DEFAULT_PSK, HpkeSpi.DEFAULT_PSK_ID);
    }

    public void init(byte[] arr_b, PrivateKey privateKey0, byte[] arr_b1, PublicKey publicKey0) {
        if(publicKey0 == null) {
            throw new InvalidKeyException("null sender key");
        }
        this.spi.engineInitRecipient(arr_b, privateKey0, arr_b1, publicKey0, HpkeSpi.DEFAULT_PSK, HpkeSpi.DEFAULT_PSK_ID);
    }

    public void init(byte[] arr_b, PrivateKey privateKey0, byte[] arr_b1, PublicKey publicKey0, byte[] arr_b2, byte[] arr_b3) {
        if(publicKey0 == null) {
            throw new InvalidKeyException("null sender key");
        }
        this.spi.engineInitRecipient(arr_b, privateKey0, arr_b1, publicKey0, arr_b2, arr_b3);
    }

    public void init(byte[] arr_b, PrivateKey privateKey0, byte[] arr_b1, byte[] arr_b2, byte[] arr_b3) {
        this.spi.engineInitRecipient(arr_b, privateKey0, arr_b1, null, arr_b2, arr_b3);
    }

    public byte[] open(byte[] arr_b, byte[] arr_b1) {
        return this.spi.engineOpen(arr_b, arr_b1);
    }
}

