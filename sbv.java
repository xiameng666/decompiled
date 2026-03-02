import android.content.Context;
import android.os.PersistableBundle;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.function.Supplier;

public final class sbv implements rof, sag {
    public final rof a;
    public final Collection b;
    public final ryf c;
    public final Set d;
    public final Set e;
    private final Supplier f;
    private final rrr g;
    private final icck h;
    private final Supplier i;
    private final ibnn j;

    public sbv(rof rof0, Supplier supplier0, Collection collection0, rrr rrr0, icck icck0, Supplier supplier1, ryf ryf0, Set set0, Set set1) {
        ibuq.f(rof0, "component");
        ibuq.f(collection0, "tasks");
        super();
        this.a = rof0;
        this.f = supplier0;
        this.b = collection0;
        this.g = rrr0;
        this.h = icck0;
        this.i = supplier1;
        this.c = ryf0;
        this.d = set0;
        this.e = set1;
        this.j = new ibnz(new sbi(this));
    }

    @Override  // sag
    public final Object b(ryh ryh0, PersistableBundle persistableBundle0, ibrl ibrl0) {
        ryh ryh1;
        Object object1;
        Object object0;
        sbu sbu0;
        if((ibrl0 instanceof sbu)) {
            sbu0 = (sbu)ibrl0;
            int v = sbu0.c;
            if((v & 0x80000000) == 0) {
                sbu0 = new sbu(this, ibrl0);
            }
            else {
                sbu0.c = v - 0x80000000;
            }
        }
        else {
            sbu0 = new sbu(this, ibrl0);
        }
        try {
            object0 = sbu0.a;
            object1 = ibrx.a;
            switch(sbu0.c) {
                case 0: {
                    goto label_13;
                }
                case 1: {
                    goto label_58;
                }
                case 2: {
                    goto label_65;
                }
            }
        }
        catch(CancellationException cancellationException0) {
            sbv.i(this.c.c(ryh1));
            throw cancellationException0;
        }
        catch(sbw sbw0) {
            sbv.i(this.c.c(ryh1));
            throw sbw0;
        }
        catch(Throwable throwable0) {
            sct.f("OnboardingTaskServiceServer", "Server action failed", throwable0);
            sbv.i(this.c.c(ryh1));
            throw new sbw(ryh1, throwable0);
        }
        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
    label_13:
        ibnx.b(object0);
        try {
            sct.c("OnboardingTaskServiceServer", a.i(ryh0, "startTask[", "]"));
            Context context0 = this.d();
            ibuq.e(context0, "<get-applicationContext>(...)");
            rzq.a(context0);
            sct.c("OnboardingTaskServiceServer", "Creating task for node " + rqy.a(ryh0));
            Supplier supplier0 = (Supplier)((Map)this.j.a()).get(ryh0.o());
            if(supplier0 == null) {
                sct.e("OnboardingTaskServiceServer", a.i(ryh0, "Task for node ", " not found!"));
                throw new IllegalStateException("Task cannot be found.");
            }
            Object object2 = supplier0.get();
            ibuq.c(object2);
            sct.c("OnboardingTaskServiceServer", a.m(((rve)object2), ryh0, "Initialising task instance token=", " task="));
            if(((rve)object2).x()) {
                sct.h("OnboardingTaskServiceServer", a.i(((rve)object2), "Task (", ") was already initialized. Please don\'t reuse the same task instance."));
                throw new IllegalStateException("Attempted to reuse the same task instance.");
            }
            Object object3 = this.i.get();
            ibuq.e(object3, "get(...)");
            ((rve)object2).u(new ruv(ryh0, this.c, this.h, ((sel)object3)));
            sct.c("OnboardingTaskServiceServer", a.a(rqy.a(ryh0), "Task initialised for node ", "."));
            this.c.k(ryh0);
            this.c.i(ryh0, ((rve)object2));
            rxt rxt0 = new rxt(ryu.b(ryh0, ((rve)object2).k()));
            this.c.l(ryh0, rxt0);
            AutoCloseable autoCloseable0 = this.g.a(rrs.b);
            icbr icbr0 = new icbr();
            sbn sbn0 = new sbn(this, ((rve)object2), persistableBundle0, new sbk(icbr0), ryh0, new sbl(autoCloseable0, this, ryh0), null);
            iced iced0 = icbb.b(this.h, null, null, sbn0, 3);
            this.c.h(ryh0, iced0);
            sct.c("OnboardingTaskServiceServer", "startTask: Cached task execution for " + ryh0);
            sbu0.d = ryh0;
            sbu0.c = 1;
            if(icbr0.F(sbu0) == object1) {
                return object1;
            }
        }
        catch(CancellationException cancellationException0) {
            ryh1 = ryh0;
            sbv.i(this.c.c(ryh1));
            throw cancellationException0;
        }
        catch(sbw sbw0) {
            ryh1 = ryh0;
            sbv.i(this.c.c(ryh1));
            throw sbw0;
        }
        catch(Throwable throwable0) {
            ryh1 = ryh0;
            sct.f("OnboardingTaskServiceServer", "Server action failed", throwable0);
            sbv.i(this.c.c(ryh1));
            throw new sbw(ryh1, throwable0);
        }
        ryh1 = ryh0;
        sbu0.d = ryh1;
        sbu0.c = 2;
        return this.c.d(sbu0) == object1 ? object1 : ibom.a;
        try {
        label_58:
            ryh1 = sbu0.d;
            ibnx.b(object0);
            sbu0.d = ryh1;
            sbu0.c = 2;
            return this.c.d(sbu0) == object1 ? object1 : ibom.a;
        label_65:
            ryh1 = sbu0.d;
            ibnx.b(object0);
            return ibom.a;
        }
        catch(CancellationException cancellationException0) {
            sbv.i(this.c.c(ryh1));
            throw cancellationException0;
        }
        catch(sbw sbw0) {
            sbv.i(this.c.c(ryh1));
            throw sbw0;
        }
        catch(Throwable throwable0) {
        }
        sct.f("OnboardingTaskServiceServer", "Server action failed", throwable0);
        sbv.i(this.c.c(ryh1));
        throw new sbw(ryh1, throwable0);
    }

