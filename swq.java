import java.util.ArrayList;
import java.util.Iterator;

public final class swq {
    public static final swq a;
    public static final swq b;
    private final boolean c;

    static {
        swq.a = new swq(false);
        swq.b = new swq(true);
    }

    public swq(boolean z) {
        this.c = z;
    }

    public final swy a(byte[] arr_b, swc swc0, sxd sxd0) {
        ArrayList arrayList0 = new ArrayList();
        sxd sxd1 = sxj.a(arr_b, 0);
        if(!sxd1.d()) {
            return new swy(swp.a, null);
        }
        sxg sxg0 = (sxg)sxd1.b();
        if(sxg0.a != 97) {
            return new swy(swp.a, null);
        }
        int v = sxg0.e;
        if(v <= arr_b.length) {
            for(int v1 = v; v1 < arr_b.length; ++v1) {
                if(arr_b[v1] != 0) {
                    return new swy(swp.a, null);
                }
            }
            int v2 = sxg0.d;
            if(v2 - sxg0.b == 3) {
                try(ssv ssv0 = new ssv(arr_b, v2, v, 2, sxd0, new sxd(swc0))) {
                    ssw ssw0;
                    while((ssw0 = ssv0.a()) != null) {
                        if((ssw0 instanceof ssr)) {
                            if(!arrayList0.isEmpty()) {
                                if(((ssr)ssw0).f == ssp.a) {
                                    return new swy(swp.e, null);
                                }
                                ssr ssr0 = ssr.b(((ssr)ssw0));
                                byte[] arr_b1 = ssr0.a();
                                ssw0 = new stc(ssr0.n, arr_b1);
                            }
                            else if(this.c && (((ssr)ssw0).f != ssp.a || ((ssr)ssw0).e != ssq.a)) {
                                return new swy(swp.c, null);
                            }
                        }
                        Iterator iterator0 = arrayList0.iterator();
                        while(true) {
                            if(!iterator0.hasNext()) {
                                break;
                            }
                            Object object0 = iterator0.next();
                            if(((stb)object0).d().a == ssw0.d().a) {
                                return new swy(swp.e, null);
                            }
                        }
                        if((ssw0 instanceof stb)) {
                            arrayList0.add(((stb)ssw0));
                        }
                        else {
                            arrayList0.add(new stc(ssw0.d(), ssw0.a(), null));
                        }
                    }
                }
                catch(Exception unused_ex) {
                    return new swy(swp.a, null);
                }
                if(arrayList0.size() < 2) {
                    return new swy(swp.a, null);
                }
                if(!(arrayList0.get(0) instanceof ssr)) {
                    return new swy(swp.b, null);
                }
                return (arrayList0.get(1) instanceof ssd) ? new swy(null, new svr(arrayList0)) : new swy(swp.d, null);
            }
            return new swy(swp.a, null);
        }
        return new swy(swp.a, null);
    }

    public static final byte[] b(svt svt0) {
        sxk sxk0 = new sxk();
        for(Object object0: svt0.k().values()) {
            stb stb0 = (stb)object0;
            if((stb0 instanceof ssr)) {
                stb0 = ssr.b(((ssr)stb0));
            }
            sxk0.g(stb0.e());
        }
        sxk sxk1 = new sxk();
        sxk1.h(97);
        sxk1.i(sxk0.a(), 3);
        sxk1.f(sxk0);
        return sxk1.b();
    }
}

