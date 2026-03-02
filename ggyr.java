public final class ggyr implements gftc {
    public final ggza a;
    public final ggxx b;

    public ggyr(ggza ggza0, ggxx ggxx0) {
        this.a = ggza0;
        this.b = ggxx0;
    }

    @Override  // gftc
    public final boolean a(Object object0) {
        ggza ggza0 = this.a;
        if(!ggzs.d(ggza0.a, ((ghae)object0))) {
            return true;
        }
        ghcc ghcc0 = (ghcc)ggza0.a.a();
        ghae ghae0 = ggzs.c(ggza0.a);
        int v = ghcc0.a();
        for(int v1 = 0; v1 < v; ++v1) {
            ghdb ghdb0 = ghcc0.b(v1);
            if(ggza0.b(ghae0, ghdb0, ((ghae)object0))) {
                int v2 = ghdb0.e();
                ggyg ggyg0 = this.b.a;
                if(ggyg0.d.a(v2)) {
                    ggyg0.a(ggxr.a, v2, -1);
                    if(ggyg0.j.equals(ggxr.a)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}

