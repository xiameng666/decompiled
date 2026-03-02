import android.os.PersistableBundle;
import com.android.onboarding.pending.PendingContract.Activity;
import com.android.onboarding.pending.PendingContract.ErasedActivity;
import com.android.onboarding.utils.persistable.PersistableIntent;

public final class rlu implements sdg {
    static final rlu a;

    static {
        rlu.a = new rlu();
    }

    @Override  // sdg
    public final Object b(PersistableBundle persistableBundle0) {
        return sdf.a(this, persistableBundle0);
    }

    @Override  // sdg
    public final Object c(PersistableBundle persistableBundle0) {
        ibuq.f(persistableBundle0, "persistableBundle");
        String s = persistableBundle0.getString("cc.SUBTYPE");
        if(ibuq.m(s, "ActivityToTask")) {
            ibuq.f(persistableBundle0, "persistableBundle");
            if(!ibuq.m(persistableBundle0.getString("cc.TYPE"), "Activity")) {
                throw new IllegalArgumentException("Invalid type");
            }
            if(!ibuq.m(persistableBundle0.getString("cc.SUBTYPE"), "ActivityToTask")) {
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
            if(object2 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            int v = persistableBundle0.getInt("cc.KEY_CALLBACK_USER_ID");
            String s1 = persistableBundle0.getString("cc.KEY_ESTIMATED_CALLBACK_RUNTIME");
            return s1 == null ? new rly(persistableBundle1, ((PendingContract.ErasedActivity)object0), ((rrc)object1), ((PersistableIntent)object2), null, ((rnv)sdn.a(persistableBundle0, "cc.KEY_CALLBACK_METADATA_STORE", rnv.a)), rjc.a(persistableBundle0, "cc.HANDLES_FAILURE"), v) : new rly(persistableBundle1, ((PendingContract.ErasedActivity)object0), ((rrc)object1), ((PersistableIntent)object2), new ibzw(ibzv.a(s1)), ((rnv)sdn.a(persistableBundle0, "cc.KEY_CALLBACK_METADATA_STORE", rnv.a)), rjc.a(persistableBundle0, "cc.HANDLES_FAILURE"), v);
        }
        if(ibuq.m(s, "ActivityToActivity")) {
            return rlw.d(persistableBundle0);
        }
        throw new IllegalStateException("Unknown ChainedContract.Activity type " + s);
    }

    @Override  // rna
    public final Object fm(Object object0) {
        return sdf.b(this, object0);
    }
}

