import java.util.List;

public final class bvl implements bpd {
    final List a;
    final azz b;
    final bvn c;

    public bvl(bvn bvn0, List list0, azz azz0) {
        this.c = bvn0;
        this.a = list0;
        this.b = azz0;
        super();
    }

    @Override  // bpd
    public final void a(Throwable throwable0) {
        this.c.c = null;
        List list0 = this.a;
        if(!list0.isEmpty()) {
            for(Object object0: list0) {
                ((bik)this.b).p(((bhl)object0));
            }
            list0.clear();
        }
    }

    @Override  // bpd
    public final void b(Object object0) {
        Void void0 = (Void)object0;
        this.c.c = null;
    }
}

