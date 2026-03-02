import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.Base64;
import java.io.IOException;
import java.io.InputStream;

public final class qrh extends qrf {
    private final Paint j;
    private final Rect k;
    private final Rect l;
    private final qla m;
    private qmq n;
    private qmq o;

    public qrh(qkz qkz0, qrj qrj0) {
        super(qkz0, qrj0);
        this.j = new qlp(3);
        this.k = new Rect();
        this.l = new Rect();
        this.m = qkz0.b == null ? null : ((qla)qkz0.b.e().get(qrj0.f));
    }

    @Override  // qrf
    public final void a(Object object0, qub qub0) {
        super.a(object0, qub0);
        if(object0 == qle.K) {
            if(qub0 == null) {
                this.n = null;
                return;
            }
            this.n = new qni(qub0);
            return;
        }
        if(object0 == qle.N) {
            if(qub0 == null) {
                this.o = null;
                return;
            }
            this.o = new qni(qub0);
        }
    }

    @Override  // qrf
    public final void c(RectF rectF0, Matrix matrix0, boolean z) {
        super.c(rectF0, matrix0, z);
        qla qla0 = this.m;
        if(qla0 != null) {
            float f = qty.a();
            rectF0.set(0.0f, 0.0f, ((float)qla0.a) * f, ((float)qla0.b) * f);
            this.a.mapRect(rectF0);
        }
    }

    @Override  // qrf
    public final void l(Canvas canvas0, Matrix matrix0, int v) {
        Bitmap bitmap0;
        Bitmap bitmap3;
        InputStream inputStream0;
        Bitmap bitmap2;
        byte[] arr_b;
        qmq qmq0 = this.o;
        if(qmq0 == null) {
        label_4:
            qrj qrj0 = this.c;
            qpl qpl0 = this.b.g();
            if(qpl0 == null) {
                bitmap0 = null;
            }
            else {
                String s = qrj0.f;
                qla qla0 = (qla)qpl0.c.get(s);
                if(qla0 == null) {
                    bitmap0 = null;
                }
                else {
                    Bitmap bitmap1 = qla0.f;
                    if(bitmap1 == null) {
                        Context context0 = qpl0.a;
                        if(context0 == null) {
                        label_52:
                            bitmap0 = null;
                        }
                        else {
                            String s1 = qla0.d;
                            BitmapFactory.Options bitmapFactory$Options0 = new BitmapFactory.Options();
                            bitmapFactory$Options0.inScaled = true;
                            bitmapFactory$Options0.inDensity = 0xA0;
                            if(s1.startsWith("data:") && s1.indexOf("base64,") > 0) {
                                try {
                                    arr_b = Base64.decode(s1.substring(s1.indexOf(44) + 1), 0);
                                }
                                catch(IllegalArgumentException illegalArgumentException0) {
                                    qtq.b("data URL did not have correct base64 format.", illegalArgumentException0);
                                    bitmap0 = null;
                                    goto label_57;
                                }
                                bitmap2 = qty.d(BitmapFactory.decodeByteArray(arr_b, 0, arr_b.length, bitmapFactory$Options0), qla0.a, qla0.b);
                                qpl0.a(s, bitmap2);
                                bitmap0 = bitmap2;
                            }
                            else {
                                try {
                                    String s2 = qpl0.b;
                                    if(TextUtils.isEmpty(s2)) {
                                        throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
                                    }
                                    inputStream0 = context0.getAssets().open(s2 + s1);
                                }
                                catch(IOException iOException0) {
                                    qtq.b("Unable to open asset.", iOException0);
                                    goto label_52;
                                }
                                try {
                                    bitmap3 = BitmapFactory.decodeStream(inputStream0, null, bitmapFactory$Options0);
                                }
                                catch(IllegalArgumentException illegalArgumentException1) {
                                    qtq.b(a.a(s, "Unable to decode image `", "`."), illegalArgumentException1);
                                    goto label_52;
                                }
                                if(bitmap3 == null) {
                                    qtq.a(a.a(s, "Decoded image `", "` is null."));
                                    bitmap0 = null;
                                }
                                else {
                                    bitmap2 = qty.d(bitmap3, qla0.a, qla0.b);
                                    qpl0.a(s, bitmap2);
                                    bitmap0 = bitmap2;
                                }
                            }
                        }
                    }
                    else {
                        bitmap0 = bitmap1;
                    }
                }
            }
        label_57:
            if(bitmap0 == null) {
                bitmap0 = this.m == null ? null : this.m.f;
            }
        }
        else {
            bitmap0 = (Bitmap)qmq0.e();
            if(bitmap0 == null) {
                goto label_4;
            }
        }
        if(bitmap0 != null && !bitmap0.isRecycled()) {
            qla qla1 = this.m;
            if(qla1 != null) {
                Paint paint0 = this.j;
                float f = qty.a();
                paint0.setAlpha(v);
                qmq qmq1 = this.n;
                if(qmq1 != null) {
                    paint0.setColorFilter(((ColorFilter)qmq1.e()));
                }
                canvas0.save();
                canvas0.concat(matrix0);
                Rect rect0 = this.k;
                rect0.set(0, 0, bitmap0.getWidth(), bitmap0.getHeight());
                if(this.b.j) {
                    this.l.set(0, 0, ((int)(((float)qla1.a) * f)), ((int)(((float)qla1.b) * f)));
                }
                else {
                    float f1 = ((float)bitmap0.getWidth()) * f;
                    int v1 = (int)(((float)bitmap0.getHeight()) * f);
                    this.l.set(0, 0, ((int)f1), v1);
                }
                canvas0.drawBitmap(bitmap0, rect0, this.l, paint0);
                canvas0.restore();
            }
        }
    }
}

