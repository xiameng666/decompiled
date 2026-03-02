import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import j..util.Objects;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class aqag extends tk {
    public final aprl a;
    private final List e;

    public aqag() {
        this.e = new ArrayList();
    }

    public aqag(aprl aprl0) {
        Objects.requireNonNull(aprl0);
        this.a = aprl0;
        super();
        this.e = new ArrayList();
    }

    @Override  // tk
    public final int b() {
        return this.e.size();
    }

    @Override  // tk
    public final uq dz(ViewGroup viewGroup0, int v) {
        return new aqaf(LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E0179, viewGroup0, false));  // layout:autofill_two_line_list_item
    }

    public final void f(Collection collection0) {
        this.e.clear();
        this.e.addAll(collection0);
        this.q();
    }

    @Override  // tk
    public final void h(uq uq0, int v) {
        aqaf aqaf0 = (aqaf)uq0;
        aprk aprk0 = (aprk)this.e.get(v);
        aqaf0.t.setImageResource(aprk0.b);
        aqaf0.u.setVisibility(8);
        aqaf0.v.setText(aprk0.a);
        aqaf0.w.setVisibility(8);
        View view0 = aqaf0.a;
        view0.setAlpha(0.7f);
        view0.setEnabled(false);
        aprj aprj0 = new aprj(this, aqaf0, aprk0);
        gmbu.t(aprk0.c, aprj0, gmap.a);
    }
}

