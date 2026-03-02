public final class epxc implements evqc {
    public final epxd a;

    public epxc(epxd epxd0) {
        this.a = epxd0;
    }

    @Override  // evqc
    public final void gv(Exception exception0) {
        epxd.a.l(exception0);
        if((exception0 instanceof aztb)) {
            epxd epxd0 = this.a;
            int v = ((aztb)exception0).b();
            eqme eqme0 = epxd0.c;
            if(eqme0 != null) {
                ProtoLiteBuilder hftp0 = eqme0.j;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gjoa gjoa0 = (gjoa)hftp0.b_message;
                gjoa0.b |= 1;
                gjoa0.c = v;
                ProtoLiteBuilder hftp1 = eqme0.i;
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                gjob gjob0 = (gjob)hftp1.b_message;
                gjoa gjoa1 = (gjoa)hftp0.N_build();
                gjoa1.getClass();
                gjob0.d = gjoa1;
                gjob0.b |= 2;
            }
            eray eray0 = epxd0.d;
            if(eray0 != null) {
                eray0.s(v, 0);
            }
        }
    }
}

