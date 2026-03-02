import android.accounts.Account;

public abstract class fvrv {
    public abstract Account[] b();

    public final Account c(String s) {
        Account[] arr_account = this.b();
        if(arr_account != null) {
            for(int v = 0; v < arr_account.length; ++v) {
                Account account0 = arr_account[v];
                if(account0.name.equals(s)) {
                    return account0;
                }
            }
        }
        return null;
    }

    public final boolean d(Account account0) {
        Account[] arr_account = this.b();
        if(arr_account != null) {
            for(int v = 0; v < arr_account.length; ++v) {
                if(account0.equals(arr_account[v])) {
                    return true;
                }
            }
        }
        return false;
    }
}

