import android.content.Context;
import com.google.android.gms.pay.pass.valuable.view.detail.ValuableDetailUnifiedFragment;
import com.google.android.libraries.tapandpay.pay.pass.valuable.model.Valuable;

public final class dvvk implements kar {
    public final ValuableDetailUnifiedFragment a;
    public final Context b;

    public dvvk(ValuableDetailUnifiedFragment valuableDetailUnifiedFragment0, Context context0) {
        this.a = valuableDetailUnifiedFragment0;
        this.b = context0;
    }

    @Override  // kar
    public final void accept(Object object0) {
        this.a.ax.setBackgroundColor(fipx.a(this.b, 0x7F040339));  // attr:colorSurfaceContainer
        this.a.ax.setVisibility(0);
        funx.d(this.a.ax, ftrm.c(((dxea)object0).d, true));
        this.a.aj.l(((Valuable)this.a.av.d()), 4, 3);
    }
}

