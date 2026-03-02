import android.os.Bundle;

public final class gbaf extends gaxs {
    public final gbal a;
    public final gbaf b;
    public final gazp c;

    public gbaf(gazp gazp0, Bundle bundle0) {
        Object object0;
        gazo gazo0;
        int v1;
        gbal gbal0;
        this.c = gazp0;
        if(bundle0 == null) {
            gbal0 = new gbal(null);
        }
        else {
            int v = bundle0.getInt("TTR_veId_generator_next_id", -1);
            gbal0 = v == -1 ? null : new gbal(v);
            if(gbal0 == null) {
                gbal0 = new gbal(null);
            }
        }
        this.a = gbal0;
        if(bundle0 == null) {
        label_36:
            gazo0 = null;
        }
        else {
            Bundle bundle1 = bundle0.getBundle("TTRC_context_extra");
            if(bundle1 == null) {
                bundle1 = new Bundle();
            }
            fbbj fbbj0 = fbbj.a;
            fbbj fbbj1 = (fbbj)gawi.e(bundle0, "TTRC_context_proto", ((MessageLite)fbbj0));
            if(fbbj1 == null) {
                ibuq.e(fbbj0, "getDefaultInstance(...)");
            }
            else {
                fbbj0 = fbbj1;
            }
            try {
                switch(fbbj0.b) {
                    case 0: {
                        v1 = 3;
                        break;
                    }
                    case 1: {
                        v1 = 1;
                        break;
                    }
                    case 2: {
                        v1 = 2;
                        break;
                    }
                    default: {
                        v1 = 0;
                    }
                }
                if(v1 == 0) {
                    throw null;
                }
                switch(v1 - 1) {
                    case 0: {
                        gazo0 = new gbak(fbbj0, bundle1);
                        break;
                    }
                    case 1: {
                        gazo0 = new gazl(fbbj0, bundle1);
                        break;
                    }
                    case 2: {
                        goto label_36;
                    }
                    default: {
                        throw new ibnq();
                    }
                }
            }
            catch(IllegalArgumentException unused_ex) {
                goto label_36;
            }
        }
        try {
            gawd.a(gazp0.a);
            ibnx.b(gazq.a((gazp0.d == null ? null : new ibnw(gazp0.d.c()))));
            gazp0.d = null;
            gazp0.b = null;
            if(gazo0 != null) {
                gazp0.b = gazo0;
                gazp0.d = gazp0.c();
            }
            object0 = ibom.a;
        }
        catch(Throwable throwable0) {
            object0 = ibnx.a(throwable0);
        }
        gaxl.a();
        gbaj gbaj0 = gaxm.y() ? gbaj.a : gbab.a;
        Throwable throwable1 = ibnw.a(object0);
        if(throwable1 != null) {
            try {
                object0 = gbaj0.a(throwable1);
            }
            catch(Throwable throwable2) {
                object0 = ibnx.a(throwable2);
            }
        }
        ibnx.b(object0);
        this.b = this;
    }

    @Override  // gaxs
    public final void aZ() {
        Object object0;
        super.aZ();
        try {
            gawd.a(this.c.a);
            gazs gazs0 = this.c.d;
            object0 = new ibnw(gazq.a((gazs0 == null ? null : new ibnw(gazs0.c()))));
        }
        catch(Throwable throwable0) {
            object0 = ibnx.a(throwable0);
        }
        Throwable throwable1 = ibnw.a(object0);
        if(throwable1 != null) {
            object0 = new ibnw(ibnx.a(throwable1));
        }
        Object object1 = ((ibnw)object0).a;
        gaxl.a();
        gbaj gbaj0 = gaxm.y() ? gbaj.a : gbaa.a;
        Throwable throwable2 = ibnw.a(object1);
        if(throwable2 != null) {
            try {
                object1 = gbaj0.a(throwable2);
            }
            catch(Throwable throwable3) {
                object1 = ibnx.a(throwable3);
            }
        }
        ibnx.b(object1);
    }

    @Override  // gaxs
    protected final void lw() {
        Object object0;
        try {
            gawd.a(this.c.a);
            gazs gazs0 = this.c.d;
            object0 = new ibnw(gazq.a((gazs0 == null ? null : new ibnw(gazs0.a()))));
        }
        catch(Throwable throwable0) {
            object0 = ibnx.a(throwable0);
        }
        Throwable throwable1 = ibnw.a(object0);
        if(throwable1 != null) {
            object0 = new ibnw(ibnx.a(throwable1));
        }
        Object object1 = ((ibnw)object0).a;
        gaxl.a();
        gbaj gbaj0 = gaxm.y() ? gbaj.a : gazy.a;
        Throwable throwable2 = ibnw.a(object1);
        if(throwable2 != null) {
            try {
                object1 = gbaj0.a(throwable2);
            }
            catch(Throwable throwable3) {
                object1 = ibnx.a(throwable3);
            }
        }
        ibnx.b(object1);
    }

    @Override  // gaxs
    protected final void lx(Bundle bundle0) {
        Object object0;
        try {
            bundle0.putInt("TTR_veId_generator_next_id", this.a.a);
            gazo gazo0 = this.c.b;
            if(gazo0 != null) {
                fbbj fbbj0 = gazo0.a;
                if(fbbj0 != null) {
                    hfxk.m(bundle0, "TTRC_context_proto", ((MessageLite)fbbj0));
                }
            }
            bundle0.putBundle("TTRC_context_extra", (gazo0 == null ? null : gazo0.b));
            object0 = ibom.a;
        }
        catch(Throwable throwable0) {
            object0 = ibnx.a(throwable0);
        }
        gaxl.a();
        gbaj gbaj0 = gaxm.y() ? gbaj.a : gazz.a;
        Throwable throwable1 = ibnw.a(object0);
        if(throwable1 != null) {
            try {
                object0 = gbaj0.a(throwable1);
            }
            catch(Throwable throwable2) {
                object0 = ibnx.a(throwable2);
            }
        }
        ibnx.b(object0);
    }

    @Override  // gaxs
    protected final void nb() {
        Object object0 = this.c.b();
        gaxl.a();
        gbaj gbaj0 = gaxm.y() ? gbaj.a : gazx.a;
        Throwable throwable0 = ibnw.a(object0);
        if(throwable0 != null) {
            try {
                object0 = gbaj0.a(throwable0);
            }
            catch(Throwable throwable1) {
                object0 = ibnx.a(throwable1);
            }
        }
        ibnx.b(object0);
    }
}

