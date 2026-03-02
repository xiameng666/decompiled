import android.content.Context;

public final class dlmy {
    public final Context a;
    public final dlmx b;
    public final dlmt c;

    public dlmy(Context context0, dlmx dlmx0, dlmt dlmt0) {
        ibuq.f(context0, "appContext");
        super();
        this.a = context0;
        this.b = dlmx0;
        this.c = dlmt0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof dlmy)) {
            return false;
        }
        if(!ibuq.m(this.a, ((dlmy)object0).a)) {
            return false;
        }
        return ibuq.m(this.b, ((dlmy)object0).b) ? ibuq.m(this.c, ((dlmy)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        return (this.a.hashCode() * 0x1F + this.b.hashCode()) * 0x1F + this.c.hashCode();
    }

    @Override
    public final String toString() {
        return "AppProvider(appContext=" + this.a + ", store=" + this.b + ", acwgLogger=" + this.c + ")";
    }
}

