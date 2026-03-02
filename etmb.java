import android.content.Intent;
import android.view.View.OnClickListener;
import android.view.View;
import com.google.android.gms.tapandpay.keyguard.KeyguardSecurityInfoChimeraActivity;

public final class etmb implements View.OnClickListener {
    public final KeyguardSecurityInfoChimeraActivity a;

    public etmb(KeyguardSecurityInfoChimeraActivity keyguardSecurityInfoChimeraActivity0) {
        this.a = keyguardSecurityInfoChimeraActivity0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        this.a.j.D();
        Intent intent0 = new Intent("android.app.action.SET_NEW_PASSWORD");
        intent0.putExtra("minimum_quality", 0x10000);
        this.a.startActivityForResult(intent0, 1);
    }
}

