import j..util.Objects;

final class gpmv extends iapa {
    final gpmw a;

    public gpmv(gpmw gpmw0, iaku iaku0) {
        Objects.requireNonNull(gpmw0);
        this.a = gpmw0;
        super(iaku0);
    }

    @Override  // iapa
    public final void b(iaof_metadata iaof0) {
        super.b(iaof0);
        hfta hfta0 = this.a.c.a.a();
        iaoa iaoa0 = this.a.c.b;
        MessageLite hfvm0 = null;
        if(iaof0.j(iaoa0)) {
            byte[] arr_b = (byte[])gggq.r(iaof0.b(iaoa0));
            if(arr_b != null) {
                try {
                    hfvm0 = ((MessageLite)hfta0.b).toBuilder().D(arr_b, hftc.a()).build();
                }
                catch(hfur hfur0) {
                    throw new RuntimeException("Unable to parse metadata received from server!", hfur0);
                }
            }
        }
        if(hfvm0 != null) {
            this.a.c.a.c(hfvm0);
        }
    }
}

