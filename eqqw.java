import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.auth.firstparty.dataservice.AccountSignInRequest;
import com.google.android.gms.auth.firstparty.dataservice.TokenResponse;
import com.google.android.gms.auth.firstparty.dataservice.UpdateCredentialsRequest;
import com.google.android.gms.auth.firstparty.shared.AccountCredentials;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.smartdevice.setup.accounts.UserCredential;
import com.google.android.gms.smartdevice.setup.auth.StartSessionResponse;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;

public final class eqqw {
    public static final int a;
    private static final erqc b;

    static {
        eqqw.b = new erqc(new String[]{"AddAccountUtils"});
    }

    public static TokenResponse a(Context context0, String s, String s1) {
        batl.s(context0);
        batl.s(s);
        batl.q(s1);
        if(eqqw.g(context0).contains(s)) {
            batl.s(context0);
            batl.s(s);
            batl.q(s1);
            ajnv ajnv0 = new ajnv(context0);
            UpdateCredentialsRequest updateCredentialsRequest0 = new UpdateCredentialsRequest();
            AccountCredentials accountCredentials0 = new AccountCredentials("com.google");
            accountCredentials0.c = s;
            accountCredentials0.e = s1;
            updateCredentialsRequest0.b = accountCredentials0;
            return ajnv0.e(updateCredentialsRequest0);
        }
        batl.s(context0);
        batl.s(s);
        batl.q(s1);
        ajnv ajnv1 = new ajnv(context0);
        Context context1 = context0.getApplicationContext();
        String s2 = UUID.randomUUID().toString();
        AccountSignInRequest accountSignInRequest0 = new AccountSignInRequest();
        AccountCredentials accountCredentials1 = new AccountCredentials("com.google");
        accountCredentials1.c = s;
        accountCredentials1.e = s1;
        accountSignInRequest0.f = accountCredentials1;
        accountSignInRequest0.b = new AppDescription("com.google.android.gms", context1.getApplicationInfo().uid, s2, s2);
        return ajnv1.d(accountSignInRequest0);
    }

    public static void b(Context context0, ArrayList arrayList0) {
        eqqw.c(context0, ((UserCredential[])arrayList0.toArray(new UserCredential[arrayList0.size()])));
    }

    public static void c(Context context0, UserCredential[] arr_userCredential) {
        batl.s(arr_userCredential);
        HashSet hashSet0 = eqqw.g(context0);
        for(int v = 0; v < arr_userCredential.length; ++v) {
            UserCredential userCredential0 = arr_userCredential[v];
            eqqw.d(context0, userCredential0.b, userCredential0.f, userCredential0.g, userCredential0.h, hashSet0);
        }
    }

    public static boolean d(Context context0, String s, String s1, String s2, String s3, HashSet hashSet0) {
        batl.s(context0);
        batl.s(s);
        batl.q(s1);
        if(!hashSet0.contains(s)) {
            batl.s(context0);
            batl.s(s);
            batl.s(s1);
            cchj cchj0 = erpb.a(context0);
            Account account0 = new Account(s, "com.google");
            Bundle bundle0 = new Bundle();
            bundle0.putString("firstName", s2);
            bundle0.putString("lastName", s3);
            try(gdqb gdqb0 = gdsp.e("com/google/android/gms/libs/accountmanager/GmsAccountManager", "addAccountExplicitly", 0x92, "AccountManager.addAccountExplicitly")) {
                return cchj0.a.addAccountExplicitly(account0, s1, bundle0);
            }
        }
        Account account1 = new Account(s, "com.google");
        batl.s(context0);
        batl.q(s1);
        erpb.a(context0).k(account1, s1);
        return true;
    }

    public static boolean e(Context context0, String s, String s1, int v) {
        for(int v1 = 0; v1 < v; ++v1) {
            TokenResponse tokenResponse0 = eqqw.a(context0, s1, s);
            if(tokenResponse0 == null) {
                eqqw.b.f("upsert account failed, tokenResponse was null", new Object[0]);
            }
            else {
                ajpt ajpt0 = tokenResponse0.a();
                if(ajpt0 == ajpt.c) {
                    eqqw.b.d("upsert account succeeded", new Object[0]);
                    return true;
                }
                erqc erqc0 = eqqw.b;
                erqc0.f("upsert account failed, tokenResponse status: " + ajpt0, new Object[0]);
                if(!ajpt.d(ajpt0)) {
                    erqc0.f("upsert account failed with unrecoverable error, will not retry", new Object[0]);
                    return false;
                }
            }
        }
        return false;
    }

    public static boolean f(Context context0, List list0, int v) {
        batl.s(context0);
        boolean z = false;
        for(Object object0: list0) {
            String s = ((StartSessionResponse)object0).d;
            String s1 = ((StartSessionResponse)object0).h;
            if(!TextUtils.isEmpty(s) && !TextUtils.isEmpty(s1) && eqqw.e(context0, s, s1, v)) {
                z = true;
            }
        }
        return z;
    }

    public static HashSet g(Context context0) {
        batl.s(context0);
        batl.q("com.google");
        Account[] arr_account = erpb.a(context0).p("com.google");
        HashSet hashSet0 = new HashSet(arr_account.length);
        for(int v = 0; v < arr_account.length; ++v) {
            hashSet0.add(arr_account[v].name);
        }
        return hashSet0;
    }
}

