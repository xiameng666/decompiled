import android.util.Log;
import j..util.Objects;
import j..util.Optional;
import java.util.BitSet;

final class fcxi implements gmbg {
    final fcxj a;
    final fcyc b;

    public fcxi(fcxj fcxj0, fcyc fcyc0) {
        this.b = fcyc0;
        Objects.requireNonNull(fcxj0);
        this.a = fcxj0;
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        Log.w("BugreportWearClient", "Failed to send consent message", throwable0);
        this.b.a(false);
        this.a.c = Optional.empty();
    }

    @Override  // gmbg
    public final void b(Object object0) {
        if(Log.isLoggable("BugreportWearClient", 4)) {
            Log.i("BugreportWearClient", "Message sent successfully");
        }
        BitSet bitSet0 = BitSet.valueOf(((byte[])object0));
        this.b.a(!bitSet0.isEmpty() && bitSet0.get(0));
        this.a.c = Optional.empty();
    }
}

