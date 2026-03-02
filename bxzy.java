import android.content.Intent;

public final class bxzy {
    public final int a;
    public final Intent b;

    public bxzy(int v, Intent intent0) {
        this.a = v;
        this.b = intent0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof bxzy)) {
            return false;
        }
        return this.a == ((bxzy)object0).a ? ibuq.m(this.b, ((bxzy)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return this.b == null ? this.a * 0x1F : this.a * 0x1F + this.b.hashCode();
    }

    @Override
    public final String toString() {
        return "ProviderActivityResult(resultCode=" + this.a + ", data=" + this.b + ")";
    }
}

