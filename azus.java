import com.google.android.gms.common.Feature;

public final class azus extends azuq {
    public final azym b;

    public azus(azym azym0, evqp evqp0) {
        super(3, evqp0);
        this.b = azym0;
    }

    @Override  // azup
    public final Feature[] a(azxi azxi0) {
        return this.b.a.b;
    }

    @Override  // azuq
    public final void b(azxi azxi0) {
        azym azym0 = this.b;
        azym0.a.b(azxi0.b, this.a);
        azyd_linstner azyd0 = azym0.a.getListener();
        if(azyd0 != null) {
            azxi0.e.put(azyd0, azym0);
        }
    }

    @Override  // azuq
    public final void f(azwb azwb0, boolean z) {
    }
}

