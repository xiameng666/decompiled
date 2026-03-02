import android.accounts.Account;
import java.util.LinkedHashMap;

public final class bxii implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        Object object1 = new LinkedHashMap();
        int v = ((gged_interceptors)object0).size();
        for(int v1 = 0; v1 < v; ++v1) {
            Account account0 = (Account)((gged_interceptors)object0).get(v1);
            ((LinkedHashMap)object1).put(account0, new bxiy(null, account0.name, 0, account0.type));
        }
        return object1;
    }
}

