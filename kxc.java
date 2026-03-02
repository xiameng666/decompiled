import android.app.PendingIntent;

public final class kxc {
    public final PendingIntent a;
    public boolean b;

    public kxc(PendingIntent pendingIntent0) {
        ibuq.f(pendingIntent0, "pendingIntent");
        super();
        this.a = pendingIntent0;
    }

    public kxc(PendingIntent pendingIntent0, boolean z) {
        ibuq.f(pendingIntent0, "pendingIntent");
        this(pendingIntent0);
        this.b = z;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof kxc) ? ibuq.m(this.a, ((kxc)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
}

