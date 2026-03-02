import android.accounts.Account;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.pay.fops.details.FopDetailsFragment;
import com.google.android.libraries.tapandpay.ui.rowsecondary.RowSecondary;
import com.google.android.libraries.tapandpay.ui.rowsecondary.expand.RowSecondaryExpand;
import com.google.android.libraries.tapandpay.ui.rowsecondary.icon.RowSecondaryIcon;
import com.google.android.libraries.tapandpay.ui.rowsecondary.toggle.RowSecondaryToggle;
import com.google.android.libraries.tapandpay.ui.viewheader.ComposeViewHeader;
import com.google.android.libraries.tapandpay.ui.viewheader.ViewHeader;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class dnjs extends tk {
    private static final int A;
    private static final int B;
    private static final int C;
    private static final int D;
    private static final int E;
    private static final int F;
    private static final int G;
    private final dmet H;
    private final tyb I;
    private final fuot J;
    public static final bboh a;
    public final du e;
    public final dmhi f;
    public final dmsn g;
    public final dmkl h;
    public final dnpp i;
    public final efma j;
    public final dmtl k;
    public final Account l;
    public final edoq m;
    public final edrk n;
    public final boolean o;
    public dxev p;
    public boolean q;
    public String r;
    public String s;
    public boolean t;
    public boolean u;
    public final dnfp v;
    public final List w;
    public final ArrayList x;
    public final etgl y;
    private static final int z;

    static {
        dnjs.a = bboh.b("Pay", bbcu.cZ);
        dnjs.z = ((ghfw)ghgf.e().d("FopDetailsItemExpand")).a;
        dnjs.A = ((ghfw)ghgf.e().d("FopDetailsItemLink")).a;
        dnjs.B = ((ghfw)ghgf.e().d("FopDetailsItemToggle")).a;
        dnjs.C = ((ghfw)ghgf.e().d("FopDetailsItemDisclaimer")).a;
        dnjs.D = ((ghfw)ghgf.e().d("FopDetailsItemIcon")).a;
        dnjs.E = ((ghfw)ghgf.e().d("FopDetailsDivider")).a;
        dnjs.F = ((ghfw)ghgf.e().d("FopDetailActionsHeader")).a;
        dnjs.G = ((ghfw)ghgf.e().d("FopDetailsItemSegmentedToggle")).a;
    }

    public dnjs(du du0, dmhi dmhi0, dmsn dmsn0, dmkl dmkl0, dmet dmet0, tyb tyb0, dnpp dnpp0, efma efma0, etgl etgl0, dmtl dmtl0, fuot fuot0, Account account0, edoq edoq0, edrk edrk0, boolean z) {
        ibuq.f(edrk0, "qrPaymentEligibility");
        super();
        this.e = du0;
        this.f = dmhi0;
        this.g = dmsn0;
        this.h = dmkl0;
        this.H = dmet0;
        this.I = tyb0;
        this.i = dnpp0;
        this.j = efma0;
        this.y = etgl0;
        this.k = dmtl0;
        this.J = fuot0;
        this.l = account0;
        this.m = edoq0;
        this.n = edrk0;
        this.o = z;
        dnfo dnfo0 = new dnfo();
        dnfo0.a = "";
        dnfo0.b = gfsx.m(Boolean.valueOf(true));
        this.v = dnfo0.a();
        this.w = new ArrayList();
        this.x = new ArrayList();
    }

    public final void G(hami hami0, dxev dxev0) {
        hkhr hkhr0 = dxev0.c == null ? hkhr.b : dxev0.c;
        hkhh hkhh0 = hkhr0.q == null ? hkhh.a : hkhr0.q;
        hkir hkir0 = hkhh0.g == null ? hkir.a : hkhh0.g;
        hktu hktu0 = hktu.b(hkir0.f) == null ? hktu.D : hktu.b(hkir0.f);
        this.i.e(hami0, hktu0);
    }

    public final void H(String s, String s1) {
        this.y.cS(s).b(new dnjg(new dnjf(this, s1)));
    }

    public final boolean I(dxev dxev0) {
        if(hwgw.d() && hwgw.c()) {
            hkhr hkhr0 = dxev0.c == null ? hkhr.b : dxev0.c;
            hkhh hkhh0 = hkhr0.q == null ? hkhh.a : hkhr0.q;
            return ((hkhh0.g == null ? hkir.a : hkhh0.g).b & 2) != 0 && this.t;
        }
        return false;
    }

    public static final boolean J(dxev dxev0) {
        hwjv.e();
        if(hwjv.a.b().b()) {
            hkhr hkhr0 = dxev0.c == null ? hkhr.b : dxev0.c;
            return (hkhm.b(hkhr0.f) == null ? hkhm.k : hkhm.b(hkhr0.f)) == hkhm.g;
        }
        return false;
    }

    public static final void K(MaterialButtonToggleGroup materialButtonToggleGroup0) {
        int v = materialButtonToggleGroup0.getChildCount();
        for(int v1 = 0; v1 < v; ++v1) {
            View view0 = materialButtonToggleGroup0.getChildAt(v1);
            ibuq.d(view0, "null cannot be cast to non-null type com.google.android.material.button.MaterialButton");
            MaterialButton materialButton0 = (MaterialButton)view0;
            if(materialButton0.n) {
                materialButton0.v(0x7F080B1B);  // drawable:quantum_gm_ic_check_vd_theme_24
            }
            else {
                materialButton0.u(null);
            }
        }
    }

    private final dnfp L(int v) {
        if(v > 0 && v < this.b()) {
            return (dnfp)this.w.get(v - 1);
        }
        dnfo dnfo0 = new dnfo();
        dnfo0.a = "";
        return dnfo0.a();
    }

    private final fule M(int v) {
        boolean z = ibuq.m(this.L(v - 1), this.v);
        boolean z1 = ibuq.m(this.L(v + 1), this.v);
        if(v == 1) {
            return z1 ? fule.a : fule.b;
        }
        if(v == this.b() - 1) {
            return z ? fule.a : fule.d;
        }
        if(z) {
            return fule.b;
        }
        return z1 ? fule.d : fule.c;
    }

    private final void N(View view0) {
        int v = view0.getResources().getDimensionPixelSize(0x7F070698);  // dimen:fop_details_horizontal_spacing
        int v1 = view0.getResources().getDimensionPixelSize(0x7F070699);  // dimen:fop_details_item_vertical_spacing
        int v2 = view0.getResources().getDimensionPixelSize(0x7F07069B);  // dimen:fop_details_view_header_bottom_spacing
        Integer integer0 = v;
        if(!this.Q() && !hwev.c()) {
            v1 = 1;
        }
        Integer integer1 = v1;
        if(!this.Q()) {
            v2 = 0;
        }
        funy.c(view0, integer0, integer1, integer0, Integer.valueOf(v2));
        view0.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
    }

    private final void O(MaterialButtonToggleGroup materialButtonToggleGroup0, String s, String s1) {
        String s2 = this.s;
        if(ibuq.m(s2, s)) {
            materialButtonToggleGroup0.k(0x7F0B1D06);  // id:primary
        }
        else if(ibuq.m(s2, s1)) {
            materialButtonToggleGroup0.k(0x7F0B0C2F);  // id:auxiliary
        }
        else {
            materialButtonToggleGroup0.k(0x7F0B0C15);  // id:auto
        }
        dnjs.K(materialButtonToggleGroup0);
    }

    private final void P(View view0, String s, String s1, CharSequence charSequence0, MaterialButtonToggleGroup materialButtonToggleGroup0) {
        view0.setOnClickListener(new dnjd(this, s, s1, materialButtonToggleGroup0, charSequence0));
    }

    private final boolean Q() {
        return this.J.a.a == fuor.b;
    }

    private static final void R(RowSecondary rowSecondary0) {
        Integer integer0 = rowSecondary0.getContext().getResources().getDimensionPixelSize(0x7F070698);  // dimen:fop_details_horizontal_spacing
        funy.c(rowSecondary0, integer0, Integer.valueOf(0), integer0, Integer.valueOf(rowSecondary0.getContext().getResources().getDimensionPixelSize(0x7F07069A)));  // dimen:fop_details_item_vertical_spacing_bc25
        rowSecondary0.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
    }

    private static final void S(fuml fuml0) {
        Integer integer0 = fuml0.getContext().getResources().getDimensionPixelSize(0x7F070698);  // dimen:fop_details_horizontal_spacing
        Integer integer1 = fuml0.getContext().getResources().getDimensionPixelSize(0x7F070699);  // dimen:fop_details_item_vertical_spacing
        funy.c(fuml0, integer0, integer1, integer0, integer1);
        fuml0.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
    }

    private static final void T(fuml fuml0, dnfp dnfp0) {
        ibuq.e(dnfp0.e, "getPrimaryText(...)");
        fuml0.o(dnfp0.e);
        String s = (String)dnfp0.f.f("");
        String s1 = (String)dnfp0.h.f("");
        if(!dnfp0.q.i() && !dnfp0.t.i()) {
            fuml0.setOnClickListener(((View.OnClickListener)dnfp0.s.g()));
        }
        String s2 = edkt.a(s);
        String s3 = edkt.a(s1);
        if(s3.length() != 0) {
            s2 = a.r(s3, s2, "\n");
        }
        if(s1.length() != 0) {
            s = a.r(s1, s, "\n");
        }
        fuml0.n(s, s2);
    }

    @Override  // tk
    public final int b() {
        return this.w.size() + 1;
    }

    @Override  // tk
    public final int dx(int v) {
        dnfp dnfp0 = this.L(v);
        if(v == 0) {
            return dnjs.F;
        }
        if(((Boolean)dnfp0.o.f(Boolean.valueOf(false))).booleanValue()) {
            return dnjs.E;
        }
        if(dnfp0.j.i()) {
            return dnjs.z;
        }
        if(!dnfp0.t.i() && !dnfp0.q.i()) {
            if(dnfp0.r.i()) {
                return dnjs.B;
            }
            if(dnfp0.u.i()) {
                return dnjs.C;
            }
            return !dnfp0.m.i() || !dnfp0.n.i() ? dnjs.D : dnjs.G;
        }
        return dnjs.A;
    }

    @Override  // tk
    public final long dy(int v) {
        if(v == 0) {
            return (long)Arrays.hashCode(new Object[]{((int)0), "", "", "", "", 0});
        }
        dnfp dnfp0 = (dnfp)this.w.get(v - 1);
        return (long)Arrays.hashCode(new Object[]{dnfp0.a, dnfp0.b, dnfp0.e, dnfp0.f, dnfp0.h, dnfp0.q, dnfp0.s});
    }

    @Override  // tk
    public final uq dz(ViewGroup viewGroup0, int v) {
        int v1 = 0;
        LayoutInflater layoutInflater0 = LayoutInflater.from(viewGroup0.getContext());
        if(v == dnjs.F) {
            if(hwev.c()) {
                Context context0 = viewGroup0.getContext();
                ibuq.e(context0, "getContext(...)");
                ComposeViewHeader composeViewHeader0 = new ComposeViewHeader(context0, null, 2, null);
                this.N(composeViewHeader0);
                return new dnji(composeViewHeader0);
            }
            Context context1 = viewGroup0.getContext();
            ibuq.e(context1, "getContext(...)");
            ViewHeader viewHeader0 = new ViewHeader(context1, null, 0, 6, null);
            this.N(viewHeader0);
            return new dnjo(viewHeader0);
        }
        if(v == dnjs.E) {
            View view0 = new View(viewGroup0.getContext());
            int v2 = view0.getResources().getDimensionPixelSize(0x7F070698);  // dimen:fop_details_horizontal_spacing
            int v3 = view0.getResources().getDimensionPixelSize(0x7F070697);  // dimen:fop_details_divider_vertical_spacing
            ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0 = new ViewGroup.MarginLayoutParams(-1, view0.getResources().getDimensionPixelSize(0x7F070696));  // dimen:fop_details_divider_height
            viewGroup$MarginLayoutParams0.setMarginStart(v2);
            viewGroup$MarginLayoutParams0.topMargin = v3;
            viewGroup$MarginLayoutParams0.setMarginEnd(v2);
            viewGroup$MarginLayoutParams0.bottomMargin = v3;
            view0.setLayoutParams(viewGroup$MarginLayoutParams0);
            view0.setBackgroundColor(fipx.a(view0.getContext(), 0x7F040345));  // attr:colorSurfaceVariant
            if(hwev.c()) {
                v1 = 4;
            }
            view0.setVisibility(v1);
            return new uq(view0);
        }
        if(v == dnjs.z) {
            if(hwev.c()) {
                Context context2 = viewGroup0.getContext();
                ibuq.e(context2, "getContext(...)");
                RowSecondary rowSecondary0 = new RowSecondary(context2, null, 2, null);
                dnjs.R(rowSecondary0);
                return new dnjj(rowSecondary0);
            }
            Context context3 = viewGroup0.getContext();
            ibuq.e(context3, "getContext(...)");
            RowSecondaryExpand rowSecondaryExpand0 = new RowSecondaryExpand(context3, null, 0, 6, null);
            dnjs.S(rowSecondaryExpand0);
            return new dnjk(rowSecondaryExpand0);
        }
        if(v == dnjs.A) {
            if(hwev.c()) {
                Context context4 = viewGroup0.getContext();
                ibuq.e(context4, "getContext(...)");
                RowSecondary rowSecondary1 = new RowSecondary(context4, null, 2, null);
                dnjs.R(rowSecondary1);
                return new dnjj(rowSecondary1);
            }
            Context context5 = viewGroup0.getContext();
            ibuq.e(context5, "getContext(...)");
            fums fums0 = new fums(context5);
            dnjs.S(fums0);
            return new dnjk(fums0);
        }
        if(v == dnjs.B) {
            if(hwev.c()) {
                Context context6 = viewGroup0.getContext();
                ibuq.e(context6, "getContext(...)");
                RowSecondary rowSecondary2 = new RowSecondary(context6, null, 2, null);
                dnjs.R(rowSecondary2);
                return new dnjj(rowSecondary2);
            }
            Context context7 = viewGroup0.getContext();
            ibuq.e(context7, "getContext(...)");
            RowSecondaryToggle rowSecondaryToggle0 = new RowSecondaryToggle(context7, null, 0, 6, null);
            dnjs.S(rowSecondaryToggle0);
            return new dnjk(rowSecondaryToggle0);
        }
        if(v == dnjs.C) {
            View view1 = layoutInflater0.inflate(0x7F0E0404, viewGroup0, false);  // layout:fop_disclaimer_text
            ibuq.d(view1, "null cannot be cast to non-null type android.widget.TextView");
            return new dnjn(((TextView)view1));
        }
        if(v == dnjs.G) {
            if(hwev.c()) {
                Context context8 = viewGroup0.getContext();
                ibuq.e(context8, "getContext(...)");
                dnkt dnkt0 = new dnkt(context8);
                Integer integer0 = dnkt0.getContext().getResources().getDimensionPixelSize(0x7F070698);  // dimen:fop_details_horizontal_spacing
                funy.c(dnkt0, integer0, Integer.valueOf(0), integer0, Integer.valueOf(dnkt0.getContext().getResources().getDimensionPixelSize(0x7F07069A)));  // dimen:fop_details_item_vertical_spacing_bc25
                dnkt0.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                return new dnjm(dnkt0);
            }
            View view2 = layoutInflater0.inflate(0x7F0E06D7, viewGroup0, false);  // layout:pay_fop_detail_segmented_toggle
            ibuq.d(view2, "null cannot be cast to non-null type android.view.ViewGroup");
            return new dnjl(((ViewGroup)view2));
        }
        if(hwev.c()) {
            Context context9 = viewGroup0.getContext();
            ibuq.e(context9, "getContext(...)");
            RowSecondary rowSecondary3 = new RowSecondary(context9, null, 2, null);
            dnjs.R(rowSecondary3);
            return new dnjj(rowSecondary3);
        }
        Context context10 = viewGroup0.getContext();
        ibuq.e(context10, "getContext(...)");
        RowSecondaryIcon rowSecondaryIcon0 = new RowSecondaryIcon(context10, null, 0, 6, null);
        dnjs.S(rowSecondaryIcon0);
        return new dnjk(rowSecondaryIcon0);
    }

    public final int f() {
        return fipx.a(this.e.requireContext(), 0x7F0402FC);  // attr:colorOnSurfaceVariant
    }

    @Override  // tk
    public final void h(uq uq0, int v) {
        String s21;
        String s19;
        hkir hkir1;
        fuaz fuaz3;
        String s14;
        String s12;
        hkir hkir0;
        fubv fubv0;
        fuaz fuaz2;
        fuaz fuaz0;
        fuat fuat0;
        boolean z;
        fugv fugv0;
        String s5;
        String s4;
        String s2;
        String s1;
        ColorStateList colorStateList0 = null;
        ibuq.f(uq0, "viewHolder");
        dnfp dnfp0 = this.L(v);
        Boolean boolean0 = Boolean.valueOf(false);
        String s = "";
        if((uq0 instanceof dnjo)) {
            if(this.Q()) {
                ViewHeader viewHeader0 = ((dnjo)uq0).t;
                dxev dxev0 = this.p;
                if(dxev0 == null) {
                    s1 = "";
                }
                else {
                    hkhr hkhr0 = dxev0.c == null ? hkhr.b : dxev0.c;
                    if(hkhr0 == null) {
                        s1 = "";
                    }
                    else {
                        s1 = hkhr0.h;
                        if(s1 == null) {
                            s1 = "";
                        }
                    }
                }
                viewHeader0.j(s1);
                View view0 = uq0.a;
                dxev dxev1 = this.p;
                if(dxev1 == null) {
                    s2 = "";
                }
                else {
                    hkhr hkhr1 = dxev1.c == null ? hkhr.b : dxev1.c;
                    if(hkhr1 == null) {
                        s2 = "";
                    }
                    else {
                        s2 = hkhr1.h;
                        if(s2 == null) {
                            s2 = "";
                        }
                    }
                }
                view0.setContentDescription(edkt.a(s2));
            }
            else {
                ((dnjo)uq0).t.g();
            }
            ViewHeader viewHeader1 = ((dnjo)uq0).t;
            dxev dxev2 = this.p;
            if(dxev2 != null) {
                hkhr hkhr2 = dxev2.c == null ? hkhr.b : dxev2.c;
                if(hkhr2 != null) {
                    String s3 = hkhr2.j;
                    if(s3 != null) {
                        s = s3;
                    }
                }
            }
            viewHeader1.i(s);
            if(this.Q()) {
                dxev dxev3 = this.p;
                ImageView imageView0 = viewHeader1.h;
                if(dxev3 != null && imageView0 != null) {
                    hkhr hkhr3 = dxev3.c == null ? hkhr.b : dxev3.c;
                    ibuq.e(hkhr3, "getPaymentMethod(...)");
                    dmew dmew0 = dmev.d(dxev3);
                    if((dxev3.b & 8) == 0) {
                        if(dmew0 == null) {
                            new dnjp(((txx)this.I.h(hkhr3.l).s(udf.a))).a(imageView0);
                        }
                        else {
                            this.H.e(dmew0, imageView0);
                        }
                        imageView0.setVisibility(0);
                    }
                }
            }
        }
        else {
            if((uq0 instanceof dnji)) {
                dxev dxev4 = this.p;
                if(dxev4 == null) {
                    s4 = null;
                }
                else {
                    hkhr hkhr4 = dxev4.c == null ? hkhr.b : dxev4.c;
                    s4 = hkhr4 == null ? null : hkhr4.j;
                }
                fuhm fuhm0 = new fuhm(null, new fryu(""), (s4 == null || s4.length() <= 0 ? null : new fryu(s4)), 1);
                if(this.Q()) {
                    dxev dxev5 = this.p;
                    if(dxev5 == null) {
                        s5 = "";
                    }
                    else {
                        hkhr hkhr5 = dxev5.c == null ? hkhr.b : dxev5.c;
                        if(hkhr5 == null) {
                            s5 = "";
                        }
                        else {
                            s5 = hkhr5.h;
                            if(s5 == null) {
                                s5 = "";
                            }
                        }
                    }
                    fuhm fuhm1 = fuhm.a(fuhm0, null, new fryu(s5), 5);
                    View view1 = uq0.a;
                    dxev dxev6 = this.p;
                    if(dxev6 != null) {
                        hkhr hkhr6 = dxev6.c == null ? hkhr.b : dxev6.c;
                        if(hkhr6 != null) {
                            String s6 = hkhr6.h;
                            if(s6 != null) {
                                s = s6;
                            }
                        }
                    }
                    view1.setContentDescription(edkt.a(s));
                    dxev dxev7 = this.p;
                    if(dxev7 == null) {
                        fugv0 = null;
                    }
                    else {
                        dmew dmew1 = dmev.d(dxev7);
                        if((dxev7.b & 8) == 0 && dmew1 != null) {
                            fsan fsan0 = dmex.b(dmew1);
                            fugv0 = new fugr(this.H.i(fsan0));
                        }
                        else {
                            fugv0 = null;
                        }
                    }
                    fuhm0 = fuhm.a(fuhm1, fugv0, null, 6);
                }
                ((dnji)uq0).t.b(fuhm0);
                return;
            }
            if((uq0 instanceof dnjk)) {
                fuml fuml0 = ((dnjk)uq0).t;
                if((fuml0 instanceof RowSecondaryExpand)) {
                    dnjs.T(((RowSecondaryExpand)fuml0), dnfp0);
                    gfsx gfsx0 = dnfp0.a;
                    if(gfsx0.i()) {
                        int v1 = ((Number)gfsx0.d()).intValue();
                        ((RowSecondaryExpand)fuml0).h.setVisibility(0);
                        ((RowSecondaryExpand)fuml0).h.setImageResource(v1);
                    }
                    ((RowSecondaryExpand)fuml0).r(((CharSequence)dnfp0.j.f("")));
                    return;
                }
                if((fuml0 instanceof fums)) {
                    dnjs.T(((fums)fuml0), dnfp0);
                    gfsx gfsx1 = dnfp0.s;
                    if(gfsx1.i()) {
                        gfsx gfsx2 = dnfp0.t;
                        if(gfsx2.i() || dnfp0.q.i()) {
                            CharSequence charSequence0 = (CharSequence)gfsx2.f(dnfp0.q.f(""));
                            Object object0 = gfsx1.d();
                            Integer integer0 = (int)0;
                            funy.b(((fums)fuml0).k, integer0, integer0, integer0, integer0);
                            GradientDrawable gradientDrawable0 = new GradientDrawable();
                            gradientDrawable0.setStroke(0, 0);
                            gradientDrawable0.setCornerRadius(0.0f);
                            ((fums)fuml0).k.setBackground(gradientDrawable0);
                            ((fums)fuml0).k.setTextAppearance(0x7F160AE4);  // style:TextAppearance.GoogleMaterial3.LabelLarge
                            int v2 = fipx.a(((fums)fuml0).k.getContext(), 0x7F040312);  // attr:colorPrimaryGoogle
                            ((fums)fuml0).k.setTextColor(v2);
                            funx.d(((fums)fuml0).k, charSequence0);
                            ((fums)fuml0).setOnClickListener(((View.OnClickListener)object0));
                        }
                    }
                    gfsx gfsx3 = dnfp0.a;
                    if(gfsx3.i()) {
                        int v3 = ((Number)gfsx3.d()).intValue();
                        Drawable drawable0 = ((fums)fuml0).getContext().getResources().getDrawable(v3, ((fums)fuml0).getContext().getTheme());
                        ibuq.e(drawable0, "getDrawable(...)");
                        ((fums)fuml0).q(drawable0);
                        Integer integer1 = (Integer)dnfp0.c.g();
                        if(integer1 != null) {
                            int v4 = integer1.intValue();
                            ((fums)fuml0).g().u(v4);
                        }
                    }
                    else {
                        gfsx gfsx4 = dnfp0.b;
                        if(gfsx4.i()) {
                            String s7 = (String)gfsx4.d();
                            ((txx)this.I.h(s7).s(udf.a)).p(((fums)fuml0).g());
                            ((fums)fuml0).h.setVisibility(0);
                            fsda fsda0 = (fsda)((fums)fuml0).g();
                            ImageView imageView1 = fsda0.b;
                            if(imageView1.getDrawable() == null) {
                                ((ggsc)fsda0.e.j().ar(18970)).x("ImageViewPassthroughViewTarget: clearTint invoked on null drawable; skipping.");
                                return;
                            }
                            imageView1.getDrawable().setColorFilter(null);
                        }
                    }
                }
                else {
                    if((fuml0 instanceof RowSecondaryToggle)) {
                        dnjs.T(((RowSecondaryToggle)fuml0), dnfp0);
                        gfsx gfsx5 = dnfp0.a;
                        if(gfsx5.i()) {
                            int v5 = ((Number)gfsx5.d()).intValue();
                            Drawable drawable1 = ((RowSecondaryToggle)fuml0).getContext().getResources().getDrawable(v5, ((RowSecondaryToggle)fuml0).getContext().getTheme());
                            ibuq.e(drawable1, "getDrawable(...)");
                            ((RowSecondaryToggle)fuml0).q(drawable1);
                        }
                        ((RowSecondaryToggle)fuml0).s(((Boolean)dnfp0.r.f(boolean0)).booleanValue());
                        return;
                    }
                    if((fuml0 instanceof RowSecondaryIcon)) {
                        dnjs.T(((RowSecondaryIcon)fuml0), dnfp0);
                        gfsx gfsx6 = dnfp0.a;
                        if(gfsx6.i() && ((int)(((Integer)gfsx6.d()))) != 0) {
                            ((RowSecondaryIcon)fuml0).r(((Number)gfsx6.d()).intValue());
                            Integer integer2 = (Integer)dnfp0.c.g();
                            ColorStateList colorStateList1 = integer2 == null ? null : ColorStateList.valueOf(integer2.intValue());
                            ((RowSecondaryIcon)fuml0).h.setImageTintList(colorStateList1);
                        }
                        else {
                            gfsx gfsx7 = dnfp0.b;
                            if(gfsx7.i()) {
                                String s8 = (String)gfsx7.d();
                                ((txx)this.I.h(s8).s(udf.a)).k(((RowSecondaryIcon)fuml0).h);
                                ((RowSecondaryIcon)fuml0).h.setVisibility(0);
                                ((RowSecondaryIcon)fuml0).h.setImageTintList(null);
                            }
                        }
                        gfsx gfsx8 = dnfp0.k;
                        if(gfsx8.i()) {
                            int v6 = ((Number)gfsx8.d()).intValue();
                            Drawable drawable2 = ((RowSecondaryIcon)fuml0).getContext().getResources().getDrawable(v6, ((RowSecondaryIcon)fuml0).getContext().getTheme());
                            ibuq.e(drawable2, "getDrawable(...)");
                            ((RowSecondaryIcon)fuml0).q(drawable2);
                            ImageView imageView2 = ((RowSecondaryIcon)fuml0).k;
                            Integer integer3 = (Integer)dnfp0.l.g();
                            if(integer3 != null) {
                                colorStateList0 = ColorStateList.valueOf(integer3.intValue());
                            }
                            imageView2.setImageTintList(colorStateList0);
                        }
                    }
                }
            }
            else {
                if((uq0 instanceof dnjn)) {
                    CharSequence charSequence1 = (CharSequence)dnfp0.u.f("");
                    ((dnjn)uq0).t.setText(charSequence1);
                    return;
                }
                if((uq0 instanceof dnjj)) {
                    int v7 = this.dx(v);
                    ((dnjj)uq0).n(false);
                    dnkl dnkl0 = (this.e instanceof FopDetailsFragment) ? ((FopDetailsFragment)this.e).A() : null;
                    String s9 = (String)dnfp0.f.f("");
                    String s10 = (String)dnfp0.h.f("");
                    dnij dnij0 = dnfp0.s.i() ? new dnij(dnfp0, ((dnjj)uq0)) : null;
                    if(s10.length() != 0) {
                        s9 = a.r(s10, s9, "\n");
                    }
                    if(v7 == dnjs.z) {
                        ibuq.e(dnfp0.e, "getPrimaryText(...)");
                        fryu fryu0 = new fryu(dnfp0.e);
                        fryu fryu1 = new fryu(s9);
                        fryu fryu2 = new fryu(((String)dnfp0.j.f("")));
                        if(dnkl0 == null) {
                            z = false;
                        }
                        else {
                            Boolean boolean1 = (Boolean)dnkl0.p.ij();
                            z = boolean1 == null ? false : boolean1.booleanValue();
                        }
                        fuat0 = new fuat(fryu0, fryu1, null, new fubu(fryu2, z, false, 0, new dnik(this, ((dnjj)uq0)), 28), 0, null, dnij0, null, null, false, false, true, this.M(v), false, 10164);
                    }
                    else if(v7 == dnjs.A) {
                        fuaw fuaw0 = ((Boolean)dnfp0.p.f(boolean0)).booleanValue() ? fuaw.b : fuaw.a;
                        gfsx gfsx9 = dnfp0.a;
                        if(gfsx9.i()) {
                            fuaz0 = new fuaz(new fryh(((Number)gfsx9.d()).intValue()), null, null, fuaw0, 22);
                        }
                        else {
                            fuaz0 = dnfp0.b.i() ? new fuaz(new fryj(((String)dnfp0.b.d()), null, null, null, 14), null, null, fuaw0, 22) : null;
                        }
                        Object object1 = dnfp0.q.f("");
                        fuby fuby0 = new fuby(new fryu(((String)dnfp0.t.f(object1))), new frxo(0x7F04030C));  // attr:colorPrimary
                        ibuq.e(dnfp0.e, "getPrimaryText(...)");
                        fuat0 = new fuat(new fryu(dnfp0.e), new fryu(s9), fuaz0, fuby0, 0, null, dnij0, null, null, false, false, true, this.M(v), false, 10160);
                    }
                    else if(v7 == dnjs.B) {
                        fuaz fuaz1 = dnfp0.a.i() ? new fuaz(new fryh(((Number)dnfp0.a.d()).intValue()), null, null, null, 30) : null;
                        ibuq.e(dnfp0.e, "getPrimaryText(...)");
                        fuat0 = new fuat(new fryu(dnfp0.e), new fryu(s9), fuaz1, new fubx(((Boolean)dnfp0.r.f(boolean0)).booleanValue(), new dnil(((dnjj)uq0), dnij0)), 0, null, null, null, null, false, false, true, this.M(v), false, 0x27F0);
                    }
                    else {
                        gfsx gfsx10 = dnfp0.a;
                        if(gfsx10.i() && ((int)(((Integer)gfsx10.d()))) != 0) {
                            fuaz2 = new fuaz(new fryh(((Number)gfsx10.d()).intValue()), (dnfp0.c.i() ? new frxp(((Number)dnfp0.c.d()).intValue()) : null), null, null, 28);
                        }
                        else {
                            fuaz2 = dnfp0.b.i() ? new fuaz(new fryj(((String)dnfp0.b.d()), null, null, null, 14), null, null, null, 30) : null;
                        }
                        gfsx gfsx11 = dnfp0.k;
                        if(gfsx11.i()) {
                            fryh fryh0 = new fryh(((Number)gfsx11.d()).intValue());
                            gfsx gfsx12 = dnfp0.l;
                            if(gfsx12.i()) {
                                colorStateList0 = new frxp(((Number)gfsx12.d()).intValue());
                            }
                            fubv0 = new fubv(fryh0, null, ((frxs)colorStateList0), null, null, 0x76);
                        }
                        else {
                            fubv0 = null;
                        }
                        ibuq.e(dnfp0.e, "getPrimaryText(...)");
                        fuat0 = new fuat(new fryu(dnfp0.e), new fryu(s9), fuaz2, fubv0, 0, null, dnij0, null, null, false, false, true, this.M(v), false, 10160);
                    }
                    if(fuat0.m == fule.a || fuat0.m == fule.d) {
                        int v8 = ((dnjj)uq0).t.getPaddingLeft();
                        int v9 = ((dnjj)uq0).t.getPaddingTop();
                        int v10 = ((dnjj)uq0).t.getPaddingRight();
                        ((dnjj)uq0).t.setPadding(v8, v9, v10, 0);
                    }
                    ((dnjj)uq0).t.h(fuat0);
                    return;
                }
                if((uq0 instanceof dnjm)) {
                    dxev dxev8 = this.p;
                    if(dxev8 == null) {
                        hkir0 = null;
                    }
                    else {
                        hkhr hkhr7 = dxev8.c == null ? hkhr.b : dxev8.c;
                        if(hkhr7 == null) {
                            hkir0 = null;
                        }
                        else {
                            hkhh hkhh0 = hkhr7.q == null ? hkhh.a : hkhr7.q;
                            if(hkhh0 == null) {
                                hkir0 = null;
                            }
                            else {
                                hkir0 = hkhh0.g;
                                if(hkir0 == null) {
                                    hkir0 = hkir.a;
                                }
                            }
                        }
                    }
                    if(hkir0 == null) {
                        s12 = null;
                    }
                    else {
                        hktu hktu0 = hktu.b(hkir0.f) == null ? hktu.D : hktu.b(hkir0.f);
                        if(hktu0 == null) {
                            s12 = null;
                        }
                        else {
                            String s11 = hktu0.name();
                            s12 = s11 == null ? null : ibzk.u(s11, "PAYMENT_NETWORK_");
                        }
                    }
                    if(hkir0 == null) {
                        s14 = null;
                    }
                    else {
                        hkip hkip0 = hkir0.k == null ? hkip.a : hkir0.k;
                        if(hkip0 == null) {
                            s14 = null;
                        }
                        else {
                            hktu hktu1 = hktu.b(hkip0.d) == null ? hktu.D : hktu.b(hkip0.d);
                            if(hktu1 == null) {
                                s14 = null;
                            }
                            else {
                                String s13 = hktu1.name();
                                s14 = s13 == null ? null : ibzk.u(s13, "PAYMENT_NETWORK_");
                            }
                        }
                    }
                    gfsx gfsx13 = dnfp0.a;
                    if(gfsx13.i() && ((int)(((Integer)gfsx13.d()))) != 0) {
                        fuaz3 = new fuaz(new fryh(((Number)gfsx13.d()).intValue()), (dnfp0.c.i() ? new frxp(((Number)dnfp0.c.d()).intValue()) : null), null, null, 28);
                    }
                    else {
                        fuaz3 = dnfp0.b.i() ? new fuaz(new fryj(((String)dnfp0.b.d()), null, null, null, 14), null, null, null, 30) : null;
                    }
                    ibuq.e(dnfp0.e, "getPrimaryText(...)");
                    ((dnjm)uq0).t.b(new fuat(new fryu(dnfp0.e), new fryu(((String)dnfp0.f.f(""))), fuaz3, null, 0, null, null, null, null, false, false, false, this.M(v), false, 0x27F8));
                    TextView textView0 = ((dnjm)uq0).t.b;
                    TextView textView1 = ((dnjm)uq0).t.c;
                    TextView textView2 = ((dnjm)uq0).t.d;
                    String s15 = hkir0 == null ? null : hkir0.c;
                    MaterialButtonToggleGroup materialButtonToggleGroup0 = ((dnjm)uq0).t.a;
                    textView1.setText(((CharSequence)dnfp0.m.f("")));
                    textView2.setText(((CharSequence)dnfp0.n.f("")));
                    if(s15 != null) {
                        CharSequence charSequence2 = textView1.getText();
                        ibuq.e(charSequence2, "getText(...)");
                        this.P(textView1, s15, s12, charSequence2, materialButtonToggleGroup0);
                        CharSequence charSequence3 = textView2.getText();
                        ibuq.e(charSequence3, "getText(...)");
                        this.P(textView2, s15, s14, charSequence3, materialButtonToggleGroup0);
                        String s16 = this.e.getString(0x7F151E04);  // string:pay_fops_cobadged_payment_network_default_option "Auto"
                        ibuq.e(s16, "getString(...)");
                        this.P(textView0, s15, null, s16, materialButtonToggleGroup0);
                        this.O(materialButtonToggleGroup0, s12, s14);
                    }
                }
                else if((uq0 instanceof dnjl)) {
                    dxev dxev9 = this.p;
                    View view2 = ((dnjl)uq0).a;
                    View view3 = view2.findViewById(0x7F0B0C15);  // id:auto
                    ibuq.d(view3, "null cannot be cast to non-null type android.widget.TextView");
                    View view4 = view2.findViewById(0x7F0B1D06);  // id:primary
                    ibuq.d(view4, "null cannot be cast to non-null type android.widget.TextView");
                    View view5 = view2.findViewById(0x7F0B0C2F);  // id:auxiliary
                    ibuq.d(view5, "null cannot be cast to non-null type android.widget.TextView");
                    if(dxev9 == null) {
                        hkir1 = null;
                    }
                    else {
                        hkhr hkhr8 = dxev9.c == null ? hkhr.b : dxev9.c;
                        if(hkhr8 == null) {
                            hkir1 = null;
                        }
                        else {
                            hkhh hkhh1 = hkhr8.q == null ? hkhh.a : hkhr8.q;
                            if(hkhh1 == null) {
                                hkir1 = null;
                            }
                            else {
                                hkir1 = hkhh1.g;
                                if(hkir1 == null) {
                                    hkir1 = hkir.a;
                                }
                            }
                        }
                    }
                    String s17 = hkir1 == null ? null : hkir1.c;
                    if(hkir1 == null) {
                        s19 = null;
                    }
                    else {
                        hktu hktu2 = hktu.b(hkir1.f) == null ? hktu.D : hktu.b(hkir1.f);
                        if(hktu2 == null) {
                            s19 = null;
                        }
                        else {
                            String s18 = hktu2.name();
                            s19 = s18 == null ? null : ibzk.u(s18, "PAYMENT_NETWORK_");
                        }
                    }
                    if(hkir1 == null) {
                        s21 = null;
                    }
                    else {
                        hkip hkip1 = hkir1.k == null ? hkip.a : hkir1.k;
                        if(hkip1 == null) {
                            s21 = null;
                        }
                        else {
                            hktu hktu3 = hktu.b(hkip1.d) == null ? hktu.D : hktu.b(hkip1.d);
                            if(hktu3 == null) {
                                s21 = null;
                            }
                            else {
                                String s20 = hktu3.name();
                                s21 = s20 == null ? null : ibzk.u(s20, "PAYMENT_NETWORK_");
                            }
                        }
                    }
                    ((TextView)view4).setText(((CharSequence)dnfp0.m.f("")));
                    ((TextView)view5).setText(((CharSequence)dnfp0.n.f("")));
                    if(s17 != null) {
                        CharSequence charSequence4 = ((TextView)view4).getText();
                        ibuq.e(charSequence4, "getText(...)");
                        ibuq.d(((dnjl)uq0).t, "null cannot be cast to non-null type com.google.android.material.button.MaterialButtonToggleGroup");
                        this.P(((TextView)view4), s17, s19, charSequence4, ((MaterialButtonToggleGroup)((dnjl)uq0).t));
                        CharSequence charSequence5 = ((TextView)view5).getText();
                        ibuq.e(charSequence5, "getText(...)");
                        this.P(((TextView)view5), s17, s21, charSequence5, ((MaterialButtonToggleGroup)((dnjl)uq0).t));
                        String s22 = this.e.getString(0x7F151E04);  // string:pay_fops_cobadged_payment_network_default_option "Auto"
                        ibuq.e(s22, "getString(...)");
                        this.P(((TextView)view3), s17, null, s22, ((MaterialButtonToggleGroup)((dnjl)uq0).t));
                        ibuq.d(((dnjl)uq0).t, "null cannot be cast to non-null type com.google.android.material.button.MaterialButtonToggleGroup");
                        this.O(((MaterialButtonToggleGroup)((dnjl)uq0).t), s19, s21);
                    }
                }
            }
        }
    }

    public final void n(dxev dxev0, boolean z) {
        Integer integer0 = (int)0x7F080CE2;  // drawable:quantum_ic_contactless_vd_theme_24
        if(dnpx.m(dxev0) && this.m.a() != 4) {
            hkhr hkhr0 = dxev0.c == null ? hkhr.b : dxev0.c;
            hkhh hkhh0 = hkhr0.q == null ? hkhh.a : hkhr0.q;
            hkir hkir0 = hkhh0.g == null ? hkir.a : hkhh0.g;
            ibuq.e(hkir0, "getTokenData(...)");
            if((hkiq.b(hkir0.h) == null ? hkiq.f : hkiq.b(hkir0.h)) == hkiq.d) {
                boolean z1 = ibuq.m(hkir0.c, this.r);
                dnfo dnfo0 = new dnfo();
                dnfo0.l(Integer.valueOf(this.f()));
                if(hwjj.e()) {
                    dnfo0.h(Integer.valueOf(0x7F080A77));
                }
                if(z1) {
                    dnfo0.j(integer0);
                    dnfo0.a = this.e.getString(0x7F151E08);  // string:pay_fops_default_contactless "Default for tap to pay"
                    goto label_20;
                }
                if(!dnpx.p(dxev0)) {
                    dnfo0.j(Integer.valueOf(0x7F080B34));  // drawable:quantum_gm_ic_contactless_vd_theme_24
                    dnfo0.a = this.e.getString(0x7F151E2E);  // string:pay_fops_set_default_contactless "Make default for tap to pay"
                    dnfo0.o(new dnja(this, hkir0, dxev0));
                label_20:
                    dnfp dnfp0 = dnfo0.a();
                    this.w.add(dnfp0);
                }
            }
        }
        else if(dnpx.r(dxev0)) {
            hkhr hkhr1 = dxev0.c == null ? hkhr.b : dxev0.c;
            hkhh hkhh1 = hkhr1.q == null ? hkhh.a : hkhr1.q;
            hkir hkir1 = hkhh1.g == null ? hkir.a : hkhh1.g;
            boolean z2 = false;
            if((hkiq.b(hkir1.h) == null ? hkiq.f : hkiq.b(hkir1.h)) == hkiq.d) {
                if((dxev0.b & 2) != 0 && (dxev0.d == null ? dxet.a : dxev0.d).c) {
                    z2 = true;
                }
                boolean z3 = dnpx.q(dxev0);
                if(z2) {
                    dnfo dnfo1 = new dnfo();
                    dnfo1.a = z3 ? this.e.getString(0x7F151B8A) : this.e.getString(0x7F151B89);  // string:pay_active_quicpay_card "Active QUICPay card"
                    dnfo1.j(integer0);
                    dnfo1.l(Integer.valueOf(this.f()));
                    dnfo1.c(this.e.getString(0x7F151C19));  // string:pay_button_deactivate "Deactivate"
                    dnfo1.o(new dniv(this, dxev0));
                    this.w.add(dnfo1.a());
                    return;
                }
                dnfo dnfo2 = new dnfo();
                dnfo2.a = z3 ? this.e.getString(0x7F151F62) : this.e.getString(0x7F151F61);  // string:pay_make_active_for_quicpay_card "Make active for QUICPay"
                dnfo2.j(integer0);
                dnfo2.l(Integer.valueOf(this.f()));
                dnfo2.o(new dniw(this, dxev0, z));
                this.w.add(dnfo2.a());
            }
        }
    }
}

