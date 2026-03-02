package org.bouncycastle.jcajce.provider.digest;

import iecl;
import java.security.DigestException;
import java.security.MessageDigest;

public class BCMessageDigest extends MessageDigest {
    protected iecl digest;
    protected int digestSize;

    protected BCMessageDigest(iecl iecl0) {
        super(iecl0.getAlgorithmName());
        this.digest = iecl0;
        this.digestSize = iecl0.getDigestSize();
    }

    @Override
    public int engineDigest(byte[] arr_b, int v, int v1) {
        int v2 = this.digestSize;
        if(v1 < v2) {
            throw new DigestException("partial digests not returned");
        }
        if(arr_b.length - v < v2) {
            throw new DigestException("insufficient space in the output buffer to store the digest");
        }
        this.digest.doFinal(arr_b, v);
        return this.digestSize;
    }

    @Override
    public byte[] engineDigest() {
        byte[] arr_b = new byte[this.digestSize];
        this.digest.doFinal(arr_b, 0);
        return arr_b;
    }

    @Override
    public int engineGetDigestLength() {
        return this.digestSize;
    }

    @Override
    public void engineReset() {
        this.digest.reset();
    }

    @Override
    public void engineUpdate(byte b) {
        this.digest.update(b);
    }

    @Override
    public void engineUpdate(byte[] arr_b, int v, int v1) {
        this.digest.update(arr_b, v, v1);
    }
}

