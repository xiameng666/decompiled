package org.bouncycastle.jcajce.provider.keystore.util;

import j..io.ByteArrayInputStreamRetargetInterface;
import j..io.DesugarInputStream;
import j..io.InputStreamRetargetInterface;
import java.io.ByteArrayInputStream;
import java.io.OutputStream;
import java.util.Arrays;

final class JKSKeyStoreSpi.ErasableByteStream extends ByteArrayInputStream implements ByteArrayInputStreamRetargetInterface, InputStreamRetargetInterface {
    public JKSKeyStoreSpi.ErasableByteStream(byte[] arr_b, int v, int v1) {
        super(arr_b, v, v1);
    }

    public void erase() {
        Arrays.fill(this.buf, 0);
    }

    @Override  // j$.io.ByteArrayInputStreamRetargetInterface, j$.io.InputStreamRetargetInterface
    public long transferTo(OutputStream outputStream0) {
        return DesugarInputStream.transferTo(this, outputStream0);
    }
}

