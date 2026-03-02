import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

final class cjm extends ibsl implements ibtw {
    Object a;
    Object b;
    Object c;
    int d;
    final cji e;
    final cjn f;
    final ibts g;
    private Object h;

    public cjm(cji cji0, cjn cjn0, ibts ibts0, ibrl ibrl0) {
        this.e = cji0;
        this.f = cjn0;
        this.g = ibts0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((cjm)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new cjm(this.e, this.f, this.g, ibrl0);
        ibrl1.h = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object7;
        cjk cjk0;
        Object object3;
        Object object2;
        ibts ibts1;
        Object object4;
        cjk cjk1;
        Object object1 = ibrx.a;
    alab1:
        switch(this.d) {
            case 0: {
                ibnx.b(object0);
                ibrr ibrr0 = ((icck)this.h).c().get(iced.c);
                ibuq.c(ibrr0);
                cjk1 = new cjk(this.e, ((iced)ibrr0));
                object4 = this.f;
                while(true) {
                    AtomicReference atomicReference0 = object4.a;
                    cjk cjk2 = (cjk)atomicReference0.get();
                    if(cjk2 != null && cjk1.a.compareTo(cjk2.a) < 0) {
                        throw new CancellationException("Current mutation had a higher priority");
                    }
                    do {
                        if(atomicReference0.compareAndSet(cjk2, cjk1)) {
                            if(cjk2 != null) {
                                cjj cjj0 = new cjj();
                                cjk2.b.x(cjj0);
                            }
                            object3 = object4.b;
                            ibts ibts0 = this.g;
                            this.h = cjk1;
                            this.a = object3;
                            this.b = ibts0;
                            this.c = object4;
                            this.d = 1;
                            if(((icta)object3).b(this) == object1) {
                                return object1;
                            }
                            ibts1 = ibts0;
                            break alab1;
                        }
                    }
                    while(atomicReference0.get() == cjk2);
                }
            }
            case 1: {
                Object object5 = this.c;
                ibts1 = (ibts)this.b;
                Object object6 = this.a;
                cjk cjk3 = (cjk)this.h;
                ibnx.b(object0);
                object4 = object5;
                object3 = object6;
                cjk1 = cjk3;
                break;
            }
            default: {
                object2 = (cjn)this.b;
                object3 = this.a;
                cjk0 = (cjk)this.h;
                try {
                    ibnx.b(object0);
                    goto label_59;
                }
                catch(Throwable throwable0) {
                    goto label_53;
                }
            }
        }
        try {
            this.h = cjk1;
            this.a = object3;
            this.b = object4;
            this.c = null;
            this.d = 2;
            object7 = ibts1.a(this);
            goto label_55;
        }
        catch(Throwable throwable1) {
            object2 = object4;
            throwable0 = throwable1;
            cjk0 = cjk1;
        }
        try {
        label_53:
            cjl.a(((cjn)object2).a, cjk0);
            throw throwable0;
        label_55:
            if(object7 != object1) {
                object2 = object4;
                object0 = object7;
                cjk0 = cjk1;
            label_59:
                cjl.a(((cjn)object2).a, cjk0);
                goto label_64;
            }
            return object1;
        }
        catch(Throwable throwable2) {
            ((icta)object3).d();
            throw throwable2;
        }
    label_64:
        ((icta)object3).d();
        return object0;
    }
}

