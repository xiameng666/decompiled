import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture.OnFrameAvailableListener;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLExt;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.ImageProcessingUtil;
import j..util.Objects;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;

public final class bsb implements SurfaceTexture.OnFrameAvailableListener, bsw {
    public final bsd a;
    final HandlerThread b;
    public final Executor c;
    final Handler d;
    public final AtomicBoolean e;
    final Map f;
    public int g;
    public boolean h;
    public final List i;
    public static final int j;
    private final float[] k;
    private final float[] l;

    public bsb(bat bat0) {
        Map map0 = Collections.EMPTY_MAP;
        super();
        this.e = new AtomicBoolean(false);
        this.k = new float[16];
        this.l = new float[16];
        this.f = new LinkedHashMap();
        this.g = 0;
        this.h = false;
        this.i = new ArrayList();
        HandlerThread handlerThread0 = new HandlerThread("CameraX-GL Thread");
        this.b = handlerThread0;
        handlerThread0.start();
        Handler handler0 = new Handler(handlerThread0.getLooper());
        this.d = handler0;
        this.c = new bor(handler0);
        this.a = new bsd();
        try {
            gmcd gmcd0 = jqy.a(new brt(this, bat0, map0));
            try {
                gmcd0.get();
            }
            catch(ExecutionException | InterruptedException exception0) {
                if((exception0 instanceof ExecutionException)) {
                    exception0 = exception0.getCause();
                }
                if((exception0 instanceof RuntimeException)) {
                    throw (RuntimeException)exception0;
                }
                throw new IllegalStateException("Failed to create DefaultSurfaceProcessor", exception0);
            }
        }
        catch(RuntimeException runtimeException0) {
            this.d();
            throw runtimeException0;
        }
    }

    public final void a() {
        if(this.h && this.g == 0) {
            Map map0 = this.f;
            for(Object object0: map0.keySet()) {
                ((bsv)object0).close();
            }
            for(Object object1: this.i) {
                Exception exception0 = new Exception("Failed to snapshot: DefaultSurfaceProcessor is released.");
                ((bsa)object1).c.c(exception0);
            }
            map0.clear();
            this.a.f();
            this.b.quit();
        }
    }

    public final void b(Runnable runnable0) {
        this.c(runnable0, new brx());
    }

    public final void c(Runnable runnable0, Runnable runnable1) {
        try {
            brm brm0 = new brm(this, runnable1, runnable0);
            this.c.execute(brm0);
        }
        catch(RejectedExecutionException rejectedExecutionException0) {
            bcs.e("DefaultSurfaceProcessor", "Unable to executor runnable", rejectedExecutionException0);
            runnable1.run();
        }
    }

    @Override  // bsw
    public final void d() {
        if(this.e.getAndSet(true)) {
            return;
        }
        this.b(new brn(this));
    }

    private final void e(Throwable throwable0) {
        List list0 = this.i;
        for(Object object0: list0) {
            ((bsa)object0).c.c(throwable0);
        }
        list0.clear();
    }

