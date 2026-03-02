import android.content.Context;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import com.google.android.wallet.ui.common.ImageWithCaptionView;

public abstract class fcai extends gdbm {
    protected final ImageWithCaptionView d;
    protected final TextView e;
    protected final TextView f;
    protected final TextView g;
    protected final LinearLayout h;
    protected final ImageView i;

    public fcai(Context context0) {
        super(context0);
        LayoutInflater.from(context0).inflate(0x7F0E0E04, this, true);  // layout:wallet_view_address_option
        this.d = (ImageWithCaptionView)this.findViewById(0x7F0B0B49);  // id:address_image
        this.k = (RadioButton)this.findViewById(0x7F0B1DFD);  // id:radio_button
        this.e = (TextView)this.findViewById(0x7F0B1E14);  // id:recipient_name
        this.f = (TextView)this.findViewById(0x7F0B0B38);  // id:address_detail
        this.g = (TextView)this.findViewById(0x7F0B0B55);  // id:address_warning
        this.l = (ImageView)this.findViewById(0x7F0B133E);  // id:expand_icon
        this.i = (ImageView)this.findViewById(0x7F0B11E0);  // id:edit_image
        this.m = this.findViewById(0x7F0B0B39);  // id:address_divider_line
        this.h = (LinearLayout)this.findViewById(0x7F0B1E12);  // id:recipient_address_container
        this.setBackgroundResource(0x7F0810B7);  // drawable:wallet_uic_ripple_background
        this.p();
    }

    @Override  // gdbm
    public final void b(String s) {
        super.b(s);
        this.d.setTag(0x7F0B218C, s);  // id:summary_expander_transition_name
        this.f.setTag(0x7F0B218C, s);  // id:summary_expander_transition_name
        this.g.setTag(0x7F0B218C, s);  // id:summary_expander_transition_name
        this.e.setTag(0x7F0B218C, s);  // id:summary_expander_transition_name
    }

    @Override  // gdbm
    public void c(boolean z, boolean z1) {
        super.c(z, z1);
        int v = 0;
        int v1 = z || !this.k.isChecked() ? 1 : 0;
        this.d.setVisibility((1 == v1 ? 8 : 0));
        if(1 != v1) {
            v = 8;
        }
        this.k.setVisibility(v);
    }

    @Override  // gdbm
    public boolean d() {
        return true;
    }

    public static long e(Object object0) {
        if((object0 instanceof geuq)) {
            return ((geuq)object0).c;
        }
        if((object0 instanceof geui)) {
            long v = ((geui)object0).s;
            return v == 0L ? gcgh.b(((geui)object0).h, 14) : v;
        }
        return 0L;
    }
}

