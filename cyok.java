import java.util.concurrent.TimeUnit;

public final class cyok implements kar {
    public final cyom a;
    public final cync b;

    public cyok(cyom cyom0, cync cync0) {
        this.a = cyom0;
        this.b = cync0;
    }

    @Override  // kar
    public final void accept(Object object0) {
        cyom cyom0 = this.a;
        long v = cyom0.b.a();
        ((ggtj)cyom0.g.d().ar(0x1F23)).M("SwitchHistory: Switch task is completed at %s with result=%s", v, ((cyql)object0).a());
        cync cync0 = this.b;
        long v1 = cyne.a(((cyql)object0).a(), cync0.g);
        if(v1 <= 0L) {
            cync0.b(v, ((cyql)object0));
            kar kar0 = cyom0.f;
            if(kar0 != null) {
                kar0.accept(cync0);
            }
            cyom0.c.g(cync0);
            return;
        }
        ((ggtj)cyom0.g.d().ar(0x1F24)).x("SwitchHistory: Wait to receive the ACL disconnect reason");
        if(cyom0.e == null) {
            cyom0.e = new bbll(1, 10);
        }
        ((bbll)cyom0.e).g(new cyol(cyom0, ((cyql)object0), cync0, v), v1, TimeUnit.MILLISECONDS);
    }
}

