final class imz extends ibur implements ibts {
    final ipt a;
    final inb b;

    public imz(ipt ipt0, inb inb0) {
        this.a = ipt0;
        this.b = inb0;
        super(1);
    }

    @Override  // ibts
    public final Object a(Object object0) {
        Throwable throwable0 = (Throwable)object0;
        synchronized(this.a.b) {
            this.a.d = true;
            gwq gwq0 = this.a.c;
            Object[] arr_object = gwq0.a;
            int v1 = gwq0.b;
            for(int v2 = 0; v2 < v1; ++v2) {
                jgt jgt0 = (jgt)((ijp)arr_object[v2]).get();
                if(jgt0 != null) {
                    jgt0.b();
                }
            }
            gwq0.g();
        }
        this.b.b.b.set(null);
        this.b.b.a.f();
        return ibom.a;
    }
}

