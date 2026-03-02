import com.google.android.gms.nearby.sharing.discovery.FastInitiation.2;

public final class ddla implements Runnable {
    public final FastInitiation.2 a;

    public ddla(FastInitiation.2 fastInitiation$20) {
        this.a = fastInitiation$20;
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

