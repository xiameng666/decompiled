public final class buod implements ibts {
    public final hivr a;
    public final tyb b;

    public buod(hivr hivr0, tyb tyb0) {
        this.a = hivr0;
        this.b = tyb0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((bunj)object0), "it");
        hivr hivr0 = this.a;
        if((hivr0.b & 8) != 0 && !(hivr0.f == null ? hivp.a : hivr0.f).d.isEmpty()) {
            ((bunj)object0).i.setText((hivr0.f == null ? hivp.a : hivr0.f).d);
        }
        if((hivr0.b & 8) != 0 && !(hivr0.f == null ? hivp.a : hivr0.f).e.isEmpty()) {
            ((bunj)object0).j.setText((hivr0.f == null ? hivp.a : hivr0.f).e);
        }
        if((hivr0.b & 8) != 0 && !(hivr0.f == null ? hivp.a : hivr0.f).b.isEmpty()) {
            ((bunj)object0).m = (hivr0.f == null ? hivp.a : hivr0.f).b;
        }
        if((hivr0.b & 8) != 0 && !(hivr0.f == null ? hivp.a : hivr0.f).c.isEmpty()) {
            ((bunj)object0).n = (hivr0.f == null ? hivp.a : hivr0.f).c;
        }
        String s = (hivr0.b & 16) == 0 ? "" : ghiq.a((hivr0.g == null ? ghip.a : hivr0.g)).b;
        if(!gfta.c(s)) {
            this.b.h(s).k(((bunj)object0).k);
        }
        buni buni0 = new buni(((bunj)object0));
        ((bunj)object0).l.setOnClickListener(buni0);
        return ibom.a;
    }
}

