import java.util.concurrent.ScheduledFuture;

public final class cyph implements Runnable {
    public final cypu a;

    public cyph(cypu cypu0) {
        this.a = cypu0;
    }

    @Override
    public final void run() {
        cypu cypu0 = this.a;
        if(cypu0.q == null) {
            ((ggtj)cypu0.u.f().ar(8003)).z("SwitchUiHandler: Already dismissed notification for notification id: %s", 123006);
            return;
        }
        ((ggtj)cypu0.u.f().ar(8002)).z("SwitchUiHandler: Dismiss notification for notification id: %s", 123006);
        cypu0.d.f(123006);
        cypu0.g.e(cyjt.o);
        ScheduledFuture scheduledFuture0 = cypu0.q;
        gfuy.e(scheduledFuture0);
        scheduledFuture0.cancel(false);
        cypu0.q = null;
    }
}

