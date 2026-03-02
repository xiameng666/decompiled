import androidx.activity.result.ActivityResult;
import com.google.android.gms.pay.pass.valuable.view.detail.ValuableDetailUnifiedFragment;

public final class dvvb implements acn {
    public final ValuableDetailUnifiedFragment a;

    public dvvb(ValuableDetailUnifiedFragment valuableDetailUnifiedFragment0) {
        this.a = valuableDetailUnifiedFragment0;
    }

    @Override  // acn
    public final void jN(Object object0) {
        if(((ActivityResult)object0).a == -1) {
            ValuableDetailUnifiedFragment valuableDetailUnifiedFragment0 = this.a;
            if(valuableDetailUnifiedFragment0.ak.a.a.equals(fuor.b)) {
                xob xob0 = valuableDetailUnifiedFragment0.an();
                if(xob0 != null) {
                    evql evql0 = valuableDetailUnifiedFragment0.aA.aS(valuableDetailUnifiedFragment0.b);
                    evql0.x(xob0, new dvvx(valuableDetailUnifiedFragment0));
                    evql0.u(xob0, new dvvy());
                }
            }
            else {
                xob xob1 = valuableDetailUnifiedFragment0.an();
                if(xob1 != null) {
                    valuableDetailUnifiedFragment0.as(xob1.getIntent());
                }
            }
        }
    }
}

