import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.accounts.AuthenticatorDescription;
import android.accounts.OnAccountsUpdateListener;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;

public final class cchj {
    public final AccountManager a;

    public cchj(AccountManager accountManager0) {
        this.a = accountManager0;
    }

    public final int a(Account account0, String s) {
        try(gdqb gdqb0 = gdsp.e("com/google/android/gms/libs/accountmanager/GmsAccountManager", "getAccountVisibility", 393, "AccountManager.getAccountVisibility")) {
            return this.a.getAccountVisibility(account0, s);
        }
    }

    public static cchj b(Context context0) {
        return new cchj(AccountManager.get(context0));
    }

    public final String c(Account account0, String s, boolean z) {
        try(gdqb gdqb0 = gdsp.e("com/google/android/gms/libs/accountmanager/GmsAccountManager", "blockingGetAuthToken", 0x100, "AccountManager.blockingGetAuthToken")) {
            return this.a.blockingGetAuthToken(account0, s, z);
        }
    }

    public final String d(Account account0) {
        try(gdqb gdqb0 = gdsp.e("com/google/android/gms/libs/accountmanager/GmsAccountManager", "getPassword", 61, "AccountManager.getPassword")) {
            return this.a.getPassword(account0);
        }
    }

    public final String e(Account account0) {
        try(gdqb gdqb0 = gdsp.e("com/google/android/gms/libs/accountmanager/GmsAccountManager", "getPreviousName", 296, "AccountManager.getPreviousName")) {
            return this.a.getPreviousName(account0);
        }
    }

    public final String f(Account account0, String s) {
        try(gdqb gdqb0 = gdsp.e("com/google/android/gms/libs/accountmanager/GmsAccountManager", "getUserData", 67, "AccountManager.getUserData")) {
            return this.a.getUserData(account0, s);
        }
    }

    public final void g(OnAccountsUpdateListener onAccountsUpdateListener0, Handler handler0, boolean z) {
        try(gdqb gdqb0 = gdsp.e("com/google/android/gms/libs/accountmanager/GmsAccountManager", "addOnAccountsUpdatedListener", 0xA6, "AccountManager.addOnAccountsUpdatedListener")) {
            this.a.addOnAccountsUpdatedListener(onAccountsUpdateListener0, handler0, z);
        }
    }

    public final void h(Account account0) {
        try(gdqb gdqb0 = gdsp.e("com/google/android/gms/libs/accountmanager/GmsAccountManager", "clearPassword", 0xEC, "AccountManager.clearPassword")) {
            this.a.clearPassword(account0);
        }
    }

    public final void i(String s, String s1) {
        try(gdqb gdqb0 = gdsp.e("com/google/android/gms/libs/accountmanager/GmsAccountManager", "invalidateAuthToken", 302, "AccountManager.invalidateAuthToken")) {
            this.a.invalidateAuthToken(s, s1);
        }
    }

    public final void j(OnAccountsUpdateListener onAccountsUpdateListener0) {
        try(gdqb gdqb0 = gdsp.e("com/google/android/gms/libs/accountmanager/GmsAccountManager", "removeOnAccountsUpdatedListener", 363, "AccountManager.removeOnAccountsUpdatedListener")) {
            this.a.removeOnAccountsUpdatedListener(onAccountsUpdateListener0);
        }
    }

    public final void k(Account account0, String s) {
        try(gdqb gdqb0 = gdsp.e("com/google/android/gms/libs/accountmanager/GmsAccountManager", "setPassword", 0xDF, "AccountManager.setPassword")) {
            this.a.setPassword(account0, s);
        }
    }

    public final void l(Account account0, String s, String s1) {
        try(gdqb gdqb0 = gdsp.e("com/google/android/gms/libs/accountmanager/GmsAccountManager", "setUserData", 433, "AccountManager.setUserData")) {
            this.a.setUserData(account0, s, s1);
        }
    }

    public final boolean m(Account account0) {
        try(gdqb gdqb0 = gdsp.e("com/google/android/gms/libs/accountmanager/GmsAccountManager", "removeAccountExplicitly", 0xD0, "AccountManager.removeAccountExplicitly")) {
            return this.a.removeAccountExplicitly(account0);
        }
    }

    public final boolean n(Account account0, String s, int v) {
        try(gdqb gdqb0 = gdsp.e("com/google/android/gms/libs/accountmanager/GmsAccountManager", "setAccountVisibility", 420, "AccountManager.setAccountVisibility")) {
            return this.a.setAccountVisibility(account0, s, v);
        }
    }

