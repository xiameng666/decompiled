public final class jfg implements ibts {
    public final jfh a;
    public final jff b;

    public jfg(jfh jfh0, jff jff0) {
        this.a = jfh0;
        this.b = jff0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        jfh jfh0 = this.a;
        synchronized(jfh0.a) {
            boolean z = ((jfk)object0).b();
            jff jff0 = this.b;
            if(z) {
                jfk jfk0 = (jfk)jfh0.b.e(jff0, ((jfk)object0));
            }
            else {
                jfk jfk1 = (jfk)jfh0.b.f(jff0);
            }
        }
        return ibom.a;
    }
}

