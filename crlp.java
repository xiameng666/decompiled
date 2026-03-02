import com.google.android.gms.measurement.internal.EventParcel;
import j..util.Objects;

final class crlp implements Runnable {
    final EventParcel a;
    final String b;
    final crih c;

    public crlp(crih crih0, EventParcel eventParcel0, String s) {
        this.a = eventParcel0;
        this.b = s;
        Objects.requireNonNull(crih0);
        this.c = crih0;
        super();
    }

    @Override
    public final void run() {
        this.c.a.F();
        this.c.a.O(this.a, this.b);
    }
}

