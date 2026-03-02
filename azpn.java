import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.text.TextUtils;

public class azpn {
    public static final int c;
    public static final azpn d;

    static {
        azpn.c = 253434000;
        azpn.d = new azpn();
    }

    public final Intent k(Context context0, int v, String s) {
        switch(v) {
            case 1: 
            case 2: {
                if(context0 != null && bbnp.q(context0)) {
                    Intent intent0 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
                    intent0.setPackage("com.google.android.wearable.app");
                    return intent0;
                }
                StringBuilder stringBuilder0 = new StringBuilder("gcore_");
                stringBuilder0.append(azpn.c);
                stringBuilder0.append("-");
                if(!TextUtils.isEmpty(s)) {
                    stringBuilder0.append(s);
                }
                stringBuilder0.append("-");
                if(context0 != null) {
                    stringBuilder0.append("com.google.android.gms");
                }
                stringBuilder0.append("-");
                if(context0 != null) {
                    try {
                        stringBuilder0.append(bbsr.b(context0).e("com.google.android.gms", 0).versionCode);
                    }
                    catch(PackageManager.NameNotFoundException unused_ex) {
                    }
                }
                return bars.c("com.google.android.gms", stringBuilder0.toString());
            }
            case 3: {
                return bars.h();
            }
            default: {
                return null;
            }
        }
    }

    public final PendingIntent l(Context context0, int v, String s) {
        Intent intent0 = this.k(context0, v, s);
        return intent0 == null ? null : PendingIntent.getActivity(context0, 0, intent0, 0xC000000);
    }

    public final int m(Context context0) {
        return azqk.f(context0, 0) ? 18 : 0;
    }
}

