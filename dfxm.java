import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.database.QuickShareRoomDatabase;

public final class dfxm implements Runnable {
    public final dfzz a;
    public final gyzg b;
    public final ShareTarget c;

    public dfxm(dfzz dfzz0, gyzg gyzg0, ShareTarget shareTarget0) {
        this.a = dfzz0;
        this.b = gyzg0;
        this.c = shareTarget0;
    }

    @Override
    public final void run() {
        QuickShareRoomDatabase quickShareRoomDatabase0 = (QuickShareRoomDatabase)((gfur_Suppliers)this.a.ad).ofInstance_;
        batl.s(quickShareRoomDatabase0);
        ddkk ddkk0 = ddkl.a(quickShareRoomDatabase0.u());
        long v = this.a.C;
        long v1 = this.a.w.b();
        int v2 = this.a.t.a();
        this.a.w.i(dcpt.d(v, 0L, this.b, this.a.aq(), this.c, v1, v2, ddkk0, 0, 0));
    }
}

