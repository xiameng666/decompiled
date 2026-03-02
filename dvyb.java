import android.content.Context;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.google.android.gms.chimera.modules.pay.AppContextProvider;
import com.google.android.libraries.tapandpay.ui.viewheader.ComposeViewHeader;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.card.MaterialCardView;
import dagger.internal.Preconditions;

public final class dvyb extends dokz implements doky, ednc, fshg {
    public Button a;
    dspv ag;
    dspx ah;
    private static final bboh ai;
    private gfsx aj;
    private gfsx ak;
    private MaterialToolbar al;
    private ComposeViewHeader am;
    private TextView an;
    private TextView ao;
    private LinearLayout ap;
    eeej b;
    dsnx c;
    fhwk d;

    static {
        dvyb.ai = bboh.b("Pay", bbcu.cZ);
    }

    public dvyb() {
        this.aj = gfqx.a;
        this.ak = gfqx.a;
    }

    @Override  // ednc
    public final boolean F() {
        return hwfk.a.b().D();
    }

    // Detected as a lambda impl.
    @Override  // doky
    public final boolean G() {
        this.y();
        return true;
    }

    @Override  // fshg
    public final gfsx bA() {
        return this.ak;
    }

    @Override  // fshg
    public final gfsx bG() {
        return gfqx.a;
    }

    @Override  // fshg
    public final gfsx bH() {
        return gfqx.a;
    }

    @Override  // fshg
    public final gged_interceptors bI() {
        return ggna.a;
    }

    @Override  // fshg
    public final gged_interceptors bJ() {
        return ggna.a;
    }

    @Override  // fshg
    public final guut bK() {
        return guut.a;
    }

    @Override  // fshg
    public final String bL() {
        return "";
    }

    @Override  // fshg
    public final boolean bN() {
        return true;
    }

    @Override  // fshg
    public final boolean bO() {
        return false;
    }

    @Override  // fshg
    public final boolean bP() {
        return false;
    }

    @Override  // fshg
    public final boolean bQ() {
        return false;
    }

    @Override  // fshg
    public final boolean bR() {
        return false;
    }

    @Override  // fshg
    public final boolean bS() {
        return false;
    }

    @Override  // fshg
    public final boolean bT() {
        return false;
    }

    @Override  // fshg
    public final gfsx bt() {
        return gfqx.a;
    }

    @Override  // fshg
    public final gfsx bu() {
        return gfqx.a;
    }

    @Override  // fshg
    public final gfsx by() {
        return gfqx.a;
    }

    @Override  // fshg
    public final gfsx bz() {
        return gfqx.a;
    }

