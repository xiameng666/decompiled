import com.google.android.gms.common.api.Status;

public final class azth implements azuj {
    public final Status a;
    public final boolean b;

    public azth(Status status0, boolean z) {
        batl.t(status0, "Status must not be null");
        this.a = status0;
        this.b = z;
    }

    @Override  // azuj
    public final Status a() {
        return this.a;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == null) {
            return false;
        }
        if(object0 == this) {
            return true;
        }
        return (object0 instanceof azth) ? this.a.equals(((azth)object0).a) && this.b == ((azth)object0).b : false;
    }

    @Override
    public final int hashCode() {
        return (this.a.hashCode() + 0x20F) * 0x1F + this.b;
    }
}

