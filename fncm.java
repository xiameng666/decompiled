import android.os.PersistableBundle;

public final class fncm implements sdg {
    @Override  // sdg
    public final Object b(PersistableBundle persistableBundle0) {
        return sdf.a(this, persistableBundle0);
    }

    @Override  // sdg
    public final Object c(PersistableBundle persistableBundle0) {
        ibuq.f(persistableBundle0, "persistableBundle");
        int v = persistableBundle0.getInt("response_id", -1);
        switch(v) {
            case 2: {
                String s = persistableBundle0.getString("authAccount");
                if(s == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                String s1 = persistableBundle0.getString("accountType");
                if(s1 != null) {
                    return new fncr(s, s1, rjc.a(persistableBundle0, "new_account_created"), persistableBundle0.getString("restoreAccount"), persistableBundle0.getString("restoreToken"));
                }
                throw new IllegalArgumentException("Required value was null.");
            }
            case 3: {
                return fncl.a;
            }
            case 5: {
                return fncq.a;
            }
            case 6: {
                return fncn.a;
            }
            case 7: {
                return fnco.a;
            }
            case 8: {
                return fncp.a;
            }
            default: {
                throw fncs.c.contains(Integer.valueOf(v)) ? new IllegalStateException("Can\'t create AddAccountResponse from reserved responseVersion=" + v) : new IllegalStateException(a.t(persistableBundle0, v, "Can\'t create AddAccountResponse from unknown responseVersion=", " from persistableBundle="));
            }
        }
    }

    @Override  // rna
    public final Object fm(Object object0) {
        return sdf.b(this, object0);
    }
}

