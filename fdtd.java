public final class fdtd implements fdtv {
    @Override  // fdtv
    public final byte[] a(MessageLite hfvm0, hfwn hfwn0) {
        feki feki0 = new feki();
        feki0.f("SendRpcRequest");
        feki0.j(hfwn0);
        feki0.h(4, ((hlbd)hfvm0).e);
        feki0.g(2, ((hlbd)hfvm0).d);
        feki0.e(3);
        hkzw hkzw0 = ((hlbd)hfvm0).f;
        if(hkzw0 == null) {
            hkzw0 = hkzw.a;
        }
        feki0.g(14, hkzw0.e);
        feki0.h(1, hkzw0.f);
        feki0.h(2, hkzw0.g);
        feki0.h(3, hkzw0.h);
        feki0.h(4, hkzw0.i);
        feki0.d(5, hkzw0.j);
        feki0.d(6, hkzw0.k);
        feki0.d(7, hkzw0.l);
        feki0.b(8, hkzw0.m);
        feki0.d(9, hkzw0.n);
        feki0.b(10, hkzw0.o);
        if((hkzw0.b & 1) != 0) {
            feki0.e(11);
            feki0.d(1, (hkzw0.p == null ? hkzt.a : hkzw0.p).b);
            feki0.d(2, (hkzw0.p == null ? hkzt.a : hkzw0.p).c);
            feki0.d(3, (hkzw0.p == null ? hkzt.a : hkzw0.p).d);
            feki0.d(4, (hkzw0.p == null ? hkzt.a : hkzw0.p).e);
            feki0.d(5, (hkzw0.p == null ? hkzt.a : hkzw0.p).f);
        }
        if(hkzw0.c == 12) {
            feki0.e(12);
            feki0.c(1, (hkzw0.c == 12 ? ((hkzs)hkzw0.d) : hkzs.a).b);
        }
        if(hkzw0.c == 13) {
            feki0.e(13);
            feki0.h(1, (hkzw0.c == 13 ? ((hkzv)hkzw0.d) : hkzv.a).b);
            feki0.c(2, (hkzw0.c == 13 ? ((hkzv)hkzw0.d) : hkzv.a).c);
        }
        return feki0.a();
    }
}

