import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.mdocstore.types.ProvisioningId;
import com.google.android.gms.pay.MdocIntentArgs;
import dagger.internal.Preconditions;

public final class duls extends dokz {
    dvfh a;
    public View ag;
    public ProvisioningId ah;
    dtze b;
    Account c;
    final gfsx d;

    public duls() {
        this.d = gfqx.a;
    }

    @Override  // dokz
    public final void onAttach(Context context0) {
        super.onAttach(context0);
        doly doly0 = dolz.a(this);
        dolg dolg0 = this.ap();
        Preconditions.b(dolg0);
        dulm dulm0 = new dulm(dolg0, dpsw.a(doly0, this.ap()), dxee.a(doly0), dolz.a(this));
        this.d.f(dulm0);
        dulm0.inject(this);
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        this.ag = layoutInflater0.inflate(0x7F0E04D7, viewGroup0, false);  // layout:id_card_cta_fragment
        MdocIntentArgs mdocIntentArgs0 = ednn.b(this).K;
        if(mdocIntentArgs0 == null) {
            mdocIntentArgs0 = new dlge().a;
        }
        String s = mdocIntentArgs0.a;
        gftb.check(s);
        ProvisioningId provisioningId0 = new ProvisioningId(s);
        this.ah = provisioningId0;
        this.a.f(provisioningId0);
        this.a.n.g(this.getViewLifecycleOwner(), new duln(this));
        return this.ag;
    }
}

