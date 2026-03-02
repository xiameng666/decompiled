import com.android.onboarding.tasks.ErasedOnboardingTaskToken;
import j..time.Instant;

final class rtg extends ibsl implements ibtw {
    Object a;
    int b;
    int c;
    final rtm d;
    final rrh e;
    final Object f;

    public rtg(rtm rtm0, rrh rrh0, Object object0, ibrl ibrl0) {
        this.d = rtm0;
        this.e = rrh0;
        this.f = object0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((rtg)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new rtg(this.d, this.e, this.f, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object3;
        int v2;
        Object object1 = ibrx.a;
        switch(this.c) {
            case 0: {
                ibnx.b(object0);
                ibuq.f(this.e, "contract");
                long v = rok.a();
                int v1 = this.e.s();
                String s = this.e.r();
                ryh ryh0 = new ryh(this.d.c, this.e, v, v1, s);
                v2 = this.e.t(this.f);
                this.a = ryh0;
                this.b = v2;
                this.c = 1;
                if(this.d.d(this) != object1) {
                    object3 = ryh0;
                    break;
                }
                return object1;
            }
            case 1: {
                v2 = this.b;
                object3 = this.a;
                ibnx.b(object0);
                break;
            }
            default: {
                Object object2 = this.a;
                ibnx.b(object0);
                return object2;
            }
        }
        ErasedOnboardingTaskToken erasedOnboardingTaskToken0 = ryu.a(((ryv)object3));
        Instant instant0 = Instant.now();
        ibuq.e(instant0, "instant(...)");
        rsy rsy0 = new rsy(v2, erasedOnboardingTaskToken0, instant0);
        this.d.d.add(rsy0);
        rtf rtf0 = new rtf(this.d, null);
        icbb.b(this.d.a, null, null, rtf0, 3);
        sct.c("OTMBase", a.t(object3, v2, "Cached ", " -> "));
        rtd rtd0 = new rtd(((ryh)object3));
        rte rte0 = new rte(((ryh)object3), this.e, this.f, null);
        this.a = object3;
        this.c = 2;
        return this.d.k(((ryh)object3), rtd0, rte0, this) == object1 ? object1 : object3;
    }
}

