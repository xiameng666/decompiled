import android.accounts.Account;
import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class buut implements ibth {
    public final Context a;

    public buut(Context context0) {
        this.a = context0;
    }

    @Override  // ibth
    public final Object a() {
        List list0 = bbmn.h(this.a, "com.google.android.gms");
        Object object0 = new ArrayList(ibpo.q(list0, 10));
        for(Object object1: list0) {
            ((Collection)object0).add(((Account)object1).name);
        }
        return object0;
    }
}

