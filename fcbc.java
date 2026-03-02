import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.wallet.analytics.events.OrchestrationViewEvent;
import com.google.android.gms.wallet.ui.component.generic.SelectableUiFieldOptionView;
import com.google.android.wallet.ui.common.InfoMessageView;
import com.google.android.wallet.ui.common.SelectorView;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public final class fcbc extends gdak implements gcjs, gdbp {
    SelectorView a;
    View ag;
    TextView ah;
    InfoMessageView ai;
    public boolean aj;
    int ak;
    public static final int al;
    private View am;
    private String an;
    private final gamj ao;
    private final gdew ap;
    private final ArrayList aq;
    gdew b;
    FrameLayout c;
    TextView d;

    public fcbc() {
        this.aj = false;
        this.ak = -1;
        this.ao = new gamj(0x661);
        this.ap = new gdew();
        this.aq = new ArrayList();
    }

    @Override  // gami
    public final gamj B() {
        return this.ao;
    }

    @Override  // gdak
    protected final gewg C() {
        return null;
    }

    @Override  // gdak
    protected final Parser D() {
        return (Parser)((ProtoLiteMessage)gfhh.a).jf(7, null);
    }

    @Override  // gdak
    public final void K(gffq gffq0, List list0) {
        if(gfev.a(gffq0.e) != 18) {
            super.K(gffq0, list0);
            return;
        }
        gffl gffl0 = gffq0.c == 11 ? ((gffl)gffq0.d) : gffl.a;
        int v = (gffl0.b == 2 ? ((gfhi)gffl0.c) : gfhi.a).e;
        if(((gfhh)this.aA).e.size() > v) {
            this.a.h(((gfjj)((gfhh)this.aA).e.get(v)).f);
        }
    }

    @Override  // gdcm
    protected final void M() {
        bbqv.b(this.am, this.ca);
    }

    public final gfhi N() {
        if(this.f()) {
            return null;
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gfhi.a).v_newBuilder();
        String s = ((gfhh)this.aA).b;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        s.getClass();
        ((gfhi)hftv0).b |= 1;
        ((gfhi)hftv0).c = s;
        int v = this.ak;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        gfhi gfhi0 = (gfhi)hftp0.b_message;
        gfhi0.b |= 4;
        gfhi0.e = v;
        int v1 = this.ak;
        if(v1 >= 0) {
            gfjo gfjo0 = gdcd.f(this.ag, ((gfjj)((gfhh)this.aA).e.get(v1)));
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gfhi gfhi1 = (gfhi)hftp0.b_message;
            gfjo0.getClass();
            gfhi1.d = gfjo0;
            gfhi1.b |= 2;
        }
        return (gfhi)hftp0.N_build();
    }

    private final View Q(gfjj gfjj0) {
        gdce gdce0 = new gdce(gfjj0, this.bW, this.cH(), this.c);
        gdce0.a = this.getContext();
        gdce0.c = this.cM();
        gdce0.e = this.cb;
        gdce0.f = this;
        View view0 = gdce0.a();
        if(!gdcd.o(gfjj0)) {
            view0 = gdax.b(this.bV, view0, this.c, this.cH().a());
            gdax.g(view0, gfjj0.j);
        }
        view0.setVisibility(8);
        return view0;
    }

    private static void R(View view0) {
        if(view0 != null) {
            ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0 = (ViewGroup.MarginLayoutParams)view0.getLayoutParams();
            viewGroup$MarginLayoutParams0.setMarginStart(0);
            viewGroup$MarginLayoutParams0.setMarginEnd(0);
        }
    }

    private static void S(View view0) {
        if(view0 != null) {
            int v = view0.getPaddingTop();
            int v1 = view0.getPaddingBottom();
            view0.setPadding(0, v, 0, v1);
            view0.setPaddingRelative(0, v, 0, v1);
        }
    }

    @Override  // gdbp
    public final void aF(Object object0, Object object1) {
        if(((gfjj)object1) != null && ((gfjj)object0).f == ((gfjj)object1).f) {
            return;
        }
        if(this.ak != -1 || gfhg.a(((gfhh)this.aA).h) == 2) {
            String s = this.an;
            OrchestrationViewEvent.c(this.getContext(), s, this.ao);
        }
        View view0 = this.ag;
        if(view0 != null) {
            view0.setVisibility(8);
        }
        int v = ((gfhh)this.aA).e.indexOf(((gfjj)object0));
        this.ak = v;
        this.ag = this.c.getChildAt(v);
        if(!gdcd.o(((gfjj)object0))) {
            this.ag.setVisibility(0);
        }
        gdew gdew0 = this.b;
        if(gdew0 != null) {
            gdew0.k();
            this.b.f(new gczs(((gfjj)object0).f, this.ag, gdcd.h(((gfjj)object0))));
            this.b.n();
        }
        if(this.ah != null && this.ah.getVisibility() == 0) {
            this.ah.setVisibility(4);
        }
        gcjn gcjn0 = this.cb;
        long v1 = ((gfjj)((gfhh)this.aA).e.get(this.ak)).f;
        gcjo.e(gcjn0, this.aq, v1);
    }

    @Override  // gcjs
    public final boolean aO(gfga gfga0) {
        return this.ak >= 0 && gcjo.g(gfga0, ((gfjj)((gfhh)this.aA).e.get(this.ak)).f);
    }

    @Override  // gdbp
    public final void ar(View view0) {
    }

    @Override  // gdbp
    public final void as(View view0) {
    }

    @Override  // gdbp
    public final void av() {
        this.c.setVisibility(0);
    }

    @Override  // gdbp
    public final boolean aw() {
        this.c.setVisibility(8);
        int v = this.a.getChildCount();
        Resources resources0 = this.getResources();
        gdcb.z(this.a, resources0.getQuantityString(0x7F1300B6, v, new Object[]{v}));  // plurals:wallet_expanding_ui_field_group_selector
        return true;
    }

    @Override  // gdak
    public final long bs() {
        this.aj();
        return ((gfhh)this.aA).c;
    }

    @Override  // gdak
    protected final boolean lM(List list0, boolean z) {
        if(this.ak < 0) {
            if(z) {
                TextView textView0 = this.ah;
                if(textView0 != null) {
                    textView0.setVisibility(0);
                }
            }
            return false;
        }
        return super.lM(list0, z);
    }

    @Override  // gdak
    public final void lW(int v) {
        if(((gfhh)this.aA).e.size() > 1) {
            return;
        }
        super.lW(v);
        this.d.setVisibility(v);
        this.ai.setVisibility(v);
    }

    @Override  // gdak
    public final boolean lY() {
        if(this.ak()) {
            return false;
        }
        if(this.ag != null && this.ag.getVisibility() == 0) {
            this.ag.requestFocus();
            return true;
        }
        this.a.requestFocus();
        return true;
    }

    @Override  // gdaa
    public final boolean la() {
        return true;
    }

    @Override  // gczu
    public final ArrayList lh() {
        ArrayList arrayList0 = new ArrayList();
        int v = this.ak;
        if(v >= 0) {
            arrayList0.add(new gczs(((gfjj)((gfhh)this.aA).e.get(v)).f, this.ag, gdcd.h(((gfjj)((gfhh)this.aA).e.get(this.ak)))));
        }
        return arrayList0;
    }

    @Override  // gami
    public final List li() {
        return null;
    }

    @Override  // gcjs
    public final void lk(ArrayList arrayList0) {
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            gcjm gcjm0 = (gcjm)arrayList0.get(v1);
            gfga gfga0 = gcjm0.a;
            int v2 = gffw.a(gfga0.e);
            int v3 = 1;
            if(v2 == 0) {
                v2 = 1;
            }
            switch(v2 - 1) {
                case 3: {
                    break;
                }
                case 1: 
                case 4: {
                    this.aq.add(gcjm0);
                    break;
                }
                default: {
                    Locale locale0 = Locale.US;
                    int v4 = gffw.a(gfga0.e);
                    if(v4 != 0) {
                        v3 = v4;
                    }
                    throw new IllegalArgumentException(String.format(locale0, "Unsupported trigger type: %s", ((int)(v3 - 1))));
                }
            }
        }
    }

    @Override  // gdaa
    public final boolean ly(getg getg0) {
        gesr gesr0 = getg0.b == null ? gesr.a : getg0.b;
        boolean z = false;
        if(gesr0.b.equals(((gfhh)this.aA).b)) {
            batl.d(gesr0.c == 1, "Unexpected field id %s for error message", new Object[]{((int)(getg0.b == null ? gesr.a : getg0.b).c)});
            int v = gesr0.d;
            if(v == this.ak) {
                z = true;
            }
            batl.d(z, "Field index %s doesn\'t match selected index %s", new Object[]{v, ((int)this.ak)});
            gdcd.m(this.ag, getg0.c);
            return true;
        }
        return false;
    }

    @Override  // gcyg
    public final gdew mb() {
        return this.ap;
    }

    @Override  // gdak
    public final void onSaveInstanceState(Bundle bundle0) {
        super.onSaveInstanceState(bundle0);
        bundle0.putInt("selectedIndex", this.ak);
        TextView textView0 = this.ah;
        if(textView0 != null) {
            bundle0.putInt("errorViewVisibility", textView0.getVisibility());
        }
    }

    @Override  // gcyg
    protected final View y(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        int v;
        boolean z;
        switch(gfhg.a(((gfhh)this.aA).h)) {
            case 0: {
                z = false;
                break;
            }
            case 2: {
                z = true;
                break;
            }
            default: {
                z = false;
            }
        }
        this.an = this.getArguments().getString("analyticsId");
        View view0 = layoutInflater0.inflate((z ? 0x7F0E0D45 : 0x7F0E0D44), viewGroup0, false);  // layout:wallet_fragment_selectable_ui_field_group_radio
        this.am = view0;
        this.d = (TextView)view0.findViewById(0x7F0B22B8);  // id:title
        if(!((gfhh)this.aA).d.isEmpty()) {
            this.d.setText(((gfhh)this.aA).d);
            this.d.setVisibility(0);
        }
        InfoMessageView infoMessageView0 = (InfoMessageView)this.am.findViewById(0x7F0B0CF3);  // id:bottom_info_message
        this.ai = infoMessageView0;
        gfgr gfgr0 = ((gfhh)this.aA).g;
        if(gfgr0 == null) {
            gfgr0 = gfgr.a;
        }
        infoMessageView0.p(gfgr0);
        if(bundle0 != null && bundle0.containsKey("selectedIndex")) {
            v = bundle0.getInt("selectedIndex");
        }
        else {
            v = ((gfhh)this.aA).f;
            if(!z && v < 0) {
                v = 0;
            }
        }
        SelectorView selectorView0 = (SelectorView)this.am.findViewById(0x7F0B239A);  // id:ui_field_selector
        this.a = selectorView0;
        if(z) {
            selectorView0.a.s(true);
        }
        this.c = (FrameLayout)this.am.findViewById(0x7F0B2395);  // id:ui_field_container
        int v1 = ((gfhh)this.aA).e.size();
        if(v1 > 1) {
            this.a.setVisibility(0);
            this.ap.d(this.a);
            SelectorView selectorView1 = this.a;
            selectorView1.e = this;
            selectorView1.f = this;
            selectorView1.h = this.cM();
            selectorView1.g = this.bs();
            int v2 = 0;
            while(v2 < v1) {
                gfjj gfjj0 = (gfjj)((gfhh)this.aA).e.get(v2);
                if(z && !gdcd.o(gfjj0)) {
                    throw new IllegalArgumentException("Only read-only options can be used with RADIO_BUTTONS_GROUP style.");
                }
                SelectableUiFieldOptionView selectableUiFieldOptionView0 = (SelectableUiFieldOptionView)layoutInflater0.inflate((z ? 0x7F0E0E65 : 0x7F0E0E64), this.a, false);  // layout:wallet_view_selectable_ui_field_option_radio
                if(this.aj) {
                    fcbc.S(selectableUiFieldOptionView0);
                }
                selectableUiFieldOptionView0.setId(this.cH().a());
                selectableUiFieldOptionView0.p = gfjj0;
                if(gdcd.o(gfjj0)) {
                    int v3 = gfjj0.c;
                    if(v3 == 6) {
                        selectableUiFieldOptionView0.a.setText(((gfji)gfjj0.d).l);
                    }
                    else if(v3 == 7) {
                        int v4 = gdcd.a(((gfip)gfjj0.d));
                        if(v4 >= 0) {
                            selectableUiFieldOptionView0.a.setText(gdcd.k(((gfio)(gfjj0.c == 7 ? ((gfip)gfjj0.d) : gfip.a).c.get(v4))));
                        }
                    }
                }
                else {
                    selectableUiFieldOptionView0.a.setText(gfjj0.j);
                }
                if(TextUtils.isEmpty(selectableUiFieldOptionView0.a.getText())) {
                    throw new IllegalArgumentException("UiField must be editable with a label, or a read-only text or select field with an initial value, or a select field with only one option.");
                }
                selectableUiFieldOptionView0.q(gfjj0.f);
                this.a.addView(selectableUiFieldOptionView0);
                View view1 = this.Q(gfjj0);
                this.c.addView(view1);
                ++v2;
                continue;
            }
            if(v >= 0) {
                this.a.h(((gfjj)((gfhh)this.aA).e.get(v)).f);
            }
        }
        else {
            this.ak = 0;
            View view2 = this.Q(((gfjj)((gfhh)this.aA).e.get(0)));
            this.ag = view2;
            view2.setVisibility(0);
            this.c.addView(this.ag);
        }
        gdew gdew0 = new gdew();
        this.b = gdew0;
        this.ap.c(gdew0);
        int v5 = this.ak;
        if(v5 >= 0) {
            this.b.f(new gczs(((gfjj)((gfhh)this.aA).e.get(v5)).f, this.ag, gdcd.h(((gfjj)((gfhh)this.aA).e.get(this.ak)))));
            this.b.n();
        }
        this.ah = (TextView)this.am.findViewById(0x7F0B1273);  // id:error
        if(bundle0 != null && bundle0.containsKey("errorViewVisibility")) {
            this.ah.setVisibility(bundle0.getInt("errorViewVisibility"));
        }
        if(this.aj) {
            fcbc.R(this.d);
            fcbc.R(this.ai);
            fcbc.R(this.ah);
            fcbc.S(this.c);
        }
        return this.am;
    }
}

