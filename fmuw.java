import com.google.android.libraries.messaging.lighter.model.AccountContext;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public final class fmuw implements fmre {
    public static final ggeo a;
    public final Set b;
    public final Set c;
    public UUID d;
    public boolean e;
    public gged_interceptors f;
    public final flsl g;
    private final ConversationId h;
    private final AccountContext i;

    static {
        Integer integer0 = (int)3;
        fmuw.a = ggeo.o("tel", Integer.valueOf(1), "mailto", Integer.valueOf(2), "http", integer0, "https", integer0);
    }

    public fmuw(ConversationId conversationId0, AccountContext accountContext0, flsl flsl0) {
        this.b = new HashSet();
        this.c = new HashSet();
        this.e = true;
        this.f = ggna.a;
        this.h = conversationId0;
        this.i = accountContext0;
        this.g = flsl0;
    }

    @Override  // fmre
    public final void a() {
        this.h(0x7C);
    }

    public final fmai b(int v) {
        fmai fmai0 = fmaj.a();
        UUID uUID0 = this.d;
        if(uUID0 != null) {
            fmai0.p(uUID0.toString());
        }
        fmai0.g(v);
        fmai0.n(this.i.c().f());
        fmai0.o(this.i.d().toStringUtf8());
        fmai0.d(this.h);
        return fmai0;
    }

    public final void c(int v) {
        fmaj fmaj0 = this.b(v).a();
        this.g.b(fmaj0);
    }

    public final void d() {
        this.c(110);
    }

    public final void e(fmga fmga0) {
        if(!this.b.add(fmga0.a)) {
            return;
        }
        fmai fmai0 = this.b(105);
        fmai0.f((fmga0.r == 1 ? 0x9B : 0x9C));
        fmao fmao0 = new fmao(null);
        fmao0.d(fmga0.l);
        fmao0.b(fmga0.k.a().g);
        fmai0.i(fmao0.a());
        if(fmga0.f.a() == 3) {
            gged_interceptors gged0 = this.f;
            int v = ((ggna)gged0).c;
            for(int v1 = 0; v1 < v; ++v1) {
                fmww fmww0 = (fmww)gged0.get(v1);
                if(fmww0.b().f(fmga0)) {
                    fmww0.g(fmga0);
                }
            }
        }
        fmaj fmaj0 = fmai0.a();
        this.g.b(fmaj0);
    }

    public final void f(int v) {
        fmaj fmaj0 = this.b(v).a();
        this.g.b(fmaj0);
    }

    public final void g(String s) {
        if(!this.c.add(String.valueOf(s))) {
            return;
        }
        fmaj fmaj0 = this.b(0x7C).a();
        this.g.b(fmaj0);
    }

    public final void h(int v) {
        fmaj fmaj0 = this.b(v).a();
        this.g.b(fmaj0);
    }
}

