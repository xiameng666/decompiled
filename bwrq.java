import j..util.Objects;
import java.util.Queue;

final class bwrq extends bwzp {
    final bwrs a;

    public bwrq(bwrs bwrs0, gltq gltq0, int v, int v1, String s) {
        Objects.requireNonNull(bwrs0);
        this.a = bwrs0;
        super(gltq0, v, v1, s, null);
    }

    @Override  // bwzp
    protected final Object a() {
        bwrs bwrs3;
        bwrs bwrs0 = this.a;
        bwrr bwrr0 = new bwrr(bwrs0);
        bwrs0.a.g(bwrr0);
        int v = bwrr0.b - 1;
        if(bwrr0.b == 0) {
            throw null;
        }
        switch(v) {
            case 0: {
                throw new IllegalStateException();
            }
            case 1: {
                bwrt bwrt0 = bwrs0.d;
                synchronized(bwrt0) {
                    batl.l(bwrt0.d == bwrs0);
                    Queue queue0 = bwrt0.c;
                    if(queue0.size() > 1 && ((Boolean)bwvu.c.b()).booleanValue() && bwrt0.f) {
                        bwrs bwrs1 = (bwrs)queue0.remove();
                        boolean z = bwrs1.c();
                        int v1 = bwrs1.c;
                        bwrj bwrj0 = (bwrj)bwrs1.a;
                        bwrh bwrh0 = goqq.h(bwrj0) ? new bwrh(bwrj0) : new bwrk(bwrj0);
                        int v2 = v1;
                        while(true) {
                            bwrs bwrs2 = (bwrs)queue0.peek();
                            if(bwrs2 == null || bwrs2.c() != z || !bwrh0.b(bwrs2.a)) {
                                break;
                            }
                            v2 += bwrs2.c;
                            queue0.remove();
                        }
                        bwrp bwrp0 = bwrh0.a();
                        bwrs3 = new bwrs(gltq.ar, bwrp0, z, v2, bwrt0);
                    }
                    else {
                        bwrs3 = (bwrs)queue0.poll();
                    }
                    bwrt0.d = bwrs3;
                }
                if(bwrs3 != null) {
                    bwzp bwzp0 = bwrs3.a();
                    bwrt0.b.h(bwzp0);
                    return null;
                }
                break;
            }
            case 2: {
                bwru bwru0 = bwrs0.b;
                if(bwru0 != null) {
                    int v3 = bwru0.a;
                    bwru0.a = v3 + 1;
                    double f = Math.random();
                    bwrs0.d.b(bwrs0, ((long)(Math.min(Math.pow(1.5, v3) * 250.0, 4000.0) * ((f + f - 1.0) * 0.25 + 1.0))));
                    return null;
                }
                break;
            }
            default: {
                return null;
            }
        }
        return null;
    }
}

