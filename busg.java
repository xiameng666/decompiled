import com.google.android.gms.googleone.smui.selection.ItemCell;
import java.util.LinkedHashSet;
import java.util.Set;

public final class busg {
    public final Set a;
    public final busf b;

    public busg() {
        LinkedHashSet linkedHashSet0 = new LinkedHashSet();
        this.a = linkedHashSet0;
        this.b = new busf(linkedHashSet0);
    }

    public final void a() {
        this.b.a.clear();
        this.b.a();
    }

    public final void b(ItemCell itemCell0) {
        ibuq.f(itemCell0, "item");
        this.b.a.add(itemCell0);
        this.b.a();
    }

    public final boolean c() {
        return !this.a.isEmpty();
    }

    public final boolean d(ItemCell itemCell0) {
        return this.a.contains(itemCell0);
    }
}

