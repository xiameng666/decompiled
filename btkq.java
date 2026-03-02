import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import java.util.ArrayList;

public final class btkq {
    public static final int a(Context context0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hjgc.a).v_newBuilder();
        ArrayList arrayList0 = new ArrayList();
        PackageManager packageManager0 = context0.getPackageManager();
        if(packageManager0 == null) {
            arrayList0.add(hjgb.a);
            return arrayList0.contains(hjgb.a) ? 0 : ((hjgc)hftp0.b_message).c;
        }
        String s = "";
        for(Object object0: packageManager0.queryIntentActivities(new Intent().setComponent(new ComponentName("com.google.android.apps.helprtc", "com.google.android.apps.helprtc.ui.ScreenshareActivity")), 0)) {
            ActivityInfo activityInfo0 = ((ResolveInfo)object0).activityInfo;
            if(activityInfo0 != null && activityInfo0.enabled) {
                s = activityInfo0.packageName;
            }
        }
        if(TextUtils.isEmpty(s)) {
            arrayList0.add(hjgb.a);
            return arrayList0.contains(hjgb.a) ? 0 : ((hjgc)hftp0.b_message).c;
        }
        try {
            PackageInfo packageInfo0 = packageManager0.getPackageInfo(s, 0);
            if(packageInfo0 == null) {
                arrayList0.add(hjgb.a);
                return arrayList0.contains(hjgb.a) ? 0 : ((hjgc)hftp0.b_message).c;
            }
            int v = packageInfo0.versionCode;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hjgc hjgc0 = (hjgc)hftp0.b_message;
            hjgc0.b |= 1;
            hjgc0.c = v;
            return arrayList0.contains(hjgb.a) ? 0 : ((hjgc)hftp0.b_message).c;
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
            arrayList0.add(hjgb.a);
            return arrayList0.contains(hjgb.a) ? 0 : ((hjgc)hftp0.b_message).c;
        }
    }
}

