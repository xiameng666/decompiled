import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import android.widget.LinearLayout.LayoutParams;
import com.google.android.libraries.messaging.lighter.model.AccountContext;
import j..util.Objects;
import java.util.List;

public final class fmnp implements fmwu, fmww {
    private static final gged_interceptors a;
    private final fmqf b;
    private final fmrq c;
    private final fmid d;
    private final figm e;

    static {
        fmnp.a = gged_interceptors.l(fmxd.c);
    }

    public fmnp(fmqf fmqf0, figm figm0, fmrq fmrq0, fmid fmid0) {
        this.b = fmqf0;
        this.e = figm0;
        this.c = fmrq0;
        this.d = fmid0;
    }

    @Override  // fmwu
    public final uq a(ViewGroup viewGroup0, fmxd fmxd0) {
        gftb.f(fmxd0.equals(fmxd.c), "Got non rich card CellType: %s", fmxd0);
        if(iaea.i()) {
            fmnv fmnv0 = new fmnv(viewGroup0.getContext());
            ue ue0 = ((RecyclerView)viewGroup0).i();
            fmnv0.c.aq(ue0);
            fmnv0.f = this.b;
            fmnv0.g = this.c;
            fmnv0.h = this.d;
            fmnv0.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            fmnr fmnr0 = new fmnr(fmnv0);
            fmnr0.c(this.e);
            return new fmno(fmnv0, fmnr0);
        }
        fmnt fmnt0 = new fmnt(viewGroup0.getContext());
        fmnt0.f = this.b;
        fmnt0.g = this.c;
        fmnt0.h = this.d;
        fmnt0.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        fmnr fmnr1 = new fmnr(fmnt0);
        fmnr1.c(this.e);
        return new fmno(fmnt0, fmnr1);
    }

    @Override  // fmww
    public final fmwu b() {
        return this;
    }

    @Override  // fmww
    public final gfsx c() {
        return gfqx.a;
    }

    @Override  // fmwu
    public final List d() {
        return fmnp.a;
    }

    @Override  // fmwu
    public final void e(uq uq0, fmxe fmxe0, AccountContext accountContext0) {
        if((uq0 instanceof fmno) && fmxe0.c().a.i()) {
            if(iaea.i()) {
                ((fmnv)uq0.a).e = accountContext0;
            }
            else {
                ((fmnt)uq0.a).e = accountContext0;
            }
            fmnr fmnr0 = ((fmno)uq0).t;
            fmnr0.b = null;
            fmnr0.b = fmxe0.c();
            fmnr0.b();
            fmwd fmwd0 = fmnr0.b;
            if(fmwd0 != null) {
                fmnr0.a.a(fmwd0);
                return;
            }
            flbj.c("RichCardPresenter", "Call presenter.setmessage(message) before calling start()");
        }
    }

    @Override  // fmwu
    public final boolean f(fmga fmga0) {
        gfsx gfsx0 = fmjs.a(fmga0);
        if(!gfsx0.i()) {
            return false;
        }
        switch(((fmlz)gfsx0.d()).b().ordinal()) {
            case 0: {
                return fmnp.h(((fmlz)gfsx0.d()).c());
            }
            case 1: {
                return fmnp.h(((fmlz)gfsx0.d()).d().a);
            }
            case 2: {
                if(((fmlz)gfsx0.d()).a().b.isEmpty()) {
                    return false;
                }
                gged_interceptors gged0 = ((fmlz)gfsx0.d()).a().b;
                int v = 0;
                while(v < ((ggna)gged0).c) {
                    boolean z = fmnp.h(((fmmb)gged0.get(v)));
                    ++v;
                    if(!z) {
                        return false;
                    }
                }
                return true;
            }
            default: {
                return true;
            }
        }
    }

    @Override  // fmww
    public final void g(fmga fmga0) {
        gfsx gfsx0 = fmjs.a(fmga0);
        if(!gfsx0.i()) {
            return;
        }
        fmlz fmlz0 = (fmlz)gfsx0.d();
        int v = 1;
        int v1 = fmlz0.b().equals(fmly.c) ? ((ggna)fmlz0.a().b).c : 1;
        int v2 = fmlz0.b().ordinal();
        if(v2 != 0) {
            switch(v2) {
                case 1: {
                    v = 2;
                    break;
                }
                case 2: {
                    v = 3;
                    break;
                }
                default: {
                    throw new RuntimeException(null, null);
                }
            }
        }
        fmaq fmaq0 = new fmaq(v, v1);
        Objects.requireNonNull(fmaq0);
        gfsx.m(new fmdt(fmaq0));
    }

    private static final boolean h(fmmb fmmb0) {
        gged_interceptors gged0 = fmmb0.a;
        int v = ((ggna)gged0).c;
        int v1 = 0;
        while(v1 < v) {
            fmmj fmmj0 = (fmmj)gged0.get(v1);
            switch(fmmj0.a().ordinal()) {
                case 0: {
                    goto label_7;
                }
                case 1: {
                    return fmom.a(fmmj0.c());
                }
            }
            ++v1;
            continue;
        label_7:
            gged_interceptors gged1 = fmmj0.b().a;
            int v2 = 0;
            while(v2 < ((ggna)gged1).c) {
                boolean z = fmom.a(((fmmo)gged1.get(v2)));
                ++v2;
                if(!z) {
                    return false;
                }
            }
            ++v1;
            continue;
        }
        return true;
    }
}

