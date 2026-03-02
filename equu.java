import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.smartdevice.d2d.PostTransferAction;
import java.net.URISyntaxException;

public final class equu {
    public static Intent a(Context context0, PostTransferAction postTransferAction0) {
        return (Intent)equu.e(context0, context0.getPackageManager(), postTransferAction0).b;
    }

    public static gjmw b(Context context0, PostTransferAction postTransferAction0) {
        if(postTransferAction0 != null) {
            gjmw gjmw0 = (gjmw)equu.e(context0, context0.getPackageManager(), postTransferAction0).a;
            return gjmw0 == null ? gjmw.a : gjmw0;
        }
        return gjmw.a;
    }

    private static Intent c(String s) {
        if(TextUtils.isEmpty(s)) {
            return null;
        }
        if(s.startsWith("intent:")) {
            try {
                return Intent.parseUri(s, 1);
            }
            catch(URISyntaxException unused_ex) {
                return null;
            }
        }
        Intent intent0 = new Intent("android.intent.action.VIEW");
        intent0.setData(Uri.parse(s));
        return intent0;
    }

    private static ResolveInfo d(PackageManager packageManager0, Intent intent0) {
        return intent0 == null ? null : packageManager0.resolveActivity(intent0, 0);
    }

    private static kau e(Context context0, PackageManager packageManager0, PostTransferAction postTransferAction0) {
        Intent intent0 = equu.c(postTransferAction0.b);
        Intent intent1 = equu.c(postTransferAction0.c);
        Intent intent2 = equu.c(postTransferAction0.d);
        boolean z = equu.f(packageManager0, intent1);
        boolean z1 = equu.f(packageManager0, intent2);
        ResolveInfo resolveInfo0 = equu.d(packageManager0, intent0);
        String s = postTransferAction0.e;
        boolean z2 = false;
        if(!TextUtils.isEmpty(s)) {
            try {
                if(packageManager0.getPackageInfo(s, 0) != null) {
                    z2 = true;
                }
            }
            catch(PackageManager.NameNotFoundException unused_ex) {
            }
        }
        if(!z1 && (!z2 && postTransferAction0.f <= 0L)) {
            if(z && hqnd.d()) {
                return new kau(gjmw.b, intent1);
            }
            return resolveInfo0 == null || resolveInfo0.activityInfo == null || !azql.c(context0).g(resolveInfo0.activityInfo.packageName) ? new kau(gjmw.a, null) : new kau(gjmw.d, intent0);
        }
        return new kau(gjmw.c, intent2);
    }

    private static boolean f(PackageManager packageManager0, Intent intent0) {
        return equu.d(packageManager0, intent0) != null;
    }
}

