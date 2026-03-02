import android.accounts.Account;
import android.text.TextUtils;
import java.util.List;
import java.util.concurrent.Callable;

public final class egqz implements Callable {
    public final egra a;

    public egqz(egra egra0) {
        this.a = egra0;
    }

    @Override
    public final Object call() {
        egra egra0 = this.a;
        List list0 = bbmn.h(egra0.i.a, egra0.i.b);
        if(list0.isEmpty()) {
            return null;
        }
        if(!bbqr.d(egra0.h)) {
            Object object0 = new Account(egra0.h, "com.google");
            if(list0.contains(object0)) {
                egra0.h = null;
                return object0;
            }
        }
        String s = egra0.a.b();
        if(TextUtils.isEmpty(s)) {
            return (Account)list0.get(0);
        }
        Object object1 = new Account(s, "com.google");
        return list0.contains(object1) ? object1 : ((Account)list0.get(0));
    }
}

