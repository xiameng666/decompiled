import android.content.Intent;

public final class eaae extends eaaf {
    public final Intent a;

    public eaae() {
        this(null);
    }

    public eaae(Intent intent0) {
        this.a = intent0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof eaae) ? ibuq.m(this.a, ((eaae)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a == null ? 0 : this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "SuccessScreen(nextStepIntent=" + this.a + ")";
    }
}

