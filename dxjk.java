import android.accounts.Account;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.text.SpannableString;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.google.android.gms.chimera.modules.pay.AppContextProvider;
import com.google.android.gms.pay.DataChangeListenerResponse;
import com.google.android.gms.pay.FetchMode;
import com.google.android.gms.pay.GetSettingsRequest;
import com.google.android.gms.pay.UpdateSettingsRequest;
import com.google.android.libraries.tapandpay.ui.rowsecondary.RowSecondary;
import com.google.android.libraries.tapandpay.ui.viewheader.ComposeViewHeader;
import dagger.internal.Preconditions;

public final class dxjk extends dokz implements dmqb, ednc {
    public static final dxjf a;
    public RowSecondary ag;
    public View ah;
    public View ai;
    public dxkh aj;
    public Account ak;
    public dmgi al;
    public eeej am;
    public dxkp an;
    public edrp ao;
    public fuok ap;
    public fhwk aq;
    public View ar;
    public dxif as;
    public azts at;
    private final edlu au;
    private View av;
    private ComposeViewHeader aw;
    private RecyclerView ax;
    public final bboh b;
    public RowSecondary c;
    public RowSecondary d;

    static {
        dxjk.a = new dxjf();
    }

    public dxjk() {
        this.b = bboh.b("Pay", bbcu.cZ);
        this.au = new edlu(this);
    }

    public final fhwk A() {
        fhwk fhwk0 = this.aq;
        if(fhwk0 != null) {
            return fhwk0;
        }
        ibuq.j("viewVisualElements");
        return null;
    }

    public final void B() {
        RowSecondary rowSecondary5;
        RowSecondary rowSecondary0 = this.d;
        if(rowSecondary0 == null) {
            ibuq.j("contextualSurfacingToggleComponent");
            rowSecondary0 = null;
        }
        boolean z = dxjf.a(rowSecondary0);
        RowSecondary rowSecondary1 = this.d;
        if(rowSecondary1 == null) {
            ibuq.j("contextualSurfacingToggleComponent");
            rowSecondary1 = null;
        }
        RowSecondary rowSecondary2 = this.d;
        if(rowSecondary2 == null) {
            ibuq.j("contextualSurfacingToggleComponent");
            rowSecondary2 = null;
        }
        fuat fuat0 = rowSecondary2.g();
        RowSecondary rowSecondary3 = this.d;
        if(rowSecondary3 == null) {
            ibuq.j("contextualSurfacingToggleComponent");
            rowSecondary3 = null;
        }
        fuca fuca0 = rowSecondary3.g().d;
        fubx fubx0 = (fuca0 instanceof fubx) ? ((fubx)fuca0) : null;
        rowSecondary1.h(fuat.d(fuat0, null, null, (fubx0 == null ? null : fubx0.a()), null, false, false, null, 0x3FF7));
        RowSecondary rowSecondary4 = this.d;
        if(rowSecondary4 == null) {
            ibuq.j("contextualSurfacingToggleComponent");
            rowSecondary5 = null;
        }
        else {
            rowSecondary5 = rowSecondary4;
        }
        this.O(rowSecondary5, 0x7F1523A7, 0x7F1523A6, new dxiu(this), new dxiv(this, z));  // string:pay_wallet_contextual_surfacing_title "Use passes across Google"
    }

    public final void D() {
        RowSecondary rowSecondary0 = this.c;
        RowSecondary rowSecondary1 = null;
        if(rowSecondary0 == null) {
            ibuq.j("personalizationWithinWalletToggleComponent");
            rowSecondary0 = null;
        }
        RowSecondary rowSecondary2 = this.c;
        if(rowSecondary2 == null) {
            ibuq.j("personalizationWithinWalletToggleComponent");
            rowSecondary2 = null;
        }
        fuat fuat0 = rowSecondary2.g();
        RowSecondary rowSecondary3 = this.c;
        if(rowSecondary3 == null) {
            ibuq.j("personalizationWithinWalletToggleComponent");
            rowSecondary3 = null;
        }
        fuca fuca0 = rowSecondary3.g().d;
        fubx fubx0 = (fuca0 instanceof fubx) ? ((fubx)fuca0) : null;
        rowSecondary0.h(fuat.d(fuat0, null, null, (fubx0 == null ? null : fubx0.a()), null, false, false, null, 0x3FF7));
        RowSecondary rowSecondary4 = this.c;
        if(rowSecondary4 == null) {
            ibuq.j("personalizationWithinWalletToggleComponent");
        }
        else {
            rowSecondary1 = rowSecondary4;
        }
        dxjk.M(this, rowSecondary1, 0x7F15243C, 0x7F15243B);  // string:pay_wallet_personalization_control_title "Personalization within Wallet"
    }

