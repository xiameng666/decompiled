import android.view.LayoutInflater;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;

public final class bgnq extends tk {
    private final int a;
    private final Integer e;
    private final View.OnClickListener f;
    private final lf g;

    public bgnq(int v, Integer integer0, View.OnClickListener view$OnClickListener0) {
        this.a = v;
        this.e = integer0;
        this.f = view$OnClickListener0;
        this.g = new lf(this, new bgnp());
    }

    @Override  // tk
    public final int b() {
        return this.g.e.size();
    }

    @Override  // tk
    public final uq dz(ViewGroup viewGroup0, int v) {
        View view0 = LayoutInflater.from(viewGroup0.getContext()).inflate(this.a, viewGroup0, false);
        ibuq.e(view0, "inflate(...)");
        ibuq.f(view0, "itemView");
        return new uq(view0);
    }

    public final void f(boolean z) {
        List list0 = z ? ibpo.b(new bgno(this.a, this.f)) : ibps.a;
        this.g.a(list0);
    }

    @Override  // tk
    public final void h(uq uq0, int v) {
        ibuq.f(uq0, "viewHolder");
        View.OnClickListener view$OnClickListener0 = ((bgno)this.g.e.get(v)).b;
        if(view$OnClickListener0 != null) {
            Integer integer0 = this.e;
            if(integer0 == null) {
                uq0.a.setOnClickListener(view$OnClickListener0);
                return;
            }
            uq0.a.findViewById(integer0.intValue()).setOnClickListener(view$OnClickListener0);
        }
    }
}

