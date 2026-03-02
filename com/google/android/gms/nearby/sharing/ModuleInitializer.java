package com.google.android.gms.nearby.sharing;

import android.app.slice.SliceManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.UserManager;
import bbnp;
import bbpj;
import bbpz;
import cjpa;
import cjpc;
import cjpd;
import cjqh;
import cumz;
import cunf;
import dbxd;
import dbxe;
import dcik;
import dcvz;
import dcwi;
import dcww;
import diww;
import dizt;
import djak;
import ggqk;
import hvqf;
import hvqs;
import hvqz;
import ibuq;
import j..util.Objects;

public class ModuleInitializer extends dcik {
    private static final String a;

    static {
        ModuleInitializer.a = bbpz.f("com.google.android.gms.nearby");
    }

    public static boolean a(Context context0) {
        return hvqs.bg() && context0.getPackageManager().hasSystemFeature("android.hardware.bluetooth") && context0.getPackageManager().hasSystemFeature("android.hardware.bluetooth_le") && ModuleInitializer.f(context0) && (hvqz.a.b().bp() || !cumz.l(context0)) && ((hvqs.a.aT().dE() || !cumz.i(context0)) && (hvqs.a.aT().dH() || !cumz.g(context0, new String[]{"android.permission.MANAGE_USERS"}) || !bbpj.a(context0).i()) && cumz.j(context0) && !ModuleInitializer.b(context0));
    }

    public static boolean b(Context context0) {
        if(hvqz.a.b().v()) {
            UserManager userManager0 = (UserManager)context0.getSystemService("user");
            return userManager0 == null ? false : userManager0.getUserRestrictions().getBoolean("no_bluetooth_sharing", false);
        }
        return false;
    }

    private final cjpc d() {
        return cjqh.a(this.getApplicationContext(), "nearby", "nearbysharing:service:state", 0);
    }

    private static boolean f(Context context0) {
        if(bbnp.e(context0)) {
            return false;
        }
        if(bbnp.h(context0)) {
            return false;
        }
        return bbnp.i(context0) ? hvqs.bl() : true;
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0) {
        String s1;
        String s = intent0.getAction();
        if(!"com.google.android.gms.phenotype.COMMITTED".equals(s) && !ModuleInitializer.a.equals(s) || "com.google.android.gms.nearby".equals(intent0.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME"))) {
            dcww.c();
            if(!Objects.equals(s, "android.intent.action.PACKAGE_DATA_CLEARED") && !Objects.equals(s, "android.intent.action.PACKAGE_ADDED") && !Objects.equals(s, "android.intent.action.PACKAGE_REPLACED")) {
                dbxd.a(this);
                boolean z = ModuleInitializer.a(this);
                Intent intent1 = new Intent("com.google.android.gms.nearby.sharing.UPDATE_SYSTEM_COMPONENTS");
                intent1.putExtra("com.google.android.gms.nearby.sharing.EXTRA_PACKAGE_NAME", "com.google.android.gms");
                intent1.putExtra("com.google.android.gms.nearby.sharing.EXTRA_TILE_COMPONENT", "com.google.android.gms.nearby.sharing.SharingTileService");
                intent1.putExtra("com.google.android.gms.nearby.sharing.EXTRA_ENABLED", z);
                this.sendBroadcast(intent1);
                if(z) {
                    dcvz.a.b().p("Runtime state initialization complete. Sharing is enabled.", new Object[0]);
                    return;
                }
                cunf cunf0 = dcvz.a.b();
                if(!hvqs.bg()) {
                    s1 = "FLAG_DISABLED";
                }
                else if(!this.getPackageManager().hasSystemFeature("android.hardware.bluetooth")) {
                    s1 = "MISSING_BLUETOOTH";
                }
                else if(!this.getPackageManager().hasSystemFeature("android.hardware.bluetooth_le")) {
                    s1 = "MISSING_BLE";
                }
                else if(ModuleInitializer.f(this)) {
                    if(ModuleInitializer.b(this)) {
                        s1 = "FILE_SHARING_BLOCKED";
                    }
                    else {
                        s1 = cumz.j(this) ? "UNKNOWN" : "DISABLED_ON_NON_PRIMARY_PROFILE";
                    }
                }
                else if(bbnp.e(this)) {
                    s1 = "UNSUPPORTED_DEVICE_TYPE_CHROME_OS";
                }
                else if(bbnp.h(this)) {
                    s1 = "UNSUPPORTED_DEVICE_TYPE_THINGS";
                }
                else if(djak.a(this) && !hvqs.bl() && !hvqs.bf()) {
                    s1 = "UNSUPPORTED_DEVICE_TYPE_LATCHSKY";
                }
                else {
                    s1 = "UNSUPPORTED_DEVICE_TYPE";
                }
                cunf0.h("Runtime state initialization complete. Sharing is disabled for reason %s.", s1);
                return;
            }
            Uri uri0 = intent0.getData();
            if(uri0 != null) {
                String s2 = uri0.getSchemeSpecificPart();
                if(!hvqf.r()) {
                    if(hvqs.aS().b.contains(s2)) {
                        cunf cunf1 = dcvz.a;
                        cunf1.b().i("%s %s, Attempt to re-grant slice permission.", s2, s);
                        SliceManager sliceManager0 = (SliceManager)this.getSystemService(SliceManager.class);
                        try {
                            if(dizt.a(this, s2) == 1) {
                                cunf1.e().h("Unable to grant slice read permissions to %s because it\'s not a trusted app. Skipping.", s2);
                            }
                            else {
                                ggqk ggqk0 = diww.h.E();
                                while(ggqk0.hasNext()) {
                                    Object object0 = ggqk0.next();
                                    sliceManager0.grantSlicePermission(s2, ((Uri)object0));
                                }
                                cunf1.b().h("Granted slice and uri permissions to %s", s2);
                            }
                        }
                        catch(NullPointerException | IllegalArgumentException | SecurityException exception0) {
                            dcvz.a.c().f(exception0).h("Failed to grant slice permission for %s", s2);
                        }
                    }
                }
                else if(dcwi.a(this).contains(s2)) {
                    dcvz.a.b().i("%s %s, Attempt to re-grant slice permission.", s2, s);
                    ibuq.f(s2, "packageName");
                    dbxe.a(s2, this);
                }
                if((Objects.equals(s, "android.intent.action.PACKAGE_ADDED") || Objects.equals(s, "android.intent.action.PACKAGE_REPLACED")) && dcww.a(this) != null && !cjpd.i(this.d(), "migration_acknowledged", false)) {
                    cjpa cjpa0 = this.d().c();
                    cjpa0.e("migration_acknowledged", false);
                    cjpd.g(cjpa0);
                }
            }
        }
    }
}

