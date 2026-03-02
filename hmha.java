import j..util.Objects;
import java.util.TimerTask;

final class hmha extends TimerTask {
    final hmhc a;

    public hmha(hmhc hmhc0) {
        Objects.requireNonNull(hmhc0);
        this.a = hmhc0;
        super();
    }

    @Override
    public final void run() {
        hmhc hmhc0 = this.a;
        int v = (int)(((long)hmhc0.b) - 1000L);
        hmhc0.b = v;
        if(v <= 0) {
            hmhc0.a.a();
            this.cancel();
        }
    }
}

