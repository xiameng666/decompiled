import android.content.ContentValues;
import java.util.List;

public final class ehhz {
    public static void a(egzv egzv0, int v) {
        ehhz.f(egzv0.I, "data1", v);
        ehhz.f(egzv0.I, "data4", v);
        ehhz.f(egzv0.r, "data1", v);
        ehhz.f(egzv0.L, "data1", v);
        ehhz.f(egzv0.q, "data1", v);
        ehhz.f(egzv0.q, "data2", v);
        ehhz.f(egzv0.A, "data1", v);
        ehhz.f(egzv0.F, "data1", v);
        ehhz.f(egzv0.v, "data1", v);
        ehhz.f(egzv0.H, "data1", v);
        ehhz.f(egzv0.E, "data2", v);
        ehhz.f(egzv0.E, "data3", v);
        ehhz.f(egzv0.K, "data4", v);
        ehhz.f(egzv0.K, "data3", v);
    }

    public static void b(egzv egzv0, int v) {
        if(ehhz.c(egzv0.I, v) || ehhz.c(egzv0.r, v)) {
            throw new iapl(iaph.d.a().f("Request contains an invalid argument."));
        }
        if(!ehhz.c(egzv0.A, v) && !ehhz.c(egzv0.L, v) && !ehhz.c(egzv0.N, v) && !ehhz.c(egzv0.q, v) && !ehhz.c(egzv0.s, v)) {
            return;
        }
        throw new iapl(iaph.i.a().f("Resource has been exhausted (e.g. check quota)."));
    }

    public static boolean c(List list0, int v) {
        return list0 != null && list0.size() > v;
    }

    public static boolean d(eggh eggh0, Long long0) {
        return eggh0 != null && long0 != null && (eggh0.b & 2) != 0 && eggh0.d == ((long)long0) && System.currentTimeMillis() - eggh0.e < hxcc.a.e().d() * 1000L;
    }

    public static boolean e(Exception exception0) {
        return (exception0 instanceof iapl) && ((iapl)exception0).a.t == iaph.d;
    }

    private static void f(List list0, String s, int v) {
        if(list0 != null) {
            for(Object object0: list0) {
                String s1 = (String)((ContentValues)object0).get(s);
                if(s1 != null && s1.length() > v) {
                    throw new iapl(iaph.i.a().f("Resource has been exhausted (e.g. check quota)."));
                }
            }
        }
    }
}

