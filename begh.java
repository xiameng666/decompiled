import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CancellationException;

public final class begh {
    public final icig a;
    private final bdbm b;
    private final ibts c;

    public begh(bdbm bdbm0) {
        this.b = bdbm0;
        this.c = new ghna(new begf(this, null));
        this.a = new icht(new begg(this, null));
    }

    public static Object a(begh begh0, ibrl ibrl0) {
        begd begd0;
        if((ibrl0 instanceof begd)) {
            begd0 = (begd)ibrl0;
            int v = begd0.c;
            if((v & 0x80000000) == 0) {
                begd0 = new begd(begh0, ibrl0);
            }
            else {
                begd0.c = v - 0x80000000;
            }
        }
        else {
            begd0 = new begd(begh0, ibrl0);
        }
        Object object0 = begd0.a;
        Object object1 = ibrx.a;
        switch(begd0.c) {
            case 0: {
                ibnx.b(object0);
                try {
                    begd0.c = 1;
                    object0 = begh0.c.a(begd0);
                    if(object0 == object1) {
                        return object1;
                    label_18:
                        ibnx.b(object0);
                    }
                    return (List)object0;
                }
                catch(aztb | CancellationException unused_ex) {
                    break;
                }
            }
            case 1: {
                goto label_18;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        return null;
    }

    public final Object b(ibrl ibrl0) {
        bege bege0;
        if((ibrl0 instanceof bege)) {
            bege0 = (bege)ibrl0;
            int v = bege0.c;
            if((v & 0x80000000) == 0) {
                bege0 = new bege(this, ibrl0);
            }
            else {
                bege0.c = v - 0x80000000;
            }
        }
        else {
            bege0 = new bege(this, ibrl0);
        }
        Object object0 = bege0.a;
        Object object1 = ibrx.a;
        switch(bege0.c) {
            case 0: {
                ibnx.b(object0);
                if(hsas.a.b().g()) {
                    evql evql0 = this.b.c();
                    bege0.c = 1;
                    object0 = ictn.b(evql0, bege0);
                    if(object0 == object1) {
                        return object1;
                    }
                    goto label_26;
                }
                evql evql1 = this.b.c();
                bege0.c = 2;
                object0 = ictn.b(evql1, bege0);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                ibnx.b(object0);
            label_26:
                ibuq.e(object0, "await(...)");
                Object object2 = new ArrayList();
                for(Object object3: ((Iterable)object0)) {
                    if(!((heqb)object3).l) {
                        ((Collection)object2).add(object3);
                    }
                }
                return object2;
            }
            case 2: {
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        ibuq.c(object0);
        return (List)object0;
    }
}

