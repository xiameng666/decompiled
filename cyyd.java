import j..util.Objects;

final class cyyd implements evqc {
    final azts a;
    final azyd_linstner b;
    final boolean c;
    final cyyf d;

    public cyyd(cyyf cyyf0, azts azts0, azyd_linstner azyd0, boolean z) {
        this.a = azts0;
        this.b = azyd0;
        this.c = z;
        Objects.requireNonNull(cyyf0);
        this.d = cyyf0;
        super();
    }

    @Override  // evqc
    public final void gv(Exception exception0) {
        cyyf cyyf0 = this.d;
        synchronized(cyyf0) {
            if((exception0 instanceof aztb)) {
                switch(((aztb)exception0).b()) {
                    case 8001: 
                    case 8002: {
                        if(this.c) {
                            cyyf0.a.remove(this.b);
                        }
                        break;
                    }
                    default: {
                        cyyf0.e(this.a, this.b);
                    }
                }
            }
            else {
                cyyf0.e(this.a, this.b);
            }
        }
    }
}

