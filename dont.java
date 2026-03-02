import android.accounts.Account;
import com.google.android.gms.pay.SaveTicketCentricRequest;

public final class dont implements azys {
    public final Account a;
    public final byte[] b;

    public dont(Account account0, byte[] arr_b) {
        this.a = account0;
        this.b = arr_b;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        dota dota0 = (dota)object0;
        donm donm0 = (donm)dota0.H();
        SaveTicketCentricRequest saveTicketCentricRequest0 = new SaveTicketCentricRequest();
        saveTicketCentricRequest0.a = this.a;
        saveTicketCentricRequest0.b = this.b;
        donm0.aC(saveTicketCentricRequest0, new dosm(((evqp)object1)), cclr.a(dota0.r));
    }
}

