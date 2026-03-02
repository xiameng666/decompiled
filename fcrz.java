import android.content.Intent;
import android.view.View.OnClickListener;
import android.view.View;
import com.google.android.gms.wearable.backup.wear.WearBackupAccountPickerChimeraActivity;

public final class fcrz implements View.OnClickListener {
    public final WearBackupAccountPickerChimeraActivity a;
    public final String b;

    public fcrz(WearBackupAccountPickerChimeraActivity wearBackupAccountPickerChimeraActivity0, String s) {
        this.a = wearBackupAccountPickerChimeraActivity0;
        this.b = s;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        WearBackupAccountPickerChimeraActivity.j.h("Account selected: %s", new Object[]{baun.q(this.b)});
        Intent intent0 = new Intent().putExtra("selected_account_name", this.b);
        this.a.setResult(-1, intent0);
        this.a.finish();
    }
}

