import java.util.concurrent.ScheduledFuture;

public final class alec implements Runnable {
    public final alee a;
    public final String b;
    public final int c;

    public alec(alee alee0, String s, int v) {
        this.a = alee0;
        this.b = s;
        this.c = v;
    }

    @Override
    public final void run() {
        alee alee0 = this.a;
        String s = this.b;
        int v = this.c;
        algz algz0 = alee0.a(s, v);
        if(algz0 == null) {
            return;
        }
        ScheduledFuture scheduledFuture0 = algz0.c;
        if(scheduledFuture0 != null) {
            scheduledFuture0.cancel(true);
        }
        algz0.a.clear();
        aled aled0 = new aled(s, "tqcf", v);
        alee0.a.remove(aled0);
    }
}

