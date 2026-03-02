import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

public final class iakq {
    public static final iakq a;
    public final ials b;
    public final Executor c;
    public final String d;
    public final iakn e;
    public final String f;
    public final List g;
    public final Integer h;
    public final Integer i;
    private final Object[][] j;
    private final Boolean k;

    static {
        iako iako0 = new iako();
        iako0.e = new Object[0][2];
        iako0.f = Collections.EMPTY_LIST;
        iakq.a = new iakq(iako0);
    }

    public iakq(iako iako0) {
        this.b = iako0.a;
        this.c = iako0.b;
        this.d = null;
        this.e = iako0.c;
        this.f = iako0.d;
        this.j = iako0.e;
        this.g = iako0.f;
        this.k = iako0.g;
        this.h = iako0.h;
        this.i = iako0.i;
    }

    public static iako a(iakq iakq0) {
        iako iako0 = new iako();
        iako0.a = iakq0.b;
        iako0.b = iakq0.c;
        iako0.c = iakq0.e;
        iako0.d = iakq0.f;
        iako0.e = iakq0.j;
        iako0.f = iakq0.g;
        iako0.g = iakq0.k;
        iako0.h = iakq0.h;
        iako0.i = iakq0.i;
        return iako0;
    }

    public final iakq b(String s) {
        iako iako0 = iakq.a(this);
        iako0.d = s;
        return new iakq(iako0);
    }

    public final iakq c(ials ials0) {
        iako iako0 = iakq.a(this);
        iako0.a = ials0;
        return new iakq(iako0);
    }

    public final iakq d(long v, TimeUnit timeUnit0) {
        return this.c(ials.c(v, timeUnit0));
    }

    public final iakq e(Executor executor0) {
        iako iako0 = iakq.a(this);
        iako0.b = executor0;
        return new iakq(iako0);
    }

    public final iakq f(int v) {
        gftb.d(v >= 0, "invalid maxsize %s", v);
        iako iako0 = iakq.a(this);
        iako0.h = v;
        return new iakq(iako0);
    }

    public final iakq g(int v) {
        gftb.d(v >= 0, "invalid maxsize %s", v);
        iako iako0 = iakq.a(this);
        iako0.i = v;
        return new iakq(iako0);
    }

    public final iakq h(iakp iakp0, Object object0) {
        int v1;
        Object[][] arr2_object;
        gftb.z(iakp0, "key");
        gftb.z(object0, "value");
        iako iako0 = iakq.a(this);
        int v;
        for(v = 0; true; ++v) {
            arr2_object = this.j;
            v1 = arr2_object.length;
            if(v >= v1) {
                v = -1;
                break;
            }
            if(iakp0.equals(arr2_object[v][0])) {
                break;
            }
        }
        iako0.e = new Object[(v == -1 ? 1 : 0) + v1][2];
        System.arraycopy(arr2_object, 0, iako0.e, 0, v1);
        if(v == -1) {
            iako0.e[v1] = new Object[]{iakp0, object0};
            return new iakq(iako0);
        }
        iako0.e[v] = new Object[]{iakp0, object0};
        return new iakq(iako0);
    }

    public final iakq i(ialb ialb0) {
        ArrayList arrayList0 = new ArrayList(this.g.size() + 1);
        arrayList0.addAll(this.g);
        arrayList0.add(ialb0);
        iako iako0 = iakq.a(this);
        iako0.f = DesugarCollections.unmodifiableList(arrayList0);
        return new iakq(iako0);
    }

    public final Object j(iakp iakp0) {
        gftb.z(iakp0, "key");
        for(int v = 0; true; ++v) {
            Object[][] arr2_object = this.j;
            if(v >= arr2_object.length) {
                break;
            }
            if(iakp0.equals(arr2_object[v][0])) {
                return arr2_object[v][1];
            }
        }
        return iakp0.a;
    }

    public final boolean k() {
        return Boolean.TRUE.equals(this.k);
    }

    @Override
    public final String toString() {
        ToStringHelper gfsv0 = MoreObjects.toStringHelper(this);
        gfsv0.add("deadline", this.b);
        gfsv0.add("authority", null);
        gfsv0.add("callCredentials", this.e);
        gfsv0.add("executor", (this.c == null ? null : this.c.getClass()));
        gfsv0.add("compressorName", this.f);
        gfsv0.add("customOptions", Arrays.deepToString(this.j));
        gfsv0.addBool("waitForReady", this.k());
        gfsv0.add("maxInboundMessageSize", this.h);
        gfsv0.add("maxOutboundMessageSize", this.i);
        gfsv0.add("onReadyThreshold", null);
        gfsv0.add("streamTracerFactories", this.g);
        return gfsv0.toString();
    }
}

