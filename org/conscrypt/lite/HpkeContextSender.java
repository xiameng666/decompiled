package org.conscrypt.lite;

import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.PublicKey;

public class HpkeContextSender extends HpkeContext {
    private HpkeContextSender(HpkeSpi hpkeSpi0) {
        super(hpkeSpi0);
    }

    public byte[] getEncapsulated() {
        return this.spi.getEncapsulated();
    }

    public static HpkeContextSender getInstance(String s) {
        return new HpkeContextSender(HpkeContextSender.findSpi(s));
    }

    public static HpkeContextSender getInstance(String s, String s1) {
        return new HpkeContextSender(HpkeContextSender.findSpi(s, s1));
    }

    public static HpkeContextSender getInstance(String s, Provider provider0) {
        return new HpkeContextSender(HpkeContextSender.findSpi(s, provider0));
    }

    public void init(PublicKey publicKey0, byte[] arr_b) {
        this.spi.engineInitSender(publicKey0, arr_b, null, HpkeSpi.DEFAULT_PSK, HpkeSpi.DEFAULT_PSK_ID);
    }

    public void init(PublicKey publicKey0, byte[] arr_b, PrivateKey privateKey0) {
        if(privateKey0 == null) {
            throw new InvalidKeyException("Sender private key is null");
        }
        this.spi.engineInitSender(publicKey0, arr_b, privateKey0, HpkeSpi.DEFAULT_PSK, HpkeSpi.DEFAULT_PSK_ID);
    }

    public void init(PublicKey publicKey0, byte[] arr_b, PrivateKey privateKey0, byte[] arr_b1, byte[] arr_b2) {
        if(privateKey0 == null) {
            throw new InvalidKeyException("Sender private key is null");
        }
        this.spi.engineInitSender(publicKey0, arr_b, privateKey0, arr_b1, arr_b2);
    }

    public void init(PublicKey publicKey0, byte[] arr_b, byte[] arr_b1, byte[] arr_b2) {
        this.spi.engineInitSender(publicKey0, arr_b, null, arr_b1, arr_b2);
    }

    public void initForTesting(PublicKey publicKey0, byte[] arr_b, byte[] arr_b1) {
        if(arr_b1 == null) {
            throw new IllegalArgumentException("null seed");
        }
        this.spi.engineInitSenderForTesting(publicKey0, arr_b, null, HpkeSpi.DEFAULT_PSK, HpkeSpi.DEFAULT_PSK, arr_b1);
    }

    public byte[] seal(byte[] arr_b, byte[] arr_b1) {
        return this.spi.engineSeal(arr_b, arr_b1);
    }
}

