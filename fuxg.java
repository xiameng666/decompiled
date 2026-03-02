import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public final class fuxg {
    public final List a;
    public final long b;
    public final long c;
    public final int d;
    public final int e;
    public fuxf f;

    public fuxg(List list0, long v, long v1, int v2) {
        this.e = -1;
        if(list0.isEmpty()) {
            throw new IllegalArgumentException("probableActivities is not filled!");
        }
        this.a = list0;
        this.b = v;
        this.c = v1;
        this.d = v2;
    }

    public fuxg(List list0, long v, long v1, int v2, int v3, fuxf fuxf0) {
        this(list0, v, v1, v2);
        this.e = v3;
        this.f = fuxf0;
    }

    public final int a(fuxh fuxh0) {
        for(Object object0: this.a) {
            fuxi fuxi0 = (fuxi)object0;
            if(fuxi0.a == fuxh0) {
                return fuxi0.b;
            }
        }
        return 0;
    }

    public final fuxi b() {
        return (fuxi)this.a.get(0);
    }

    public final fuxi c() {
        List list0 = this.a;
        for(Object object0: list0) {
            fuxi fuxi0 = (fuxi)object0;
            if((fuxi0.a != fuxh.c || this.a(fuxh.h) <= 0 && this.a(fuxh.i) <= 0) && (fuxi0.a != fuxh.a || this.a(fuxh.q) <= 0 && this.a(fuxh.r) <= 0)) {
                return fuxi0;
            }
        }
        return (fuxi)list0.get(0);
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof fuxg) && this.a.equals(((fuxg)object0).a) && this.b == ((fuxg)object0).b && this.c == ((fuxg)object0).c && this.d == ((fuxg)object0).d && this.e == ((fuxg)object0).e;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, ((long)this.b), ((long)this.c), ((int)this.d)});
    }

    @Override
    public final String toString() {
        return String.format(Locale.US, "ActivityRecognitionResultInternal [probableActivities=%s, timeMillis=%d, elapsedRealtimeMillis=%d, detectorInfoId=%d]", this.a, ((long)this.b), ((long)this.c), ((int)this.d));
    }
}

