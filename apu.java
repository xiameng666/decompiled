final class apu implements bpd {
    final atl a;
    final aqi b;

    public apu(aqi aqi0, atl atl0) {
        this.b = aqi0;
        this.a = atl0;
        super();
    }

    @Override  // bpd
    public final void a(Throwable throwable0) {
    }

    @Override  // bpd
    public final void b(Object object0) {
        Void void0 = (Void)object0;
        aqi aqi0 = this.b;
        aqi0.o.remove(this.a);
        int v = aqi0.A - 1;
        if(aqi0.A == 0) {
            throw null;
        }
        switch(v) {
            case 1: 
            case 5: {
            label_9:
                if(aqi0.I() && aqi0.i != null) {
                    aqi0.O();
                    aqi0.i.close();
                    aqi0.i = null;
                }
                break;
            }
            case 6: {
                aqi0.O();
                goto label_9;
            }
            case 7: {
                if(aqi0.j != 0) {
                    aqi0.O();
                    goto label_9;
                }
                break;
            }
        }
    }
}

