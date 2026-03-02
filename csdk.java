import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public final class csdk extends csee {
    private final xob e;

    public csdk(xob xob0) {
        this.e = xob0;
    }

    @Override  // csee
    public final uq dz(ViewGroup viewGroup0, int v) {
        View view0 = LayoutInflater.from(viewGroup0.getContext()).inflate(v, viewGroup0, false);
        return v == 0x7F0E033A ? new cshu(view0, this.e) : csju.a(viewGroup0, v);  // layout:esim_plan_item
    }
}

