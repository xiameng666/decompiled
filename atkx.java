final class atkx extends atjt {
    private final atkf a;

    public atkx(atju atju0, athv athv0) {
        this.a = new atkf(atju0, athv0);
    }

    @Override  // atjt
    public final gfsx a() {
        atjv atjv0;
        atkf atkf0 = this.a;
        gftb.r(((boolean)(atkf0.d ^ 1)), "already closed");
        gfsx gfsx0 = atkf0.b.b();
        if(!gfsx0.i()) {
            atkf.a.d("Reached the end of chunk stream.", new Object[0]);
            return gfqx.a;
        }
        Object object0 = gfsx0.d();
        athu athu0 = ((atkc)object0).a;
        gfsx gfsx1 = ((atkc)object0).b;
        if(gfsx1.i()) {
            gftb.f(gfsx1.i(), "contentStartOffset absent in chunkMetadata: %s", object0);
            Integer integer0 = (Integer)gfsx1.d();
            atkf.a.j("Reading new chunk content for %s from offset %d", new Object[]{athu0, integer0});
            atjv0 = new atjv(atkf0.a(integer0.intValue()));
        }
        else {
            atkf.a.j("Reading chunk from old listing: %s", new Object[]{athu0});
            gftb.u(atkf0.c.c(athu0), "Old chunk listing doesn\'t have the old chunk: %s", athu0);
            atlc atlc0 = atkf0.c.b(athu0);
            atjv0 = atlc.c(atlc0.a, atlc0.b);
        }
        gfsx gfsx2 = gfsx.m(new atjy(athu0, atjv0));
        atkf.a.j("Chunk %s successfully read.", new Object[]{athu0});
        return gfsx2;
    }
}

