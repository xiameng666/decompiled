import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public abstract class gbmr extends gbbw {
    LinearLayout s;
    public ImageView u;
    ImageView v;
    TextView w;

    protected gbmr(gast gast0, Class class0) {
        super(gast0, class0);
    }

    @Override  // gass
    protected final void B(View view0) {
        gbeb.a(this.n, this.s, hckq.a);
    }

    @Override  // gass
    public final void R() {
        super.R();
        ImageView imageView0 = this.u;
        if(imageView0 != null) {
            imageView0.setEnabled(this.aC());
        }
        ImageView imageView1 = this.v;
        if(imageView1 != null) {
            imageView1.setEnabled(this.aC());
        }
        TextView textView0 = this.w;
        if(textView0 != null) {
            textView0.setEnabled(this.aC());
        }
    }

    @Override  // gass
    public final void T(int v, Drawable drawable0) {
        switch(v) {
            case 1: {
                this.u.setImageDrawable(drawable0);
                return;
            }
            case 2: {
                this.v.setImageDrawable(drawable0);
            }
        }
    }

    @Override  // gbbw
    protected final void X() {
        super.X();
        this.aq(this.s, this.s);
        if(!this.c()) {
            View view0 = this.i;
            if(view0 != null) {
                view0.setClickable(false);
            }
        }
    }

    protected abstract hdiu a();

    private final void aV() {
        garp garp0 = this.aW("BE_BDDIP_01");
        if(((gbmu)garp0).e()) {
            this.u.setImageDrawable(null);
            this.M(1, ((gbmu)garp0).c(), this.b());
            this.u.setContentDescription(((gbmu)garp0).c().e);
        }
        else {
            this.u.setVisibility(8);
        }
        if(((gbmu)garp0).d()) {
            this.v.setImageDrawable(null);
            this.M(2, ((gbmu)garp0).a(), this.a());
            this.v.setContentDescription(((gbmu)garp0).c().e);
        }
        else {
            this.v.setVisibility(8);
        }
        this.w.setText(garp0.t());
    }

    @Override  // gbbw
    protected final void aZ() {
        this.aV();
    }

    @Override  // gass
    protected final void ab() {
        super.ab();
        this.aj();
    }

    @Override  // gbbw
    protected void ad(hdrl hdrl0, hdrl hdrl1) {
        super.ad(hdrl0, hdrl1);
        if(this.s == null) {
            LinearLayout linearLayout0 = (LinearLayout)this.a.a.b().inflate(0x7F0E0E26, null);  // layout:wallet_view_drop_down_option
            this.s = linearLayout0;
            this.u = (ImageView)linearLayout0.findViewById(0x7F0B11B9);  // id:dropdown_selector_option_start_icon
            this.v = (ImageView)this.s.findViewById(0x7F0B11B8);  // id:dropdown_selector_option_end_icon
            this.u.setAdjustViewBounds(true);
            this.v.setAdjustViewBounds(true);
            this.w = (TextView)this.s.findViewById(0x7F0B11BA);  // id:dropdown_selector_option_text
        }
        this.aV();
    }

    protected abstract hdiu b();

    protected boolean c() {
        return false;
    }
}

