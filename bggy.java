import java.text.Collator;

public final class bggy implements evpz {
    public final evqp a;
    public final gged_interceptors b;

    public bggy(evqp evqp0, gged_interceptors gged0) {
        this.a = evqp0;
        this.b = gged0;
    }

    @Override  // evpz
    public final void hF(evql evql0) {
        gged_interceptors gged0 = evql0.n() ? ((gged_interceptors)evql0.j()) : ggna.a;
        Collator collator0 = Collator.getInstance(bgmp.b());
        collator0.setStrength(0);
        gged_interceptors gged1 = ggch.j(gqnb.a(bedl.a(this.b), gged0)).o(new bggz(collator0));
        this.a.b(gged1);
    }
}

