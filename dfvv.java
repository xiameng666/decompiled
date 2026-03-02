import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.SystemClock;
import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.provider.connections.NearbySharingProvider.15;
import java.util.concurrent.ScheduledFuture;

public final class dfvv implements Runnable {
    public final dfzz a;
    public final dclv b;
    public final dfsq c;

    public dfvv(dfzz dfzz0, dclv dclv0, dfsq dfsq0) {
        this.a = dfzz0;
        this.b = dclv0;
        this.c = dfsq0;
    }

    @Override
    public final void run() {
        int v3;
        boolean z;
        int v2;
        dclv dclv0;
        dfzz dfzz0 = this.a;
        if(dfzz0.bA()) {
            dcvz.a.e().p("Already discovering. Ignoring.", new Object[0]);
            return;
        }
        gged_interceptors gged0 = gged_interceptors.i(new ggal(ggam.a(dfzz0.e.entrySet(), new dfwu()), new dfwv()));
        int v = gged0.size();
        for(int v1 = 0; true; ++v1) {
            dclv0 = this.b;
            if(v1 >= v) {
                break;
            }
            dclv0.jJ(((ShareTarget)gged0.get(v1)));
        }
        dfsq dfsq0 = this.c;
        dfuj dfuj0 = dfzz0.y;
        dfuj0.o(new dfyw(dfzz0));
        dfzz0.A = dcpn.a();
        dcpn dcpn0 = dfzz0.w;
        dfsp dfsp0 = dfsq0.a();
        dfsp0.e = dcpn0.c();
        dfsq dfsq1 = dfsp0.a();
        dfzz0.p = dfsq0.f;
        if(dfzz0.bw()) {
            v2 = dfzz0.l.J(dfzz0, dfsq1);
            z = true;
        }
        else if(dfzz0.bu()) {
            v2 = dfzz0.l.L(dfzz0, dfsq1);
            z = true;
        }
        else {
            z = false;
            v2 = dfzz0.l.K(dfzz0, dfsq1);
        }
        if(v2 == 0) {
            dfzz0.o = z;
            dfzz0.a.clear();
            dfzz0.X.clear();
            dfzz0.G = new NearbySharingProvider.15(dfzz0);
            BroadcastReceiver broadcastReceiver0 = dfzz0.G;
            IntentFilter intentFilter0 = new IntentFilter("com.google.android.gms.nearby.sharing.CERTIFICATES_DOWNLOAD");
            cutr.b(dfzz0.i, broadcastReceiver0, intentFilter0);
            dfzz0.n = dclv0;
            dfzz0.s = dfsq0.a;
            ScheduledFuture scheduledFuture0 = dfzz0.E;
            if(scheduledFuture0 != null) {
                scheduledFuture0.cancel(true);
            }
            dfuj0.m();
            dfzz0.aE();
            dfzz0.D = SystemClock.uptimeMillis();
            dcvz.a.b().h("Successfully started %s discovery over Nearby Connections", (dfzz0.o ? "LOW_POWER" : ""));
            v3 = 2;
        }
        else {
            dcvz.a.e().h("Failed to discover over Nearby Connections: %s", cuvu.a(v2));
            v3 = 3;
        }
        dcoz dcoz0 = dfsq0.b;
        dfzz0.ac = dcoz0;
        if((dcoz0.a == 1 || dcoz0.a == 5 || dcoz0.a == 6) && dfzz0.bA()) {
            dfzz0.bj();
        }
        if(dfzz0.bB()) {
            long v4 = dfzz0.A;
            long v5 = dcpn0.c();
            Intent intent0 = dfzz0.P;
            long v6 = dcpn0.c();
            long v7 = dfzz0.A;
            int v8 = dfzz0.t.a();
            boolean z1 = dfzz0.bw();
            dcpn0.i(dcpt.G(v4, v3, dcoz0, v5, dfzz0.aq(), dcpt.w(dfzz0.i, dfzz0.ah(), intent0, v6, v7, v8), z1, false));
            dfzz0.aF();
        }
    }
}

