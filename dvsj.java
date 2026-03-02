import android.view.View;
import com.google.android.libraries.tapandpay.pay.pass.valuable.model.Valuable;
import com.google.android.libraries.tapandpay.pay.pass.valuable.model.ValuableGroup;
import j..util.Objects;

final class dvsj extends pdy {
    final ValuableGroup a;
    final dvsn b;

    public dvsj(dvsn dvsn0, ValuableGroup valuableGroup0) {
        this.a = valuableGroup0;
        Objects.requireNonNull(dvsn0);
        this.b = dvsn0;
        super();
    }

    @Override  // pdy
    public final void b(int v) {
        ValuableGroup valuableGroup0 = this.a;
        Valuable valuable0 = (Valuable)valuableGroup0.a.get(v);
        dvsn dvsn0 = this.b;
        dvsn0.au.b(valuable0.b);
        if(dvsn0.getView() != null) {
            View view0 = dvsn0.getView();
            View view1 = view0.findViewById(0x7F0B071A);  // id:RemoveButton
            if(view1 != null) {
                view1.setOnClickListener(new dvsh(this, valuable0));
            }
            View view2 = view0.findViewById(0x7F0B0717);  // id:RemoveAllButton
            if(view2 != null) {
                view2.setOnClickListener(new dvsi(this, valuable0, valuableGroup0));
            }
        }
        dvsn0.I();
        if(valuableGroup0.a() > 1) {
            String s = String.valueOf(valuableGroup0.a());
            dvsn0.aG.setAccessibilityPaneTitle(dvsn0.getString(0x7F152358, new Object[]{valuable0.e, String.valueOf(v + 1), s}));  // string:pay_valuable_wallet_pass_tab_annocement "%1$s, Pass %2$s of %3$s."
        }
        dvsn0.J();
    }
}

