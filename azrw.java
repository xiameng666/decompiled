import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import com.google.android.gms.common.account.SimpleDialogAccountPickerChimeraActivity;

public final class azrw implements lqj {
    public final SimpleDialogAccountPickerChimeraActivity a;

    public azrw(SimpleDialogAccountPickerChimeraActivity simpleDialogAccountPickerChimeraActivity0) {
        this.a = simpleDialogAccountPickerChimeraActivity0;
    }

    @Override  // lqj
    public final void jS(Object object0) {
        if(((bxjg)object0) == null) {
            return;
        }
        SimpleDialogAccountPickerChimeraActivity simpleDialogAccountPickerChimeraActivity0 = this.a;
        int v = ((bxjg)object0).a;
        Intent intent0 = ((bxjg)object0).b;
        if(v == 10) {
            Toast.makeText(simpleDialogAccountPickerChimeraActivity0, 0x7F1507CC, 0).show();  // string:common_account_restricted_no_accounts "There are no accounts to select"
            v = 0;
        }
        else if(v == -1 && intent0 != null && simpleDialogAccountPickerChimeraActivity0.m.c) {
            Bundle bundle0 = intent0.getExtras();
            if(bundle0 != null) {
                String s = bundle0.getString("authAccount");
                if(s != null) {
                    bars.e(simpleDialogAccountPickerChimeraActivity0, s, simpleDialogAccountPickerChimeraActivity0.l);
                }
            }
        }
        if(intent0 == null) {
            simpleDialogAccountPickerChimeraActivity0.setResult(v);
        }
        else {
            simpleDialogAccountPickerChimeraActivity0.setResult(v, intent0);
        }
        simpleDialogAccountPickerChimeraActivity0.finish();
    }
}

