import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;

public final class bfbu extends tk {
    private final bfbt a;
    private List e;

    public bfbu(bfbt bfbt0) {
        this.a = bfbt0;
        this.e = ibps.a;
    }

    @Override  // tk
    public final int b() {
        return this.e.size();
    }

    @Override  // tk
    public final int dx(int v) {
        return ((ggna)((gqlt)this.e.get(v)).c).c <= 1 ? 0 : 1;
    }

    @Override  // tk
    public final uq dz(ViewGroup viewGroup0, int v) {
        switch(v) {
            case 0: {
                View view0 = LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E0881, viewGroup0, false);  // layout:pwm_password_list_item
                ibuq.c(view0);
                return new bfbp(view0, new bfbg(view0));
            }
            case 1: {
                View view1 = LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E0883, viewGroup0, false);  // layout:pwm_password_list_item_with_secondary_text
                ibuq.c(view1);
                return new bfbr(view1, new bfbg(view1));
            }
            default: {
                throw new IllegalArgumentException("Unknown viewType " + v);
            }
        }
    }

    public final void f(List list0) {
        ibuq.f(list0, "value");
        this.e = list0;
        this.q();
    }

    @Override  // tk
    public final void h(uq uq0, int v) {
        ibuq.f(uq0, "viewHolder");
        if(!(uq0 instanceof bfbs)) {
            throw new ClassCastException("Unknown viewHolder type.");
        }
        ((bfbs)uq0).D(((gqlt)this.e.get(v)), this.a);
    }
}

