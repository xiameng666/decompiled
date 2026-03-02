import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import j..util.Objects;

public final class iaqv extends iaqy {
    final PackageManager a;
    final String b;
    final gged_interceptors c;

    public iaqv(PackageManager packageManager0, String s, gged_interceptors gged0) {
        this.a = packageManager0;
        this.b = s;
        this.c = gged0;
        super();
    }

    @Override  // iaqy
    public final iapk a(int v) {
        PackageManager packageManager0 = this.a;
        String[] arr_s = packageManager0.getPackagesForUid(v);
        if(arr_s == null) {
            return iapk.j.f("Rejected by signature check security policy");
        }
        boolean z = false;
        for(int v1 = 0; v1 < arr_s.length; ++v1) {
            String s = arr_s[v1];
            if(this.b.equals(s)) {
                Objects.requireNonNull(this.c);
                iaqt iaqt0 = new iaqt(this.c);
                try {
                    PackageInfo packageInfo0 = packageManager0.getPackageInfo(s, 0x8000000);
                    if(packageInfo0.signingInfo != null) {
                        Signature[] arr_signature = packageInfo0.signingInfo.hasMultipleSigners() ? packageInfo0.signingInfo.getApkContentsSigners() : packageInfo0.signingInfo.getSigningCertificateHistory();
                        for(int v2 = 0; v2 < arr_signature.length; ++v2) {
                            if(iaqt0.a(arr_signature[v2])) {
                                return iapk.b;
                            }
                        }
                    }
                }
                catch(PackageManager.NameNotFoundException unused_ex) {
                }
                z = true;
            }
        }
        return iapk.i.f("Rejected by signature check security policy. Package name matched: " + z);
    }
}

