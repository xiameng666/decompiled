import java.util.List;

public final class dnpx {
    public static gfsx a(dxev dxev0, hkid hkid0) {
        return dnpx.b((dxev0.c == null ? hkhr.b : dxev0.c), hkid0);
    }

    public static gfsx b(hkhr hkhr0, hkid hkid0) {
        return gggq.c(hkhr0.n, new dnpw(hkid0));
    }

    public static hkhs c(hkhr hkhr0, hkid[] arr_hkid) {
        for(int v = 0; v < arr_hkid.length; ++v) {
            hkid hkid0 = arr_hkid[v];
            for(Object object0: hkhr0.n) {
                hkhs hkhs0 = (hkhs)object0;
                if((hkid.b(hkhs0.c) == null ? hkid.z : hkid.b(hkhs0.c)).equals(hkid0)) {
                    return hkhs0;
                }
            }
        }
        return null;
    }

    public static hkhs d(hkhr hkhr0) {
        return dnpx.c(hkhr0, new hkid[]{hkid.g, hkid.i, hkid.h, hkid.w, hkid.x});
    }

    public static hkim e(dxev dxev0) {
        hkhr hkhr0;
        if(dxev0 != null) {
            if((dxev0.b & 1) == 0) {
                hkhr0 = null;
            }
            else {
                hkhr0 = dxev0.c;
                if(hkhr0 == null) {
                    hkhr0 = hkhr.b;
                }
            }
            if(hkhr0 != null && (hkhr0.c & 0x20) != 0 && ((hkhr0.q == null ? hkhh.a : hkhr0.q).b & 2) != 0) {
                hkhh hkhh0 = hkhr0.q == null ? hkhh.a : hkhr0.q;
                hkim hkim0 = hkim.b((hkhh0.g == null ? hkir.a : hkhh0.g).e);
                return hkim0 == null ? hkim.r : hkim0;
            }
            return hkim.a;
        }
        return hkim.a;
    }

    public static hktu f(dxev dxev0) {
        hkhr hkhr0;
        if(dxev0 != null) {
            if((dxev0.b & 1) == 0) {
                hkhr0 = null;
            }
            else {
                hkhr0 = dxev0.c;
                if(hkhr0 == null) {
                    hkhr0 = hkhr.b;
                }
            }
            if(hkhr0 != null && (hkhr0.c & 0x20) != 0 && ((hkhr0.q == null ? hkhh.a : hkhr0.q).b & 2) != 0) {
                hkhh hkhh0 = hkhr0.q == null ? hkhh.a : hkhr0.q;
                hktu hktu0 = hktu.b((hkhh0.g == null ? hkir.a : hkhh0.g).f);
                return hktu0 == null ? hktu.D : hktu0;
            }
            return hktu.a;
        }
        return hktu.a;
    }

    public static boolean g(dxev dxev0, dxev dxev1) {
        if(((ProtoLiteMessage)(dxev0.d == null ? dxet.a : dxev0.d)).equals((dxev1.d == null ? dxet.a : dxev1.d)) && dxev0.e.equals(dxev1.e) && (dxeu.a(dxev0.f) == 0 ? 1 : dxeu.a(dxev0.f)) == (dxeu.a(dxev1.f) == 0 ? 1 : dxeu.a(dxev1.f))) {
            dylf dylf0 = dxev0.g == null ? dylf.a : dxev0.g;
            dylf dylf1 = dxev1.g == null ? dylf.a : dxev1.g;
            return ((ProtoLiteMessage)(dylf0.d == null ? dylc.a : dylf0.d)).equals((dylf1.d == null ? dylc.a : dylf1.d)) ? dnpx.h((dxev0.c == null ? hkhr.b : dxev0.c), (dxev1.c == null ? hkhr.b : dxev1.c)) : false;
        }
        return false;
    }

