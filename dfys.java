import com.google.android.gms.nearby.sharing.ShareTarget;

public final class dfys implements Runnable {
    public final dfyu a;
    public final ShareTarget b;

    public dfys(dfyu dfyu0, ShareTarget shareTarget0) {
        this.a = dfyu0;
        this.b = shareTarget0;
    }

    @Override
    public final void run() {
        this.a.d.bm(this.b);
    }
}

