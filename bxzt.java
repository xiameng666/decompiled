import android.content.Intent;

public final class bxzt {
    public final bxzu a;
    public final Intent b;

    public bxzt(bxzu bxzu0) {
        this(bxzu0, null);
    }

    public bxzt(bxzu bxzu0, Intent intent0) {
        ibuq.f(bxzu0, "resultState");
        super();
        this.a = bxzu0;
        this.b = intent0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof bxzt)) {
            return false;
        }
        return this.a == ((bxzt)object0).a ? ibuq.m(this.b, ((bxzt)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode() * 0x1F;
        return this.b == null ? v : v + this.b.hashCode();
    }

    @Override
    public final String toString() {
        return "DialogResult(resultState=" + this.a + ", providerResult=" + this.b + ")";
    }
}

