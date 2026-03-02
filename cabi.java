import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Intent;
import android.view.View.OnClickListener;
import android.view.View;
import j..util.Objects;
import java.util.ArrayList;

final class cabi implements View.OnClickListener {
    final cabp a;

    public cabi(cabp cabp0) {
        Objects.requireNonNull(cabp0);
        this.a = cabp0;
        super();
    }

    @Override  // android.view.View$OnClickListener
    public void onClick(View view0) {
        Intent intent0;
        Account account0;
        cabp cabp0 = this.a;
        cabp0.ah.l("OptInFragment.accountPickerClicked");
        ArrayList arrayList0 = cabp0.c;
        int v = arrayList0.size();
        int v1 = 0;
        while(v1 < v) {
            account0 = (Account)arrayList0.get(v1);
            ++v1;
            if(!account0.name.equals(cabp0.a)) {
                continue;
            }
            goto label_11;
        }
        account0 = null;
    label_11:
        ArrayList arrayList1 = cabp0.c;
        try(gdqb gdqb0 = gdsp.e("com/google/android/gms/libs/accountmanager/GmsAccountManager", "newChooseAccountIntent", 0x150, "AccountManager.newChooseAccountIntentPreM")) {
            intent0 = AccountManager.newChooseAccountIntent(account0, arrayList1, new String[]{"com.google"}, false, null, null, null, null);
        }
        this.a.startActivityForResult(intent0, 0);
    }
}

