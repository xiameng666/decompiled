import android.accounts.Account;
import com.google.android.gms.pay.UndigitizeTicketCentricProductRequest;

public final class dooh implements azys {
    public final Account a;
    public final long b;
    public final long c;

    public dooh(Account account0, long v, long v1) {
        this.a = account0;
        this.b = v;
        this.c = v1;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        dota dota0 = (dota)object0;
        donm donm0 = (donm)dota0.H();
        UndigitizeTicketCentricProductRequest undigitizeTicketCentricProductRequest0 = new UndigitizeTicketCentricProductRequest();
        undigitizeTicketCentricProductRequest0.a = this.a;
        undigitizeTicketCentricProductRequest0.b = this.b;
        undigitizeTicketCentricProductRequest0.c = this.c;
        undigitizeTicketCentricProductRequest0.d = 1;
        donm0.aS(undigitizeTicketCentricProductRequest0, new dosn(((evqp)object1)), cclr.a(dota0.r));
    }
}

