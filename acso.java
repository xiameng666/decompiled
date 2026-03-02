import android.accounts.Account;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.auth.AccountChangeEventsRequest;
import com.google.android.gms.auth.HasCapabilitiesRequest;
import com.google.android.gms.auth.TokenData;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeoutException;

public class acso {
    private static final baun a;
    public static final String[] c;
    public static final String d;
    public static final String e;
    public static final ComponentName f;

    static {
        acso.c = new String[]{"com.google", "com.google.work", "cn.google"};
        acso.d = "callerUid";
        acso.e = "androidPackageName";
        acso.f = new ComponentName("com.google.android.gms", "com.google.android.gms.auth.GetToken");
        acso.a = new baun("Auth", new String[]{"GoogleAuthUtil"});
    }

    private static void a(Context context0, Bundle bundle0) {
        String s = context0.getApplicationInfo().packageName;
        bundle0.putString("clientPackageName", s);
        String s1 = acso.e;
        if(TextUtils.isEmpty(bundle0.getString(s1))) {
            bundle0.putString(s1, s);
        }
        bundle0.putLong("service_connection_start_time_millis", SystemClock.elapsedRealtime());
    }

    private static void b(Account account0) {
        if(account0 == null) {
            throw new IllegalArgumentException("Account cannot be null");
        }
        if(TextUtils.isEmpty(account0.name)) {
            throw new IllegalArgumentException("Account name cannot be empty!");
        }
        String[] arr_s = acso.c;
        for(int v = 0; v < 3; ++v) {
            if(arr_s[v].equals(account0.type)) {
                return;
            }
        }
        throw new IllegalArgumentException("Account type not supported");
    }

    public static int c(Context context0, HasCapabilitiesRequest hasCapabilitiesRequest0) {
        batl.s(context0);
        batl.s(hasCapabilitiesRequest0.a);
        batl.q(hasCapabilitiesRequest0.a.name);
        batl.k("This call can involve network request. It is unsafe to call from main thread.");
        fpim.e(context0);
        return (int)(((Integer)acso.l(context0, acso.f, new acsh(hasCapabilitiesRequest0, context0, System.currentTimeMillis(), SystemClock.elapsedRealtime()))));
    }

    public static Bundle d(Context context0, Account account0) {
        batl.s(context0);
        acso.b(account0);
        acso.p(context0);
        acsj acsj0 = new acsj(account0);
        return (Bundle)acso.l(context0, acso.f, acsj0);
    }

    public static String e(Context context0, String s) {
        batl.r(s, "accountName must be provided");
        batl.k("Calling this from your main thread can lead to deadlock");
        acso.p(context0);
        return acso.h(context0, s, "^^_account_id_^^", new Bundle());
    }

    public static String f(Context context0, Account account0, String s) {
        return acso.g(context0, account0, s, new Bundle());
    }

    public static String g(Context context0, Account account0, String s, Bundle bundle0) {
        acso.b(account0);
        return acso.n(context0, account0, s, bundle0).b;
    }

    @Deprecated
    public static String h(Context context0, String s, String s1, Bundle bundle0) {
        return acso.g(context0, new Account(s, "com.google"), s1, bundle0);
    }

    public static List i(Context context0, int v, String s) {
        batl.r(s, "accountName must be provided");
        batl.k("Calling this from your main thread can lead to deadlock");
        acso.p(context0);
        AccountChangeEventsRequest accountChangeEventsRequest0 = new AccountChangeEventsRequest();
        accountChangeEventsRequest0.c = s;
        accountChangeEventsRequest0.b = v;
        acsl acsl0 = new acsl(accountChangeEventsRequest0);
        return (List)acso.l(context0, acso.f, acsl0);
    }

    public static void j(Context context0, String s) {
        long v = System.currentTimeMillis();
        long v1 = SystemClock.elapsedRealtime();
        acry acry0 = acry.a(context0);
        try {
            batl.k("Calling this from your main thread can lead to deadlock");
            acso.p(context0);
            Bundle bundle0 = new Bundle();
            acso.a(context0, bundle0);
            acsk acsk0 = new acsk(s, bundle0);
            acso.l(context0, acso.f, acsk0);
        }
        catch(Exception exception0) {
            acry0.b(1707, 13, v, System.currentTimeMillis(), v1);
            throw exception0;
        }
        acry0.b(1707, 0, v, System.currentTimeMillis(), v1);
    }

    public static void k(Context context0, String s, String s1, Intent intent0, PendingIntent pendingIntent0) {
        ajpt ajpt0 = ajpt.a(s1);
        baun baun0 = acso.a;
        baun0.m(String.format("[GoogleAuthUtil] error status:%s with method:%s", ajpt0, s), new Object[0]);
        if(ajpt.e(ajpt0)) {
            if(pendingIntent0 != null && intent0 != null) {
                throw UserRecoverableAuthException.b(s1, intent0);
            }
            int v = azqk.a(context0);
            if(v >= 233800000 && pendingIntent0 == null) {
                baun0.f(String.format("Recovery PendingIntent is missing on current Gms version: %s for method: %s. It should always be present on or above Gms version %s. This indicates a bug in Gms implementation.", v, s, ((int)233800000)), new Object[0]);
            }
            if(intent0 == null) {
                baun0.f(String.format("no recovery Intent found with status=%s for method=%s. This shouldn\'t happen", s1, s), new Object[0]);
            }
            throw new UserRecoverableAuthException(s1, intent0);
        }
        if(ajpt.d(ajpt0)) {
            throw new IOException(s1);
        }
        throw new acse(s1);
    }

