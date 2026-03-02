import android.content.Context;
import android.graphics.Paint;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

public final class busn extends ConstraintLayout implements ejbp {
    public final View h;
    public final Button i;
    public final Button j;
    public final TextView k;
    public final TextView l;
    public final LinearLayout m;
    public cmec n;
    private ejas o;
    private boolean p;
    private final View q;

    public busn(Context context0) {
        super(context0, null);
        if(!this.isInEditMode() && !this.p) {
            this.p = true;
            ((busp)this.h()).c(this);
        }
        View view0 = LayoutInflater.from(context0).inflate(0x7F0E0C1A, this, true);  // layout:upsell_card_view
        this.q = view0;
        this.h = (View)kfb.b(view0, 0x7F0B23F5);  // id:upsell_card_container
        this.k = (TextView)kfb.b(view0, 0x7F0B22B8);  // id:title
        this.i = (Button)kfb.b(view0, 0x7F0B0B6E);  // id:agree_button
        this.j = (Button)kfb.b(view0, 0x7F0B1A33);  // id:not_now_button
        this.l = (TextView)kfb.b(view0, 0x7F0B10E6);  // id:description
        this.m = (LinearLayout)kfb.b(view0, 0x7F0B1A76);  // id:offer_tag_container
        busm busm0 = new busm(context0);
        int v = fhbz.c(context0, 0x7F040332);  // attr:colorSurface
        busm0.a = new Paint();
        busm0.a.setColor(v);
        view0.setBackground(busm0);
    }

    @Override  // ejbp
    public final ejbo g() {
        return this.i();
    }

    @Override  // ejbo
    public final Object h() {
        return this.i().h();
    }

    public final ejas i() {
        if(this.o == null) {
            this.o = new ejas(this);
        }
        return this.o;
    }
}

