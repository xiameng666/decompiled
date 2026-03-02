import android.content.Intent;
import com.google.android.gms.tapandpay.keyguard.KeyguardSecurityInfoChimeraActivity;

public final class etlz implements ibth {
    public final KeyguardSecurityInfoChimeraActivity a;

    public etlz(KeyguardSecurityInfoChimeraActivity keyguardSecurityInfoChimeraActivity0) {
        this.a = keyguardSecurityInfoChimeraActivity0;
    }

    @Override  // ibth
    public final Object a() {
        this.a.j.D();
        Intent intent0 = new Intent("android.app.action.SET_NEW_PASSWORD");
        intent0.putExtra("minimum_quality", 0x10000);
        this.a.startActivityForResult(intent0, 1);
        return ibom.a;
    }
}

