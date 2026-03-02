import android.app.KeyguardManager;
import j..time.Duration;

final class eycn extends ibsl implements ibtw {
    int a;
    final KeyguardManager b;
    final ibuz c;

    public eycn(KeyguardManager keyguardManager0, ibuz ibuz0, ibrl ibrl0) {
        this.b = keyguardManager0;
        this.c = ibuz0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((eycn)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new eycn(this.b, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        ibnx.b(object0);
        do {
            if(!this.b.isKeyguardLocked()) {
                this.c.a = true;
                return ibom.a;
            }
            Duration duration0 = glyb.c(200);
            this.a = 1;
        }
        while(glya.a(duration0, this) != object1);
        return object1;
    }
}

