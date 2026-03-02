import android.os.PersistableBundle;

public class rrw extends rvp {
    @Override  // rvp
    public final PersistableBundle d(Object object0) {
        rsc rsc0 = (rsc)object0;
        ibuq.f(rsc0, "taskResult");
        PersistableBundle persistableBundle0 = new PersistableBundle();
        persistableBundle0.putString("RESULT", rsc0.name());
        return persistableBundle0;
    }

    @Override  // rvp
    public final PersistableBundle gx(Object object0) {
        String s = (String)object0;
        ibuq.f(s, "reason");
        PersistableBundle persistableBundle0 = new PersistableBundle();
        persistableBundle0.putString("REASON", s);
        return persistableBundle0;
    }

    @Override  // rvp
    public final Object i(PersistableBundle persistableBundle0) {
        ibuq.f(persistableBundle0, "bundle");
        Object object0 = persistableBundle0.getString("REASON", "");
        ibuq.e(object0, "getString(...)");
        return object0;
    }

    @Override  // rvp
    public final Object j(PersistableBundle persistableBundle0) {
        ibuq.f(persistableBundle0, "bundle");
        String s = persistableBundle0.getString("RESULT", "FAILURE_UNKNOWN");
        ibuq.e(s, "getString(...)");
        return rsc.a(s);
    }
}

