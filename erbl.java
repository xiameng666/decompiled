import android.os.PersistableBundle;
import java.util.List;

public final class erbl implements sdg {
    @Override  // sdg
    public final Object b(PersistableBundle persistableBundle0) {
        return sdf.a(this, persistableBundle0);
    }

    @Override  // sdg
    public final Object c(PersistableBundle persistableBundle0) {
        ibuq.f(persistableBundle0, "persistableBundle");
        List list0 = sde.b(persistableBundle0, "sourceAccounts", erbk.a);
        if(list0 == null) {
            throw new IllegalStateException("Missing sourceAccounts");
        }
        List list1 = ibpo.ag(list0);
        String[] arr_s = persistableBundle0.getStringArray("transferredAccounts");
        if(arr_s != null) {
            List list2 = ibpg.N(arr_s);
            if(list2 != null) {
                String s = persistableBundle0.getString("restoreAccount");
                if(s == null || s.length() == 0) {
                    s = null;
                }
                return new erbm(list1, list2, s, persistableBundle0.getString("restoreToken"));
            }
        }
        throw new IllegalStateException("Missing transferredAccounts");
    }

    @Override  // rna
    public final Object fm(Object object0) {
        return sdf.b(this, object0);
    }
}

