import com.google.android.gms.common.api.Status;

public final class bnzo {
    public final gfsx a;
    public final int b;

    public bnzo() {
        throw null;
    }

    public bnzo(int v, gfsx gfsx0) {
        if(v == 0) {
            throw new NullPointerException("Null state");
        }
        this.b = v;
        this.a = gfsx0;
    }

    public static bnzo a(Status status0) {
        return new bnzo(3, gfsx.m(status0));
    }

    public static bnzo b() {
        return new bnzo(8, gfqx.a);
    }

    public static bnzo c(int v) {
        boolean z = false;
        switch(v) {
            case 3: 
            case 5: {
                break;
            }
            case 7: {
                v = 7;
                break;
            }
            default: {
                z = true;
            }
        }
        gftb.checkTrue(z);
        return new bnzo(v, gfqx.a);
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof bnzo) && this.b == ((bnzo)object0).b && this.a.equals(((bnzo)object0).a);
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode() ^ (this.b ^ 1000003) * 1000003;
    }

    @Override
    public final String toString() {
        return "StateArrival{state=" + bnzn.a(this.b) + ", resolution=" + this.a.toString() + "}";
    }
}

