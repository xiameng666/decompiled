import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.wallet.ui.common.InfoMessageView;
import com.google.android.wallet.ui.common.SelectorView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public final class fcba extends gdak implements gcjs, gczn, gdbp, gdcf {
    SelectorView a;
    public gfio ag;
    final ArrayList ah;
    final List ai;
    gfgo aj;
    public gcyo ak;
    public fbcz al;
    private final Map am;
    private final gamj an;
    private final gdew ao;
    TextView b;
    TextView c;
    boolean d;

    public fcba() {
        this.d = false;
        this.ah = new ArrayList();
        this.ai = new ArrayList();
        this.am = new HashMap();
        this.an = new gamj(16);
        this.ao = new gdew();
    }

    @Override  // gami
    public final gamj B() {
        return this.an;
    }

    @Override  // gdak
    protected final gewg C() {
        return null;
    }

    @Override  // gdak
    protected final Parser D() {
        return (Parser)((ProtoLiteMessage)gfjj.a).jf(7, null);
    }

    @Override  // gdak
    public final void K(gffq gffq0, List list0) {
        if((gfev.a(gffq0.e) == 0 ? 1 : gfev.a(gffq0.e)) - 1 != 12) {
            super.K(gffq0, list0);
            return;
        }
        gfjj gfjj0 = (gfjj)this.aA;
        ArrayList arrayList0 = new ArrayList((gfjj0.c == 7 ? ((gfip)gfjj0.d) : gfip.a).c.size());
        gfjj gfjj1 = (gfjj)this.aA;
        for(Object object0: (gfjj1.c == 7 ? ((gfip)gfjj1.d) : gfip.a).c) {
            arrayList0.add(Long.valueOf(((gfio)object0).j));
        }
        this.cb.b(arrayList0, (gffq0.c == 9 ? ((gffj)gffq0.d) : gffj.a), list0);
    }

    @Override  // gdcm
    protected final void M() {
        SelectorView selectorView0 = this.a;
        if(selectorView0 != null) {
            selectorView0.setEnabled(this.ca);
        }
    }

    @Override  // gdcf
    public final void N() {
        hcam hcam0 = this.al.aj();
        gfjj gfjj0 = (gfjj)this.aA;
        if(gesq.a((gfjj0.c == 7 ? ((gfip)gfjj0.d) : gfip.a).g) == 3 && !hcam0.d.isEmpty()) {
            this.d = true;
            ArrayList arrayList0 = new ArrayList();
            for(Object object0: hcam0.d) {
                hbzo hbzo0 = (hbzo)object0;
                Map map0 = this.am;
                Long long0 = (Long)map0.get(hbzo0.c);
                if(long0 == null) {
                    long0 = this.ak.br(hcds.bl);
                    map0.put(hbzo0.c, long0);
                }
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gfio.a).v_newBuilder();
                long v = (long)long0;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp0.b_message;
                ((gfio)hftv0).b |= 0x80;
                ((gfio)hftv0).j = v;
                String s = hbzo0.d;
                if(!hftv0.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv1 = hftp0.b_message;
                s.getClass();
                ((gfio)hftv1).b |= 1;
                ((gfio)hftv1).c = s;
                String s1 = hbzo0.c;
                if(!hftv1.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gfio gfio0 = (gfio)hftp0.b_message;
                s1.getClass();
                gfio0.b |= 0x20;
                gfio0.h = s1;
                hbzg hbzg0 = hbzo0.f == null ? hbzg.a : hbzo0.f;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gfio gfio1 = (gfio)hftp0.b_message;
                hbzg0.getClass();
                gfio1.p = hbzg0;
                gfio1.b |= 0x2000;
                if(!hbzo0.e.isEmpty()) {
                    ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gfgr.a).v_newBuilder();
                    String s2 = ghin.c(hbzo0.e).b;
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    gfgr gfgr0 = (gfgr)hftp1.b_message;
                    gfgr0.b |= 4;
                    gfgr0.f = s2;
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    gfio gfio2 = (gfio)hftp0.b_message;
                    gfgr gfgr1 = (gfgr)hftp1.N_build();
                    gfgr1.getClass();
                    gfio2.f = gfgr1;
                    gfio2.b |= 8;
                }
                gfgo gfgo0 = this.aj;
                if(gfgo0 != null) {
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ((gfio)hftp0.b_message).l = gfgo0;
                    ((gfio)hftp0.b_message).b |= 0x200;
                }
                arrayList0.add(((gfio)hftp0.N_build()));
            }
            gfjj gfjj1 = (gfjj)this.aA;
            ProtoLiteBuilder hftp2 = (ProtoLiteBuilder)((ProtoLiteMessage)gfjj1).jf(5, null);
            hftp2.X(((ProtoLiteMessage)gfjj1));
            gfjj gfjj2 = (gfjj)this.aA;
            gfip gfip0 = gfjj2.c == 7 ? ((gfip)gfjj2.d) : gfip.a;
            ProtoLiteBuilder hftp3 = (ProtoLiteBuilder)((ProtoLiteMessage)gfip0).jf(5, null);
            hftp3.X(((ProtoLiteMessage)gfip0));
            if(!hftp3.b_message.isImmutable()) {
                hftp3.ensureMutable();
            }
            ((gfip)hftp3.b_message).c = hfvv.a;
            String s3 = hcam0.e;
            if(!hftp3.b_message.isImmutable()) {
                hftp3.ensureMutable();
            }
            ProtoLiteMessage hftv2 = hftp3.b_message;
            s3.getClass();
            ((gfip)hftv2).b |= 1;
            ((gfip)hftv2).d = s3;
            if(!hftv2.isImmutable()) {
                hftp3.ensureMutable();
            }
            gfip gfip1 = (gfip)hftp3.b_message;
            hfuo hfuo0 = gfip1.c;
            if(!hfuo0.c()) {
                gfip1.c = ProtoLiteMessage.E(hfuo0);
            }
            hfrj.E(arrayList0, gfip1.c);
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            gfjj gfjj3 = (gfjj)hftp2.b_message;
            gfip gfip2 = (gfip)hftp3.N_build();
            gfip2.getClass();
            gfjj3.d = gfip2;
            gfjj3.c = 7;
            gfjj gfjj4 = (gfjj)hftp2.N_build();
            Bundle bundle0 = this.getArguments();
            if(bundle0 == null) {
                bundle0 = new Bundle();
            }
            gciq.j(bundle0, "formProtoLite", ((MessageLite)gfjj4));
            this.setArguments(bundle0);
            this.aA = gfjj4;
            gfjj gfjj5 = (gfjj)this.aA;
            int v1 = gdcd.a((gfjj5.c == 7 ? ((gfip)gfjj5.d) : gfip.a));
            gfjj gfjj6 = (gfjj)this.aA;
            gfip gfip3 = gfjj6.c == 7 ? ((gfip)gfjj6.d) : gfip.a;
            if(v1 == -1) {
                v1 = 0;
            }
            this.ag = (gfio)gfip3.c.get(v1);
            this.R();
        }
    }

    public static boolean Q(int v) {
        return v == 4 || v == 11;
    }

    private final void R() {
        boolean z;
        this.a.removeAllViews();
        Context context0 = this.getContext();
        gfjj gfjj0 = (gfjj)this.aA;
        gfip gfip0 = gfjj0.c == 7 ? ((gfip)gfjj0.d) : gfip.a;
        switch(gfil.a(gfip0.f)) {
            case 0: {
                z = false;
                break;
            }
            case 11: {
                z = true;
                break;
            }
            default: {
                z = false;
            }
        }
        int v1 = gfip0.c.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            gfio gfio0 = (gfio)gfip0.c.get(v2);
            int v3 = 2;
            boolean z1 = gfin.a(gfio0.n) == 0 || gfin.a(gfio0.n) == 2;
            int v4 = gfin.a(gfio0.n);
            if(v4 != 0) {
                v3 = v4;
            }
            gftb.s(z1, "Unsupported option display type: %s", v3 - 1);
            long v5 = gfio0.j == 0L ? gcgh.c(this.bs(), 1, v2) : gfio0.j;
            gcqy gcqy0 = this.cH();
            fcbb fcbb0 = new fcbb(context0);
            fcbb0.p = gfio0;
            String s = gdcd.k(gfio0);
            fcbb0.b.setText(s);
            InfoMessageView infoMessageView0 = fcbb0.c;
            infoMessageView0.p((gfio0.f == null ? gfgr.a : gfio0.f));
            if((gfio0.b & 0x200) != 0) {
                fcbb0.a.q((gfio0.l == null ? gfgo.a : gfio0.l), gcio.c(fcbb0.getContext()), false, null, false);
            }
            infoMessageView0.setId(gcqy0.a());
            fcbb0.q(v5);
            fcbb0.d = z;
            fcbb0.n = this.aC;
            if(hzlv.k()) {
                kfe.j(fcbb0, new gdbl(fcbb0, v2));
            }
            this.a.addView(fcbb0);
        }
        SelectorView selectorView0 = this.a;
        selectorView0.i = this.cb;
        if(selectorView0.i != null) {
            int v6 = selectorView0.getChildCount();
            for(int v = 0; v < v6; ++v) {
                View view0 = selectorView0.getChildAt(v);
                selectorView0.i.d(((gdbk)view0).j(), ((gcjp)view0));
            }
        }
        if(hzlv.k()) {
            this.a.i(v1);
        }
        gfio gfio1 = this.ag;
        if(gfio1 != null) {
            this.a.h(gfio1.j);
        }
    }

    @Override  // gczn
    public final CharSequence U() {
        return this.c.getText();
    }

    @Override  // gdbp
    public final void aF(Object object0, Object object1) {
        gdew gdew0 = this.a.a;
        if(gdew0.f) {
            gdew0.s(false);
        }
        this.ag = (gfio)object0;
        if(this.d) {
            this.d = false;
            return;
        }
        if(((gfio)object1) != null && ((gfio)object0).j == ((gfio)object1).j) {
            return;
        }
        gcjo.e(this.cb, this.ai, ((gfio)object0).j);
    }

    @Override  // gcjs
    public final boolean aO(gfga gfga0) {
        return this.ag != null && gcjo.g(gfga0, this.ag.j);
    }

    @Override  // gdbp
    public final void ar(View view0) {
        TextView textView0 = this.b;
        if(textView0 != null) {
            textView0.setVisibility(8);
        }
        if(hzlv.k()) {
            kfd.d(view0, this.getString(0x7F1535C3));  // string:wallet_uic_selector_view_state_description_collapsed "Collapsed"
            this.a.i(this.a.getChildCount());
        }
    }

    @Override  // gdbp
    public final void as(View view0) {
        TextView textView0 = this.b;
        if(textView0 != null) {
            textView0.setVisibility(0);
        }
        if(hzlv.k()) {
            kfd.d(view0, this.getString(0x7F1535C4));  // string:wallet_uic_selector_view_state_description_expanded "Expanded"
            this.a.i(this.a.getChildCount());
        }
    }

    @Override  // gczn
    public final void at(CharSequence charSequence0) {
        this.c.setText(charSequence0);
        this.c.setVisibility((charSequence0 == null ? 8 : 0));
    }

    @Override  // gdbp
    public final void av() {
    }

    @Override  // gdbp
    public final boolean aw() {
        int v = this.a.getChildCount();
        Resources resources0 = this.getResources();
        gdcb.z(this.a, resources0.getQuantityString(0x7F1300B3, v, new Object[]{v}));  // plurals:wallet_expanding_field_selector
        return true;
    }

    @Override  // gdak
    public final long bs() {
        this.aj();
        return ((gfjj)this.aA).f;
    }

    @Override  // gdak
    public final hbzg lK() {
        gfio gfio0 = this.ag;
        if(gfio0 != null && (gfio0.b & 0x2000) != 0) {
            return gfio0.p == null ? hbzg.a : gfio0.p;
        }
        return null;
    }

    @Override  // gdak
    public final String lL(String s) {
        return gdcd.k(this.ag);
    }

    @Override  // gdaa
    public final boolean la() {
        return this.ag != null;
    }

    @Override  // gczu
    public final ArrayList lh() {
        return this.ah;
    }

    @Override  // gami
    public final List li() {
        return Collections.EMPTY_LIST;
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
                    this.ai.add(gcjm0);
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
        return false;
    }

    @Override  // gcyg
    public final gdew mb() {
        return this.ao;
    }

    @Override  // gdak
    public final void onSaveInstanceState(Bundle bundle0) {
        super.onSaveInstanceState(bundle0);
        gciq.j(bundle0, "selectedOption", ((MessageLite)this.ag));
    }

    @Override  // gcyg
    protected final View y(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        View view0 = layoutInflater0.inflate(0x7F0E0D33, null, false);  // layout:wallet_fragment_field_selector
        SelectorView selectorView0 = (SelectorView)view0.findViewById(0x7F0B1FB2);  // id:selector_view
        this.a = selectorView0;
        gdew gdew0 = this.ao;
        gdew0.d(selectorView0);
        SelectorView selectorView1 = this.a;
        selectorView1.e = this;
        selectorView1.f = this;
        selectorView1.c = this;
        selectorView1.h = this.cM();
        selectorView1.g = this.bs();
        this.c = (TextView)view0.findViewById(0x7F0B1273);  // id:error
        if(!((gfjj)this.aA).j.isEmpty()) {
            TextView textView0 = (TextView)view0.findViewById(0x7F0B13C7);  // id:field_selector_header
            this.b = textView0;
            textView0.setText(((gfjj)this.aA).j);
            this.b.setTag(0x7F0B218C, "expandedField");  // id:summary_expander_transition_name
        }
        gfjj gfjj0 = (gfjj)this.aA;
        if(!(gfjj0.c == 7 ? ((gfip)gfjj0.d) : gfip.a).c.isEmpty()) {
            gfjj gfjj1 = (gfjj)this.aA;
            if((((gfio)(gfjj1.c == 7 ? ((gfip)gfjj1.d) : gfip.a).c.get(0)).b & 0x200) != 0) {
                gfjj gfjj2 = (gfjj)this.aA;
                gfgo gfgo0 = ((gfio)(gfjj2.c == 7 ? ((gfip)gfjj2.d) : gfip.a).c.get(0)).l;
                if(gfgo0 == null) {
                    gfgo0 = gfgo.a;
                }
                this.aj = gfgo0;
            }
        }
        if(bundle0 == null) {
            gfjj gfjj3 = (gfjj)this.aA;
            int v = gdcd.a((gfjj3.c == 7 ? ((gfip)gfjj3.d) : gfip.a));
            if(v == -1) {
                this.a.a.s(true);
            }
            else {
                gfjj gfjj4 = (gfjj)this.aA;
                this.ag = (gfio)(gfjj4.c == 7 ? ((gfip)gfjj4.d) : gfip.a).c.get(v);
            }
        }
        else {
            this.ag = (gfio)gciq.a(bundle0, "selectedOption", ((Parser)((ProtoLiteMessage)gfio.a).jf(7, null)));
        }
        this.R();
        gczs gczs0 = new gczs(((gfjj)this.aA).f, this.a, null);
        this.ah.add(gczs0);
        gdew0.f(gczs0);
        return view0;
    }
}

