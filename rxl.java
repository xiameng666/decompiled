import android.content.Context;
import android.os.PersistableBundle;
import com.android.onboarding.tasks.ErasedOnboardingTaskState;
import com.android.onboarding.tasks.ErasedOnboardingTaskToken;
import j..util.concurrent.ConcurrentHashMap;
import j..util.concurrent.ConcurrentMap.-EL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.Supplier;

public final class rxl extends rup implements AutoCloseable, rof, sag {
    public final Supplier a;
    public final Collection b;
    public final Supplier c;
    public final Set d;
    public final Set e;
    public final ryf f;
    public final sbv g;
    public final roe h;
    private final rrr i;
    private final icck j;
    private final ibnn k;

    public rxl(rof rof0, Supplier supplier0, Collection collection0, icck icck0) {
        ibuq.f(rof0, "component");
        ibuq.f(collection0, "tasks");
        rru rru0 = new rru(supplier0);
        rvt rvt0 = new rvt(supplier0);
        Object object0 = supplier0.get();
        ibuq.e(object0, "get(...)");
        Object object1 = supplier0.get();
        ibuq.e(object1, "get(...)");
        rmy rmy0 = new rmy(((Context)object0), icck0, scg.a(((Context)object1)));
        Object object2 = rvt0.get();
        ibuq.e(object2, "get(...)");
        ryf ryf0 = new ryf(((sel)object2), rmy0, icck0);
        sbv sbv0 = new sbv(rof0, supplier0, collection0, rru0, icck0, rvt0, ryf0, ibpu.a, ibpu.a);
        ibuq.f(rof0, "component");
        ibuq.f(collection0, "tasks");
        super();
        this.h = (roe)rof0;
        this.a = supplier0;
        this.b = collection0;
        this.i = rru0;
        this.j = icck0;
        this.c = rvt0;
        this.d = ibpu.a;
        this.e = ibpu.a;
        this.f = ryf0;
        this.g = sbv0;
        this.k = new ibnz(new rvu(this));
    }

    public static final void A(rrc rrc0, rxv rxv0, Throwable throwable0) {
        scj scj0 = null;
        if((rxv0 instanceof rxu)) {
            Object object0 = ((rxu)rxv0).d();
            if((object0 instanceof scj)) {
                scj0 = (scj)object0;
            }
            if(scj0 == null) {
                scj0 = new sci(((rxu)rxv0).d());
            }
        }
        else if((rxv0 instanceof rxs)) {
            Object object1 = ((rxs)rxv0).d();
            if((object1 instanceof scj)) {
                scj0 = (scj)object1;
            }
            if(scj0 == null) {
                scj0 = new sch(throwable0, ((rxs)rxv0).b);
            }
        }
        else {
            sct.h("OTMServiceBinder", a.j(rxv0, rrc0, "logCompleteTask called with non-complete task ", " (", ")"));
        }
        if(scj0 != null) {
            rpn rpn0 = new rpn(rrc0.fb(), rrc0.fa(), rrc0.f(), scj0, null, 0x30);
            rqa.c.a(rpn0);
        }
    }

    public static final ryh B(ryv ryv0) {
        return new ryh(ryv0.e(), new ron(ryv0), new rvs(), new rxf(), ryv0.f(), ryv0.d(), ryv0.i());
    }

    static rzy C(rxl rxl0, rrc rrc0, Throwable throwable0) {
        String s = throwable0.getMessage() == null ? "Unknown onboarding task service error." : throwable0.getMessage();
        if((throwable0 instanceof sbw)) {
            return new rzy(((scz)throwable0));
        }
        if(rrc0 == null) {
            rrc0 = rqz.f(rom.f(rxl0, "UNKNOWN"), -1L);
        }
        return new rzy(new sbw(rrc0, throwable0, s));
    }

    public final Object D(ErasedOnboardingTaskToken erasedOnboardingTaskToken0) {
        ryh ryh0 = rxl.B(erasedOnboardingTaskToken0);
        return this.g.g(ryh0);
    }

    static void E(rrc rrc0, rxv rxv0) {
        rxl.A(rrc0, rxv0, null);
    }

