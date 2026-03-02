package org.bouncycastle.jcajce.provider.asymmetric.ecgost12;

import idvi;
import idzh;
import idzs;
import iecf;
import iecl;
import ieee;
import ienr;
import ieon;
import iepr;
import ieqs;
import iewr;
import iewt;
import iexi;
import java.math.BigInteger;
import java.security.AlgorithmParameters;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.SignatureSpi;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;

public class ECGOST2012SignatureSpi512 extends SignatureSpi implements idvi, idzs {
    private iecl digest;
    private int halfSize;
    private iecf signer;
    private int size;

    public ECGOST2012SignatureSpi512() {
        this.size = 0x80;
        this.halfSize = 0x40;
        this.digest = new ieee();
        this.signer = new ieqs();
    }

    @Override
    protected Object engineGetParameter(String s) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    @Override
    protected AlgorithmParameters engineGetParameters() {
        return null;
    }

    @Override
    protected void engineInitSign(PrivateKey privateKey0) {
        if(!(privateKey0 instanceof iewr)) {
            throw new InvalidKeyException("cannot recognise key type in ECGOST-2012-512 signer");
        }
        ienr ienr0 = ECUtil.generatePrivateKeyParameter(privateKey0);
        if(((ieon)ienr0).b.c.bitLength() < 505) {
            throw new InvalidKeyException("key too weak for ECGOST-2012-512");
        }
        this.digest.reset();
        if(this.appRandom != null) {
            this.signer.a(true, new iepr(ienr0, this.appRandom));
            return;
        }
        this.signer.a(true, ienr0);
    }

    @Override
    protected void engineInitVerify(PublicKey publicKey0) {
        ienr ienr0;
        if((publicKey0 instanceof iewt)) {
            ienr0 = ECGOST2012SignatureSpi512.generatePublicKeyParameter(publicKey0);
        }
        else {
            try {
                ienr0 = ECUtil.generatePublicKeyParameter(iexi.c(idzh.b(publicKey0.getEncoded())));
            }
            catch(Exception unused_ex) {
                throw new InvalidKeyException("cannot recognise key type in ECGOST-2012-512 signer");
            }
        }
        if(((ieon)ienr0).b.c.bitLength() < 505) {
            throw new InvalidKeyException("key too weak for ECGOST-2012-512");
        }
        this.digest.reset();
        this.signer.a(false, ienr0);
    }

    @Override
    protected void engineSetParameter(String s, Object object0) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    @Override
    protected void engineSetParameter(AlgorithmParameterSpec algorithmParameterSpec0) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    @Override
    protected byte[] engineSign() {
        byte[] arr_b = new byte[this.digest.getDigestSize()];
        this.digest.doFinal(arr_b, 0);
        try {
            byte[] arr_b1 = new byte[this.size];
            BigInteger[] arr_bigInteger = this.signer.c(arr_b);
            byte[] arr_b2 = arr_bigInteger[0].toByteArray();
            byte[] arr_b3 = arr_bigInteger[1].toByteArray();
            if(arr_b3[0] == 0) {
                System.arraycopy(arr_b3, 1, arr_b1, this.halfSize - (arr_b3.length - 1), arr_b3.length - 1);
            }
            else {
                System.arraycopy(arr_b3, 0, arr_b1, this.halfSize - arr_b3.length, arr_b3.length);
            }
            if(arr_b2[0] != 0) {
                System.arraycopy(arr_b2, 0, arr_b1, this.size - arr_b2.length, arr_b2.length);
                return arr_b1;
            }
            System.arraycopy(arr_b2, 1, arr_b1, this.size - (arr_b2.length - 1), arr_b2.length - 1);
            return arr_b1;
        }
        catch(Exception exception0) {
            throw new SignatureException(exception0.toString());
        }
    }

    @Override
    protected void engineUpdate(byte b) {
        this.digest.update(b);
    }

    @Override
    protected void engineUpdate(byte[] arr_b, int v, int v1) {
        this.digest.update(arr_b, v, v1);
    }

    @Override
    protected boolean engineVerify(byte[] arr_b) {
        byte[] arr_b1 = new byte[this.digest.getDigestSize()];
        this.digest.doFinal(arr_b1, 0);
        try {
            int v = this.halfSize;
            byte[] arr_b2 = new byte[v];
            byte[] arr_b3 = new byte[v];
            System.arraycopy(arr_b, 0, arr_b3, 0, v);
            System.arraycopy(arr_b, this.halfSize, arr_b2, 0, this.halfSize);
            BigInteger bigInteger0 = new BigInteger(1, arr_b2);
            BigInteger bigInteger1 = new BigInteger(1, arr_b3);
            return this.signer.b(arr_b1, bigInteger0, bigInteger1);
        }
        catch(Exception unused_ex) {
            throw new SignatureException("error decoding signature bytes.");
        }
    }

    static ienr generatePublicKeyParameter(PublicKey publicKey0) {
        return (publicKey0 instanceof BCECGOST3410_2012PublicKey) ? ((BCECGOST3410_2012PublicKey)publicKey0).engineGetKeyParameters() : ECUtil.generatePublicKeyParameter(publicKey0);
    }
}

