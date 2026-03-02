import android.content.Intent;
import com.google.android.gms.common.account.AccountPickerChimeraActivity;
import com.google.android.gms.common.account.AccountTypePickerChimeraActivity;

public final class azri implements lqj {
    public final AccountPickerChimeraActivity a;

    public azri(AccountPickerChimeraActivity accountPickerChimeraActivity0) {
        this.a = accountPickerChimeraActivity0;
    }

    @Override  // lqj
    public final void jS(Object object0) {
        Intent intent0;
        if(((bxjg)object0) != null) {
            AccountPickerChimeraActivity accountPickerChimeraActivity0 = this.a;
            int v = ((bxjg)object0).a;
            if(v == 1) {
                intent0 = AccountTypePickerChimeraActivity.a(accountPickerChimeraActivity0, accountPickerChimeraActivity0.t);
            }
            else {
                switch(v) {
                    case 2: {
                        accountPickerChimeraActivity0.m(4);
                        intent0 = ((bxjg)object0).b;
                        break;
                    }
                    case 3: {
                        goto label_14;
                    }
                    default: {
                        intent0 = null;
                    }
                }
            }
            if(intent0 != null) {
                accountPickerChimeraActivity0.startActivityForResult(intent0, v);
                return;
            label_14:
                accountPickerChimeraActivity0.m(1);
                accountPickerChimeraActivity0.startActivityForResult(new Intent("android.settings.SYNC_SETTINGS").setPackage("com.android.settings"), 3);
                accountPickerChimeraActivity0.onBackPressed();
            }
        }
    }
}

