import java.math.BigInteger;
import java.util.Hashtable;

public final class igot {
    static final igox A;
    static final igox B;
    static final igox C;
    static final igox D;
    static final igox E;
    static final igox F;
    static final igox G;
    static final Hashtable H;
    public static final Hashtable I;
    static final Hashtable J;
    static final igox a;
    static final igox b;
    static final igox c;
    static final igox d;
    static final igox e;
    static final igox f;
    static final igox g;
    static final igox h;
    static final igox i;
    static final igox j;
    static final igox k;
    static final igox l;
    static final igox m;
    static final igox n;
    static final igox o;
    static final igox p;
    static final igox q;
    static final igox r;
    static final igox s;
    static final igox t;
    static final igox u;
    static final igox v;
    static final igox w;
    static final igox x;
    static final igox y;
    static final igox z;

    static {
        ignw ignw0 = new ignw();
        igot.a = ignw0;
        igoh igoh0 = new igoh();
        igot.b = igoh0;
        igom igom0 = new igom();
        igot.c = igom0;
        igon igon0 = new igon();
        igot.d = igon0;
        igoo igoo0 = new igoo();
        igot.e = igoo0;
        igop igop0 = new igop();
        igot.f = igop0;
        igoq igoq0 = new igoq();
        igot.g = igoq0;
        igor igor0 = new igor();
        igot.h = igor0;
        igos igos0 = new igos();
        igot.i = igos0;
        ignm ignm0 = new ignm();
        igot.j = ignm0;
        ignn ignn0 = new ignn();
        igot.k = ignn0;
        igno igno0 = new igno();
        igot.l = igno0;
        ignp ignp0 = new ignp();
        igot.m = ignp0;
        ignq ignq0 = new ignq();
        igot.n = ignq0;
        ignr ignr0 = new ignr();
        igot.o = ignr0;
        igns igns0 = new igns();
        igot.p = igns0;
        ignt ignt0 = new ignt();
        igot.q = ignt0;
        ignu ignu0 = new ignu();
        igot.r = ignu0;
        ignv ignv0 = new ignv();
        igot.s = ignv0;
        ignx ignx0 = new ignx();
        igot.t = ignx0;
        igny igny0 = new igny();
        igot.u = igny0;
        ignz ignz0 = new ignz();
        igot.v = ignz0;
        igoa igoa0 = new igoa();
        igot.w = igoa0;
        igob igob0 = new igob();
        igot.x = igob0;
        igoc igoc0 = new igoc();
        igot.y = igoc0;
        igod igod0 = new igod();
        igot.z = igod0;
        igoe igoe0 = new igoe();
        igot.A = igoe0;
        igof igof0 = new igof();
        igot.B = igof0;
        igog igog0 = new igog();
        igot.C = igog0;
        igoi igoi0 = new igoi();
        igot.D = igoi0;
        igoj igoj0 = new igoj();
        igot.E = igoj0;
        igok igok0 = new igok();
        igot.F = igok0;
        igol igol0 = new igol();
        igot.G = igol0;
        igot.H = new Hashtable();
        igot.I = new Hashtable();
        igot.J = new Hashtable();
        igot.d("secp112r1", igou.g, ignw0);
        igot.d("secp112r2", igou.h, igoh0);
        igot.d("secp128r1", igou.u, igom0);
        igot.d("secp128r2", igou.v, igon0);
        igot.d("secp160k1", igou.j, igoo0);
        igot.d("secp160r1", igou.i, igop0);
        igot.d("secp160r2", igou.w, igoq0);
        igot.d("secp192k1", igou.x, igor0);
        igot.d("secp192r1", igou.G, igos0);
        igot.d("secp224k1", igou.y, ignm0);
        igot.d("secp224r1", igou.z, ignn0);
        igot.d("secp256k1", igou.k, igno0);
        igot.d("secp256r1", igou.H, ignp0);
        igot.d("secp384r1", igou.A, ignq0);
        igot.d("secp521r1", igou.B, ignr0);
        igot.d("sect113r1", igou.e, igns0);
        igot.d("sect113r2", igou.f, ignt0);
        igot.d("sect131r1", igou.o, ignu0);
        igot.d("sect131r2", igou.p, ignv0);
        igot.d("sect163k1", igou.b, ignx0);
        igot.d("sect163r1", igou.c, igny0);
        igot.d("sect163r2", igou.l, ignz0);
        igot.d("sect193r1", igou.q, igoa0);
        igot.d("sect193r2", igou.r, igob0);
        igot.d("sect233k1", igou.s, igoc0);
        igot.d("sect233r1", igou.t, igod0);
        igot.d("sect239k1", igou.d, igoe0);
        igot.d("sect283k1", igou.m, igof0);
        igot.d("sect283r1", igou.n, igog0);
        igot.d("sect409k1", igou.C, igoi0);
        igot.d("sect409r1", igou.D, igoj0);
        igot.d("sect571k1", igou.E, igok0);
        igot.d("sect571r1", igou.F, igol0);
    }

    public static BigInteger a(String s) {
        return new BigInteger(1, igre.a(s));
    }

    public static ignf b(String s) {
        Hashtable hashtable0 = igot.H;
        char[] arr_c = s.toCharArray();
        boolean z = false;
        for(int v = 0; v != arr_c.length; ++v) {
            int v1 = arr_c[v];
            if(v1 >= 65 && v1 <= 90) {
                arr_c[v] = (char)(v1 + 0x20);
                z = true;
            }
        }
        if(z) {
            s = new String(arr_c);
        }
        return (ignf)hashtable0.get(s);
    }

    public static igps c(igps igps0, igqn igqn0) {
        igpr igpr0 = igps0.m();
        igpr0.d = new igqm(igps0, igqn0);
        igps igps1 = igpr0.c;
        int v = igpr0.a;
        if(!igps1.l(v)) {
            throw new IllegalStateException("unsupported coordinate system");
        }
        igps igps2 = igps1.e();
        if(igps2 == igps1) {
            throw new IllegalStateException("implementation returned current curve");
        }
        synchronized(igps2) {
            igps2.i = v;
            igps2.k = igpr0.d;
            igps2.j = igpr0.b;
        }
        return igps2;
    }

    static void d(String s, ignf ignf0, igox igox0) {
        igot.H.put(s.toLowerCase(), ignf0);
        igot.J.put(ignf0, s);
        igot.I.put(ignf0, igox0);
    }
}

