import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.provider.ContactsContract.Directory;
import android.text.TextUtils;
import jeb.synthetic.TWR;

public final class egkt {
    private static final ComponentName a;
    private static final ComponentName b;

    static {
        egkt.a = new ComponentName("com.google.android.gms", "com.google.android.gms.people.service.galprovider.PeopleGalProvider");
        egkt.b = new ComponentName("com.google.android.syncadapters.contacts", "com.google.android.syncadapters.contacts.ProxyGalProvider");
    }

    public static void a(Context context0) {
        synchronized(egkt.class) {
            try {
                PackageManager packageManager0 = context0.getPackageManager();
                int v1 = ehjp.a(packageManager0, egkt.b, 1);
                hxdy.k();
                if((bbqa.c() ? egkt.e(packageManager0) : egkt.f(packageManager0))) {
                    egig.k("GalProviderController", "GAL1 package doesn\'t exist or disabled.");
                    if(egkt.g(context0, "com.google.android.gms.people.gal.provider") == 1) {
                        egig.k("GalProviderController", "Unregister GmsCore GAL from CP2.");
                        egkt.d(context0);
                        return;
                    }
                    return;
                }
                int v2 = egkt.g(context0, "com.google.android.gms.people.gal.provider");
                int v3 = egkt.g(context0, "com.google.contacts.gal.provider");
                if(v2 == 3 || v3 == 3) {
                    egig.e("GalProviderController", "Query GAL in CP2 failed, do nothing");
                    return;
                }
                if(hxdy.a.f().p()) {
                    if(v2 == 1 && v3 == 2 && v1 == 3) {
                        egig.e("GalProviderController", "GmsCore GAL already worked.");
                        return;
                    }
                    egkt.h(context0, v1, false);
                    return;
                }
                if(v3 == 1 && v2 == 2 && v1 == 2) {
                    egig.e("GalProviderController", "GAL1 provider is already enabled.");
                    return;
                }
                egkt.h(context0, v1, true);
            }
            catch(Exception exception0) {
                egig.l("GalProviderController", "Exception in enableGalProviderOnFlag", exception0);
            }
        }
    }

    public static int b(Context context0) {
        PackageManager packageManager0 = context0.getPackageManager();
        hxdy.k();
        if(bbqa.c()) {
            if(!egkt.e(packageManager0)) {
                return 1;
            }
            egig.k("GalProviderController", "Should not enable GmsCore GAL when system feature is configured");
            return 3;
        }
        int v = ehjp.a(packageManager0, egkt.b, 1);
        if(!egkt.f(packageManager0)) {
            if(v != 1 && v != 3) {
                egig.e("GalProviderController", "Enable GmsCore GAL when Proxy is enabled.");
                return 2;
            }
            return 1;
        }
        egig.k("GalProviderController", "Should not enable GmsCore GAL when Proxy doesn\'t exist at all");
        return 3;
    }

    private static void c(Context context0) {
        try {
            ContactsContract.Directory.notifyDirectoryChange(context0.getContentResolver());
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            egig.l("GalProviderController", "IllegalArgumentException in notifyDirectoryChange", illegalArgumentException0);
        }
    }

    private static void d(Context context0) {
        bbmq.K(egkt.a, 1);
        egkt.c(context0);
    }

    private static boolean e(PackageManager packageManager0) {
        return packageManager0.hasSystemFeature("com.google.android.gms.feature.contacts_sync_disabled");
    }

    private static boolean f(PackageManager packageManager0) {
        return !ehjp.b(packageManager0);
    }

    private static int g(Context context0, String s) {
        if(TextUtils.isEmpty(s)) {
            return 3;
        }
        try {
            Cursor cursor0 = context0.getContentResolver().query(ContactsContract.Directory.ENTERPRISE_CONTENT_URI, new String[]{"authority"}, null, null, null);
            if(cursor0 == null) {
            label_13:
                if(cursor0 != null) {
                    cursor0.close();
                }
            }
            else {
                while(true) {
                    try {
                        if(!cursor0.moveToNext()) {
                            goto label_13;
                        }
                        if(s.equals(cursor0.getString(0))) {
                            goto label_10;
                        }
                        continue;
                    }
                    catch(Throwable throwable0) {
                        TWR.safeClose$NT(cursor0, throwable0);
                        throw throwable0;
                    }
                label_10:
                    cursor0.close();
                    return 1;
                }
            }
            return 2;
        }
        catch(IllegalArgumentException | SecurityException exception0) {
            egig.l("GalProviderController", "Exception when querying provider in CP2", exception0);
            return 3;
        }
    }

    private static void h(Context context0, int v, boolean z) {
        int v1 = 1;
        if(v != 1) {
            if(!z) {
                v1 = 2;
            }
            egig.i("GalProviderController", "setting component enabled=%d for %s", Integer.valueOf(v1), egkt.b.getClassName());
            try {
                bbmq.a.j(context0, egkt.b, v1, 0);
                egig.e("GalProviderController", "Setting component enabled succeeds.");
            }
            catch(IllegalArgumentException | SecurityException exception0) {
                egig.l("GalProviderController", "SetComponentEnabledSetting failed for %s", exception0);
                return;
            }
        }
        egkt.c(context0);
        egkt.d(context0);
    }
}

