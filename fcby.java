import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import com.google.android.wallet.ui.common.ImageWithCaptionView;

public abstract class fcby extends gdbm {
    protected View b;
    protected ImageWithCaptionView c;
    protected TextView d;
    protected TextView e;
    protected TextView f;
    protected TextView g;
    protected boolean h;
    public int i;
    public int j;

    public fcby(Context context0) {
        super(context0);
        this.lS(context0);
    }

    @Override  // gdbk
    public final CharSequence a() {
        return this.getResources().getString(0x7F15353F, new Object[]{this.d.getText()});  // string:wallet_instrument_selected "%1$s selected"
    }

    @Override  // gdbm
    public void b(String s) {
        super.b(s);
        this.c.setTag(0x7F0B218C, s);  // id:summary_expander_transition_name
        this.d.setTag(0x7F0B218C, s);  // id:summary_expander_transition_name
        this.e.setTag(0x7F0B218C, s);  // id:summary_expander_transition_name
        this.f.setTag(0x7F0B218C, s);  // id:summary_expander_transition_name
        this.g.setTag(0x7F0B218C, s);  // id:summary_expander_transition_name
    }

    @Override  // gdbm
    public void c(boolean z, boolean z1) {
        super.c(z, z1);
        int v = 0;
        int v1 = z || !this.k.isChecked() ? 1 : 0;
        if(this.h) {
            this.c.setVisibility(8);
            ViewGroup.LayoutParams viewGroup$LayoutParams0 = this.b.getLayoutParams();
            viewGroup$LayoutParams0.width = v1 == 0 ? this.j : this.i;
            this.b.requestLayout();
        }
        else if(this.h()) {
            this.c.setVisibility((1 == v1 ? 8 : 0));
        }
        if(1 != v1) {
            v = 8;
        }
        this.k.setVisibility(v);
    }

    protected abstract gfgo f();

    protected abstract boolean h();

    public final void i(MessageLite hfvm0) {
        this.p = hfvm0;
        gfgo gfgo0 = this.f();
        ImageWithCaptionView imageWithCaptionView0 = this.c;
        if(!this.h()) {
            gfgo0 = null;
        }
        imageWithCaptionView0.o(gfgo0, fbgn.o(this.getContext()));
    }

    protected void lS(Context context0) {
        LayoutInflater.from(context0).inflate(0x7F0E0E41, this, true);  // layout:wallet_view_instrument_option
        this.b = this.findViewById(0x7F0B16E9);  // id:image_container
        this.c = (ImageWithCaptionView)this.findViewById(0x7F0B174C);  // id:instrument_image
        this.k = (RadioButton)this.findViewById(0x7F0B1DFD);  // id:radio_button
        this.d = (TextView)this.findViewById(0x7F0B174D);  // id:instrument_label
        this.e = (TextView)this.findViewById(0x7F0B1746);  // id:instrument_additional_label_collapsed
        this.f = (TextView)this.findViewById(0x7F0B1747);  // id:instrument_additional_label_expanded
        this.g = (TextView)this.findViewById(0x7F0B2489);  // id:warning_message
        this.l = (ImageView)this.findViewById(0x7F0B133E);  // id:expand_icon
        this.m = this.findViewById(0x7F0B1748);  // id:instrument_divider_line
        this.setBackgroundResource(0x7F0810B7);  // drawable:wallet_uic_ripple_background
        this.p();
        this.i = this.getResources().getDimensionPixelSize(0x7F0715A6);  // dimen:wallet_uic_page_left_column_width
    }
}

