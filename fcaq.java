import android.content.Context;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;

public abstract class fcaq extends gdbm {
    protected TextView a;
    protected TextView b;
    protected ImageView c;
    protected LinearLayout d;

    public fcaq(Context context0) {
        super(context0);
        this.e(context0);
    }

    @Override  // gdbm
    public final void b(String s) {
        super.b(s);
        this.c.setTag(0x7F0B218C, s);  // id:summary_expander_transition_name
        this.b.setTag(0x7F0B218C, s);  // id:summary_expander_transition_name
        this.a.setTag(0x7F0B218C, s);  // id:summary_expander_transition_name
    }

    @Override  // gdbm
    public void c(boolean z, boolean z1) {
        super.c(z, z1);
        int v = 0;
        int v1 = z || !this.k.isChecked() ? 1 : 0;
        this.c.setVisibility((1 == v1 ? 8 : 0));
        if(1 != v1) {
            v = 8;
        }
        this.k.setVisibility(v);
    }

    @Override  // gdbm
    public boolean d() {
        return true;
    }

    protected void e(Context context0) {
        LayoutInflater.from(context0).inflate(0x7F0E0E1E, this, true);  // layout:wallet_view_customer_option
        this.c = (ImageView)this.findViewById(0x7F0B107A);  // id:customer_image
        this.k = (RadioButton)this.findViewById(0x7F0B1DFD);  // id:radio_button
        this.a = (TextView)this.findViewById(0x7F0B107C);  // id:customer_name
        this.b = (TextView)this.findViewById(0x7F0B1077);  // id:customer_description
        this.l = (ImageView)this.findViewById(0x7F0B133E);  // id:expand_icon
        this.m = this.findViewById(0x7F0B1078);  // id:customer_divider_line
        this.d = (LinearLayout)this.findViewById(0x7F0B1076);  // id:customer_container
        this.setBackgroundResource(0x7F0810B7);  // drawable:wallet_uic_ripple_background
        this.p();
    }

    public static long f(Object object0) {
        if((object0 instanceof gexm)) {
            return gcgh.b(((gexm)object0).d, 1);
        }
        return (object0 instanceof gexl) ? ((gexl)object0).b : 0L;
    }
}

