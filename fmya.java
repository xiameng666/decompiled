import com.google.android.libraries.messaging.lighter.model.AccountContext;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import com.google.android.libraries.messaging.lighter.ui.messagelist.MessageListView;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Executor;

public final class fmya {
    public fmtq A;
    public fmtu B;
    public fmtw C;
    public fmtx D;
    private final fmoz E;
    private final gged_interceptors F;
    private final Executor G;
    public final ConversationId a;
    public final AccountContext b;
    public final fmrx c;
    public final fmoz d;
    public final fmoz e;
    public final Map f;
    public final fmre g;
    public final fmyi h;
    public final gged_interceptors i;
    public final fmpa j;
    public fmpa k;
    public fmpe l;
    public int m;
    public boolean n;
    public boolean o;
    public boolean p;
    public gged_interceptors q;
    public boolean r;
    public final Map s;
    public String t;
    public fmxf u;
    public UUID v;
    public boolean w;
    public final MessageListView x;
    public final flit y;
    public final flen z;

    public fmya(MessageListView messageListView0, ConversationId conversationId0, AccountContext accountContext0, flit flit0, flen flen0, flkh flkh0, fmwt fmwt0, gged_interceptors gged0, fmre fmre0) {
        this.f = new HashMap();
        this.m = 0;
        this.n = false;
        this.p = false;
        this.s = new HashMap();
        this.t = "";
        this.w = false;
        if(!accountContext0.c().g().contains(conversationId0.a())) {
            throw new IllegalArgumentException("Conversation owner doesn\'t belong to the account context primary passed in");
        }
        this.x = messageListView0;
        this.a = conversationId0;
        this.b = accountContext0;
        this.y = flit0;
        this.z = flen0;
        this.g = fmre0;
        this.E = new fmxr(this);
        this.d = new fmxs(this);
        this.e = new fmxt(this);
        this.j = flkh0.a(conversationId0);
        ggdy ggdy0 = new ggdy();
        int v1 = ((ggna)gged0).c;
        for(int v2 = 0; v2 < v1; ++v2) {
            ggdy0.i(((fmww)gged0.get(v2)).b());
        }
        gged_interceptors gged1 = ggdy0.h();
        this.F = gged1;
        fmyi fmyi0 = new fmyi(fmwt0, gged1, new fmxu(this), new fmxv(this), accountContext0, conversationId0, flen0, flkh0);
        this.h = fmyi0;
        this.c = new fmrx(messageListView0, this, fmyi0);
        this.G = new gmct(flbh.b().a);
        ggdy ggdy1 = new ggdy();
        int v3 = ((ggna)gged0).c;
        for(int v4 = 0; v4 < v3; ++v4) {
            fmww fmww0 = (fmww)gged0.get(v4);
            if(fmww0.c().i()) {
                ggdy1.i(fmww0.c().d());
            }
        }
        gged_interceptors gged2 = ggdy1.h();
        this.i = gged2;
        int v5 = ((ggna)gged2).c;
        for(int v = 0; v < v5; ++v) {
            fmwv fmwv0 = (fmwv)gged2.get(v);
            fmwv0.j(this);
            fmwv0.i(this.y, this.a, this.b);
        }
    }

    public final gged_interceptors a(gged_interceptors gged0) {
        if(this.p) {
            ggdy ggdy0 = new ggdy();
            ggdy0.i(fmwq.a);
            ggdy0.k(gged0);
            return ggdy0.h();
        }
        return gged0;
    }

    public final void b() {
        this.m += 30;
        this.g();
        this.k = this.y.j(this.b, this.a, Integer.valueOf(this.m + 1), Integer.valueOf(0), fmfz.f);
        this.f();
    }

    public final void c(String s) {
        this.C.a.ag.a.a(s);
    }

    public final void d() {
        if(this.q == null) {
            return;
        }
        gged_interceptors gged0 = this.q;
        boolean z = this.r;
        fmxw fmxw0 = new fmxw(this);
        new fmxb(gged0, this.s, z, this.h.g, fmxw0).executeOnExecutor(this.G, new Void[0]);
    }

    public final void e(fmxd fmxd0) {
        fmyi fmyi0 = this.h;
        Map map0 = fmyi0.g;
        if(map0.containsKey(fmxd0)) {
            map0.remove(fmxd0);
            fmyi0.J();
        }
    }

    public final void f() {
        if(!this.n) {
            fmpa fmpa0 = this.k;
            if(fmpa0 != null) {
                fmpa0.j(this.E);
                this.n = true;
            }
        }
    }

    public final void g() {
        if(this.n) {
            fmpa fmpa0 = this.k;
            if(fmpa0 != null) {
                fmpa0.l(this.E);
                fmpe fmpe0 = this.l;
                if(fmpe0 != null) {
                    fmpe0.l(this.d);
                    this.l = null;
                }
                this.n = false;
            }
        }
    }
}

