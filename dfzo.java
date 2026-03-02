import android.content.Intent;
import android.os.SystemClock;
import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.database.QuickShareRoomDatabase;
import j..time.LocalDate;
import j..time.ZoneId;
import java.math.BigDecimal;
import java.math.RoundingMode;

public final class dfzo implements Runnable {
    public final dfzt a;
    public final gyzg b;

    public dfzo(dfzt dfzt0, gyzg gyzg0) {
        this.a = dfzt0;
        this.b = gyzg0;
    }

    @Override
    public final void run() {
        ddkk ddkk2;
        long v = SystemClock.uptimeMillis();
        dfzt dfzt0 = this.a;
        ShareTarget shareTarget0 = dfzt0.e;
        boolean z = shareTarget0.f;
        long v1 = z ? dfzt0.m.ad(shareTarget0).l : dfzt0.m.ae(shareTarget0).y;
        BigDecimal bigDecimal0 = dfzt0.i.divide(new BigDecimal(0x100000));
        double f = ((double)(v - v1)) / 1000.0;
        RoundingMode roundingMode0 = RoundingMode.DOWN;
        double f1 = bigDecimal0.divide(BigDecimal.valueOf(Math.max(f, 0.001)), 3, roundingMode0).doubleValue();
        dfzz dfzz0 = dfzt0.m;
        QuickShareRoomDatabase quickShareRoomDatabase0 = (QuickShareRoomDatabase)((gfur_Suppliers)dfzz0.ad).ofInstance_;
        batl.s(quickShareRoomDatabase0);
        ddkm ddkm0 = quickShareRoomDatabase0.u();
        ddkk ddkk0 = ddkl.a(ddkm0);
        int v2 = Integer.parseInt(LocalDate.now(ZoneId.of("America/Los_Angeles")).toString().replace("-", ""));
        int v3 = ddkk0.d;
        if(v3 > 0) {
            ddkk ddkk1 = new ddkk(ddkk0.a, ddkk0.b, ddkk0.c, v3 + 1);
            if(ddkm0 != null) {
                ddkm0.c(new ddkk(ddkk1.a, ddkk1.b, v2, ddkk1.d));
            }
            ddkk2 = ddkk1;
        }
        else {
            ddkk ddkk3 = new ddkk(ddkk0.a, v2, 0, 1);
            if(ddkm0 != null) {
                ddkm0.b(new ddkk(ddkk3.a, v2, v2, 1));
            }
            ddkk2 = ddkk3;
        }
        gyzg gyzg0 = this.b;
        if(z) {
            dcvz.a.b().j("Incoming payload transfer has completed with status %s in %.2f seconds = %.2f MB/s", gyzg0.name(), Double.valueOf(f), Double.valueOf(f1));
            long v4 = dfzz0.C;
            long v5 = dfzt0.i.longValue();
            long v6 = dfzz0.w.b();
            dfzz0.w.i(dcpt.d(v4, v5, gyzg0, dfzz0.aq(), shareTarget0, v6, dfzz0.t.a(), ddkk2, 0, 0));
            return;
        }
        dcvz.a.b().j("Outgoing payload transfer has completed with status %s in %.2f seconds = %.2f MB/s", gyzg0.name(), Double.valueOf(f), Double.valueOf(f1));
        long v7 = dfzt0.i.longValue();
        for(Object object0: dfzt0.g.values()) {
            v7 -= ((dfzs)object0).a;
        }
        long v8 = dfzz0.ae(shareTarget0).y;
        long v9 = dfzz0.P(shareTarget0);
        int v10 = dfzz0.L(shareTarget0);
        int v11 = dfzz0.K();
        long v12 = v8 <= 0L ? 0L : SystemClock.uptimeMillis() - v8;
        Intent intent0 = dfzz0.P;
        long v13 = dfzz0.w.c();
        long v14 = dfzz0.P(shareTarget0);
        int v15 = dfzz0.t.a();
        dfzz0.w.i(dcpt.l(v9, v7, shareTarget0, gyzg0, v10, v11, v12, dfzz0.aq(), dcpt.w(dfzz0.i, dfzz0.ah(), intent0, v13, v14, v15), ddkk2, 0, 0));
    }
}

