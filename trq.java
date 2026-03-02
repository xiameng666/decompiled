public final class trq extends thq {
    public static final tib a;
    private static final thz f;

    static {
        trq.a = new tib(0x30, 1);
        trq.f = new thz(2);
    }

    public trq(tib tib0, byte[] arr_b) {
        super(tib0, arr_b, trq.f);
    }

    public final tqt h() {
        return new tqt(this.b(tqt.a));
    }

    public final tqu i() {
        return new tqu(this.b(tqu.a));
    }

    public final tqv j() {
        return new tqv(this.b(tqv.a));
    }

    public final tqz k() {
        return new tqz(this.b(tqz.a));
    }

    public final tre l() {
        return new tre(this.b(tre.d));
    }

    public final trf m() {
        return new trf(this.b(trf.a));
    }

    public final trk n() {
        try {
            return new trk(this.b(trk.a));
        }
        catch(IllegalArgumentException unused_ex) {
            return null;
        }
    }

    public final trn o() {
        return new trn(this.b(trn.a));
    }

    public final boolean p() {
        byte[] arr_b = new trn(this.b(trn.a)).k();
        for(int v = 0; v < arr_b.length; ++v) {
            if(arr_b[v] != 0) {
                return false;
            }
        }
        return true;
    }
}

