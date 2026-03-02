import android.content.Intent;
import android.os.PersistableBundle;
import androidx.activity.result.ActivityResult;
import com.android.onboarding.utils.persistable.PersistableIntent;

public final class scu implements sdg, sdv {
    public static final scu a;

    static {
        scu.a = new scu();
    }

    @Override  // sdg
    public final Object b(PersistableBundle persistableBundle0) {
        return sdf.a(this, persistableBundle0);
    }

    @Override  // sdg
    public final Object c(PersistableBundle persistableBundle0) {
        ibuq.f(persistableBundle0, "persistableBundle");
        int v = persistableBundle0.getInt("par.resultCode");
        PersistableIntent persistableIntent0 = (PersistableIntent)sdn.a(persistableBundle0, "par.data", PersistableIntent.CREATOR);
        return persistableIntent0 == null ? new ActivityResult(v, null) : new ActivityResult(v, persistableIntent0.b());
    }

    @Override  // sdv
    public final PersistableBundle d(Object object0) {
        ibuq.f(((ActivityResult)object0), "value");
        PersistableBundle persistableBundle0 = new PersistableBundle();
        persistableBundle0.putInt("par.resultCode", ((ActivityResult)object0).a);
        Intent intent0 = ((ActivityResult)object0).b;
        if(intent0 != null) {
            sdn.b(persistableBundle0, "par.data", new PersistableIntent(intent0));
        }
        return persistableBundle0;
    }

    @Override  // rna
    public final Object fm(Object object0) {
        return sdf.b(this, object0);
    }
}

