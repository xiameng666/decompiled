import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import com.google.android.gms.wallet.firstparty.SetUpBiometricAuthenticationKeysRequest;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.wallet.clientlog.LogContext;
import com.google.android.wallet.ui.common.CheckboxView;
import com.google.android.wallet.ui.common.MaterialFieldLayout;
import com.google.android.wallet.ui.expander.SummaryExpanderWrapper;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public final class fcab extends gdfr implements fbyv, fbyw {
    public fbyv a;
    private final gdew aO;
    private boolean aP;
    private boolean aQ;
    private boolean aR;
    private String aS;
    public fbyw b;

    public fcab() {
        this.aO = new gdew();
    }

    @Override  // gdfr
    protected final View G(View view0, gfjj gfjj0, ViewGroup viewGroup0, boolean z) {
        View view1 = gdcd.b(view0);
        if(!this.aQ && (view1 instanceof CheckboxView)) {
            gfjj gfjj1 = ((CheckboxView)view1).i;
            if(gfjj1 != null && gfhx.a((gfjj1.c == 10 ? ((gfhy)gfjj1.d) : gfhy.a).f) == 2) {
                ((CheckboxView)view1).d(this.getResources().getDimensionPixelSize(0x7F0715A6));  // dimen:wallet_uic_page_left_column_width
            }
        }
        return super.G(view0, gfjj0, viewGroup0, z);
    }

    public static fcab H(gewu gewu0, int v, String s, LogContext logContext0) {
        return fcab.J(gewu0, v, false, s, false, logContext0, null);
    }

    public static fcab I(gewu gewu0, int v, String s, boolean z, LogContext logContext0) {
        return fcab.J(gewu0, v, false, s, z, logContext0, null);
    }

    public static fcab J(gewu gewu0, int v, boolean z, String s, boolean z1, LogContext logContext0, BuyFlowConfig buyFlowConfig0) {
        fcab fcab0 = new fcab();
        Bundle bundle0 = fcab.al(v, ((MessageLite)gewu0), logContext0);
        bundle0.putString("analyticsId", s);
        bundle0.putBoolean("isFragmentInsideFieldGroup", z1);
        bundle0.putBoolean("fadeInImages", z);
        bundle0.putParcelable("buyFlowConfig", buyFlowConfig0);
        fcab0.setArguments(bundle0);
        return fcab0;
    }

    @Override  // gdfr
    protected final gcww L(geui geui0, boolean z) {
        if(geub.a(geui0.t) == 3) {
            return fcah.I(geui0, this.bU, this.aS, this.cM());
        }
        return !gdcb.Y(this.bV) ? gcwf.V(geui0, this.bU, true, false, this.aQ || z, this.cM()) : super.L(geui0, z);
    }

    @Override  // gdfr
    protected final gdak N(geus geus0) {
        BuyFlowConfig buyFlowConfig0 = (BuyFlowConfig)this.getArguments().get("buyFlowConfig");
        if(buyFlowConfig0 == null) {
            buyFlowConfig0 = BuyFlowConfig.a().a();
        }
        return fbyx.z(geus0, this.bU, this.cM(), buyFlowConfig0);
    }

    @Override  // gdfr
    protected final gdak Q(gfjj gfjj0) {
        if(gfjj0.c == 7) {
            int v = gfil.a(((gfip)gfjj0.d).f);
            boolean z = true;
            if(v == 0) {
                v = 1;
            }
            if(fcba.Q(v)) {
                int v1 = this.bU;
                LogContext logContext0 = this.cM();
                if(gfjj0.c == 7) {
                    gfip gfip0 = (gfip)gfjj0.d;
                    if(!fcba.Q((gfil.a(gfip0.f) == 0 ? 1 : gfil.a(gfip0.f))) || gfip0.c.size() <= 0) {
                        z = false;
                    }
                }
                else {
                    z = false;
                }
                batl.c(z, "Invalid ui field for SelectFieldSelectorFragment");
                gdak gdak0 = new fcba();
                gdak0.setArguments(fcba.al(v1, ((MessageLite)gfjj0), logContext0));
                return gdak0;
            }
        }
        throw new IllegalStateException(this.ah("Can\'t create fragment for uiField"));
    }

    @Override  // gdfr
    protected final SummaryExpanderWrapper R(gfep gfep0, ViewGroup viewGroup0) {
        return fbey.b(gfep0, viewGroup0, this, this, false);
    }

    @Override  // gdfr
    protected final gdfc S(gfbu gfbu0) {
        int v = this.bU;
        gdfc gdfc0 = new fccb();
        gdfc0.setArguments(fccb.al(v, ((MessageLite)gfbu0), this.cM()));
        return gdfc0;
    }

    @Override  // gdfr
    protected final geut U(int v) {
        return ((fbyx)this.V().get(v)).A();
    }

    public final List V() {
        List list0 = new ArrayList();
        for(int v = 0; true; ++v) {
            ArrayList arrayList0 = this.am;
            if(v >= arrayList0.size()) {
                break;
            }
            list0.add(((fbyx)arrayList0.get(v)));
        }
        return list0;
    }

    @Override  // gdfr
    protected final void W(gcww gcww0) {
        if((gcww0 instanceof fcah)) {
            ((fcah)gcww0).ak = this.aN;
        }
    }

    @Override  // gdfr
    protected final void Z(gdak gdak0) {
        fbyx fbyx0 = (fbyx)gdak0;
        fbyx0.ap = this;
        fbyx0.aq = this;
    }

    @Override  // fbyw
    public final void aL(SetUpBiometricAuthenticationKeysRequest setUpBiometricAuthenticationKeysRequest0) {
        fbyw fbyw0 = this.b;
        if(fbyw0 != null) {
            fbyw0.aL(setUpBiometricAuthenticationKeysRequest0);
        }
    }

    @Override  // gdfr
    protected final void aa(gdak gdak0) {
        if((gdak0 instanceof fcba)) {
            ((fcba)gdak0).al = this.aN;
            ((fcba)gdak0).ak = this.aL;
        }
    }

    public final void ab() {
        LinearLayout linearLayout0 = this.ah;
        if(linearLayout0 == null) {
            this.aR = true;
            return;
        }
        this.aR = false;
        View view0 = linearLayout0.getChildAt(linearLayout0.getChildCount() - 1);
        if((view0 instanceof MaterialFieldLayout) && (gdcd.b(view0) instanceof CheckboxView)) {
            ((MaterialFieldLayout)view0).setPaddingRelative(((MaterialFieldLayout)view0).getPaddingStart(), ((MaterialFieldLayout)view0).getPaddingTop(), ((MaterialFieldLayout)view0).getPaddingEnd(), 0);
            ((MaterialFieldLayout)view0).a = 0;
        }
    }

    public static boolean ac(gewu gewu0) {
        for(Object object0: gewu0.d) {
            gewt gewt0 = (gewt)object0;
            int v = gewt0.b;
            if(v == 2) {
                if(((gewq)gewt0.c).b != 2) {
                    continue;
                }
                return true;
            }
            for(Object object1: (v == 1 ? ((gewx)gewt0.c) : gewx.a).d) {
                if(((gewq)object1).b == 2) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override  // gdfr
    protected final boolean ad(gfjj gfjj0) {
        if(gfjj0.c == 7) {
            int v = gfil.a(((gfip)gfjj0.d).f);
            if(v == 0) {
                v = 1;
            }
            return fcba.Q(v);
        }
        return false;
    }

    @Override  // gdfr
    protected final gcyd ae(ViewGroup viewGroup0, int v) {
        switch(v - 1) {
            case 2: {
                gcyd gcyd1 = (gcyd)this.bW.inflate((this.aP ? 0x7F0E0C72 : 0x7F0E0C71), viewGroup0, false);  // layout:view_submit_material_button
                gdcb.I(this.bV, gcyd1.d());
                gcyd1.c().setVisibility(0);
                LinearLayout.LayoutParams linearLayout$LayoutParams0 = (LinearLayout.LayoutParams)gcyd1.c().getLayoutParams();
                int v1 = (int)this.getResources().getDimension(0x7F0715BA);  // dimen:wallet_uic_spacing_button_top_bottom
                linearLayout$LayoutParams0.topMargin = v1;
                linearLayout$LayoutParams0.bottomMargin = v1;
                return gcyd1;
            }
            case 6: {
                gcyd gcyd2 = new gcyn(this.bV);
                LinearLayout.LayoutParams linearLayout$LayoutParams1 = new LinearLayout.LayoutParams(-2, ((int)this.getResources().getDimension(0x7F071562)));  // dimen:wallet_uic_chip_button_height
                linearLayout$LayoutParams1.gravity = 0x800003;
                int v2 = (int)this.getResources().getDimension(0x7F0715BA);  // dimen:wallet_uic_spacing_button_top_bottom
                linearLayout$LayoutParams1.topMargin = v2;
                linearLayout$LayoutParams1.bottomMargin = v2;
                ((gcyn)gcyd2).setLayoutParams(linearLayout$LayoutParams1);
                return gcyd2;
            }
            case 7: {
                gcyd gcyd3 = (gcyd)this.bW.inflate(0x7F0E0C52, viewGroup0, false);  // layout:view_link_button
                gcyd3.d().setTextColor(gdcb.l(this.bV));
                if(gdcb.Y(this.bV)) {
                    return gcyd3;
                }
                ((LinearLayout.LayoutParams)gcyd3.c().getLayoutParams()).gravity = 17;
                return gcyd3;
            }
            case 0: 
            case 12: {
                gcyd gcyd0 = (gcyd)this.bW.inflate((this.aP ? 0x7F0E0C6E : 0x7F0E0C6D), viewGroup0, false);  // layout:view_standard_material_button
                gcyd0.d().setTextColor(gdcb.l(this.bV));
                return gcyd0;
            }
            default: {
                throw new IllegalStateException(this.ah(String.format(Locale.US, "Button of type %s not supported inside simple form", ((int)(v - 1)))));
            }
        }
    }

    @Override  // fbyv
    public final void ax() {
        fbyv fbyv0 = this.a;
        if(fbyv0 != null) {
            fbyv0.ax();
        }
    }

    @Override  // gcyg
    public final gdew mb() {
        return this.aO;
    }

    @Override  // gdfr
    public final void onAttach(Context context0) {
        super.onAttach(context0);
        Bundle bundle0 = this.getArguments();
        this.aS = bundle0.getString("analyticsId");
        this.aQ = bundle0.getBoolean("isFragmentInsideFieldGroup");
        this.c = bundle0.getBoolean("fadeInImages");
    }

    @Override  // gdfr
    protected final View y(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        TypedArray typedArray0 = this.bV.obtainStyledAttributes(new int[]{0x7F040721});  // attr:internalUicUseGoogleMaterial2Theme
        this.aP = typedArray0.getBoolean(0, false);
        typedArray0.recycle();
        View view0 = super.y(layoutInflater0, viewGroup0, bundle0);
        if(this.aR) {
            this.ab();
        }
        return view0;
    }
}

