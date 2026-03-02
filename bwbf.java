import android.graphics.Matrix;
import android.widget.ImageView.ScaleType;
import android.widget.ImageView;

public final class bwbf {
    private final ImageView a;
    private final int b;

    public bwbf(ImageView imageView0, int v) {
        this.a = imageView0;
        this.b = v;
    }

    public final void a() {
        switch(this.b - 2) {
            case 1: {
                this.a.setScaleType(ImageView.ScaleType.MATRIX);
                this.b(0.5f);
                return;
            }
            case 2: {
                this.a.setScaleType(ImageView.ScaleType.FIT_CENTER);
                return;
            }
            case 3: {
                this.a.setScaleType(ImageView.ScaleType.MATRIX);
                this.b(0.0f);
                return;
            }
            case 4: {
                this.a.setScaleType(ImageView.ScaleType.MATRIX);
                this.b(1.0f);
                return;
            }
            case 5: {
                ImageView.ScaleType imageView$ScaleType0 = bwcp.a(this.a.getContext()) ? ImageView.ScaleType.FIT_START : ImageView.ScaleType.FIT_END;
                this.a.setScaleType(imageView$ScaleType0);
                return;
            }
            case 6: {
                ImageView.ScaleType imageView$ScaleType1 = bwcp.a(this.a.getContext()) ? ImageView.ScaleType.FIT_END : ImageView.ScaleType.FIT_START;
                this.a.setScaleType(imageView$ScaleType1);
            }
        }
    }

    private final void b(float f) {
        float f3;
        float f2;
        ImageView imageView0 = this.a;
        if(imageView0.getDrawable() == null) {
            return;
        }
        Matrix matrix0 = imageView0.getImageMatrix();
        int v = imageView0.getWidth() - imageView0.getPaddingLeft() - imageView0.getPaddingRight();
        int v1 = imageView0.getHeight() - imageView0.getPaddingTop() - imageView0.getPaddingBottom();
        int v2 = imageView0.getDrawable().getIntrinsicWidth();
        int v3 = imageView0.getDrawable().getIntrinsicHeight();
        float f1 = 0.0f;
        if(v2 * v1 > v3 * v) {
            f2 = ((float)v1) / ((float)v3);
            f3 = 0.0f;
            f1 = (((float)v) - ((float)v2) * f2) * 0.5f;
        }
        else {
            float f4 = ((float)v) / ((float)v2);
            f3 = (((float)v1) - ((float)v3) * f4) * f;
            f2 = f4;
        }
        matrix0.setScale(f2, f2);
        matrix0.postTranslate(f1, f3);
        imageView0.setImageMatrix(matrix0);
    }
}

