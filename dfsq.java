import java.util.Arrays;

public final class dfsq {
    public final int a;
    public final dcoz b;
    public final int c;
    public final int d;
    public final long e;
    public final dftl f;
    public final byte[] g;
    public final boolean h;
    public final int i;

    public dfsq(int v, dcoz dcoz0, int v1, int v2, long v3, byte[] arr_b, dftl dftl0, boolean z, int v4) {
        this.a = v;
        this.b = dcoz0;
        this.c = v1;
        this.d = v2;
        this.e = v3;
        this.g = arr_b;
        this.f = dftl0;
        this.h = z;
        this.i = v4;
    }

    public final dfsp a() {
        dfsp dfsp0 = new dfsp();
        dfsp0.a = this.a;
        dfsp0.b = this.b;
        dfsp0.c = this.c;
        dfsp0.d = this.d;
        dfsp0.e = this.e;
        dfsp0.g = this.g;
        dfsp0.f = this.f;
        dfsp0.h = this.h;
        return dfsp0;
    }

    public final boolean b() {
        return this.g != null;
    }

    @Override
    public final String toString() {
        String s = Arrays.toString(this.g);
        return String.format("DiscoveryOptions{dataUsage=%d, analyticsInformation=%s, uwbChannel=%d, uwbPreambleIndex=%d, flowId=%d, uwbAddress=%s, mode=%s, bluetoothClassicEnabled=%s, useCase=%s, vendorId=%s}", ((int)this.a), this.b, ((int)this.c), ((int)this.d), ((long)this.e), s, this.f, Boolean.valueOf(this.h), ((int)this.i), ((int)0));
    }
}

