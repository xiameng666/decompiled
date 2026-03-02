import android.graphics.Matrix.ScaleToFit;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.Image;
import android.media.ImageWriter;
import androidx.camera.core.ImageProcessingUtil;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;

public abstract class bbk implements bkp {
    public volatile int a;
    public volatile int b;
    public volatile boolean c;
    public volatile boolean d;
    public bdm e;
    ByteBuffer f;
    ByteBuffer g;
    ByteBuffer h;
    ByteBuffer i;
    ByteBuffer j;
    ByteBuffer k;
    public final Object l;
    protected boolean m;
    private bbc n;
    private volatile int o;
    private Executor p;
    private ImageWriter q;
    private Rect r;
    private Rect s;
    private Matrix t;
    private Matrix u;

    public bbk() {
        this.b = 1;
        this.r = new Rect();
        this.s = new Rect();
        this.t = new Matrix();
        this.u = new Matrix();
        this.l = new Object();
        this.m = true;
    }

    @Override  // bkp
    public final void a(bkq bkq0) {
        try {
            bcn bcn0 = this.b(bkq0);
            if(bcn0 != null) {
                this.e(bcn0);
            }
        }
        catch(IllegalStateException illegalStateException0) {
            bcs.b("ImageAnalysisAnalyzer", "Failed to acquire image.", illegalStateException0);
        }
    }

    public abstract bcn b(bkq arg1);