    public static boolean h(hkhr hkhr0, hkhr hkhr1) {
        hjwt hjwt0 = hkhr0.d == null ? hjwt.a : hkhr0.d;
        hjwt hjwt1 = hkhr1.d == null ? hjwt.a : hkhr1.d;
        if((hjwt0.b & 1) == 0) {
            if((hjwt1.b & 1) == 0) {
            label_6:
                if((hjwt0.b & 2) == 0) {
                    if((hjwt1.b & 2) == 0) {
                    label_10:
                        if((hjwt0.b & 4) != 0) {
                            if((hjwt1.b & 4) != 0) {
                                hjwx hjwx0 = hjwt1.e == null ? hjwx.a : hjwt1.e;
                                hjwx hjwx1 = hjwt0.e;
                                hjwx hjwx2 = hjwx1 == null ? hjwx.a : hjwx1;
                                if((hjww.b(hjwx0.b) == null ? hjww.l : hjww.b(hjwx0.b)) == (hjww.b(hjwx2.b) == null ? hjww.l : hjww.b(hjwx2.b))) {
                                    String s = (hjwt1.e == null ? hjwx.a : hjwt1.e).c;
                                    if(hjwx1 == null) {
                                        hjwx1 = hjwx.a;
                                    }
                                    if(s.equals(hjwx1.c)) {
                                        return !(hkhm.b(hkhr0.f) == null ? hkhm.k : hkhm.b(hkhr0.f)).equals((hkhm.b(hkhr1.f) == null ? hkhm.k : hkhm.b(hkhr1.f))) || !hkhr0.h.equals(hkhr1.h) || !hkhr0.i.equals(hkhr1.i) || !hkhr0.j.equals(hkhr1.j) || (!((ProtoLiteMessage)(hkhr0.k == null ? hkhk.a : hkhr0.k)).equals((hkhr1.k == null ? hkhk.a : hkhr1.k)) || !hkhr0.l.equals(hkhr1.l) || !hkhr0.m.equals(hkhr1.m) || !hkhr0.n.equals(hkhr1.n)) || (!((ProtoLiteMessage)(hkhr0.o == null ? hkij.a : hkhr0.o)).equals((hkhr1.o == null ? hkij.a : hkhr1.o)) || !new hfuh(hkhr0.g, hkhr.a).equals(new hfuh(hkhr1.g, hkhr.a))) || !((ProtoLiteMessage)(hkhr0.p == null ? hkhe.a : hkhr0.p)).equals((hkhr1.p == null ? hkhe.a : hkhr1.p)) || !((ProtoLiteMessage)(hkhr0.q == null ? hkhh.a : hkhr0.q)).equals((hkhr1.q == null ? hkhh.a : hkhr1.q)) || !((ProtoLiteMessage)(hkhr0.r == null ? hkgz.a : hkhr0.r)).equals((hkhr1.r == null ? hkgz.a : hkhr1.r)) || !((ProtoLiteMessage)(hkhr0.u == null ? hkhj.a : hkhr0.u)).equals((hkhr1.u == null ? hkhj.a : hkhr1.u)) || !((ProtoLiteMessage)(hkhr0.s == null ? hkhp.a : hkhr0.s)).equals((hkhr1.s == null ? hkhp.a : hkhr1.s)) ? false : ((ProtoLiteMessage)(hkhr0.t == null ? hkhc.a : hkhr0.t)).equals((hkhr1.t == null ? hkhc.a : hkhr1.t));
                                    }
                                }
                            }
                        }
                        else if((hjwt1.b & 4) == 0) {
                            return !(hkhm.b(hkhr0.f) == null ? hkhm.k : hkhm.b(hkhr0.f)).equals((hkhm.b(hkhr1.f) == null ? hkhm.k : hkhm.b(hkhr1.f))) || !hkhr0.h.equals(hkhr1.h) || !hkhr0.i.equals(hkhr1.i) || !hkhr0.j.equals(hkhr1.j) || (!((ProtoLiteMessage)(hkhr0.k == null ? hkhk.a : hkhr0.k)).equals((hkhr1.k == null ? hkhk.a : hkhr1.k)) || !hkhr0.l.equals(hkhr1.l) || !hkhr0.m.equals(hkhr1.m) || !hkhr0.n.equals(hkhr1.n)) || (!((ProtoLiteMessage)(hkhr0.o == null ? hkij.a : hkhr0.o)).equals((hkhr1.o == null ? hkij.a : hkhr1.o)) || !new hfuh(hkhr0.g, hkhr.a).equals(new hfuh(hkhr1.g, hkhr.a))) || !((ProtoLiteMessage)(hkhr0.p == null ? hkhe.a : hkhr0.p)).equals((hkhr1.p == null ? hkhe.a : hkhr1.p)) || !((ProtoLiteMessage)(hkhr0.q == null ? hkhh.a : hkhr0.q)).equals((hkhr1.q == null ? hkhh.a : hkhr1.q)) || !((ProtoLiteMessage)(hkhr0.r == null ? hkgz.a : hkhr0.r)).equals((hkhr1.r == null ? hkgz.a : hkhr1.r)) || !((ProtoLiteMessage)(hkhr0.u == null ? hkhj.a : hkhr0.u)).equals((hkhr1.u == null ? hkhj.a : hkhr1.u)) || !((ProtoLiteMessage)(hkhr0.s == null ? hkhp.a : hkhr0.s)).equals((hkhr1.s == null ? hkhp.a : hkhr1.s)) ? false : ((ProtoLiteMessage)(hkhr0.t == null ? hkhc.a : hkhr0.t)).equals((hkhr1.t == null ? hkhc.a : hkhr1.t));
                        }
                    }
                }
                else if((hjwt1.b & 2) != 0 && (hjwt1.d == null ? hjwq.a : hjwt1.d).b.equals((hjwt0.d == null ? hjwq.a : hjwt0.d).b)) {
                    goto label_10;
                }
            }
        }
        else if((hjwt1.b & 1) != 0 && (hjwt1.c == null ? hjwv.a : hjwt1.c).b == (hjwt0.c == null ? hjwv.a : hjwt0.c).b) {
            goto label_6;
        }
        return false;
    }

    public static boolean i(dxev dxev0, List list0) {
        hkim hkim0 = dnpx.e(dxev0);
        hktu hktu0 = dnpx.f(dxev0);
        int v = 0;
        for(Object object0: list0) {
            dxev dxev1 = (dxev)object0;
            if(hkim0 == dnpx.e(dxev1) && hktu0 == dnpx.f(dxev1)) {
                ++v;
            }
        }
        return v > 1;
    }

