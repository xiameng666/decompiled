import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.smartdevice.d2d.FallbackAccount;
import com.google.android.gms.smartdevice.directtransfer.UiCustomization;
import com.google.android.gms.smartdevice.setup.ui.views.MagicArchChallengeView;
import java.util.ArrayList;

public final class erja extends du {
    MagicArchChallengeView a;
    private String ag;
    private String ah;
    private int ai;
    private UiCustomization aj;
    private static final baun b;
    private ArrayList c;
    private int d;

    static {
        erja.b = new erqc(new String[]{"Setup", "UI", "AccountChallengeFragmentV2"});
    }

    @Override  // du
    public final void onAttach(Context context0) {
        erja.b.d("onAttach()", new Object[0]);
        super.onAttach(context0);
        if((context0 instanceof eriz)) {
            return;
        }
        throw new RuntimeException("Parent activity should implement AccountChallengeFragment.Listener");
    }

    @Override  // du
    public final void onCreate(Bundle bundle0) {
        erja.b.d("onCreate()", new Object[0]);
        super.onCreate(bundle0);
        Bundle bundle1 = this.getArguments();
        if(bundle1 != null) {
            this.c = bundle0 == null ? bauc.e(bundle1, "accounts", FallbackAccount.CREATOR) : bauc.e(bundle0, "accounts", FallbackAccount.CREATOR);
            this.ag = bundle1.getString("transitionTitle", this.getResources().getQuantityString(0x7F130096, (this.c == null ? 0 : this.c.size())));  // plurals:smartdevice_d2d_copying_accounts
            this.ah = bundle1.getString("transitionDescription", "");
            this.ai = bundle1.getInt("iconResId", 0x7F080B30);  // drawable:quantum_gm_ic_compare_arrows_vd_theme_24
            bundle1.getBoolean("useDarkTheme", false);
            this.aj = (UiCustomization)bundle1.getParcelable("uiCustomization");
        }
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        erja.b.d("onCreateView()", new Object[0]);
        if(hoxb.d()) {
            Context context0 = this.getContext();
            batl.s(context0);
            layoutInflater0 = layoutInflater0.cloneInContext(context0);
            layoutInflater0.setFactory2(new bagp());
        }
        return layoutInflater0.inflate(0x7F0E09E9, viewGroup0, false);  // layout:smartdevice_magic_arch_fragment
    }

    @Override  // du
    public final void onSaveInstanceState(Bundle bundle0) {
        erja.b.d("onSaveInstanceState()", new Object[0]);
        ArrayList arrayList0 = this.c;
        if(arrayList0 != null) {
            bauc.i(arrayList0, bundle0, "accounts");
        }
    }

    @Override  // du
    public final void onStart() {
        erja.b.d("onStart()", new Object[0]);
        super.onStart();
        xnz xnz0 = (xnz)this.getContext();
        if(xnz0 != null) {
            this.d = xnz0.getRequestedOrientation();
            xnz0.setRequestedOrientation(xnz0.getResources().getConfiguration().orientation);
        }
    }

    @Override  // du
    public final void onStop() {
        erja.b.d("onStop()", new Object[0]);
        super.onStop();
        xnz xnz0 = (xnz)this.getContext();
        if(xnz0 != null) {
            xnz0.setRequestedOrientation(this.d);
        }
    }

    @Override  // du
    public final void onViewCreated(View view0, Bundle bundle0) {
        erja.b.d("onViewCreated()", new Object[0]);
        xnz xnz0 = (xnz)this.getContext();
        if(xnz0 != null) {
            this.a = (MagicArchChallengeView)view0.findViewById(0x7F0B187D);  // id:magic_arch_webview
            erix erix0 = new erix(this, xnz0);
            ArrayList arrayList0 = this.c;
            if(arrayList0 == null) {
                this.a.c(xnz0, erix0, this.ag, this.ah, this.ai, this.aj, 0);
            }
            else {
                this.a.e(xnz0, erix0, this.ag, this.ah, this.ai, arrayList0, this.aj, 0);
            }
            xnz0.getWindow().setSoftInputMode(16);
            if(!this.a.g()) {
                eqrr.a(xnz0.getWindow(), view0);
            }
        }
    }

    public final void y() {
        MagicArchChallengeView magicArchChallengeView0 = this.a;
        if(magicArchChallengeView0 != null) {
            magicArchChallengeView0.d();
        }
    }

    public final void z() {
        MagicArchChallengeView magicArchChallengeView0 = this.a;
        if(magicArchChallengeView0 != null) {
            magicArchChallengeView0.f();
        }
    }
}

