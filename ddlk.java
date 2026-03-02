import com.google.android.gms.nearby.sharing.ShareTarget;

public final class ddlk implements Runnable {
    public final ShareTarget a;
    public final dccr b;

    public ddlk(dccr dccr0, ShareTarget shareTarget0) {
        this.b = dccr0;
        this.a = shareTarget0;
    }

    @Override
    public final void run() {
        this.b.a.ah(this.a, 1, null);
    }
}

