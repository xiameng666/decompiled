import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.mdocstore.types.ProvisioningId;
import com.google.android.gms.pay.MdocIntentArgs;
import dagger.internal.Preconditions;

public final class dugj extends dokz implements fshb {
    public static final bboh a;
    public acp ag;
    public Account ah;
    private ProvisioningId ai;
    dvfh b;
    dtzg c;
    final gfsx d;

    static {
        dugj.a = bboh.b("Pay", bbcu.cZ);
    }

    public dugj() {
        this.d = gfqx.a;
    }

    @Override  // fshb
    public final int kd() {
        return hwle.g() ? 1 : 3;
    }

    @Override  // dokz
    public final void onAttach(Context context0) {
        super.onAttach(context0);
        doly doly0 = dolz.a(this);
        dolg dolg0 = this.ap();
        Preconditions.b(dolg0);
        duby duby0 = new duby(dolg0, dpsw.a(doly0, this.ap()), dxee.a(doly0), doly0);
        this.d.f(duby0);
        duby0.inject(this);
        this.ah = this.ap().a();
    }

    @Override  // du
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        this.ag = this.registerForActivityResult(new adt(), new dugh(this));
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        super.onCreate(bundle0);
        View view0 = layoutInflater0.inflate(0x7F0E0581, viewGroup0, false);  // layout:mdoc_loading_fragment
        MdocIntentArgs mdocIntentArgs0 = ednn.b(this).K;
        if(mdocIntentArgs0 == null) {
            mdocIntentArgs0 = new dlge().a;
        }
        String s = mdocIntentArgs0.a;
        gftb.check(s);
        this.ai = new ProvisioningId(s);
        Intent intent0 = this.c.a(this.requireContext(), this.ai.a, this.ah);
        this.ag.b(intent0);
        return view0;
    }
}

