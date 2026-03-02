import android.accounts.Account;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public final class ermh implements Callable {
    public final Map a;
    public final String b;

    public ermh(Map map0, String s) {
        this.a = map0;
        this.b = s;
    }

    @Override
    public final Object call() {
        Object object0 = new HashSet();
        String s = this.b;
        for(Object object1: this.a.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object1;
            Account account0 = (Account)map$Entry0.getKey();
            try {
                if(!((Boolean)gmbu.r(((Future)map$Entry0.getValue()))).booleanValue()) {
                    continue;
                }
                ((Set)object0).add(account0);
                ermn.a.d("%s has feature %s", new Object[]{account0.name, s});
            }
            catch(ExecutionException executionException0) {
                ermn.a.g("Failed to find %s status for %s", executionException0, new Object[]{s, account0.name});
            }
        }
        return object0;
    }
}

