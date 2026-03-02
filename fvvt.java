import android.content.ComponentName;
import android.content.Intent;
import android.view.View.OnClickListener;
import android.view.View;
import com.google.android.location.quake.ealert.ux.EAlertUxArgs;
import j..util.Objects;

final class fvvt implements View.OnClickListener {
    final EAlertUxArgs a;
    final fvvu b;

    public fvvt(fvvu fvvu0, EAlertUxArgs eAlertUxArgs0) {
        this.a = eAlertUxArgs0;
        Objects.requireNonNull(fvvu0);
        this.b = fvvu0;
        super();
    }

    @Override  // android.view.View$OnClickListener
    public void onClick(View view0) {
        Intent intent0 = new Intent();
        intent0.setComponent(new ComponentName("com.google.android.gms", "com.google.android.location.settings.EAlertSettingsActivity"));
        intent0.setFlags(0x10008000);
        this.b.t.startActivity(intent0);
        fxmt.b().a(this.a.h, this.a.i, this.a.k, 11);
    }
}

