import android.text.TextUtils;
import j..util.concurrent.ConcurrentLinkedQueue;
import java.util.Objects;
import java.util.function.Supplier;

public abstract class rtm implements rvr {
    public final icck a;
    public final rmz b;
    public final long c;
    public final ConcurrentLinkedQueue d;
    public final sel e;
    private final ibnn f;
    private final ibnn g;
    private final ibnn h;

    public rtm(icck icck0, Supplier supplier0, sel sel0, rmz rmz0, Supplier supplier1, glxv glxv0) {
        ibuq.f(glxv0, "timeSource");
        super();
        this.a = icck0;
        this.e = sel0;
        this.b = rmz0;
        this.c = rok.a();
        this.f = new ibnz(new rsq(supplier1));
        this.g = new ibnz(new rsr(supplier0));
        this.d = new ConcurrentLinkedQueue();
        this.h = new ibnz(new rst(this));
    }

    @Override  // rvr
    public final gmcd a(rrh rrh0, Object object0) {
        ibuq.f(rrh0, "contract");
        rti rti0 = new rti(this, rrh0, object0, null);
        return icpu.e(this.a, rti0);
    }

    public final Object c(ibrl ibrl0) {
        rtc rtc0;
        if((ibrl0 instanceof rtc)) {
            rtc0 = (rtc)ibrl0;
            int v = rtc0.c;
            if((v & 0x80000000) == 0) {
                rtc0 = new rtc(this, ibrl0);
            }
            else {
                rtc0.c = v - 0x80000000;
            }
        }
        else {
            rtc0 = new rtc(this, ibrl0);
        }
        Object object0 = rtc0.a;
        Object object1 = ibrx.a;
        switch(rtc0.c) {
            case 0: {
                ibnx.b(object0);
                if(!this.e.b(0x18CE5D55L)) {
                    return ibom.a;
                }
                rtc0.c = 1;
                if(this.d(rtc0) != object1) {
                    goto label_19;
                }
                return object1;
            }
            case 1: {
                ibnx.b(object0);
            label_19:
                rsw rsw0 = new rsw(ibpo.ar(this.d));
                rtc0.c = 2;
                Object object2 = ((rmy)this.b).e("TaskExecutionHistoryBundle", rsw0, rmv.a, rtc0);
                if(object2 != object1) {
                    object2 = ibom.a;
                }
                return object2 != object1 ? ibom.a : object1;
            }
            case 2: {
                ibnx.b(object0);
                return ibom.a;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    @Override  // rvr
    public final void close() {
        iccl.i(this.a);
    }

    public final Object d(ibrl ibrl0) {
        if(this.e.b(0x18CE5D55L)) {
            Object object0 = ((iccs)this.h.a()).n(ibrl0);
            if(object0 == ibrx.a) {
                return object0;
            }
        }
        return ibom.a;
    }

    @Override  // rvr
    public final Object e(rrh rrh0, Object object0, ibrl ibrl0) {
        return rtm.f(this, rrh0, object0, ibrl0);
    }

    static Object f(rtm rtm0, rrh rrh0, Object object0, ibrl ibrl0) {
        rtg rtg0 = new rtg(rtm0, rrh0, object0, null);
        return icbd.a(((icqb)rtm0.a).a, rtg0, ibrl0);
    }

    @Override  // rof
    public final roe fi() {
        throw null;
    }

    @Override  // rvr
    public final Object g(rrh rrh0, Object object0, ibrl ibrl0) {
        return rtm.h(this, rrh0, object0, ibrl0);
    }

    static Object h(rtm rtm0, rrh rrh0, Object object0, ibrl ibrl0) {
        rth rth0 = new rth(rtm0, rrh0, object0, null);
        return icbd.a(((icqb)rtm0.a).a, rth0, ibrl0);
    }

    @Override  // rvr
    public final Object i(ryh ryh0, ibrl ibrl0) {
        return rtm.j(this, ryh0, ibrl0);
    }

    static Object j(rtm rtm0, ryh ryh0, ibrl ibrl0) {
        Objects.toString(ryh0);
        sct.d("OTMBase", "waitForCompleted: " + ryh0);
        return rtm0.k(ryh0, new rsu(ryh0), new rtk(ryh0, null), ibrl0);
    }

    public final Object k(ryh ryh0, ibts ibts0, ibtw ibtw0, ibrl ibrl0) {
        rtl rtl0;
        if((ibrl0 instanceof rtl)) {
            rtl0 = (rtl)ibrl0;
            int v = rtl0.d;
            if((v & 0x80000000) == 0) {
                rtl0 = new rtl(this, ibrl0);
            }
            else {
                rtl0.d = v - 0x80000000;
            }
        }
        else {
            rtl0 = new rtl(this, ibrl0);
        }
        Object object0 = rtl0.b;
        Object object1 = ibrx.a;
        switch(rtl0.d) {
            case 0: {
                ibnx.b(object0);
                sbv sbv0 = (sbv)this.g.a();
                try {
                    if(sbv0 != null && TextUtils.equals(roc.a(this), ryh0.l())) {
                        sct.c("OTMBase", "Going through local server for same-process operation.");
                        rtl0.a = ibts0;
                        rtl0.d = 1;
                        Object object2 = ibtw0.a(sbv0, rtl0);
                        return object2 == object1 ? object1 : object2;
                    }
                    Object object3 = this.f.a();
                    ibuq.e(object3, "<get-value>(...)");
                    rtl0.a = ibts0;
                    rtl0.d = 2;
                    Object object4 = ibtw0.a(object3, rtl0);
                    return object4 == object1 ? object1 : object4;
                label_27:
                    ibts0 = rtl0.a;
                    ibnx.b(object0);
                    return object0;
                }
                catch(sbh sbh0) {
                    sct.f("OTMBase", "Service returned an exception", sbh0);
                    return ibts0.a(sbh0);
                }
            }
            case 1: 
            case 2: {
                goto label_27;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    @Override  // rof
    public final String l() {
        throw null;
    }

    @Override  // rvr
    public final icig m(ryh ryh0) {
        ibuq.f(ryh0, "token");
        Objects.toString(ryh0);
        sct.d("OTMBase", "getTaskMetadataFlow: " + ryh0);
        return new icht(new rtb(this, ryh0, null));
    }
}

