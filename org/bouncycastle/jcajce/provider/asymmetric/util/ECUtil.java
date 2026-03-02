package org.bouncycastle.jcajce.provider.asymmetric.util;

import idqg;
import idte;
import iduc;
import idul;
import iduq;
import idvk;
import idxb;
import idxr;
import idzh;
import idzv;
import ieau;
import ieav;
import ieax;
import iegv;
import ienr;
import ieok;
import ieoo;
import ieop;
import ieoq;
import iews;
import iewt;
import iexi;
import iexp;
import iexr;
import iezc;
import iezd;
import iftq;
import iftv;
import ifuf;
import java.math.BigInteger;
import java.security.AccessController;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Enumeration;
import java.util.Vector;
import org.bouncycastle.jcajce.provider.config.ProviderConfiguration;

public class ECUtil {
    static int[] convertMidTerms(int[] arr_v) {
        int[] arr_v1 = new int[3];
        if(arr_v.length == 1) {
            arr_v1[0] = arr_v[0];
            return arr_v1;
        }
        if(arr_v.length != 3) {
            throw new IllegalArgumentException("Only Trinomials and pentanomials supported");
        }
        int v = arr_v[0];
        int v1 = arr_v[1];
        if(v < v1) {
            int v2 = arr_v[2];
            if(v < v2) {
                arr_v1[0] = v;
                if(v1 < v2) {
                    arr_v1[1] = v1;
                    arr_v1[2] = v2;
                    return arr_v1;
                }
                arr_v1[1] = v2;
                arr_v1[2] = arr_v[1];
                return arr_v1;
            }
        }
        int v3 = arr_v[2];
        if(v1 < v3) {
            arr_v1[0] = v1;
            int v4 = arr_v[0];
            if(v4 < v3) {
                arr_v1[1] = v4;
                arr_v1[2] = v3;
                return arr_v1;
            }
            arr_v1[1] = v3;
            arr_v1[2] = v4;
            return arr_v1;
        }
        arr_v1[0] = v3;
        int v5 = arr_v[0];
        if(v5 < v1) {
            arr_v1[1] = v5;
            arr_v1[2] = arr_v[1];
            return arr_v1;
        }
        arr_v1[1] = v1;
        arr_v1[2] = v5;
        return arr_v1;
    }

    public static String generateKeyFingerprint(iezc iezc0, iexr iexr0) {
        return iexr0.b == null ? new iftv(iezc0.H(false)).toString() : new iftv(iftq.o(iezc0.H(false), iexr0.b.e.z(), iexr0.b.f.z(), iexr0.d.H(false))).toString();
    }

    public static ienr generatePrivateKeyParameter(PrivateKey privateKey0) {
        if((privateKey0 instanceof iews)) {
            iexr iexr0 = ((iews)privateKey0).getParameters();
            if(iexr0 == null) {
                iexr0 = iexi.b.getEcImplicitlyCa();
            }
            if((((iews)privateKey0).getParameters() instanceof iexp)) {
                String s = ((iexp)((iews)privateKey0).getParameters()).a;
                return new ieop(((iews)privateKey0).getD(), new ieoo(idzv.b(s), iexr0.b, iexr0.d, iexr0.e, iexr0.f, iexr0.c));
            }
            return new ieop(((iews)privateKey0).getD(), new ieok(iexr0.b, iexr0.d, iexr0.e, iexr0.f, iexr0.c));
        }
        if((privateKey0 instanceof ECPrivateKey)) {
            iexr iexr1 = EC5Util.convertSpec(((ECPrivateKey)privateKey0).getParams());
            return new ieop(((ECPrivateKey)privateKey0).getS(), new ieok(iexr1.b, iexr1.d, iexr1.e, iexr1.f, iexr1.c));
        }
        try {
            byte[] arr_b = privateKey0.getEncoded();
            if(arr_b == null) {
                throw new InvalidKeyException("no encoding for EC private key");
            }
            PrivateKey privateKey1 = iexi.a(idvk.d(arr_b));
            if((privateKey1 instanceof ECPrivateKey)) {
                return ECUtil.generatePrivateKeyParameter(privateKey1);
            }
        }
        catch(Exception exception0) {
            throw new InvalidKeyException("cannot identify EC private key: " + exception0.toString());
        }
        throw new InvalidKeyException("can\'t identify EC private key.");
    }

    public static ienr generatePublicKeyParameter(PublicKey publicKey0) {
        if((publicKey0 instanceof iewt)) {
            iexr iexr0 = ((iewt)publicKey0).getParameters();
            return new ieoq(((iewt)publicKey0).getQ(), new ieok(iexr0.b, iexr0.d, iexr0.e, iexr0.f, iexr0.c));
        }
        if((publicKey0 instanceof ECPublicKey)) {
            iexr iexr1 = EC5Util.convertSpec(((ECPublicKey)publicKey0).getParams());
            return new ieoq(EC5Util.convertPoint(((ECPublicKey)publicKey0).getParams(), ((ECPublicKey)publicKey0).getW()), new ieok(iexr1.b, iexr1.d, iexr1.e, iexr1.f, iexr1.c));
        }
        try {
            byte[] arr_b = publicKey0.getEncoded();
            if(arr_b == null) {
                throw new InvalidKeyException("no encoding for EC public key");
            }
            PublicKey publicKey1 = iexi.c(idzh.b(arr_b));
            if((publicKey1 instanceof ECPublicKey)) {
                return ECUtil.generatePublicKeyParameter(publicKey1);
            }
        }
        catch(Exception exception0) {
            throw new InvalidKeyException("cannot identify EC public key: " + exception0.toString());
        }
        throw new InvalidKeyException("cannot identify EC public key.");
    }

