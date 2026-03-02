import android.util.Log;

public final class aji implements evpz {
    public final jqt a;
    public final kas b;
    public final evql c;

    public aji(jqt jqt0, kas kas0, evql evql0) {
        this.a = jqt0;
        this.b = kas0;
        this.c = evql0;
    }

    @Override  // evpz
    public final void hF(evql evql0) {
        jqt jqt0 = this.a;
        if(((evqu)evql0).d) {
            jqt0.d();
            return;
        }
        if(evql0.n()) {
            Object object0 = evql0.j();
            jqt0.b(this.b.a(object0));
            return;
        }
        Exception exception0 = this.c.i();
        if((exception0 instanceof acjx)) {
            exception0 = new ags(((acjx)exception0).a, ((acjx)exception0).getMessage());
        }
        else {
            Log.w("AppSearchTaskFutures", "Failed to call PlayServicesAppSearch", exception0);
        }
        jqt0.c(exception0);
    }
}

