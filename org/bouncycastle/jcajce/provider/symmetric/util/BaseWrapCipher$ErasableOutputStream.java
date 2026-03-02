package org.bouncycastle.jcajce.provider.symmetric.util;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public final class BaseWrapCipher.ErasableOutputStream extends ByteArrayOutputStream {
    public void erase() {
        Arrays.fill(this.buf, 0);
        this.reset();
    }

    public byte[] getBuf() {
        return this.buf;
    }
}

