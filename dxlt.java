import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.chimera.modules.pay.AppContextProvider;
import com.google.android.gms.pay.settings.view.SettingsLinkOutView;
import com.google.android.libraries.tapandpay.ui.rowsecondary.RowSecondary;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import dagger.internal.Preconditions;
import java.util.ArrayList;

public final class dxlt extends dokz implements ednc {
    public static final dxls a;
    public edoq ag;
    public boolean ah;
    public fhwk ai;
    public edrc aj;
    public dxil ak;
    private LinearLayout al;
    private SettingsLinkOutView am;
    private SettingsLinkOutView an;
    private SettingsLinkOutView ao;
    private RowSecondary ap;
    private RowSecondary aq;
    private RowSecondary ar;
    private TextView as;
    public eeej b;
    public dmgi c;
    public fuok d;

    static {
        dxlt.a = new dxls();
    }

    public dxlt() {
        this.ah = true;
    }

    @Override  // ednc
    public final boolean F() {
        return true;
    }

    @Override  // dokz
    public final void onAttach(Context context0) {
        ibuq.f(context0, "context");
        super.onAttach(context0);
        if(this.ak == null) {
            dolg dolg0 = this.ap();
            Preconditions.b(dolg0);
            doma doma0 = new doma(this);
            edop edop0 = new edop();
            domv domv0 = domu.a(AppContextProvider.a());
            Preconditions.b(domv0);
            this.ak = new dxil(doma0, dolg0, edop0, domv0);
        }
        dxil dxil0 = this.ak;
        if(dxil0 == null) {
            ibuq.j("component");
            dxil0 = null;
        }
        dxil0.inject(this);
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        fuok fuok1;
        ibuq.f(layoutInflater0, "inflater");
        View view0 = layoutInflater0.inflate(0x7F0E0EDF, viewGroup0, false);  // layout:your_data_in_wallet_fragment
        ibuq.e(view0, "inflate(...)");
        this.al = (LinearLayout)view0.findViewById(0x7F0B0224);  // id:ContentContainer
        this.am = (SettingsLinkOutView)view0.findViewById(0x7F0B056F);  // id:ManagePaymentExperience
        this.an = (SettingsLinkOutView)view0.findViewById(0x7F0B056A);  // id:ManagePasses
        this.ao = (SettingsLinkOutView)view0.findViewById(0x7F0B06BF);  // id:PrivatePassesData
        this.as = (TextView)view0.findViewById(0x7F0B00FC);  // id:BottomDisclaimer
        this.ap = (RowSecondary)view0.findViewById(0x7F0B0570);  // id:ManagePaymentExperienceBc25
        this.aq = (RowSecondary)view0.findViewById(0x7F0B056B);  // id:ManagePassesBc25
        this.ar = (RowSecondary)view0.findViewById(0x7F0B06C0);  // id:PrivatePassesDataBc25
        if(hwev.c()) {
            LinearLayout linearLayout0 = this.al;
            if(linearLayout0 == null) {
                ibuq.j("contentContainer");
                linearLayout0 = null;
            }
            ViewGroup.LayoutParams viewGroup$LayoutParams0 = linearLayout0.getLayoutParams();
            ibuq.d(viewGroup$LayoutParams0, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0).topMargin = this.requireContext().getResources().getDimensionPixelSize(0x7F070DED);  // dimen:pay_large_spacing
            LinearLayout linearLayout1 = this.al;
            if(linearLayout1 == null) {
                ibuq.j("contentContainer");
                linearLayout1 = null;
            }
            linearLayout1.setLayoutParams(((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0));
            ArrayList arrayList0 = new ArrayList();
            if(this.z()) {
                arrayList0.add(new fuat(new fryr(0x7F152413), new fryr(0x7F152412), null, new fubv(new fryh(0x7F0805E3), null, null, null, null, 0x7E), 0, null, new dxlo(this), null, null, false, false, false, null, false, 0x3FB4));  // string:pay_wallet_manage_payment_experience_item_title "Manage payments data"
            }
            arrayList0.add(new fuat(new fryr(0x7F152411), new fryr(0x7F152410), null, new fubv(new fryh(0x7F080B20), null, null, null, null, 0x7E), 0, null, new dxlp(this), null, null, false, false, false, null, false, 0x3FB4));  // string:pay_wallet_manage_passes_title "Manage passes data"
            if(hwsn.f()) {
                fryr fryr0 = new fryr(0x7F152447);  // string:pay_wallet_private_passes_data_item_title "About private passes data"
                String s = this.getString(0x7F152446, new Object[]{hwsn.c()});  // string:pay_wallet_private_passes_data_item_description "Private passes contain sensitive 
                                                                                // info and won\'t be used across Google. You\'ll need to unlock your phone to view 
                                                                                // and use these passes. <a href=%1$s>Learn more about private passes</a>"
                ibuq.e(s, "getString(...)");
                arrayList0.add(new fuat(fryr0, new fryt(ftrm.f(s, true)), null, null, 0, null, null, null, null, false, false, false, null, false, 0x3FFC));
            }
            fulg.c(arrayList0);
            if(this.z()) {
                RowSecondary rowSecondary0 = this.ap;
                if(rowSecondary0 == null) {
                    ibuq.j("managePaymentExperience");
                    rowSecondary0 = null;
                }
                rowSecondary0.h(((fuat)arrayList0.get(0)));
                RowSecondary rowSecondary1 = this.aq;
                if(rowSecondary1 == null) {
                    ibuq.j("managePasses");
                    rowSecondary1 = null;
                }
                rowSecondary1.h(((fuat)arrayList0.get(1)));
                fuat fuat0 = (fuat)ibpo.U(arrayList0, 2);
                if(fuat0 != null) {
                    RowSecondary rowSecondary2 = this.ar;
                    if(rowSecondary2 == null) {
                        ibuq.j("privatePasses");
                        rowSecondary2 = null;
                    }
                    rowSecondary2.h(fuat0);
                }
            }
            else {
                RowSecondary rowSecondary3 = this.aq;
                if(rowSecondary3 == null) {
                    ibuq.j("managePasses");
                    rowSecondary3 = null;
                }
                rowSecondary3.h(((fuat)arrayList0.get(0)));
                fuat fuat1 = (fuat)ibpo.U(arrayList0, 1);
                if(fuat1 != null) {
                    RowSecondary rowSecondary4 = this.ar;
                    if(rowSecondary4 == null) {
                        ibuq.j("privatePasses");
                        rowSecondary4 = null;
                    }
                    rowSecondary4.h(fuat1);
                }
            }
        }
        else {
            if(hwsn.f()) {
                this.am = (SettingsLinkOutView)view0.findViewById(0x7F0B0571);  // id:ManagePaymentExperienceV2
                this.an = (SettingsLinkOutView)view0.findViewById(0x7F0B056E);  // id:ManagePassesV2
            }
            SettingsLinkOutView settingsLinkOutView0 = this.am;
            if(settingsLinkOutView0 == null) {
                ibuq.j("managePaymentExperienceItem");
                settingsLinkOutView0 = null;
            }
            settingsLinkOutView0.setOnClickListener(new dxlq(this));
            xob xob0 = this.ao();
            Intent intent0 = dlnf.S(xob0);
            SettingsLinkOutView settingsLinkOutView1 = this.an;
            if(settingsLinkOutView1 == null) {
                ibuq.j("managePassesItem");
                settingsLinkOutView1 = null;
            }
            settingsLinkOutView1.setOnClickListener(new dxlr(xob0, intent0));
            if(hwsn.f()) {
                SettingsLinkOutView settingsLinkOutView2 = this.ao;
                if(settingsLinkOutView2 == null) {
                    ibuq.j("privatePassesItem");
                    settingsLinkOutView2 = null;
                }
                String s1 = this.getString(0x7F152446, new Object[]{hwsn.c()});  // string:pay_wallet_private_passes_data_item_description "Private passes contain sensitive 
                                                                                 // info and won\'t be used across Google. You\'ll need to unlock your phone to view 
                                                                                 // and use these passes. <a href=%1$s>Learn more about private passes</a>"
                edqf.d(settingsLinkOutView2.e, s1);
            }
        }
        View view1 = view0.findViewById(0x7F0B0082);  // id:AppBarStub
        ibuq.e(view1, "findViewById(...)");
        ((ViewStub)view1).setLayoutResource(0x7F0E0776);  // layout:pay_wallet_collapsing_app_bar
        View view2 = ((ViewStub)view1).inflate();
        ibuq.e(view2, "inflate(...)");
        Toolbar toolbar0 = (Toolbar)view2.findViewById(0x7F0B08D8);  // id:Toolbar
        toolbar0.t(0x7F151C03);  // string:pay_back "Back"
        toolbar0.x(new dxln(this));
        toolbar0.v(0x7F080AF0);  // drawable:quantum_gm_ic_arrow_back_vd_theme_24
        View view3 = view2.findViewById(0x7F0B0207);  // id:CollapsingToolbar
        ibuq.c(view3);
        ((CollapsingToolbarLayout)view3).j(this.getString(0x7F152445));  // string:pay_wallet_privacy_controls_title "Your data in Wallet"
        View view4 = view0.findViewById(0x7F0B0A1F);  // id:YourDataInWalletTitle
        ibuq.e(view4, "findViewById(...)");
        ((TextView)view4).setVisibility(8);
        View view5 = view2.findViewById(0x7F0B0080);  // id:AppBar
        ibuq.c(view5);
        fuoa.a(((AppBarLayout)view5));
        boolean z = this.z();
        boolean z1 = hwsn.a.b().d();
        if(hwev.c()) {
            if(z) {
                RowSecondary rowSecondary5 = this.ap;
                if(rowSecondary5 == null) {
                    ibuq.j("managePaymentExperience");
                    rowSecondary5 = null;
                }
                rowSecondary5.setVisibility(0);
            }
            RowSecondary rowSecondary6 = this.aq;
            if(rowSecondary6 == null) {
                ibuq.j("managePasses");
                rowSecondary6 = null;
            }
            rowSecondary6.setVisibility(0);
            if(hwsn.f()) {
                RowSecondary rowSecondary7 = this.ar;
                if(rowSecondary7 == null) {
                    ibuq.j("privatePasses");
                    rowSecondary7 = null;
                }
                rowSecondary7.setVisibility(0);
                if(!z1) {
                    TextView textView0 = this.as;
                    if(textView0 == null) {
                        ibuq.j("bottomDisclaimer");
                        textView0 = null;
                    }
                    textView0.setVisibility(0);
                }
            }
        }
        else {
            if(z) {
                SettingsLinkOutView settingsLinkOutView3 = this.am;
                if(settingsLinkOutView3 == null) {
                    ibuq.j("managePaymentExperienceItem");
                    settingsLinkOutView3 = null;
                }
                settingsLinkOutView3.setVisibility(0);
            }
            SettingsLinkOutView settingsLinkOutView4 = this.an;
            if(settingsLinkOutView4 == null) {
                ibuq.j("managePassesItem");
                settingsLinkOutView4 = null;
            }
            settingsLinkOutView4.setVisibility(0);
            if(hwsn.f()) {
                SettingsLinkOutView settingsLinkOutView5 = this.ao;
                if(settingsLinkOutView5 == null) {
                    ibuq.j("privatePassesItem");
                    settingsLinkOutView5 = null;
                }
                settingsLinkOutView5.setVisibility(0);
                if(!z1) {
                    TextView textView1 = this.as;
                    if(textView1 == null) {
                        ibuq.j("bottomDisclaimer");
                        textView1 = null;
                    }
                    textView1.setVisibility(0);
                }
            }
        }
        View view6 = view0.findViewById(0x7F0B0A1E);  // id:YourDataInWalletContainer
        ibuq.e(view6, "findViewById(...)");
        int v = this.getResources().getDimensionPixelSize(0x7F070DED);  // dimen:pay_large_spacing
        fuok fuok0 = this.d;
        if(fuok0 == null) {
            ibuq.j("edgeToEdgeStyler");
            fuok1 = null;
        }
        else {
            fuok1 = fuok0;
        }
        fuop.c(fuok1, view6, v);
        this.y().f(view0, this.y().a.a(202723));
        return view0;
    }

    @Override  // du
    public final boolean onOptionsItemSelected(MenuItem menuItem0) {
        ibuq.f(menuItem0, "item");
        if(menuItem0.getItemId() == 0x102002C) {
            this.ar();
            return true;
        }
        return false;
    }

    @Override  // du
    public final void onStart() {
        super.onStart();
        dmgi dmgi0 = this.c;
        if(dmgi0 == null) {
            ibuq.j("clearcutEventLogger");
            dmgi0 = null;
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hapr.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hana.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((hana)hftp1.b_message).b = "YOUR_DATA_IN_WALLET";
        hana hana0 = (hana)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hapr hapr0 = (hapr)hftp0.b_message;
        hana0.getClass();
        hapr0.r = hana0;
        hapr0.b |= 0x200;
        dmgi0.b(((hapr)hftp0.N_build()));
    }

    public final fhwk y() {
        fhwk fhwk0 = this.ai;
        if(fhwk0 != null) {
            return fhwk0;
        }
        ibuq.j("viewVisualElements");
        return null;
    }

    private final boolean z() {
        edrc edrc0 = this.aj;
        if(edrc0 == null) {
            ibuq.j("paymentsEligibility");
            edrc0 = null;
        }
        return edrc0.a;
    }
}

