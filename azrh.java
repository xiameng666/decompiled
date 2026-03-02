import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import com.google.android.gms.common.account.AccountPickerChimeraActivity;
import java.util.List;

public final class azrh implements lqj {
    public final AccountPickerChimeraActivity a;

    public azrh(AccountPickerChimeraActivity accountPickerChimeraActivity0) {
        this.a = accountPickerChimeraActivity0;
    }

    @Override  // lqj
    public final void jS(Object object0) {
        if(((bxjg)object0) == null) {
            return;
        }
        int v = -1;
        AccountPickerChimeraActivity accountPickerChimeraActivity0 = this.a;
        int v1 = ((bxjg)object0).a;
        Intent intent0 = ((bxjg)object0).b;
        if(v1 == 10) {
            Toast.makeText(accountPickerChimeraActivity0, 0x7F1507CC, 0).show();  // string:common_account_restricted_no_accounts "There are no accounts to select"
            accountPickerChimeraActivity0.m(2);
            v1 = 0;
        }
        else if(v1 == -1 && intent0 != null && intent0.getExtras() != null) {
            Bundle bundle0 = intent0.getExtras();
            if(bundle0 != null) {
                String s = bundle0.getString("authAccount");
                if(s != null) {
                    List list0 = (List)accountPickerChimeraActivity0.u.d.ij();
                    if(list0 != null) {
                        v = gggq.a(list0, new azrj(s));
                    }
                    accountPickerChimeraActivity0.v = v;
                    accountPickerChimeraActivity0.m(3);
                    if(accountPickerChimeraActivity0.t.c) {
                        bars.e(accountPickerChimeraActivity0, s, accountPickerChimeraActivity0.m);
                    }
                }
            }
        }
        if(intent0 == null) {
            accountPickerChimeraActivity0.setResult(v1);
        }
        else {
            accountPickerChimeraActivity0.setResult(v1, intent0);
        }
        accountPickerChimeraActivity0.w = false;
        accountPickerChimeraActivity0.finish();
    }
}

