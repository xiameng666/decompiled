import android.os.Looper;

public final class azxn extends azwe {
    private final azts b;

    public azxn(azts azts0) {
        this.b = azts0;
    }

    @Override  // aztw
    public final Looper a() {
        return this.b.B;
    }

    @Override  // aztw
    public final azvc c(azvc azvc0) {
        this.b.jr(0, azvc0);
        return azvc0;
    }

    @Override  // aztw
    public final azvc d(azvc azvc0) {
        this.b.jr(1, azvc0);
        return azvc0;
    }
}

