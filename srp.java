import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class srp {
    public final srk a;
    private final iebu b;
    private final byte[] c;

    protected srp(srk srk0, iebu iebu0) {
        this.a = srk0;
        this.b = iebu0;
        this.c = null;
    }

    public srp(srk srk0, byte[] arr_b) {
        stp.b(srk0, "encryptionAlgorithm");
        this.a = srk0;
        this.b = new iepk(arr_b);
        stp.a(arr_b.length, srk0.e, 0x100, "key size");
        this.c = stm.a(arr_b);
    }

    protected iebr a(srk srk0) {
        switch(srk0.ordinal()) {
            case 0: {
                return new iehk();
            }
            case 1: {
                return new iegz();
            }
            default: {
                throw new stt("Encryption algorithm not supported: " + srk0);
            }
        }
    }

    protected final iebs b(srk srk0, boolean z) {
        return z ? new ienm(new ielu(this.a(srk0)), new ienk()) : new iebs(new ielu(this.a(srk0)));
    }

    public final void c() {
        byte[] arr_b = this.c;
        if(arr_b != null) {
            Arrays.fill(arr_b, 0);
        }
    }

    public final void d() {
        if(this.c != null && this.c.length != this.a.e) {
            throw new IllegalStateException("Key is not of expected length");
        }
    }

    public final byte[] e(byte[] arr_b) {
        this.d();
        return this.f(this.a(this.a), arr_b);
    }

    public final byte[] f(iebr iebr0, byte[] arr_b) {
        iela iela0 = new iela(iebr0);
        iela0.init(this.b);
        byte[] arr_b1 = new byte[iela0.a];
        iela0.update(arr_b, 0, arr_b.length);
        iela0.doFinal(arr_b1, 0);
        return arr_b1;
    }

    public final byte[] g(byte[] arr_b, byte[] arr_b1, boolean z) {
        this.d();
        try {
            iepq iepq0 = new iepq(this.b, arr_b1);
            iebs iebs0 = this.b(this.a, z);
            iebs0.h(false, iepq0);
            return srp.l(iebs0, arr_b);
        }
        catch(Exception exception0) {
            throw new stt("Data decryption failed", exception0);
        }
    }

    public final byte[] h(byte[] arr_b, byte[] arr_b1, boolean z) {
        this.d();
        try {
            iepq iepq0 = new iepq(this.b, arr_b1);
            iebs iebs0 = this.b(this.a, z);
            iebs0.h(true, iepq0);
            return srp.l(iebs0, arr_b);
        }
        catch(iecn iecn0) {
            throw new stt("Data encryption failed", iecn0);
        }
    }

    public byte[] i() {
        byte[] arr_b = this.c;
        if(arr_b != null) {
            return stm.a(arr_b);
        }
        throw new IllegalStateException("Key data not available");
    }

    public final byte[] j(byte[] arr_b) {
        iems iems0 = new iems(this.a(this.a));
        iems0.h(false, new iepq(this.b, new byte[this.a.d]));
        byte[] arr_b1 = new byte[arr_b.length];
        int v = iems0.f(arr_b, 0, arr_b.length, arr_b1, 0);
        try {
            iems0.a(arr_b1, v);
            return arr_b1;
        }
        catch(iecn iecn0) {
            throw new stt("Data encryption failed", iecn0);
        }
    }

    public final List k(byte[] arr_b) {
        this.d();
        srk srk0 = this.a;
        int v = srk0.e;
        if(arr_b.length % v != 0) {
            throw new IllegalStateException(a.z(v, arr_b.length, "data length: ", " is not a multiple of keySize "));
        }
        List list0 = new ArrayList();
        for(int v1 = 0; v1 < arr_b.length; v1 = v2) {
            int v2 = v1 + v;
            list0.add(new srp(srk0, this.j(Arrays.copyOfRange(arr_b, v1, v2))));
        }
        return list0;
    }

    private static final byte[] l(iebs iebs0, byte[] arr_b) {
        byte[] arr_b1 = new byte[iebs0.c(arr_b.length)];
        int v = iebs0.f(arr_b, 0, arr_b.length, arr_b1, 0);
        return Arrays.copyOf(arr_b1, v + iebs0.a(arr_b1, v));
    }
}

