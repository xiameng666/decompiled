import android.content.Context;
import android.content.res.TypedArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import com.google.android.wallet.ui.common.ImageWithCaptionView;

public final class fcae extends gdbm {
    public boolean a;
    public boolean b;
    public boolean c;
    public gfgo d;
    protected final ImageWithCaptionView e;
    protected final TextView f;
    protected final TextView g;

    public fcae(Context context0) {
        super(context0);
        LayoutInflater.from(context0).inflate(0x7F0E0E00, this, true);  // layout:wallet_view_account_option
        this.e = (ImageWithCaptionView)this.findViewById(0x7F0B0A74);  // id:account_image
        this.k = (RadioButton)this.findViewById(0x7F0B1DFD);  // id:radio_button
        this.f = (TextView)this.findViewById(0x7F0B0A6B);  // id:account_display_name
        this.g = (TextView)this.findViewById(0x7F0B0A76);  // id:account_label
        this.l = (ImageView)this.findViewById(0x7F0B133E);  // id:expand_icon
        this.m = this.findViewById(0x7F0B0A6D);  // id:account_divider_line
        this.setBackgroundResource(0x7F0810B7);  // drawable:wallet_uic_ripple_background
        this.p();
        TypedArray typedArray0 = this.getContext().obtainStyledAttributes(null, new int[]{0x7F040062}, 0, 0);  // attr:accountOptionExpandIconEndAligned
        boolean z = typedArray0.getBoolean(0, false);
        typedArray0.recycle();
        if(z) {
            ((ViewGroup)this.l.getParent()).removeView(this.l);
            ((ViewGroup)this.findViewById(0x7F0B0A8C)).addView(this.l);  // id:account_row
        }
    }

    @Override  // gdbk
    public final CharSequence a() {
        return this.getResources().getString(0x7F15350C, new Object[]{this.g.getText()});  // string:wallet_account_selected "%1$s selected"
    }

    @Override  // gdbm
    public final void b(String s) {
        super.b(s);
        this.e.setTag(0x7F0B218C, s);  // id:summary_expander_transition_name
        this.f.setTag(0x7F0B218C, s);  // id:summary_expander_transition_name
        this.g.setTag(0x7F0B218C, s);  // id:summary_expander_transition_name
    }

    @Override  // gdbm
    public final void c(boolean z, boolean z1) {
        super.c(z, z1);
        int v = 8;
        if(this.b) {
            if(this.c) {
                int v1 = z || !this.r() ? 0 : 1;
                this.e.setVisibility((1 == v1 ? 0 : 4));
                this.k.setVisibility((1 == v1 ? 8 : 0));
            }
            else {
                ImageWithCaptionView imageWithCaptionView0 = this.e;
                float f = 0.75f;
                imageWithCaptionView0.setScaleX((this.r() ? 1.0f : 0.75f));
                if(this.r()) {
                    f = 1.0f;
                }
                imageWithCaptionView0.setScaleY(f);
            }
        }
        int v2 = !z || !this.r() ? 0 : 1;
        View view0 = this.m;
        if(1 == v2) {
            v = 0;
        }
        view0.setVisibility(v);
    }

    @Override  // gdbm
    public final boolean d() {
        return true;
    }
}

