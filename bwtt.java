import java.util.concurrent.TimeUnit;

public final class bwtt {
    private long a;
    private float b;

    public bwtt() {
        this.a = 0L;
        this.b = bwtu.a.nextFloat();
    }

    public final void a(float f, long v, TimeUnit timeUnit0) {
        synchronized(this) {
            long v2 = timeUnit0.toMillis(v);
            long v3 = System.currentTimeMillis();
            float f1 = this.b - f;
            this.b = f1;
            if(v3 - this.a >= v2 && f1 < 0.0f) {
                this.a = v3;
                this.b = f1 + 1.0f;
            }
        }
    }
}

