package org.bouncycastle.jcajce.provider.asymmetric.slhdsa;

import iebu;
import iepo;
import iepr;
import ifmv;
import ifmw;
import ifmx;
import ifmz;
import ifnc;
import ifnd;
import ifnh;
import ifno;
import ifnp;
import ifnq;
import ifnr;
import ifns;
import iftq;
import java.io.ByteArrayOutputStream;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.SignatureException;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseDeterministicOrRandomSignature;

public class SignatureSpi extends BaseDeterministicOrRandomSignature {
    private final ByteArrayOutputStream bOut;
    private final ifnr signer;

    protected SignatureSpi(ifnr ifnr0) {
        super("SLH-DSA");
        this.bOut = new ByteArrayOutputStream();
        this.signer = ifnr0;
    }

    @Override
    protected byte[] engineSign() {
        byte[] arr_b10;
        ifnh ifnh2;
        byte[] arr_b7;
        long v6;
        int v5;
        ifns ifns1;
        if(!(this.keyParams instanceof ifnp)) {
            throw new SignatureException("engine initialized for verification");
        }
        try {
            ifnr ifnr0 = this.signer;
            byte[] arr_b = this.bOut.toByteArray();
            ifnh ifnh0 = ifnr0.d.b.b();
            ifnh0.b(ifnr0.d.d.a);
            int v1 = ifnh0.a;
            byte[] arr_b1 = new byte[v1];
            SecureRandom secureRandom0 = ifnr0.e;
            if(secureRandom0 == null) {
                System.arraycopy(ifnr0.d.d.a, 0, arr_b1, 0, v1);
            }
            else {
                secureRandom0.nextBytes(arr_b1);
            }
            ifnp ifnp0 = ifnr0.d;
            byte[] arr_b2 = ifnr0.b;
            ifnh ifnh1 = ifnp0.b.b();
            ifnh1.b(ifnp0.d.a);
            byte[] arr_b3 = ifnh1.f(ifnp0.c.b, arr_b1, arr_b2, arr_b);
            ifmz ifmz0 = ifnh1.a(arr_b3, ifnp0.d.a, ifnp0.d.b, arr_b2, arr_b);
            long v3 = ifmz0.a;
            int v4 = ifmz0.b;
            ifmv ifmv0 = new ifmv();
            ifmv0.j(3);
            ifmv0.g(v3);
            ifmv0.e(v4);
            ifnc[] arr_ifnc = ifmw.c(ifmz0.c, ifnp0.c.a, ifnp0.d.a, ifmv0, ifnh1);
            ifmv ifmv1 = new ifmv();
            ifmv1.j(3);
            ifmv1.g(v3);
            ifmv1.e(v4);
            byte[] arr_b4 = ifmw.b(arr_ifnc, ifmz0.c, ifnp0.d.a, ifmv1, ifnh1);
            new ifmv().j(2);
            byte[] arr_b5 = ifnp0.d();
            byte[] arr_b6 = ifnp0.c();
            ifns ifns0 = new ifns(ifnh1);
            ifmv ifmv2 = new ifmv();
            ifmv2.f(ifnh1.d - 1);
            ifmv2.g(0L);
            if(arr_b5 == null) {
                ifns1 = ifns0;
                v5 = v4;
                ifnh2 = ifnh1;
                v6 = v3;
                arr_b7 = null;
            }
            else {
                ifmx.a(arr_b5, 0, ifnh1.h, arr_b6, ifmv2, ifnh1, ifns0);
                arr_b6 = arr_b6;
                ifns1 = ifns0;
                v5 = v4;
                v6 = v3;
                arr_b7 = arr_b5;
                ifnh2 = ifnh1;
            }
            byte[] arr_b8 = ifmx.e(arr_b4, v6, v5, arr_b7, arr_b6, ifnh2, ifns1);
            byte[][] arr2_b = new byte[arr_ifnc.length + 2][];
            arr2_b[0] = arr_b3;
            for(int v2 = 0; v2 != arr_ifnc.length; ++v2) {
                ifnc ifnc0 = arr_ifnc[v2];
                byte[] arr_b9 = iftq.l(ifnc0.a);
                arr2_b[v2 + 1] = iftq.m(ifnc0.b, arr_b9);
            }
            arr2_b[arr_ifnc.length + 1] = arr_b8;
            arr_b10 = iftq.l(arr2_b);
        }
        catch(Exception exception0) {
            throw new SignatureException(exception0.toString());
        }
        finally {
            this.isInitState = true;
            this.bOut.reset();
        }
        return arr_b10;
    }

