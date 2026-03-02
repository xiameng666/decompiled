import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;

public final class dovw implements dpdi {
    @Override  // dpdi
    public final du a(Intent intent0) {
        ibuq.f(intent0, "intent");
        du du0 = new dmyx();
        Bundle bundle0 = intent0.getExtras();
        if(bundle0 == null) {
            bundle0 = new Bundle();
        }
        else if(!bundle0.containsKey("args")) {
            String s = bundle0.getString("authAccount");
            String s1 = bundle0.getString("device_payment_method_id");
            String s2 = bundle0.getString("cloud_payment_method_id");
            if(s != null && s.length() != 0 && (s1 != null && s1.length() != 0 || s2 != null && s2.length() != 0)) {
                dmqk dmqk0 = new dmqk();
                dmqk0.d(new Account(s, "com.google"));
                dmqk0.i(s1);
                dmqk0.h(s2);
                bundle0 = dmqk0.c().getExtras();
                if(bundle0 == null) {
                    bundle0 = new Bundle();
                }
            }
        }
        du0.setArguments(bundle0);
        return du0;
    }
}

