import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;

public final class aqnk implements aqni {
    public final aqsm a;
    public final PackageManager b;
    private static final baun c;
    private final String d;
    private final Context e;

    static {
        aqnk.c = aqql.a("PhotosFlavorHandler");
    }

    public aqnk(Context context0) {
        aqsm aqsm0 = aqsm.b(context0);
        PackageManager packageManager0 = context0.getPackageManager();
        super();
        this.e = context0;
        this.a = aqsm0;
        this.b = packageManager0;
        this.d = "com.google.android.gms";
    }

    public static Intent a(String s, String s1) {
        Intent intent0 = new Intent("android.intent.action.VIEW");
        String s2 = hqil.a.j().ar() ? "http://play.google.com/store/apps/details?id=" : "market://details?id=";
        intent0.setPackage("com.android.vending");
        intent0.setData(Uri.parse((s2 + "com.google.android.apps.photos&referrer=" + s)));
        intent0.putExtra("overlay", true);
        intent0.putExtra("callerId", s);
        intent0.putExtra("EnablementActionType", s1);
        return intent0;
    }

    @Override  // aqni
    public final aqft b(aqvd aqvd0) {
        String s = this.a.c(aqvd0);
        if(s != null) {
            aqnk.c.j("Google Photos backup is on and account is set.", new Object[0]);
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)aqft.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            ((aqft)hftv0).b |= 1;
            ((aqft)hftv0).c = true;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            aqft aqft0 = (aqft)hftp0.b_message;
            aqft0.b |= 2;
            aqft0.d = s;
            return (aqft)hftp0.N_build();
        }
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)aqft.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        aqft aqft1 = (aqft)hftp1.b_message;
        aqft1.b |= 1;
        aqft1.c = false;
        return (aqft)hftp1.N_build();
    }

    @Override  // aqni
    public final aqfx c() {
        return aqfx.c;
    }

    @Override  // aqni
    public final gfsx d(aqvd aqvd0) {
        if(!this.b(aqvd0).c) {
            switch(aqsl.a(this.b).c().ordinal()) {
                case 0: {
                    aqnk.c.j("Photos apk state is ideal. Returning empty enablement action", new Object[0]);
                    return gfqx.a;
                }
                case 1: 
                case 2: {
                    aqnk.c.j("Photos apk is not installed. Returning alley oop enablement action", new Object[0]);
                    return gfsx.m(aqnk.a(this.d, "EnablementActionMissingApk"));
                }
                case 3: {
                    aqnk.c.j("Photos apk is outdated. Returning alley oop enablement action", new Object[0]);
                    return gfsx.m(aqnk.a(this.d, "EnablementActionOldApk"));
                }
                case 4: {
                    aqnk.c.j("Photos is missing the required permissions; returning the photos permissions screen intent", new Object[0]);
                    Intent intent0 = new Intent();
                    intent0.setClassName("com.google.android.gms", "com.google.android.gms.backup.component.EnhancedBackupOptInActivity");
                    intent0.putExtra("EnablementActionType", "EnablementActionBackupDisabled");
                    return gfsx.m(intent0);
                }
                case 5: {
                    aqnk.c.j("Photos apk is a stub. Returning alley oop enablement action", new Object[0]);
                    return gfsx.m(aqnk.a(this.d, "EnablementActionOldApk"));
                }
                default: {
                    throw new RuntimeException(null, null);
                }
            }
        }
        aqnk.c.j("Google Photos backup is enabled.", new Object[0]);
        return gfqx.a;
    }

    @Override  // aqni
    public final boolean e(Account account0, aqvd aqvd0) {
        gfsx gfsx0 = this.d(aqvd0);
        if(gfsx0.i()) {
            aqnk.c.j("Google Photos backup requires enablement action.", new Object[0]);
            String s = ((Intent)gfsx0.d()).getStringExtra("EnablementActionType");
            if("EnablementActionMissingApk".equals(s) || "EnablementActionOldApk".equals(s)) {
                aqjj.a(this.e, account0).edit().putBoolean(aqjm.a(account0, this.e), true).apply();
                return true;
            }
            return true;
        }
        aqjj.a(this.e, account0).edit().putBoolean(aqjm.a(account0, this.e), false).apply();
        String s1 = this.a.c(aqvd0);
        return hqil.a.j().ak() || s1 == null ? this.a.e(account0.name, aqvd0) : true;
    }

    public static boolean f(Intent intent0) {
        return "EnablementActionMissingApk".equals(intent0.getStringExtra("EnablementActionType"));
    }

    public static boolean g(Intent intent0) {
        return "EnablementActionBackupDisabled".equals(intent0.getStringExtra("EnablementActionType"));
    }

    public static boolean h(Intent intent0) {
        return "EnablementActionOldApk".equals(intent0.getStringExtra("EnablementActionType"));
    }
}

