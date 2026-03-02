import android.accounts.Account;
import android.accounts.AccountManagerFuture;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.app.DownloadManager.Query;
import android.app.DownloadManager;
import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInstaller.Session;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.SQLException;
import android.os.Binder;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.os.SystemProperties;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.auth.aang.GoogleAccount;
import com.google.android.gms.auth.managed.DownloadStatusResponse;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.io.InputStream;
import java.security.DigestOutputStream;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class akqv {
    static final ggfp a;
    private static akqv b;
    private static akqr c;

    static {
        akqv.a = ggfp.N("ril.serialnumber", "ro.boot.serialno", "ro.serialno", "serialno", "sys.serialnumber");
    }

    public final int a(Context context0, hlxd hlxd0) {
        batl.s(hlxd0);
        if((hlxd0.b & 0x40) != 0) {
            try {
                return context0.getPackageManager().getPackageInfo(hlxd0.c, 0).versionCode < hlxd0.h ? 2 : 3;
            }
            catch(PackageManager.NameNotFoundException unused_ex) {
            }
        }
        return 1;
    }

    public final Intent b(hlxd hlxd0, Account account0, Bundle bundle0, boolean z, int v) {
        batl.s(hlxd0);
        Log.i("Auth", String.format(Locale.US, "[AuthManaged, AuthManagedHelper] packageName: " + hlxd0.c));
        Log.i("Auth", String.format(Locale.US, "[AuthManaged, AuthManagedHelper] zeroTouchDeviceAdminReceiver: " + hlxd0.n));
        Log.i("Auth", String.format(Locale.US, "[AuthManaged, AuthManagedHelper] apkDownloadUrl: " + hlxd0.j));
        Log.i("Auth", String.format(Locale.US, "[AuthManaged, AuthManagedHelper] apkSigningCertSha256Hash: " + hlxd0.g));
        Log.i("Auth", String.format(Locale.US, "[AuthManaged, AuthManagedHelper] apkDownloadCookieName: " + hlxd0.k));
        Log.i("Auth", String.format(Locale.US, "[AuthManaged, AuthManagedHelper] apkDownloadCookieValue: " + hlxd0.l));
        Log.i("Auth", String.format(Locale.US, "[AuthManaged, AuthManagedHelper] unmanagedWorkProfileMode: " + v));
        PersistableBundle persistableBundle0 = new PersistableBundle();
        Intent intent0 = new Intent("android.app.action.PROVISION_MANAGED_DEVICE_FROM_TRUSTED_SOURCE").putExtra("android.app.extra.PROVISIONING_DEVICE_ADMIN_PACKAGE_LABEL", hlxd0.d).putExtra("android.app.extra.PROVISIONING_DEVICE_ADMIN_PACKAGE_DOWNLOAD_LOCATION", hlxd0.j).putExtra("android.app.extra.PROVISIONING_DEVICE_ADMIN_SIGNATURE_CHECKSUM", hlxd0.g).putExtra("android.app.extra.PROVISIONING_DEVICE_ADMIN_PACKAGE_DOWNLOAD_COOKIE_HEADER", hlxd0.k + "=" + hlxd0.l);
        if(account0 != null) {
            intent0.putExtra("android.app.extra.PROVISIONING_ACCOUNT_TO_MIGRATE", account0);
        }
        if(!hlxd0.n.isEmpty()) {
            intent0.putExtra("android.app.extra.PROVISIONING_DEVICE_ADMIN_COMPONENT_NAME", new ComponentName(hlxd0.c, hlxd0.n));
        }
        else if("com.afwsamples.testdpc".equals(hlxd0.c)) {
            intent0.putExtra("android.app.extra.PROVISIONING_DEVICE_ADMIN_COMPONENT_NAME", new ComponentName("com.afwsamples.testdpc", "com.afwsamples.testdpc.DeviceAdminReceiver"));
        }
        else {
            intent0.putExtra("android.app.extra.PROVISIONING_DEVICE_ADMIN_PACKAGE_NAME", hlxd0.c);
        }
        hpwf hpwf0 = hpwf.a;
        if(hpwf0.b().G()) {
            intent0.putExtra("isSetupFlow", z);
        }
        if(hpwf0.b().q()) {
            intent0.putExtra("android.app.extra.PROVISIONING_USE_MOBILE_DATA", true);
        }
        if(account0 != null) {
            persistableBundle0.putString("account_name", account0.name);
            if(hpwf0.b().D()) {
                persistableBundle0.putString("account_type", account0.type);
            }
        }
        if(hpwf0.b().E()) {
            persistableBundle0.putBoolean("is_setup_wizard", z);
        }
        if("com.google.android.apps.work.clouddpc".equals(hlxd0.c)) {
            persistableBundle0.putString("com.google.android.apps.work.clouddpc.EXTRA_ACCOUNT_NAME", account0.name);
            persistableBundle0.putString("com.google.android.apps.work.clouddpc.EXTRA_ACCOUNT_TYPE", account0.type);
            persistableBundle0.putInt("enforced_management_mode", bundle0.getInt("enforced_management_mode", 0));
            persistableBundle0.putInt("restore_mode", bundle0.getInt("restore_mode", 0));
            persistableBundle0.putString("source_device_id", bundle0.getString("source_device_id"));
            if(hpwe.a.b().n() || account0 != null && !akqv.k(account0)) {
                persistableBundle0.putBoolean("android.app.extra.PROVISIONING_SKIP_EDUCATION_SCREENS", true);
                intent0.putExtra("android.app.extra.PROVISIONING_SKIP_EDUCATION_SCREENS", true);
            }
            persistableBundle0.putInt("com.google.android.apps.work.clouddpc.EXTRA_PROVISION_ENTRY_POINT", 11);
            intent0.putExtra("android.app.extra.PROVISIONING_USE_MOBILE_DATA", hpwf0.b().r());
            if(z) {
                persistableBundle0.putStringArray("serial_numbers", ((String[])akqv.r().toArray(new String[0])));
            }
            if(hphd.c()) {
                persistableBundle0.putInt("com.google.android.apps.work.clouddpc.EXTRA_UNMANAGED_WORK_PROFILE_MODE", v);
            }
        }
        intent0.putExtra("android.app.extra.PROVISIONING_ADMIN_EXTRAS_BUNDLE", persistableBundle0);
        return intent0;
    }

    public final DownloadStatusResponse c(Context context0, long v) {
        DownloadManager.Query downloadManager$Query0 = new DownloadManager.Query();
        long[] arr_v = new long[1];
        int v1 = 0;
        arr_v[0] = v;
        DownloadManager.Query downloadManager$Query1 = downloadManager$Query0.setFilterById(arr_v);
        DownloadManager downloadManager0 = (DownloadManager)context0.getSystemService("download");
        DownloadStatusResponse downloadStatusResponse0 = new DownloadStatusResponse(1, 0, 0);
        try(Cursor cursor0 = downloadManager0.query(downloadManager$Query1)) {
            if(cursor0 != null && cursor0.moveToFirst()) {
                switch(cursor0.getInt(cursor0.getColumnIndex("status"))) {
                    case 2: {
                        downloadStatusResponse0.b = 0x5406;
                        long v2 = cursor0.getLong(cursor0.getColumnIndex("total_size"));
                        if(v2 > 0L) {
                            v1 = (int)(cursor0.getLong(cursor0.getColumnIndex("bytes_so_far")) * 100L / v2);
                        }
                        break;
                    }
                    case 4: {
                        downloadStatusResponse0.b = 0x5405;
                        break;
                    }
                    case 8: {
                        downloadStatusResponse0.b = 0x5404;
                        break;
                    }
                    case 16: {
                        downloadStatusResponse0.b = 0x5407;
                        break;
                    }
                    default: {
                        downloadStatusResponse0.b = 0x5408;
                    }
                }
                downloadStatusResponse0.c = v1;
                return downloadStatusResponse0;
            }
        }
        catch(SQLException | IllegalArgumentException unused_ex) {
        }
        downloadStatusResponse0.b = 0x5403;
        return downloadStatusResponse0;
    }

    public final akqs d(Context context0, Account account0, int v) {
        String s3;
        String s2;
        long v1 = bbmq.d(context0);
        if(Long.compare(v1, 0L) == 0) {
            Log.e("Auth", String.format(Locale.US, "[AuthManaged, AuthManagedHelper] Checkin has not happened yet."));
            return new akqs(new Status(21500, "Checkin not happened yet."));
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hkxl.a).v_newBuilder();
        if(!akqv.k(account0)) {
            String s = hpcf.d();
            try {
                akqv.q();
                String s1 = akqr.a(context0, account0, s, new Bundle());
                if(TextUtils.isEmpty(s1)) {
                    Log.e("Auth", String.format(Locale.US, "[AuthManaged, AuthManagedHelper] Empty or null access token."));
                    return new akqs(new Status(0x53FD, "Empty or null access token."));
                }
                s2 = s1;
                goto label_48;
            }
            catch(IOException | acse exception0) {
                Log.e("Auth", String.format(Locale.US, "[AuthManaged, AuthManagedHelper] Exception while fetching access token for account."), exception0);
                return new akqs(new Status(0x53FD, "Failed to fetch access token for account."));
            }
        }
        if(akqv.k(account0)) {
            try {
                admk admk0 = new admk(context0);
                batl.r(account0.name, "AccountName must be provided");
                azzc azzc0 = new azzc();
                azzc0.c = new Feature[]{acrv.a};
                azzc0.a = new admd(admk0, account0);
                azzc0.d = 1506;
                String s4 = (String)evrg.n(admk0.jn(azzc0.a()));
                actt actt0 = new actt();
                actt0.d(s4);
                actt0.c(account0.name);
                actt0.b(account0.type);
                GoogleAccount googleAccount0 = actt0.a();
                s3 = ((acuz)acuz.a.b()).a(googleAccount0);
            }
            catch(ExecutionException | InterruptedException | IOException exception1) {
                Log.e("Auth", "[AuthManaged, AuthManagedHelper] Failed to get LST from GoogleAccountDataStore.", exception1);
                s3 = null;
            }
            if(s3 == null) {
                s3 = cchj.b(context0).d(account0);
            }
        }
        else {
            Log.w("Auth", "[AuthManaged, AuthManagedHelper] Tryingg to get enrollment token for non enroller account. Returning null.");
            s3 = null;
        }
        if(!TextUtils.isEmpty(s3)) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hkxl hkxl0 = (hkxl)hftp0.b_message;
            s3.getClass();
            hkxl0.b |= 1;
            hkxl0.c = s3;
            s2 = null;
            try {
            label_48:
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                hkxl hkxl1 = (hkxl)hftp0.b_message;
                "com.google.android.gms".getClass();
                hkxl1.b |= 2;
                hkxl1.d = "com.google.android.gms";
                String s5 = bbmq.u(context0, "com.google.android.gms").toLowerCase(Locale.US);
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                hkxl hkxl2 = (hkxl)hftp0.b_message;
                s5.getClass();
                hkxl2.b |= 4;
                hkxl2.e = s5;
            }
            catch(PackageManager.NameNotFoundException unused_ex) {
                Log.e("Auth", String.format(Locale.US, "[AuthManaged, AuthManagedHelper] Invalid calling package."));
                return new akqs(new Status(0x53FE, "Invalid calling package."));
            }
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hlxa.a).v_newBuilder();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            hlxa hlxa0 = (hlxa)hftp1.b_message;
            hlxa0.b |= 2;
            hlxa0.d = v1;
            String s6 = Locale.getDefault().toLanguageTag();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            hlxa hlxa1 = (hlxa)hftp1.b_message;
            s6.getClass();
            hlxa1.b |= 1;
            hlxa1.c = s6;
            hlxa hlxa2 = (hlxa)hftp1.N_build();
            ProtoLiteBuilder hftp2 = (ProtoLiteBuilder)((ProtoLiteMessage)hlxa2).jf(5, null);
            hftp2.X(((ProtoLiteMessage)hlxa2));
            try {
                String s7 = avqz.b(context0);
                if(s7 != null || !hpwb.a.b().a()) {
                    if(!hftp2.b_message.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    hlxa hlxa3 = (hlxa)hftp2.b_message;
                    s7.getClass();
                    hlxa3.b |= 8;
                    hlxa3.e = s7;
                }
                else {
                    Log.e("Auth", String.format(Locale.US, "[AuthManaged, AuthManagedHelper] No device data version in the client."));
                }
            }
            catch(IOException | azqi | azqj exception2) {
                Log.e("Auth", String.format(Locale.US, "[AuthManaged, AuthManagedHelper] No device data version info."), exception2);
            }
            ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)hkxt.a).v_newBuilder();
            if(!hftp3.b_message.isImmutable()) {
                hftp3.ensureMutable();
            }
            hkxt hkxt0 = (hkxt)hftp3.b_message;
            hkxl hkxl3 = (hkxl)hftp0.N_build();
            hkxl3.getClass();
            hkxt0.d = hkxl3;
            hkxt0.b |= 2;
            if(!hftp3.b_message.isImmutable()) {
                hftp3.ensureMutable();
            }
            hkxt hkxt1 = (hkxt)hftp3.b_message;
            hlxa hlxa4 = (hlxa)hftp2.N_build();
            hlxa4.getClass();
            hkxt1.c = hlxa4;
            hkxt1.b |= 1;
            if(v != 0) {
                if(!hftp3.b_message.isImmutable()) {
                    hftp3.ensureMutable();
                }
                ((hkxt)hftp3.b_message).e = 2;
                ((hkxt)hftp3.b_message).b |= 4;
            }
            hkxt hkxt2 = (hkxt)hftp3.N_build();
            try {
                bblp bblp0 = new bblp(0x7FFFFFFF, 10);
                clbs clbs0 = clbv.a(context0);
                ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)akle.a).v_newBuilder();
                if(!hftp4.b_message.isImmutable()) {
                    hftp4.ensureMutable();
                }
                akle akle0 = (akle)hftp4.b_message;
                hfuo hfuo0 = akle0.b;
                if(!hfuo0.c()) {
                    akle0.b = ProtoLiteMessage.E(hfuo0);
                }
                akle0.b.add("Bearer " + s2);
                if(hpwf.a.b().t()) {
                    String s8 = bapf.c(context0);
                    if(s8 != null) {
                        if(!hftp4.b_message.isImmutable()) {
                            hftp4.ensureMutable();
                        }
                        akle akle1 = (akle)hftp4.b_message;
                        hfuo hfuo1 = akle1.c;
                        if(!hfuo1.c()) {
                            akle1.c = ProtoLiteMessage.E(hfuo1);
                        }
                        akle1.c.add(s8);
                    }
                    if(!hftp4.b_message.isImmutable()) {
                        hftp4.ensureMutable();
                    }
                    akle akle2 = (akle)hftp4.b_message;
                    "com.google.android.gms".getClass();
                    hfuo hfuo2 = akle2.d;
                    if(!hfuo2.c()) {
                        akle2.d = ProtoLiteMessage.E(hfuo2);
                    }
                    akle2.d.add("com.google.android.gms");
                    if(!hftp4.b_message.isImmutable()) {
                        hftp4.ensureMutable();
                    }
                    akle akle3 = (akle)hftp4.b_message;
                    hfuo hfuo3 = akle3.f;
                    if(!hfuo3.c()) {
                        akle3.f = ProtoLiteMessage.E(hfuo3);
                    }
                    akle3.f.add("253434029");
                    String s9 = String.valueOf(hkxq.g.a());
                    if(!hftp4.b_message.isImmutable()) {
                        hftp4.ensureMutable();
                    }
                    akle akle4 = (akle)hftp4.b_message;
                    s9.getClass();
                    hfuo hfuo4 = akle4.e;
                    if(!hfuo4.c()) {
                        akle4.e = ProtoLiteMessage.E(hfuo4);
                    }
                    akle4.e.add(s9);
                }
                akle akle5 = (akle)hftp4.N_build();
                claw claw0 = new claw(null);
                claw0.b(((MessageLite)akle5), ckac.d, aklf.a);
                clax clax0 = new clax(claw0);
                clcf clcf0 = clcg.f(hpwe.a.b().a(), ckac.b, clbk.a, clbj.a);
                int v2 = Binder.getCallingUid();
                clda clda0 = clbs0.c(clcf0, 1, ((ProtoLiteMessage)hkxu.a), bblp0, v2, 1);
                clda0.B("POST");
                clda0.A(clax0);
                clda0.D(context0, ((MessageLite)hkxt2), new hkxr(), ckac.c);
                hkxu hkxu0 = (hkxu)((cldc)clda0.t().a().get(10000L, TimeUnit.MILLISECONDS)).b;
                Log.i("Auth", String.format(Locale.US, "[AuthManaged, AuthManagedHelper] Got response: " + hkxu0));
                if(hkxu0 == null || (hkxu0.b & 1) == 0) {
                    Log.e("Auth", String.format(Locale.US, "[AuthManaged, AuthManagedHelper] Null response from sever."));
                    return new akqs(new Status(0x5400, "Null response from server."));
                }
                byte[] arr_b = ((hlxd)(hkxu0.c == null ? hlxb.a : hkxu0.c).b.get(0)).toBytesArray();
                return new akqs(Status.b, arr_b, (hkxu0.c == null ? hlxb.a : hkxu0.c).c);
            }
            catch(InterruptedException | ExecutionException | TimeoutException exception3) {
                Log.e("Auth", String.format(Locale.US, "[AuthManaged, AuthManagedHelper] Error from server"), exception3);
                Thread.currentThread().interrupt();
                return new akqs(new Status(0x5401, "Error from server."));
            }
        }
        Log.e("Auth", String.format(Locale.US, "[AuthManaged, AuthManagedHelper] No enrollmentToken found for the account."));
        return new akqs(new Status(0x53FD, "No enrollmentToken found for the account."));
    }

    public static akqt e(Context context0, String s, hlxd hlxd0, Account account0, Bundle bundle0, Boolean boolean0, boolean z, String s1) {
        PackageManager packageManager0 = context0.getPackageManager();
        try {
            ApplicationInfo applicationInfo0 = packageManager0.getApplicationInfo(s, 0);
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
            return new akqt(new Status(0x540E, "Package does not exist."), null);
        }
        if(applicationInfo0 == null) {
            return new akqt(new Status(0x540E, "getApplicationInfo returns null."), null);
        }
        if(!applicationInfo0.enabled) {
            try {
                cjmp.a(context0, s, 1, 1);
            }
            catch(SecurityException unused_ex) {
                return new akqt(new Status(0x540F, "Failed to enable device management app."), null);
            }
        }
        Intent intent0 = packageManager0.getLaunchIntentForPackage(s);
        if(intent0 != null) {
            Bundle bundle1 = new Bundle();
            if(account0 != null) {
                bundle1.putParcelable("account", account0);
            }
            if(boolean0 != null) {
                bundle1.putBoolean("is_setup_wizard", boolean0.booleanValue());
            }
            if(bundle0 != null) {
                bundle1.putAll(bundle0);
            }
            bundle1.putBoolean("is_from_google_settings", z);
            if(!TextUtils.isEmpty(s1)) {
                bundle1.putString("enrollment_link", s1);
            }
            if("com.google.android.apps.work.clouddpc".equals(s) && hpwj.a.b().h()) {
                String s2 = ((TelephonyManager)context0.getSystemService(TelephonyManager.class)).getImei(0);
                if(!TextUtils.isEmpty(s2)) {
                    bundle1.putString("imei", s2);
                }
                bundle1.putStringArrayList("serial_numbers", akqv.r());
            }
            if(hlxd0 != null) {
                for(Object object0: hlxd0.m) {
                    bundle1.putString(((hlxc)object0).b, ((hlxc)object0).c);
                }
            }
            intent0.putExtras(bundle1);
            intent0.setFlags(0);
            return new akqt(Status.b, intent0);
        }
        return new akqt(new Status(0x5410, "Failed to create launch intent."), null);
    }

    public static akqv f() {
        synchronized(akqv.class) {
            if(akqv.b == null) {
                akqv.b = new akqv();
            }
        }
        return akqv.b;
    }

    public final hlxd g(byte[] arr_b) {
        if(arr_b != null) {
            try {
                hftc hftc0 = hftc.a();
                ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)hlxd.a), arr_b, 0, arr_b.length, hftc0);
                ProtoLiteMessage.P_makeImmutable(hftv0);
                return (hlxd)hftv0;
            }
            catch(hfur hfur0) {
                Log.e("Auth", String.format(Locale.US, "[AuthManaged, AuthManagedHelper] Failed to parse PackageInformation data: "), hfur0);
            }
        }
        return null;
    }

    public final void h(Context context0, Account account0, boolean z) {
        batl.s(account0);
        admk admk0 = new admk(context0);
        azzc azzc0 = new azzc();
        azzc0.c = new Feature[]{acrv.b};
        azzc0.a = new adme(account0, z);
        azzc0.d = 1502;
        admk0.jn(azzc0.a()).A(new akqu());
    }

    public final boolean i(Context context0) {
        return ((DevicePolicyManager)context0.getSystemService("device_policy")).getDeviceOwner() != null;
    }

    public final boolean j(String s) {
        return s != null && !ajpt.L.c(s);
    }

    public static boolean k(Account account0) {
        batl.s(account0);
        return !account0.name.contains("@");
    }

    public final boolean l(Context context0, Account account0) {
        AccountManagerFuture accountManagerFuture0 = cchj.b(context0).x(account0, new String[]{"service_uca"}, null);
        try {
            return ((Boolean)accountManagerFuture0.getResult()).booleanValue();
        }
        catch(OperationCanceledException | AuthenticatorException | IOException exception0) {
            Log.w("Auth", String.format(Locale.US, "[AuthManaged, AuthManagedHelper] Exception when checking account features for Unicorn."), exception0);
            return false;
        }
    }

    public final boolean m(int v) {
        return v != 0;
    }

    public final boolean n(int v, hlxd hlxd0) {
        if("com.google.android.apps.work.clouddpc".equals(hlxd0.c)) {
            hpwf hpwf0 = hpwf.a;
            if(hpwf0.b().P() && v == 2) {
                return true;
            }
            return hpwf0.b().L() ? v == 1 : false;
        }
        return false;
    }

    public final boolean o(byte[] arr_b, hlxd hlxd0) {
        return Base64.encodeToString(arr_b, 11).equals(hlxd0.e);
    }

    public final byte[] p(InputStream inputStream0, PackageInstaller.Session packageInstaller$Session0, hlxd hlxd0) {
        MessageDigest messageDigest0 = bbms.g("SHA1");
        DigestOutputStream digestOutputStream0 = new DigestOutputStream(packageInstaller$Session0.openWrite(hlxd0.c, 0L, hlxd0.f), messageDigest0);
        bbpb.h(inputStream0, digestOutputStream0);
        digestOutputStream0.close();
        return messageDigest0.digest();
    }

    public static void q() {
        synchronized(akqv.class) {
            if(akqv.c == null) {
                akqv.c = new akqr();
            }
        }
    }

    private static ArrayList r() {
        ArrayList arrayList0 = new ArrayList();
        String s = bbmq.x();
        if(!TextUtils.isEmpty(s)) {
            arrayList0.add(s);
        }
        ggqj ggqj0 = akqv.a.om();
        while(ggqj0.hasNext()) {
            Object object0 = ggqj0.next();
            String s1 = SystemProperties.get(((String)object0), "");
            if(!TextUtils.isEmpty(s1)) {
                arrayList0.add(s1);
            }
        }
        return arrayList0;
    }
}

