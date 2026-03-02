import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.auth.AccountChangeEventsRequest;
import com.google.android.gms.auth.AccountChangeEventsResponse;

final class acsl implements acsn {
    final AccountChangeEventsRequest a;

    public acsl(AccountChangeEventsRequest accountChangeEventsRequest0) {
        this.a = accountChangeEventsRequest0;
        super();
    }

    @Override  // acsn
    public final Object a(IBinder iBinder0) {
        wtv wtv0;
        if(iBinder0 == null) {
            wtv0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.auth.IAuthManagerService");
            wtv0 = (iInterface0 instanceof wtv) ? ((wtv)iInterface0) : new wtt(iBinder0);
        }
        AccountChangeEventsResponse accountChangeEventsResponse0 = wtv0.g(this.a);
        acso.o(accountChangeEventsResponse0);
        return accountChangeEventsResponse0.b;
    }
}

