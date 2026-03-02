import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.Signature;
import android.net.Uri;
import android.provider.Settings.Secure;
import com.google.android.gms.common.Feature;
import j..io.FileRetargetClass;
import j..nio.file.Files;
import j..nio.file.OpenOption;
import j..util.Collection.-EL;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class aqxa {
    public static final baun a;
    public static final gged_interceptors b;

    static {
        aqxa.a = aqql.a("TestingFlowsUtils");
        aqxa.b = gged_interceptors.m("@meta@", "@ancestral_record@");
    }

    public static Uri a(Context context0, File file0) {
        return jwg.a(context0, "com.google.android.gms.fileprovider", file0);
    }

    public static File b(Context context0, String s) {
        File file0 = aqxa.p(context0.getFilesDir(), "backup_testing_flows");
        file0.mkdirs();
        return aqxa.p(file0, s);
    }

    public static File c(Context context0, String s) {
        switch(s.hashCode()) {
            case -580106669: {
                return s.equals("restore_token_file") ? aqxa.b(context0, "restore_token_file") : aqxa.b(context0, "app_backup");
            }
            case 2017699: {
                return s.equals("@pm@") ? aqxa.b(context0, "pm_backup") : aqxa.b(context0, "app_backup");
            }
            default: {
                return aqxa.b(context0, "app_backup");
            }
        }
    }

    public static List d(Context context0) {
        return Arrays.asList(new File[]{aqxa.b(context0, "restore_token_file"), aqxa.b(context0, "pm_backup"), aqxa.b(context0, "app_backup"), aqxa.b(context0, "auth_backup")});
    }

    public static void e(Context context0, String s) {
        if(!hqlq.c()) {
            aqxa.a.h("Flag not enabled for restore credentials in testing flows.", new Object[0]);
            return;
        }
        try {
            PackageInfo packageInfo0 = context0.getPackageManager().getPackageInfo(s, 0);
            if(packageInfo0.applicationInfo != null && (packageInfo0.applicationInfo.flags & 2) == 0) {
                aqxa.a.h("Can\'t backup restore credentials for package as it is not debuggable: %s", new Object[]{s});
                return;
            }
            byte[] arr_b = bbms.l(context0, s);
            if(arr_b == null) {
                aqxa.a.h("Oldest signature is null for package: %s", new Object[]{s});
                return;
            }
            Signature[] arr_signature = {new Signature(arr_b)};
            aisa aisa0 = airz.a(context0);
            ibuq.f(s, "packageName");
            azzc azzc0 = new azzc();
            azzc0.c = new Feature[]{amjw.l};
            azzc0.a = new aitc(s, arr_signature);
            azzc0.d = 0x6B4;
            byte[] arr_b1 = (byte[])evrg.o(((azts)aisa0).iG(azzc0.a()), 10L, TimeUnit.SECONDS);
            if(arr_b1.length == 0) {
                aqxa.a.h("Restore Credential Key is not present for package: %s", new Object[]{s});
                return;
            }
            Files.write(FileRetargetClass.toPath(aqxa.b(context0, "auth_backup")), arr_b1, new OpenOption[0]);
            aqxa.a.h("Restore Credential Key written to backup file.", new Object[0]);
        }
        catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
            aqxa.a.g("Failed to get package info for package: " + s, packageManager$NameNotFoundException0, new Object[0]);
        }
        catch(IOException iOException0) {
            aqxa.a.g("Failed to write restore credential key to file.", iOException0, new Object[0]);
        }
        catch(ExecutionException | InterruptedException | TimeoutException exception0) {
            aqxa.a.g("Failed to get restore credential key from Blockstore.", exception0, new Object[0]);
        }
    }

    public static void f(Context context0, String s) {
        File file0 = aqxa.c(context0, s);
        aqxa.h(file0);
        aqxa.g(file0);
    }

    public static void g(File file0) {
        try {
            if(file0.createNewFile()) {
                aqxa.a.h("Created empty file: " + file0, new Object[0]);
                return;
            }
            aqxa.a.f("Failed to create new file: " + file0, new Object[0]);
        }
        catch(IOException iOException0) {
            aqxa.a.g("Failed to create new file: " + file0, iOException0, new Object[0]);
        }
    }

    public static void h(File file0) {
        if(file0.exists()) {
            baun baun0 = aqxa.a;
            baun0.h("Deleting file: " + file0, new Object[0]);
            if(!file0.delete()) {
                baun0.f("Failed to delete file: " + file0, new Object[0]);
            }
        }
    }

    public static void i(Context context0) {
        if(aqxa.n(context0)) {
            baun baun0 = aqxa.a;
            baun0.h("Testing flows are enabled. Checking if reset task is scheduled. If not, then disabling testing flows.", new Object[0]);
            if(!aqxa.o(context0)) {
                baun0.h("Reset task is not scheduled. Disabling testing flows.", new Object[0]);
                Settings.Secure.putInt(context0.getContentResolver(), "backup_enable_testing_flows", 0);
                aqxa.k(context0);
                return;
            }
            baun0.h("Reset task is scheduled. Keeping testing flows enabled.", new Object[0]);
        }
    }

    public static void j(Context context0) {
        try {
            List list0 = aqxa.d(context0);
            String s = Settings.Secure.getString(context0.getContentResolver(), "backup_testing_flows_package");
            if(s == null) {
                s = "com.android.shell";
            }
            Uri[] arr_uri = (Uri[])Collection.-EL.stream(list0).map(new aqwy(context0)).toArray(new aqwz());
            for(int v = 0; v < arr_uri.length; ++v) {
                Uri uri0 = arr_uri[v];
                aqxa.a.h(a.X(uri0, s, "Granting permissions for URI: ", " to "), new Object[0]);
                context0.grantUriPermission(s, uri0, 3);
            }
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            aqxa.a.g("Invalid package, URI or one of the modes are not from the supported values.", illegalArgumentException0, new Object[0]);
        }
        catch(UnsupportedOperationException unsupportedOperationException0) {
            aqxa.a.g("Platform does not URI permissions.", unsupportedOperationException0, new Object[0]);
        }
        catch(SecurityException securityException0) {
            aqxa.a.g("The caller does not have permission to revoke URI permissions for testing flows files.", securityException0, new Object[0]);
        }
    }

    public static void k(Context context0) {
        baun baun0 = aqxa.a;
        baun0.h("Resetting the testing flows state.", new Object[0]);
        for(Object object0: aqxa.d(context0)) {
            aqxa.h(((File)object0));
        }
        aqxa.q(context0);
        baun0.h("Cancelling reset task.", new Object[0]);
        cljp.a(context0).d("disable_testing_flows", "com.google.android.gms.backup.common.testingflows.TestingFlowsSettingsResetterChimeraService");
        aqxa.m(context0, false);
    }

    public static void l(Context context0, String s) {
        if(!hqlq.c()) {
            aqxa.a.h("Flag not enabled for restore credentials in testing flows.", new Object[0]);
            return;
        }
        aisa aisa0 = airz.a(context0);
        File file0 = aqxa.b(context0, "auth_backup");
        if(!file0.exists()) {
            aqxa.a.h("Auth backup file does not exist.", new Object[0]);
            return;
        }
        if(file0.length() == 0L) {
            aqxa.a.h("Restore Credential Key not present in Auth backup file.", new Object[0]);
            return;
        }
        baun baun0 = aqxa.a;
        baun0.h("Restore Credential Key present for package: %s", new Object[]{s});
        try {
            PackageInfo packageInfo0 = context0.getPackageManager().getPackageInfo(s, 0);
            if(packageInfo0.applicationInfo != null && (packageInfo0.applicationInfo.flags & 2) == 0) {
                baun0.h("Can\'t backup RestoreCreds for non-debuggable package: %s", new Object[]{s});
                return;
            }
            byte[] arr_b = bbms.l(context0, s);
            if(arr_b == null) {
                baun0.h("Oldest signature is null for package: %s", new Object[]{s});
                return;
            }
            Signature[] arr_signature = {new Signature(arr_b)};
            boolean z = aqjl.a.a(context0) != 0;
            byte[] arr_b1 = Files.readAllBytes(FileRetargetClass.toPath(file0));
            ibuq.f(s, "packageName");
            ibuq.f(arr_b1, "restoreKey");
            azzc azzc0 = new azzc();
            azzc0.c = new Feature[]{amjw.m};
            azzc0.a = new aita(s, arr_signature, arr_b1, z);
            azzc0.d = 0x6B5;
            baun0.h("Written %d out of %d bytes to Blockstore.", new Object[]{((Integer)evrg.o(((azts)aisa0).iG(azzc0.a()), 10L, TimeUnit.SECONDS)), file0.length()});
        }
        catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
            aqxa.a.g("Failed to get package info for package: " + s, packageManager$NameNotFoundException0, new Object[0]);
        }
        catch(IOException iOException0) {
            aqxa.a.g("Failed to read restore credential key from file.", iOException0, new Object[0]);
        }
        catch(ExecutionException | InterruptedException | TimeoutException exception0) {
            aqxa.a.g("Failed to set restore credential key in Blockstore.", exception0, new Object[0]);
        }
    }

    public static void m(Context context0, boolean z) {
        try {
            aqxa.a.h("Updating reset task scheduled state in ProtoDataStore: " + z, new Object[0]);
            ((glyq)aqxa.r(context0).b(new aqwu(z), new bblp(1, 10))).v(10L, TimeUnit.SECONDS);
        }
        catch(ExecutionException | InterruptedException | TimeoutException exception0) {
            aqxa.a.g("Failed to set \'reset task scheduled state\' to ProtoDataStore.", exception0, new Object[0]);
        }
    }

    public static boolean n(Context context0) {
        hqlq.e();
        return hqlq.d() && aqjl.a.i(context0);
    }

    public static boolean o(Context context0) {
        try {
            return ((Boolean)((glyq)glzd.f(aqxa.r(context0).a(), new aqwt(), new bblp(1, 10))).v(10L, TimeUnit.SECONDS)).booleanValue();
        }
        catch(ExecutionException | InterruptedException | TimeoutException exception0) {
            aqxa.a.g("Failed to get \'reset task scheduled state\' to ProtoDataStore.", exception0, new Object[0]);
            return false;
        }
    }

    private static File p(File file0, String s) {
        return hrnt.i() ? new File(ccsb.a.b(file0, s)) : new File(file0, s);
    }

    private static void q(Context context0) {
        try {
            Uri[] arr_uri = (Uri[])Collection.-EL.stream(aqxa.d(context0)).map(new aqwr(context0)).toArray(new aqws());
            for(int v = 0; v < arr_uri.length; ++v) {
                Uri uri0 = arr_uri[v];
                aqxa.a.h("Revoking permissions for URI: " + uri0, new Object[0]);
                context0.revokeUriPermission(uri0, 3);
            }
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            aqxa.a.g("Invalid URI or one of the modes are not from the supported values.", illegalArgumentException0, new Object[0]);
        }
        catch(UnsupportedOperationException unsupportedOperationException0) {
            aqxa.a.g("Platform does not URI permissions.", unsupportedOperationException0, new Object[0]);
        }
        catch(SecurityException securityException0) {
            aqxa.a.g("The caller does not have permission to revoke URI permissions for testing flows files.", securityException0, new Object[0]);
        }
    }

    private static frli r(Context context0) {
        frce frce0 = new frce(context0);
        frce0.d("backup");
        frce0.e("TestingFlowsResetTaskScheduledState.pb");
        Uri uri0 = frce0.a();
        frie frie0 = frif.a();
        frie0.f(uri0);
        frie0.e(((MessageLite)atdh.a));
        frie0.h(new frjp(cjtd.a));
        frif frif0 = frie0.a();
        return cjtb.a.a(frif0);
    }
}