    public final void E() {
        RowSecondary rowSecondary0 = this.ag;
        RowSecondary rowSecondary1 = null;
        if(rowSecondary0 == null) {
            ibuq.j("personalizedSurfacingToggleComponent");
            rowSecondary0 = null;
        }
        RowSecondary rowSecondary2 = this.ag;
        if(rowSecondary2 == null) {
            ibuq.j("personalizedSurfacingToggleComponent");
            rowSecondary2 = null;
        }
        fuat fuat0 = rowSecondary2.g();
        RowSecondary rowSecondary3 = this.ag;
        if(rowSecondary3 == null) {
            ibuq.j("personalizedSurfacingToggleComponent");
            rowSecondary3 = null;
        }
        fuca fuca0 = rowSecondary3.g().d;
        fubx fubx0 = (fuca0 instanceof fubx) ? ((fubx)fuca0) : null;
        rowSecondary0.h(fuat.d(fuat0, null, null, (fubx0 == null ? null : fubx0.a()), null, false, false, null, 0x3FF7));
        RowSecondary rowSecondary4 = this.ag;
        if(rowSecondary4 == null) {
            ibuq.j("personalizedSurfacingToggleComponent");
        }
        else {
            rowSecondary1 = rowSecondary4;
        }
        dxjk.M(this, rowSecondary1, 0x7F15243F, 0x7F15243E);  // string:pay_wallet_personalized_surfacing_title "Personalization across Google"
    }

    @Override  // ednc
    public final boolean F() {
        return true;
    }

    public final void G() {
        this.I(false);
        View view0 = this.ar;
        View view1 = null;
        if(view0 == null) {
            ibuq.j("hiddenViewLayout");
            view0 = null;
        }
        view0.animate().setListener(null).cancel();
        long v = (long)this.getResources().getInteger(0x10E0000);
        if(this.P()) {
            View view2 = this.ar;
            if(view2 == null) {
                ibuq.j("hiddenViewLayout");
            }
            else {
                view1 = view2;
            }
            view1.setAlpha(0.0f);
            view1.setVisibility(0);
            view1.animate().alpha(1.0f).setDuration(v);
            return;
        }
        View view3 = this.ar;
        if(view3 == null) {
            ibuq.j("hiddenViewLayout");
        }
        else {
            view1 = view3;
        }
        ibuq.c(view1.animate().alpha(0.0f).setDuration(v).setListener(new dxji(this)));
    }

    // Detected as a lambda impl.
    public final void H(int v) {
        xob xob0 = this.ao();
        GetSettingsRequest getSettingsRequest0 = new GetSettingsRequest();
        getSettingsRequest0.a = this.y();
        getSettingsRequest0.b = ftqe.a(((MessageLite)ecfu.b()));
        FetchMode fetchMode0 = new FetchMode();
        fetchMode0.a = v;
        getSettingsRequest0.c = fetchMode0;
        evql evql0 = this.N().aO(getSettingsRequest0);
        evql0.x(xob0, new dxjd(new dxjc(this)));
        evql0.u(xob0, new dxje(this));
    }

