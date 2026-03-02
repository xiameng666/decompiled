import android.os.SystemClock;
import j..util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public final class aqpa {
    private final ggfp a;
    private final long b;
    private final long c;
    private final long d;
    private final aqnn e;

    public aqpa() {
        throw null;
    }

    public aqpa(ggfp ggfp0, long v, long v1, long v2, aqnn aqnn0) {
        this.a = ggfp0;
        this.b = v;
        this.c = v1;
        this.d = v2;
        this.e = aqnn0;
    }

    public final Object a(baqr baqr0, Object object0, aqpf aqpf0) {
        int v = 0;
        while(true) {
            try {
                return aqpf0.a(baqr0, object0);
            }
            catch(iapl iapl0) {
            }
            if(!this.a.contains(iapl0.a)) {
                break;
            }
            int v1 = Long.compare(v + 1, this.b);
            if(v1 == 0) {
                break;
            }
            long v2 = TimeUnit.SECONDS.toMillis(((long)Math.pow(2.0, v)));
            long v3 = ThreadLocalRandom.current().nextLong(this.d);
            SystemClock.sleep(this.c + v2 + v3);
            if(v1 >= 0) {
                throw new AssertionError("impossible");
            }
            ++v;
            return aqpf0.a(baqr0, object0);
        }
        throw iapl0;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof aqpa) && this.a.equals(((aqpa)object0).a) && this.b == ((aqpa)object0).b && this.c == ((aqpa)object0).c && this.d == ((aqpa)object0).d && this.e.equals(((aqpa)object0).e);
    }

    @Override
    public final int hashCode() {
        return (((((int)(this.b ^ this.b >>> 0x20)) ^ (this.a.hashCode() ^ 1000003) * 1000003) * 1000003 ^ ((int)(this.c ^ this.c >>> 0x20))) * 1000003 ^ ((int)(this.d ^ this.d >>> 0x20))) * 1000003 ^ this.e.hashCode();
    }

    @Override
    public final String toString() {
        return "RetryManager{retriableStatuses=" + this.a + ", maxNumberOfAttempts=" + this.b + ", initialBackoffMillis=" + this.c + ", networkRetryMaxFuzzMillis=" + this.d + ", clockWithSleep=" + this.e + "}";
    }
}

