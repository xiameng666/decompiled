package j$.util;

import j..util.function.IntConsumer.-CC;
import java.util.function.IntConsumer;

public final class z implements IntConsumer {
    private long count;
    private int max;
    private int min;
    private long sum;

    public z() {
        this.min = 0x7FFFFFFF;
        this.max = 0x80000000;
    }

    public final void a(z z0) {
        this.count += z0.count;
        this.sum += z0.sum;
        this.min = Math.min(this.min, z0.min);
        this.max = Math.max(this.max, z0.max);
    }

    @Override
    public final void accept(int v) {
        ++this.count;
        this.sum += (long)v;
        this.min = Math.min(this.min, v);
        this.max = Math.max(this.max, v);
    }

    public final IntConsumer andThen(IntConsumer intConsumer0) {
        return IntConsumer.-CC.$default$andThen(this, intConsumer0);
    }

    @Override
    public final String toString() {
        String s = z.class.getSimpleName();
        Long long0 = (long)this.count;
        Long long1 = (long)this.sum;
        Integer integer0 = (int)this.min;
        return this.count <= 0L ? String.format("%s{count=%d, sum=%d, min=%d, average=%f, max=%d}", s, long0, long1, integer0, ((double)0.0), ((int)this.max)) : String.format("%s{count=%d, sum=%d, min=%d, average=%f, max=%d}", s, long0, long1, integer0, ((double)(((double)this.sum) / ((double)this.count))), ((int)this.max));
    }
}