    private final iced H(String s, ibtw ibtw0) {
        rxi rxi0 = new rxi(ibtw0, s, null);
        return icbb.b(this.j, null, null, rxi0, 3);
    }

    @Override  // ruq
    public final int a() {
        Object object0 = this.c.get();
        ibuq.e(object0, "get(...)");
        return ((sel)object0).b(0x199A39C6L) ? 1 : 0;
    }

    @Override  // sag
    public final Object b(ryh ryh0, PersistableBundle persistableBundle0, ibrl ibrl0) {
        return this.g.b(ryh0, persistableBundle0, ibrl0);
    }

    @Override  // ruq
    @ibni
    public final ErasedOnboardingTaskState c(ErasedOnboardingTaskToken erasedOnboardingTaskToken0) {
        ibuq.f(erasedOnboardingTaskToken0, "token");
        Objects.toString(erasedOnboardingTaskToken0);
        sct.c("OTMServiceBinder", "getTaskState token=" + erasedOnboardingTaskToken0);
        Object object0 = this.c.get();
        ibuq.e(object0, "get(...)");
        if(((sel)object0).b(0x199A39C6L)) {
            rwc rwc0 = new rwc(this, erasedOnboardingTaskToken0, null);
            return this.u(((ErasedOnboardingTaskState)icbc.a(((icqb)this.j).a, rwc0)));
        }
        Context context0 = ((Context)this.a.get()).getApplicationContext();
        ibuq.e(context0, "getApplicationContext(...)");
        rzq.a(context0);
        try {
            return this.u(this.v(erasedOnboardingTaskToken0).i());
        }
        catch(Exception exception0) {
            sct.g(new IllegalStateException(exception0));
            return this.u(rxr.b(erasedOnboardingTaskToken0, new rnr("Task execution failed with an exception.")).i());
        }
    }

    @Override
    public final void close() {
        this.f.close();
    }

    @Override  // ruq
    public final rzw d(rzz rzz0, rzt rzt0) {
        ibuq.f(rzz0, "token");
        ibuq.f(rzt0, "observer");
        return new rws(this.H("observeTaskMetadata", new rwx(rzz0, this, rzt0, null)));
    }

    @Override  // ruq
    public final rzw e(rzz rzz0, rzt rzt0) {
        ibuq.f(rzz0, "token");
        ibuq.f(rzt0, "observer");
        return new rwy(this.H("observeTaskState", new rxd(rzz0, this, rzt0, null)));
    }

    @Override  // ruq
    public final void f(rzz rzz0, sac sac0) {
        ibuq.f(rzz0, "token");
        ibuq.f(sac0, "callback");
        this.H("awaitTaskCompletionAsync", new rvw(rzz0, this, sac0, null));
    }

    @Override  // rof
    public final String fa() {
        return this.h.a;
    }

    @Override  // ruq
    @ibni
    public final PersistableBundle fd(ErasedOnboardingTaskToken erasedOnboardingTaskToken0) {
        ibuq.f(erasedOnboardingTaskToken0, "token");
        Object object0 = this.c.get();
        ibuq.e(object0, "get(...)");
        if(((sel)object0).b(0x199A39C6L)) {
            rwa rwa0 = new rwa(this, erasedOnboardingTaskToken0, null);
            return (PersistableBundle)icbc.a(((icqb)this.j).a, rwa0);
        }
        Context context0 = ((Context)this.a.get()).getApplicationContext();
        ibuq.e(context0, "getApplicationContext(...)");
        rzq.a(context0);
        try {
            return this.s(this.f.a(erasedOnboardingTaskToken0).a());
        }
        catch(Exception exception0) {
            sct.g(new IllegalStateException(exception0));
            return this.s(new PersistableBundle());
        }
    }

    @Override  // sag
    public final Object ff(ryh ryh0, ibrl ibrl0) {
        return this.g.ff(ryh0, ibrl0);
    }

    @Override  // sag
    public final icig fg(ryh ryh0) {
        ibuq.f(ryh0, "token");
        return this.g.fg(ryh0);
    }

