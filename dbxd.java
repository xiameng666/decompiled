import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.UserManager;
import android.provider.Settings.Secure;
import com.google.android.chimera.TileService;
import com.google.android.gms.nearby.sharing.ModuleInitializer;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public final class dbxd {
    public static final void a(Context context0) {
        boolean z19;
        boolean z18;
        boolean z17;
        boolean z16;
        boolean z15;
        boolean z12;
        boolean z11;
        boolean z10;
        String s3;
        String s2;
        boolean z8;
        boolean z7;
        boolean z6;
        boolean z5;
        boolean z4;
        ibuq.f(context0, "context");
        ibuq.f(context0, "context");
        if(!((UserManager)context0.getSystemService(UserManager.class)).isUserUnlocked()) {
            return;
        }
        boolean z = ModuleInitializer.a(context0);
        boolean z1 = true;
        boolean z2 = z && !dcww.b(context0.getApplicationContext()).d();
        boolean z3 = hvod.c();
        cuna.a(context0, "com.google.android.gms.nearby.sharing.main.MainActivity", z2 && z3);
        cuna.a(context0, "com.google.android.gms.nearby.sharing.main.SettingsMainActivity", z2 && z3);
        cuna.a(context0, "com.google.android.gms.nearby.sharing.RemoteCopyShareSheetActivity", z2 && bbqa.c());
        if(!z2) {
            z4 = false;
            z5 = false;
            z6 = z3;
        }
        else if(!z3) {
            z4 = true;
            z5 = true;
            z6 = false;
        }
        else {
            z5 = true;
            z6 = true;
            z4 = false;
        }
        cuna.a(context0, "com.google.android.gms.nearby.sharing.settings.SettingsActivity", z4);
        cuna.a(context0, "com.google.android.gms.nearby.sharing.settings.SettingsActivityLandingAlias", z5 && !z6 && !hvqz.W());
        if(!z2) {
            z7 = false;
            z8 = z3;
        }
        else if(!z3) {
            z7 = true;
            z8 = false;
        }
        else {
            z8 = true;
            z7 = false;
        }
        boolean z9 = cuna.b(context0, new String[]{"com.google.android.gms.nearby.sharing.send.SendActivity"});
        cuna.a(context0, "com.google.android.gms.nearby.sharing.send.SendActivity", z7);
        if(bbnp.e(context0)) {
            String s = Settings.Secure.getString(context0.getContentResolver(), "nearby_sharing_component");
            if(s != null && ibzk.W(s, "com.google.android.gms")) {
                Settings.Secure.putString(context0.getContentResolver(), "nearby_sharing_component", "");
            }
        }
        else {
            dcwv dcwv0 = dcww.a(context0);
            String s1 = dcwv0 == null ? null : dcwv0.a;
            if(s1 != null && s1.length() != 0) {
                List list0 = context0.getPackageManager().queryIntentActivities(new Intent("android.intent.action.SEND").setPackage(s1).setType("*"), 0);
                ibuq.e(list0, "queryIntentActivities(...)");
                ResolveInfo resolveInfo0 = (ResolveInfo)ibpo.T(list0);
                if(resolveInfo0 == null) {
                    s2 = null;
                }
                else {
                    ActivityInfo activityInfo0 = resolveInfo0.activityInfo;
                    if(activityInfo0 == null) {
                        s2 = null;
                    }
                    else {
                        s2 = activityInfo0.packageName + "/" + activityInfo0.name;
                        dcvz.a.b().h("Built nearby_sharing_component from VendorMetadata %s", s2);
                    }
                }
            }
            else {
                s2 = null;
            }
            if(s2 != null) {
                s3 = s2;
            }
            else if(z8) {
                s3 = "com.google.android.gms/com.google.android.gms.nearby.sharing.main.MainActivity";
            }
            else if(z7) {
                s3 = "com.google.android.gms/com.google.android.gms.nearby.sharing.send.SendActivity";
            }
            else {
                s3 = null;
            }
            Settings.Secure.putString(context0.getContentResolver(), "nearby_sharing_component", s3);
        }
        if(!hvrc.a.b().ae() || djbw.i(context0)) {
            cuna.a(context0, "com.google.android.gms.nearby.sharing.SharingTileService", z2);
        }
        if(z2) {
            z10 = !z3;
        }
        else {
            if(djbm.g()) {
                dcww dcww0 = dcww.b(context0);
                if(dcww0.e() && dcww0.f()) {
                    Intent intent0 = new Intent("com.google.android.gms.nearby.sharing.ACTION_UPDATE_VISIBILITY_TILE");
                    intent0.putExtra("action", "remove");
                    intent0.setPackage("com.samsung.android.app.sharelive");
                    context0.sendBroadcast(intent0);
                    dcvz.a.b().p("Disabled Nearby Share tile on Samsung SDK device.", new Object[0]);
                }
            }
            z10 = false;
        }
        cuna.a(context0, "com.google.android.gms.nearby.sharing.quicksettings.QuickSettingsActivity", z10);
        if(cumz.j(context0) && djbw.i(context0)) {
            try {
                TileService.requestListeningState(context0.getApplicationContext(), new ComponentName("com.google.android.gms", "com.google.android.gms.nearby.sharing.SharingTileService"));
            }
            catch(IllegalArgumentException illegalArgumentException0) {
                dcvz.a.e().f(illegalArgumentException0).p("Failed to update quick setting tile.", new Object[0]);
            }
            catch(SecurityException securityException0) {
                dcvz.a.e().f(securityException0).p("Failed to update quick setting tile.", new Object[0]);
            }
        }
        cuna.a(context0, "com.google.android.gms.nearby.sharing.SharingSliceProvider", z);
        if(z) {
            if(z2) {
                osl osl0 = new osl(context0);
                try {
                    osl0.b(diww.e);
                }
                catch(NullPointerException nullPointerException0) {
                    dcvz.a.c().f(nullPointerException0).p("Failed to force binding slice", new Object[0]);
                }
                catch(IllegalArgumentException illegalArgumentException1) {
                    dcvz.a.c().f(illegalArgumentException1).p("Failed to force binding slice", new Object[0]);
                }
                catch(SecurityException securityException1) {
                    dcvz.a.c().f(securityException1).p("Failed to force binding slice", new Object[0]);
                }
            }
            ggqj ggqj0 = dcwi.a(context0).om();
            ibuq.e(ggqj0, "iterator(...)");
            while(ggqj0.hasNext()) {
                String s4 = (String)ggqj0.next();
                ibuq.c(s4);
                if(s4.length() > 0) {
                    dbxe.a(s4, context0);
                }
            }
        }
        cuna.a(context0, "com.google.android.gms.nearby.sharing.DirectShareService", z2);
        cuna.a(context0, "com.google.android.gms.nearby.sharing.SharingSyncService", z2);
        cuna.a(context0, "com.google.android.gms.nearby.sharing.SettingsReviewActivity", z2 && !z3);
        cuna.a(context0, "com.google.android.gms.nearby.sharing.suw2.SetupWizardActivity", z2);
        cuna.a(context0, "com.google.android.gms.nearby.sharing.receive.ReceiveActivity", z2);
        if(!z2) {
            z11 = false;
            z12 = false;
        }
        else if(hvqz.W() && !z3) {
            z11 = true;
            z12 = true;
        }
        else {
            z12 = true;
            z11 = false;
        }
        cuna.a(context0, "com.google.android.gms.nearby.sharing.receive.ReceiveActivityLandingAlias", z11);
        cuna.a(context0, "com.google.android.gms.nearby.sharing.receive.ReceiveActivityQrCodeAlias", z12 && !z3);
        cuna.a(context0, "com.google.android.gms.nearby.sharing.receive.ReceiveActivityReceiveActionAlias", z12 && !z3);
        boolean z13 = hvqz.a.b().bj() && z && !z12 && djbm.g();
        dcvz.a.b().i("%s enable=%s", "com.google.android.gms.nearby.sharing.receive.SamsungQrCodeActivity", Boolean.valueOf(z13));
        cuna.a(context0, "com.google.android.gms.nearby.sharing.receive.SamsungQrCodeActivity", z13);
        cuna.a(context0, "com.google.android.gms.nearby.sharing.ReceiveSurfaceService", z);
        cuna.a(context0, "com.google.android.gms.nearby.sharing.NotificationActionActivity", z2);
        cuna.a(context0, "com.google.android.gms.nearby.sharing.GcmBroadcastReceiver", z);
        cuna.a(context0, "com.google.android.gms.nearby.sharing.migration.TransparentTrampolineActivity", z && !z2);
        PackageManager packageManager0 = context0.getPackageManager();
        ibuq.e(packageManager0, "getPackageManager(...)");
        hvqs hvqs0 = hvqs.a;
        boolean z14 = dbxe.b(packageManager0, hvqs0.aT().dh(), hvqs0.aT().al());
        if(!z2) {
            z15 = false;
            z16 = false;
        }
        else if(z14) {
            z15 = true;
            z16 = true;
        }
        else {
            z16 = true;
            z15 = false;
        }
        cuna.a(context0, (z3 ? "com.google.android.gms.nearby.sharing.main.MainActivityAliasSamsungGallery" : "com.google.android.gms.nearby.sharing.send.SendActivityAliasSamsungGallery"), z15);
        for(int v = 0; true; ++v) {
            z17 = true;
            if(v >= 2) {
                break;
            }
            if(jwe.a(context0, new String[]{"com.sec.android.app.myfiles.permission.READ", "com.sec.android.app.myfiles.permission.WRITE"}[v]) != 0) {
                z17 = false;
                break;
            }
        }
        PackageManager packageManager1 = context0.getPackageManager();
        ibuq.e(packageManager1, "getPackageManager(...)");
        cuna.a(context0, (z3 ? "com.google.android.gms.nearby.sharing.main.MainActivityAliasSamsungMyFiles" : "com.google.android.gms.nearby.sharing.send.SendActivityAliasSamsungMyFiles"), z16 && z17 && dbxe.b(packageManager1, hvqs0.aT().di(), hvqs0.aT().am()));
        if(!z2) {
            cuqx cuqx0 = new cuqx(context0);
            ArrayList arrayList0 = new ArrayList();
            for(Object object0: cuqx0.a()) {
                jwo jwo0 = (jwo)object0;
                Set set0 = jwo0.j;
                if(set0 != null && (set0.contains("com.google.android.gms.nearby.sharing.SHARE_TARGET") || set0.contains("com.google.android.gms.nearby.sharing.main.SHARE_TARGET"))) {
                    String s5 = jwo0.b;
                    ibuq.e(s5, "getId(...)");
                    arrayList0.add(s5);
                }
            }
            cuqx0.b(arrayList0);
        }
        if(z) {
            context0.startService(new Intent().setClassName(context0, "com.google.android.gms.nearby.sharing.ReceiveSurfaceService"));
            context0.startService(new Intent().setClassName(context0, "com.google.android.gms.nearby.sharing.SendSurfaceService"));
        }
        if(z9 != z7) {
            cutr.d(context0, new Intent("com.google.android.gms.nearby.sharing.STATE_CHANGED"));
        }
        if(!z3) {
            z18 = false;
            z19 = false;
        }
        else if(hvqz.H() && !djbm.g()) {
            z18 = true;
            z19 = true;
        }
        else {
            z19 = true;
            z18 = false;
        }
        cuna.a(context0, "com.google.android.gms.nearby.sharing.ReceiveUsingSamsungQrCodeMainActivity", z18);
        if(z19 || !hvqz.H() || djbm.g()) {
            z1 = false;
        }
        cuna.a(context0, "com.google.android.gms.nearby.sharing.ReceiveUsingSamsungQrCodeActivity", z1);
    }
}