    final gmcd c(bcn bcn0) {
        ByteBuffer byteBuffer5;
        ByteBuffer byteBuffer4;
        ByteBuffer byteBuffer0;
        ImageWriter imageWriter1;
        bdm bdm1;
        bbc bbc0;
        Executor executor0;
        bcn bcn1;
        int v14;
        bbc bbc1;
        Executor executor1;
        int v15;
        int v = this.c ? this.a : 0;
        synchronized(this.l) {
            executor0 = this.p;
            bbc0 = this.n;
            boolean z = this.c && v != this.o;
            if(z) {
                bdm bdm0 = this.e;
                if(bdm0 != null) {
                    bdm0.k();
                    int v2 = bcn0.c();
                    int v3 = bcn0.b();
                    int v4 = this.e.b();
                    int v5 = this.e.c();
                    int v6 = v == 90 || v == 270 ? 1 : 0;
                    int v7 = 1 == v6 ? v3 : v2;
                    if(1 != v6) {
                        v2 = v3;
                    }
                    this.e = new bdm(bcp.a(v7, v2, v4, v5));
                    if(this.b == 1) {
                        ImageWriter imageWriter0 = this.q;
                        if(imageWriter0 != null) {
                            imageWriter0.close();
                        }
                        this.q = ImageWriter.newInstance(this.e.e(), this.e.c());
                    }
                }
            }
            if(this.c || this.b == 3) {
                if(this.b == 1 || this.b == 3) {
                    if(this.g == null) {
                        this.g = ByteBuffer.allocateDirect(bcn0.c() * bcn0.b());
                    }
                    this.g.position(0);
                    if(this.h == null) {
                        this.h = ByteBuffer.allocateDirect(bcn0.c() * bcn0.b() / 4);
                    }
                    this.h.position(0);
                    if(this.i == null) {
                        this.i = ByteBuffer.allocateDirect(bcn0.c() * bcn0.b() / 4);
                    }
                    this.i.position(0);
                    if(this.b == 3) {
                        if(this.j == null) {
                            this.j = ByteBuffer.allocateDirect(bcn0.c() * bcn0.b());
                        }
                        this.j.position(0);
                        if(this.k == null) {
                            this.k = ByteBuffer.allocateDirect(bcn0.c() * bcn0.b() / 2);
                        }
                        this.k.position(0);
                    }
                }
                else if(this.b == 2 && this.f == null) {
                    this.f = ByteBuffer.allocateDirect(bcn0.c() * bcn0.b() * 4);
                }
            }
            bdm1 = this.e;
            imageWriter1 = this.q;
            byteBuffer0 = this.f;
            ByteBuffer byteBuffer1 = this.g;
            ByteBuffer byteBuffer2 = this.h;
            ByteBuffer byteBuffer3 = this.i;
            byteBuffer4 = this.j;
            byteBuffer5 = this.k;
        }
        if(bbc0 != null && executor0 != null && this.m) {
            if(bdm1 == null) {
                v14 = v;
                executor1 = executor0;
                bbc1 = bbc0;
                if(this.b == 3) {
                    if(this.d) {
                        ImageProcessingUtil.e(bcn0);
                    }
                    if(byteBuffer1 == null || byteBuffer2 == null || byteBuffer3 == null || byteBuffer4 == null || byteBuffer5 == null) {
                        bcn1 = null;
                    }
                    else if(!ImageProcessingUtil.d(bcn0)) {
                        bcs.a("ImageProcessingUtil", "Unsupported format for rotate YUV");
                        bcn1 = null;
                    }
                    else if(!ImageProcessingUtil.c(v14)) {
                        bcs.a("ImageProcessingUtil", "Unsupported rotation degrees for rotate YUV");
                        bcn1 = null;
                    }
                    else if(v14 != 0) {
                        v15 = v14;
                    label_141:
                        int v16 = v15 % 180 == 0 ? bcn0.c() : bcn0.b();
                        int v17 = v15 % 180 == 0 ? bcn0.b() : bcn0.c();
                        ByteBuffer byteBuffer6 = ImageProcessingUtil.nativeNewDirectByteBuffer(byteBuffer5, 1, byteBuffer5.capacity());
                        if(ImageProcessingUtil.nativeRotateYUV(bcn0.g()[0].c(), bcn0.g()[0].b(), bcn0.g()[1].c(), bcn0.g()[1].b(), bcn0.g()[2].c(), bcn0.g()[2].b(), bcn0.g()[2].a(), byteBuffer4, v16, 1, byteBuffer6, v16, 2, byteBuffer5, v16, 2, byteBuffer1, byteBuffer2, byteBuffer3, bcn0.c(), bcn0.b(), v15) == 0) {
                            bcn1 = new bdp(new bck(bcn0, byteBuffer4, byteBuffer6, byteBuffer5, v16, v17));
                        }
                        else {
                            bcs.a("ImageProcessingUtil", "rotate YUV failure");
                            bcn1 = null;
                        }
                    }
                    else if(bcn0.g().length != 3) {
                        v15 = 0;
                        goto label_141;
                    }
                    else if(bcn0.g()[1].a() != 2 || ImageProcessingUtil.nativeGetYUVImageVUOff(bcn0.g()[2].c(), bcn0.g()[1].c()) != -1) {
                        v15 = 0;
                        goto label_141;
                    }
                    else {
                    label_136:
                        bcn1 = null;
                    }
                }
                else {
                    bcn1 = null;
                }
            }
            else {
                switch(this.b) {
                    case 1: {
                        if(this.d) {
                            ImageProcessingUtil.e(bcn0);
                        }
                        if(imageWriter1 == null || byteBuffer1 == null || byteBuffer2 == null || byteBuffer3 == null) {
                            v14 = v;
                            executor1 = executor0;
                            bbc1 = bbc0;
                            goto label_136;
                        }
                        else if(!ImageProcessingUtil.d(bcn0)) {
                            bcs.a("ImageProcessingUtil", "Unsupported format for rotate YUV");
                            v14 = v;
                            executor1 = executor0;
                            bbc1 = bbc0;
                            goto label_136;
                        }
                        else if(!ImageProcessingUtil.c(v)) {
                            bcs.a("ImageProcessingUtil", "Unsupported rotation degrees for rotate YUV");
                            v14 = v;
                            executor1 = executor0;
                            bbc1 = bbc0;
                            goto label_136;
                        }
                        else if(v > 0) {
                            int v8 = bcn0.c();
                            int v9 = bcn0.b();
                            int v10 = bcn0.g()[0].b();
                            int v11 = bcn0.g()[1].b();
                            int v12 = bcn0.g()[2].b();
                            int v13 = bcn0.g()[1].a();
                            Image image0 = imageWriter1.dequeueInputImage();
                            if(image0 == null) {
                                executor1 = executor0;
                                bbc1 = bbc0;
                                v14 = v;
                                bcs.a("ImageProcessingUtil", "rotate YUV failure");
                                bcn1 = null;
                            }
                            else {
                                executor1 = executor0;
                                bbc1 = bbc0;
                                v14 = v;
                                if(ImageProcessingUtil.nativeRotateYUV(bcn0.g()[0].c(), v10, bcn0.g()[1].c(), v11, bcn0.g()[2].c(), v12, v13, image0.getPlanes()[0].getBuffer(), image0.getPlanes()[0].getRowStride(), image0.getPlanes()[0].getPixelStride(), image0.getPlanes()[1].getBuffer(), image0.getPlanes()[1].getRowStride(), image0.getPlanes()[1].getPixelStride(), image0.getPlanes()[2].getBuffer(), image0.getPlanes()[2].getRowStride(), image0.getPlanes()[2].getPixelStride(), byteBuffer1, byteBuffer2, byteBuffer3, v8, v9, v) == 0) {
                                    imageWriter1.queueInputImage(image0);
                                    bcn bcn2 = bdm1.f();
                                    if(bcn2 == null) {
                                        bcs.a("ImageProcessingUtil", "YUV rotation acquireLatestImage failure");
                                        bcn1 = null;
                                    }
                                    else {
                                        bdp bdp0 = new bdp(bcn2);
                                        bdp0.h(new bci(bcn0));
                                        bcn1 = bdp0;
                                    }
                                }
                                else {
                                    bcs.a("ImageProcessingUtil", "rotate YUV failure");
                                    bcn1 = null;
                                }
                            }
                        }
                        else {
                            v14 = v;
                            executor1 = executor0;
                            bbc1 = bbc0;
                            bcs.a("ImageProcessingUtil", "rotate YUV failure");
                            goto label_136;
                        }
                        break;
                    }
                    case 2: {
                        v14 = v;
                        bcn1 = ImageProcessingUtil.a(bcn0, bdm1, byteBuffer0, v, this.d);
                        executor1 = executor0;
                        bbc1 = bbc0;
                        break;
                    }
                    default: {
                        v14 = v;
                        executor1 = executor0;
                        bbc1 = bbc0;
                        goto label_136;
                    }
                }
            }
            bcn bcn3 = bcn1 == null ? bcn0 : bcn1;
            Rect rect0 = new Rect();
            Matrix matrix0 = new Matrix();
            synchronized(this.l) {
                if(z && bcn1 != null) {
                    int v19 = bcn0.c();
                    int v20 = bcn0.b();
                    int v21 = bcn3.c();
                    int v22 = bcn3.b();
                    int v23 = this.a;
                    Matrix matrix1 = new Matrix();
                    if(v23 > 0) {
                        matrix1.setRectToRect(new RectF(0.0f, 0.0f, ((float)v19), ((float)v20)), bok.a, Matrix.ScaleToFit.FILL);
                        matrix1.postRotate(((float)v23));
                        matrix1.postConcat(bok.c(new RectF(0.0f, 0.0f, ((float)v21), ((float)v22))));
                    }
                    RectF rectF0 = new RectF(this.r);
                    matrix1.mapRect(rectF0);
                    Rect rect1 = new Rect();
                    rectF0.round(rect1);
                    this.s = rect1;
                    this.u.setConcat(this.t, matrix1);
                }
                this.o = v14;
                rect0.set(this.s);
                matrix0.set(this.u);
            }
            return jqy.a(new bbj(this, executor1, bcn0, matrix0, bcn3, rect0, bbc1));
        }
        return new bpu(new jzf("No analyzer or executor currently set."));
    }

    public abstract void d();

    public abstract void e(bcn arg1);

    public final void f(Executor executor0, bbc bbc0) {
        if(bbc0 == null) {
            this.d();
        }
        synchronized(this.l) {
            this.n = bbc0;
            this.p = executor0;
        }
    }

    final void g(Matrix matrix0) {
        synchronized(this.l) {
            this.t = matrix0;
            this.u = new Matrix(this.t);
        }
    }

    final void h(Rect rect0) {
        synchronized(this.l) {
            this.r = rect0;
            this.s = new Rect(this.r);
        }
    }
}