    @Override  // dokz
    public final void onAttach(Context context0) {
        super.onAttach(context0);
        doly doly0 = dolz.a(this);
        dolg dolg0 = this.ap();
        Preconditions.b(dolg0);
        domv domv0 = domu.a(AppContextProvider.a());
        Preconditions.b(domv0);
        new dvrh(dolg0, doly0, domv0).inject(this);
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        gfsx gfsx2;
        gfsx gfsx1;
        Bundle bundle1 = this.getArguments();
        if(bundle1 != null && !bundle1.isEmpty()) {
            gfsx gfsx0 = gfsx.l(bundle1.getString("VALUABLE_ISSUER_ID"));
            this.ak = gfsx0;
            if(gfsx0.i()) {
                byte[] arr_b = bundle1.getByteArray("VALUE_ADDED_MODULE");
                if(arr_b == null) {
                    ((ggtj)dvyb.ai.j()).x("No value added module argument for ValuableValueAddedModulesFragment");
                    this.y();
                }
                else {
                    try {
                        hftc hftc0 = hftc.a();
                        ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)gujt.a), arr_b, 0, arr_b.length, hftc0);
                        ProtoLiteMessage.P_makeImmutable(hftv0);
                        this.aj = gfsx.m(((gujt)hftv0));
                    }
                    catch(hfur hfur0) {
                        a.ae(dvyb.ai.j(), "Failed parsing value added module argument for ValuableValueAddedModulesFragment", hfur0);
                        this.y();
                    }
                }
            }
            else {
                ((ggtj)dvyb.ai.j()).x("No issuer id argument for ValuableValueAddedModulesFragment");
                this.y();
            }
        }
        else {
            ((ggtj)dvyb.ai.j()).x("No arguments for ValuableValueAddedModulesFragment");
            this.y();
        }
        View view0 = layoutInflater0.inflate((hwev.c() ? 0x7F0E0DFB : 0x7F0E0DFC), viewGroup0, false);  // layout:wallet_valuable_value_added_modules_fragment
        if(!this.aj.i()) {
            ((ggtj)dvyb.ai.j()).x("Value added module is not present for ValuableValueAddedModulesFragment");
            this.y();
            return view0;
        }
        if(((gujt)this.aj.d()).e.isEmpty()) {
            ((ggtj)dvyb.ai.j()).x("Modules list is empty for ValuableValueAddedModulesFragment");
            this.y();
            return view0;
        }
        if((((gujt)this.aj.d()).b & 2) == 0) {
            gfsx1 = gfqx.a;
        }
        else {
            gujs gujs0 = ((gujt)this.aj.d()).d;
            if(gujs0 == null) {
                gujs0 = gujs.a;
            }
            gfsx1 = gfsx.m(gujs0);
        }
        MaterialToolbar materialToolbar0 = (MaterialToolbar)view0.findViewById(0x7F0B08D8);  // id:Toolbar
        this.al = materialToolbar0;
        if(materialToolbar0 != null) {
            materialToolbar0.t(0x7F151C03);  // string:pay_back "Back"
            this.al.x((/* MISSING LAMBDA PARAMETER */) -> {
                this.y();
                return true;
            });
            Button button0 = (Button)view0.findViewById(0x7F0B08E1);  // id:Tooltip
            this.a = button0;
            if(button0 != null && gfsx1.i()) {
                Context context0 = this.getContext();
                if(context0 != null) {
                    View view1 = LayoutInflater.from(context0).inflate(0x7F0E0DFD, ((ViewGroup)view0.getRootView()), false);  // layout:wallet_value_added_module_tooltip_popup
                    ((MaterialCardView)view1.findViewById(0x7F0B0198)).d(fipw.b.a(context0));  // id:CardView
                    TextView textView0 = (TextView)view1.findViewById(0x7F0B046C);  // id:Header
                    gunw gunw0 = ((gujs)gfsx1.d()).c;
                    if(gunw0 == null) {
                        gunw0 = gunw.a;
                    }
                    textView0.setText(dspl.d(gunw0));
                    if((((gujs)gfsx1.d()).b & 2) != 0) {
                        TextView textView1 = (TextView)view1.findViewById(0x7F0B024D);  // id:Cta
                        gunw gunw1 = ((gujs)gfsx1.d()).d;
                        if(gunw1 == null) {
                            gunw1 = gunw.a;
                        }
                        textView1.setText(dspl.d(gunw1));
                        textView1.setVisibility(0);
                        if((((gujs)gfsx1.d()).b & 4) != 0) {
                            textView1.setOnClickListener(new dvxz(this, gfsx1));
                        }
                    }
                    view1.measure(0, 0);
                    PopupWindow popupWindow0 = new PopupWindow(view1, -2, view1.getMeasuredHeight(), true);
                    popupWindow0.setElevation(((float)edkx.a(context0, 2)));
                    DisplayMetrics displayMetrics0 = context0.getResources().getDisplayMetrics();
                    int v = Math.min(displayMetrics0.widthPixels, displayMetrics0.heightPixels);
                    int v1 = edkx.a(context0, 20) / 2;
                    int v2 = -Math.min(textView0.getMaxWidth() + v1, v);
                    Button button1 = this.a;
                    gunw gunw2 = ((gujs)gfsx1.d()).d;
                    if(gunw2 == null) {
                        gunw2 = gunw.a;
                    }
                    button1.setContentDescription(dspl.d(gunw2));
                    this.a.setOnClickListener(new dvya(this, popupWindow0, v2, v1));
                }
            }
        }
        if(hwev.c()) {
            ComposeViewHeader composeViewHeader0 = (ComposeViewHeader)view0.findViewById(0x7F0B0995);  // id:ViewHeader
            this.am = composeViewHeader0;
            gunu gunu0 = ((gujt)this.aj.d()).c;
            if(gunu0 == null) {
                gunu0 = gunu.a;
            }
            fryu fryu0 = new fryu(dspl.d((gunu0.c == null ? gunw.a : gunu0.c)));
            gunu gunu1 = ((gujt)this.aj.d()).c;
            if(gunu1 == null) {
                gunu1 = gunu.a;
            }
            if((2 & gunu1.b) == 0) {
                gfsx2 = gfqx.a;
            }
            else {
                gunu gunu2 = ((gujt)this.aj.d()).c;
                if(gunu2 == null) {
                    gunu2 = gunu.a;
                }
                String s = dspl.d((gunu2.d == null ? gunw.a : gunu2.d));
                gfsx2 = s.isEmpty() ? gfqx.a : gfsx.m(new fryu(s));
            }
            composeViewHeader0.b(new fuhm(null, fryu0, ((fryv)gfsx2.g())));
        }
        else {
            this.an = (TextView)view0.findViewById(0x7F0B0473);  // id:HeaderLabel
            TextView textView2 = (TextView)view0.findViewById(0x7F0B0471);  // id:HeaderContent
            this.ao = textView2;
            if(this.an != null && textView2 != null) {
                gunu gunu3 = ((gujt)this.aj.d()).c;
                if(gunu3 == null) {
                    gunu3 = gunu.a;
                }
                if((gunu3.b & 1) != 0) {
                    gunu gunu4 = ((gujt)this.aj.d()).c;
                    if(gunu4 == null) {
                        gunu4 = gunu.a;
                    }
                    dspl.h((gunu4.c == null ? gunw.a : gunu4.c), this.an);
                }
                gunu gunu5 = ((gujt)this.aj.d()).c;
                if(gunu5 == null) {
                    gunu5 = gunu.a;
                }
                if((gunu5.b & 2) != 0) {
                    gunu gunu6 = ((gujt)this.aj.d()).c;
                    if(gunu6 == null) {
                        gunu6 = gunu.a;
                    }
                    dspl.h((gunu6.d == null ? gunw.a : gunu6.d), this.ao);
                    this.ao.setVisibility(0);
                }
            }
        }
        hfuo hfuo0 = ((gujt)this.aj.d()).e;
        LinearLayout linearLayout0 = (LinearLayout)view0.findViewById(0x7F0B0983);  // id:ValueAddedModulesContainer
        this.ap = linearLayout0;
        if(linearLayout0 != null) {
            Context context1 = this.getContext();
            if(context1 != null) {
                if(hwev.c()) {
                    dsrs dsrs0 = new dsrs(context1);
                    dsrs0.t(this);
                    dsrs0.s(gged_interceptors.i(hfuo0), 2, this.c, this.d, this, this.ag, this.ah);
                    this.ap.addView(dsrs0);
                    return view0;
                }
                for(Object object0: hfuo0) {
                    dsrs dsrs1 = new dsrs(context1);
                    dsrs1.t(this);
                    dsrs1.s(gged_interceptors.l(((guje)object0)), 2, this.c, this.d, this, this.ag, this.ah);
                    this.ap.addView(dsrs1);
                    dtga dtga0 = new dtga(context1);
                    ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gufs.a).v_newBuilder();
                    gufq gufq0 = gufq.c;
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    gufs gufs0 = (gufs)hftp0.b_message;
                    gufs0.d = gufq0.a();
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    gufs gufs1 = (gufs)hftp0.b_message;
                    gufs1.b = 3;
                    gufs1.c = (int)12;
                    dtga0.jZ(((gufs)hftp0.N_build()));
                    this.ap.addView(dtga0);
                }
            }
        }
        return view0;
    }

    private final void y() {
        xob xob0 = this.an();
        if(xob0 == null) {
            return;
        }
        xob0.setResult(0);
        this.ar();
    }
}

