package org.bouncycastle.jcajce.provider.asymmetric.dsa;

import idqg;
import idzh;
import iebd;
import ienr;
import ieoe;
import ieof;
import ietu;
import iftq;
import iftv;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.DSAParams;
import java.security.interfaces.DSAPrivateKey;
import java.security.interfaces.DSAPublicKey;

public class DSAUtil {
    public static final idqg[] dsaOids;

    static {
        DSAUtil.dsaOids = new idqg[]{iebd.R, ietu.g, iebd.S};
    }

    static String generateKeyFingerprint(BigInteger bigInteger0, DSAParams dSAParams0) {
        return new iftv(iftq.o(bigInteger0.toByteArray(), dSAParams0.getP().toByteArray(), dSAParams0.getQ().toByteArray(), dSAParams0.getG().toByteArray())).toString();
    }

    public static ienr generatePrivateKeyParameter(PrivateKey privateKey0) {
        if((privateKey0 instanceof DSAPrivateKey)) {
            return new ieof(((DSAPrivateKey)privateKey0).getX(), new ieoe(((DSAPrivateKey)privateKey0).getParams().getP(), ((DSAPrivateKey)privateKey0).getParams().getQ(), ((DSAPrivateKey)privateKey0).getParams().getG()));
        }
        throw new InvalidKeyException("can\'t identify DSA private key.");
    }

    public static ienr generatePublicKeyParameter(PublicKey publicKey0) {
        if((publicKey0 instanceof BCDSAPublicKey)) {
            return ((BCDSAPublicKey)publicKey0).engineGetKeyParameters();
        }
        if((publicKey0 instanceof DSAPublicKey)) {
            return new BCDSAPublicKey(((DSAPublicKey)publicKey0)).engineGetKeyParameters();
        }
        try {
            return new BCDSAPublicKey(idzh.b(publicKey0.getEncoded())).engineGetKeyParameters();
        }
        catch(Exception unused_ex) {
            throw new InvalidKeyException("can\'t identify DSA public key: " + publicKey0.getClass().getName());
        }
    }

    public static boolean isDsaOid(idqg idqg0) {
        for(int v = 0; true; ++v) {
            idqg[] arr_idqg = DSAUtil.dsaOids;
            if(v == arr_idqg.length) {
                break;
            }
            if(idqg0.y(arr_idqg[v])) {
                return true;
            }
        }
        return false;
    }

    static ieoe toDSAParameters(DSAParams dSAParams0) {
        return dSAParams0 == null ? null : new ieoe(dSAParams0.getP(), dSAParams0.getQ(), dSAParams0.getG());
    }
}

