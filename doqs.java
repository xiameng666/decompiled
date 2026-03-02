import android.accounts.Account;
import com.google.android.gms.pay.DataChangeListenerRequest;
import com.google.android.gms.pay.DataChangeListenerType;

public final class doqs implements azys {
    public final Account a;
    public final String b;
    public final int c;
    public final azyf d;
    public final azts e;

    public doqs(azts azts0, Account account0, String s, int v, azyf azyf0) {
        this.e = azts0;
        this.a = account0;
        this.b = s;
        this.c = v;
        this.d = azyf0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        dota dota0 = (dota)object0;
        evqp evqp0 = (evqp)object1;
        donm donm0 = (donm)dota0.H();
        DataChangeListenerRequest dataChangeListenerRequest0 = new DataChangeListenerRequest();
        dataChangeListenerRequest0.a = this.a;
        dataChangeListenerRequest0.c = this.b;
        DataChangeListenerType dataChangeListenerType0 = new DataChangeListenerType();
        dataChangeListenerType0.a = this.c;
        dataChangeListenerRequest0.b = dataChangeListenerType0;
        donm0.at(dataChangeListenerRequest0, new dors(this.e, this.d), cclr.a(dota0.r));
    }
}

