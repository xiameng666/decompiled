import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.chimera.modules.pay.AppContextProvider;
import dagger.internal.Preconditions;

public final class eacl extends dokz implements fshb {
    public ibnf a;
    public acp b;
    private final ibnn c;

    public eacl() {
        eacg eacg0 = new eacg(this);
        eaci eaci0 = new eaci(new each(this));
        ibnn ibnn0 = ibno.a(ibnp.c, eaci0);
        this.c = new lsd(new ibuk(eada.class), new eacj(ibnn0), eacg0, new eack(ibnn0));
    }

    @Override  // fshb
    public final int kd() {
        return hwle.e() ? 1 : 3;
    }

    @Override  // dokz
    public final void onAttach(Context context0) {
        ibuq.f(context0, "context");
        super.onAttach(context0);
        dolg dolg0 = this.ap();
        Preconditions.b(dolg0);
        done done0 = new done();
        dmgr dmgr0 = new dmgr("com.google.android.gms");
        doly doly0 = dolz.a(this);
        dzpy dzpy0 = new dzpy(this);
        domv domv0 = domu.a(AppContextProvider.a());
        Preconditions.b(domv0);
        new dzul(dmgr0, dzpy0, done0, dolg0, domv0, doly0).inject(this);
        this.b = this.registerForActivityResult(new adt(), new eacb(this));
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        ibuq.f(layoutInflater0, "inflater");
        super.onCreate(bundle0);
        View view0 = layoutInflater0.inflate(0x7F0E0822, viewGroup0, false);  // layout:provision_flow_management_fragment
        ibuq.e(view0, "inflate(...)");
        return view0;
    }

    @Override  // du
    public final void onViewCreated(View view0, Bundle bundle0) {
        ibuq.f(view0, "view");
        icmq icmq0 = this.y().a.c;
        lps lps0 = this.getViewLifecycleOwner();
        icbb.b(lpt.a(lps0), null, null, new eace(lps0, icmq0, null, this), 3);
    }

    public final eada y() {
        return (eada)this.c.a();
    }
}

