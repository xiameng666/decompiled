import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;

public final class eyog extends tk {
    public List a;

    public eyog() {
        this.a = ibps.a;
    }

    @Override  // tk
    public final int b() {
        return this.a.size();
    }

    @Override  // tk
    public final uq dz(ViewGroup viewGroup0, int v) {
        View view0 = LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E02EB, viewGroup0, false);  // layout:discovered_device
        ibuq.e(view0, "inflate(...)");
        return new eyoh(view0);
    }

    @Override  // tk
    public final void h(uq uq0, int v) {
        eyoh eyoh0 = (eyoh)uq0;
        ibuq.f(eyoh0, "holder");
        eyoy eyoy0 = (eyoy)this.a.get(v);
        eyoh0.t.setText(eyoy0.a);
        eyof eyof0 = new eyof(eyoy0);
        eyoh0.u.setOnClickListener(eyof0);
        eyoh0.u.setSelected(eyoy0.b);
    }
}

