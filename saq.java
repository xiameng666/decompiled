import android.os.PersistableBundle;
import com.android.onboarding.tasks.ErasedOnboardingTaskState;
import com.android.onboarding.tasks.ErasedOnboardingTaskToken;
import java.util.ArrayList;
import java.util.List;

public final class saq implements sah {
    public final ruq a;
    public final sel b;
    private final sah c;

    public saq(rof rof0, sel sel0, ruq ruq0) {
        sbe sbe0 = new sbe(rof0, ruq0);
        ibuq.f(ruq0, "legacy");
        super();
        this.c = sbe0;
        this.b = sel0;
        this.a = ruq0;
    }

    @Override  // sag
    public final Object b(ryh ryh0, PersistableBundle persistableBundle0, ibrl ibrl0) {
        Object object3;
        ryh ryh3;
        int v4;
        int v3;
        PersistableBundle persistableBundle1;
        sao sao0;
        ryh ryh1 = ryh0;
        if((ibrl0 instanceof sao)) {
            sao0 = (sao)ibrl0;
            int v = sao0.d;
            if((v & 0x80000000) == 0) {
                sao0 = new sao(this, ibrl0);
            }
            else {
                sao0.d = v - 0x80000000;
            }
        }
        else {
            sao0 = new sao(this, ibrl0);
        }
        Object object0 = sao0.b;
        Object object1 = ibrx.a;
    alab1:
        switch(sao0.d) {
            case 0: {
                ibnx.b(object0);
                sct.c("OnboardingTaskServiceClientCompat", a.U(ryh1, "startTask(", ") Starting..."));
                ErasedOnboardingTaskToken erasedOnboardingTaskToken0 = ryu.a(ryh1);
                ruq ruq0 = this.a;
                if(this.b.b(0x17879DF8L) && scr.g(persistableBundle0)) {
                    persistableBundle1 = scr.e(persistableBundle0);
                    int v1 = scr.a(persistableBundle1);
                    List list0 = scr.i(persistableBundle0);
                    sct.c("OnboardingTaskServiceClientCompat", "Sending large input data id=" + v1 + " in " + list0.size() + " chunks.");
                    int v2 = 0;
                    for(Object object2: list0) {
                        ruq0.o(erasedOnboardingTaskToken0, v1, ((byte[])object2), v2, list0.size(), sde.a(persistableBundle0));
                        ++v2;
                    }
                }
                else {
                    persistableBundle1 = persistableBundle0;
                }
                if(!ruq0.p(erasedOnboardingTaskToken0, persistableBundle1)) {
                    sct.c("OnboardingTaskServiceClientCompat", a.U(ryh1, "startTask(", ") Failed to start."));
                    throw new sbw(ryh1, new IllegalStateException("Task cannot be found."));
                }
                sao0.e = ryh1;
                sao0.d = 1;
                if(icfv.a(sao0) != object1) {
                    v3 = 0;
                    goto label_56;
                }
                break;
            }
            case 1: {
                ryh1 = sao0.e;
                ibnx.b(object0);
                v3 = 0;
                goto label_56;
            }
            case 2: {
                v4 = sao0.a;
                ryh ryh2 = sao0.e;
                ibnx.b(object0);
                ryh3 = ryh2;
                object3 = object0;
                goto label_65;
            }
            case 3: {
                v4 = sao0.a;
                ryh ryh4 = sao0.e;
                ibnx.b(object0);
                ryh3 = ryh4;
                while(true) {
                    v3 = v4 + 1;
                    ryh1 = ryh3;
                label_56:
                    if(v3 >= 50) {
                        sct.e("OnboardingTaskServiceClientCompat", a.U(ryh1, "startTask(", ") Task did not start in 5s, stopping polling."));
                        throw new sbw(ryh1, new IllegalStateException("Task execution failed with an exception."));
                    }
                    sct.c("OnboardingTaskServiceClientCompat", "startTask(" + rqy.a(ryh1) + ")[attempt=" + v3 + "] Polling for InProgress.");
                    sao0.e = ryh1;
                    sao0.a = v3;
                    sao0.d = 2;
                    object3 = this.d(ryh1, sao0);
                    if(object3 == object1) {
                        break alab1;
                    }
                    ryh3 = ryh1;
                    v4 = v3;
                label_65:
                    rxv rxv0 = ((rxv)object3).j(sap.a);
                    if(!(rxv0 instanceof rxs) || !ibzk.G(((rxs)rxv0).b.b(), "Task cannot be found.")) {
                        break;
                    }
                    sct.e("OnboardingTaskServiceClientCompat", "startTask(" + rqy.a(ryh3) + ")[" + v4 + "][attempt=" + v4 + "] Task has not stared yet, polling again.");
                    long v5 = ibzy.h(100, ibzz.c);
                    sao0.e = ryh3;
                    sao0.a = v4;
                    sao0.d = 3;
                    if(iccv.d(v5, sao0) == object1) {
                        break alab1;
                    }
                }
                sct.c("OnboardingTaskServiceClientCompat", "startTask(" + rqy.a(ryh3) + ")[attempt=" + v4 + "] Task has started.");
                return ibom.a;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        return object1;
    }

    public final Object d(ryh ryh0, ibrl ibrl0) {
        ErasedOnboardingTaskState erasedOnboardingTaskState0;
        sak sak0;
        if((ibrl0 instanceof sak)) {
            sak0 = (sak)ibrl0;
            int v = sak0.c;
            if((v & 0x80000000) == 0) {
                sak0 = new sak(this, ibrl0);
            }
            else {
                sak0.c = v - 0x80000000;
            }
        }
        else {
            sak0 = new sak(this, ibrl0);
        }
        Object object0 = sak0.a;
        Object object1 = ibrx.a;
        switch(sak0.c) {
            case 0: {
                ibnx.b(object0);
                sct.c("OnboardingTaskServiceClientCompat", a.U(ryh0, "getTaskState(", ") Fetching task state"));
                String s = ryh0.fa();
                if(this.b.a(s, 0x1980587EL)) {
                    sct.d("OnboardingTaskServiceClientCompat", a.U(ryh0, "getTaskState(", ") Fetching task state with callback"));
                    sak0.d = ryh0;
                    sak0.c = 1;
                    icbk icbk0 = new icbk(ibsc.c(sak0), 1);
                    icbk0.z();
                    try {
                        ErasedOnboardingTaskToken erasedOnboardingTaskToken0 = ryu.a(ryh0);
                        rum rum0 = new rum(icbk0);
                        this.a.i(erasedOnboardingTaskToken0, rum0);
                    }
                    catch(Exception exception0) {
                        sct.f("OnboardingTaskServiceClientCompat", a.U(ryh0, "getTaskState(", ") Fetching task state failed"), exception0);
                        icbk0.w(ibnx.a(exception0));
                    }
                    object0 = icbk0.k();
                    if(object0 == ibrx.a) {
                        ibsi.b(sak0);
                    }
                    if(object0 == object1) {
                        return object1;
                    }
                    erasedOnboardingTaskState0 = (ErasedOnboardingTaskState)object0;
                }
                else {
                    sct.d("OnboardingTaskServiceClientCompat", a.U(ryh0, "getTaskState(", ") Fetching task state without callback"));
                    ErasedOnboardingTaskToken erasedOnboardingTaskToken1 = ryu.a(ryh0);
                    erasedOnboardingTaskState0 = this.a.c(erasedOnboardingTaskToken1);
                }
                break;
            }
            case 1: {
                ryh0 = sak0.d;
                ibnx.b(object0);
                erasedOnboardingTaskState0 = (ErasedOnboardingTaskState)object0;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        ibuq.c(erasedOnboardingTaskState0);
        Object object2 = this.f(this.a, ryh0, erasedOnboardingTaskState0).k(ryh0);
        sct.c("OnboardingTaskServiceClientCompat", "getTaskState(" + rqy.a(ryh0) + ") Fetched task state " + object2);
        return object2;
    }

    public static final PersistableBundle e(ruq ruq0, ryv ryv0, int v, int v1, int v2) {
        sct.c("OnboardingTaskServiceClientCompat", "Fetching full data of id: " + v);
        ArrayList arrayList0 = new ArrayList();
        int v3 = 0;
        while(v3 < v1) {
            byte[] arr_b = ruq0.q(ryv0.fl(), v, v3, v1, v2);
            ibuq.c(arr_b);
            arrayList0.add(arr_b);
            ++v3;
            ruq0 = ruq0;
        }
        return scr.d(arrayList0);
    }

    private final ryt f(ruq ruq0, ryh ryh0, ryt ryt0) {
        if(this.b.b(0x17879DF8L) && ((ErasedOnboardingTaskState)ryt0).q()) {
            int v = ((ErasedOnboardingTaskState)ryt0).d();
            sct.c("OnboardingTaskServiceClientCompat", a.f(v, "Restoring pending state ", " with full data."));
            if(!((ErasedOnboardingTaskState)ryt0).q()) {
                throw new IllegalArgumentException(a.i(ryt0, "This {", "} is not a pending state."));
            }
            PersistableBundle persistableBundle0 = ((ErasedOnboardingTaskState)ryt0).e();
            if(persistableBundle0 == null) {
                throw new IllegalArgumentException(a.i(ryt0, "The task state {", "} doesn\'t have any result."));
            }
            int v1 = scr.c(persistableBundle0);
            if(!((ErasedOnboardingTaskState)ryt0).q()) {
                throw new IllegalArgumentException(a.i(ryt0, "This {", "} is not a pending state."));
            }
            PersistableBundle persistableBundle1 = ((ErasedOnboardingTaskState)ryt0).e();
            if(persistableBundle1 == null) {
                throw new IllegalArgumentException(a.i(ryt0, "The task state {", "} doesn\'t have any result."));
            }
            PersistableBundle persistableBundle2 = saq.e(ruq0, ryh0, v, v1, scr.b(persistableBundle1));
            if(!((ErasedOnboardingTaskState)ryt0).q()) {
                throw new IllegalArgumentException(a.i(ryt0, "This {", "} is not a pending state."));
            }
            PersistableBundle persistableBundle3 = ((ErasedOnboardingTaskState)ryt0).a();
            scr.h(persistableBundle3);
            persistableBundle3.putPersistableBundle("com.android.onboarding.task.RESULT", persistableBundle2);
            ryt ryt1 = new ErasedOnboardingTaskState(persistableBundle3);
            sct.c("OnboardingTaskServiceClientCompat", a.f(v, "Restored pending state ", " with full data."));
            return ryt1;
        }
        return ryt0;
    }

    @Override  // rof
    public final String fa() {
        return this.c.fa();
    }

    @Override  // sag
    public final Object ff(ryh ryh0, ibrl ibrl0) {
        sai sai0;
        if((ibrl0 instanceof sai)) {
            sai0 = (sai)ibrl0;
            int v = sai0.c;
            if((v & 0x80000000) == 0) {
                sai0 = new sai(this, ibrl0);
            }
            else {
                sai0.c = v - 0x80000000;
            }
        }
        else {
            sai0 = new sai(this, ibrl0);
        }
        Object object0 = sai0.a;
        Object object1 = ibrx.a;
        switch(sai0.c) {
            case 0: {
                ibnx.b(object0);
                sai0.d = ryh0;
                sai0.c = 1;
                icbk icbk0 = new icbk(ibsc.c(sai0), 1);
                icbk0.z();
                sct.c("OnboardingTaskServiceClientCompat", a.U(ryh0, "awaitTaskCompletion(", ") Awaiting task completion"));
                try {
                    ErasedOnboardingTaskToken erasedOnboardingTaskToken0 = ryu.a(ryh0);
                    saj saj0 = new saj(icbk0);
                    this.a.n(erasedOnboardingTaskToken0, saj0);
                }
                catch(Exception exception0) {
                    sct.f("OnboardingTaskServiceClientCompat", a.U(ryh0, "awaitTaskCompletion(", ") Await failed"), exception0);
                    icbk0.w(ibnx.a(exception0));
                }
                object0 = icbk0.k();
                if(object0 == ibrx.a) {
                    ibsi.b(sai0);
                }
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                ryh0 = sai0.d;
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        Object object2 = (rxp)this.f(this.a, ryh0, ((ErasedOnboardingTaskState)object0)).k(ryh0);
        sct.c("OnboardingTaskServiceClientCompat", "awaitTaskCompletion(" + rqy.a(ryh0) + ") Task completed with " + object2);
        return object2;
    }

    @Override  // sag
    public final icig fg(ryh ryh0) {
        ibuq.f(ryh0, "token");
        return icjj.a(new ichv(new san(ryh0, this, null)));
    }

    @Override  // rof
    public final roe fi() {
        throw null;
    }

    @Override  // rof
    public final String l() {
        throw null;
    }
}

