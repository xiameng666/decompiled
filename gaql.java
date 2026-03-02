import android.content.Context;

public final class gaql {
    public final Context a;
    public final ibnn b;
    public final ibnn c;
    public final icck d;
    private final iccd e;

    public gaql(Context context0, iccd iccd0) {
        ibuq.f(context0, "applicationContext");
        ibuq.f(iccd0, "dispatcher");
        super();
        this.a = context0;
        this.e = iccd0;
        this.b = new ibnz(new gaqd(this));
        this.c = new ibnz(new gaqe(this));
        this.d = iccl.b(iccd0);
    }

    public final Object a(String s, ibrl ibrl0) {
        gaqf gaqf0;
        if((ibrl0 instanceof gaqf)) {
            gaqf0 = (gaqf)ibrl0;
            int v = gaqf0.c;
            if((v & 0x80000000) == 0) {
                gaqf0 = new gaqf(this, ibrl0);
            }
            else {
                gaqf0.c = v - 0x80000000;
            }
        }
        else {
            gaqf0 = new gaqf(this, ibrl0);
        }
        Object object0 = gaqf0.a;
        Object object1 = ibrx.a;
        switch(gaqf0.c) {
            case 0: {
                ibnx.b(object0);
                try {
                    gaqi gaqi0 = new gaqi(this, s, null);
                    gaqf0.c = 1;
                    object0 = icbd.a(this.e, gaqi0, gaqf0);
                    if(object0 == object1) {
                        return object1;
                    label_19:
                        ibnx.b(object0);
                    }
                    return (gbkt)object0;
                }
                catch(Throwable throwable0) {
                    break;
                }
            }
            case 1: {
                goto label_19;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        return ibnx.a(throwable0);
    }

    public final Object b(ibrl ibrl0) {
        Object object2;
        gaqk gaqk0;
        if((ibrl0 instanceof gaqk)) {
            gaqk0 = (gaqk)ibrl0;
            int v = gaqk0.c;
            if((v & 0x80000000) == 0) {
                gaqk0 = new gaqk(this, ibrl0);
            }
            else {
                gaqk0.c = v - 0x80000000;
            }
        }
        else {
            gaqk0 = new gaqk(this, ibrl0);
        }
        Object object0 = gaqk0.a;
        Object object1 = ibrx.a;
        switch(gaqk0.c) {
            case 0: {
                ibnx.b(object0);
                gaqk0.c = 1;
                object2 = this.a("RedirectAction", gaqk0);
                if(object2 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                ibnx.b(object0);
                object2 = ((ibnw)object0).a;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(ibnw.a(object2) != null) {
            return null;
        }
        ibnx.b(object2);
        return ((gbkt)object2) != null ? ((gbkt)object2).a : null;
    }
}

