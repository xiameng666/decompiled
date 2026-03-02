import android.os.SystemClock;
import java.util.Queue;

public final class fwuk implements gfsi {
    public final fwun a;

    public fwuk(fwun fwun0) {
        this.a = fwun0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        int v2;
        boolean z = ((fwzu)object0).b;
        fwun fwun0 = this.a;
        fwrk fwrk0 = fwun0.d;
        long v = SystemClock.elapsedRealtime();
        if(z) {
            fwrk0.c();
            fwrk0.b = 0L;
        }
        else {
            fwrk0.b = v;
            if(!fwrk0.c) {
                Queue queue0 = fwrk0.a;
                queue0.add(Long.valueOf(v));
                if(queue0.size() >= 3) {
                    Long long0 = (Long)queue0.peek();
                    if(long0 != null && v - ((long)long0) < (fwrk0.e ? 600000L : 1800000L)) {
                        fwrk0.c = true;
                    }
                }
            }
        }
        fvwz fvwz0 = fwun0.g;
        gxsx gxsx0 = ((fwzu)object0).a;
        if(((ProtoLiteMessage)gxsx0).isImmutable()) {
            int v1 = ((ProtoLiteMessage)gxsx0).t(null);
            if(v1 < 0) {
                throw new IllegalStateException("serialized size must be non-negative, was " + v1);
            }
            v2 = v1;
            fvwz0.a(new fvwx(0x89, fvwz0.f(), "success %2$d, size %3$d", null, ((int)z), v2, -1));
            return (fwzu)object0;
        }
        else {
            int v3 = gxsx0.memoizedSerializedSize & 0x7FFFFFFF;
            if(v3 == 0x7FFFFFFF) {
                v3 = ((ProtoLiteMessage)gxsx0).t(null);
                if(v3 < 0) {
                    throw new IllegalStateException("serialized size must be non-negative, was " + v3);
                }
                gxsx0.memoizedSerializedSize = gxsx0.memoizedSerializedSize & 0x80000000 | v3;
                v2 = v3;
                fvwz0.a(new fvwx(0x89, fvwz0.f(), "success %2$d, size %3$d", null, ((int)z), v2, -1));
                return (fwzu)object0;
            }
            v2 = v3;
        }
        fvwz0.a(new fvwx(0x89, fvwz0.f(), "success %2$d, size %3$d", null, ((int)z), v2, -1));
        return (fwzu)object0;
    }
}

