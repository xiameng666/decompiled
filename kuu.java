import android.app.PendingIntent;

public final class kuu {
    public final CharSequence a;
    public final PendingIntent b;
    public final CharSequence c;

    public kuu(CharSequence charSequence0, PendingIntent pendingIntent0, CharSequence charSequence1) {
        ibuq.f(charSequence0, "title");
        ibuq.f(pendingIntent0, "pendingIntent");
        super();
        this.a = charSequence0;
        this.b = pendingIntent0;
        this.c = charSequence1;
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
        return (object0 instanceof kuu) ? ibuq.m(this.a, ((kuu)object0).a) && ibuq.m(this.b, ((kuu)object0).b) && ibuq.m(this.c, ((kuu)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode() * 0x1F + this.b.hashCode();
        return this.c == null ? v * 0x1F : v * 0x1F + this.c.hashCode();
    }
}

