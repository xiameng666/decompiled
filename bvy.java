import android.graphics.Matrix;
import android.graphics.RectF;
import android.util.Size;
import android.view.Display;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;

public abstract class bvy {
    Size a;
    final FrameLayout b;
    private final bvo c;
    private boolean d;

    public bvy(FrameLayout frameLayout0, bvo bvo0) {
        this.d = false;
        this.b = frameLayout0;
        this.c = bvo0;
    }

    public abstract View a();

    public abstract gmcd b();

    public abstract void c();

    public abstract void d();

    final void e() {
        this.d = true;
        this.f();
    }

    public final void f() {
        View view0 = this.a();
        if(view0 != null && this.d) {
            bvo bvo0 = this.c;
            Size size0 = new Size(this.b.getWidth(), this.b.getHeight());
            int v = this.b.getLayoutDirection();
            if(size0.getHeight() == 0 || size0.getWidth() == 0) {
                bcs.d("PreviewTransform", "Transform not applied due to PreviewView size: " + size0.toString());
            }
            else if(bvo0.c()) {
                if((view0 instanceof TextureView)) {
                    kay.c(bvo0.c());
                    RectF rectF0 = new RectF(0.0f, 0.0f, ((float)bvo0.a.getWidth()), ((float)bvo0.a.getHeight()));
                    ((TextureView)view0).setTransform(bok.d(rectF0, rectF0, bvo0.a()));
                }
                else {
                    Display display0 = view0.getDisplay();
                    boolean z = true;
                    boolean z1 = bvo0.g && display0 != null && display0.getRotation() != bvo0.e;
                    if(bvo0.g || bvo0.a() == 0) {
                        z = false;
                    }
                    if(z1 || z) {
                        bcs.a("PreviewTransform", "Custom rotation not supported with SurfaceView/PERFORMANCE mode.");
                    }
                }
                kay.c(bvo0.c());
                Matrix matrix0 = bvo0.b(size0, v);
                RectF rectF1 = new RectF(0.0f, 0.0f, ((float)bvo0.a.getWidth()), ((float)bvo0.a.getHeight()));
                matrix0.mapRect(rectF1);
                view0.setPivotX(0.0f);
                view0.setPivotY(0.0f);
                view0.setScaleX(rectF1.width() / ((float)bvo0.a.getWidth()));
                view0.setScaleY(rectF1.height() / ((float)bvo0.a.getHeight()));
                view0.setTranslationX(rectF1.left - ((float)view0.getLeft()));
                view0.setTranslationY(rectF1.top - ((float)view0.getTop()));
            }
        }
    }

    public abstract void g(bel arg1, bvs arg2);
}

