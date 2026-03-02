import android.content.Intent;

public final class eaab extends eaaf {
    public final Intent a;

    public eaab(Intent intent0) {
        ibuq.f(intent0, "addPaymentMethodIntent");
        super();
        this.a = intent0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof eaab) ? ibuq.m(this.a, ((eaab)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "AlmostDoneScreen(addPaymentMethodIntent=" + this.a + ")";
    }
}

