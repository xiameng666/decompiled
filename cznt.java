import java.util.concurrent.Callable;

public final class cznt implements Callable {
    public final czos a;
    public final String b;

    public cznt(czos czos0, String s) {
        this.a = czos0;
        this.b = s;
    }

    @Override
    public final Object call() {
        czzi czzi0 = this.a.c;
        Object object0 = czzi0 == null ? czzi.c(this.a.a, this.b) : czzi0.b(this.b);
        if(!hvol.as() || object0 != null) {
            return object0;
        }
        czkq.a.b().p("[WebRtc] Failed to getDroidGuardResult.", new Object[0]);
        throw new RuntimeException("Failed to getDroidGuardResult.");
    }
}

