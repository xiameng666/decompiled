import android.app.KeyguardManager;
import j..time.Duration;

public final class eyco extends ibsl implements ibtw {
    Object a;
    int b;
    final boolean c;
    final eycp d;

    public eyco(boolean z, eycp eycp0, ibrl ibrl0) {
        this.c = z;
        this.d = eycp0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((eyco)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new eyco(this.c, this.d, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object2;
        Object object1 = ibrx.a;
        String s = "_false_negative";
        if(this.b == 0) {
            ibnx.b(object0);
            ibuz ibuz0 = new ibuz();
            try {
                if(!this.c) {
                    Object object3 = this.d.f.getSystemService("keyguard");
                    ibuq.d(object3, "null cannot be cast to non-null type android.app.KeyguardManager");
                    Duration duration0 = glyb.c(5000);
                    eycn eycn0 = new eycn(((KeyguardManager)object3), ibuz0, null);
                    this.a = ibuz0;
                    this.b = 1;
                    if(glya.c(duration0, eycn0, this) == object1) {
                        return object1;
                    }
                }
                object2 = ibuz0;
                goto label_32;
            }
            catch(Throwable throwable1) {
                object2 = ibuz0;
                throwable0 = throwable1;
            }
        label_24:
            if(this.c) {
                s = "_nearby";
            }
            else if(!((ibuz)object2).a) {
                s = "_true_negative";
            }
            this.d.e.a("Active_Unlock" + s);
            this.d.e.c();
            throw throwable0;
        }
        else {
            try {
                object2 = this.a;
                ibnx.b(object0);
            }
            catch(Throwable throwable0) {
                goto label_24;
            }
        }
    label_32:
        if(this.c) {
            s = "_nearby";
        }
        else if(!((ibuz)object2).a) {
            s = "_true_negative";
        }
        this.d.e.a("Active_Unlock" + s);
        this.d.e.c();
        return ibom.a;
    }
}

