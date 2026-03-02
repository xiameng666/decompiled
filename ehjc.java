import android.accounts.Account;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;

public final class ehjc {
    private final cchj a;

    public ehjc(cchj cchj0) {
        this.a = cchj0;
    }

    public final boolean a(String s) {
        if(!hxba.A() && ehjc.e(s)) {
            return false;
        }
        try {
            Account[] arr_account = this.f();
            if(arr_account == null || arr_account.length <= 0) {
                return false;
            }
            for(int v = 0; true; ++v) {
                if(v >= arr_account.length) {
                    return false;
                }
                if(s.equals(arr_account[v].name)) {
                    break;
                }
            }
        }
        catch(AuthenticatorException | IOException | OperationCanceledException exception0) {
            egig.c("FSA2_AccountEligibilityChecker", "Exception checking account types", exception0);
            return true;
        }
        return true;
    }

    public final boolean b(String s) {
        try {
            Account[] arr_account = this.d();
            if(arr_account == null) {
                return false;
            }
            for(int v = 0; true; ++v) {
                if(v >= arr_account.length) {
                    return false;
                }
                if(s.equals(arr_account[v].name)) {
                    break;
                }
            }
        }
        catch(AuthenticatorException | IOException | OperationCanceledException exception0) {
            egig.c("FSA2_AccountEligibilityChecker", "Exception checking account types", exception0);
            return true;
        }
        return true;
    }

    public final Account[] c(boolean z, boolean z1) {
        try {
            Account[] arr_account = this.a.p("com.google");
            HashSet hashSet0 = new HashSet();
            if(!z) {
                Account[] arr_account1 = this.f();
                for(int v = 0; v < arr_account1.length; ++v) {
                    hashSet0.add(arr_account1[v].name);
                }
            }
            if(!z1) {
                Account[] arr_account2 = this.d();
                for(int v1 = 0; v1 < arr_account2.length; ++v1) {
                    hashSet0.add(arr_account2[v1].name);
                }
            }
            if(hashSet0.isEmpty()) {
                return arr_account;
            }
            ArrayList arrayList0 = new ArrayList();
            for(int v2 = 0; v2 < arr_account.length; ++v2) {
                Account account0 = arr_account[v2];
                if(!hashSet0.contains(account0.name)) {
                    arrayList0.add(account0);
                }
            }
            return (Account[])arrayList0.toArray(new Account[0]);
        }
        catch(AuthenticatorException | IOException | OperationCanceledException unused_ex) {
            return new Account[0];
        }
    }

    public final Account[] d() {
        return (Account[])this.a.v("com.google", new String[]{"service_uca"}).getResult();
    }

    private static boolean e(String s) {
        return s.endsWith("@google.com");
    }

    private final Account[] f() {
        Account[] arr_account = (Account[])this.a.v("com.google", new String[]{"service_HOSTED"}).getResult();
        if(!hxba.A()) {
            ArrayList arrayList0 = new ArrayList();
            for(int v = 0; v < arr_account.length; ++v) {
                Account account0 = arr_account[v];
                if(!ehjc.e(account0.name)) {
                    arrayList0.add(account0);
                }
            }
            return arrayList0.size() == arr_account.length ? arr_account : ((Account[])arrayList0.toArray(new Account[0]));
        }
        return arr_account;
    }
}

