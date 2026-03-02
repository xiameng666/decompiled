import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public abstract class ezel extends skp {
    private final ezek ag;
    public static final int d;

    static {
        bboh.b("TrustAgent", bbcu.aR);
    }

    public ezel() {
        this.ag = new ezek(this);
    }

    @Override  // ohv
    public final void D(Bundle bundle0, String s) {
    }

    protected abstract void K(boolean arg1);

    @Override  // ohv
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        return layoutInflater0.inflate(0x7F0E013A, viewGroup0, false);  // layout:auth_trustagent_check_if_started
    }

    @Override  // ohv
    public final void onStart() {
        super.onStart();
        if(lup.a(this).b(0) == null) {
            lup.a(this).c(0, new Bundle(), this.ag);
            return;
        }
        lup.a(this).d(0, new Bundle(), this.ag);
    }
}

