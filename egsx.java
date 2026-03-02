import android.os.Bundle;

public abstract class egsx extends du {
    protected egvc av;

    public abstract int D();

    final xob J() {
        return (xob)this.getContext();
    }

    protected final egxn K() {
        return egxn.d(this.requireContext());
    }

    protected final void L() {
        egvc egvc0 = this.av;
        int v = egxj.r(this.J().getContainerActivity());
        egvc0.g(this.D(), v);
    }

    final void M() {
        this.N("contacts_sync");
    }

    final void N(String s) {
        int v = this.D();
        this.av.e(8, v);
        egve.a(this.J(), this.D(), s);
    }

    @Override  // du
    public void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        this.av = new egvc();
    }
}

