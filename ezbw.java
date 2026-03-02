import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.chimera.modules.trustagent.AppContextProvider;
import com.google.android.gms.trustagent.common.receiver.ScreenOnOffReceiver;

public class ezbw extends xni implements ezbc, ezbv {
    private ScreenOnOffReceiver VN;
    public static final Integer m;
    public boolean n;

    static {
        ezbw.m = (int)-11;
    }

    public ezbw() {
        this.n = false;
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

    @Override  // xoi
    protected void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        ScreenOnOffReceiver screenOnOffReceiver0 = new ScreenOnOffReceiver(AppContextProvider.a(), this);
        this.VN = screenOnOffReceiver0;
        screenOnOffReceiver0.b();
    }

    @Override  // xni
    protected void onDestroy() {
        this.VN.d();
        super.onDestroy();
    }

    @Override  // xni
    protected void onStop() {
        if(!this.n) {
            this.finish();
        }
        super.onStop();
    }

    @Override  // com.google.android.chimera.android.Activity
    public final void startActivity(Intent intent0, Bundle bundle0) {
        ezbu.a(this, intent0);
        super.startActivity(intent0, bundle0);
    }

    @Override  // xoi
    public final void startActivityFromFragment(du du0, Intent intent0, int v, Bundle bundle0) {
        ezbu.a(this, intent0);
        super.startActivityFromFragment(du0, intent0, v, null);
    }
}