    @Override  // ruq
    @ibni
    public final void fh(ErasedOnboardingTaskToken erasedOnboardingTaskToken0, rut rut0) {
        ibuq.f(erasedOnboardingTaskToken0, "token");
        ibuq.f(rut0, "listener");
        Object object0 = this.c.get();
        ibuq.e(object0, "get(...)");
        if(((sel)object0).b(0x199A39C6L)) {
            this.H("listenForTaskMetadataChanges", new rwp(this, erasedOnboardingTaskToken0, rut0, null));
            return;
        }
        Context context0 = ((Context)this.a.get()).getApplicationContext();
        ibuq.e(context0, "getApplicationContext(...)");
        rzq.a(context0);
        this.H("listenForTaskMetadataChanges", new rwr(this, erasedOnboardingTaskToken0, rut0, null));
    }

    @Override  // rof
    public final roe fi() {
        throw null;
    }

    @Override  // ruq
    public final void g(rzz rzz0, sac sac0) {
        ibuq.f(rzz0, "token");
        ibuq.f(sac0, "callback");
        this.H("getTaskMetadataAsync", new rwb(rzz0, this, sac0, null));
    }

    @Override  // ruq
    public final void h(rzz rzz0, sac sac0) {
        ibuq.f(rzz0, "token");
        ibuq.f(sac0, "callback");
        this.H("getTaskStateAsync", new rwd(rzz0, this, sac0, null));
    }

    @Override  // ruq
    @ibni
    public final void i(ErasedOnboardingTaskToken erasedOnboardingTaskToken0, run run0) {
        ibuq.f(erasedOnboardingTaskToken0, "token");
        ibuq.f(run0, "listener");
        this.H("getTaskStateWithCallback", new rwe(this, erasedOnboardingTaskToken0, run0, null));
    }

    @Override  // ruq
    @ibni
    public final void j(ErasedOnboardingTaskToken erasedOnboardingTaskToken0, PersistableBundle persistableBundle0) {
        ibuq.f(erasedOnboardingTaskToken0, "token");
        ibuq.f(persistableBundle0, "reason");
        Object object0 = this.c.get();
        ibuq.e(object0, "get(...)");
        if(((sel)object0).b(0x199A39C6L)) {
            rwf rwf0 = new rwf(this, erasedOnboardingTaskToken0, persistableBundle0, null);
            icbc.a(((icqb)this.j).a, rwf0);
            return;
        }
        Context context0 = ((Context)this.a.get()).getApplicationContext();
        ibuq.e(context0, "getApplicationContext(...)");
        rzq.a(context0);
        this.H("interrupt", new rwg(erasedOnboardingTaskToken0, persistableBundle0, this, rkb.d(persistableBundle0), null));
    }

    @Override  // ruq
    public final void k(rzz rzz0, rzz rzz1, saf saf0) {
        ibuq.f(rzz0, "token");
        ibuq.f(rzz1, "reason");
        ibuq.f(saf0, "callback");
        this.H("interruptTaskAsync", new rwh(rzz0, this, rzz1, saf0, null));
    }

    @Override  // rof
    public final String l() {
        throw null;
    }

    @Override  // ruq
    public final void m(rzz rzz0, rzz rzz1, saf saf0) {
        ibuq.f(rzz0, "token");
        ibuq.f(rzz1, "input");
        ibuq.f(saf0, "callback");
        this.H("startTaskAsync", new rxh(rzz0, this, rzz1, saf0, null));
    }

    @Override  // ruq
    @ibni
    public final void n(ErasedOnboardingTaskToken erasedOnboardingTaskToken0, rut rut0) {
        ibuq.f(erasedOnboardingTaskToken0, "token");
        ibuq.f(rut0, "listener");
        Object object0 = this.c.get();
        ibuq.e(object0, "get(...)");
        if(((sel)object0).b(0x199A39C6L)) {
            this.H("waitForCompleted", new rxj(this, erasedOnboardingTaskToken0, rut0, null));
            return;
        }
        Objects.toString(erasedOnboardingTaskToken0);
        sct.c("OTMServiceBinder", "waitForCompleted token=" + erasedOnboardingTaskToken0);
        Context context0 = ((Context)this.a.get()).getApplicationContext();
        ibuq.e(context0, "getApplicationContext(...)");
        rzq.a(context0);
        this.H("waitForCompleted", new rxk(this, erasedOnboardingTaskToken0, rut0, null));
    }

