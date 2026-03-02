import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.widget.ProgressBar;

class pm {
    public Bitmap a;
    private static final int[] b;
    private final ProgressBar c;

    static {
        pm.b = new int[]{0x101013B, 0x101013C};
    }

    public pm(ProgressBar progressBar0) {
        this.c = progressBar0;
    }

    final Drawable a(Drawable drawable0, boolean z) {
        if((drawable0 instanceof jya)) {
            Drawable drawable1 = ((jya)drawable0).a();
            if(drawable1 != null) {
                this.a(drawable1, z);
                ((jya)drawable0).b();
                return drawable0;
            }
        }
        else {
            if((drawable0 instanceof LayerDrawable)) {
                int v = ((LayerDrawable)drawable0).getNumberOfLayers();
                Drawable[] arr_drawable = new Drawable[v];
                for(int v2 = 0; v2 < v; ++v2) {
                    int v3 = ((LayerDrawable)drawable0).getId(v2);
                    arr_drawable[v2] = this.a(((LayerDrawable)drawable0).getDrawable(v2), v3 == 0x102000D || v3 == 0x102000F);
                }
                Drawable drawable2 = new LayerDrawable(arr_drawable);
                for(int v1 = 0; v1 < v; ++v1) {
                    ((LayerDrawable)drawable2).setId(v1, ((LayerDrawable)drawable0).getId(v1));
                    ((LayerDrawable)drawable2).setLayerGravity(v1, ((LayerDrawable)drawable0).getLayerGravity(v1));
                    ((LayerDrawable)drawable2).setLayerWidth(v1, ((LayerDrawable)drawable0).getLayerWidth(v1));
                    ((LayerDrawable)drawable2).setLayerHeight(v1, ((LayerDrawable)drawable0).getLayerHeight(v1));
                    ((LayerDrawable)drawable2).setLayerInsetLeft(v1, ((LayerDrawable)drawable0).getLayerInsetLeft(v1));
                    ((LayerDrawable)drawable2).setLayerInsetRight(v1, ((LayerDrawable)drawable0).getLayerInsetRight(v1));
                    ((LayerDrawable)drawable2).setLayerInsetTop(v1, ((LayerDrawable)drawable0).getLayerInsetTop(v1));
                    ((LayerDrawable)drawable2).setLayerInsetBottom(v1, ((LayerDrawable)drawable0).getLayerInsetBottom(v1));
                    ((LayerDrawable)drawable2).setLayerInsetStart(v1, ((LayerDrawable)drawable0).getLayerInsetStart(v1));
                    ((LayerDrawable)drawable2).setLayerInsetEnd(v1, ((LayerDrawable)drawable0).getLayerInsetEnd(v1));
                }
                return drawable2;
            }
            if((drawable0 instanceof BitmapDrawable)) {
                Bitmap bitmap0 = ((BitmapDrawable)drawable0).getBitmap();
                if(this.a == null) {
                    this.a = bitmap0;
                }
                Drawable drawable3 = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
                BitmapShader bitmapShader0 = new BitmapShader(bitmap0, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP);
                ((ShapeDrawable)drawable3).getPaint().setShader(bitmapShader0);
                ((ShapeDrawable)drawable3).getPaint().setColorFilter(((BitmapDrawable)drawable0).getPaint().getColorFilter());
                return z ? new ClipDrawable(drawable3, 3, 1) : drawable3;
            }
        }
        return drawable0;
    }

    public void b(AttributeSet attributeSet0, int v) {
        ProgressBar progressBar0 = this.c;
        wi wi0 = wi.l(progressBar0.getContext(), attributeSet0, pm.b, v, 0);
        Drawable drawable0 = wi0.i(0);
        if(drawable0 != null) {
            if((drawable0 instanceof AnimationDrawable)) {
                int v1 = ((AnimationDrawable)drawable0).getNumberOfFrames();
                AnimationDrawable animationDrawable0 = new AnimationDrawable();
                animationDrawable0.setOneShot(((AnimationDrawable)drawable0).isOneShot());
                for(int v2 = 0; v2 < v1; ++v2) {
                    Drawable drawable1 = this.a(((AnimationDrawable)drawable0).getFrame(v2), true);
                    drawable1.setLevel(10000);
                    animationDrawable0.addFrame(drawable1, ((AnimationDrawable)drawable0).getDuration(v2));
                }
                animationDrawable0.setLevel(10000);
                drawable0 = animationDrawable0;
            }
            progressBar0.setIndeterminateDrawable(drawable0);
        }
        Drawable drawable2 = wi0.i(1);
        if(drawable2 != null) {
            progressBar0.setProgressDrawable(this.a(drawable2, false));
        }
        wi0.o();
    }
}

