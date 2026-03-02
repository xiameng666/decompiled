import android.view.View.OnClickListener;
import android.view.View;
import com.google.android.libraries.tapandpay.pay.pass.valuable.model.Valuable;
import com.google.android.libraries.tapandpay.pay.pass.valuable.model.ValuableGroup;

public final class dvsi implements View.OnClickListener {
    public final dvsj a;
    public final Valuable b;
    public final ValuableGroup c;

    public dvsi(dvsj dvsj0, Valuable valuable0, ValuableGroup valuableGroup0) {
        this.a = dvsj0;
        this.b = valuable0;
        this.c = valuableGroup0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        gfsx gfsx0 = gfsx.m(this.c.h());
        this.a.b.D(this.b, gfsx0);
    }
}

