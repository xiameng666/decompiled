import android.os.PersistableBundle;

final class rli extends ibsl implements ibts {
    int a;
    final rlf b;
    final PersistableBundle c;

    public rli(rlf rlf0, PersistableBundle persistableBundle0, ibrl ibrl0) {
        this.b = rlf0;
        this.c = persistableBundle0;
        super(1, ibrl0);
    }

    @Override  // ibts
    public final Object a(Object object0) {
        return new rli(this.b, this.c, ((ibrl)object0)).jI(ibom.a);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v != 0) {
            return object0;
        }
        rlf rlf0 = this.b;
        PersistableBundle persistableBundle0 = this.c;
        PersistableBundle persistableBundle1 = persistableBundle0.getPersistableBundle("ci.KEY_SESSION");
        if(persistableBundle1 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        PersistableBundle persistableBundle2 = persistableBundle0.getPersistableBundle("ci.KEY_DATA");
        if(persistableBundle2 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        Boolean boolean0 = Boolean.valueOf(rjc.a(persistableBundle0, "ci.FAILURE"));
        this.a = 1;
        Object object2 = rlf0.b(persistableBundle1, persistableBundle2, boolean0, this);
        return object2 == object1 ? object1 : object2;
    }
}

