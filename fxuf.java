import com.google.android.gms.location.reporting.UploadRequest;
import j..util.Objects;

public final class fxuf implements fxug {
    public final long a;
    public final long b;
    public final UploadRequest c;
    public final String d;

    public fxuf(long v, long v1, UploadRequest uploadRequest0, String s) {
        this.a = v;
        this.b = v1;
        batl.t(uploadRequest0, "request");
        this.c = uploadRequest0;
        this.d = s;
    }

    @Override  // fxug
    public final String a() {
        return this.c.b + " (" + this.c.f + ")";
    }

    @Override  // fxug
    public final String b() {
        return this.d;
    }

    @Override  // fxug
    public final long c(boolean z) {
        return z ? this.c.d : this.c.e;
    }

    @Override  // fxug
    public final int d(boolean z) {
        return z ? 1 : 2;
    }

    @Override  // fxug
    public final int e() {
        return 2;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof fxuf) ? this.a == ((fxuf)object0).a && this.b == ((fxuf)object0).b && this.c.equals(((fxuf)object0).c) && Objects.equals(this.d, ((fxuf)object0).d) : false;
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{((long)this.a), ((long)this.b), this.c, this.d});
    }

    @Override
    public final String toString() {
        return "IdentifiedUploadRequest{mId=" + this.a + ", mElapsedRealtime=" + this.b + ", mRequest=" + this.c.toString() + ", mSourcePackage=" + this.d + "}";
    }
}