    public final Context d() {
        return ((Context)this.f.get()).getApplicationContext();
    }

    public final Object e(ryh ryh0, ibrl ibrl0) {
        sbo sbo0;
        if((ibrl0 instanceof sbo)) {
            sbo0 = (sbo)ibrl0;
            int v = sbo0.c;
            if((v & 0x80000000) == 0) {
                sbo0 = new sbo(this, ibrl0);
            }
            else {
                sbo0.c = v - 0x80000000;
            }
        }
        else {
            sbo0 = new sbo(this, ibrl0);
        }
        Object object0 = sbo0.a;
        Object object1 = ibrx.a;
        switch(sbo0.c) {
            case 0: {
                ibnx.b(object0);
                try {
                    sct.c("OnboardingTaskServiceServer", a.v(rqy.a(ryh0), "Getting task state for node "));
                    Context context0 = this.d();
                    ibuq.e(context0, "<get-applicationContext>(...)");
                    rzq.a(context0);
                    sbo0.d = ryh0;
                    sbo0.c = 1;
                    if(this.c.f(sbo0) == object1) {
                        return object1;
                    label_22:
                        ryh0 = sbo0.d;
                        ibnx.b(object0);
                    }
                    return this.c.c(ryh0);
                }
                catch(CancellationException cancellationException0) {
                    break;
                }
                catch(sbw sbw0) {
                    throw sbw0;
                }
                catch(Throwable throwable0) {
                    sct.f("OnboardingTaskServiceServer", "Server action failed", throwable0);
                    throw new sbw(ryh0, throwable0);
                }
            }
            case 1: {
                goto label_22;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        throw cancellationException0;
    }

    public final Object f(ryh ryh0, rkc rkc0, ibrl ibrl0) {
        sbp sbp0;
        if((ibrl0 instanceof sbp)) {
            sbp0 = (sbp)ibrl0;
            int v = sbp0.c;
            if((v & 0x80000000) == 0) {
                sbp0 = new sbp(this, ibrl0);
            }
            else {
                sbp0.c = v - 0x80000000;
            }
        }
        else {
            sbp0 = new sbp(this, ibrl0);
        }
        Object object0 = sbp0.a;
        Object object1 = ibrx.a;
        switch(sbp0.c) {
            case 0: {
                ibnx.b(object0);
                try {
                    Context context0 = this.d();
                    ibuq.e(context0, "<get-applicationContext>(...)");
                    rzq.a(context0);
                    sct.e("OnboardingTaskServiceServer", a.L(rkc0, rqy.a(ryh0), "Interrupting node ", " with reason "));
                    rve rve0 = this.c.b(ryh0);
                    if(rve0 == null) {
                        sct.a("OnboardingTaskServiceServer", a.v(rqy.a(ryh0), "No instance found for interrupt to token "));
                        throw new IllegalStateException("Task cannot be found.");
                    }
                    if(!rve0.k().v(rkc0)) {
                        sct.c("OnboardingTaskServiceServer", "Task " + rve0.k() + " does not accept interrupt " + rkc0);
                        throw new IllegalStateException("Task cannot be interrupted.");
                    }
                    sbp0.d = ryh0;
                    sbp0.c = 1;
                    return rve.A(rve0, rkc0) == object1 ? object1 : ibom.a;
                label_30:
                    ryh0 = sbp0.d;
                    ibnx.b(object0);
                    return ibom.a;
                }
                catch(CancellationException cancellationException0) {
                    sct.f("OnboardingTaskServiceServer", "Failure interrupting task for node " + rqy.a(ryh0), cancellationException0);
                    throw cancellationException0;
                }
                catch(sbw sbw0) {
                    sct.f("OnboardingTaskServiceServer", "Failure interrupting task for node " + rqy.a(ryh0), sbw0);
                    throw sbw0;
                }
                catch(Throwable throwable0) {
                    sct.f("OnboardingTaskServiceServer", "Server action failed", throwable0);
                    sct.f("OnboardingTaskServiceServer", "Failure interrupting task for node " + rqy.a(ryh0), throwable0);
                    throw new sbw(ryh0, throwable0);
                }
            }
            case 1: {
                goto label_30;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    @Override  // rof
    public final String fa() {
        return ((roe)this.a).a;
    }

    @Override  // sag
    public final Object ff(ryh ryh0, ibrl ibrl0) {
        Object object2;
        rxv rxv1;
        Object object1;
        Object object0;
        sbm sbm0;
        if((ibrl0 instanceof sbm)) {
            sbm0 = (sbm)ibrl0;
            int v = sbm0.d;
            if((v & 0x80000000) == 0) {
                sbm0 = new sbm(this, ibrl0);
            }
            else {
                sbm0.d = v - 0x80000000;
            }
        }
        else {
            sbm0 = new sbm(this, ibrl0);
        }
        try {
            object0 = sbm0.b;
            object1 = ibrx.a;
            switch(sbm0.d) {
                case 0: {
                    goto label_13;
                }
                case 1: {
                    goto label_22;
                }
                case 2: {
                    goto label_37;
                }
                case 3: {
                    goto label_48;
                }
            }
        }
        catch(CancellationException cancellationException0) {
            sct.f("OnboardingTaskServiceServer", "Failure awaiting task completion for node " + rqy.a(ryh0), cancellationException0);
            throw cancellationException0;
        }
        catch(sbw sbw0) {
            sct.f("OnboardingTaskServiceServer", "Failure awaiting task completion for node " + rqy.a(ryh0), sbw0);
            throw sbw0;
        }
        catch(Throwable throwable0) {
            sct.f("OnboardingTaskServiceServer", "Server action failed", throwable0);
            sct.f("OnboardingTaskServiceServer", "Failure awaiting task completion for node " + rqy.a(ryh0), throwable0);
            throw new sbw(ryh0, throwable0);
        }
        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
    label_13:
        ibnx.b(object0);
        try {
            sct.c("OnboardingTaskServiceServer", a.i(ryh0, "awaitTaskCompletion(", ")"));
            Context context0 = this.d();
            ibuq.e(context0, "<get-applicationContext>(...)");
            rzq.a(context0);
            sbm0.e = ryh0;
            sbm0.d = 1;
            if(this.c.f(sbm0) != object1) {
                goto label_24;
            label_22:
                ryh0 = sbm0.e;
                ibnx.b(object0);
            label_24:
                ryf ryf0 = this.c;
                rxv rxv0 = ryf0.c(ryh0);
                if(rxv0.p()) {
                    sct.c("OnboardingTaskServiceServer", a.m(rxv0, ryh0, "awaitTaskCompletion: Task(", ") is already completed - "));
                    rxv1 = rxv0;
                    goto label_40;
                }
                else {
                    iced iced0 = ryf0.g(ryh0);
                    if(iced0 == null) {
                        throw new IllegalStateException("Task cannot be found.");
                    }
                    sbm0.e = ryh0;
                    sbm0.d = 2;
                    if(iced0.r(sbm0) != object1) {
                        goto label_39;
                    label_37:
                        ryh0 = sbm0.e;
                        ibnx.b(object0);
                    label_39:
                        rxv1 = this.c.c(ryh0);
                    label_40:
                        sct.c("OnboardingTaskServiceServer", a.i(ryh0, "awaitTaskCompletion(", "): Flushing before returning"));
                        sbm0.e = ryh0;
                        sbm0.a = rxv1;
                        sbm0.d = 3;
                        if(this.c.d(sbm0) != object1) {
                            object2 = rxv1;
                            return (rxp)((rxv)object2).k(ryh0);
                        }
                    }
                }
            }
            return object1;
        label_48:
            object2 = sbm0.a;
            ryh0 = sbm0.e;
            ibnx.b(object0);
            return (rxp)((rxv)object2).k(ryh0);
        }
        catch(CancellationException cancellationException0) {
            sct.f("OnboardingTaskServiceServer", "Failure awaiting task completion for node " + rqy.a(ryh0), cancellationException0);
            throw cancellationException0;
        }
        catch(sbw sbw0) {
            sct.f("OnboardingTaskServiceServer", "Failure awaiting task completion for node " + rqy.a(ryh0), sbw0);
            throw sbw0;
        }
        catch(Throwable throwable0) {
            sct.f("OnboardingTaskServiceServer", "Server action failed", throwable0);
            sct.f("OnboardingTaskServiceServer", "Failure awaiting task completion for node " + rqy.a(ryh0), throwable0);
            throw new sbw(ryh0, throwable0);
        }
    }

    @Override  // sag
    public final icig fg(ryh ryh0) {
        ibuq.f(ryh0, "token");
        return icjj.a(new icht(new sbr(this, ryh0, null)));
    }

    @Override  // rof
    public final roe fi() {
        throw null;
    }

    public final Object g(ryh ryh0) {
        try {
            Context context0 = this.d();
            ibuq.e(context0, "<get-applicationContext>(...)");
            rzq.a(context0);
            return this.c.a(ryh0);
        }
        catch(CancellationException cancellationException0) {
            sct.f("OnboardingTaskServiceServer", "Failure getting task metadata for node " + rqy.a(ryh0), cancellationException0);
            throw cancellationException0;
        }
        catch(sbw sbw0) {
            sct.f("OnboardingTaskServiceServer", "Failure getting task metadata for node " + rqy.a(ryh0), sbw0);
            throw sbw0;
        }
        catch(Throwable throwable0) {
            sct.f("OnboardingTaskServiceServer", "Server action failed", throwable0);
            sct.f("OnboardingTaskServiceServer", "Failure getting task metadata for node " + rqy.a(ryh0), throwable0);
            throw new sbw(ryh0, throwable0);
        }
    }

    public static final void h(rxv rxv0, Throwable throwable0) {
        scj scj0 = null;
        if((rxv0 instanceof rxu)) {
            Object object0 = ((rxu)rxv0).d();
            if((object0 instanceof scj)) {
                scj0 = (scj)object0;
            }
            if(scj0 != null) {
                goto label_14;
            }
            scj0 = new sci(((rxu)rxv0).d());
            goto label_14;
        }
        if((rxv0 instanceof rxs)) {
            Object object1 = ((rxs)rxv0).d();
            if((object1 instanceof scj)) {
                scj0 = (scj)object1;
            }
            if(scj0 == null) {
                scj0 = new sch(throwable0, ((rxs)rxv0).b);
            }
        label_14:
            rpn rpn0 = new rpn(((rxp)rxv0).fb(), ((rxp)rxv0).fa(), rxv0.f(), scj0, null, 0x30);
            rqa.c.a(rpn0);
            return;
        }
        if(!(rxv0 instanceof rxt)) {
            throw new ibnq();
        }
        sct.h("OnboardingTaskServiceServer", "logCompleteTask called with non-complete task " + rqy.a(rxv0) + " (" + rxv0 + ")");
    }

    static void i(rxv rxv0) {
        sbv.h(rxv0, null);
    }

    @Override  // rof
    public final String l() {
        throw null;
    }
}