    public final Account[] o() {
        try(gdqb gdqb0 = gdsp.e("com/google/android/gms/libs/accountmanager/GmsAccountManager", "getAccounts", 0x4F, "AccountManager.getAccounts")) {
            return this.a.getAccounts();
        }
    }

    public final Account[] p(String s) {
        try(gdqb gdqb0 = gdsp.e("com/google/android/gms/libs/accountmanager/GmsAccountManager", "getAccountsByType", 92, "AccountManager.getAccountsByType")) {
            return this.a.getAccountsByType(s);
        }
    }

    public final Account[] q(String s, String s1) {
        try(gdqb gdqb0 = gdsp.e("com/google/android/gms/libs/accountmanager/GmsAccountManager", "getAccountsByTypeForPackage", 85, "AccountManager.getAccountsByTypeForPackage")) {
            return this.a.getAccountsByTypeForPackage(s, s1);
        }
    }

    public final AuthenticatorDescription[] r() {
        try(gdqb gdqb0 = gdsp.e("com/google/android/gms/libs/accountmanager/GmsAccountManager", "getAuthenticatorTypes", 73, "AccountManager.getAuthenticatorType")) {
            return this.a.getAuthenticatorTypes();
        }
    }

    public final void s(String s, Bundle bundle0, Activity activity0, AccountManagerCallback accountManagerCallback0, Handler handler0) {
        try(gdqb gdqb0 = gdsp.e("com/google/android/gms/libs/accountmanager/GmsAccountManager", "addAccount", 130, "AccountManager.addAccount")) {
            this.a.addAccount(s, null, null, bundle0, activity0, accountManagerCallback0, handler0);
        }
    }

    public final void t(OnAccountsUpdateListener onAccountsUpdateListener0, boolean z, String[] arr_s) {
        try(gdqb gdqb0 = gdsp.e("com/google/android/gms/libs/accountmanager/GmsAccountManager", "addOnAccountsUpdatedListener", 0xB2, "AccountManager.addOnAccountsUpdatedListener")) {
            this.a.addOnAccountsUpdatedListener(onAccountsUpdateListener0, null, z, arr_s);
        }
    }

    public final void u(Account account0, Bundle bundle0, Activity activity0, AccountManagerCallback accountManagerCallback0, Handler handler0) {
        try(gdqb gdqb0 = gdsp.e("com/google/android/gms/libs/accountmanager/GmsAccountManager", "confirmCredentials", 376, "AccountManager.confirmCredentials")) {
            this.a.confirmCredentials(account0, bundle0, activity0, accountManagerCallback0, handler0);
        }
    }

    public final AccountManagerFuture v(String s, String[] arr_s) {
        try(gdqb gdqb0 = gdsp.e("com/google/android/gms/libs/accountmanager/GmsAccountManager", "getAccountsByTypeAndFeatures", 0x73, "AccountManager.getAccountsByTypeAndFeatures")) {
            return this.a.getAccountsByTypeAndFeatures(s, arr_s, null, null);
        }
    }

    public final AccountManagerFuture w(Account account0, String s, boolean z) {
        try(gdqb gdqb0 = gdsp.e("com/google/android/gms/libs/accountmanager/GmsAccountManager", "getAuthToken", 0x10D, "AccountManager.getAuthTokenNotifyAuthFailure")) {
            return this.a.getAuthToken(account0, s, null, z, null, null);
        }
    }

    public final AccountManagerFuture x(Account account0, String[] arr_s, AccountManagerCallback accountManagerCallback0) {
        try(gdqb gdqb0 = gdsp.e("com/google/android/gms/libs/accountmanager/GmsAccountManager", "hasFeatures", 104, "AccountManager.hasFeatures")) {
            return this.a.hasFeatures(account0, arr_s, accountManagerCallback0, null);
        }
    }

    public final AccountManagerFuture y(Account account0) {
        try(gdqb gdqb0 = gdsp.e("com/google/android/gms/libs/accountmanager/GmsAccountManager", "removeAccount", 190, "AccountManager.removeAccount")) {
            return this.a.removeAccount(account0, null, null, null);
        }
    }

    public final void z(Account account0, String s, Bundle bundle0, Activity activity0, AccountManagerCallback accountManagerCallback0) {
        try(gdqb gdqb0 = gdsp.e("com/google/android/gms/libs/accountmanager/GmsAccountManager", "updateCredentials", 476, "AccountManager.updateCredentials")) {
            this.a.updateCredentials(account0, s, bundle0, activity0, accountManagerCallback0, null);
        }
    }
}

