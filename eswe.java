import com.google.android.gms.tapandpay.hce.observemode.ClosedLoopCardsStateMonitor;

public final class eswe {
    public final ClosedLoopCardsStateMonitor a() {
        ClosedLoopCardsStateMonitor closedLoopCardsStateMonitor1;
        ClosedLoopCardsStateMonitor closedLoopCardsStateMonitor0 = ClosedLoopCardsStateMonitor.b;
        if(closedLoopCardsStateMonitor0 == null) {
            synchronized(this) {
                closedLoopCardsStateMonitor1 = ClosedLoopCardsStateMonitor.b;
                if(closedLoopCardsStateMonitor1 == null) {
                    closedLoopCardsStateMonitor1 = new ClosedLoopCardsStateMonitor(null);
                    ClosedLoopCardsStateMonitor.b = closedLoopCardsStateMonitor1;
                }
            }
            return closedLoopCardsStateMonitor1;
        }
        return closedLoopCardsStateMonitor0;
    }
}

