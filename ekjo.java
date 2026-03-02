import android.accounts.Account;
import java.util.Map;

public final class ekjo implements ibts {
    public final ekmp a;

    public ekjo(ekmp ekmp0) {
        this.a = ekmp0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ekmp ekmp0 = this.a;
        Map map0 = ekmp0.b;
        Object object1 = (lqd)map0.get(((Account)object0));
        if(object1 == null) {
            ejyv ejyv0 = ejyv.d(ekmp0.a);
            ejyu ejyu0 = new ejyu(ekmp0.a);
            ejyn ejyn0 = new ejyn(ekmp0.a);
            efol efol0 = new efol();
            efol0.a = 80;
            efol0.b = "romanesco";
            efom efom0 = efol0.a();
            efpj efpj0 = new efpj(ekmp0.a, efom0);
            ejyt ejyt0 = ejyt.a(ekmp0.a);
            Object object2 = new ekmo(ekmp0.a, ejyv0, ejyu0, ejyn0, efpj0, ejyt0, false, true);
            map0.put(((Account)object0), object2);
            return object2;
        }
        return object1;
    }
}

