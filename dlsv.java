import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

public final class dlsv implements icih {
    final dlte a;

    public dlsv(dlte dlte0) {
        this.a = dlte0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        if(ibuq.m(((frxf)object0), dltf.a)) {
            dlte dlte0 = this.a;
            Bundle bundle0 = dlte0.getArguments();
            boolean z = bundle0 == null ? false : bundle0.getBoolean("INTENT_EXTRA_FROM_3P_INTENT", false);
            Bundle bundle1 = dlte0.getArguments();
            Account account0 = null;
            String s = bundle1 == null ? null : bundle1.getString("INTENT_EXTRA_FROM_3P_VENDOR_ID", null);
            Context context0 = dlte0.requireContext();
            Account account1 = dlte0.a;
            if(account1 == null) {
                ibuq.j("account");
            }
            else {
                account0 = account1;
            }
            dlte0.as(new Intent("com.google.android.gms.pay.bankaccount.add.ADD_BANK_ACCOUNT").setClassName(context0, "com.google.android.gms.pay.main.PayActivity").putExtra("ACCOUNT", account0).putExtra("INTENT_EXTRA_FROM_3P_INTENT", z).putExtra("INTENT_EXTRA_FROM_3P_VENDOR_ID", s));
        }
        return ibom.a;
    }
}

