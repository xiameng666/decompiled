import android.accounts.Account;
import com.google.android.gms.romanesco.model.RestoreSuggestionEntity;
import java.util.Iterator;
import java.util.List;

public final class eguh implements evqf {
    public final eguv a;
    public final Account b;

    public eguh(eguv eguv0, Account account0) {
        this.a = eguv0;
        this.b = account0;
    }

    @Override  // evqf
    public final void gw(Object object0) {
        if(!hwyp.a.c().J()) {
            Iterator iterator0 = ((List)object0).iterator();
            while(iterator0.hasNext()) {
                Object object1 = iterator0.next();
                if(((RestoreSuggestionEntity)object1).e) {
                    iterator0.remove();
                }
            }
        }
        eguv eguv0 = this.a;
        if(((List)object0).size() == 1) {
            eguv0.y.a.f(this.b.name).e(new egul(eguv0, ((List)object0), this.b)).b(new egum(eguv0, ((List)object0)));
            return;
        }
        List list0 = eguv.x(((List)object0));
        eguv0.l.ii(list0);
    }
}

