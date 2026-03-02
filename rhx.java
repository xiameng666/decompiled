import j..time.Instant;
import java.net.URL;

public final class rhx extends rhz {
    public final String a;
    private final int b;
    private final URL c;
    private final String d;
    private final String e;
    private final Instant f;
    private final gged_interceptors g;

    public rhx() {
        throw null;
    }

    public rhx(int v, URL uRL0, String s, String s1, String s2, Instant instant0, gged_interceptors gged0) {
        this.b = v;
        this.c = uRL0;
        this.d = s;
        this.e = s1;
        this.a = s2;
        this.f = instant0;
        this.g = gged0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if((object0 instanceof rhx) && this.b == ((rhx)object0).b) {
            URL uRL0 = this.c;
            if(uRL0 != null) {
                if(uRL0.equals(((rhx)object0).c)) {
                label_8:
                    String s = this.d;
                    if(s != null) {
                        if(s.equals(((rhx)object0).d)) {
                        label_13:
                            String s1 = this.e;
                            if(s1 != null) {
                                if(s1.equals(((rhx)object0).e)) {
                                label_18:
                                    if(this.a.equals(((rhx)object0).a)) {
                                        Instant instant0 = this.f;
                                        if(instant0 == null) {
                                            return ((rhx)object0).f == null ? ggia.i(this.g, ((rhx)object0).g) : false;
                                        }
                                        return instant0.equals(((rhx)object0).f) ? ggia.i(this.g, ((rhx)object0).g) : false;
                                    }
                                }
                            }
                            else if(((rhx)object0).e == null) {
                                goto label_18;
                            }
                        }
                    }
                    else if(((rhx)object0).d == null) {
                        goto label_13;
                    }
                }
            }
            else if(((rhx)object0).c == null) {
                goto label_8;
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = (((((this.c == null ? 0 : this.c.hashCode()) ^ (this.b ^ 1000003) * 1000003) * 1000003 ^ (this.d == null ? 0 : this.d.hashCode())) * 1000003 ^ (this.e == null ? 0 : this.e.hashCode())) * 1000003 ^ this.a.hashCode()) * 1000003;
        Instant instant0 = this.f;
        if(instant0 != null) {
            v = instant0.hashCode();
        }
        return this.g.hashCode() ^ (v1 ^ v) * 1000003;
    }

    @Override
    public final String toString() {
        return "AcquireTemporaryTokenResponse{operationResult=" + this.b + ", generalErrorUrl=" + this.c + ", generalErrorUserData=" + this.d + ", generalErrorText=" + this.e + ", temporaryToken=" + this.a + ", temporaryTokenExpiry=" + this.f + ", operationTargets=" + this.g + "}";
    }
}

