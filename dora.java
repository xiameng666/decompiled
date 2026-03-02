import android.accounts.Account;
import com.google.android.gms.pay.DeleteValuablesRequest;

public final class dora implements azys {
    public final Account a;
    public final Iterable b;
    public final azts c;

    public dora(azts azts0, Account account0, Iterable iterable0) {
        this.c = azts0;
        this.a = account0;
        this.b = iterable0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        dota dota0 = (dota)object0;
        donm donm0 = (donm)dota0.H();
        DeleteValuablesRequest deleteValuablesRequest0 = new DeleteValuablesRequest();
        deleteValuablesRequest0.a = this.a;
        deleteValuablesRequest0.b = (String[])gggq.A(this.b, String.class);
        donm0.j(deleteValuablesRequest0, new dort(this.c, ((evqp)object1)), cclr.a(dota0.r));
    }
}

