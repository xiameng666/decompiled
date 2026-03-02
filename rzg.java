import android.os.PersistableBundle;
import java.util.List;

public final class rzg implements sdg, sdv {
    @Override  // sdg
    public final Object b(PersistableBundle persistableBundle0) {
        return sdf.a(this, persistableBundle0);
    }

    @Override  // sdg
    public final Object c(PersistableBundle persistableBundle0) {
        ibuq.f(persistableBundle0, "persistableBundle");
        seb seb0 = new seb(new rzf());
        PersistableBundle persistableBundle1 = persistableBundle0.getPersistableBundle("triggers");
        if(persistableBundle1 == null) {
            throw new IllegalArgumentException("PersistableBundle is missing value for key: triggers");
        }
        List list0 = seb0.d(persistableBundle1);
        String s = persistableBundle0.getString("readOnlyOnce");
        if(s == null) {
            throw new IllegalArgumentException("PersistableBundle is missing value for key: readOnlyOnce");
        }
        boolean z = Boolean.parseBoolean(s);
        String s1 = persistableBundle0.getString("runAgainOnSuccessiveTriggers");
        if(s1 != null) {
            return new rzh(list0, z, Boolean.parseBoolean(s1));
        }
        throw new IllegalArgumentException("PersistableBundle is missing value for key: runAgainOnSuccessiveTriggers");
    }

    @Override  // sdv
    public final PersistableBundle d(Object object0) {
        rzn rzn0 = (rzn)object0;
        ibuq.f(rzn0, "value");
        return new rzh(rzn0).a();
    }

    @Override  // rna
    public final Object fm(Object object0) {
        return sdf.b(this, object0);
    }
}

