import android.os.PersistableBundle;
import j..util.Base64;

public final class fncj implements sdg {
    @Override  // sdg
    public final Object b(PersistableBundle persistableBundle0) {
        return sdf.a(this, persistableBundle0);
    }

    @Override  // sdg
    public final Object c(PersistableBundle persistableBundle0) {
        gged_interceptors gged0;
        ibuq.f(persistableBundle0, "persistableBundle");
        String s = persistableBundle0.getString("d2d_options");
        fnct fnct0 = null;
        byte[] arr_b = s == null ? null : Base64.getDecoder().decode(s);
        String s1 = persistableBundle0.getString("accountname");
        boolean z = rjc.a(persistableBundle0, "isSetupFlow");
        boolean z1 = rjc.a(persistableBundle0, "com.google.android.setupwizard/setupwizard");
        boolean z2 = rjc.a(persistableBundle0, "suppressD2D");
        boolean z3 = rjc.a(persistableBundle0, "resolveFrpOnly");
        String s2 = persistableBundle0.getString("packageName");
        boolean z4 = rjc.a(persistableBundle0, "useImmersiveMode");
        boolean z5 = rjc.a(persistableBundle0, "suppressGoogleServices");
        boolean z6 = rjc.a(persistableBundle0, "firstRun");
        PersistableBundle persistableBundle1 = persistableBundle0.getPersistableBundle("enterpriseFlowArgs");
        if(persistableBundle1 != null) {
            boolean z7 = rjc.a(persistableBundle1, "suppress_account_provisioning");
            String s3 = persistableBundle1.getString("flow_params");
            String[] arr_s = persistableBundle1.getStringArray("allowed_domains");
            if(arr_s == null) {
                gged0 = ggna.a;
                ibuq.e(gged0, "of(...)");
            }
            else {
                gged0 = ggdx.b(arr_s);
                if(gged0 == null) {
                    gged0 = ggna.a;
                    ibuq.e(gged0, "of(...)");
                }
            }
            fnct0 = new fnct(z7, s3, gged0);
        }
        return new fnck(s1, z1, z, z2, arr_b, z3, s2, z4, z5, z6, fnct0, rjc.a(persistableBundle0, "allow_skip"));
    }

    @Override  // rna
    public final Object fm(Object object0) {
        return sdf.b(this, object0);
    }
}

