import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.flexbox.FlexboxLayout;

public final class buqd extends ConstraintLayout implements ejbp {
    public final TextView h;
    public final FlexboxLayout i;
    public final View j;
    public int k;
    public cmec l;
    public buoa m;
    private ejas n;
    private boolean o;

    public buqd(Context context0) {
        super(context0, null);
        if(!this.isInEditMode() && !this.o) {
            this.o = true;
            ((buql)this.h()).b(this);
        }
        LayoutInflater.from(context0).inflate(0x7F0E0AD4, this, true);  // layout:suggested_items_view
        this.h = (TextView)kfb.b(this, 0x7F0B22B8);  // id:title
        this.i = (FlexboxLayout)kfb.b(this, 0x7F0B2503);  // id:widgets_container
        this.j = (View)kfb.b(this, 0x7F0B120E);  // id:empty_state_view
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
        if(this.n == null) {
            this.n = new ejas(this);
        }
        return this.n;
    }
}

