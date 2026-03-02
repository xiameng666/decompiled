import android.content.Intent;
import com.google.android.gms.common.account.AccountTypePickerChimeraActivity;
import com.google.android.gms.common.account.SimpleDialogAccountPickerChimeraActivity;

public final class azrx implements lqj {
    public final SimpleDialogAccountPickerChimeraActivity a;

    public azrx(SimpleDialogAccountPickerChimeraActivity simpleDialogAccountPickerChimeraActivity0) {
        this.a = simpleDialogAccountPickerChimeraActivity0;
    }

    @Override  // lqj
    public final void jS(Object object0) {
        Intent intent0;
        if(((bxjg)object0) != null) {
            SimpleDialogAccountPickerChimeraActivity simpleDialogAccountPickerChimeraActivity0 = this.a;
            int v = ((bxjg)object0).a;
            if(v == 1) {
                intent0 = AccountTypePickerChimeraActivity.a(simpleDialogAccountPickerChimeraActivity0, simpleDialogAccountPickerChimeraActivity0.m);
            }
            else if(v == 2) {
                intent0 = ((bxjg)object0).b;
                v = 2;
            }
            else {
                intent0 = null;
            }
            if(intent0 != null) {
                simpleDialogAccountPickerChimeraActivity0.startActivityForResult(intent0, v);
            }
        }
    }
}

