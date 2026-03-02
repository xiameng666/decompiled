import java.util.LinkedHashMap;
import java.util.Map;

public final class ctvs {
    public final ctpd a;
    public final bboh b;
    public final icmn c;
    public final Map d;
    private final ibrt e;

    public ctvs(ctpd ctpd0, ibrt ibrt0) {
        ibuq.f(ctpd0, "rpcClientManager");
        super();
        this.a = ctpd0;
        this.e = ibrt0;
        this.b = ctnb.a("NotificationSync", new ibuk(this.getClass()));
        this.c = icmu.e(0, 0, 0, 7);
        this.d = new LinkedHashMap();
    }

    public final Object a(ibrl ibrl0) {
        ctvr ctvr0;
        if((ibrl0 instanceof ctvr)) {
            ctvr0 = (ctvr)ibrl0;
            int v = ctvr0.c;
            if((v & 0x80000000) == 0) {
                ctvr0 = new ctvr(this, ibrl0);
            }
            else {
                ctvr0.c = v - 0x80000000;
            }
        }
        else {
            ctvr0 = new ctvr(this, ibrl0);
        }
        Object object0 = ctvr0.a;
        Object object1 = ibrx.a;
        switch(ctvr0.c) {
            case 0: {
                ibnx.b(object0);
                ((ggtj)this.b.h()).x("Starting discovery");
                this.a.c("NotificationSyncRpcService");
                try {
                    ctvr0.c = 1;
                    ctvp ctvp0 = new ctvp(this, null);
                    Object object2 = icbd.a(this.e, ctvp0, ctvr0);
                    if(object2 != object1) {
                        object2 = ibom.a;
                    }
                    if(object2 == object1) {
                        return object1;
                    label_23:
                        ibnx.b(object0);
                    }
                    break;
                }
                catch(Throwable throwable0) {
                    goto label_26;
                }
            }
            case 1: {
                goto label_23;
            label_26:
                this.a.a("NotificationSyncRpcService");
                for(Object object3: this.d.values()) {
                    iceb.a(((iced)object3));
                }
                throw throwable0;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        this.a.a("NotificationSyncRpcService");
        for(Object object4: this.d.values()) {
            iceb.a(((iced)object4));
        }
        return ibom.a;
    }
}

