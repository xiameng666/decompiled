import android.view.ViewGroup;
import android.widget.LinearLayout.LayoutParams;
import com.google.android.libraries.messaging.lighter.model.AccountContext;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import j..util.Objects;
import java.util.List;

public final class fmpw implements fmwu, fmwv, fmww {
    public fmya a;
    private static final gged_interceptors b;
    private final fmqf c;
    private fmpa d;
    private final fmre e;
    private fmhr f;
    private static final fmpu g;
    private final fmpu h;

    static {
        fmpw.b = gged_interceptors.l(fmxd.b);
        fmpw.g = new fmpu();
    }

    public fmpw(fmqf fmqf0, fmre fmre0) {
        this.h = fmpw.g;
        this.c = fmqf0;
        this.e = fmre0;
    }

    @Override  // fmwu
    public final uq a(ViewGroup viewGroup0, fmxd fmxd0) {
        fmpy fmpy0 = new fmpy(viewGroup0.getContext(), this.e);
        fmpr fmpr0 = new fmpr();
        fmpr0.a = this.c;
        fmpy0.ae.e = fmpr0;
        fmpy0.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        return new fmpv(fmpy0);
    }

    @Override  // fmww
    public final fmwu b() {
        return this;
    }

    @Override  // fmww
    public final gfsx c() {
        return gfsx.m(this);
    }

    @Override  // fmwu
    public final List d() {
        return fmpw.b;
    }

    @Override  // fmwu
    public final void e(uq uq0, fmxe fmxe0, AccountContext accountContext0) {
        if((uq0 instanceof fmpv)) {
            fmpy fmpy0 = (fmpy)((fmpv)uq0).a;
            fmhr fmhr0 = fmxe0.d();
            ggdy ggdy0 = new ggdy();
            gged_interceptors gged0 = fmhr0.d;
            for(int v = 0; v < ((ggna)gged0).c; ++v) {
                fmhp fmhp0 = (fmhp)gged0.get(v);
                fmbi fmbi0 = fmhp0.e;
                if(this.c.b(fmbi0)) {
                    ggdy0.i(fmhp0);
                }
                else {
                    flbj.f("SuggestionListPr", "Action type isn\'t supported: " + fmbi0.a().name());
                }
            }
            fmhq fmhq0 = new fmhq(fmhr0);
            fmhq0.f(ggdy0.h());
            fmhr fmhr1 = fmhq0.a();
            fmpy0.ae.f = fmhr1;
            fmpy0.ae.q();
            switch(fmhr1.e) {
                case 1: {
                    fmpy0.ap(fmpy0.ac);
                    return;
                }
                case 2: {
                    fmpy0.ap(fmpy0.ad);
                }
            }
        }
    }

    @Override  // fmwu
    public final boolean f(fmga fmga0) {
        return true;
    }

    @Override  // fmww
    public final void g(fmga fmga0) {
    }

    @Override  // fmwv
    public final gmcd h(gged_interceptors gged0) {
        gfsx gfsx1;
        gmcd gmcd0 = new gmcu();
        gfsx gfsx0 = this.d.e();
        Object object0 = null;
        if(gfsx0.i()) {
            fmev fmev0 = (fmev)gfsx0.d();
            try {
                if(!gged0.isEmpty()) {
                    int v = 0;
                    while(v < gged0.size()) {
                        fmxe fmxe0 = (fmxe)gged0.get(v);
                        switch(fmxe0.b().ordinal()) {
                            case 0: {
                                gfsx1 = fmpw.k(fmxe0.a().a);
                                goto label_25;
                            }
                            case 2: {
                                gfsx1 = fmpw.k(fmxe0.c().a);
                                goto label_25;
                            }
                            case 3: {
                                gfsx1 = fmpw.k(fmxe0.e().a);
                                goto label_25;
                            }
                            case 1: 
                            case 4: {
                                gfsx1 = gfqx.a;
                                goto label_25;
                            }
                        }
                        ++v;
                        continue;
                    }
                }
                gfsx1 = gfqx.a;
            label_25:
                gfsx gfsx2 = fmev0.j;
                if(gfsx2.i() && gfsx1.i()) {
                    Object object1 = gfsx2.d();
                    if(((String)gfsx1.d()).equals(((fmhr)object1).c)) {
                        ggdy ggdy0 = new ggdy();
                        Objects.requireNonNull(object1);
                        ggdy0.i(new fmwo(((fmhr)object1)));
                        ggdy0.k(gged0);
                        ((gmcu)gmcd0).q(ggdy0.h());
                        object0 = object1;
                    }
                    else {
                        ((gmcu)gmcd0).q(gged0);
                    }
                }
                else {
                    ((gmcu)gmcd0).q(gged0);
                }
            }
            catch(RuntimeException unused_ex) {
                ((gmcu)gmcd0).q(gged0);
            }
        }
        else {
            ((gmcu)gmcd0).q(gged0);
        }
        if(this.a != null) {
            if(object0 == null) {
                this.a.c("");
            }
            else {
                String s = ((fmhr)object0).f;
                if(s.isEmpty()) {
                    this.a.c("");
                }
                else {
                    this.a.c(s);
                }
            }
        }
        if(this.f != null && (object0 == null || !object0.equals(this.f))) {
            fmre fmre0 = this.e;
            if(!this.f.d.isEmpty()) {
                ((fmuw)fmre0).f(0x7E);
            }
        }
        this.f = (fmhr)object0;
        return gmcd0;
    }

    @Override  // fmwv
    public final void i(flit flit0, ConversationId conversationId0, AccountContext accountContext0) {
        fmpa fmpa0 = flit0.f(accountContext0, conversationId0);
        this.d = fmpa0;
        fmpa0.j(new fmpt(this));
    }

    @Override  // fmwv
    public final void j(fmya fmya0) {
        this.a = fmya0;
    }

    private static final gfsx k(gfsx gfsx0) {
        return gfsx0.i() && ((fmga)gfsx0.d()).f.a() != 1 ? gfsx0.b(new fmps()) : gfqx.a;
    }
}

