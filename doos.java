import android.accounts.Account;
import com.google.android.gms.pay.SetValuableSmartTapEnabledRequest;

public final class doos implements azys {
    public final Account a;
    public final String b;
    public final boolean c;
    public final azts d;

    public doos(azts azts0, Account account0, String s, boolean z) {
        this.d = azts0;
        this.a = account0;
        this.b = s;
        this.c = z;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        dota dota0 = (dota)object0;
        donm donm0 = (donm)dota0.H();
        SetValuableSmartTapEnabledRequest setValuableSmartTapEnabledRequest0 = new SetValuableSmartTapEnabledRequest();
        setValuableSmartTapEnabledRequest0.a = this.a;
        setValuableSmartTapEnabledRequest0.b = this.b;
        setValuableSmartTapEnabledRequest0.c = this.c;
        donm0.aL(setValuableSmartTapEnabledRequest0, new dosx(this.d, ((evqp)object1)), cclr.a(dota0.r));
    }
}

