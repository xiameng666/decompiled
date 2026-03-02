import android.view.View.OnClickListener;
import android.view.View;
import com.google.android.gms.common.Feature;
import com.google.android.gms.tapandpay.firstparty.SetOverridePaymentNetworkRequest;
import com.google.android.material.button.MaterialButtonToggleGroup;
import java.util.Arrays;

public final class dnjd implements View.OnClickListener {
    public final dnjs a;
    public final String b;
    public final String c;
    public final MaterialButtonToggleGroup d;
    public final CharSequence e;

    public dnjd(dnjs dnjs0, String s, String s1, MaterialButtonToggleGroup materialButtonToggleGroup0, CharSequence charSequence0) {
        this.a = dnjs0;
        this.b = s;
        this.c = s1;
        this.d = materialButtonToggleGroup0;
        this.e = charSequence0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        esmp esmp0 = new esmp();
        SetOverridePaymentNetworkRequest setOverridePaymentNetworkRequest0 = esmp0.a;
        setOverridePaymentNetworkRequest0.a = this.b;
        String s = this.c;
        if(s != null) {
            setOverridePaymentNetworkRequest0.b = s;
        }
        azzc azzc0 = new azzc();
        azzc0.a = new etcz(this.a.y, esmp0);
        azzc0.c = new Feature[]{eseb.z};
        azzc0.b = false;
        azzc0.d = 0x87D;
        azzd azzd0 = azzc0.a();
        this.a.y.jn(azzd0);
        dnjs.K(this.d);
        this.a.s = s;
        du du0 = this.a.e;
        String s1 = du0.getString(0x7F151E02);  // string:pay_fops_cobadged_payment_network_changed_message "Payment network changed 
                                                // to %1$s"
        ibuq.e(s1, "getString(...)");
        String s2 = String.format(s1, Arrays.copyOf(new Object[]{this.e}, 1));
        ibuq.e(s2, "format(...)");
        if(hwfk.a.b().l() && s == null) {
            s2 = du0.getString(0x7F151E03);  // string:pay_fops_cobadged_payment_network_changed_message_auto "Payment network will 
                                             // be automatically selected"
            ibuq.e(s2, "getString(...)");
        }
        edpc.b(du0.getView(), s2);
    }
}

