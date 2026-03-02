import android.accounts.Account;
import com.google.android.gms.pay.DeleteTicketCentricProductRequest;

public final class door implements azys {
    public final Account a;
    public final long b;

    public door(Account account0, long v) {
        this.a = account0;
        this.b = v;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        dota dota0 = (dota)object0;
        donm donm0 = (donm)dota0.H();
        DeleteTicketCentricProductRequest deleteTicketCentricProductRequest0 = new DeleteTicketCentricProductRequest();
        deleteTicketCentricProductRequest0.a = this.a;
        deleteTicketCentricProductRequest0.b = this.b;
        deleteTicketCentricProductRequest0.c = 1;
        donm0.i(deleteTicketCentricProductRequest0, new dosn(((evqp)object1)), cclr.a(dota0.r));
    }
}

