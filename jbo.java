public final class jbo {
    public static final jbn a(jbn jbn0, jlm jlm0) {
        jau jau0 = new jau();
        jkg jkg0 = jbn0.b.a.e(jau0);
        long v = (jbn0.b.b & 0xFF00000000L) == 0L ? jav.a : jbn0.b.b;
        jeu jeu0 = jbn0.b.c == null ? jeu.h : jbn0.b.c;
        jem jem0 = new jem((jbn0.b.d == null ? 0 : jbn0.b.d.a));
        jen jen0 = new jen((jbn0.b.e == null ? 0xFFFF : jbn0.b.e.a));
        jdz jdz0 = jbn0.b.f == null ? jdz.e : jbn0.b.f;
        String s = jbn0.b.g;
        long v1 = (jbn0.b.h & 0xFF00000000L) == 0L ? jav.b : jbn0.b.h;
        float f = jbn0.b.i == null ? 0.0f : jbn0.b.i.a;
        jjk jjk0 = new jjk((Float.isNaN(f) ? 0.0f : f));
        jkh jkh0 = jbn0.b.j == null ? jkh.a : jbn0.b.j;
        jii jii0 = jbn0.b.k == null ? jih.a() : jbn0.b.k;
        long v2 = jbn0.b.l == 16L ? jav.c : jbn0.b.l;
        jjz jjz0 = jbn0.b.m == null ? jjz.a : jbn0.b.m;
        hmt hmt0 = jbn0.b.n == null ? hmt.a : jbn0.b.n;
        ixs ixs0 = jbn0.b.o;
        hpe hpe0 = jbn0.b.p;
        if(hpe0 == null) {
            hpe0 = hpg.a;
        }
        if(s == null) {
            s = "";
        }
        jat jat0 = new jat(jkg0, v, jeu0, jem0, jen0, jdz0, s, v1, jjk0, jkh0, jii0, v2, jjz0, hmt0, ixs0, hpe0);
        ixo ixo0 = jbn0.c;
        int v3 = ixo0.a;
        int v4 = ixo0.b;
        if(v4 == 3) {
            switch(jlm0.ordinal()) {
                case 0: {
                    v4 = 4;
                    break;
                }
                case 1: {
                    v4 = 5;
                    break;
                }
                default: {
                    throw new ibnq();
                }
            }
        }
        else if(v4 == 0) {
            switch(jlm0.ordinal()) {
                case 0: {
                    v4 = 1;
                    break;
                }
                case 1: {
                    v4 = 2;
                    break;
                }
                default: {
                    throw new ibnq();
                }
            }
        }
        long v5 = (ixo0.c & 0xFF00000000L) == 0L ? ixp.a : ixo0.c;
        jki jki0 = ixo0.d == null ? jki.a : ixo0.d;
        ixr ixr0 = ixo0.e;
        jjw jjw0 = ixo0.f;
        int v6 = ixo0.g == 0 ? jjr.a : ixo0.g;
        int v7 = ixo0.h;
        jkk jkk0 = ixo0.i == null ? jkk.a : ixo0.i;
        if(v7 == 0) {
            v7 = 1;
        }
        return v3 == 0 ? new jbn(jat0, new ixo(5, v4, v5, jki0, ixr0, jjw0, v6, v7, jkk0), jbn0.d) : new jbn(jat0, new ixo(v3, v4, v5, jki0, ixr0, jjw0, v6, v7, jkk0), jbn0.d);
    }
}

