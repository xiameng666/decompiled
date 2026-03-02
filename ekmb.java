import android.accounts.Account;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;

public final class ekmb implements Callable {
    public final ekmc a;

    public ekmb(ekmc ekmc0) {
        this.a = ekmc0;
    }

    @Override
    public final Object call() {
        ekmc ekmc0 = this.a;
        Account[] arr_account = ejyr.b(ekmc0.a);
        if(arr_account != null) {
            if(arr_account.length == 0) {
                return null;
            }
            List list0 = Arrays.asList(arr_account);
            if(!bbqr.d(ekmc0.i)) {
                Object object0 = new Account(ekmc0.i, "com.google");
                if(list0.contains(object0)) {
                    ekmc0.i = "";
                    return object0;
                }
            }
            ejyv ejyv0 = ekmc0.h;
            String s = ejyv0.i();
            if(TextUtils.isEmpty(s)) {
                ejyv0.t(s);
                return (Account)list0.get(0);
            }
            Object object1 = new Account(s, "com.google");
            return list0.contains(object1) ? object1 : ((Account)list0.get(0));
        }
        return null;
    }
}

