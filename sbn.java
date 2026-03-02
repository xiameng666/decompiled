import android.content.Context;
import android.os.PersistableBundle;
import java.util.concurrent.CancellationException;

final class sbn extends ibsl implements ibtw {
    Object a;
    int b;
    final sbv c;
    final rve d;
    final PersistableBundle e;
    final ibth f;
    final ryv g;
    final ibth h;

    public sbn(sbv sbv0, rve rve0, PersistableBundle persistableBundle0, ibth ibth0, ryv ryv0, ibth ibth1, ibrl ibrl0) {
        this.c = sbv0;
        this.d = rve0;
        this.e = persistableBundle0;
        this.f = ibth0;
        this.g = ryv0;
        this.h = ibth1;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((sbn)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new sbn(this.c, this.d, this.e, this.f, this.g, this.h, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object2;
        Object object1;
        try {
            object1 = ibrx.a;
            switch(this.b) {
                case 0: {
                    break;
                }
                case 1: {
                    goto label_21;
                }
                default: {
                    object2 = this.a;
                    ibnx.b(object0);
                    goto label_29;
                }
            }
        }
        catch(Exception exception0) {
            goto label_32;
        }
        catch(Throwable throwable0) {
            this.h.a();
            throw throwable0;
        }
        ibnx.b(object0);
        Object object3 = this.e;
        rpv rpv0 = rqa.c;
        String s = this.d.fb();
        String s1 = this.d.fa();
        long v = this.d.d;
        try {
            object3 = this.d.k().k().fm(object3);
        }
        catch(Exception unused_ex) {
        }
        rpv0.a(new rpq(s, s1, v, object3));
        this.f.a();
        try {
            try {
                sct.c("OnboardingTaskServiceServer", a.v(rqy.a(this.g), "Starting task execution for node "));
                Context context0 = this.c.d();
                ibuq.e(context0, "access$getApplicationContext(...)");
                this.b = 1;
                object0 = rve.y(this.d, context0, this.e, this);
                if(object0 == object1) {
                    return object1;
                }
                goto label_22;
            label_21:
                ibnx.b(object0);
            label_22:
                sct.c("OnboardingTaskServiceServer", a.L(((rxv)object0), rqy.a(this.g), "Successfully executed task for node ", ": state="));
                this.c.c.l(this.g, ((rxv)object0));
                this.a = (rxv)object0;
                this.b = 2;
                if(this.c.c.d(this) == object1) {
                    return object1;
                }
                object2 = (rxv)object0;
            label_29:
                sbv.i(((rxv)object2));
            }
            catch(Exception exception0) {
            label_32:
                sct.f("OnboardingTaskServiceServer", a.a(rqy.a(this.g), "Task execution for node ", " failed."), exception0);
                sbv.h(this.c.c.c(this.g), exception0);
                if((exception0 instanceof CancellationException)) {
                    throw exception0;
                }
            }
        }
        catch(Throwable throwable0) {
            this.h.a();
            throw throwable0;
        }
        this.h.a();
        return ibom.a;
    }
}

