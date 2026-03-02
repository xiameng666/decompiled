import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.backup.settings.component.PhotosEnablementSnackbarInfo;
import com.google.android.gms.backup.settings.ui.BackupAndResetFragment;
import com.google.android.gms.backup.settings.ui.BackupSettingsFragment;
import java.net.URISyntaxException;

public final class ashk {
    private static final baun a;

    static {
        ashk.a = aqql.a("BackupSettingsActivityUtil");
    }

    public static Intent a(PackageManager packageManager0, boolean z, boolean z1, Intent intent0) {
        Intent intent1 = aqzc.f(packageManager0, z);
        fpxr.d(intent1, (z ? hgwl.b : hgwl.c));
        intent1.putExtra("backup_services_available", z1);
        if(intent0 != null) {
            fpxr.e(intent0, intent1);
        }
        return intent1;
    }

    public static Intent b() {
        return new Intent().setClassName("com.google.android.gms", "com.google.android.gms.backup.navroot.BackupSettingsNavRootActivity");
    }

    public static PhotosEnablementSnackbarInfo c(Intent intent0) {
        return intent0 == null ? null : ((PhotosEnablementSnackbarInfo)intent0.getParcelableExtra("photosEnablementSnackbarInfo"));
    }

    public static void d(boolean z, Bundle bundle0) {
        bundle0.putBoolean("opt_in_launched", z);
    }

    public static boolean e(Intent intent0) {
        return intent0.getBooleanExtra("backup_services_available", true);
    }

    public static boolean f(Context context0) {
        return new aqjk(context0).i() && cchj.b(context0).p("com.google").length != 0;
    }

    public static boolean g(Bundle bundle0) {
        return bundle0 == null ? false : bundle0.getBoolean("opt_in_launched");
    }

    public static boolean h(Intent intent0) {
        return ashv.a(intent0, "launchedFromPromotionalNotification");
    }

    public static atad i(Intent intent0, Intent intent1) {
        atad atad0;
        String s = intent0.getStringExtra("show_fragment");
        String s1 = intent0.getStringExtra(":settings:fragment_args_key");
        if(fpxs.b()) {
            ashk.j(intent0);
        }
        if(BackupAndResetFragment.class.getName().equals(s)) {
            atad0 = new BackupAndResetFragment();
        }
        else if(!BackupSettingsFragment.class.getName().equals(s) && (s1 == null || !s1.equals("backup"))) {
            hqil hqil0 = hqil.a;
            if(hqil0.j().F() && intent0.getAction() != null && intent0.getData() != null) {
                Uri uri0 = intent0.getData();
                gftb.check(uri0);
                if(uri0.getHost() == null) {
                    goto label_34;
                }
                else {
                    Uri uri1 = intent0.getData();
                    gftb.check(uri1);
                    if(uri1.getPath() == null) {
                        goto label_34;
                    }
                    else {
                        String s2 = intent0.getAction();
                        gftb.check(s2);
                        if(s2.equals("android.intent.action.VIEW")) {
                            Uri uri2 = intent0.getData();
                            gftb.check(uri2);
                            String s3 = uri2.getHost();
                            gftb.check(s3);
                            if(s3.equals(hqil0.j().A())) {
                                Uri uri3 = intent0.getData();
                                gftb.check(uri3);
                                String s4 = uri3.getPath();
                                gftb.check(s4);
                                if(s4.equals(hqil.k())) {
                                    goto label_43;
                                }
                                else {
                                    Uri uri4 = intent0.getData();
                                    gftb.check(uri4);
                                    String s5 = uri4.getPath();
                                    gftb.check(s5);
                                    if(s5.equals(hqil.k() + "/")) {
                                        goto label_43;
                                    }
                                    else {
                                        goto label_34;
                                    }
                                }
                            }
                            else {
                                goto label_34;
                            }
                        }
                        else {
                            goto label_34;
                        }
                    }
                }
            }
            else {
            label_34:
                if(intent0.getExtras() == null) {
                    atad0 = new BackupAndResetFragment();
                }
                else {
                    Bundle bundle0 = intent0.getExtras();
                    gftb.check(bundle0);
                    Object object0 = bundle0.get("hide_reset");
                    if(object0 == null || !((object0 instanceof String) ? Boolean.parseBoolean(((String)object0)) : ((Boolean)object0).booleanValue())) {
                        atad0 = new BackupAndResetFragment();
                    }
                    else {
                        goto label_43;
                    }
                }
            }
        }
        else {
        label_43:
            Bundle bundle1 = new Bundle();
            String s6 = intent0.getStringExtra("scrollPreferenceKey");
            if(s6 != null) {
                bundle1.putString("scrollPreferenceKey", s6);
            }
            BackupSettingsFragment backupSettingsFragment0 = new BackupSettingsFragment();
            if(!bundle1.isEmpty()) {
                backupSettingsFragment0.setArguments(bundle1);
            }
            atad0 = backupSettingsFragment0;
        }
        if((atad0 instanceof BackupSettingsFragment)) {
            PhotosEnablementSnackbarInfo photosEnablementSnackbarInfo0 = ashk.c(intent1);
            if(photosEnablementSnackbarInfo0 == null) {
                photosEnablementSnackbarInfo0 = ashk.c(intent0);
            }
            intent0.removeExtra("photosEnablementSnackbarInfo");
            if(photosEnablementSnackbarInfo0 != null) {
                Bundle bundle2 = atad0.getArguments();
                if(bundle2 == null) {
                    bundle2 = new Bundle();
                }
                bundle2.putParcelable("photosEnablementSnackbarInfo", photosEnablementSnackbarInfo0);
                atad0.setArguments(bundle2);
            }
        }
        return atad0;
    }

    private static void j(Intent intent0) {
        Intent intent1;
        String s = intent0.getStringExtra("android.provider.extra.SETTINGS_EMBEDDED_DEEP_LINK_INTENT_URI");
        if(s != null) {
            try {
                intent1 = Intent.parseUri(s, 1);
            }
            catch(URISyntaxException uRISyntaxException0) {
                ashk.a.n("Could not create intent from deeplink URI", uRISyntaxException0, new Object[0]);
                intent1 = null;
            }
            if(intent1 != null && intent1.getExtras() != null) {
                Bundle bundle0 = intent1.getExtras();
                gftb.check(bundle0);
                intent0.putExtras(bundle0);
            }
        }
    }
}

