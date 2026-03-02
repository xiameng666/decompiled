import android.accounts.Account;
import com.google.android.gms.pay.UpdateBalanceRequest;

public final class donw implements azys {
    public final Account a;
    public final String b;

    public donw(Account account0, String s) {
        this.a = account0;
        this.b = s;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        dota dota0 = (dota)object0;
        donm donm0 = (donm)dota0.H();
        UpdateBalanceRequest updateBalanceRequest0 = new UpdateBalanceRequest();
        updateBalanceRequest0.a = this.a;
        updateBalanceRequest0.b = this.b;
        donm0.aU(updateBalanceRequest0, new dosm(((evqp)object1)), cclr.a(dota0.r));
    }
}