    public final void I(boolean z) {
        RowSecondary rowSecondary0 = this.c;
        RowSecondary rowSecondary1 = null;
        if(rowSecondary0 == null) {
            ibuq.j("personalizationWithinWalletToggleComponent");
            rowSecondary0 = null;
        }
        rowSecondary0.setClickable(z);
        RowSecondary rowSecondary2 = this.d;
        if(rowSecondary2 == null) {
            ibuq.j("contextualSurfacingToggleComponent");
            rowSecondary2 = null;
        }
        rowSecondary2.setClickable(z);
        RowSecondary rowSecondary3 = this.ag;
        if(rowSecondary3 == null) {
            ibuq.j("personalizedSurfacingToggleComponent");
            rowSecondary3 = null;
        }
        rowSecondary3.setClickable(z);
        RowSecondary rowSecondary4 = this.c;
        if(rowSecondary4 == null) {
            ibuq.j("personalizationWithinWalletToggleComponent");
            rowSecondary4 = null;
        }
        rowSecondary4.setFocusable(true);
        RowSecondary rowSecondary5 = this.d;
        if(rowSecondary5 == null) {
            ibuq.j("contextualSurfacingToggleComponent");
            rowSecondary5 = null;
        }
        rowSecondary5.setFocusable(true);
        RowSecondary rowSecondary6 = this.ag;
        if(rowSecondary6 == null) {
            ibuq.j("personalizedSurfacingToggleComponent");
        }
        else {
            rowSecondary1 = rowSecondary6;
        }
        rowSecondary1.setFocusable(true);
    }

    public final void J(Exception exception0) {
        int v = !(exception0 instanceof aztb) || ((aztb)exception0).b() != 7 ? 0x7F151DDD : 0x7F151FD7;  // string:pay_error_dialog_body "Please try again later"
        View view0 = this.av;
        if(view0 == null) {
            ibuq.j("rootView");
            view0 = null;
        }
        edpc.a(view0, v);
    }

    public final dxif K() {
        dxif dxif0 = this.as;
        if(dxif0 != null) {
            return dxif0;
        }
        ibuq.j("component");
        return null;
    }

    public final void L(dxif dxif0) {
        ibuq.f(dxif0, "<set-?>");
        this.as = dxif0;
    }

    static void M(dxjk dxjk0, RowSecondary rowSecondary0, int v, int v1) {
        dxjk0.O(rowSecondary0, v, v1, null, new dxiq(rowSecondary0));
    }

    public final azts N() {
        azts azts0 = this.at;
        if(azts0 != null) {
            return azts0;
        }
        ibuq.j("payClient");
        return null;
    }

