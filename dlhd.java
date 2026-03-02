import com.google.android.gms.pay.AddValuableIntentArgs;
import com.google.android.gms.pay.FopDetailIntentArgs;
import com.google.android.gms.pay.PayIntentArgs;
import com.google.android.gms.pay.ValuableDetailIntentArgs;
import com.google.android.gms.pay.WearClosedLoopCardIntentArgs;

public final class dlhd {
    public final PayIntentArgs a;

    public dlhd() {
        this.a = new PayIntentArgs();
    }

    public final void a(AddValuableIntentArgs addValuableIntentArgs0) {
        this.a.p = addValuableIntentArgs0;
    }

    public final void b(FopDetailIntentArgs fopDetailIntentArgs0) {
        this.a.e = fopDetailIntentArgs0;
    }

    public final void c(ValuableDetailIntentArgs valuableDetailIntentArgs0) {
        this.a.m = valuableDetailIntentArgs0;
    }

    public final void d(WearClosedLoopCardIntentArgs wearClosedLoopCardIntentArgs0) {
        this.a.y = wearClosedLoopCardIntentArgs0;
    }
}