    @Override
    protected boolean engineVerify(byte[] arr_b) {
        int v6;
        if(!(this.keyParams instanceof ifnq)) {
            throw new SignatureException("engine initialized for signing");
        }
        try {
            byte[] arr_b1 = this.bOut.toByteArray();
            ifnq ifnq0 = this.signer.c;
            byte[] arr_b2 = this.signer.b;
            ifnh ifnh0 = ifnq0.b.b();
            ifnh0.b(ifnq0.c());
            ifmv ifmv0 = new ifmv();
            int v1 = ifnh0.f;
            int v2 = ifnh0.e;
            int v3 = ifnh0.d;
            int v4 = ifnh0.b;
            int v5 = ifnh0.a;
            v6 = 0;
            if(((v2 + 1) * v1 + 1 + ifnh0.g + v3 * v4) * v5 == arr_b.length) {
                int v7 = ifnh0.h;
                byte[] arr_b3 = new byte[v5];
                System.arraycopy(arr_b, 0, arr_b3, 0, v5);
                ifnc[] arr_ifnc = new ifnc[v1];
                int v8 = v5;
                while(v6 != v1) {
                    byte[] arr_b4 = new byte[v5];
                    System.arraycopy(arr_b, v8, arr_b4, 0, v5);
                    v8 += v5;
                    byte[][] arr2_b = new byte[v2][];
                    int v9 = 0;
                    while(v9 != v2) {
                        byte[] arr_b5 = new byte[v5];
                        arr2_b[v9] = arr_b5;
                        System.arraycopy(arr_b, v8, arr_b5, 0, v5);
                        v8 += v5;
                        ++v9;
                        v2 = v2;
                    }
                    arr_ifnc[v6] = new ifnc(arr_b4, arr2_b);
                    ++v6;
                    ifnh0 = ifnh0;
                    v1 = v1;
                    arr_b2 = arr_b2;
                    v2 = v2;
                }
                int v10 = v4;
                ifnd[] arr_ifnd = new ifnd[v3];
                int v11 = 0;
                while(v11 != v3) {
                    int v12 = v10 * v5;
                    byte[] arr_b6 = new byte[v12];
                    int v13 = 0;
                    System.arraycopy(arr_b, v8, arr_b6, 0, v12);
                    v8 += v12;
                    byte[][] arr2_b1 = new byte[v7][];
                    while(v13 != v7) {
                        byte[] arr_b7 = new byte[v5];
                        arr2_b1[v13] = arr_b7;
                        System.arraycopy(arr_b, v8, arr_b7, 0, v5);
                        v8 += v5;
                        ++v13;
                        v10 = v10;
                        v11 = v11;
                    }
                    arr_ifnd[v11] = new ifnd(arr_b6, arr2_b1);
                    ++v11;
                    v10 = v10;
                }
                if(v8 != arr_b.length) {
                    throw new IllegalArgumentException("signature wrong length");
                }
                ifmz ifmz0 = ifnh0.a(arr_b3, ifnq0.c(), ifnq0.b(), arr_b2, arr_b1);
                ifmv0.j(3);
                ifmv0.f(0);
                ifmv0.g(ifmz0.a);
                ifmv0.e(ifmz0.b);
                byte[] arr_b8 = ifnq0.c();
                byte[] arr_b9 = ifmw.b(arr_ifnc, ifmz0.c, arr_b8, ifmv0, ifnh0);
                ifmv0.j(2);
                ifmv0.f(0);
                ifmv0.g(ifmz0.a);
                ifmv0.e(ifmz0.b);
                ifnq0.c();
                ifns ifns0 = new ifns(ifnh0);
                ifmv ifmv1 = new ifmv();
                ifmv1.f(v3 - 1);
                ifmv1.g(0L);
                byte[] arr_b10 = ifnq0.c();
                byte[] arr_b11 = ifnq0.b();
                v6 = ifmx.c(arr_b9, arr_ifnd, arr_b10, ifmz0.a, ifmz0.b, arr_b11, ifnh0, ifns0);
                return v6 != 0;
            }
        }
        finally {
            this.isInitState = true;
            this.bOut.reset();
        }
        return v6 != 0;
    }

