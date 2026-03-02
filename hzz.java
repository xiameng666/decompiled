import java.util.Map;

public final class hzz implements iav {
    final iag a;
    final int b;
    final iav c;
    private final iav d;

    public hzz(iav iav0, iag iag0, int v, iav iav1) {
        this.a = iag0;
        this.b = v;
        this.c = iav1;
        super();
        this.d = iav0;
    }

    @Override  // iav
    public final int a() {
        return this.d.a();
    }

    @Override  // iav
    public final int b() {
        return this.d.b();
    }

    @Override  // iav
    public final Map e() {
        return this.d.e();
    }

    @Override  // iav
    public final ibts f() {
        return this.d.f();
    }

    @Override  // iav
    public final void g() {
        iag iag0 = this.a;
        iag0.e = this.b;
        this.c.g();
        bzk bzk0 = iag0.o;
        long[] arr_v = bzk0.a;
        int v = arr_v.length - 2;
        if(v >= 0) {
            int v1 = 0;
            while(true) {
                long v2 = arr_v[v1];
                if((~v2 << 7 & v2 & 0x8080808080808080L) != 0x8080808080808080L) {
                    for(int v3 = 0; true; ++v3) {
                        int v4 = 8 - (~(v1 - v) >>> 0x1F);
                        if(v3 >= v4) {
                            break;
                        }
                        if((0xFFL & v2) < 0x80L) {
                            int v5 = (v1 << 3) + v3;
                            Object object0 = bzk0.b[v5];
                            icm icm0 = (icm)bzk0.c[v5];
                            gwq gwq0 = iag0.h;
                            int v6 = gwq0.a(object0);
                            if(v6 < 0 || v6 >= iag0.e) {
                                if(v6 >= 0) {
                                    gwq0.d(v6, icl.b);
                                }
                                if(iag0.n.b(object0)) {
                                    icm0.b();
                                }
                                bzk0.i(v5);
                            }
                        }
                        v2 >>= 8;
                    }
                    if(v4 == 8) {
                        goto label_29;
                    }
                    break;
                }
            label_29:
                if(v1 == v) {
                    break;
                }
                ++v1;
            }
        }
        iag0.i(iag0.d);
    }
}

