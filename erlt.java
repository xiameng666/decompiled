import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public final class erlt extends erlr implements eqos {
    private String ag;
    private String ah;
    private String ai;
    private int aj;
    private int ak;
    private String d;

    @Override  // eqos
    public final void c(int v, Bundle bundle0) {
        if(v == this.aj) {
            this.b.A(v);
            return;
        }
        switch(v) {
            case 1: {
                this.z();
                return;
            }
            case 2: {
                this.b.D();
                return;
            }
            default: {
                throw new IllegalStateException("Unknown action: " + v);
            }
        }
    }

    @Override  // erlr
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        Bundle bundle1 = this.getArguments();
        if(bundle1 == null) {
            bundle1 = Bundle.EMPTY;
        }
        this.d = bundle1.getString("verifyTitle", this.getString(0x7F15080C));  // string:common_confirm_screen_lock_title "Confirm your screen lock"
        this.ag = bundle1.getString("verifyText", this.getString(0x7F152E5D));  // string:smartdevice_d2d_lockscreen_verification_text "For security reasons, you\'ll 
                                                                                // need to confirm your screen lock to continue setup"
        this.ah = bundle1.getString("primaryButtonText", this.getString(0x7F15089B));  // string:common_next "Next"
        this.ak = bundle1.getInt("iconId", 0x7F080BBD);
        this.aj = bundle1.getInt("secondaryButtonActionId", 0);
        this.ai = bundle1.getString("secondaryButtonText");
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        return layoutInflater0.inflate(0x7F0E09E1, viewGroup0, false);  // layout:smartdevice_fragment_container
    }

    @Override  // du
    public final void onViewCreated(View view0, Bundle bundle0) {
        ca ca0 = new ca(this.getChildFragmentManager());
        eqpr eqpr0 = new eqpr();
        eqpr0.b = this.d;
        eqpr0.c = this.ag;
        eqpr0.e(this.ah, 1);
        eqpr0.a = this.ak;
        if(this.aj != 0 && !TextUtils.isEmpty(this.ai)) {
            eqpr0.f(this.ai, this.aj);
        }
        ca0.G(0x7F0B14C5, eqpr0.a());  // id:fragment_container
        ca0.a();
    }
}

