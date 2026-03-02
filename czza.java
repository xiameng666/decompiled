import j..time.Duration;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import jeb.synthetic.FIN;
import org.webrtc.PeerConnection;

public final class czza {
    private ScheduledExecutorService a;
    private ScheduledFuture b;
    private czyz c;

    public final void a() {
        synchronized(this) {
            czkq.a.b().h("%s Stop listening to Webrtc stats update.", "[RTCStatsReport]");
            ScheduledFuture scheduledFuture0 = this.b;
            if(scheduledFuture0 != null) {
                scheduledFuture0.cancel(true);
            }
            ScheduledExecutorService scheduledExecutorService0 = this.a;
            if(scheduledExecutorService0 != null) {
                scheduledExecutorService0.shutdown();
                this.a = null;
            }
            czyz czyz0 = this.c;
            if(czyz0 != null) {
                czyz0.a();
                this.c = null;
            }
        }
    }

    public final void b(PeerConnection peerConnection0, Duration duration0, Boolean boolean0) {
        __monitor_enter(this);
        int v = FIN.finallyOpen$NT();
        czkq.a.b().h("%s Start listening to Webrtc stats update.", "[RTCStatsReport]");
        if(this.a == null) {
            this.a = Executors.newScheduledThreadPool(1);
        }
        ScheduledFuture scheduledFuture0 = this.b;
        if(scheduledFuture0 != null) {
            scheduledFuture0.cancel(true);
            this.b = null;
        }
        czyz czyz0 = this.c;
        if(czyz0 != null) {
            czyz0.a();
            this.c = null;
        }
        this.c = new czyz(peerConnection0, boolean0);
        try {
            ScheduledExecutorService scheduledExecutorService0 = this.a;
            batl.s(scheduledExecutorService0);
            czyz czyz1 = this.c;
            batl.s(czyz1);
            this.b = scheduledExecutorService0.scheduleWithFixedDelay(czyz1, 0L, duration0.toMillis(), TimeUnit.MILLISECONDS);
            FIN.finallyExec$NT(v);
        }
        catch(RejectedExecutionException rejectedExecutionException0) {
            czkq.a.e().f(rejectedExecutionException0).h("%s Failed to start metrics task", "[RTCStatsReport]");
            FIN.finallyCodeBegin$NT(v);
        }
    }
}

