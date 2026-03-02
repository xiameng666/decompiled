final class ilp extends ibur implements ibth {
    final iqj a;
    final ilt b;

    public ilp(iqj iqj0, ilt ilt0) {
        this.a = iqj0;
        this.b = ilt0;
        super(0);
    }

    @Override  // ibth
    public final Object a() {
        iqj iqj0 = this.a;
        itu itu0 = iqj0.d;
        itu itu1 = iqj0.e;
        Float float0 = iqj0.b;
        Float float1 = iqj0.c;
        if((itu0 == null || float0 == null ? 0.0f : ((Number)itu0.a.a()).floatValue() - ((float)float0)) != 0.0f || (itu1 == null || float1 == null ? 0.0f : ((Number)itu1.a.a()).floatValue() - ((float)float1)) != 0.0f) {
            ilt ilt0 = this.b;
            int v = ilt0.m(iqj0.a);
            iui iui0 = (iui)ilt0.q().a(ilt0.e);
            if(iui0 != null) {
                khb khb0 = ilt0.g;
                if(khb0 != null) {
                    try {
                        khb0.v(ilt0.n(iui0));
                    }
                    catch(IllegalStateException unused_ex) {
                    }
                }
            }
            ilt ilt1 = this.b;
            iui iui1 = (iui)ilt1.q().a(ilt1.f);
            if(iui1 != null) {
                khb khb1 = ilt1.h;
                if(khb1 != null) {
                    try {
                        khb1.v(ilt1.n(iui1));
                    }
                    catch(IllegalStateException unused_ex) {
                    }
                }
            }
            ilt ilt2 = this.b;
            ilt2.b.invalidate();
            iui iui2 = (iui)ilt2.q().a(v);
            if(iui2 != null) {
                iug iug0 = iui2.a;
                if(iug0 != null) {
                    ify ify0 = iug0.a;
                    if(ify0 != null) {
                        if(itu0 != null) {
                            ilt2.v.g(v, itu0);
                        }
                        if(itu1 != null) {
                            ilt2.w.g(v, itu1);
                        }
                        ilt2.u(ify0);
                    }
                }
            }
        }
        if(itu0 != null) {
            this.a.b = (Float)itu0.a.a();
        }
        if(itu1 != null) {
            this.a.c = (Float)itu1.a.a();
        }
        return ibom.a;
    }
}

