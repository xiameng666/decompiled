import android.util.Pair;
import j..util.Collection.-EL;
import java.util.ArrayDeque;
import java.util.Queue;

public final class ehxk {
    private final Queue a;

    public ehxk() {
        this.a = new ArrayDeque();
    }

    final double a(long v) {
        double f;
        synchronized(this) {
            this.c(v);
            f = Collection.-EL.stream(this.a).mapToDouble(new ehxj()).average().orElse(0.0);
        }
        return f;
    }

    final void b(int v, long v1) {
        synchronized(this) {
            this.a.add(Pair.create(Long.valueOf(v1), Double.valueOf(Math.pow(10.0, (-60.0 - ((double)v)) / 20.0))));
        }
    }

    private final void c(long v) {
        synchronized(this) {
            Queue queue0 = this.a;
            for(Pair pair0 = (Pair)queue0.peek(); pair0 != null && v - ((long)(((Long)pair0.first))) >= hrtd.a.I().z(); pair0 = (Pair)queue0.peek()) {
                queue0.remove();
            }
        }
    }
}

