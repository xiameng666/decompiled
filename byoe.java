import android.content.Context;
import android.content.Intent;

final class byoe extends ibsl implements ibtw {
    int a;
    final byof b;
    final Intent c;
    final Context d;

    public byoe(byof byof0, Intent intent0, Context context0, ibrl ibrl0) {
        this.b = byof0;
        this.c = intent0;
        this.d = context0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((byoe)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new byoe(this.b, this.c, this.d, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            this.a = 1;
            if(this.b.a.a(this.c, this.d, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

