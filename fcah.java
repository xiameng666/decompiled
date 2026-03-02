import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.wallet.analytics.events.OrchestrationViewEvent;
import com.google.android.wallet.clientlog.LogContext;
import com.google.android.wallet.ui.common.ImageWithCaptionView;
import com.google.android.wallet.ui.common.SelectorView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

public final class fcah extends gcww implements gcjs, gczn, gczo, gdbp, gdcf {
    SelectorView a;
    TextView ag;
    View ah;
    public Object ai;
    final HashMap aj;
    public fbcz ak;
    private ArrayList al;
    private final ArrayList am;
    private final gdew an;
    private String ao;
    private final gamj ap;
    FrameLayout b;
    gcwf c;
    TextView d;

    public fcah() {
        this.al = new ArrayList();
        this.aj = new HashMap();
        this.am = new ArrayList();
        this.an = new gdew();
        this.ap = new gamj(8);
    }

    @Override  // gami
    public final gamj B() {
        return this.ap;
    }

    public static fcah I(geui geui0, int v, String s, LogContext logContext0) {
        batl.m(geub.a(geui0.t) == 3, "AddressSelectorFragment is only used for address form with selector display type");
        fcah fcah0 = new fcah();
        Bundle bundle0 = fcah.al(v, ((MessageLite)geui0), logContext0);
        bundle0.putString("analyticsSessionId", s);
        fcah0.setArguments(bundle0);
        return fcah0;
    }

    @Override  // gcww
    public final geuj J(Bundle bundle0) {
        gcwf gcwf0 = this.c;
        if(gcwf0 != null) {
            return gcwf0.J(bundle0);
        }
        if(!(this.ai instanceof geuq) || this.R()) {
            throw new IllegalStateException("Invalid address form value");
        }
        geuj geuj0 = ((geuq)this.ai).d;
        return geuj0 == null ? geuj.a : geuj0;
    }

    @Override  // gdcm
    protected final void M() {
        boolean z = this.ca;
        SelectorView selectorView0 = this.a;
        if(selectorView0 != null) {
            selectorView0.setEnabled(z);
        }
        gcwf gcwf0 = this.c;
        if(gcwf0 != null) {
            gcwf0.ll(z);
        }
    }

    @Override  // gdcf
    public final void N() {
        Object object0;
        hcam hcam0 = this.ak.aj();
        if((hcam0.b & 2) != 0 && hcak.a((hcam0.f == null ? hcal.a : hcam0.f).d) == 2) {
            gewg gewg0 = ((geui)this.aA).f;
            if(gewg0 == null) {
                gewg0 = gewg.a;
            }
            if(gesq.a(gewg0.k) == 2) {
                SelectorView selectorView0 = this.a;
                View view0 = selectorView0.b;
                if(view0 == null) {
                    object0 = null;
                }
                else {
                    object0 = ((gdbk)view0).k();
                    ((gdbk)view0).l(false, false);
                    selectorView0.b = null;
                }
                selectorView0.e.aF(null, object0);
            }
        }
    }

    private final void Q(geui geui0) {
        gcwf gcwf0 = (gcwf)this.getChildFragmentManager().g(0x7F0B0B15);  // id:add_address_form_holder
        this.c = gcwf0;
        if(gcwf0 == null) {
            this.c = gcwf.V(geui0, this.bU, true, true, false, this.cM());
            ca ca0 = new ca(this.getChildFragmentManager());
            ca0.G(0x7F0B0B15, this.c);  // id:add_address_form_holder
            ca0.a();
            String s = this.ao;
            gamj gamj0 = this.c.ak;
            OrchestrationViewEvent.d(this.getContext(), s, gamj0);
        }
        this.c.ab();
        this.an.d(this.c);
    }

    private final boolean R() {
        return (this.ai instanceof geui) ? true : (this.ai instanceof geuq) && geup.a(((geuq)this.ai).e) == 4;
    }

    @Override  // gczn
    public final CharSequence U() {
        return this.ag.getText();
    }

