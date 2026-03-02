import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnPreDrawListener;
import j..util.Objects;

final class duir implements ViewTreeObserver.OnPreDrawListener {
    final View a;
    final View b;
    final ViewGroup c;
    final Context d;
    final fyfv e;
    final View.OnClickListener f;
    final duit g;
    private boolean h;

    public duir(duit duit0, View view0, View view1, ViewGroup viewGroup0, Context context0, fyfv fyfv0, View.OnClickListener view$OnClickListener0) {
        this.a = view0;
        this.b = view1;
        this.c = viewGroup0;
        this.d = context0;
        this.e = fyfv0;
        this.f = view$OnClickListener0;
        Objects.requireNonNull(duit0);
        this.g = duit0;
        super();
        this.h = false;
    }

    @Override  // android.view.ViewTreeObserver$OnPreDrawListener
    public final boolean onPreDraw() {
        View view0 = this.a;
        Rect rect0 = new Rect();
        view0.getDrawingRect(rect0);
        ViewGroup viewGroup0 = duit.a(view0);
        if(viewGroup0 != null) {
            ViewGroup viewGroup1 = (ViewGroup)viewGroup0.getParent();
            viewGroup1.offsetDescendantRectToMyCoords(view0, rect0);
            Rect rect1 = new Rect();
            viewGroup1.getDrawingRect(rect1);
            view0.setTranslationY(((float)(rect1.bottom - rect0.bottom)));
        }
        if(!this.h) {
            Rect rect2 = new Rect();
            this.b.getDrawingRect(rect2);
            this.c.offsetDescendantRectToMyCoords(this.b, rect2);
            Rect rect3 = new Rect();
            this.c.getDrawingRect(rect3);
            duit duit0 = this.g;
            Resources resources0 = this.d.getResources();
            float f = view0.getTranslationY();
            if(duit.i(resources0, this.b, this.c, f)) {
                this.h = true;
                duit0.f(this.e, 0x7F150815, this.f);  // string:common_continue "Continue"
            }
        }
        return true;
    }
}

