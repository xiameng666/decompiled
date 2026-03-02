public final class arpk implements Runnable {
    public final arpn a;

    public arpk(arpn arpn0) {
        this.a = arpn0;
    }

    @Override
    public final void run() {
        arpn arpn0 = this.a;
        arot arot0 = arpn0.e;
        int v = arot0.a(arpn0.w());
        int v1 = 0;
        while(((long)v1) < ((long)(((Long)arpn0.f.mr())))) {
            if(arpn0.h.get()) {
                arpn.d.d("WifiTransport is already shutting down. Abandoning connect retries.", new Object[0]);
            }
            else if(v != 0 && v != 1 && v != 2) {
                arpn.d.d("Got ConnectionResult: %d. Will retry.", new Object[]{v});
                v = arot0.a(arpn0.w());
                ++v1;
                continue;
            }
            else {
                arpn.d.d("Got ConnectionResult: %d. Abandoning connect retries.", new Object[]{v});
            }
            break;
        }
        if(arpn0.h.get()) {
            arpn.d.d("WifiTransport is already shutting down. Abandoning this connect result.", new Object[0]);
            return;
        }
        arpn0.b.execute(new arov(arpn0, v));
        synchronized(arpn0) {
            arpn0.g = null;
        }
    }
}

