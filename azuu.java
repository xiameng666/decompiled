import com.google.android.gms.common.Feature;

public final class azuu extends azuq {
    public final azyd_linstner b;

    public azuu(azyd_linstner azyd0, evqp evqp0) {
        super(4, evqp0);
        this.b = azyd0;
    }

    @Override  // azup
    public final Feature[] a(azxi azxi0) {
        azym azym0 = (azym)azxi0.e.get(this.b);
        return azym0 == null ? null : azym0.a.b;
    }

    @Override  // azuq
    public final void b(azxi azxi0) {
        azym azym0 = (azym)azxi0.e.remove(this.b);
        if(azym0 != null) {
            azym0.b.a(azxi0.b, this.a);
            azym0.a.a.a();
            return;
        }
        this.a.c(Boolean.valueOf(false));
    }

    @Override  // azuq
    public final void f(azwb azwb0, boolean z) {
    }
}

