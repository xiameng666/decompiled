import android.content.Intent;
import android.view.View.OnClickListener;
import android.view.View;
import com.google.android.gms.trustagent.activeunlock.primary.ui.authentication.ScreenLockSetUpFragment;

public final class eynm implements View.OnClickListener {
    public final ScreenLockSetUpFragment a;

    public eynm(ScreenLockSetUpFragment screenLockSetUpFragment0) {
        this.a = screenLockSetUpFragment0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        int v = ezae.a() - 1 == 0 ? 0x8000 : 0xFF;
        Intent intent0 = new Intent("android.settings.BIOMETRIC_ENROLL").putExtra("android.provider.extra.BIOMETRIC_AUTHENTICATORS_ALLOWED", v);
        ibuq.e(intent0, "putExtra(...)");
        this.a.d.b(intent0);
    }
}

