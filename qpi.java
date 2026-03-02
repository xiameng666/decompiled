import android.content.Context;

final class qpi extends ibsl implements ibtw {
    Object a;
    int b;
    int c;
    final ibtx d;
    final Context e;
    final qow f;
    final String g;
    final String h;
    final gra i;

    public qpi(ibtx ibtx0, Context context0, qow qow0, gra gra0, ibrl ibrl0) {
        this.d = ibtx0;
        this.e = context0;
        this.f = qow0;
        this.g = "fonts/";
        this.h = "__LottieInternalDefaultCacheKey__";
        this.i = gra0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((qpi)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new qpi(this.d, this.e, this.f, this.i, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Throwable throwable2;
        String s2;
        String s1;
        String s;
        qow qow0;
        Context context0;
        qpi qpi0;
        Object object2;
        int v;
        Object object3;
        int v1;
        Object object1 = ibrx.a;
        switch(this.c) {
            case 0: {
                ibnx.b(object0);
                v1 = 0;
                object3 = null;
                goto label_44;
            }
            case 1: {
                v1 = this.b;
                object3 = this.a;
                ibnx.b(object0);
                break;
            }
            default: {
                try {
                    v = this.b;
                    object2 = this.a;
                    ibnx.b(object0);
                    qpi0 = this;
                    goto label_40;
                }
                catch(Throwable throwable0) {
                    goto label_26;
                }
            }
        }
    label_14:
        while(((Boolean)object0).booleanValue()) {
            do {
                try {
                    v = v1;
                    object2 = object3;
                    context0 = this.e;
                    qow0 = this.f;
                    s = qpj.c(null);
                    s1 = qpj.c(this.g);
                    s2 = ".ttf";
                    if(!ibzk.D(".ttf")) {
                        goto label_23;
                    }
                    goto label_30;
                }
                catch(Throwable throwable1) {
                    qpi0 = this;
                    throwable2 = throwable1;
                    v1 = v + 1;
                    object3 = throwable2;
                    goto label_43;
                }
                try {
                label_23:
                    if(!ibzk.W(".ttf", ".")) {
                        goto label_29;
                    }
                    goto label_30;
                }
                catch(Throwable throwable0) {
                label_26:
                    throwable2 = throwable0;
                    qpi0 = this;
                    v1 = v + 1;
                    object3 = throwable2;
                    goto label_43;
                }
            label_29:
                s2 = "..ttf";
                try {
                label_30:
                    this.a = object2;
                    this.b = v;
                    this.c = 2;
                    qpi0 = this;
                }
                catch(Throwable throwable1) {
                    qpi0 = this;
                    throwable2 = throwable1;
                    v1 = v + 1;
                    object3 = throwable2;
                    goto label_43;
                }
                try {
                    object0 = qpj.b(context0, qow0, s, s1, s2, this.h, qpi0);
                    if(object0 == object1) {
                        return object1;
                    }
                label_40:
                    qpj.a(qpi0.i).e(((qkb)object0));
                    object3 = object2;
                    v1 = v;
                }
                catch(Throwable throwable1) {
                    throwable2 = throwable1;
                    v1 = v + 1;
                    object3 = throwable2;
                }
            label_43:
                this = qpi0;
            label_44:
                if(((Boolean)qpj.a(this.i).a.a()).booleanValue()) {
                    break label_14;
                }
            }
            while(v1 == 0);
            ibuq.c(object3);
            this.a = object3;
            this.b = v1;
            this.c = 1;
            object0 = this.d.a(new Integer(v1), object3, this);
            if(object0 != object1) {
                continue;
            }
            try {
                return object1;
            }
            catch(Throwable throwable1) {
            }
            throwable2 = throwable1;
            v1 = v + 1;
            object3 = throwable2;
            goto label_43;
        }
        gra gra0 = this.i;
        if(!qpj.a(gra0).c() && object3 != null) {
            qpj.a(gra0).f(((Throwable)object3));
        }
        return ibom.a;
    }
}