    public static String getCurveName(idqg idqg0) {
        return idzv.a(idqg0);
    }

    public static ieok getDomainParameters(ProviderConfiguration providerConfiguration0, ieav ieav0) {
        if(ieav0.c()) {
            idqg idqg0 = idqg.h(ieav0.a);
            ieax ieax0 = ECUtil.getNamedCurveByOid(idqg0);
            if(ieax0 == null) {
                ieax0 = (ieax)providerConfiguration0.getAdditionalECParameters().get(idqg0);
            }
            return new ieoo(idqg0, ieax0);
        }
        if(ieav0.b()) {
            iexr iexr0 = providerConfiguration0.getEcImplicitlyCa();
            return new ieok(iexr0.b, iexr0.d, iexr0.e, iexr0.f, iexr0.c);
        }
        ieax ieax1 = ieax.a(ieav0.a);
        return new ieok(ieax1.b(), ieax1.c(), ieax1.a, ieax1.b, ieax1.d());
    }

    public static ieok getDomainParameters(ProviderConfiguration providerConfiguration0, iexr iexr0) {
        if((iexr0 instanceof iexp)) {
            return new ieoo(ECUtil.getNamedCurveOid(((iexp)iexr0).a), ((iexp)iexr0).b, ((iexp)iexr0).d, ((iexp)iexr0).e, ((iexp)iexr0).f, ((iexp)iexr0).c);
        }
        if(iexr0 == null) {
            iexr iexr1 = providerConfiguration0.getEcImplicitlyCa();
            return new ieok(iexr1.b, iexr1.d, iexr1.e, iexr1.f, iexr1.c);
        }
        return new ieok(iexr0.b, iexr0.d, iexr0.e, iexr0.f, iexr0.c);
    }

    public static String getNameFrom(AlgorithmParameterSpec algorithmParameterSpec0) {
        return (String)AccessController.doPrivileged(new ECUtil.1(algorithmParameterSpec0));
    }

    public static ieax getNamedCurveByName(String s) {
        ieax ieax0 = iegv.b(s);
        return ieax0 == null ? idzv.c(s) : ieax0;
    }

    public static ieax getNamedCurveByOid(idqg idqg0) {
        ieax ieax0 = iegv.c(idqg0);
        return ieax0 == null ? idzv.d(idqg0) : ieax0;
    }

    public static idqg getNamedCurveOid(iexr iexr0) {
        Vector vector0 = new Vector();
        idzv.e(vector0, ieau.x.keys());
        idzv.e(vector0, idxb.J.elements());
        idzv.e(vector0, iduq.a.keys());
        idzv.e(vector0, idxr.q.elements());
        idzv.e(vector0, idte.d.elements());
        idzv.e(vector0, iduc.j.elements());
        idzv.e(vector0, idul.e.elements());
        Enumeration enumeration0 = vector0.elements();
        while(enumeration0.hasMoreElements()) {
            String s = (String)enumeration0.nextElement();
            ieax ieax0 = idzv.c(s);
            if(ieax0.a.equals(iexr0.e) && ieax0.b.equals(iexr0.f) && ieax0.b().x(iexr0.b) && ieax0.c().C(iexr0.d)) {
                return idzv.b(s);
            }
        }
        return null;
    }

    public static idqg getNamedCurveOid(String s) {
        if(s != null) {
            String s1 = s.trim();
            if(s1.length() != 0) {
                int v = s1.indexOf(0x20);
                if(v > 0) {
                    s1 = s1.substring(v + 1);
                }
                idqg idqg0 = ECUtil.getOID(s1);
                return idqg0 == null ? idzv.b(s1) : idqg0;
            }
        }
        return null;
    }

    private static idqg getOID(String s) {
        int v = s.charAt(0);
        if(v >= 0x30 && v <= 50) {
            try {
                return new idqg(s);
            }
            catch(Exception unused_ex) {
            }
        }
        return null;
    }

    public static int getOrderBitLength(ProviderConfiguration providerConfiguration0, BigInteger bigInteger0, BigInteger bigInteger1) {
        if(bigInteger0 == null) {
            if(providerConfiguration0 == null) {
                return bigInteger1.bitLength();
            }
            iexr iexr0 = providerConfiguration0.getEcImplicitlyCa();
            return iexr0 == null ? bigInteger1.bitLength() : iexr0.e.bitLength();
        }
        return bigInteger0.bitLength();
    }

    public static String privateKeyToString(String s, BigInteger bigInteger0, iexr iexr0) {
        String s1 = ifuf.a;
        iezc iezc0 = new iezd().a(iexr0.d, bigInteger0).z();
        return s + " Private Key [" + ECUtil.generateKeyFingerprint(iezc0, iexr0) + "]" + s1 + "            X: " + iezc0.u().f().toString(16) + s1 + "            Y: " + iezc0.v().f().toString(16) + s1;
    }

    public static String publicKeyToString(String s, iezc iezc0, iexr iexr0) {
        String s1 = ifuf.a;
        return s + " Public Key [" + ECUtil.generateKeyFingerprint(iezc0, iexr0) + "]" + s1 + "            X: " + iezc0.u().f().toString(16) + s1 + "            Y: " + iezc0.v().f().toString(16) + s1;
    }
}

