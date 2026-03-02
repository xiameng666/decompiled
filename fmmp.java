import android.content.res.Resources;
import android.view.ViewGroup;
import com.google.android.libraries.messaging.lighter.model.AccountContext;
import java.util.List;

public final class fmmp extends tk {
    public boolean a;
    private final fmqf e;
    private final fmrq f;
    private final fmid g;
    private gged_interceptors h;
    private int i;
    private int j;
    private final ue k;
    private final fmga l;
    private final AccountContext m;

    public fmmp(fmqf fmqf0, fmrq fmrq0, fmid fmid0, ue ue0, AccountContext accountContext0, fmga fmga0) {
        this.h = ggna.a;
        this.e = fmqf0;
        this.f = fmrq0;
        this.g = fmid0;
        this.k = ue0;
        this.m = accountContext0;
        this.l = fmga0;
    }

    public final void G(int v) {
        this.i = v;
        this.q();
    }

    @Override  // tk
    public final int b() {
        return this.h.size();
    }

    @Override  // tk
    public final int dx(int v) {
        return 8;
    }

    @Override  // tk
    public final uq dz(ViewGroup viewGroup0, int v) {
        if(iaea.i()) {
            fmoj fmoj0 = new fmoj(viewGroup0.getContext());
            fmoj0.j = this.k;
            fmoj0.a.aq(this.k);
            fmoj0.b.aq(this.k);
            return new uq(fmoj0);
        }
        return new uq(new fmog(viewGroup0.getContext()));
    }

    public final void f(List list0) {
        this.h = gged_interceptors.i(list0);
        this.q();
    }

    @Override  // tk
    public final void h(uq uq0, int v) {
        fmmb fmmb0 = (fmmb)this.h.get(v);
        int v1 = this.h.size();
        if(iaea.i()) {
            ((fmoj)uq0.a).a(fmmb0, this.e, this.f, this.g, this.m, this.l);
            ((fmoj)uq0.a).g = this.i;
            ((fmoj)uq0.a).h = this.j;
            ((fmoj)uq0.a).i = this.a;
            Resources resources0 = ((fmoj)uq0.a).getResources();
            ((fmoj)uq0.a).setContentDescription(resources0.getString(0x7F152608, new Object[]{((int)(v + 1)), v1}));  // string:position_in_collection_format "%1$d of %2$d"
            return;
        }
        ((fmog)uq0.a).a(fmmb0, this.e, this.f, this.g, this.m, this.l);
        ((fmog)uq0.a).b = this.i;
        ((fmog)uq0.a).c = this.j;
        ((fmog)uq0.a).d = this.a;
        Resources resources1 = ((fmog)uq0.a).getResources();
        ((fmog)uq0.a).setContentDescription(resources1.getString(0x7F152608, new Object[]{((int)(v + 1)), v1}));  // string:position_in_collection_format "%1$d of %2$d"
    }

    @Override  // tk
    public final void l(uq uq0) {
        if(iaea.i()) {
            ((fmoj)uq0.a).c.clear();
            ((fmoj)uq0.a).d.clear();
            ((fmoj)uq0.a).e = false;
        }
    }

    public final void n(int v) {
        this.j = v;
        this.q();
    }
}

