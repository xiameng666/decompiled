import android.content.Context;
import android.os.PersistableBundle;
import com.android.onboarding.contracts.annotations.InternalOnboardingApi;
import j..time.Duration;
import j..time.Instant;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import jeb.synthetic.FIN;

public abstract class rve implements rrc {
    private icck a;
    public volatile WeakReference b;
    public long d;
    public final AtomicReference e;
    public final rnv f;
    private final List g;
    private boolean i;
    private ruv j;

    public rve() {
        this.d = -1L;
        this.e = new AtomicReference(null);
        this.g = new ArrayList();
        this.f = new rnv();
    }

    public static Object A(rve rve0, rkc rkc0) {
        if(rve0.j != null && (rve0.j.d != null && rve0.j.d.b(390390338L))) {
            if(!rve0.k().v(rkc0)) {
                sct.a(a.U(rve0, "OnboardingTask(", ")"), a.j(rve0, rkc0, "Unexpected interrupt with reason ", " (", ")"));
                return ibom.a;
            }
            if(rkc0 != rkc.c && rkc0 != rkc.b) {
                sct.a(a.U(rve0, "OnboardingTask(", ")"), a.j(rve0, rkc0, "Unhandled interrupt with reason ", " (", ")"));
                return ibom.a;
            }
            Objects.toString(rkc0);
            rve0.e.set(new IllegalStateException("Interrupted with reason " + rkc0));
            return ibom.a;
        }
        sct.a(a.U(rve0, "OnboardingTask(", ")"), a.j(rve0, rkc0, "Unhandled interrupt with reason ", " (", ")"));
        return ibom.a;
    }

    public static Object B(rve rve0, ibts ibts0, ibrl ibrl0) {
        return rve0.q(rve0.k().u(), ibts0, ibrl0);
    }

    private final void a(rnv rnv0) {
        ruv ruv0 = this.j;
        if(ruv0 != null) {
            ryf ryf0 = ruv0.a;
            if(ryf0 != null) {
                rra rra0 = this.fk();
                icgv icgv0 = (icgv)ryf0.d.get(rra0);
                icha icha0 = icgv0 == null ? null : new icha(icgv0.b(new rnv(rnv0.b, rnv0.b(rnv0.c))));
                if(icha0 == null || !icha.c(icha0.b)) {
                    sct.e("TaskStateManager", a.j(this, icha0, "Failed to emit metadata. result=", " [", "]"));
                }
            }
        }
    }

    protected Object d(Context context0, PersistableBundle persistableBundle0, Duration duration0, ibrl ibrl0) {
        return rve.p(this, context0, persistableBundle0, duration0, ibrl0);
    }

    @Override  // roj
    public final long f() {
        return this.d;
    }

    @Override  // rof
    public final String fa() {
        return this.k().fa();
    }

    @Override  // roo
    public final String fb() {
        return this.k().fb();
    }

    @Override  // rof
    public final roe fi() {
        return new roe(this);
    }

    @Override  // rrc
    public final rra fk() {
        return new rrb(this);
    }

    protected abstract Object j(Context arg1, Object arg2, ibrl arg3);

    public abstract rsp k();

    @Override  // rof
    public final String l() {
        return roc.a(this);
    }

    @Override  // rrc
    public final String m() {
        return rqy.a(this);
    }

    @Override  // roo
    public final ron o() {
        return new ron(this);
    }

    public static Object p(rve rve0, Context context0, PersistableBundle persistableBundle0, Duration duration0, ibrl ibrl0) {
        Object object0 = rve0.k().k().fm(persistableBundle0);
        rve0.b = new WeakReference(context0);
        rve0.k().fc(object0);
        rnv rnv0 = rve0.f;
        rnv0.d();
        ruv ruv0 = rve0.j;
        if(ruv0 != null) {
            ryf ryf0 = ruv0.a;
            if(ryf0 != null) {
                ryf0.m(rve0, rnv0);
            }
        }
        return rve0.q(duration0, new rux(rve0, context0, object0, null), ibrl0);
    }

