import android.content.Intent;

public final class byaa {
    public final int a;
    public final Intent b;

    public byaa(int v, Intent intent0) {
        this.a = v;
        this.b = intent0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof byaa)) {
            return false;
        }
        return this.a == ((byaa)object0).a ? ibuq.m(this.b, ((byaa)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return this.b == null ? this.a * 0x1F : this.a * 0x1F + this.b.hashCode();
    }

    @Override
    public final String toString() {
        return "ProviderPendingIntentResponse(resultCode=" + this.a + ", resultData=" + this.b + ")";
    }
}

