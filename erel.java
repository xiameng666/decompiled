import android.accounts.Account;
import com.google.android.gms.smartdevice.setup.accounts.UserBootstrapInfo;

public final class erel implements evpo {
    public final Account a;

    public erel(Account account0) {
        this.a = account0;
    }

    @Override  // evpo
    public final Object a(evql evql0) {
        return new UserBootstrapInfo(this.a.name, ((byte[])evql0.j()));
    }
}

