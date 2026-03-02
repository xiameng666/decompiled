import com.google.android.gms.common.Feature;

public final class ctbn {
    private final csrd a;

    public ctbn(csrd csrd0) {
        this.a = csrd0;
    }

    public final Object a(ibrl ibrl0) {
        ctbm ctbm0;
        if((ibrl0 instanceof ctbm)) {
            ctbm0 = (ctbm)ibrl0;
            int v = ctbm0.c;
            if((v & 0x80000000) == 0) {
                ctbm0 = new ctbm(this, ibrl0);
            }
            else {
                ctbm0.c = v - 0x80000000;
            }
        }
        else {
            ctbm0 = new ctbm(this, ibrl0);
        }
        Object object0 = ctbm0.a;
        Object object1 = ibrx.a;
        switch(ctbm0.c) {
            case 0: {
                ibnx.b(object0);
                azzc azzc0 = new azzc();
                azzc0.a = new ctcn();
                azzc0.c = new Feature[]{csre.a};
                azzc0.d = 33001;
                azzd azzd0 = azzc0.a();
                evql evql0 = ((azts)this.a).iG(azzd0);
                try {
                    ctbm0.c = 1;
                    return ictn.b(evql0, ctbm0) != object1 ? Boolean.valueOf(true) : object1;
                label_24:
                    ibnx.b(object0);
                    return Boolean.valueOf(true);
                }
                catch(aztb unused_ex) {
                    return Boolean.valueOf(false);
                }
            }
            case 1: {
                goto label_24;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

