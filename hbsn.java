import java.util.Arrays;

public final class hbsn {
    public final hbso a;

    public hbsn(hbso hbso0) {
        this.a = hbso0;
        hbso0.h();
        hbso0.g();
    }

    public final int a() {
        int v = this.a.a();
        if(v <= 0x1000) {
            return v == 0 ? -1 : v;
        }
        return -1;
    }

    public final int b() {
        return this.a.b();
    }

    public final String c() {
        return this.a.d();
    }

    public final String d() {
        return this.a.e();
    }

    public final byte[] e() {
        byte[] arr_b = this.a.f();
        return arr_b == null ? null : Arrays.copyOf(arr_b, arr_b.length);
    }
}