    protected final Object q(Duration duration0, ibts ibts0, ibrl ibrl0) {
        Object object2;
        ruy ruy0;
        if((ibrl0 instanceof ruy)) {
            ruy0 = (ruy)ibrl0;
            int v = ruy0.c;
            if((v & 0x80000000) == 0) {
                ruy0 = new ruy(this, ibrl0);
            }
            else {
                ruy0.c = v - 0x80000000;
            }
        }
        else {
            ruy0 = new ruy(this, ibrl0);
        }
        Object object0 = ruy0.a;
        Object object1 = ibrx.a;
        switch(ruy0.c) {
            case 0: {
                ibnx.b(object0);
                this.i = true;
                this.e.set(null);
                this.s();
                try {
                    try {
                        rvd rvd0 = new rvd(this, this, ibts0, null);
                        ruy0.c = 1;
                        object0 = icto.a(duration0, rvd0, ruy0);
                        if(object0 == object1) {
                            return object1;
                        label_22:
                            ibnx.b(object0);
                        }
                        object2 = (rxv)object0;
                    }
                    catch(ruu ruu0) {
                        rnw.c(ruu0.a);
                        object2 = this.z(new rnw(ruu0.a));
                    }
                    catch(icfl icfl0) {
                        String s = "Task timed out: " + icfl0.getMessage();
                        rnw.c(s);
                        object2 = this.z(new rnw(s));
                    }
                    catch(Exception exception0) {
                        String s1 = "Task failed: " + exception0.getMessage() + " (" + ibnj.a(exception0) + ")";
                        rnw.c(s1);
                        object2 = this.z(new rnw(s1));
                    }
                    goto label_43;
                }
                catch(Throwable throwable0) {
                    break;
                }
            }
            case 1: {
                goto label_22;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        this.s();
        this.i = false;
        throw throwable0;
    label_43:
        this.s();
        this.i = false;
        return object2;
    }

    public final icck r() {
        icck icck0 = this.a;
        if(icck0 != null) {
            return icck0;
        }
        ibuq.j("lifecycleScope");
        return null;
    }

    public final void s() {
        List list0 = this.g;
        for(Object object0: list0) {
            iceb.a(((iccs)object0));
        }
        list0.clear();
    }

    public final void t(Class class0) {
        rnv rnv0 = this.f;
        PersistableBundle persistableBundle0 = rnv0.c;
        __monitor_enter(persistableBundle0);
        int v = FIN.finallyOpen$NT();
        Instant instant0 = Instant.now();
        ibuq.e(instant0, "now(...)");
        rnv0.b = instant0;
        String s = rjb.a(class0);
        if(s != null) {
            rnv0.c.remove(s);
            FIN.finallyCodeBegin$NT(v);
            ruv ruv0 = this.j;
            if(ruv0 != null) {
                ryf ryf0 = ruv0.a;
                if(ryf0 != null) {
                    ryf0.m(this, rnv0);
                }
            }
            this.a(rnv0);
            return;
        }
        throw new IllegalStateException(a.i(class0, "Class ", " must be annotated with @UniqueKey"));
    }

    @Override
    public final String toString() {
        return a.U(this, "OnboardingTask(", ")");
    }

    @InternalOnboardingApi
    public final void u(ruv ruv0) {
        if(!rop.b(ruv0, this.k())) {
            throw new IllegalArgumentException("Provided context " + ruv0 + " does not refer to the task contract " + this.k());
        }
        this.j = ruv0;
        this.d = ruv0.f();
        icfg icfg0 = new icfg(icei.c(((icqb)ruv0.b).a));
        this.a = iccl.b(((icqb)ruv0.b).a.plus(icfg0));
        this.f.d();
        this.i = false;
    }

    protected final void v(iccs iccs0) {
        this.g.add(iccs0);
    }

    public final void w(Class class0, rnt rnt0) {
        Context context0 = null;
        if(!this.i) {
            String s = a.U(this, "OnboardingTask(", ")");
            WeakReference weakReference0 = this.b;
            if(weakReference0 != null) {
                context0 = (Context)weakReference0.get();
            }
            sct.e(s, "Task (" + this + ") can only update metadata when it is running. Ignoring update: " + rnt0.b(context0));
            return;
        }
        String s1 = a.U(this, "OnboardingTask(", ")");
        WeakReference weakReference1 = this.b;
        if(weakReference1 != null) {
            context0 = (Context)weakReference1.get();
        }
        sct.c(s1, "Task (" + this + ") updating metadata: " + rnt0.b(context0));
        rnv rnv0 = this.f;
        PersistableBundle persistableBundle0 = rnv0.c;
        __monitor_enter(persistableBundle0);
        int v = FIN.finallyOpen$NT();
        Instant instant0 = Instant.now();
        ibuq.e(instant0, "now(...)");
        rnv0.b = instant0;
        String s2 = rjb.a(class0);
        if(s2 != null) {
            sdn.b(rnv0.c, s2, rnt0);
            FIN.finallyCodeBegin$NT(v);
            ruv ruv0 = this.j;
            if(ruv0 != null) {
                ryf ryf0 = ruv0.a;
                if(ryf0 != null) {
                    ryf0.m(this, rnv0);
                }
            }
            this.a(rnv0);
            return;
        }
        throw new IllegalStateException(a.i(class0, "Class ", " must be annotated with @UniqueKey"));
    }

    public final boolean x() {
        return this.j != null;
    }

    public static Object y(rve rve0, Context context0, PersistableBundle persistableBundle0, ibrl ibrl0) {
        Duration duration0 = rve0.k().u();
        rve0.b = new WeakReference(context0);
        return rve0.d(context0, persistableBundle0, duration0, ibrl0);
    }

    protected final rxv z(rnp rnp0) {
        return new rxs(this.k().g(), this.k(), this.d, null, (this.f.f() ? null : this.f), rnp0);
    }
}

