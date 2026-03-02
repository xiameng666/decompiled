package org.bouncycastle.jcajce.provider.symmetric.util;

import iebr;
import iebu;

interface BaseBlockCipher.GenericBlockCipher {
    int doFinal(byte[] arg1, int arg2);

    String getAlgorithmName();

    int getOutputSize(int arg1);

    iebr getUnderlyingCipher();

    int getUpdateOutputSize(int arg1);

    void init(boolean arg1, iebu arg2);

    int processByte(byte arg1, byte[] arg2, int arg3);

    int processBytes(byte[] arg1, int arg2, int arg3, byte[] arg4, int arg5);

    void updateAAD(byte[] arg1, int arg2, int arg3);

    boolean wrapOnNoPadding();
}

