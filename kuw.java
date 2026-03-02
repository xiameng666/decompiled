import android.app.PendingIntent;

public final class kuw {
    public final CharSequence a;
    public final PendingIntent b;

    public kuw(CharSequence charSequence0, PendingIntent pendingIntent0) {
        ibuq.f(charSequence0, "title");
        ibuq.f(pendingIntent0, "pendingIntent");
        super();
        this.a = charSequence0;
        this.b = pendingIntent0;
        if(charSequence0.length() > 0) {
            return;
        }
        throw new IllegalArgumentException("title must not be empty");
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof kuw) ? ibuq.m(this.a, ((kuw)object0).a) && ibuq.m(this.b, ((kuw)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode() * 0x1F + this.b.hashCode();
    }
}