    @Override  // org.bouncycastle.jcajce.provider.asymmetric.util.BaseDeterministicOrRandomSignature
    protected void reInitialize(boolean z, iebu iebu0) {
        ifno ifno0;
        ifnr ifnr0 = this.signer;
        if((iebu0 instanceof iepo)) {
            iebu iebu1 = ((iepo)iebu0).a;
            int v = ((iepo)iebu0).a();
            if(v > 0xFF) {
                throw new IllegalArgumentException("context too long");
            }
            ifnr0.b = new byte[v + 2];
            byte[] arr_b = ifnr0.b;
            arr_b[0] = 0;
            arr_b[1] = (byte)v;
            ((iepo)iebu0).c(arr_b, v);
            iebu0 = iebu1;
        }
        else {
            ifnr0.b = ifnr.a;
        }
        if(z) {
            ifnr0.c = null;
            if((iebu0 instanceof iepr)) {
                ifnr0.d = (ifnp)((iepr)iebu0).b;
                ifnr0.e = ((iepr)iebu0).a;
            }
            else {
                ifnr0.d = (ifnp)iebu0;
                ifnr0.e = null;
            }
            ifno0 = ifnr0.d.b;
        }
        else {
            ifnr0.c = (ifnq)iebu0;
            ifnr0.d = null;
            ifnr0.e = null;
            ifno0 = ifnr0.c.b;
        }
        if(ifno0.z != 0) {
            throw new IllegalArgumentException("\"pure\" slh-dsa must use non pre-hash parameters");
        }
        this.bOut.reset();
    }

    @Override  // org.bouncycastle.jcajce.provider.asymmetric.util.BaseDeterministicOrRandomSignature
    protected void signInit(PrivateKey privateKey0, SecureRandom secureRandom0) {
        this.appRandom = secureRandom0;
        if(!(privateKey0 instanceof BCSLHDSAPrivateKey)) {
            throw new InvalidKeyException("unknown private key passed to SLH-DSA");
        }
        this.keyParams = ((BCSLHDSAPrivateKey)privateKey0).getKeyParams();
    }

    @Override  // org.bouncycastle.jcajce.provider.asymmetric.util.BaseDeterministicOrRandomSignature
    protected void updateEngine(byte b) {
        this.bOut.write(((int)b));
    }

    @Override  // org.bouncycastle.jcajce.provider.asymmetric.util.BaseDeterministicOrRandomSignature
    protected void updateEngine(byte[] arr_b, int v, int v1) {
        this.bOut.write(arr_b, v, v1);
    }

    @Override  // org.bouncycastle.jcajce.provider.asymmetric.util.BaseDeterministicOrRandomSignature
    protected void verifyInit(PublicKey publicKey0) {
        if(!(publicKey0 instanceof BCSLHDSAPublicKey)) {
            throw new InvalidKeyException("unknown public key passed to SLH-DSA");
        }
        this.keyParams = ((BCSLHDSAPublicKey)publicKey0).getKeyParams();
    }
}

