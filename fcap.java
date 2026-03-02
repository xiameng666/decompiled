import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.wallet.clientlog.LogContext;
import com.google.android.wallet.ui.common.InfoMessageView;
import com.google.android.wallet.ui.common.SelectorView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

public final class fcap extends gdak implements gcjs, gczo, gdbp {
    SelectorView a;
    public long ag;
    private final gdew ah;
    private long[] ai;
    private final gamj aj;
    LinearLayout b;
    TextView c;
    public final HashMap d;

    public fcap() {
        this.d = new HashMap(3);
        this.ag = 0L;
        this.ah = new gdew();
        this.aj = new gamj(15);
    }

    @Override  // gami
    public final gamj B() {
        return this.aj;
    }

    @Override  // gdak
    protected final gewg C() {
        return null;
    }

    @Override  // gdak
    protected final Parser D() {
        return (Parser)((ProtoLiteMessage)gexm.a).jf(7, null);
    }

    public final gexn I() {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gexn.a).v_newBuilder();
        Object object0 = this.d.get(Long.valueOf(this.ag));
        if((object0 instanceof gexm)) {
            ByteString hfsf0 = ((gexm)object0).k;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gexn gexn0 = (gexn)hftp0.b_message;
            hfsf0.getClass();
            gexn0.b |= 1;
            gexn0.c = hfsf0;
        }
        else if((object0 instanceof gexl)) {
            ByteString hfsf1 = ((gexl)object0).f;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gexn gexn1 = (gexn)hftp0.b_message;
            hfsf1.getClass();
            gexn1.b |= 1;
            gexn1.c = hfsf1;
        }
        gexm gexm0 = (gexm)this.aA;
        if((gexm0.b & 1) != 0) {
            String s = (gexm0.c == null ? gewg.a : gexm0.c).c;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            s.getClass();
            ((gexn)hftv0).b |= 2;
            ((gexn)hftv0).d = s;
            gewg gewg0 = ((gexm)this.aA).c;
            if(gewg0 == null) {
                gewg0 = gewg.a;
            }
            long v = gewg0.d;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv1 = hftp0.b_message;
            ((gexn)hftv1).b |= 4;
            ((gexn)hftv1).e = v;
            gewg gewg1 = ((gexm)this.aA).c;
            if(gewg1 == null) {
                gewg1 = gewg.a;
            }
            ByteString hfsf2 = gewg1.e;
            if(!hftv1.isImmutable()) {
                hftp0.ensureMutable();
            }
            gexn gexn2 = (gexn)hftp0.b_message;
            hfsf2.getClass();
            gexn2.b |= 8;
            gexn2.f = hfsf2;
        }
        return (gexn)hftp0.N_build();
    }

    @Override  // gdcm
    protected final void M() {
        boolean z = this.ca;
        SelectorView selectorView0 = this.a;
        if(selectorView0 != null) {
            selectorView0.setEnabled(z);
        }
    }

    public static fcap N(gexm gexm0, int v, LogContext logContext0) {
        fcap fcap0 = new fcap();
        fcap0.setArguments(fcap.al(v, ((MessageLite)gexm0), logContext0));
        return fcap0;
    }

    @Override  // gdbp
    public final void aF(Object object0, Object object1) {
        if(object1 == null || fcaq.f(object1) != fcaq.f(object0)) {
            this.ag = fcaq.f(object0);
        }
        if(this.c != null && this.c.getVisibility() == 0) {
            this.c.setVisibility(8);
        }
    }

    @Override  // gcjs
    public final boolean aO(gfga gfga0) {
        return gcjo.g(gfga0, this.ag);
    }

    @Override  // gdbp
    public final void ar(View view0) {
        LinearLayout linearLayout0 = this.b;
        if(linearLayout0 != null) {
            linearLayout0.setVisibility(8);
        }
    }

    @Override  // gdbp
    public final void as(View view0) {
        LinearLayout linearLayout0 = this.b;
        if(linearLayout0 != null) {
            linearLayout0.setVisibility(0);
        }
    }

    @Override  // gdbp
    public final void av() {
    }

    @Override  // gdbp
    public final boolean aw() {
        int v = this.ai.length;
        Resources resources0 = this.getResources();
        gdcb.z(this.a, resources0.getQuantityString(0x7F1300B2, v, new Object[]{v}));  // plurals:wallet_expanding_customer_selector
        return true;
    }

    @Override  // gdak
    public final long bs() {
        this.aj();
        return ((gexm)this.aA).d;
    }

    @Override  // gdak
    protected final boolean lM(List list0, boolean z) {
        if(this.ag == ((gexm)this.aA).i) {
            if(z) {
                TextView textView0 = this.c;
                if(textView0 != null) {
                    textView0.setVisibility(0);
                }
            }
            return false;
        }
        return super.lM(list0, z);
    }

    @Override  // gdaa
    public final boolean la() {
        return false;
    }

    @Override  // gczu
    public final ArrayList lh() {
        return new ArrayList();
    }

    @Override  // gami
    public final List li() {
        return Collections.EMPTY_LIST;
    }

    @Override  // gcjs
    public final void lk(ArrayList arrayList0) {
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            gfga gfga0 = ((gcjm)arrayList0.get(v1)).a;
            int v2 = gffw.a(gfga0.e);
            int v3 = 1;
            if(v2 == 0) {
                v2 = 1;
            }
            if(v2 - 1 != 3) {
                Locale locale0 = Locale.US;
                int v4 = gffw.a(gfga0.e);
                if(v4 != 0) {
                    v3 = v4;
                }
                throw new IllegalArgumentException(String.format(locale0, "Unsupported trigger type: %s", ((int)(v3 - 1))));
            }
        }
    }

    @Override  // gdaa
    public final boolean ly(getg getg0) {
        return false;
    }

    @Override  // gcyg
    public final gdew mb() {
        return this.ah;
    }

    @Override  // gdak
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        boolean z = ((gexm)this.aA).j.isEmpty();
        int v = z ? ((gexm)this.aA).g.size() : ((gexm)this.aA).g.size() + 1;
        this.ai = new long[v];
        for(int v1 = 0; v1 < v; ++v1) {
            if(v1 == v - 1 && !z) {
                this.ai[v1] = fcaq.f(this.aA);
                this.d.put(Long.valueOf(this.ai[v1]), this.aA);
            }
            else {
                long[] arr_v = this.ai;
                arr_v[v1] = fcaq.f(((gexl)((gexm)this.aA).g.get(v1)));
                Long long0 = (long)this.ai[v1];
                gexl gexl0 = (gexl)((gexm)this.aA).g.get(v1);
                this.d.put(long0, gexl0);
            }
        }
    }

    @Override  // gdcm
    public final void onResume() {
        fcao fcao0;
        Object object0;
        super.onResume();
        long v = this.ag;
        if(v == ((gexm)this.aA).i) {
            object0 = null;
        }
        else {
            object0 = this.d.containsKey(Long.valueOf(v)) ? this.d.get(Long.valueOf(this.ag)) : this.d.get(Long.valueOf(fcaq.f(this.aA)));
        }
        this.a.removeAllViews();
        Context context0 = this.getContext();
        int v1 = 0;
        while(v1 < this.ai.length) {
            Object object1 = this.d.get(Long.valueOf(this.ai[v1]));
            if((object1 instanceof gexl)) {
                fcao0 = new fcao(context0);
                fcao0.p = (gexl)object1;
                StringBuilder stringBuilder0 = new StringBuilder();
                for(int v2 = 0; v2 < ((gexl)object1).d.size(); ++v2) {
                    stringBuilder0.append(fbgn.k(((gfgr)((gexl)object1).d.get(v2)).f));
                    if(v2 != ((gexl)object1).d.size() - 1) {
                        stringBuilder0.append("\n");
                    }
                }
                fcao0.a.setText(((gexl)object1).c);
                fcao0.b.setText(stringBuilder0.toString());
                fcao0.b.setVisibility(0);
                fcao0.setEnabled(true);
                fcao0.q(fcaq.f(object1));
                fcao0.n = this.aC;
                this.a.addView(fcao0);
                ++v1;
                continue;
            }
            if(!(object1 instanceof gexm)) {
                throw new IllegalArgumentException(String.format("%s %s", "Unexpected option type: ", object1));
            }
            fcao0 = new fcam(context0);
            fcao0.p = (gexm)object1;
            fcao0.a.setText(((gexm)object1).j);
            fcao0.q(fcaq.f(object1));
            fcao0.n = this.aC;
            this.a.addView(fcao0);
            ++v1;
            continue;
        }
        long v3 = object0 == null ? 0L : fcaq.f(object0);
        this.a.h(v3);
    }

    @Override  // gdak
    public final void onSaveInstanceState(Bundle bundle0) {
        super.onSaveInstanceState(bundle0);
        bundle0.putLong("selectedOptionUiRef", this.ag);
        bundle0.putBoolean("isErrorVisible", this.c.getVisibility() == 0);
    }

    @Override  // gcyg
    protected final View y(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        View view0 = layoutInflater0.inflate(0x7F0E0D2C, null, false);  // layout:wallet_fragment_customer_selector
        SelectorView selectorView0 = (SelectorView)view0.findViewById(0x7F0B107F);  // id:customer_selector_view
        this.a = selectorView0;
        this.ah.d(selectorView0);
        this.a.e = this;
        this.a.f = this;
        this.a.a.s(((gexm)this.aA).l);
        SelectorView selectorView1 = this.a;
        selectorView1.h = this.cM();
        selectorView1.g = this.bs();
        int v = ((gexm)this.aA).f.size();
        if(v > 0) {
            gcqy gcqy0 = this.cH();
            LinearLayout linearLayout0 = (LinearLayout)view0.findViewById(0x7F0B107E);  // id:customer_selector_header
            this.b = linearLayout0;
            linearLayout0.setTag(0x7F0B218C, "expandedField");  // id:summary_expander_transition_name
            for(int v1 = 0; v1 < v; ++v1) {
                InfoMessageView infoMessageView0 = (InfoMessageView)this.bW.inflate(0x7F0E0C49, this.b, false);  // layout:view_info_message_text
                infoMessageView0.setId(gcqy0.a());
                infoMessageView0.p(((gfgr)((gexm)this.aA).f.get(v1)));
                this.b.addView(infoMessageView0);
            }
            if(this.a.a.c) {
                this.b.setVisibility(0);
            }
        }
        this.c = (TextView)view0.findViewById(0x7F0B1273);  // id:error
        if(bundle0 != null && bundle0.getBoolean("isErrorVisible", false)) {
            this.c.setVisibility(0);
        }
        if(bundle0 != null && bundle0.containsKey("selectedOptionUiRef")) {
            this.ag = bundle0.getLong("selectedOptionUiRef");
            return view0;
        }
        MessageLite hfvm0 = this.aA;
        long v2 = ((gexm)hfvm0).h;
        if(v2 == 0L) {
            this.ag = fcaq.f(hfvm0);
            return view0;
        }
        this.ag = v2;
        return view0;
    }
}

