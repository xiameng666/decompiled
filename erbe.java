import android.os.PersistableBundle;

public final class erbe implements sdg {
    static final erbe a;

    static {
        erbe.a = new erbe();
    }

    @Override  // sdg
    public final Object b(PersistableBundle persistableBundle0) {
        return sdf.a(this, persistableBundle0);
    }

    @Override  // sdg
    public final Object c(PersistableBundle persistableBundle0) {
        ibuq.f(persistableBundle0, "persistableBundle");
        if(persistableBundle0.containsKey("accounts_transferred")) {
            String s = persistableBundle0.getString("restoreAccount");
            String s1 = persistableBundle0.getString("restoreToken");
            String s2 = persistableBundle0.getString("authAccount");
            if(s2 == null) {
                throw new IllegalStateException("Missing backupAccountName");
            }
            String s3 = persistableBundle0.getString("accountType");
            if(s3 != null) {
                return new erbh(s, s1, s2, s3, persistableBundle0.getInt("accounts_total"), persistableBundle0.getInt("accounts_transferred"));
            }
            throw new IllegalStateException("Missing backupAccountType");
        }
        return persistableBundle0.containsKey("reason") ? new erbg(persistableBundle0.getString("restoreAccount", null), 2) : new erbf(persistableBundle0.getString("restoreAccount", null));
    }

    @Override  // rna
    public final Object fm(Object object0) {
        return sdf.b(this, object0);
    }
}

