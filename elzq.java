import android.accounts.Account;
import com.google.android.gms.chimera.modules.semanticlocation.AppContextProvider;
import java.util.Map;

public final class elzq implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        Account[] arr_account = elyz.d(AppContextProvider.a());
        int v = 0;
        while(v < arr_account.length) {
            Account account0 = arr_account[v];
            if(!embq.M(((emlm)((Map)object0).get(account0.name))) && !elze.c(account0)) {
                ++v;
                continue;
            }
            return Boolean.valueOf(true);
        }
        return Boolean.valueOf(false);
    }
}

