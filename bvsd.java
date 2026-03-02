import android.content.Context;
import android.os.Build.VERSION;
import android.os.Build;
import java.util.List;
import java.util.Locale;
import java.util.function.BiPredicate;

public final class bvsd {
    public final Context a;
    private final gmcg b;

    public bvsd(Context context0, gmcg gmcg0) {
        this.a = context0;
        this.b = gmcg0;
    }

    public static TimeRange a(gqpm gqpm0) {
        return TimeRange.g(Long.valueOf(gqpm0.b), Long.valueOf(gqpm0.c));
    }

    public final gmbt b(gqpx gqpx0) {
        int v1;
        int v = gqpx0.b;
        if(v == 0) {
            v1 = 18;
        }
        else {
            switch(v) {
                case 3: {
                    v1 = 1;
                    break;
                }
                case 4: {
                    v1 = 2;
                    break;
                }
                case 5: {
                    v1 = 3;
                    break;
                }
                case 6: {
                    v1 = 4;
                    break;
                }
                case 7: {
                    v1 = 5;
                    break;
                }
                case 8: {
                    v1 = 6;
                    break;
                }
                case 9: {
                    v1 = 7;
                    break;
                }
                case 10: {
                    v1 = 8;
                    break;
                }
                case 11: {
                    v1 = 9;
                    break;
                }
                case 12: {
                    v1 = 10;
                    break;
                }
                case 13: {
                    v1 = 11;
                    break;
                }
                case 14: {
                    v1 = 12;
                    break;
                }
                case 15: {
                    v1 = 13;
                    break;
                }
                case 16: {
                    v1 = 14;
                    break;
                }
                case 17: {
                    v1 = 15;
                    break;
                }
                case 18: {
                    v1 = 16;
                    break;
                }
                case 19: {
                    v1 = 17;
                    break;
                }
                default: {
                    v1 = 0;
                }
            }
        }
        if(v1 != 0) {
            switch(v1 - 1) {
                case 0: {
                    String s = gqpx0.d;
                    List list0 = this.d((v == 3 ? ((gqpd)gqpx0.c) : gqpd.a).b);
                    return gmbt.h(gmbu.c(list0).a(new bvrs(s, list0), this.b));
                }
                case 1: {
                    String s1 = gqpx0.d;
                    List list1 = this.d((v == 4 ? ((gqpq)gqpx0.c) : gqpq.a).b);
                    return gmbt.h(gmbu.c(list1).a(new bvru(s1, list1), this.b));
                }
                case 2: {
                    gqpp gqpp0 = v == 5 ? ((gqpp)gqpx0.c) : gqpp.a;
                    String s2 = gqpx0.d;
                    return (gmbt)glzd.f(gmbt.h(this.b((gqpp0.b == null ? gqpx.a : gqpp0.b))), new bvsa(s2), this.b);
                }
                case 3: {
                    gqpf gqpf0 = v == 6 ? ((gqpf)gqpx0.c) : gqpf.a;
                    String s3 = gqpx0.d;
                    List list2 = this.d(gqpf0.b);
                    return gmbt.h(gmbu.c(list2).a(new bvry(list2, gqpf0, s3), this.b));
                }
                case 4: {
                    bvrx bvrx0 = new bvrx(this, (v == 7 ? ((gqpv)gqpx0.c) : gqpv.a), gqpx0.d);
                    return gmbt.h(this.b.e(bvrx0));
                }
                case 5: {
                    bvrq bvrq0 = new bvrq(this, (v == 8 ? ((gqpr)gqpx0.c) : gqpr.a), gqpx0.d);
                    return gmbt.h(this.b.e(bvrq0));
                }
                case 6: {
                    String s4 = gqpx0.d;
                    gqpu gqpu0 = v == 9 ? ((gqpu)gqpx0.c) : gqpu.a;
                    return bvsd.a((gqpu0.b == null ? gqpm.a : gqpu0.b)).s(Long.valueOf(Build.VERSION.SDK_INT)) ? gmbt.h(gmbu.i(bvsc.c())) : gmbt.h(gmbu.i(bvsc.a(s4)));
                }
                case 7: {
                    bvro bvro0 = new bvro(this, (v == 10 ? ((gqpe)gqpx0.c) : gqpe.a), gqpx0.d);
                    return gmbt.h(this.b.e(bvro0));
                }
                case 8: {
                    bvsb bvsb0 = new bvsb(this, (v == 11 ? ((gqpk)gqpx0.c) : gqpk.a), gqpx0.d);
                    return gmbt.h(this.b.e(bvsb0));
                }
                case 9: {
                    bvrw bvrw0 = new bvrw(this, (v == 12 ? ((gqps)gqpx0.c) : gqps.a), gqpx0.d);
                    return gmbt.h(this.b.e(bvrw0));
                }
                case 10: {
                    String s5 = gqpx0.d;
                    gqpg gqpg0 = v == 13 ? ((gqpg)gqpx0.c) : gqpg.a;
                    if(!gqpg0.b.isEmpty()) {
                        String s6 = Build.BRAND;
                        for(Object object0: gqpg0.b) {
                            if(gfqz.e(((String)object0), s6)) {
                                return gmbt.h(gmbu.i(bvsc.c()));
                            }
                        }
                    }
                    return gmbt.h(gmbu.i(bvsc.a(s5)));
                }
                case 11: {
                    bvrv bvrv0 = new bvrv(this, (v == 14 ? ((gqpt)gqpx0.c) : gqpt.a), gqpx0.d);
                    return gmbt.h(this.b.e(bvrv0));
                }
                case 12: {
                    String s7 = gqpx0.d;
                    gqpi gqpi0 = v == 15 ? ((gqpi)gqpx0.c) : gqpi.a;
                    String s8 = jyw.a(this.a.getResources().getConfiguration()).g(0).getLanguage();
                    if(!gqpi0.b.isEmpty()) {
                        for(Object object1: gqpi0.b) {
                            if(gfqz.e(s8, new Locale(((String)object1)).getLanguage())) {
                                return gmbt.h(gmbu.i(bvsc.c()));
                            }
                        }
                    }
                    return gmbt.h(gmbu.i(bvsc.a(s7)));
                }
                case 13: {
                    bvrt bvrt0 = new bvrt(this, (v == 16 ? ((gqph)gqpx0.c) : gqph.a), gqpx0.d);
                    return gmbt.h(this.b.e(bvrt0));
                }
                case 14: {
                    bvrp bvrp0 = new bvrp((v == 17 ? ((gqpn)gqpx0.c) : gqpn.a), gqpx0.d);
                    return gmbt.h(this.b.e(bvrp0));
                }
                case 15: {
                    bvrz bvrz0 = new bvrz(this, gqpx0.d);
                    return gmbt.h(this.b.e(bvrz0));
                }
                case 16: {
                    bvrr bvrr0 = new bvrr(this, (v == 19 ? ((gqpw)gqpx0.c) : gqpw.a), gqpx0.d);
                    return gmbt.h(this.b.e(bvrr0));
                }
                default: {
                    return gqpx0.e ? gmbt.h(gmbu.i(bvsc.c())) : gmbt.h(gmbu.i(bvsc.a(gqpx0.d)));
                }
            }
        }
        throw null;
    }

    public static final bvsc c(String s, List list0, boolean z, BiPredicate biPredicate0) {
        ggdy ggdy0 = new ggdy();
        ggqk ggqk0 = ((gged_interceptors)list0).E();
        while(ggqk0.hasNext()) {
            Object object0 = ggqk0.next();
            bvsc bvsc0 = (bvsc)((gmcd)object0).get();
            z = biPredicate0.test(Boolean.valueOf(bvsc0.a), Boolean.valueOf(z));
            ggdy0.k(bvsc0.b);
        }
        return z ? bvsc.c() : bvsc.b(s, ggdy0);
    }

    private final List d(List list0) {
        ggdy ggdy0 = new ggdy();
        for(Object object0: list0) {
            ggdy0.i(this.b(((gqpx)object0)));
        }
        return ggdy0.h();
    }
}

