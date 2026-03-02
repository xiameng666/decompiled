import android.accounts.Account;
import android.content.Context;
import java.util.ArrayList;

public final class ekgo implements evqk {
    public final Context a;
    public final String b;

    public ekgo(Context context0, String s) {
        this.a = context0;
        this.b = s;
    }

    @Override  // evqk
    public final evql a(Object object0) {
        aqgg aqgg0 = new aqgg(this.a);
        boolean z = hxun.a.b().c();
        String s = this.b;
        if(!z && (((Account)object0) == null || !s.equals(((Account)object0).name))) {
            return evrg.d(new ArrayList());
        }
        Account account0 = new Account(s, "com.google");
        azzc azzc0 = new azzc();
        azzc0.a = new aqgd(aqgg0, account0);
        return aqgg0.jn(azzc0.a());
    }
}

