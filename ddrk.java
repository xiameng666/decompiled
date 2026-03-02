import android.accounts.Account;
import com.google.android.gms.nearby.sharing.internal.SetAccountParams;

public final class ddrk implements azys {
    public final Account a;

    public ddrk(Account account0) {
        this.a = account0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        ddot ddot0 = (ddot)((ddub)object0).H();
        SetAccountParams setAccountParams0 = new SetAccountParams();
        setAccountParams0.a = this.a;
        setAccountParams0.b = new ddrt(((evqp)object1));
        ddot0.R(setAccountParams0);
    }
}

