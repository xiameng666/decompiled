import android.content.ContentValues;
import java.util.List;

public final class egzv {
    public final List A;
    public final List B;
    public final List C;
    public final List D;
    public final List E;
    public final List F;
    public final List G;
    public final List H;
    public final List I;
    public final List J;
    public final List K;
    public final List L;
    public final List M;
    public final List N;
    public final List O;
    public final String a;
    public final String b;
    public final String c;
    public final Long d;
    public final Long e;
    public final Long f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final eggh m;
    public final List n;
    public final List o;
    public final List p;
    public final List q;
    public final List r;
    public final List s;
    public final List t;
    public final List u;
    public final List v;
    public final List w;
    public final List x;
    public final List y;
    public final List z;

    public egzv(egzu egzu0) {
        this.d = egzu0.e;
        this.a = egzu0.a;
        this.e = egzu0.d;
        this.b = egzu0.b;
        this.c = egzu0.c;
        this.f = egzu0.f;
        this.g = egzu0.g;
        this.h = egzu0.h;
        this.i = egzu0.i;
        this.j = egzu0.j;
        this.k = egzu0.k;
        this.l = egzu0.l;
        this.m = egzu0.m;
        this.n = egzu0.n;
        this.o = egzu0.o;
        this.p = egzu0.p;
        this.q = egzu0.q;
        this.r = egzu0.r;
        this.s = egzu0.s;
        this.t = egzu0.t;
        this.u = egzu0.u;
        this.v = egzu0.v;
        this.w = egzu0.w;
        this.x = egzu0.x;
        this.y = egzu0.y;
        this.z = egzu0.z;
        this.A = egzu0.A;
        this.B = egzu0.B;
        this.C = egzu0.C;
        this.D = egzu0.D;
        this.E = egzu0.E;
        this.F = egzu0.F;
        this.G = egzu0.G;
        this.H = egzu0.H;
        this.I = egzu0.I;
        this.J = egzu0.J;
        this.K = egzu0.K;
        this.L = egzu0.L;
        this.M = egzu0.M;
        this.N = egzu0.N;
        this.O = ehjs.f(new List[]{egzu0.n, egzu0.o, egzu0.p, egzu0.q, egzu0.r, egzu0.s, egzu0.t, egzu0.u, egzu0.v, egzu0.w, egzu0.x, egzu0.y, egzu0.z, egzu0.A, egzu0.B, egzu0.C, egzu0.D, egzu0.E, egzu0.F, egzu0.G, egzu0.H, egzu0.I, egzu0.J, egzu0.K, egzu0.L, egzu0.M, egzu0.N});
    }

    public final ContentValues a() {
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("sourceid", this.a);
        contentValues0.put("sync3", this.e);
        contentValues0.put("sync2", this.b);
        return contentValues0;
    }

    public final boolean b() {
        return egzv.d(this.n) || egzv.d(this.s);
    }

    public final boolean c() {
        return ehjs.i(this.n) && ehjs.i(this.o) && ehjs.i(this.q) && ehjs.i(this.r) && ehjs.i(this.s) && ehjs.i(this.t) && ehjs.i(this.u) && ehjs.i(this.v) && ehjs.i(this.y) && ehjs.i(this.z) && ehjs.i(this.A) && ehjs.i(this.B) && ehjs.i(this.C) && ehjs.i(this.D) && ehjs.i(this.E) && ehjs.i(this.F) && ehjs.i(this.G) && ehjs.i(this.H) && ehjs.i(this.I) && ehjs.i(this.K) && ehjs.i(this.L) && ehjs.i(this.M) && ehjs.i(this.N);
    }

    private static final boolean d(List list0) {
        if(list0 == null) {
            return false;
        }
        for(Object object0: list0) {
            ContentValues contentValues0 = (ContentValues)object0;
            if(!ehie.b(contentValues0.getAsLong("data_version"), contentValues0.getAsLong("data_sync4"))) {
                String s = (String)contentValues0.get("data1");
                if(s != null) {
                    char[] arr_c = s.toCharArray();
                    for(int v = 0; v < arr_c.length; ++v) {
                        int v1 = arr_c[v];
                        Character character0 = Character.valueOf(((char)v1));
                        if(!character0.equals(Character.valueOf('-'))) {
                            character0.getClass();
                            if(v1 < 0x30) {
                                return true;
                            }
                            character0.getClass();
                            if(v1 > 57) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
}

