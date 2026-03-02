import android.accounts.Account;
import com.google.android.gms.tapandpay.internal.firstparty.GetAllCardsRequest;

public final class etdf implements azys {
    public final etgl a;
    public final boolean b;
    public final Account c;

    public etdf(etgl etgl0, boolean z, Account account0) {
        this.a = etgl0;
        this.b = z;
        this.c = account0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        etau etau0 = (etau)object0;
        ((eszv)etau0.H()).p(new GetAllCardsRequest(this.b, this.c, 0), new etfa(this.a, ((evqp)object1)), cclr.a(etau0.r));
    }
}

