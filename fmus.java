import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.google.android.libraries.messaging.lighter.model.AccountContext;
import com.google.android.libraries.messaging.lighter.model.ConversationId.IdType;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import com.google.android.libraries.messaging.lighter.ui.conversation.ConversationView;
import j..util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public final class fmus implements fmqf {
    public gged_interceptors A;
    public final fmyo B;
    public gfsx C;
    public final fmoz D;
    public final gmcg E;
    public fmpa F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    fmyu K;
    public fmqq L;
    public final fmvw M;
    public boolean N;
    public boolean O;
    public String P;
    gged_interceptors Q;
    gged_interceptors R;
    public UUID S;
    fmzg T;
    public final AtomicBoolean U;
    public final AtomicBoolean V;
    public final AtomicBoolean W;
    public final fmoz X;
    public final fmoz Y;
    public final fmoz Z;
    public final View a;
    public final fmoz aa;
    final MenuItem.OnMenuItemClickListener ab;
    final MenuItem.OnMenuItemClickListener ac;
    final MenuItem.OnMenuItemClickListener ad;
    public final MenuItem.OnMenuItemClickListener ae;
    final MenuItem.OnMenuItemClickListener af;
    public final fmsg ag;
    public final flsl ah;
    public fmvc ai;
    public final fldt aj;
    public final flit ak;
    public final fleb al;
    public final fliu am;
    public fmya an;
    public fmvn ao;
    private final Map ap;
    private final AtomicBoolean aq;
    private final flen ar;
    private final flkh as;
    private fmzq at;
    public final ConversationId b;
    public final fmut c;
    public final flbv d;
    public final AccountContext e;
    public final fmuw f;
    public String g;
    public final fmpa h;
    public final fmpa i;
    public final fmwt j;
    public final Handler k;
    public final Runnable l;
    public MenuItem m;
    public MenuItem n;
    public MenuItem o;
    public MenuItem p;
    public int q;
    public final SparseArray r;
    final List s;
    public final List t;
    public fmrc u;
    public final fmoz v;
    public fmpa w;
    public fmsn x;
    public final gfsx y;
    public final fmpa z;

    public fmus(View view0, ConversationId conversationId0, AccountContext accountContext0, flbv flbv0, fldt fldt0, flit flit0, flen flen0, flkh flkh0, fliu fliu0, fleb fleb0, flsl flsl0) {
        fmut fmut0 = fmut.a;
        super();
        this.g = "";
        gfqx gfqx0 = gfqx.a;
        this.q = 1;
        this.r = new SparseArray();
        this.s = new ArrayList();
        this.t = new ArrayList();
        this.ap = ggnf.a;
        this.x = new fmtb();
        gged_interceptors gged0 = ggna.a;
        this.A = gged0;
        this.C = gfqx0;
        this.D = new fmtc(this);
        this.E = flbs.b().a;
        this.G = false;
        this.H = false;
        this.I = false;
        this.O = true;
        this.P = "";
        this.U = new AtomicBoolean(false);
        this.V = new AtomicBoolean(false);
        this.W = new AtomicBoolean(false);
        this.aq = new AtomicBoolean(false);
        this.X = new fmtd(this);
        this.Y = new fmuj(this);
        this.Z = new fmte(this);
        this.aa = new fmtf(this);
        this.ab = new fmun(this);
        this.ac = new fmuo(this);
        this.ad = new fmup(this);
        this.ae = new fmth();
        new fmuq(this);
        this.af = new fmss(this);
        this.ah = flsl0;
        if(!accountContext0.c().g().contains(conversationId0.a())) {
            throw new IllegalArgumentException("Conversation owner doesn\'t belong to the account context");
        }
        this.a = view0;
        this.b = conversationId0;
        this.e = accountContext0;
        this.c = fmut0;
        this.d = flbv0;
        this.aj = fldt0;
        this.ak = flit0;
        this.al = fleb0;
        this.ar = flen0;
        this.as = flkh0;
        this.am = fliu0;
        this.v = new fmst(this);
        fmuw fmuw0 = new fmuw(conversationId0, accountContext0, flsl0);
        this.f = fmuw0;
        this.h = flit0.g(accountContext0, conversationId0, new flgp(), new flgq());
        this.F = flen0.d(accountContext0, accountContext0.c().f());
        this.y = conversationId0.e() == ConversationId.IdType.a ? gfsx.m(flen0.d(accountContext0, conversationId0.c())) : gfqx0;
        this.z = fliu0.a(conversationId0);
        this.i = fldt0.b(accountContext0, conversationId0);
        fmsg fmsg0 = new fmsg(accountContext0, conversationId0, flkh0, ((ConversationView)view0).c);
        this.ag = fmsg0;
        fmsg0.b = new fmsu(this);
        this.j = new fmwt(fmuw0);
        this.l(gged0);
        fmvc fmvc0 = new fmvc(conversationId0, this.y, accountContext0, flit0, ((ConversationView)view0).m);
        this.ai = fmvc0;
        fmvc0.i = new fmsv(this);
        if(iaea.l()) {
            fmvc fmvc1 = this.ai;
            fmvc1.j = new fmsw(this);
        }
        fmvc fmvc2 = this.ai;
        fmvc2.f = new fmsx(this);
        ((fmrd)view0).aL(this);
        ((ConversationView)view0).g = this;
        fmyo fmyo0 = new fmyo(flit0, ((ConversationView)view0).e, this, accountContext0);
        this.B = fmyo0;
        fmyo0.e = new fmsz(view0);
        this.M = new fmvw(((ConversationView)view0).f);
        this.k = new Handler();
        this.l = new fmta(view0);
        glzd.f(flbv0.a(accountContext0, 1), new fmto(this), gmap.a);
    }

    @Override  // fmqf
    public final void a(fmbi fmbi0) {
        fmaj fmaj0 = this.f.b(0x7B).a();
        this.f.g.b(fmaj0);
        if(!fmbi0.a().equals(fmba.d)) {
            this.g(fmbi0.f);
        }
        gfsx gfsx0 = fmbi0.d;
        if(gfsx0.i()) {
            fmba fmba0 = fmbi0.b();
            Object object0 = gfsx0.d();
            String s = (String)fmbi0.c.f("");
            gmcd gmcd0 = this.ak.u(this.e, this.b, ((fmbc)object0), s, fmbi0.b, gfqx.a);
            if(fmba0 != fmba.g) {
                gmbu.t(gmcd0, new fmue(this, fmbi0), flbk.a());
            }
        }
    }

    @Override  // fmqf
    public final boolean b(fmbi fmbi0) {
        switch(fmbi0.a().ordinal()) {
            case 3: {
                return false;
            }
            case 1: 
            case 2: 
            case 4: 
            case 6: 
            case 7: 
            case 8: 
            case 9: 
            case 10: {
                return true;
            }
            case 0: 
            case 5: 
            case 11: {
                return false;
            }
            default: {
                throw new RuntimeException(null, null);
            }
        }
    }

    @Override  // fmqf
    public final int c() {
        return 2;
    }

    public final fmpa d() {
        fmtn fmtn0 = new fmtn();
        return fmot.d(this.ak.j(this.e, this.b, Integer.valueOf(1), null, fmfz.f), fmtn0);
    }

    public final void e() {
        if(this.U.get() && this.V.get() && this.W.get() && this.aq.compareAndSet(false, true)) {
            this.x.a();
        }
    }

    // Detected as a lambda impl.
    final void f() {
        View view0 = this.a;
        if(view0 != null) {
            String s = view0.getContext().getString(0x7F150D16, new Object[]{this.g});  // string:delete_conversation_format "Deleting Conversation with %1$s"
            ((ConversationView)view0).h = fyxp.t(((ConversationView)view0).findViewById(0x7F0B18FE), s, -2);  // id:messages_list
            ((TextView)((ConversationView)view0).h.j.findViewById(0x7F0B2078)).setAllCaps(false);  // id:snackbar_text
            ((ConversationView)view0).h.q(((ConversationView)view0).o);
            ((ConversationView)view0).h.i();
        }
        gmbu.t(glzd.g(this.ak.n(this.e, this.b), new flgr(this.ak, this.e, this.b), gmap.a), new fmud(this), flbk.a());
    }

    public final void g(fmaz fmaz0) {
        boolean z = false;
        switch(fmaz0.a().ordinal()) {
            case 1: {
                this.p(fmaz0.d().a, fmaz0.d().b, false);
                return;
            }
            case 2: {
                ((ConversationView)this.a).j = fmaz0.c().b;
                String s = fmaz0.c().a;
                this.ag.a.c(s);
                ((ConversationView)this.a).k = fmaz0.c().a;
                return;
            }
            case 4: {
                glzd.f(this.d.a(this.e, 24), new fmtl(this, fmaz0), gmap.a);
                return;
            }
            case 7: {
                Intent intent0 = new Intent("android.intent.action.DIAL");
                intent0.setData(Uri.parse(("tel:" + fmaz0.h())));
                this.a.getContext().startActivity(intent0, null);
                return;
            }
            case 8: {
                String s1 = fmaz0.j();
                fmfr fmfr0 = fmcs.c(s1);
                gfsx gfsx0 = gfsx.m(s1);
                ggeo ggeo0 = ggeo.k(this.ap);
                fmfm fmfm0 = new fmfm(flit.J(this.b, fmfr0, s1, gfsx0, gfqx.a, ggeo0));
                fmfm0.c = fmcw.a;
                fmga fmga0 = fmfm0.a();
                this.ak.s(this.e, fmga0);
                return;
            }
            case 9: {
                if(this.C.i()) {
                    fmga[] arr_fmga = {((fmga)this.C.d())};
                    this.ak.q(this.e, arr_fmga);
                    ((ConversationView)this.a).f();
                }
                if(fmaz0.b().a.i()) {
                    fmyo fmyo0 = this.B;
                    Object object0 = fmaz0.b().a.d();
                    if(((ConversationView)this.a).b.getHeight() == ((ConversationView)this.a).b.getBottom()) {
                        z = true;
                    }
                    fmyo0.a.d(((fmfw)object0), z);
                    fmyo0.a.findViewById(0x7F0B1173).setOnClickListener(new fmym(fmyo0, ((fmfw)object0)));  // id:dismiss_button
                    fmyo0.a.findViewById(0x7F0B22B8).requestFocus();  // id:title
                    fmyo0.a.findViewById(0x7F0B22B8).sendAccessibilityEvent(0x8000);  // id:title
                    long v = TimeUnit.SECONDS.toMillis(((long)((fmfw)object0).e));
                    fmyo0.c.postDelayed(fmyo0.d, v);
                }
                return;
            }
            case 10: {
                this.i(fmaz0.g().a());
            }
        }
    }

    // Detected as a lambda impl.
    final void h() {
        ((ConversationView)this.a).a();
        gmbu.t(this.aj.f(this.e, this.b), new fmuk(this), flbk.a());
    }

    public final void i(String s) {
        new ank().a().a(this.a.getContext(), Uri.parse(s));
    }

    public final void j() {
        if(this.T != null) {
            flbj.a("ConvPresenter", "hideInfoIconTooltip: Hiding InfoIconTooltip");
            this.T.a.c();
            return;
        }
        flbj.a("ConvPresenter", "hideInfoIconTooltip: Cannot hide tooltip because it is null.");
    }

    public final void k() {
        this.F.l(this.Y);
        fmyu fmyu0 = this.K;
        if(fmyu0 != null) {
            ((ConversationView)this.a).c(fmyu0);
            this.K = null;
            this.j();
            this.T = null;
        }
    }

    public final void l(gged_interceptors gged0) {
        fmya fmya0 = new fmya(((ConversationView)this.a).l, this.b, this.e, this.ak, this.ar, this.as, this.j, gged0, this.f);
        this.an = fmya0;
        fmya0.A = new fmtq(this);
        fmya0.B = new fmtu(this);
        Objects.requireNonNull(this.f);
        fmya0.u = new fmtv(this.f);
        fmya fmya1 = this.an;
        fmya1.C = new fmtw(this);
        fmya1.D = new fmtx(this);
        fmya1.t = this.P;
        glzd.f(this.d.a(this.e, 2), new fmty(this), gmap.a);
        glzd.f(this.d.a(this.e, 6), new fmtz(this), gmap.a);
        glzd.f(this.d.a(this.e, 3), new fmsp(this), gmap.a);
        glzd.f(this.d.a(this.e, 5), new fmsq(this), gmap.a);
        glzd.f(this.d.a(this.e, 11), new fmsr(this), gmap.a);
    }

    public final void m(boolean z, boolean z1) {
        if(z) {
            this.am.c(this.b);
        }
        View view0 = this.a;
        if(view0 != null) {
            fyxp fyxp0 = ((ConversationView)view0).h;
            if(fyxp0 != null && fyxp0.l()) {
                ((ConversationView)view0).h.e();
            }
            if(!z) {
                String s = view0.getContext().getText(0x7F150D15).toString();  // string:delete_conversation_failure_string "Trouble deleting, please try again"
                fmtk fmtk0 = (/* MISSING LAMBDA PARAMETER */) -> {
                    View view0 = this.a;
                    if(view0 != null) {
                        String s = view0.getContext().getString(0x7F150D16, new Object[]{this.g});  // string:delete_conversation_format "Deleting Conversation with %1$s"
                        ((ConversationView)view0).h = fyxp.t(((ConversationView)view0).findViewById(0x7F0B18FE), s, -2);  // id:messages_list
                        ((TextView)((ConversationView)view0).h.j.findViewById(0x7F0B2078)).setAllCaps(false);  // id:snackbar_text
                        ((ConversationView)view0).h.q(((ConversationView)view0).o);
                        ((ConversationView)view0).h.i();
                    }
                    gmbu.t(glzd.g(this.ak.n(this.e, this.b), new flgr(this.ak, this.e, this.b), gmap.a), new fmud(this), flbk.a());
                };
                ((ConversationView)view0).h = fyxp.t(((ConversationView)view0).findViewById(0x7F0B18FE), s, 0);  // id:messages_list
                ((TextView)((ConversationView)view0).h.j.findViewById(0x7F0B2074)).setAllCaps(false);  // id:snackbar_action
                fyxp fyxp1 = ((ConversationView)view0).h;
                fyxp1.q(((ConversationView)view0).o);
                fyxp1.v(((ConversationView)view0).getContext().getText(0x7F152F0D), fmtk0);  // string:snackbar_retry "Retry"
                ((ConversationView)view0).h.i();
                return;
            }
            if(!z1) {
                iaea.l();
            }
        }
    }

    public final void n() {
        List list0 = this.s;
        if(!list0.isEmpty()) {
            for(Object object0: list0) {
                ((ConversationView)this.a).m.b(((MenuItem)object0).getItemId());
            }
            list0.clear();
        }
        List list1 = this.t;
        if(!list1.isEmpty()) {
            for(Object object1: list1) {
                ((ConversationView)this.a).m.b(((MenuItem)object1).getItemId());
            }
            list1.clear();
        }
        this.r.clear();
        this.q = 1;
    }

    public final void o(fmga fmga0) {
        if(fmga0.g != fmft.g) {
            return;
        }
        fmaj fmaj0 = this.f.b(101).a();
        this.f.g.b(fmaj0);
        this.u(fmga0);
    }

    public final void p(String s, String s1, boolean z) {
        if(this.K != null) {
            this.J = true;
            this.k();
        }
        ConversationId conversationId0 = this.b;
        this.as.e(conversationId0);
        if(!TextUtils.isEmpty(s)) {
            ggek ggek0 = new ggek();
            if(!gfta.c(s1)) {
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hfrn.a).v_newBuilder();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((hfrn)hftp0.b_message).b = "type.googleapis.com/google.protobuf.StringValue";
                ByteString hfsf0 = hfwi.b(s1).getDefaultInstanceForType();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((hfrn)hftp0.b_message).c = hfsf0;
                ggek0.i("l_act_callback_payload", ((hfrn)hftp0.N_build()).getDefaultInstanceForType());
            }
            ggek0.m(this.ap);
            fmfr fmfr0 = fmcs.c(s);
            gfsx gfsx0 = gfsx.m(s);
            ggeo ggeo0 = ggek0.b();
            fmga fmga0 = flit.J(conversationId0, fmfr0, s, gfsx0, gfqx.a, ggeo0);
            fmaj fmaj0 = this.f.b(100).a();
            this.f.g.b(fmaj0);
            this.u(fmga0);
        }
        if(z) {
            gfsx gfsx1 = this.z.e();
            if(gfsx1.i()) {
                gged_interceptors gged0 = (gged_interceptors)gfsx1.d();
                int v = gged0.size();
                for(int v1 = 0; v1 < v; ++v1) {
                    fmff fmff0 = (fmff)gged0.get(v1);
                    String s2 = fmff0.a().a;
                    this.am.b(conversationId0, s2);
                    this.u(fmff0.a());
                }
            }
        }
        ((ConversationView)this.a).l.ac.ap(((ConversationView)this.a).l, 0);
    }

    public final void q() {
        fmzq fmzq0 = this.at;
        if(fmzq0 != null) {
            fmzq0.c = () -> {
                ((ConversationView)this.a).a();
                gmbu.t(this.aj.f(this.e, this.b), new fmuk(this), flbk.a());
            };
            fmzq0.b();
        }
        fmrc fmrc0 = this.u;
        if(fmrc0 != null) {
            fmrc0.b();
        }
    }

    public final void r() {
        fmrc fmrc0 = this.u;
        if(fmrc0 != null) {
            fmrc0.a.l(fmrc0);
            gfsx gfsx0 = fmrc0.b;
            if(gfsx0.i()) {
                ((fmpa)gfsx0.d()).l(fmrc0.e);
            }
        }
        fmzq fmzq0 = this.at;
        if(fmzq0 != null) {
            fmzq0.a.l(fmzq0);
            gfsx gfsx1 = fmzq0.b;
            if(gfsx1.i()) {
                ((fmpa)gfsx1.d()).l(fmzq0.e);
            }
        }
    }

    public final void s() {
        int v = 0;
        synchronized(this) {
            if(this.ai != null) {
                if(this.H) {
                    View view0 = this.a;
                    fmzs fmzs0 = ((ConversationView)view0).q;
                    if(fmzs0 == null) {
                        ((ConversationView)view0).q = new fmzs(((ConversationView)view0).getContext());
                        LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(-1, -2);
                        ((ConversationView)view0).a.addView(((ConversationView)view0).q, linearLayout$LayoutParams0);
                    }
                    else {
                        fmzs0.setVisibility(0);
                    }
                    ((ConversationView)view0).q.requestFocus();
                    ((View)((ConversationView)view0).c).setVisibility(8);
                    ((ConversationView)view0).d.setVisibility(8);
                    this.t(0x7F15347B);  // string:unblock "Unblock"
                    if(this.at == null) {
                        fmzq fmzq0 = new fmzq(((ConversationView)view0).q, this.h, this.y, this.I);
                        this.at = fmzq0;
                        fmzq0.c = () -> {
                            ((ConversationView)this.a).a();
                            gmbu.t(this.aj.f(this.e, this.b), new fmuk(this), flbk.a());
                        };
                        if(this.G) {
                            fmzq0.b();
                        }
                    }
                    fmyu fmyu0 = this.K;
                    if(fmyu0 != null) {
                        ((ConversationView)view0).c(fmyu0);
                    }
                    this.an.e(fmxd.b);
                    return;
                }
                View view1 = this.a;
                fmzs fmzs1 = ((ConversationView)view1).q;
                if(fmzs1 != null) {
                    fmzs1.setVisibility(8);
                }
                ((View)((ConversationView)view1).c).setVisibility(0);
                ((ConversationView)view1).d.setVisibility(0);
                if(this.O) {
                    fmyi fmyi0 = this.an.h;
                    gged_interceptors gged0 = fmyi0.h;
                    int v2 = ((ggna)gged0).c;
                    fmxd fmxd0 = fmxd.b;
                alab1:
                    while(v < v2) {
                        fmwu fmwu0 = (fmwu)gged0.get(v);
                        ggqk ggqk0 = ((gged_interceptors)fmwu0.d()).E();
                        while(ggqk0.hasNext()) {
                            Object object0 = ggqk0.next();
                            fmxd fmxd1 = (fmxd)object0;
                            if(!fmxd0.equals(fmxd1)) {
                                continue;
                            }
                            fmyi0.g.put(fmxd1, fmwu0);
                            fmyi0.J();
                            break alab1;
                        }
                        ++v;
                    }
                }
                this.t(0x7F15053B);  // string:block_and_report "Block/report spam"
                fmyu fmyu1 = this.K;
                if(fmyu1 != null) {
                    ((ConversationView)view1).k(fmyu1);
                }
            }
        }
    }

    private final void t(int v) {
        MenuItem menuItem0 = this.m;
        if(menuItem0 != null) {
            menuItem0.setTitle(v);
        }
    }

    private final void u(fmga fmga0) {
        fmtp fmtp0 = new fmtp(this);
        this.k.post(fmtp0);
        fmam.a().b("MessageSentLatency", fmga0);
        fmam.a().b("MessagePerceivedSentLatency", fmga0);
        fmam.a().b("MessageDeliveredLatency", fmga0);
        fmam.a().b("MessagePerceivedDeliveredLatency", fmga0);
        gmbu.t(flbw.a(this.ak, this.e, fmga0, (fmga0.g == fmft.g ? 2 : 1)), new fmuh(this, fmga0), flbk.a());
    }
}

