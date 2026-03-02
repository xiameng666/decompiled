import com.google.android.gms.crisisalerts.state.CrisisAlertsSystemStateChangeIntentOperation;

public final class bgwb implements Runnable {
    public final bgwf a;

    public bgwb(bgwf bgwf0) {
        this.a = bgwf0;
    }

    @Override
    public final void run() {
        CrisisAlertsSystemStateChangeIntentOperation.a(this.a.a);
    }
}