    @Override  // ruq
    public final boolean o(ErasedOnboardingTaskToken erasedOnboardingTaskToken0, int v, byte[] arr_b, int v1, int v2, int v3) {
        ibuq.f(erasedOnboardingTaskToken0, "token");
        ibuq.f(arr_b, "chunk");
        Object object0 = this.c.get();
        ibuq.e(object0, "get(...)");
        boolean z = false;
        if(!((sel)object0).b(0x17879DF8L)) {
            sct.e("OTMServiceBinder", "Feature SEND_LARGE_DATA_IN_CHUNKS_CHANGE_ID is not enabled.");
            return false;
        }
        Context context0 = ((Context)this.a.get()).getApplicationContext();
        ibuq.e(context0, "getApplicationContext(...)");
        rzq.a(context0);
        sct.c("OTMServiceBinder", "sendDataChunk#[" + erasedOnboardingTaskToken0 + "] Receiving data chunk of id=" + v + " chunk[" + (v1 + 1) + "/" + v2 + "]");
        ConcurrentHashMap concurrentHashMap0 = scq.b;
        Integer integer0 = v;
        ArrayList arrayList0 = new ArrayList(v2);
        for(int v4 = 0; v4 < v2; ++v4) {
            arrayList0.add(new byte[0]);
        }
        List list0 = (List)ConcurrentMap.-EL.getOrDefault(concurrentHashMap0, integer0, arrayList0);
        list0.set(v1, arr_b);
        concurrentHashMap0.put(Integer.valueOf(v), list0);
        ibuq.c(list0);
        ArrayList arrayList1 = new ArrayList();
        for(Object object1: list0) {
            if(((byte[])object1).length != 0) {
                arrayList1.add(object1);
            }
        }
        if(arrayList1.size() == v2) {
            z = true;
        }
        if(z) {
            PersistableBundle persistableBundle0 = scr.d(list0);
            sct.c("OTMServiceBinder", "Received full data of id=" + v + " sizeInBytes=" + sde.a(persistableBundle0));
            scq.a(v).V(persistableBundle0);
        }
        return z;
    }

