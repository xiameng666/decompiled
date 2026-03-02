public final class dmua implements gftc {
    public final hkhr a;

    public dmua(hkhr hkhr0) {
        this.a = hkhr0;
    }

    @Override  // gftc
    public final boolean a(Object object0) {
        boolean z;
        hjwt hjwt0 = this.a.d == null ? hjwt.a : this.a.d;
        hkhr hkhr0 = ((dxev)object0).c;
        if(hkhr0 == null) {
            hkhr0 = hkhr.b;
        }
        hjwt hjwt1 = hkhr0.d == null ? hjwt.a : hkhr0.d;
        if((hjwt0.b & 1) != 0 && (hjwt1.b & 1) != 0) {
            if((hjwt0.c == null ? hjwv.a : hjwt0.c).b != (hjwt1.c == null ? hjwv.a : hjwt1.c).b) {
                return false;
            }
            z = true;
        }
        else {
            z = false;
        }
        if((hjwt0.b & 2) != 0 && (hjwt1.b & 2) != 0) {
            if(!(hjwt0.d == null ? hjwq.a : hjwt0.d).b.equals((hjwt1.d == null ? hjwq.a : hjwt1.d).b)) {
                return false;
            }
            z = true;
        }
        if((hjwt0.b & 4) != 0 && (hjwt1.b & 4) != 0 && !(hjwt0.e == null ? hjwx.a : hjwt0.e).c.isEmpty() && !(hjwt1.e == null ? hjwx.a : hjwt1.e).c.isEmpty()) {
            hjwx hjwx0 = hjwt0.e;
            hjwx hjwx1 = hjwx0 == null ? hjwx.a : hjwx0;
            hjwx hjwx2 = hjwt1.e;
            hjwx hjwx3 = hjwx2 == null ? hjwx.a : hjwx2;
            if((hjww.b(hjwx1.b) == null ? hjww.l : hjww.b(hjwx1.b)) == (hjww.b(hjwx3.b) == null ? hjww.l : hjww.b(hjwx3.b))) {
                if(hjwx0 == null) {
                    hjwx0 = hjwx.a;
                }
                String s = hjwx0.c;
                if(hjwx2 == null) {
                    hjwx2 = hjwx.a;
                }
                if(s.equals(hjwx2.c)) {
                    return (hjwt0.b & 8) == 0 || (hjwt1.b & 8) == 0 ? true : (hjwt0.f == null ? hjxd.a : hjwt0.f).c == (hjwt1.f == null ? hjxd.a : hjwt1.f).c;
                }
            }
            return false;
        }
        return (hjwt0.b & 8) == 0 || (hjwt1.b & 8) == 0 ? z : (hjwt0.f == null ? hjxd.a : hjwt0.f).c == (hjwt1.f == null ? hjxd.a : hjwt1.f).c;
    }
}

