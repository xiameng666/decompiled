import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup;
import java.util.Locale;

public abstract class gbbu extends gbbw implements gasz {
    public ViewGroup s;

    protected gbbu(gast gast0, Class class0) {
        super(gast0, class0);
    }

    @Override  // gbbw
    protected void X() {
        super.X();
        this.aq(this.s, this.b());
    }

    protected ViewGroup aV() {
        return this.s;
    }

    @Override  // gass
    protected void ab() {
        super.ab();
        this.aj();
    }

    @Override  // gbbw
    protected void ad(hdrl hdrl0, hdrl hdrl1) {
        super.ad(hdrl0, hdrl1);
        this.s = this.c();
        if(this.a.a.a.b != 24) {
            this.s.setClipChildren(false);
            this.s.setClipToPadding(false);
        }
    }

    protected View b() {
        return this.s;
    }

    protected abstract ViewGroup c();

    @Override  // gasz
    public void g(gass gass0, View view0) {
        gbns gbns0;
        if(gass0.aO()) {
            ViewGroup viewGroup0 = this.aV();
            ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
            if((viewGroup$LayoutParams0 instanceof ViewGroup.MarginLayoutParams)) {
                TouchDelegate touchDelegate0 = viewGroup0.getTouchDelegate();
                if((touchDelegate0 instanceof gbns)) {
                    gbns0 = (gbns)touchDelegate0;
                }
                else {
                    gbns0 = new gbns(viewGroup0);
                    viewGroup0.setTouchDelegate(gbns0);
                }
                Rect rect0 = new Rect(0, ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0).topMargin, 0, ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0).bottomMargin);
                gftb.z(view0, String.format(Locale.US, "Parameter delegateView cannot be null."));
                gbns0.b.put(view0, rect0);
                gbns0.a(view0);
                view0.addOnLayoutChangeListener(gbns0);
            }
        }
    }

    @Override  // gasz
    public void nP(View view0) {
        this.aV().removeView(view0);
        TouchDelegate touchDelegate0 = this.aV().getTouchDelegate();
        if((touchDelegate0 instanceof gbns)) {
            TouchDelegate touchDelegate1 = (TouchDelegate)((gbns)touchDelegate0).a.remove(view0);
            ((gbns)touchDelegate0).b.remove(view0);
            if(touchDelegate1 == ((gbns)touchDelegate0).c) {
                ((gbns)touchDelegate0).c = null;
            }
            view0.removeOnLayoutChangeListener(((gbns)touchDelegate0));
        }
    }

    @Override  // gasz
    public void nv(gass gass0, View view0, int v) {
        this.aV().addView(view0, v);
    }

    @Override  // gass
    public final View t() {
        return this.s;
    }

    @Override  // gass
    protected gata z() {
        return new gata(this);
    }
}

