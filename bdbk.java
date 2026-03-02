import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

public final class bdbk {
    private final azts a;

    public bdbk(azts azts0) {
        ibuq.f(azts0, "client");
        super();
        this.a = azts0;
    }

    public final evql a(gged_interceptors gged0) {
        ibuq.f(gged0, "passwords");
        ArrayList arrayList0 = new ArrayList(ibpo.q(gged0, 10));
        for(Object object0: gged0) {
            String s = ((heqb)object0).d;
            ibuq.e(s, "getSignonRealm(...)");
            arrayList0.add(s);
        }
        return this.b(arrayList0);
    }

    public final evql b(List list0) {
        ibuq.f(list0, "signOnRealms");
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: list0) {
            gqlo gqlo0 = (gqlo)gqlo.b(((String)object0)).g();
            if(gqlo0 != null) {
                arrayList0.add(gqlo0);
            }
        }
        gged_interceptors gged0 = ggdx.a(arrayList0);
        return gged0.isEmpty() ? evrg.d(ggna.a) : this.a.ge(gged0);
    }

    public static Object c(bdbk bdbk0, List list0, ibrl ibrl0) {
        bdbj bdbj0;
        if((ibrl0 instanceof bdbj)) {
            bdbj0 = (bdbj)ibrl0;
            int v = bdbj0.c;
            if((v & 0x80000000) == 0) {
                bdbj0 = new bdbj(bdbk0, ibrl0);
            }
            else {
                bdbj0.c = v - 0x80000000;
            }
        }
        else {
            bdbj0 = new bdbj(bdbk0, ibrl0);
        }
        Object object0 = bdbj0.a;
        Object object1 = ibrx.a;
        switch(bdbj0.c) {
            case 0: {
                ibnx.b(object0);
                try {
                    ArrayList arrayList0 = new ArrayList(ibpo.q(list0, 10));
                    for(Object object2: list0) {
                        arrayList0.add(((heqb)object2).d);
                    }
                    evql evql0 = bdbk0.b(ggdx.a(arrayList0));
                    bdbj0.c = 1;
                    object0 = ictn.b(evql0, bdbj0);
                    if(object0 == object1) {
                        return object1;
                    label_25:
                        ibnx.b(object0);
                    }
                    return (List)object0;
                }
                catch(ExecutionException unused_ex) {
                    break;
                }
                catch(InterruptedException unused_ex) {
                    ibuq.c(ggna.a);
                    return ggna.a;
                }
            }
            case 1: {
                goto label_25;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        ibuq.c(ggna.a);
        return ggna.a;
    }
}