    public static Object l(Context context0, ComponentName componentName0, acsn acsn0) {
        Object object0;
        azox azox0 = new azox();
        baro baro0 = baro.b(context0);
        try {
            if(baro0.d(new barn(componentName0), azox0, "GoogleAuthUtil", null).d()) {
                return acsn0.a(azox0.a());
            }
            throw new IOException("Could not bind to service.");
        }
        catch(SecurityException securityException0) {
            Log.w("GoogleAuthUtil", String.format("SecurityException while bind to auth service: %s", securityException0.getMessage()));
            throw new IOException("SecurityException while binding to Auth service.", securityException0);
        }
        try {
            object0 = acsn0.a(azox0.a());
        }
        catch(TimeoutException | RemoteException | InterruptedException exception0) {
            Log.i("GoogleAuthUtil", "Error on service connection.", exception0);
            throw new IOException("Error on service connection.", exception0);
        }
        finally {
            baro0.f(componentName0, azox0);
        }
        return object0;
    }

    public static Account[] m(Context context0) {
        Account[] arr_account;
        long v = System.currentTimeMillis();
        long v1 = SystemClock.elapsedRealtime();
        acry acry0 = acry.a(context0);
        try {
            batl.q("com.google");
            try {
                azqk.k(context0);
            }
            catch(GooglePlayServicesIncorrectManifestValueException unused_ex) {
                throw new azqi(18);
            }
            batl.s(context0);
            ContentProviderClient contentProviderClient0 = context0.getContentResolver().acquireContentProviderClient("com.google.android.gms.auth.accounts");
            if(contentProviderClient0 == null) {
                throw new RemoteException("The com.google.android.gms.auth.accounts provider is not available.");
            }
            try {
                Bundle bundle0 = new Bundle();
                bundle0.putString("callingActivity", ((context0 instanceof Activity) ? ((Activity)context0).getComponentName().getClassName() : ""));
                Bundle bundle1 = contentProviderClient0.call("get_accounts", "com.google", bundle0);
                if(bundle1 == null) {
                    throw new RemoteException("Null result from AccountChimeraContentProvider");
                }
                Parcelable[] arr_parcelable = bundle1.getParcelableArray("accounts");
                if(arr_parcelable == null) {
                    throw new RemoteException("Key_Accounts is Null");
                }
                arr_account = new Account[arr_parcelable.length];
                for(int v3 = 0; v3 < arr_parcelable.length; ++v3) {
                    arr_account[v3] = (Account)arr_parcelable[v3];
                }
            }
            catch(RemoteException remoteException0) {
                acso.a.g("RemoteException when fetching accounts", remoteException0, new Object[0]);
                throw remoteException0;
            }
            catch(Exception exception1) {
                acso.a.g("Exception when getting accounts", exception1, new Object[0]);
                throw new RemoteException(a.ao(exception1, "Accounts ContentProvider failed: "));
            }
            finally {
                contentProviderClient0.release();
            }
            acry0.b(1708, 0, v, System.currentTimeMillis(), v1);
            return arr_account;
        }
        catch(Exception exception0) {
            acry0.b(1708, 13, v, System.currentTimeMillis(), v1);
            throw exception0;
        }
    }

    public static TokenData n(Context context0, Account account0, String s, Bundle bundle0) {
        acsi acsi0;
        Bundle bundle1;
        long v2;
        Exception exception2;
        long v = System.currentTimeMillis();
        long v1 = SystemClock.elapsedRealtime();
        acry acry0 = acry.a(context0);
        try {
            batl.k("Calling this from your main thread can lead to deadlock");
            batl.r(s, "Scope cannot be empty or null.");
            acso.b(account0);
            acso.p(context0);
            if(bundle0 == null) {
                try {
                    bundle1 = new Bundle();
                }
                catch(Exception exception1) {
                    exception2 = exception1;
                    v2 = v;
                    goto label_31;
                }
            }
            else {
                bundle1 = new Bundle(bundle0);
            }
            acso.a(context0, bundle1);
            v2 = v;
        }
        catch(Exception exception0) {
            v2 = v;
            exception2 = exception0;
            acry0.b(1709, 13, v2, System.currentTimeMillis(), v1);
            throw exception2;
        }
        try {
            acsi0 = new acsi(account0, s, bundle1, context0, acry0, v2, v1);
            acry0 = acry0;
        }
        catch(Exception exception0) {
            acry0 = acry0;
            exception2 = exception0;
            acry0.b(1709, 13, v2, System.currentTimeMillis(), v1);
            throw exception2;
        }
        try {
            return (TokenData)acso.l(context0, acso.f, acsi0);
        }
        catch(Exception exception0) {
        }
        exception2 = exception0;
    label_31:
        acry0.b(1709, 13, v2, System.currentTimeMillis(), v1);
        throw exception2;
    }

    public static void o(Object object0) {
        if(object0 != null) {
            return;
        }
        acso.a.m("Service call returned null.", new Object[0]);
        throw new IOException("Service unavailable.");
    }

    public static void p(Context context0) {
        try {
            azqk.k(context0.getApplicationContext());
        }
        catch(azqj azqj0) {
            Intent intent0 = new Intent(azqj0.b);
            throw new acsr(azqj0.a, azqj0.getMessage(), intent0);
        }
        catch(azqi | GooglePlayServicesIncorrectManifestValueException exception0) {
            throw new acse(exception0.getMessage(), exception0);
        }
    }
}

