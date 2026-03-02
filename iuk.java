import android.graphics.Region.Op;
import android.graphics.Region;
import android.os.Trace;
import java.util.List;

public final class iuk {
    private static final hka a;

    static {
        iuk.a = new hka(0.0f, 0.0f, 10.0f, 10.0f);
    }

    public static final boolean a(iug iug0) {
        ihy ihy0 = iug0.d();
        return ihy0 != null && ihy0.aA() || (iug0.b.f(iuz.p) || iug0.b.f(iuz.o));
    }

    public static final boolean b(iug iug0) {
        if(!iuk.a(iug0)) {
            ity ity0 = iug0.b;
            if(!ity0.a) {
                Object[] arr_object = ity0.c.b;
                Object[] arr_object1 = ity0.c.c;
                long[] arr_v = ity0.c.a;
                int v = arr_v.length - 2;
                if(v >= 0) {
                    for(int v1 = 0; true; ++v1) {
                        long v2 = arr_v[v1];
                        if((~v2 << 7 & v2 & 0x8080808080808080L) != 0x8080808080808080L) {
                            for(int v3 = 0; true; ++v3) {
                                int v4 = 8 - (~(v1 - v) >>> 0x1F);
                                if(v3 >= v4) {
                                    break;
                                }
                                if((0xFFL & v2) < 0x80L) {
                                    int v5 = (v1 << 3) + v3;
                                    Object object0 = arr_object[v5];
                                    Object object1 = arr_object1[v5];
                                    if(((ivi)object0).c) {
                                        return true;
                                    }
                                }
                                v2 >>= 8;
                            }
                            if(v4 != 8) {
                                return false;
                            }
                        }
                        if(v1 == v) {
                            break;
                        }
                    }
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public static final bxv c(iuj iuj0) {
        bxv bxv0;
        Trace.beginSection("getAllUncoveredSemanticsNodesToIntObjectMap");
        try {
            iug iug0 = iuj0.a();
            if(iug0.a.an() && iug0.a.am()) {
                bxv0 = new bxv(0x30);
                itv itv0 = new itv();
                itv0.b(jli.b(iug0.b()));
                iuk.d(itv0, iug0, bxv0, iug0, new itv());
            }
            else {
                bxv0 = bxw.a;
                ibuq.d(bxv0, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.emptyIntObjectMap>");
            }
        }
        finally {
            Trace.endSection();
        }
        return bxv0;
    }

    private static final void d(itv itv0, iug iug0, bxv bxv0, iug iug1, itv itv1) {
        hka hka0;
        ify ify0 = iug1.a;
        Region region0 = itv0.a;
        if((!region0.isEmpty() || iug1.d == iug0.d) && (ify0.an() && ify0.am() || iug1.c)) {
            ije ije0 = ify0.t();
            if(ije0 == null) {
                hka0 = ify0.r().af();
            }
            else {
                hfb hfb0 = ije0.I();
                Object object0 = itz.a(iug1.b, itw.b);
                if(hfb0.r.B) {
                    hka0 = object0 == null ? hzl.e(ien.e(hfb0, 8)) : ien.e(hfb0, 8).af();
                }
                else {
                    hka0 = hka.a;
                }
            }
            jlh jlh0 = jli.b(hka0);
            itv1.b(jlh0);
            int v = iug1.d == iug0.d ? -1 : iug1.d;
            if(itv1.a.op(region0, Region.Op.INTERSECT)) {
                bxv0.g(v, new iui(iug1, itv1.a()));
                List list0 = iug1.i();
                for(int v1 = list0.size() - 1; v1 >= 0; --v1) {
                    if(!((iug)list0.get(v1)).e().f(iuz.z)) {
                        iuk.d(itv0, iug0, bxv0, ((iug)list0.get(v1)), itv1);
                    }
                }
                if(iuk.b(iug1)) {
                    region0.op(jlh0.b, jlh0.c, jlh0.d, jlh0.e, Region.Op.DIFFERENCE);
                }
            }
            else {
                if(iug1.c) {
                    iug iug2 = iug1.g();
                    bxv0.g(v, new iui(iug1, jli.b((iug2 == null || (iug2.a == null || !iug2.a.an()) ? iuk.a : iug2.b()))));
                    return;
                }
                if(v == -1) {
                    bxv0.g(-1, new iui(iug1, itv1.a()));
                }
            }
        }
    }
}

