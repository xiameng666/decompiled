package org.bouncycastle.jcajce.provider.asymmetric.rsa;

import iebn;
import iebu;
import iecd;
import ienr;
import iepr;
import iftq;
import ifud;
import java.security.SecureRandom;
import java.util.Arrays;

class CustomPKCS1Encoding implements iebn {
    private static final int HEADER_LENGTH = 10;
    private byte[] blockBuffer;
    private iebn engine;
    private boolean forEncryption;
    private boolean forPrivateKey;
    private SecureRandom random;
    private boolean useStrictLength;

    public CustomPKCS1Encoding(iebn iebn0) {
        this.engine = iebn0;
        this.useStrictLength = this.useStrict();
    }

    private static int checkPkcs1Encoding1(byte[] arr_b) {
        int v = 0;
        int v2 = -(arr_b[0] & 0xFF ^ 1);
        int v3 = 0;
        for(int v1 = 1; v1 < arr_b.length; ++v1) {
            int v4 = arr_b[v1] & 0xFF;
            int v5 = v4 - 1 >> 0x1F;
            v ^= ~v3 & v1 & v5;
            v3 |= v5;
            v2 |= ~((v4 ^ 0xFF) - 1 >> 0x1F | v3);
        }
        return (v - 9 | v2) >> 0x1F | arr_b.length - 1 - v;
    }

    private static int checkPkcs1Encoding2(byte[] arr_b) {
        int v = 0;
        int v1 = arr_b[0] & 0xFF;
        int v3 = 0;
        for(int v2 = 1; v2 < arr_b.length; ++v2) {
            int v4 = (arr_b[v2] & 0xFF) - 1 >> 0x1F;
            v ^= ~v3 & v2 & v4;
            v3 |= v4;
        }
        return (-(v1 ^ 2) | v - 9) >> 0x1F | arr_b.length - 1 - v;
    }

    private byte[] decodeBlock(byte[] arr_b, int v, int v1) {
        byte[] arr_b3;
        int v2 = this.engine.getOutputBlockSize();
        byte[] arr_b1 = this.engine.processBlock(arr_b, v, v1);
        int v3 = this.useStrictLength;
        int v4 = 1;
        int v5 = arr_b1.length == v2 ? 0 : 1;
        byte[] arr_b2 = arr_b1.length >= v2 ? arr_b1 : this.blockBuffer;
        int v6 = this.forPrivateKey ? CustomPKCS1Encoding.checkPkcs1Encoding2(arr_b2) : CustomPKCS1Encoding.checkPkcs1Encoding1(arr_b2);
        if(v6 >= 0) {
            v4 = 0;
        }
        try {
            if((v3 & v5 | v4) == 0) {
                arr_b3 = new byte[v6];
                System.arraycopy(arr_b2, arr_b2.length - v6, arr_b3, 0, v6);
            }
            else {
                arr_b3 = null;
            }
        }
        finally {
            Arrays.fill(arr_b1, 0);
            iftq.B(this.blockBuffer, 0, Math.max(0, this.blockBuffer.length - arr_b1.length));
        }
        return arr_b3;
    }

    private byte[] encodeBlock(byte[] arr_b, int v, int v1) {
        if(v1 > this.getInputBlockSize()) {
            throw new IllegalArgumentException("input data too large");
        }
        int v2 = this.engine.getInputBlockSize();
        byte[] arr_b1 = new byte[v2];
        int v3 = 1;
        if(this.forPrivateKey) {
            arr_b1[0] = 1;
            while(v3 != v2 - v1 - 1) {
                arr_b1[v3] = -1;
                ++v3;
            }
        }
        else {
            this.random.nextBytes(arr_b1);
            arr_b1[0] = 2;
            while(v3 != v2 - v1 - 1) {
                while(arr_b1[v3] == 0) {
                    arr_b1[v3] = (byte)this.random.nextInt();
                }
                ++v3;
            }
        }
        int v4 = v2 - v1;
        arr_b1[v4 - 1] = 0;
        System.arraycopy(arr_b, v, arr_b1, v4, v1);
        return this.engine.processBlock(arr_b1, 0, v2);
    }

    @Override  // iebn
    public int getInputBlockSize() {
        int v = this.engine.getInputBlockSize();
        return this.forEncryption ? v - 10 : v;
    }

    @Override  // iebn
    public int getOutputBlockSize() {
        int v = this.engine.getOutputBlockSize();
        return this.forEncryption ? v : v - 10;
    }

    public iebn getUnderlyingCipher() {
        return this.engine;
    }

    @Override  // iebn
    public void init(boolean z, iebu iebu0) {
        ienr ienr0;
        if((iebu0 instanceof iepr)) {
            this.random = ((iepr)iebu0).a;
            ienr0 = (ienr)((iepr)iebu0).b;
        }
        else {
            ienr0 = (ienr)iebu0;
            if(!ienr0.a && z) {
                this.random = iecd.b();
            }
        }
        this.engine.init(z, iebu0);
        this.forPrivateKey = ienr0.a;
        this.forEncryption = z;
        this.blockBuffer = new byte[this.engine.getOutputBlockSize()];
    }

    @Override  // iebn
    public byte[] processBlock(byte[] arr_b, int v, int v1) {
        return this.forEncryption ? this.encodeBlock(arr_b, v, v1) : this.decodeBlock(arr_b, v, v1);
    }

    private boolean useStrict() {
        return ifud.d("org.bouncycastle.pkcs1.not_strict", true) ? false : !ifud.d("org.bouncycastle.pkcs1.strict", false);
    }
}