    @Override  // gdbp
    public final void aF(Object object0, Object object1) {
        int v = 0;
        int v1 = 1;
        this.a.a.s(object0 == null);
        if(fcai.e(object0) != fcai.e(object1)) {
            if(object1 != null) {
                String s = this.ao;
                OrchestrationViewEvent.c(this.getContext(), s, this.ap);
            }
            long v2 = fcai.e(object0);
            if(fcai.e(this.ai) != v2) {
                this.ai = object0;
                long v3 = fcai.e(object0);
                gcjo.e(this.cb, this.am, v3);
            }
            gcwf gcwf0 = this.c;
            if(gcwf0 != null) {
                this.an.p(gcwf0);
                ca ca0 = new ca(this.getChildFragmentManager());
                ca0.o(this.c);
                ca0.a();
                this.c = null;
                this.getChildFragmentManager().aq();
            }
            if(this.R()) {
                if((object0 instanceof geui)) {
                    this.Q(((geui)object0));
                }
                else if((object0 instanceof geuq)) {
                    geui geui0 = (geui)this.aA;
                    int v4 = ((geuq)object0).g;
                    if(geun.a(v4) == 2) {
                        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)geui0).jf(5, null);
                        hftp0.X(((ProtoLiteMessage)geui0));
                        geuj geuj0 = ((geuq)object0).d;
                        if(geuj0 == null) {
                            geuj0 = geuj.a;
                        }
                        if(!((geue)hftp0).b_message.isImmutable()) {
                            ((ProtoLiteBuilder)(((geue)hftp0))).ensureMutable();
                        }
                        geui geui1 = (geui)((geue)hftp0).b_message;
                        geuj0.getClass();
                        geui1.k = geuj0;
                        geui1.e |= 0x20;
                        long v5 = ((geuq)object0).c;
                        if(!((geue)hftp0).b_message.isImmutable()) {
                            ((ProtoLiteBuilder)(((geue)hftp0))).ensureMutable();
                        }
                        ((geui)((geue)hftp0).b_message).e |= 4;
                        ((geui)((geue)hftp0).b_message).h = v5;
                        if(!((geue)hftp0).b_message.isImmutable()) {
                            ((ProtoLiteBuilder)(((geue)hftp0))).ensureMutable();
                        }
                        ((geui)((geue)hftp0).b_message).C = hfty.a;
                        geud[] arr_geud = {geud.i};
                        geud[] arr_geud1 = gcgq.e;
                        geud[] arr_geud2 = new geud[10];
                        int v6 = 0;
                        for(int v7 = 0; v7 < 11; ++v7) {
                            if(gcuq.a(arr_geud, arr_geud1[v7]) < 0) {
                                arr_geud2[v6] = arr_geud1[v7];
                                ++v6;
                            }
                        }
                        List list0 = Arrays.asList(arr_geud2);
                        if(!((geue)hftp0).b_message.isImmutable()) {
                            ((ProtoLiteBuilder)(((geue)hftp0))).ensureMutable();
                        }
                        geui geui2 = (geui)((geue)hftp0).b_message;
                        hfuf hfuf0 = geui2.C;
                        if(!hfuf0.c()) {
                            geui2.C = ProtoLiteMessage.C(hfuf0);
                        }
                        for(Object object2: list0) {
                            geui2.C.i(((geud)object2).q);
                        }
                        if(!((geue)hftp0).b_message.isImmutable()) {
                            ((ProtoLiteBuilder)(((geue)hftp0))).ensureMutable();
                        }
                        ((geui)((geue)hftp0).b_message).t = 1;
                        ((geui)((geue)hftp0).b_message).e |= 0x2000;
                        if(!((geue)hftp0).b_message.isImmutable()) {
                            ((ProtoLiteBuilder)(((geue)hftp0))).ensureMutable();
                        }
                        geui.b(((geui)((geue)hftp0).b_message));
                        if(!((geue)hftp0).b_message.isImmutable()) {
                            ((ProtoLiteBuilder)(((geue)hftp0))).ensureMutable();
                        }
                        ((geui)((geue)hftp0).b_message).e |= 0x10000;
                        ((geui)((geue)hftp0).b_message).y = true;
                        if(!((geue)hftp0).b_message.isImmutable()) {
                            ((ProtoLiteBuilder)(((geue)hftp0))).ensureMutable();
                        }
                        ((geui)((geue)hftp0).b_message).m = hfvv.a;
                        this.Q(((geui)((ProtoLiteBuilder)(((geue)hftp0))).N_build()));
                        goto label_90;
                    }
                    int v8 = geun.a(v4);
                    if(v8 != 0) {
                        v1 = v8;
                    }
                    throw new IllegalStateException(String.format("Unsupported fix type %s for DisplayAddress", ((int)(v1 - 1))));
                }
            }
        label_90:
            View view0 = this.ah;
            if(this.aC || this.li().isEmpty()) {
                v = 8;
            }
            view0.setVisibility(v);
        }
    }

    @Override  // gcjs
    public final boolean aO(gfga gfga0) {
        return gcjo.g(gfga0, fcai.e(this.ai));
    }

    @Override  // gdbp
    public final void ar(View view0) {
        TextView textView0 = this.d;
        if(textView0 != null) {
            textView0.setVisibility(8);
        }
    }

    @Override  // gdbp
    public final void as(View view0) {
        TextView textView0 = this.d;
        if(textView0 != null) {
            textView0.setVisibility(0);
        }
    }

    @Override  // gczn
    public final void at(CharSequence charSequence0) {
        this.ag.setText(charSequence0);
        this.ag.setVisibility((TextUtils.isEmpty(charSequence0) ? 8 : 0));
    }

    @Override  // gdbp
    public final void av() {
        if(this.R()) {
            this.b.setVisibility(0);
        }
    }

    @Override  // gdbp
    public final boolean aw() {
        this.b.setVisibility(8);
        int v = this.a.getChildCount();
        Resources resources0 = this.getResources();
        gdcb.z(this.a, resources0.getQuantityString(0x7F1300B5, v, new Object[]{v}));  // plurals:wallet_expanding_shipping_address_selector
        return true;
    }

    @Override  // gdak
    public final hbzg lK() {
        if((this.ai instanceof geuq) && (!this.R() || hzoz.a.c().L())) {
            geuq geuq0 = (geuq)this.ai;
            if((geuq0.b & 0x40) != 0) {
                return geuq0.i == null ? hbzg.a : geuq0.i;
            }
        }
        return null;
    }

    @Override  // gdaa
    public final boolean la() {
        return this.ai == null || this.c == null ? (this.ai instanceof geuq) && !this.R() : true;
    }

    @Override  // gczu
    public final ArrayList lh() {
        ArrayList arrayList0 = new ArrayList(1);
        arrayList0.add(new gczs(((geui)this.aA).h, this.a, null));
        if(this.R()) {
            arrayList0.add(new gczs(this.c));
        }
        return arrayList0;
    }

    @Override  // gami
    public final List li() {
        List list0 = new ArrayList(1);
        gcwf gcwf0 = this.c;
        if(gcwf0 != null) {
            ((ArrayList)list0).add(gcwf0);
        }
        return list0;
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
                case 4: 
                case 18: {
                    this.am.add(gcjm0);
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
        return this.c != null && this.c.ly(getg0);
    }

    @Override  // gcyg
    public final gdew mb() {
        return this.an;
    }

    @Override  // gcyg
    public final void onAttach(Context context0) {
        super.onAttach(context0);
        this.ao = this.getArguments().getString("analyticsSessionId");
    }

    @Override  // gdak
    public final void onCreate(Bundle bundle0) {
        ArrayList arrayList0;
        super.onCreate(bundle0);
        boolean z = fbgn.M(((geui)this.aA));
        if(bundle0 == null) {
            for(Object object0: ((geui)this.aA).m) {
                this.al.add(Long.valueOf(fcai.e(((geuq)object0))));
            }
            if(!z) {
                Long long0 = fcai.e(this.aA);
                this.al.add(long0);
            }
        }
        else {
            long[] arr_v = bundle0.getLongArray("displayedOptions");
            if(arr_v == null) {
                arrayList0 = null;
            }
            else {
                arrayList0 = new ArrayList(arr_v.length);
                for(int v = 0; v < arr_v.length; ++v) {
                    arrayList0.add(Long.valueOf(arr_v[v]));
                }
            }
            this.al = arrayList0;
        }
        for(Object object1: ((geui)this.aA).m) {
            Long long1 = fcai.e(((geuq)object1));
            this.aj.put(long1, ((geuq)object1));
        }
        if(!z) {
            HashMap hashMap0 = this.aj;
            Long long2 = fcai.e(this.aA);
            geui geui0 = (geui)this.aA;
            ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)geui0).jf(5, null);
            hftp0.X(((ProtoLiteMessage)geui0));
            if(!((geue)hftp0).b_message.isImmutable()) {
                ((ProtoLiteBuilder)(((geue)hftp0))).ensureMutable();
            }
            ((geui)((geue)hftp0).b_message).m = hfvv.a;
            if(!((geue)hftp0).b_message.isImmutable()) {
                ((ProtoLiteBuilder)(((geue)hftp0))).ensureMutable();
            }
            ((geui)((geue)hftp0).b_message).t = 1;
            ((geui)((geue)hftp0).b_message).e |= 0x2000;
            if(!((geue)hftp0).b_message.isImmutable()) {
                ((ProtoLiteBuilder)(((geue)hftp0))).ensureMutable();
            }
            geui.b(((geui)((geue)hftp0).b_message));
            hashMap0.put(long2, ((geui)((ProtoLiteBuilder)(((geue)hftp0))).N_build()));
        }
    }

    @Override  // gdak
    public final void onSaveInstanceState(Bundle bundle0) {
        super.onSaveInstanceState(bundle0);
        Object object0 = this.ai;
        if((object0 instanceof geuq)) {
            gciq.j(bundle0, "selectedAddress", ((MessageLite)(((geuq)object0))));
        }
        else if((object0 instanceof geui)) {
            gciq.j(bundle0, "selectedAddressForm", ((MessageLite)(((geui)object0))));
        }
        bundle0.putLongArray("displayedOptions", gcuq.e(this.al));
        bundle0.putCharSequence("errorMessage", this.U());
    }

    @Override  // gcyg
    protected final View y(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        gfgo gfgo1;
        fcag fcag0;
        Object object0;
        View view0 = layoutInflater0.inflate(0x7F0E0D20, null, false);  // layout:wallet_fragment_address_selector
        SelectorView selectorView0 = (SelectorView)view0.findViewById(0x7F0B0B4F);  // id:address_selector_view
        this.a = selectorView0;
        this.an.d(selectorView0);
        SelectorView selectorView1 = this.a;
        selectorView1.e = this;
        selectorView1.c = this;
        selectorView1.f = this;
        selectorView1.h = this.cM();
        selectorView1.g = this.bs();
        this.b = (FrameLayout)view0.findViewById(0x7F0B0B15);  // id:add_address_form_holder
        this.ah = view0.findViewById(0x7F0B0B4D);  // id:address_selector_form_separator
        this.ag = (TextView)view0.findViewById(0x7F0B1273);  // id:error
        if(!((geui)this.aA).j.isEmpty()) {
            TextView textView0 = (TextView)view0.findViewById(0x7F0B0B4E);  // id:address_selector_header
            this.d = textView0;
            textView0.setText(((geui)this.aA).j);
            this.d.setTag(0x7F0B218C, "expandedField");  // id:summary_expander_transition_name
        }
        if(bundle0 == null) {
            MessageLite hfvm0 = this.aA;
            long v = ((geui)hfvm0).q;
            if(v != 0L) {
                if(v == ((geui)hfvm0).s) {
                    Long long0 = fcai.e(hfvm0);
                    object0 = this.aj.get(long0);
                }
                else {
                    if(v == ((geui)hfvm0).r) {
                        throw new IllegalArgumentException("Does not support unselected state.");
                    }
                    object0 = this.aj.get(Long.valueOf(v));
                }
            }
            else if(((geui)hfvm0).p >= 0 && ((geui)hfvm0).m.size() > 0) {
                Long long1 = fcai.e(((geuq)((geui)this.aA).m.get(((geui)this.aA).p)));
                object0 = this.aj.get(long1);
            }
            else {
                Long long2 = fcai.e(this.aA);
                object0 = this.aj.get(long2);
            }
        }
        else if(bundle0.containsKey("selectedAddress")) {
            object0 = gciq.a(bundle0, "selectedAddress", ((Parser)((ProtoLiteMessage)geuq.a).jf(7, null)));
        }
        else if(bundle0.containsKey("selectedAddressForm")) {
            object0 = gciq.a(bundle0, "selectedAddressForm", ((Parser)((ProtoLiteMessage)geui.d).jf(7, null)));
        }
        else {
            object0 = null;
        }
        this.a.removeAllViews();
        Context context0 = this.getContext();
        int v1 = this.al.size();
        int v2 = 0;
        while(v2 < v1) {
            Object object1 = this.al.get(v2);
            Object object2 = this.aj.get(object1);
            if((object2 instanceof geuq)) {
                fcag0 = new fcag(context0);
                fcag0.p = (geuq)object2;
                if(fcag.a == null) {
                    fcag.a = fcag0.getResources().getString(0x7F1535C6, new Object[]{"", ""});  // string:wallet_uic_string_list_append_to_end "%1$s, %2$s"
                }
                geuj geuj0 = ((geuq)object2).d;
                if(geuj0 == null) {
                    geuj0 = geuj.a;
                }
                gwey gwey0 = geuj0.f == null ? gwey.a : geuj0.f;
                geuj geuj1 = ((geuq)object2).d;
                if(geuj1 == null) {
                    geuj1 = geuj.a;
                }
                fcag0.b = gcgl.d(gwey0, "\n", new char[]{'N', 'R'}, geuj1.g);
                geuj geuj2 = ((geuq)object2).d;
                geuj geuj3 = geuj2 == null ? geuj.a : geuj2;
                gwey gwey1 = geuj3.f == null ? gwey.a : geuj3.f;
                String s = fcag.a;
                if(geuj2 == null) {
                    geuj2 = geuj.a;
                }
                fcag0.c = gcgl.d(gwey1, s, new char[]{'N', 'R'}, geuj2.g);
                TextView textView1 = fcag0.f;
                textView1.setText(fcag0.c);
                TextView textView2 = fcag0.e;
                geuj geuj4 = ((geuq)object2).d;
                if(geuj4 == null) {
                    geuj4 = geuj.a;
                }
                textView2.setText((geuj4.f == null ? gwey.a : geuj4.f).s);
                textView1.setVisibility(0);
                fcag0.g.setText(((geuq)fcag0.p).f);
                ImageWithCaptionView imageWithCaptionView0 = fcag0.d;
                geuq geuq0 = (geuq)fcag0.p;
                if((geuq0.b & 0x20) == 0) {
                    gfgo1 = null;
                }
                else {
                    gfgo gfgo0 = geuq0.h;
                    gfgo1 = gfgo0 == null ? gfgo.a : gfgo0;
                }
                imageWithCaptionView0.o(gfgo1, fbgn.o(fcag0.getContext()));
                fcag0.setEnabled(true);
                fcag0.q(fcai.e(object2));
                fcag0.n = this.aC;
                this.a.addView(fcag0);
                ++v2;
                continue;
            }
            if(!(object2 instanceof geui)) {
                throw new IllegalArgumentException("Unexpected option type: " + object2);
            }
            fcag0 = new fcaf(context0);
            fcag0.p = (geui)object2;
            fcag0.e.setText(((geui)object2).o);
            TypedArray typedArray0 = ((fcaf)fcag0).getContext().getTheme().obtainStyledAttributes(new int[]{0x7F040486});  // attr:drawableWalletAdd
            ImageWithCaptionView imageWithCaptionView1 = fcag0.d;
            imageWithCaptionView1.c(typedArray0.getResourceId(0, 0));
            imageWithCaptionView1.o(null, fbgn.o(((fcaf)fcag0).getContext()));
            typedArray0.recycle();
            fcag0.i.setVisibility(8);
            fcag0.q(fcai.e(object2));
            fcag0.n = this.aC;
            this.a.addView(fcag0);
            ++v2;
            continue;
        }
        long v3 = fcai.e(object0);
        this.a.h(v3);
        if(bundle0 != null) {
            this.at(bundle0.getCharSequence("errorMessage"));
        }
        return view0;
    }
}

