import com.google.android.gms.nearby.sharing.discovery.FastInitiation.3;

public final class ddlb implements Runnable {
    public final FastInitiation.3 a;

    public ddlb(FastInitiation.3 fastInitiation$30) {
        this.a = fastInitiation$30;
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

