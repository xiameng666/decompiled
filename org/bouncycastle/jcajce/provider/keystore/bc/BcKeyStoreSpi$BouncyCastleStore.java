package org.bouncycastle.jcajce.provider.keystore.bc;

import ieev;
import iekt;
import ieku;
import ieuu;
import ieuv;
import iftq;
import ifuo;
import ifup;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class BcKeyStoreSpi.BouncyCastleStore extends BcKeyStoreSpi {
    public BcKeyStoreSpi.BouncyCastleStore() {
        super(1);
    }

    @Override  // org.bouncycastle.jcajce.provider.keystore.bc.BcKeyStoreSpi
    public void engineLoad(InputStream inputStream0, char[] arr_c) {
        this.table.clear();
        if(inputStream0 != null) {
            DataInputStream dataInputStream0 = new DataInputStream(inputStream0);
            int v = dataInputStream0.readInt();
            if(v != 0 && v != 2 && v != 1) {
                throw new IOException("Wrong version of key store.");
            }
            int v1 = dataInputStream0.readInt();
            byte[] arr_b = new byte[v1];
            if(v1 != 20) {
                throw new IOException("Key store corrupted.");
            }
            dataInputStream0.readFully(arr_b);
            int v2 = dataInputStream0.readInt();
            if(v2 < 0 || v2 > 0x10000) {
                throw new IOException("Key store corrupted.");
            }
            ieuu ieuu0 = new ieuu(dataInputStream0, this.makePBECipher((v == 0 ? "OldPBEWithSHAAndTwofish-CBC" : "PBEWithSHAAndTwofish-CBC"), 2, arr_c, arr_b, v2));
            ieev ieev0 = new ieev();
            this.loadStore(new iekt(ieuu0, ieev0));
            byte[] arr_b1 = new byte[20];
            ieev0.doFinal(arr_b1, 0);
            byte[] arr_b2 = new byte[20];
            ifuo.a(ieuu0, arr_b2, 0, 20);
            if(!iftq.f(arr_b1, arr_b2)) {
                this.table.clear();
                throw new IOException("KeyStore integrity check failed.");
            }
        }
    }

    @Override  // org.bouncycastle.jcajce.provider.keystore.bc.BcKeyStoreSpi
    public void engineStore(OutputStream outputStream0, char[] arr_c) {
        DataOutputStream dataOutputStream0 = new DataOutputStream(outputStream0);
        byte[] arr_b = new byte[20];
        int v = this.random.nextInt() & 0x3FF;
        this.random.nextBytes(arr_b);
        dataOutputStream0.writeInt(this.version);
        dataOutputStream0.writeInt(20);
        dataOutputStream0.write(arr_b);
        int v1 = v + 0x400;
        dataOutputStream0.writeInt(v1);
        ieuv ieuv0 = new ieuv(dataOutputStream0, this.makePBECipher("PBEWithSHAAndTwofish-CBC", 1, arr_c, arr_b, v1));
        ieku ieku0 = new ieku(new ieev());
        this.saveStore(new ifup(ieuv0, ieku0));
        byte[] arr_b1 = new byte[20];
        ieku0.a.doFinal(arr_b1, 0);
        ieuv0.write(arr_b1);
        ieuv0.close();
    }
}

