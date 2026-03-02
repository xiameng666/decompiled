import java.io.RandomAccessFile;
import java.util.Iterator;

public final class atgf extends atjt {
    private final RandomAccessFile a;
    private final Iterator b;

    public atgf(RandomAccessFile randomAccessFile0, athh athh0) {
        this.a = randomAccessFile0;
        this.b = athh0.b.E();
    }

    @Override  // atjt
    protected final gfsx a() {
        Iterator iterator0 = this.b;
        if(!iterator0.hasNext()) {
            return gfqx.a;
        }
        Object object0 = iterator0.next();
        byte[] arr_b = new byte[((atlc)object0).b];
        this.a.seek(((atlc)object0).a);
        this.a.readFully(arr_b, 0, ((atlc)object0).b);
        return gfsx.m(new atjv(arr_b));
    }
}

