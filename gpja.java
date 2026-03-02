import android.content.pm.PackageManager;

public final class gpja extends iaqy {
    final PackageManager a;
    final ggfp b;
    final azql c;

    public gpja(PackageManager packageManager0, ggfp ggfp0, azql azql0) {
        this.a = packageManager0;
        this.b = ggfp0;
        this.c = azql0;
        super();
    }

    @Override  // iaqy
    public final iapk a(int v) {
        String[] arr_s = this.a.getPackagesForUid(v);
        if(arr_s != null) {
            for(int v1 = 0; v1 < arr_s.length; ++v1) {
                if(this.b.contains(arr_s[v1])) {
                    return this.c.i(v) ? iapk.b : iapk.i.f("Rejected by (1st-party only Allowlist) security policy. Not google-signed.");
                }
            }
        }
        return iapk.i.f("Rejected by (1st-party only Allowlist) security policy. Package not allowed.");
    }
}

