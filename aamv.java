import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import dagger.internal.Factory;
import dagger.internal.InstanceFactory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import java.util.List;

public final class aamv implements Factory {
    private final Provider a;
    private final Provider b;

    public aamv(Provider provider0, Provider provider1) {
        this.a = provider0;
        this.b = provider1;
    }

    @Override  // ibnf, ibne
    public final Object get() {
        Object object0;
        Context context0 = zfz.a();
        Intent intent0 = (Intent)((InstanceFactory)this.a).a;
        ibuq.f(intent0, "intent");
        ibuq.f(this.b, "sharedPreferences");
        if(intent0.getBooleanExtra("extra.ignoreAccount", false)) {
            object0 = aaua.a;
            ibuq.e(object0, "NO_USER");
        }
        else {
            List list0 = bbmn.h(context0, "com.google.android.gms");
            if(list0.isEmpty()) {
                object0 = aaua.a;
                ibuq.e(object0, "NO_USER");
            }
            else {
                String s = intent0.getStringExtra("extra.accountName");
                if(s == null) {
                    s = cjpd.c(zgb.b(), "google.account_settings.selected_account", null);
                }
                if(!list0.isEmpty()) {
                    for(Object object1: list0) {
                        if(!ibuq.m(((Account)object1).name, s)) {
                            continue;
                        }
                        object0 = aaua.a(s);
                        ibuq.c(object0);
                        Preconditions.f(object0);
                        return object0;
                    }
                }
                object0 = aaua.a(((Account)list0.get(0)).name);
                ibuq.c(object0);
            }
        }
        Preconditions.f(object0);
        return object0;
    }
}

