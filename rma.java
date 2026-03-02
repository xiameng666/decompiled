import android.os.PersistableBundle;
import com.android.onboarding.pending.PendingContract.ErasedTask;
import com.android.onboarding.pending.PendingContract.Task;
import com.android.onboarding.utils.persistable.PersistableIntent;

public final class rma implements sdg {
    static final rma a;

    static {
        rma.a = new rma();
    }

    @Override  // sdg
    public final Object b(PersistableBundle persistableBundle0) {
        return sdf.a(this, persistableBundle0);
    }

    @Override  // sdg
    public final Object c(PersistableBundle persistableBundle0) {
        ibuq.f(persistableBundle0, "persistableBundle");
        String s = persistableBundle0.getString("cc.SUBTYPE");
        if(ibuq.m(s, "TaskToTask")) {
            ibuq.f(persistableBundle0, "persistableBundle");
            if(!ibuq.m(persistableBundle0.getString("cc.TYPE"), "Task")) {
                throw new IllegalArgumentException("Invalid type");
            }
            if(!ibuq.m(persistableBundle0.getString("cc.SUBTYPE"), "TaskToTask")) {
                throw new IllegalArgumentException("Invalid subtype");
            }
            Object object0 = sdn.a(persistableBundle0, "cc.TARGET", PendingContract.Task.b);
            if(object0 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            PersistableBundle persistableBundle1 = persistableBundle0.getPersistableBundle("cc.SESSION");
            if(persistableBundle1 == null) {
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
            roo roo0 = (roo)sdn.a(persistableBundle0, "cc.KEY_CALLBACK_SOURCE", rqw.a);
            roo roo1 = roo0 == null ? ((PendingContract.ErasedTask)object0) : roo0;
            rnv rnv0 = (rnv)sdn.a(persistableBundle0, "cc.KEY_CALLBACK_METADATA_STORE", rnv.a);
            String s1 = persistableBundle0.getString("cc.KEY_ESTIMATED_CALLBACK_RUNTIME");
            return s1 == null ? new rmd(persistableBundle1, ((PendingContract.ErasedTask)object0), ((rrc)object1), ((PersistableIntent)object2), roo1, null, rnv0, rjc.a(persistableBundle0, "cc.HANDLES_FAILURE"), persistableBundle0.getInt("cc.KEY_CALLBACK_USER_ID")) : new rmd(persistableBundle1, ((PendingContract.ErasedTask)object0), ((rrc)object1), ((PersistableIntent)object2), roo1, new ibzw(ibzv.a(s1)), rnv0, rjc.a(persistableBundle0, "cc.HANDLES_FAILURE"), persistableBundle0.getInt("cc.KEY_CALLBACK_USER_ID"));
        }
        if(!ibuq.m(s, "TaskToActivity")) {
            throw new IllegalStateException("Unknown ChainedContract.Task type " + s);
        }
        ibuq.f(persistableBundle0, "persistableBundle");
        if(!ibuq.m(persistableBundle0.getString("cc.TYPE"), "Task")) {
            throw new IllegalArgumentException("Invalid type");
        }
        if(!ibuq.m(persistableBundle0.getString("cc.SUBTYPE"), "TaskToActivity")) {
            throw new IllegalArgumentException("Invalid subtype");
        }
        PersistableBundle persistableBundle2 = persistableBundle0.getPersistableBundle("cc.SESSION");
        if(persistableBundle2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Object object3 = sdn.a(persistableBundle0, "cc.TARGET", PendingContract.Task.b);
        if(object3 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Object object4 = sdn.a(persistableBundle0, "cc.KEY_CALLBACK_REF", rqx.a);
        if(object4 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Object object5 = sdn.a(persistableBundle0, "cc.KEY_CALLBACK_SERVICE_INTENT", PersistableIntent.CREATOR);
        if(object5 != null) {
            return new rmc(persistableBundle2, ((PendingContract.ErasedTask)object3), ((rrc)object4), ((PersistableIntent)object5), persistableBundle0.getInt("cc.KEY_CALLBACK_USER_ID"));
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override  // rna
    public final Object fm(Object object0) {
        return sdf.b(this, object0);
    }
}

