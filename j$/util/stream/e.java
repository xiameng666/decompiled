package j$.util.stream;

import j..util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.concurrent.ForkJoinPool;

public abstract class e extends CountedCompleter {
    public final b a;
    public Spliterator b;
    public long c;
    public e d;
    public e e;
    public Object f;
    public static final int g;

    static {
        e.g = ForkJoinPool.getCommonPoolParallelism() << 2;
    }

    public e(b b0, Spliterator spliterator0) {
        super(null);
        this.a = b0;
        this.b = spliterator0;
        this.c = 0L;
    }

    public e(e e0, Spliterator spliterator0) {
        super(e0);
        this.b = spliterator0;
        this.a = e0.a;
        this.c = e0.c;
    }

    public abstract Object a();

    public final e b() {
        return (e)this.getCompleter();
    }

    public final boolean c() {
        for(e e0 = this; e0 != null; e0 = e1) {
            e e1 = (e)e0.getCompleter();
            if(e1 != null && e1.d != e0) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void compute() {
        Spliterator spliterator0 = this.b;
        long v = spliterator0.estimateSize();
        long v1 = this.c;
        if(v1 == 0L) {
            v1 = e.g(v);
            this.c = v1;
        }
        int v2 = 0;
        e e0 = this;
        while(v > v1) {
            Spliterator spliterator1 = spliterator0.trySplit();
            if(spliterator1 == null) {
                break;
            }
            e e1 = e0.e(spliterator1);
            e0.d = e1;
            e e2 = e0.e(spliterator0);
            e0.e = e2;
            e0.setPendingCount(1);
            if(v2 == 0) {
                e0 = e2;
            }
            else {
                spliterator0 = spliterator1;
                e0 = e1;
                e1 = e2;
            }
            v2 ^= 1;
            e1.fork();
            v = spliterator0.estimateSize();
        }
        e0.f(e0.a());
        e0.tryComplete();
    }

    public final boolean d() {
        return ((e)this.getCompleter()) == null;
    }

    public abstract e e(Spliterator arg1);

    public void f(Object object0) {
        this.f = object0;
    }

    public static long g(long v) {
        long v1 = v / ((long)e.g);
        return v1 <= 0L ? 1L : v1;
    }

    @Override
    public Object getRawResult() {
        return this.f;
    }

    @Override
    public void onCompletion(CountedCompleter countedCompleter0) {
        this.b = null;
        this.e = null;
        this.d = null;
    }

    @Override
    public final void setRawResult(Object object0) {
        if(object0 == null) {
            return;
        }
        throw new IllegalStateException();
    }
}