    public static boolean j(dxev dxev0) {
        return dnpx.m(dxev0) && dnpx.k(dxev0);
    }

    public static boolean k(dxev dxev0) {
        hkhr hkhr0 = dxev0.c == null ? hkhr.b : dxev0.c;
        hkhh hkhh0 = hkhr0.q == null ? hkhh.a : hkhr0.q;
        hkir hkir0 = hkhh0.g == null ? hkir.a : hkhh0.g;
        return (hkiq.b(hkir0.h) == null ? hkiq.f : hkiq.b(hkir0.h)) == hkiq.d;
    }

    public static boolean l(dxev dxev0) {
        return dnpx.e(dxev0).equals(hkim.p) || dnpx.f(dxev0).equals(hktu.B);
    }

    public static boolean m(dxev dxev0) {
        hkhr hkhr0 = dxev0.c == null ? hkhr.b : dxev0.c;
        hkhh hkhh0 = hkhr0.q == null ? hkhh.a : hkhr0.q;
        hkir hkir0 = hkhh0.g == null ? hkir.a : hkhh0.g;
        hkhr hkhr1 = dxev0.c == null ? hkhr.b : dxev0.c;
        return ((hkhr1.q == null ? hkhh.a : hkhr1.q).b & 2) == 0 || (hkim.b(hkir0.e) == null ? hkim.r : hkim.b(hkir0.e)) == hkim.p || (hktu.b(hkir0.f) == null ? hktu.D : hktu.b(hkir0.f)).equals(hktu.B) || (hkim.b(hkir0.e) == null ? hkim.r : hkim.b(hkir0.e)) == hkim.q ? false : !(hktu.b(hkir0.f) == null ? hktu.D : hktu.b(hkir0.f)).equals(hktu.C);
    }

    public static boolean n(dxev dxev0) {
        return dnpx.m(dxev0) && dnpx.o(dxev0);
    }

    public static boolean o(dxev dxev0) {
        hkhr hkhr0 = dxev0.c == null ? hkhr.b : dxev0.c;
        hkhh hkhh0 = hkhr0.q == null ? hkhh.a : hkhr0.q;
        hkir hkir0 = hkhh0.g == null ? hkir.a : hkhh0.g;
        return (hkiq.b(hkir0.h) == null ? hkiq.f : hkiq.b(hkir0.h)) == hkiq.c;
    }

    public static boolean p(dxev dxev0) {
        hkhr hkhr0 = dxev0.c == null ? hkhr.b : dxev0.c;
        if(((hkhr0.q == null ? hkhh.a : hkhr0.q).b & 2) != 0) {
            hkhr hkhr1 = dxev0.c == null ? hkhr.b : dxev0.c;
            hkhh hkhh0 = hkhr1.q == null ? hkhh.a : hkhr1.q;
            hkir hkir0 = hkhh0.g == null ? hkir.a : hkhh0.g;
            if((hkim.b(hkir0.e) == null ? hkim.r : hkim.b(hkir0.e)) != hkim.o) {
                hkhr hkhr2 = dxev0.c == null ? hkhr.b : dxev0.c;
                hkhh hkhh1 = hkhr2.q == null ? hkhh.a : hkhr2.q;
                hkir hkir1 = hkhh1.g == null ? hkir.a : hkhh1.g;
                return (hktu.b(hkir1.f) == null ? hktu.D : hktu.b(hkir1.f)) == hktu.A;
            }
            return true;
        }
        return false;
    }

    public static boolean q(dxev dxev0) {
        return dnpx.e(dxev0).equals(hkim.q) || dnpx.f(dxev0).equals(hktu.C);
    }

    public static boolean r(dxev dxev0) {
        return dnpx.l(dxev0) || dnpx.q(dxev0);
    }

    public static boolean s(dxev dxev0) {
        return dnpx.m(dxev0) && dnpx.t(dxev0);
    }

    public static boolean t(dxev dxev0) {
        hkhr hkhr0 = dxev0.c == null ? hkhr.b : dxev0.c;
        hkhh hkhh0 = hkhr0.q == null ? hkhh.a : hkhr0.q;
        hkir hkir0 = hkhh0.g == null ? hkir.a : hkhh0.g;
        return (hkiq.b(hkir0.h) == null ? hkiq.f : hkiq.b(hkir0.h)) == hkiq.e;
    }

    public static boolean u(dxev dxev0) {
        return dnpx.m(dxev0) && dnpx.v(dxev0);
    }

    public static boolean v(dxev dxev0) {
        hkhr hkhr0 = dxev0.c == null ? hkhr.b : dxev0.c;
        hkhh hkhh0 = hkhr0.q == null ? hkhh.a : hkhr0.q;
        hkir hkir0 = hkhh0.g == null ? hkir.a : hkhh0.g;
        return (hkiq.b(hkir0.h) == null ? hkiq.f : hkiq.b(hkir0.h)) == hkiq.b;
    }
}

