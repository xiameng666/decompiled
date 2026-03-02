import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.os.Build.VERSION;
import java.util.ArrayList;

public final class gavk {
    public static final hdfo a(hdfh hdfh0, Intent intent0, Context context0) {
        ibuq.f(hdfh0, "<this>");
        ibuq.f(intent0, "launchingIntent");
        ibuq.f(context0, "context");
        if((hdfh0.b & 8) != 0) {
            try {
                PackageInfo packageInfo0 = context0.getPackageManager().getPackageInfo(hdfh0.c, 0);
                String s = hdfh0.c;
                int v = (hdfh0.h == null ? hdfi.a : hdfh0.h).c;
                String s1 = (hdfh0.h == null ? hdfi.a : hdfh0.h).d;
                String s2 = hdfh0.c;
                ibuq.e(s2, "getPackageName(...)");
                ibuq.c(packageInfo0);
                if(!gcuo.b(s, v, s1, bbms.b(context0, s2))) {
                    return hdfo.c;
                }
                if(((hdfh0.h == null ? hdfi.a : hdfh0.h).b & 4) != 0) {
                    String s3 = hdfh0.c;
                    ibuq.e(s3, "getPackageName(...)");
                    String s4 = (hdfh0.h == null ? hdfi.a : hdfh0.h).e;
                    ibuq.e(s4, "getSigningCertificateFingerprintSha256(...)");
                    ibuq.f(context0, "<this>");
                    ibuq.f(s3, "packageName");
                    ibuq.f(s4, "certificate");
                    ibuq.f(context0, "<this>");
                    ibuq.f(s3, "packageName");
                    gged_interceptors gged0 = bbms.d(context0, s3, "SHA-256");
                    ibuq.e(gged0, "getPackageCertificateHistoryHashBytes(...)");
                    ArrayList arrayList0 = new ArrayList(ibpo.q(gged0, 10));
                    ggqk ggqk0 = gged0.E();
                    while(ggqk0.hasNext()) {
                        Object object0 = ggqk0.next();
                        arrayList0.add(bboy.b(((byte[])object0)));
                    }
                    if(!arrayList0.contains(s4)) {
                        return hdfo.d;
                    }
                }
                if(!(hdfh0.h == null ? hdfi.a : hdfh0.h).f && !gcuo.a(context0, hdfh0.c, intent0)) {
                    return hdfo.e;
                }
                gaxl.a();
                if(hzlv.a.b().g()) {
                    PackageManager packageManager0 = context0.getPackageManager();
                    return (Build.VERSION.SDK_INT >= 33 ? packageManager0.resolveActivity(intent0, 0x20000) : packageManager0.resolveActivity(intent0, 0)) == null ? hdfo.g : hdfo.a;
                }
                return hdfo.a;
            }
            catch(PackageManager.NameNotFoundException unused_ex) {
                return hdfo.b;
            }
        }
        return hdfo.a;
    }
}

