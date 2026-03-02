import com.google.android.gms.nearby.sharing.discovery.FastInitiation.1;

public final class ddkz implements Runnable {
    public final FastInitiation.1 a;

    public ddkz(FastInitiation.1 fastInitiation$10) {
        this.a = fastInitiation$10;
    }

    @Override
    public final void run() {
        ddli ddli0 = this.a.a;
        synchronized(ddli0) {
            ggqk ggqk0 = gged_interceptors.i(ddli0.c.values()).E();
            while(ggqk0.hasNext()) {
                Object object0 = ggqk0.next();
                ((ddlg)object0).e = false;
            }
        }
    }
}

