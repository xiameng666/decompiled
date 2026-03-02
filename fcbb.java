import android.content.Context;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import com.google.android.wallet.ui.common.ImageWithCaptionView;
import com.google.android.wallet.ui.common.InfoMessageView;

public final class fcbb extends gdbm {
    final ImageWithCaptionView a;
    final TextView b;
    final InfoMessageView c;
    public boolean d;

    public fcbb(Context context0) {
        super(context0);
        LayoutInflater.from(context0).inflate(0x7F0E0E33, this, true);  // layout:wallet_view_field_selector_option
        this.k = (RadioButton)this.findViewById(0x7F0B1DFD);  // id:radio_button
        this.b = (TextView)this.findViewById(0x7F0B117B);  // id:display_value
        this.c = (InfoMessageView)this.findViewById(0x7F0B1179);  // id:display_sub_value
        this.a = (ImageWithCaptionView)this.findViewById(0x7F0B1F91);  // id:select_field_image
        this.l = (ImageView)this.findViewById(0x7F0B133E);  // id:expand_icon
        this.m = this.findViewById(0x7F0B1F90);  // id:select_field_divider_line
        this.setBackgroundResource(0x7F0810B7);  // drawable:wallet_uic_ripple_background
        this.p();
    }

    @Override  // gdbk
    public final CharSequence a() {
        return this.getResources().getString(0x7F153534, new Object[]{((gfio)this.p).c});  // string:wallet_field_selector_option_selected "%1$s selected"
    }

    @Override  // gdbm
    public final void b(String s) {
        super.b(s);
        this.b.setTag(0x7F0B218C, s);  // id:summary_expander_transition_name
        this.c.setTag(0x7F0B218C, s);  // id:summary_expander_transition_name
        this.a.setTag(0x7F0B218C, s);  // id:summary_expander_transition_name
    }

    @Override  // gdbm
    public final void c(boolean z, boolean z1) {
        int v = 0;
        super.c(z, z1);
        boolean z2 = this.k.isChecked();
        if((((gfio)this.p).b & 0x200) != 0) {
            boolean z3 = z2 && !z;
            this.a.setVisibility((this.d || z3 ? 0 : 8));
            if(this.d || z3) {
                v = 8;
            }
            this.k.setVisibility(v);
        }
        if(!((gfio)this.p).e.isEmpty()) {
            if(z2 && !z) {
                this.b.setText(((gfio)this.p).e);
                InfoMessageView infoMessageView0 = this.c;
                gfgr gfgr0 = ((gfio)this.p).g;
                if(gfgr0 == null) {
                    gfgr0 = gfgr.a;
                }
                infoMessageView0.p(gfgr0);
                return;
            }
            String s = gdcd.k(((gfio)this.p));
            this.b.setText(s);
            InfoMessageView infoMessageView1 = this.c;
            gfgr gfgr1 = ((gfio)this.p).f;
            if(gfgr1 == null) {
                gfgr1 = gfgr.a;
            }
            infoMessageView1.p(gfgr1);
        }
    }
}