    @Override  // ruq
    @ibni
    public final boolean p(ErasedOnboardingTaskToken erasedOnboardingTaskToken0, PersistableBundle persistableBundle0) {
        rve rve0;
        rrc rrc0;
        Object object2;
        ibuq.f(erasedOnboardingTaskToken0, "token");
        ibuq.f(persistableBundle0, "bundle");
        sct.c("OTMServiceBinder", a.i(erasedOnboardingTaskToken0, "startTask[", "]"));
        Object object0 = this.c.get();
        ibuq.e(object0, "get(...)");
        if(((sel)object0).b(0x199A39C6L)) {
            rxg rxg0 = new rxg(this, erasedOnboardingTaskToken0, persistableBundle0, null);
            return ((Boolean)icbc.a(((icqb)this.j).a, rxg0)).booleanValue();
        }
        Context context0 = ((Context)this.a.get()).getApplicationContext();
        ibuq.e(context0, "getApplicationContext(...)");
        rzq.a(context0);
        PersistableBundle persistableBundle1 = this.r(persistableBundle0);
        try {
            ibuq.f(erasedOnboardingTaskToken0, "token");
            Supplier supplier0 = (Supplier)((Map)this.k.a()).get(new ron(erasedOnboardingTaskToken0));
            if(supplier0 == null) {
                rve0 = null;
                goto label_40;
            label_23:
                ibuq.f(rve0, "task");
                if(erasedOnboardingTaskToken0 == null) {
                    try {
                        object2 = new rrb(rve0);
                    }
                    catch(Throwable throwable0) {
                        object2 = ibnx.a(throwable0);
                    }
                    rra rra0 = rqz.f(rve0, rok.a());
                    if((object2 instanceof ibnv)) {
                        object2 = rra0;
                    }
                    rrc0 = (rrc)object2;
                }
                else {
                    rrc0 = erasedOnboardingTaskToken0;
                }
                Object object3 = this.c.get();
                ibuq.e(object3, "get(...)");
                rve0.u(new ruv(rrc0, this.f, this.j, ((sel)object3)));
                this.f.k(erasedOnboardingTaskToken0);
                this.f.i(erasedOnboardingTaskToken0, rve0);
            }
            else {
                Object object1 = supplier0.get();
                ibuq.e(object1, "get(...)");
                rve0 = (rve)object1;
                sct.c("OTMServiceBinder", a.m(rve0, erasedOnboardingTaskToken0, "createTaskInstance token=", " task="));
                if(rve0.x()) {
                    sct.h("OTMServiceBinder", a.i(rve0, "Task (", ") was already initialized. Please don\'t reuse the same task instance."));
                    rve0 = null;
                }
                else {
                    goto label_23;
                }
            }
        label_40:
            if(rve0 == null) {
                sct.e("OTMServiceBinder", a.i(erasedOnboardingTaskToken0, "Task for node ", " not found!"));
                rxs rxs0 = rxr.a(erasedOnboardingTaskToken0, erasedOnboardingTaskToken0.f(), new rnr("Task cannot be found."));
                this.f.l(erasedOnboardingTaskToken0, rxs0);
            }
            if(rve0 == null) {
                rxl.E(erasedOnboardingTaskToken0, this.f.c(erasedOnboardingTaskToken0));
                return false;
            }
            ibuq.f(erasedOnboardingTaskToken0, "token");
            ibuq.f(persistableBundle1, "input");
            sct.d("OTMServiceBinder", a.i(rve0, "startLocalTask[", "]"));
            Object object4 = this.c.get();
            ibuq.e(object4, "get(...)");
            if(((sel)object4).b(0x17879DF8L) && scr.f(persistableBundle1)) {
                throw new IllegalStateException("Cannot run task with a pending bundle.");
            }
            ryh ryh0 = ryu.b(erasedOnboardingTaskToken0, rve0.k());
            rxt rxt0 = new rxt(ryh0);
            this.f.l(erasedOnboardingTaskToken0, rxt0);
            rvy rvy0 = new rvy(this, rve0, ryh0, persistableBundle1, this.i.a(rrs.b), null);
            iccs iccs0 = icbb.a(this.j, null, null, rvy0, 3);
            this.f.h(erasedOnboardingTaskToken0, iccs0);
            return true;
        }
        catch(Exception exception0) {
            sct.g(new IllegalStateException(exception0));
            return false;
        }
    }

    @Override  // ruq
    public final byte[] q(ErasedOnboardingTaskToken erasedOnboardingTaskToken0, int v, int v1, int v2, int v3) {
        ibuq.f(erasedOnboardingTaskToken0, "token");
        Object object0 = this.c.get();
        ibuq.e(object0, "get(...)");
        if(!((sel)object0).b(0x17879DF8L)) {
            sct.e("OTMServiceBinder", "Feature SEND_LARGE_DATA_IN_CHUNKS_CHANGE_ID is not enabled.");
            return new byte[0];
        }
        Context context0 = ((Context)this.a.get()).getApplicationContext();
        ibuq.e(context0, "getApplicationContext(...)");
        rzq.a(context0);
        sct.c("OTMServiceBinder", "Fetching data chunk. id=" + v + " [" + (v1 + 1) + "/" + v2 + "]");
        List list0 = (List)scq.b.get(Integer.valueOf(v));
        if(list0 != null) {
            byte[] arr_b = (byte[])list0.get(v1);
            if(arr_b != null) {
                return arr_b;
            }
        }
        throw new IllegalStateException("can\'t fetch data chunk");
    }

    public final PersistableBundle r(PersistableBundle persistableBundle0) {
        Object object0 = this.c.get();
        ibuq.e(object0, "get(...)");
        if(((sel)object0).b(0x17879DF8L) && scr.f(persistableBundle0)) {
            sct.c("OTMServiceBinder", "Waiting until full bundle of id " + scr.a(persistableBundle0) + " is received.");
            rvz rvz0 = new rvz(persistableBundle0, null);
            PersistableBundle persistableBundle1 = (PersistableBundle)icbc.a(((icqb)this.j).a, rvz0);
            sct.c("OTMServiceBinder", "Received full bundle of id " + scr.a(persistableBundle0));
            Integer integer0 = scr.a(persistableBundle0);
            icbr icbr0 = (icbr)scq.a.remove(integer0);
            scq.b.remove(integer0);
            return persistableBundle1;
        }
        return persistableBundle0;
    }

