import android.os.PersistableBundle;
import com.android.onboarding.pending.PendingContract.Activity;
import com.android.onboarding.pending.PendingContract.ErasedActivity;
import com.android.onboarding.utils.persistable.PersistableIntent;

public final class rlw implements sdg {
    @Override  // sdg
    public final Object b(PersistableBundle persistableBundle0) {
        return sdf.a(this, persistableBundle0);
    }

    @Override  // sdg
    public final Object c(PersistableBundle persistableBundle0) {
        return rlw.d(persistableBundle0);
    }

    public static final rlx d(PersistableBundle persistableBundle0) {
        ibuq.f(persistableBundle0, "persistableBundle");
        if(!ibuq.m(persistableBundle0.getString("cc.TYPE"), "Activity")) {
            throw new IllegalArgumentException("Invalid type");
        }
        if(!ibuq.m(persistableBundle0.getString("cc.SUBTYPE"), "ActivityToActivity")) {
            throw new IllegalArgumentException("Invalid subtype");
        }
        PersistableBundle persistableBundle1 = persistableBundle0.getPersistableBundle("cc.SESSION");
        if(persistableBundle1 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Object object0 = sdn.a(persistableBundle0, "cc.TARGET", PendingContract.Activity.b);
        if(object0 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Object object1 = sdn.a(persistableBundle0, "cc.KEY_CALLBACK_REF", rqx.a);
        if(object1 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Object object2 = sdn.a(persistableBundle0, "cc.KEY_CALLBACK_SERVICE_INTENT", PersistableIntent.CREATOR);
        if(object2 != null) {
            return new rlx(persistableBundle1, ((PendingContract.ErasedActivity)object0), ((rrc)object1), ((PersistableIntent)object2), persistableBundle0.getInt("cc.KEY_CALLBACK_USER_ID"));
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override  // rna
    public final Object fm(Object object0) {
        return sdf.b(this, object0);
    }
}

