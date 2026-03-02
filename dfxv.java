import android.content.Intent;
import android.os.SystemClock;
import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.database.QuickShareRoomDatabase;

public final class dfxv implements Runnable {
    public final dfzz a;
    public final long b;
    public final ShareTarget c;
    public final gyzg d;

    public dfxv(dfzz dfzz0, long v, ShareTarget shareTarget0, gyzg gyzg0) {
        this.a = dfzz0;
        this.b = v;
        this.c = shareTarget0;
        this.d = gyzg0;
    }

    @Override
    public final void run() {
        QuickShareRoomDatabase quickShareRoomDatabase0 = (QuickShareRoomDatabase)((gfur_Suppliers)this.a.ad).ofInstance_;
        batl.s(quickShareRoomDatabase0);
        ddkk ddkk0 = ddkl.a(quickShareRoomDatabase0.u());
        int v = this.a.L(this.c);
        int v1 = this.a.K();
        long v2 = this.a.ae(this.c).y <= 0L ? 0L : SystemClock.uptimeMillis() - this.a.ae(this.c).y;
        Intent intent0 = this.a.P;
        long v3 = this.a.w.c();
        int v4 = this.a.t.a();
        this.a.w.i(dcpt.l(this.b, 0L, this.c, this.d, v, v1, v2, this.a.aq(), dcpt.w(this.a.i, this.a.ah(), intent0, v3, this.b, v4), ddkk0, 0, 0));
    }
}

