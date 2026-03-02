import android.view.View;
import com.google.android.libraries.tapandpay.ui.form.AmountInputForm;
import java.util.Objects;

public final class fuln extends kdl {
    final AmountInputForm a;

    public fuln(AmountInputForm amountInputForm0) {
        this.a = amountInputForm0;
        super();
    }

    @Override  // kdl
    public final void c(View view0, khb khb0) {
        ibuq.f(view0, "host");
        super.c(view0, khb0);
        if(khb0.j() == null) {
            return;
        }
        try {
            Double double0 = ibzk.e(khb0.j().toString());
            double f = double0 == null ? 0.0 : ((double)double0);
            String s = this.a.e;
            if(s == null) {
                ibuq.j("currencyCode");
                s = null;
            }
            khb0.ab(fscd.e(((long)(f * 1000000.0)), s));
        }
        catch(NumberFormatException unused_ex) {
            ((ggsc)AmountInputForm.a.j().ar(19010)).B("Failed to parse %s to double", khb0.j());
            CharSequence charSequence0 = this.a.b.getText();
            CharSequence charSequence1 = khb0.j();
            Objects.toString(charSequence0);
            Objects.toString(charSequence1);
            khb0.ab(charSequence0 + String.valueOf(charSequence1));
        }
    }
}

