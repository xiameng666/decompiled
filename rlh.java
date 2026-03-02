import android.os.PersistableBundle;
import androidx.activity.result.ActivityResult;

final class rlh extends ibsl implements ibts {
    int a;
    final rkz b;
    final PersistableBundle c;

    public rlh(rkz rkz0, PersistableBundle persistableBundle0, ibrl ibrl0) {
        this.b = rkz0;
        this.c = persistableBundle0;
        super(1, ibrl0);
    }

    @Override  // ibts
    public final Object a(Object object0) {
        return new rlh(this.b, this.c, ((ibrl)object0)).jI(ibom.a);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v != 0) {
            return object0;
        }
        rkz rkz0 = this.b;
        PersistableBundle persistableBundle0 = this.c;
        PersistableBundle persistableBundle1 = persistableBundle0.getPersistableBundle("ci.KEY_SESSION");
        if(persistableBundle1 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        Object object2 = sdn.a(persistableBundle0, "ci.KEY_DATA", scu.a);
        if(object2 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        Boolean boolean0 = Boolean.valueOf(rjc.a(persistableBundle0, "ci.FAILURE"));
        this.a = 1;
        Object object3 = rkz0.b(persistableBundle1, ((ActivityResult)object2), boolean0, this);
        return object3 == object1 ? object1 : object3;
    }
}

