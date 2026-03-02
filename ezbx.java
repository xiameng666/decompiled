import android.app.KeyguardManager;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.chimera.modules.trustagent.AppContextProvider;
import com.google.android.gms.trustagent.common.receiver.ScreenOnOffReceiver;

public class ezbx extends xos implements ezbc, ezbv {
    private ScreenOnOffReceiver VM;
    public static final Integer j;
    private boolean l;

    static {
        ezbx.j = (int)-11;
    }

    public ezbx() {
        this.l = false;
    }

    @Override  // ezbc
    public final void b() {
    }

    @Override  // ezbc
    public final void c() {
    }

    @Override  // ezbv
    public final Intent d() {
        return this.getIntent();
    }

    @Override  // ezbc
    public final void kN() {
        this.finish();
    }

    public final void m() {
        this.l = false;
    }

    public final void n() {
        this.l = true;
    }

    @Override  // xos
    protected void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        if(bbqa.a()) {
            this.setTheme(0x7F160F86);  // style:TrustAgentCollapsingToolbarSettingsTheme
        }
        this.n();
        ScreenOnOffReceiver screenOnOffReceiver0 = new ScreenOnOffReceiver(AppContextProvider.a(), this);
        this.VM = screenOnOffReceiver0;
        screenOnOffReceiver0.b();
    }

    @Override  // xoi
    protected void onDestroy() {
        this.VM.d();
        super.onDestroy();
    }

    @Override  // xoi
    protected void onStop() {
        if(this.l) {
            KeyguardManager keyguardManager0 = (KeyguardManager)this.getSystemService("keyguard");
            if(keyguardManager0 != null && keyguardManager0.isKeyguardLocked()) {
                this.finish();
            }
        }
        else {
            this.finish();
        }
        super.onStop();
    }

    @Override  // com.google.android.chimera.android.Activity
    public final void startActivity(Intent intent0, Bundle bundle0) {
        ezbu.a(this, intent0);
        this.m();
        super.startActivity(intent0, bundle0);
    }

    @Override  // xoi
    public final void startActivityFromFragment(du du0, Intent intent0, int v, Bundle bundle0) {
        ezbu.a(this, intent0);
        this.m();
        super.startActivityFromFragment(du0, intent0, v, null);
    }
}

