import com.google.android.gms.common.internal.ClientIdentity;
import j..util.Objects;

public final class fxtn {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final ClientIdentity e;

    public fxtn(long v, long v1, long v2, long v3, ClientIdentity clientIdentity0) {
        batl.t(clientIdentity0, "No source package provided");
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = v3;
        this.e = clientIdentity0;
    }

    public final boolean a(fxtn fxtn0) {
        return this.c == fxtn0.c;
    }

    public final boolean b(fxtn fxtn0) {
        return this.b == fxtn0.b && this.a == fxtn0.a && this.d == fxtn0.d;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof fxtn) ? this.a(((fxtn)object0)) && this.b(((fxtn)object0)) && Objects.equals(this.e, ((fxtn)object0).e) : false;
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{((long)this.a), ((long)this.b), ((long)this.c), ((long)this.d), this.e});
    }

    @Override
    public final String toString() {
        return "UlrSampleSpec{mSamplePeriodMs=" + this.a + ", mSampleMinMillis=" + this.b + ", mActivitySampleMillis=" + this.c + ", mMaxWaitTimeMillis=" + this.d + ", mSourcePackage=" + this.e + "}";
    }
}

