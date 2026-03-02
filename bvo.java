import android.graphics.Matrix.ScaleToFit;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import java.util.Objects;

public final class bvo {
    public Size a;
    public Rect b;
    public int c;
    public Matrix d;
    public int e;
    public boolean f;
    public boolean g;
    public int h;

    public bvo() {
        this.h = 2;
    }

    public final int a() {
        return this.g ? -bnk.b(this.e) : this.c;
    }

    public final Matrix b(Size size0, int v) {
        Matrix.ScaleToFit matrix$ScaleToFit0;
        RectF rectF0;
        kay.c(this.c());
        if(bok.p(size0, true, this.d())) {
            rectF0 = new RectF(0.0f, 0.0f, ((float)size0.getWidth()), ((float)size0.getHeight()));
        }
        else {
            RectF rectF1 = new RectF(0.0f, 0.0f, ((float)size0.getWidth()), ((float)size0.getHeight()));
            Size size1 = this.d();
            RectF rectF2 = new RectF(0.0f, 0.0f, ((float)size1.getWidth()), ((float)size1.getHeight()));
            Matrix matrix0 = new Matrix();
            int v1 = this.h;
            if(v1 == 0) {
                throw null;
            }
            switch(v1 - 1) {
                case 0: {
                    matrix$ScaleToFit0 = Matrix.ScaleToFit.START;
                    break;
                }
                case 1: {
                    matrix$ScaleToFit0 = Matrix.ScaleToFit.CENTER;
                    break;
                }
                default: {
                    if(v1 - 1 == 2) {
                        matrix$ScaleToFit0 = Matrix.ScaleToFit.END;
                    }
                    else {
                        switch(v1 - 1) {
                            case 3: {
                                matrix$ScaleToFit0 = Matrix.ScaleToFit.START;
                                break;
                            }
                            case 4: {
                                matrix$ScaleToFit0 = Matrix.ScaleToFit.CENTER;
                                break;
                            }
                            case 5: {
                                matrix$ScaleToFit0 = Matrix.ScaleToFit.END;
                                break;
                            }
                            default: {
                                Objects.toString(bvw.a(v1));
                                bcs.a("PreviewTransform", "Unexpected crop rect: " + bvw.a(v1));
                                matrix$ScaleToFit0 = Matrix.ScaleToFit.FILL;
                            }
                        }
                    }
                }
            }
            if(v1 != 4 && v1 != 5 && v1 != 6) {
                matrix0.setRectToRect(rectF1, rectF2, matrix$ScaleToFit0);
                matrix0.invert(matrix0);
            }
            else {
                matrix0.setRectToRect(rectF2, rectF1, matrix$ScaleToFit0);
            }
            matrix0.mapRect(rectF2);
            if(v == 1) {
                float f = ((float)size0.getWidth()) / 2.0f;
                float f1 = f + f;
                rectF0 = new RectF(f1 - rectF2.right, rectF2.top, f1 - rectF2.left, rectF2.bottom);
            }
            else {
                rectF0 = rectF2;
            }
        }
        Matrix matrix1 = bok.d(new RectF(this.b), rectF0, this.c);
        if(this.f && this.g) {
            if(bok.n(this.c)) {
                matrix1.preScale(1.0f, -1.0f, ((float)this.b.centerX()), ((float)this.b.centerY()));
                return matrix1;
            }
            matrix1.preScale(-1.0f, 1.0f, ((float)this.b.centerX()), ((float)this.b.centerY()));
        }
        return matrix1;
    }

    public final boolean c() {
        return this.b != null && this.a != null && (!this.g || this.e != -1);
    }

    private final Size d() {
        return bok.n(this.c) ? new Size(this.b.height(), this.b.width()) : new Size(this.b.width(), this.b.height());
    }
}

