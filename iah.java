public final class iah extends ibp {
    private final igl a;

    public iah(igl igl0) {
        this.a = igl0;
    }

    @Override  // ibp
    public final float dX() {
        return this.a.dX();
    }

    @Override  // ibp
    public final float dY() {
        return this.a.dY();
    }

    @Override  // ibp
    public final int n() {
        return this.a.w();
    }

    @Override  // ibp
    public final hzk o() {
        igl igl0 = this.a;
        hzk hzk0 = igl0.l ? null : igl0.J();
        if(hzk0 == null) {
            igl0.L().v.f();
        }
        return hzk0;
    }

    @Override  // ibp
    public final jlm p() {
        return this.a.p();
    }

    @Override  // ibp
    public final float q(ica ica0) {
        float f;
        ibtw ibtw0 = ica0.a;
        if(ibtw0 != null) {
            return ((Number)ibtw0.a(this, Float.valueOf(NaNf))).floatValue();
        }
        igl igl0 = this.a;
        if(igl0.l) {
            return NaNf;
        }
        igl igl1 = igl0;
        while(true) {
            ijd ijd0 = igl1.n;
            if(ijd0 != null) {
                int v = ibpg.A(ijd0.b, ica0);
                if(v >= 0) {
                    f = ijd0.c[v];
                    goto label_14;
                }
            }
            f = NaNf;
        label_14:
            if(!Float.isNaN(f)) {
                igl1.P(igl0.L(), ica0);
                return ica0.a(f, igl1.J(), igl0.J());
            }
            igl igl2 = igl1.O();
            if(igl2 == null) {
                igl1.P(igl0.L(), ica0);
                return NaNf;
            }
            igl1 = igl2;
        }
    }
}