    private final void O(RowSecondary rowSecondary0, int v, int v1, ibth ibth0, evqc evqc0) {
        if(ibth0 != null) {
            ibth0.a();
        }
        this.I(false);
        ftgg ftgg0 = ftgh.a(((ProtoLiteMessage)ftgg.a).v_newBuilder()).a();
        RowSecondary rowSecondary1 = this.c;
        RowSecondary rowSecondary2 = null;
        if(rowSecondary1 == null) {
            ibuq.j("personalizationWithinWalletToggleComponent");
            rowSecondary1 = null;
        }
        if(ibuq.m(rowSecondary0, rowSecondary1)) {
            ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)ftgg0).jf(5, null);
            hftp0.X(((ProtoLiteMessage)ftgg0));
            ftgi ftgi0 = ftgh.a(hftp0);
            RowSecondary rowSecondary3 = this.c;
            if(rowSecondary3 == null) {
                ibuq.j("personalizationWithinWalletToggleComponent");
            }
            else {
                rowSecondary2 = rowSecondary3;
            }
            ftgf ftgf0 = dxjf.a(rowSecondary2) ? ftgf.c : ftgf.d;
            ibuq.f(ftgf0, "value");
            ProtoLiteBuilder hftp1 = ftgi0.a;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ftgg ftgg1 = (ftgg)hftp1.b_message;
            ftgg1.o = ftgf0.a();
            ftgg1.b |= 0x1000;
            ftgg0 = ftgi0.a();
        }
        else {
            RowSecondary rowSecondary4 = this.d;
            if(rowSecondary4 == null) {
                ibuq.j("contextualSurfacingToggleComponent");
                rowSecondary4 = null;
            }
            if(ibuq.m(rowSecondary0, rowSecondary4)) {
                ProtoLiteBuilder hftp2 = (ProtoLiteBuilder)((ProtoLiteMessage)ftgg0).jf(5, null);
                hftp2.X(((ProtoLiteMessage)ftgg0));
                ftgi ftgi1 = ftgh.a(hftp2);
                RowSecondary rowSecondary5 = this.d;
                if(rowSecondary5 == null) {
                    ibuq.j("contextualSurfacingToggleComponent");
                }
                else {
                    rowSecondary2 = rowSecondary5;
                }
                ftgf ftgf1 = dxjf.a(rowSecondary2) ? ftgf.c : ftgf.d;
                ibuq.f(ftgf1, "value");
                ProtoLiteBuilder hftp3 = ftgi1.a;
                if(!hftp3.b_message.isImmutable()) {
                    hftp3.ensureMutable();
                }
                ftgg ftgg2 = (ftgg)hftp3.b_message;
                ftgg2.m = ftgf1.a();
                ftgg2.b |= 0x400;
                ftgg0 = ftgi1.a();
            }
            else {
                RowSecondary rowSecondary6 = this.ag;
                if(rowSecondary6 == null) {
                    ibuq.j("personalizedSurfacingToggleComponent");
                    rowSecondary6 = null;
                }
                if(ibuq.m(rowSecondary0, rowSecondary6)) {
                    ProtoLiteBuilder hftp4 = (ProtoLiteBuilder)((ProtoLiteMessage)ftgg0).jf(5, null);
                    hftp4.X(((ProtoLiteMessage)ftgg0));
                    ftgi ftgi2 = ftgh.a(hftp4);
                    RowSecondary rowSecondary7 = this.ag;
                    if(rowSecondary7 == null) {
                        ibuq.j("personalizedSurfacingToggleComponent");
                    }
                    else {
                        rowSecondary2 = rowSecondary7;
                    }
                    ftgf ftgf2 = dxjf.a(rowSecondary2) ? ftgf.c : ftgf.d;
                    ibuq.f(ftgf2, "value");
                    ProtoLiteBuilder hftp5 = ftgi2.a;
                    if(!hftp5.b_message.isImmutable()) {
                        hftp5.ensureMutable();
                    }
                    ftgg ftgg3 = (ftgg)hftp5.b_message;
                    ftgg3.n = ftgf2.a();
                    ftgg3.b |= 0x800;
                    ftgg0 = ftgi2.a();
                }
            }
        }
        ProtoLiteBuilder hftp6 = ((ProtoLiteMessage)grns.a).v_newBuilder();
        gqtz gqtz0 = gqtz.jR;
        if(!hftp6.b_message.isImmutable()) {
            hftp6.ensureMutable();
        }
        grns grns0 = (grns)hftp6.b_message;
        grns0.c = gqtz0.a();
        grns0.b |= 1;
        ProtoLiteBuilder hftp7 = ((ProtoLiteMessage)grnk.a).v_newBuilder();
        grjx grjx0 = (grjx)((ProtoLiteMessage)grjy.a).v_newBuilder();
        grjx0.k(v);
        grjx0.k(v1);
        if(!hftp7.b_message.isImmutable()) {
            hftp7.ensureMutable();
        }
        grnk grnk0 = (grnk)hftp7.b_message;
        grjy grjy0 = (grjy)((ProtoLiteBuilder)grjx0).N_build();
        grjy0.getClass();
        grnk0.j = grjy0;
        grnk0.b |= 0x200;
        if(!hftp6.b_message.isImmutable()) {
            hftp6.ensureMutable();
        }
        grns grns1 = (grns)hftp6.b_message;
        grnk grnk1 = (grnk)hftp7.N_build();
        grnk1.getClass();
        grns1.f = grnk1;
        grns1.b |= 8;
        ProtoLiteMessage hftv0 = hftp6.N_build();
        ibuq.e(hftv0, "build(...)");
        UpdateSettingsRequest updateSettingsRequest0 = new UpdateSettingsRequest();
        updateSettingsRequest0.a = this.y();
        updateSettingsRequest0.c = ftqe.a(((MessageLite)(((grns)hftv0))));
        updateSettingsRequest0.b = ftqe.a(((MessageLite)ftgg0));
        evql evql0 = this.N().bz(updateSettingsRequest0);
        evql0.z((/* MISSING LAMBDA PARAMETER */) -> {
            xob xob0 = this.ao();
            GetSettingsRequest getSettingsRequest0 = new GetSettingsRequest();
            getSettingsRequest0.a = this.y();
            getSettingsRequest0.b = ftqe.a(((MessageLite)ecfu.b()));
            FetchMode fetchMode0 = new FetchMode();
            fetchMode0.a = 1;
            getSettingsRequest0.c = fetchMode0;
            evql evql0 = this.N().aO(getSettingsRequest0);
            evql0.x(xob0, new dxjd(new dxjc(this)));
            evql0.u(xob0, new dxje(this));
        });
        evql0.A(new dxis(this, evqc0));
    }

    private final boolean P() {
        RowSecondary rowSecondary0 = this.d;
        if(rowSecondary0 == null) {
            ibuq.j("contextualSurfacingToggleComponent");
            rowSecondary0 = null;
        }
        return dxjf.a(rowSecondary0);
    }

    @Override  // dmqb
    public final void jP(DataChangeListenerResponse dataChangeListenerResponse0) {
        ibuq.f(dataChangeListenerResponse0, "response");
        int v = dataChangeListenerResponse0.a.a;
        if(v == 8) {
            this.H(1);
            return;
        }
        ((ggtj)this.b.j()).z("Received unknown listener type: %s", v);
    }

    @Override  // dokz
    public final void onAttach(Context context0) {
        ibuq.f(context0, "context");
        super.onAttach(context0);
        dolg dolg0 = this.ap();
        Preconditions.b(dolg0);
        edop edop0 = new edop();
        edlf edlf0 = new edlf();
        doma doma0 = new doma(this);
        domv domv0 = domu.a(AppContextProvider.a());
        Preconditions.b(domv0);
        this.L(new dxif(doma0, dolg0, edop0, edlf0, domv0));
        this.L(this.K());
        this.K().inject(this);
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        ibuq.f(layoutInflater0, "inflater");
        View view0 = layoutInflater0.inflate(0x7F0E0654, viewGroup0, false);  // layout:passes_privacy_controls_fragment
        this.av = view0;
        if(view0 == null) {
            ibuq.j("rootView");
            view0 = null;
        }
        this.aw = (ComposeViewHeader)view0.findViewById(0x7F0B0995);  // id:ViewHeader
        int v = 8;
        if(hwev.c()) {
            ComposeViewHeader composeViewHeader0 = this.aw;
            if(composeViewHeader0 == null) {
                ibuq.j("viewHeader");
                composeViewHeader0 = null;
            }
            ComposeViewHeader composeViewHeader1 = this.aw;
            if(composeViewHeader1 == null) {
                ibuq.j("viewHeader");
                composeViewHeader1 = null;
            }
            fuho fuho0 = composeViewHeader1.a();
            ibuq.d(fuho0, "null cannot be cast to non-null type com.google.android.libraries.tapandpay.ui.compose.viewheader.ViewHeaderState.Default");
            composeViewHeader0.b(fuhm.a(((fuhm)fuho0), null, null, 6));
            View view1 = this.av;
            if(view1 == null) {
                ibuq.j("rootView");
                view1 = null;
            }
            view1.findViewById(0x7F0B0368).setVisibility(8);  // id:Divider
        }
        View view2 = this.av;
        if(view2 == null) {
            ibuq.j("rootView");
            view2 = null;
        }
        this.d = (RowSecondary)view2.findViewById(0x7F0B022C);  // id:ContextualSurfacingToggleComponent
        View view3 = this.av;
        if(view3 == null) {
            ibuq.j("rootView");
            view3 = null;
        }
        this.ag = (RowSecondary)view3.findViewById(0x7F0B0679);  // id:PersonalizedSurfacingToggleComponent
        View view4 = this.av;
        if(view4 == null) {
            ibuq.j("rootView");
            view4 = null;
        }
        this.c = (RowSecondary)view4.findViewById(0x7F0B0678);  // id:PersonalizationWithinWalletToggleComponent
        View view5 = this.av;
        if(view5 == null) {
            ibuq.j("rootView");
            view5 = null;
        }
        this.ah = view5.findViewById(0x7F0B05FC);  // id:NotUsedInfoButton
        View view6 = this.av;
        if(view6 == null) {
            ibuq.j("rootView");
            view6 = null;
        }
        View view7 = view6.findViewById(0x7F0B0482);  // id:HiddenViewLayout
        this.ar = view7;
        if(view7 == null) {
            ibuq.j("hiddenViewLayout");
            view7 = null;
        }
        if(this.P()) {
            v = 0;
        }
        view7.setVisibility(v);
        View view8 = this.av;
        if(view8 == null) {
            ibuq.j("rootView");
            view8 = null;
        }
        this.ai = view8.findViewById(0x7F0B0646);  // id:PassListTitleBar
        View view9 = this.av;
        if(view9 == null) {
            ibuq.j("rootView");
            view9 = null;
        }
        this.ax = (RecyclerView)view9.findViewById(0x7F0B0641);  // id:PassList
        dxkh dxkh0 = this.z();
        dxkh0.g = new dxio(this);
        RecyclerView recyclerView0 = this.ax;
        if(recyclerView0 == null) {
            ibuq.j("restrictedPassList");
            recyclerView0 = null;
        }
        recyclerView0.an(this.z());
        dxkp dxkp0 = this.an;
        if(dxkp0 == null) {
            ibuq.j("restrictedPassListDataSource");
            dxkp0 = null;
        }
        dxkp0.g(this, new dxjj(new dxjh(this)));
        View view10 = this.av;
        if(view10 == null) {
            ibuq.j("rootView");
            view10 = null;
        }
        ((Toolbar)view10.findViewById(0x7F0B08D8)).x(new dxip(this));  // id:Toolbar
        View view11 = LayoutInflater.from(this.requireContext()).inflate(0x7F0E0C12, viewGroup0, false);  // layout:unused_passes_info_tooltip
        ibuq.e(view11, "inflate(...)");
        view11.measure(0, 0);
        PopupWindow popupWindow0 = new PopupWindow(view11, -2, view11.getMeasuredHeight(), true);
        popupWindow0.setElevation(((float)edkx.a(this.requireContext(), 6)));
        View view12 = view11.findViewById(0x7F0B0692);  // id:PopupText
        ibuq.e(view12, "findViewById(...)");
        DisplayMetrics displayMetrics0 = this.requireContext().getResources().getDisplayMetrics();
        int v1 = ibwt.h(displayMetrics0.widthPixels, displayMetrics0.heightPixels);
        int v2 = ibwt.h(((TextView)view12).getMaxWidth(), v1);
        Drawable drawable0 = this.requireContext().getDrawable(0x7F080BA0);
        if(drawable0 == null) {
            throw new IllegalStateException("Info icon drawable not found");
        }
        int v3 = drawable0.getIntrinsicHeight();
        View view13 = this.ah;
        if(view13 == null) {
            ibuq.j("infoButton");
            view13 = null;
        }
        float f = (float)view13.getLayoutParams().height;
        View view14 = this.ah;
        if(view14 == null) {
            ibuq.j("infoButton");
            view14 = null;
        }
        view14.setOnClickListener(new dxit(popupWindow0, this, -v2, -((int)((f - ((float)v3)) / 2.0f))));
        this.I(false);
        hwwq hwwq0 = hwwq.a;
        String s = this.getString(0x7F15243B, new Object[]{hwwq0.d().h()});  // string:pay_wallet_personalization_control_description "Get helpful tips, suggestions, 
                                                                             // and more in Wallet based on your passes and how you use them. This data will be 
                                                                             // saved to your Google Account and can be removed at any time. <a href=%1$s>Learn 
                                                                             // how personalization works</a>"
        ibuq.e(s, "getString(...)");
        SpannableString spannableString0 = ftrm.d(s, true, new dxin());
        RowSecondary rowSecondary0 = this.c;
        if(rowSecondary0 == null) {
            ibuq.j("personalizationWithinWalletToggleComponent");
            rowSecondary0 = null;
        }
        rowSecondary0.h(new fuat(new fryr(0x7F15243C), new fryt(spannableString0), null, new fubx(false, new dxiw(this)), 0, null, new dxix(this), null, null, false, false, hwev.c(), fule.b, false, 10164));  // string:pay_wallet_personalization_control_title "Personalization within Wallet"
        RowSecondary rowSecondary1 = this.c;
        if(rowSecondary1 == null) {
            ibuq.j("personalizationWithinWalletToggleComponent");
            rowSecondary1 = null;
        }
        rowSecondary1.setVisibility(0);
        String s1 = this.getString(0x7F1523A6, new Object[]{hwwq0.d().e()});  // string:pay_wallet_contextual_surfacing_description_v2 "See things like flight updates, 
                                                                              // point balances, and event notifications in places like Maps, Calendar, Assistant, 
                                                                              // and more. <a href=%1$s>Learn how passes work</a>"
        ibuq.e(s1, "getString(...)");
        SpannableString spannableString1 = ftrm.f(s1, true);
        RowSecondary rowSecondary2 = this.d;
        if(rowSecondary2 == null) {
            ibuq.j("contextualSurfacingToggleComponent");
            rowSecondary2 = null;
        }
        rowSecondary2.h(new fuat(new fryr(0x7F1523A7), new fryt(spannableString1), null, new fubx(false, new dxiy(this)), 0, null, new dxiz(this), null, null, false, false, hwev.c(), fule.c, false, 10164));  // string:pay_wallet_contextual_surfacing_title "Use passes across Google"
        RowSecondary rowSecondary3 = this.d;
        if(rowSecondary3 == null) {
            ibuq.j("contextualSurfacingToggleComponent");
            rowSecondary3 = null;
        }
        rowSecondary3.setVisibility(0);
        String s2 = this.getString(0x7F15243E, new Object[]{hwwq0.d().i()});  // string:pay_wallet_personalized_surfacing_description_v2 "Get better recommendations, 
                                                                              // results, and more based on your passes and how you use them in places like Maps, 
                                                                              // Calendar, Assistant, and more. <a href=%1$s>Learn how personalization works</a>"
        ibuq.e(s2, "getString(...)");
        SpannableString spannableString2 = ftrm.f(s2, true);
        RowSecondary rowSecondary4 = this.ag;
        if(rowSecondary4 == null) {
            ibuq.j("personalizedSurfacingToggleComponent");
            rowSecondary4 = null;
        }
        rowSecondary4.h(new fuat(new fryr(0x7F15243F), new fryt(spannableString2), null, new fubx(false, new dxja(this)), 0, null, new dxjb(this), null, null, false, false, hwev.c(), fule.d, false, 10164));  // string:pay_wallet_personalized_surfacing_title "Personalization across Google"
        RowSecondary rowSecondary5 = this.ag;
        if(rowSecondary5 == null) {
            ibuq.j("personalizedSurfacingToggleComponent");
            rowSecondary5 = null;
        }
        rowSecondary5.setVisibility(0);
        View view15 = this.av;
        if(view15 == null) {
            ibuq.j("rootView");
            view15 = null;
        }
        View view16 = view15.findViewById(0x7F0B07A9);  // id:ScrollView
        fuok fuok0 = this.ap;
        if(fuok0 == null) {
            ibuq.j("edgeToEdgeStyler");
            fuok0 = null;
        }
        ibuq.c(view16);
        fuop.h(fuok0, view16);
        View view17 = this.av;
        if(view17 == null) {
            ibuq.j("rootView");
            view17 = null;
        }
        TextView textView0 = (TextView)view17.findViewById(0x7F0B05FD);  // id:NotUsedTitle
        if(hwev.c()) {
            Context context0 = textView0.getContext();
            ibuq.e(context0, "getContext(...)");
            textView0.setTextAppearance(edpl.a(context0, 0x7F040D00));  // attr:textAppearanceLabelLargeEmphasized
        }
        fhwk fhwk0 = this.A();
        View view18 = this.av;
        if(view18 == null) {
            ibuq.j("rootView");
            view18 = null;
        }
        fhwk0.f(view18, this.A().a.a(214041));
        View view19 = this.av;
        if(view19 == null) {
            ibuq.j("rootView");
            return null;
        }
        return view19;
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
    public final void onPause() {
        super.onPause();
        this.N().bE(8, this.au);
    }

    @Override  // du
    public final void onResume() {
        super.onResume();
        this.I(false);
        this.H(3);
        this.N().bC(this.y(), 8, this.au);
    }

    @Override  // du
    public final void onStart() {
        super.onStart();
        dmgi dmgi0 = this.al;
        if(dmgi0 == null) {
            ibuq.j("clearcutEventLogger");
            dmgi0 = null;
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hapr.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hana.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((hana)hftp1.b_message).b = "MANAGE_PASSES_DATA";
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

    public final Account y() {
        Account account0 = this.ak;
        if(account0 != null) {
            return account0;
        }
        ibuq.j("account");
        return null;
    }

    public final dxkh z() {
        dxkh dxkh0 = this.aj;
        if(dxkh0 != null) {
            return dxkh0;
        }
        ibuq.j("restrictedPassListAdapter");
        return null;
    }
}

