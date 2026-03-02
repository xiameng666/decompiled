import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;

public class jth extends jsp {
    private boolean a;
    private boolean b;

    public jth(Context context0) {
        super(context0);
    }

    public jth(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
    }

    public jth(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
    }

    @Override  // jsp
    protected void a(AttributeSet attributeSet0) {
        super.a(attributeSet0);
        if(attributeSet0 != null) {
            TypedArray typedArray0 = this.getContext().obtainStyledAttributes(attributeSet0, jtg.b);
            int v = typedArray0.getIndexCount();
            for(int v1 = 0; v1 < v; ++v1) {
                int v2 = typedArray0.getIndex(v1);
                if(v2 == 6) {
                    this.a = true;
                }
                else if(v2 == 22) {
                    this.b = true;
                }
            }
            typedArray0.recycle();
        }
    }

    public void b(jrv jrv0, int v, int v1) {
    }

    @Override  // jsp
    protected final void h(ConstraintLayout constraintLayout0) {
        this.g(constraintLayout0);
    }

    @Override  // jsp
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if(this.a || this.b) {
            ViewParent viewParent0 = this.getParent();
            if((viewParent0 instanceof ConstraintLayout)) {
                int v = this.getVisibility();
                float f = this.getElevation();
                for(int v1 = 0; v1 < this.d; ++v1) {
                    View view0 = ((ConstraintLayout)viewParent0).a(this.c[v1]);
                    if(view0 != null) {
                        if(this.a) {
                            view0.setVisibility(v);
                        }
                        if(this.b && (f > 0.0f)) {
                            view0.setTranslationZ(view0.getTranslationZ() + f);
                        }
                    }
                }
            }
        }
    }

    @Override  // android.view.View
    public final void setElevation(float f) {
        super.setElevation(f);
        this.f();
    }

    @Override  // android.view.View
    public final void setVisibility(int v) {
        super.setVisibility(v);
        this.f();
    }
}

