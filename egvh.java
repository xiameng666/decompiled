import android.view.LayoutInflater;
import android.view.ViewGroup;
import j..util.Objects;
import java.util.List;

final class egvh extends tk {
    public List a;
    final egvi e;
    private final LayoutInflater f;

    public egvh(egvi egvi0, LayoutInflater layoutInflater0) {
        Objects.requireNonNull(egvi0);
        this.e = egvi0;
        super();
        this.a = ggna.a;
        this.f = layoutInflater0;
    }

    @Override  // tk
    public final int b() {
        return this.a.size();
    }

    @Override  // tk
    public final uq dz(ViewGroup viewGroup0, int v) {
        return new egsz(this.f.inflate(0x7F0E07B6, viewGroup0, false));  // layout:people_contact_list_item_view
    }

    @Override  // tk
    public final void h(uq uq0, int v) {
        egsz egsz0 = (egsz)uq0;
        egnp egnp0 = (egnp)this.a.get(v);
        egsz0.v.setText(egnp0.c);
        CharSequence charSequence0 = egxj.e(this.e.b.b, egnp0.d);
        egsz0.w.setText(charSequence0);
        egsz0.t.a(egnp0.c, String.valueOf(egnp0.b));
        egsz0.u.setImageDrawable(egsz0.t);
    }
}

