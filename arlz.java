public final class arlz implements Runnable {
    public final armd a;
    public final ProtoLiteBuilder b;

    public arlz(armd armd0, ProtoLiteBuilder hftp0) {
        this.a = armd0;
        this.b = hftp0;
    }

    @Override
    public final void run() {
        asco asco0 = (asco)this.b.N_build();
        armd armd0 = this.a;
        batl.l(((boolean)(armd0.e ^ 1)));
        int v = armd0.a;
        switch(v) {
            case 1: {
                armd0.c.a(1);
                armd0.e = true;
                return;
            }
            case 2: {
                if(ascq.a(asco0.c) == 4) {
                    armd0.c.a(3);
                    armd0.e = true;
                    return;
                }
                if(asco0.e) {
                    armd0.c.a(1);
                    armd0.e = true;
                }
                return;
            }
            default: {
                throw new RuntimeException("Invalid payload type: " + v);
            }
        }
    }
}

