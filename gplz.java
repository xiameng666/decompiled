import java.util.concurrent.atomic.AtomicReference;

public final class gplz extends ialz {
    private final AtomicReference a;

    public gplz(iakv iakv0) {
        super(iakv0);
        this.a = new AtomicReference(gply.b(1));
    }

    @Override  // iaoz
    public final void a(String s, Throwable throwable0) {
        gply gply1;
        iapk iapk0 = s == null ? iapk.c : iapk.c.f(s);
        if(throwable0 != null) {
            iapk0 = iapk0.e(throwable0);
        }
        do {
            AtomicReference atomicReference0 = this.a;
            gply gply0 = (gply)atomicReference0.get();
            int v = gply0.b;
            if(v == 4) {
                gply1 = gply0;
            }
            else {
                gply1 = v == 1 ? gply.a(4, iapk0) : gply.a(5, iapk0);
            }
        }
        while(!gplx.a(atomicReference0, gply0, gply1));
        this.d.a(s, throwable0);
    }

    @Override  // iaoz
    public final void b() {
        while(true) {
            AtomicReference atomicReference0 = this.a;
            gply gply0 = (gply)atomicReference0.get();
            if(gply0.b != 2) {
                break;
            }
            if(gplx.a(atomicReference0, gply0, gply.b(3))) {
                this.d.b();
                return;
            }
        }
        throw new IllegalStateException("Call was either not started or already half-closed.");
    }

    @Override  // iaoz
    public final void c(int v) {
        boolean z = true;
        switch(((gply)this.a.get()).b) {
            case 1: 
            case 4: {
                throw new IllegalStateException("Not started");
            }
            default: {
                if(v < 0) {
                    z = false;
                }
                gftb.b(z, "Number requested must be non-negative");
                this.d.c(v);
            }
        }
    }

    @Override  // iama
    public final void d(Object object0) {
        gftb.z(object0, "Message must be non-null");
        int v = ((gply)this.a.get()).b;
        if(v == 2) {
            this.d.d(object0);
            return;
        }
        if(v == 5) {
            return;
        }
        throw new IllegalStateException("Call was either not started or already half-closed.");
    }

    @Override  // iama
    public final void e(iaku iaku0, iaof_metadata iaof0) {
        gply gply0;
        do {
            gply0 = (gply)this.a.get();
            int v = gply0.b;
            gply gply1 = v == 1 ? gply.b(2) : gply0;
        }
        while(!gplx.a(this.a, gply0, gply1));
        switch(v) {
            case 1: {
                this.d.e(iaku0, iaof0);
                return;
            }
            case 4: {
                iaof_metadata iaof1 = new iaof_metadata();
                iaku0.a(gply0.a, iaof1);
                return;
            }
            default: {
                IllegalStateException illegalStateException0 = new IllegalStateException("Already started");
                this.d.a("start() called more than once", illegalStateException0);
                throw illegalStateException0;
            }
        }
    }
}