    @Override  // android.graphics.SurfaceTexture$OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture0) {
        boolean z1;
        Iterator iterator2;
        if(!this.e.get()) {
            surfaceTexture0.updateTexImage();
            float[] arr_f = this.k;
            surfaceTexture0.getTransformMatrix(arr_f);
            Iterator iterator0 = this.f.entrySet().iterator();
            iboa iboa0 = null;
            while(true) {
                boolean z = true;
                if(!iterator0.hasNext()) {
                    break;
                }
                Object object0 = iterator0.next();
                Surface surface0 = (Surface)((Map.Entry)object0).getValue();
                bsv bsv0 = (bsv)((Map.Entry)object0).getKey();
                float[] arr_f1 = this.l;
                bsv0.c(arr_f1, arr_f);
                int v = bsv0.a;
                if(v == 34) {
                    try {
                        bsd bsd0 = this.a;
                        long v1 = surfaceTexture0.getTimestamp();
                        bto.h(bsd0.a, true);
                        bto.g(bsd0.c);
                        bts bts0 = bsd0.c(surface0);
                        if(bts0 == bto.l) {
                            bts0 = bsd0.b(surface0);
                            if(bts0 == null) {
                                continue;
                            }
                            bsd0.b.put(surface0, bts0);
                        }
                        if(surface0 != bsd0.i) {
                            bsd0.d(bts0.a);
                            bsd0.i = surface0;
                            GLES20.glViewport(0, 0, bts0.b, bts0.c);
                            GLES20.glScissor(0, 0, bts0.b, bts0.c);
                        }
                        btm btm0 = bsd0.k;
                        kay.i(btm0);
                        if((btm0 instanceof btn)) {
                            ((btn)btm0).e(arr_f1);
                        }
                        GLES20.glDrawArrays(5, 0, 4);
                        bto.f("glDrawArrays");
                        EGLExt.eglPresentationTimeANDROID(bsd0.d, bts0.a, v1);
                        if(EGL14.eglSwapBuffers(bsd0.d, bts0.a)) {
                            continue;
                        }
                        bcs.d("OpenGlRenderer", "Failed to swap buffers with EGL error: 0x" + Integer.toHexString(EGL14.eglGetError()));
                        bsd0.g(surface0, false);
                    }
                    catch(RuntimeException runtimeException0) {
                        bcs.b("DefaultSurfaceProcessor", "Failed to render with OpenGL.", runtimeException0);
                    }
                }
                else {
                    kay.d(v == 0x100, "Unsupported format: " + v);
                    if(iboa0 != null) {
                        z = false;
                    }
                    kay.d(z, "Only one JPEG output is supported.");
                    float[] arr_f2 = (float[])arr_f1.clone();
                    iboa0 = new iboa(surface0, bsv0.b, arr_f2);
                }
            }
            try {
                List list0 = this.i;
                if(!list0.isEmpty()) {
                    if(iboa0 == null) {
                        this.e(new Exception("Failed to snapshot: no JPEG Surface."));
                        return;
                    }
                    try(ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream()) {
                        Bitmap bitmap0 = null;
                        int v2 = -1;
                        byte[] arr_b = null;
                        int v3 = -1;
                        for(Iterator iterator1 = list0.iterator(); true; iterator1 = iterator2) {
                            if(!iterator1.hasNext()) {
                                break;
                            }
                            Object object1 = iterator1.next();
                            int v4 = ((bsa)object1).b;
                            if(v2 == v4 && bitmap0 != null) {
                                iterator2 = iterator1;
                            }
                            else {
                                if(bitmap0 != null) {
                                    bitmap0.recycle();
                                }
                                float[] arr_f3 = (float[])((float[])iboa0.c).clone();
                                boh.a(arr_f3, ((float)v4));
                                boh.b(arr_f3);
                                Size size0 = bok.l(((Size)iboa0.b), v4);
                                bsd bsd1 = this.a;
                                ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(size0.getWidth() * size0.getHeight() * 4);
                                z1 = byteBuffer0.capacity() == size0.getWidth() * size0.getHeight() * 4;
                                kay.b(z1, "ByteBuffer capacity is not equal to width * height * 4.");
                                kay.b(byteBuffer0.isDirect(), "ByteBuffer is not direct.");
                                int[] arr_v = new int[true];
                                GLES20.glGenTextures(1, arr_v, 0);
                                bto.f("glGenTextures");
                                int v5 = arr_v[0];
                                GLES20.glActiveTexture(0x84C1);
                                bto.f("glActiveTexture");
                                GLES20.glBindTexture(0xDE1, v5);
                                bto.f("glBindTexture");
                                GLES20.glTexImage2D(0xDE1, 0, 6407, size0.getWidth(), size0.getHeight(), 0, 6407, 0x1401, null);
                                bto.f("glTexImage2D");
                                GLES20.glTexParameteri(0xDE1, 0x2800, 0x2601);
                                GLES20.glTexParameteri(0xDE1, 0x2801, 0x2601);
                                int[] arr_v1 = new int[1];
                                GLES20.glGenFramebuffers(1, arr_v1, 0);
                                bto.f("glGenFramebuffers");
                                int v6 = arr_v1[0];
                                GLES20.glBindFramebuffer(0x8D40, v6);
                                bto.f("glBindFramebuffer");
                                iterator2 = iterator1;
                                GLES20.glFramebufferTexture2D(0x8D40, 0x8CE0, 0xDE1, v5, 0);
                                bto.f("glFramebufferTexture2D");
                                GLES20.glActiveTexture(0x84C0);
                                bto.f("glActiveTexture");
                                GLES20.glBindTexture(0x8D65, bsd1.m);
                                bto.f("glBindTexture");
                                bsd1.i = null;
                                GLES20.glViewport(0, 0, size0.getWidth(), size0.getHeight());
                                GLES20.glScissor(0, 0, size0.getWidth(), size0.getHeight());
                                btm btm1 = bsd1.k;
                                kay.i(btm1);
                                if((btm1 instanceof btn)) {
                                    ((btn)btm1).e(arr_f3);
                                }
                                GLES20.glDrawArrays(5, 0, 4);
                                bto.f("glDrawArrays");
                                GLES20.glReadPixels(0, 0, size0.getWidth(), size0.getHeight(), 6408, 0x1401, byteBuffer0);
                                bto.f("glReadPixels");
                                GLES20.glBindFramebuffer(0x8D40, 0);
                                GLES20.glDeleteTextures(1, new int[]{v5}, 0);
                                bto.f("glDeleteTextures");
                                GLES20.glDeleteFramebuffers(1, new int[]{v6}, 0);
                                bto.f("glDeleteFramebuffers");
                                bsd.j(bsd1.m);
                                Bitmap bitmap1 = Bitmap.createBitmap(size0.getWidth(), size0.getHeight(), Bitmap.Config.ARGB_8888);
                                byteBuffer0.rewind();
                                ImageProcessingUtil.b(bitmap1, byteBuffer0, size0.getWidth() * 4);
                                bitmap0 = bitmap1;
                                v2 = v4;
                                v3 = -1;
                            }
                            int v7 = ((bsa)object1).a;
                            if(v3 != v7) {
                                byteArrayOutputStream0.reset();
                                bitmap0.compress(Bitmap.CompressFormat.JPEG, v7, byteArrayOutputStream0);
                                arr_b = byteArrayOutputStream0.toByteArray();
                                v3 = v7;
                            }
                            byte[] arr_b1 = (byte[])Objects.requireNonNull(arr_b);
                            kay.i(arr_b1);
                            kay.i(((Surface)iboa0.a));
                            if(ImageProcessingUtil.nativeWriteJpegToSurface(arr_b1, ((Surface)iboa0.a)) != 0) {
                                bcs.a("ImageProcessingUtil", "Failed to enqueue JPEG image.");
                            }
                            ((bsa)object1).c.b(null);
                            iterator2.remove();
                        }
                        return;
                    }
                    catch(IOException iOException0) {
                        this.e(iOException0);
                    }
                }
                return;
            }
            catch(RuntimeException runtimeException1) {
                goto label_167;
            }
        }
        return;
    label_167:
        this.e(runtimeException1);
    }
}