    public final PersistableBundle s(PersistableBundle persistableBundle0) {
        Object object0 = this.c.get();
        ibuq.e(object0, "get(...)");
        if(((sel)object0).b(0x17879DF8L) && scr.g(persistableBundle0)) {
            PersistableBundle persistableBundle1 = scr.e(persistableBundle0);
            int v = scr.a(persistableBundle1);
            List list0 = ibpo.at(scr.i(persistableBundle0));
            scq.b.put(Integer.valueOf(v), list0);
            sct.c("OTMServiceBinder", "Prepared data in chunks to be fetched. id=" + v);
            return persistableBundle1;
        }
        return persistableBundle0;
    }

    public final PersistableBundle t(ryt ryt0) {
        rnv rnv0 = ryt0.g();
        return rnv0 == null ? new rnv().a() : this.s(rnv0.a());
    }

    public final ErasedOnboardingTaskState u(ErasedOnboardingTaskState erasedOnboardingTaskState0) {
        Object object0 = this.c.get();
        ibuq.e(object0, "get(...)");
        if(((sel)object0).b(0x17879DF8L) && erasedOnboardingTaskState0.r()) {
            if(!erasedOnboardingTaskState0.r()) {
                throw new IllegalArgumentException(a.i(erasedOnboardingTaskState0, "The task state {", "} is not too large for transaction."));
            }
            PersistableBundle persistableBundle0 = erasedOnboardingTaskState0.e();
            if(persistableBundle0 == null) {
                throw new IllegalArgumentException(a.i(erasedOnboardingTaskState0, "The task state {", "} doesn\'t have any result."));
            }
            PersistableBundle persistableBundle1 = erasedOnboardingTaskState0.a();
            persistableBundle1.putPersistableBundle("com.android.onboarding.task.RESULT", scr.e(persistableBundle0));
            ErasedOnboardingTaskState erasedOnboardingTaskState1 = new ErasedOnboardingTaskState(persistableBundle1);
            int v = erasedOnboardingTaskState1.d();
            PersistableBundle persistableBundle2 = erasedOnboardingTaskState0.e();
            if(persistableBundle2 == null) {
                throw new IllegalArgumentException(a.i(erasedOnboardingTaskState0, "The task state {", "} doesn\'t have any result."));
            }
            List list0 = ibpo.at(scr.i(persistableBundle2));
            scq.b.put(Integer.valueOf(v), list0);
            sct.c("OTMServiceBinder", "Prepared data in chunks to be fetched. id=" + v);
            return erasedOnboardingTaskState1;
        }
        return erasedOnboardingTaskState0;
    }

    public final ryt v(ryv ryv0) {
        ibuq.f(ryv0, "token");
        sct.d("OTMServiceBinder", "getTaskStateUnsafe#[" + ryv0 + "]");
        return this.f.c(ryv0);
    }

    public final Object w(ErasedOnboardingTaskToken erasedOnboardingTaskToken0, ibrl ibrl0) {
        ryh ryh0 = rxl.B(erasedOnboardingTaskToken0);
        return this.g.e(ryh0, ibrl0);
    }

    public final Object x(ErasedOnboardingTaskToken erasedOnboardingTaskToken0, rkc rkc0, ibrl ibrl0) {
        ryh ryh0 = rxl.B(erasedOnboardingTaskToken0);
        Object object0 = this.g.f(ryh0, rkc0, ibrl0);
        return object0 == ibrx.a ? object0 : ibom.a;
    }

    public final Object y(ErasedOnboardingTaskToken erasedOnboardingTaskToken0, PersistableBundle persistableBundle0, ibrl ibrl0) {
        ryh ryh0 = rxl.B(erasedOnboardingTaskToken0);
        Object object0 = this.g.b(ryh0, persistableBundle0, ibrl0);
        return object0 == ibrx.a ? object0 : ibom.a;
    }

    public final icig z(ErasedOnboardingTaskToken erasedOnboardingTaskToken0) {
        ibuq.f(erasedOnboardingTaskToken0, "token");
        ryh ryh0 = rxl.B(erasedOnboardingTaskToken0);
        return this.g.fg(ryh0);
    }
}

