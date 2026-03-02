import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.util.Size;
import android.view.Surface;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class bsd {
    public final AtomicBoolean a;
    public final Map b;
    public Thread c;
    public EGLDisplay d;
    protected EGLContext e;
    protected int[] f;
    protected EGLConfig g;
    protected EGLSurface h;
    public Surface i;
    protected Map j;
    protected btm k;
    protected btl l;
    public int m;

    public bsd() {
        this.a = new AtomicBoolean(false);
        this.b = new HashMap();
        this.d = EGL14.EGL_NO_DISPLAY;
        this.e = EGL14.EGL_NO_CONTEXT;
        this.f = bto.a;
        this.h = EGL14.EGL_NO_SURFACE;
        this.j = Collections.EMPTY_MAP;
        this.k = null;
        this.l = btl.a;
        this.m = -1;
    }

    public btq a(bat bat0, Map map0) {
        btm btm0;
        kau kau0;
        AtomicBoolean atomicBoolean0 = this.a;
        bto.h(atomicBoolean0, false);
        btp btp0 = new btp();
        String s = "0.0";
        btp0.a = "0.0";
        btp0.b = "0.0";
        String s1 = "";
        btp0.c = "";
        btp0.d = "";
        try {
            try {
                if(bat0.a()) {
                    bto.h(atomicBoolean0, false);
                    goto label_11;
                }
                goto label_45;
            }
            catch(IllegalStateException exception0) {
                goto label_91;
            }
            try {
            label_11:
                this.k(bat0, null);
                this.l();
                this.d(this.h);
                String s2 = GLES20.glGetString(0x1F03);
                String s3 = EGL14.eglQueryString(this.d, 0x3055);
                if(s2 == null) {
                    s2 = "";
                }
                if(s3 == null) {
                    s3 = "";
                }
                kau0 = new kau(s2, s3);
                goto label_26;
            }
            catch(IllegalStateException illegalStateException0) {
                try {
                    bcs.e("OpenGlRenderer", "Failed to get GL or EGL extensions: " + illegalStateException0.getMessage(), illegalStateException0);
                    kau0 = new kau("", "");
                label_26:
                    String s4 = (String)kau0.a;
                    kay.i(s4);
                    String s5 = (String)kau0.b;
                    kay.i(s5);
                    if(!s4.contains("GL_EXT_YUV_target")) {
                        bcs.d("OpenGlRenderer", "Device does not support GL_EXT_YUV_target. Fallback to SDR.");
                        bat0 = bat.b;
                    }
                    int[] arr_v = bto.a;
                    if(bat0.h == 3) {
                        if(s5.contains("EGL_EXT_gl_colorspace_bt2020_hlg")) {
                            arr_v = bto.b;
                        }
                        else {
                            bcs.d("GLUtils", "Dynamic range uses HLG encoding, but device does not support EGL_EXT_gl_colorspace_bt2020_hlg.Fallback to default colorspace.");
                        }
                    }
                    this.f = arr_v;
                    btp0.c = s4;
                    btp0.d = s5;
                label_45:
                    this.k(bat0, btp0);
                    this.l();
                    this.d(this.h);
                    String s6 = GLES20.glGetString(0x1F02);
                    Matcher matcher0 = Pattern.compile("OpenGL ES ([0-9]+)\\.([0-9]+).*").matcher(s6);
                    if(matcher0.find()) {
                        String s7 = matcher0.group(1);
                        kay.i(s7);
                        String s8 = matcher0.group(2);
                        kay.i(s8);
                        s = a.r(s8, s7, ".");
                    }
                    btp0.a = s;
                    HashMap hashMap0 = new HashMap();
                    btl[] arr_btl = btl.values();
                    int v1 = 0;
                    while(v1 < arr_btl.length) {
                        btl btl0 = arr_btl[v1];
                        bsg bsg0 = (bsg)map0.get(btl0);
                        if(bsg0 == null) {
                            if(btl0 != btl.c) {
                                btl btl1 = btl.b;
                                if(btl0 != btl1) {
                                    Objects.toString(btl0);
                                    kay.d(btl0 == btl.a, "Unhandled input format: " + btl0);
                                    if(bat0.a()) {
                                        btm0 = new btm("uniform mat4 uTransMatrix;\nattribute vec4 aPosition;\nvoid main() {\n    gl_Position = uTransMatrix * aPosition;\n}\n", "precision mediump float;\nuniform float uAlphaScale;\nvoid main() {\n    gl_FragColor = vec4(0.0, 0.0, 0.0, uAlphaScale);\n}\n");
                                    }
                                    else {
                                        bsg bsg1 = (bsg)map0.get(btl1);
                                        btm0 = bsg1 == null ? new btn(bat0, btl1) : new btn(bat0, bsg1);
                                    }
                                    goto label_81;
                                }
                            }
                            btm0 = new btn(bat0, btl0);
                        }
                        else {
                            btm0 = new btn(bat0, bsg0);
                        }
                    label_81:
                        Objects.toString(btl0);
                        hashMap0.put(btl0, btm0);
                        ++v1;
                    }
                    this.j = hashMap0;
                    int v2 = bto.a();
                    this.m = v2;
                    this.i(v2);
                    goto label_93;
                }
                catch(IllegalStateException exception0) {
                }
                goto label_91;
            }
            finally {
                this.m();
            }
        }
        catch(IllegalArgumentException exception0) {
        label_91:
            this.m();
            throw exception0;
        }
    label_93:
        this.c = Thread.currentThread();
        this.a.set(true);
        String s9 = btp0.b;
        if(btp0.a == null) {
            s1 = " glVersion";
        }
        if(s9 == null) {
            s1 = s1 + " eglVersion";
        }
        if(btp0.c == null) {
            s1 = s1 + " glExtensions";
        }
        if(btp0.d == null) {
            s1 = s1 + " eglExtensions";
        }
        if(s1.isEmpty()) {
            return new btq(btp0.a, btp0.b, btp0.c, btp0.d);
        }
        throw new IllegalStateException("Missing required properties:" + s1);
    }

    public final bts b(Surface surface0) {
        EGLSurface eGLSurface0;
        try {
            eGLSurface0 = EGL14.eglCreateWindowSurface(this.d, ((EGLConfig)j..util.Objects.requireNonNull(this.g)), surface0, this.f, 0);
            bto.e("eglCreateWindowSurface");
            if(eGLSurface0 == null) {
                throw new IllegalStateException("surface was null");
            }
        }
        catch(IllegalStateException | IllegalArgumentException exception0) {
            bcs.e("OpenGlRenderer", "Failed to create EGL surface: " + ((RuntimeException)exception0).getMessage(), exception0);
            return null;
        }
        EGLDisplay eGLDisplay0 = this.d;
        Size size0 = new Size(bto.c(eGLDisplay0, eGLSurface0, 0x3057), bto.c(eGLDisplay0, eGLSurface0, 0x3056));
        return new bts(eGLSurface0, size0.getWidth(), size0.getHeight());
    }

    public final bts c(Surface surface0) {
        kay.d(this.b.containsKey(surface0), "The surface is not registered.");
        return (bts)j..util.Objects.requireNonNull(((bts)this.b.get(surface0)));
    }

    public final void d(EGLSurface eGLSurface0) {
        kay.i(this.d);
        kay.i(this.e);
        if(EGL14.eglMakeCurrent(this.d, eGLSurface0, eGLSurface0, this.e)) {
            return;
        }
        throw new IllegalStateException("eglMakeCurrent failed");
    }

    public final void e(Surface surface0) {
        bto.h(this.a, true);
        bto.g(this.c);
        Map map0 = this.b;
        if(!map0.containsKey(surface0)) {
            map0.put(surface0, bto.l);
        }
    }

    public void f() {
        if(!this.a.getAndSet(false)) {
            return;
        }
        bto.g(this.c);
        this.m();
    }

    public final void g(Surface surface0, boolean z) {
        if(this.i == surface0) {
            this.i = null;
            this.d(this.h);
        }
        bts bts0 = z ? ((bts)this.b.remove(surface0)) : ((bts)this.b.put(surface0, bto.l));
        if(bts0 != null && bts0 != bto.l) {
            try {
                EGL14.eglDestroySurface(this.d, bts0.a);
            }
            catch(RuntimeException runtimeException0) {
                bcs.e("OpenGlRenderer", "Failed to destroy EGL surface: " + runtimeException0.getMessage(), runtimeException0);
            }
        }
    }

    public final void h(Surface surface0) {
        bto.h(this.a, true);
        bto.g(this.c);
        this.g(surface0, true);
    }

    protected final void i(int v) {
        btm btm0 = (btm)this.j.get(this.l);
        if(btm0 != null) {
            if(this.k != btm0) {
                this.k = btm0;
                btm0.c();
                Objects.toString(this.l);
                Objects.toString(this.k);
            }
            bsd.j(v);
            return;
        }
        btl btl0 = this.l;
        Objects.toString(btl0);
        throw new IllegalStateException("Unable to configure program for input format: " + btl0);
    }

    public static final void j(int v) {
        GLES20.glActiveTexture(0x84C0);
        bto.f("glActiveTexture");
        GLES20.glBindTexture(0x8D65, v);
        bto.f("glBindTexture");
    }

    private final void k(bat bat0, btp btp0) {
        EGLDisplay eGLDisplay0 = EGL14.eglGetDisplay(0);
        this.d = eGLDisplay0;
        if(j..util.Objects.equals(eGLDisplay0, EGL14.EGL_NO_DISPLAY)) {
            throw new IllegalStateException("Unable to get EGL14 display");
        }
        int v = 2;
        int[] arr_v = new int[2];
        if(EGL14.eglInitialize(this.d, arr_v, 0, arr_v, 1)) {
            if(btp0 != null) {
                btp0.b = arr_v[0] + "." + arr_v[1];
            }
            int v1 = bat0.a() ? 10 : 8;
            EGLConfig[] arr_eGLConfig = new EGLConfig[1];
            if(!EGL14.eglChooseConfig(this.d, new int[]{0x3024, v1, 0x3023, v1, 0x3022, v1, 0x3021, (bat0.a() ? 2 : 8), 0x3025, 0, 0x3026, 0, 0x3040, (bat0.a() ? 0x40 : 4), 12610, (bat0.a() ? -1 : 1), 0x3033, 5, 0x3038}, 0, arr_eGLConfig, 0, 1, new int[1], 0)) {
                throw new IllegalStateException("Unable to find a suitable EGLConfig");
            }
            EGLConfig eGLConfig0 = arr_eGLConfig[0];
            if(bat0.a()) {
                v = 3;
            }
            EGLContext eGLContext0 = EGL14.eglCreateContext(this.d, eGLConfig0, EGL14.EGL_NO_CONTEXT, new int[]{0x3098, v, 0x3038}, 0);
            bto.e("eglCreateContext");
            this.g = eGLConfig0;
            this.e = eGLContext0;
            EGL14.eglQueryContext(this.d, eGLContext0, 0x3098, new int[1], 0);
            return;
        }
        this.d = EGL14.EGL_NO_DISPLAY;
        throw new IllegalStateException("Unable to initialize EGL14");
    }

    private final void l() {
        EGLSurface eGLSurface0 = EGL14.eglCreatePbufferSurface(this.d, ((EGLConfig)j..util.Objects.requireNonNull(this.g)), new int[]{0x3057, 1, 0x3056, 1, 0x3038}, 0);
        bto.e("eglCreatePbufferSurface");
        if(eGLSurface0 == null) {
            throw new IllegalStateException("surface was null");
        }
        this.h = eGLSurface0;
    }

    private final void m() {
        for(Object object0: this.j.values()) {
            GLES20.glDeleteProgram(((btm)object0).a);
        }
        this.j = Collections.EMPTY_MAP;
        this.k = null;
        if(!j..util.Objects.equals(this.d, EGL14.EGL_NO_DISPLAY)) {
            EGL14.eglMakeCurrent(this.d, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_CONTEXT);
            for(Object object1: this.b.values()) {
                EGLSurface eGLSurface0 = ((bts)object1).a;
                if(!j..util.Objects.equals(eGLSurface0, EGL14.EGL_NO_SURFACE) && !EGL14.eglDestroySurface(this.d, eGLSurface0)) {
                    goto label_14;
                }
                continue;
                try {
                label_14:
                    bto.e("eglDestroySurface");
                }
                catch(IllegalStateException illegalStateException0) {
                    bcs.b("GLUtils", illegalStateException0.toString(), illegalStateException0);
                }
            }
            this.b.clear();
            if(!j..util.Objects.equals(this.h, EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.d, this.h);
                this.h = EGL14.EGL_NO_SURFACE;
            }
            if(!j..util.Objects.equals(this.e, EGL14.EGL_NO_CONTEXT)) {
                EGL14.eglDestroyContext(this.d, this.e);
                this.e = EGL14.EGL_NO_CONTEXT;
            }
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.d);
            this.d = EGL14.EGL_NO_DISPLAY;
        }
        this.g = null;
        this.m = -1;
        this.l = btl.a;
        this.i = null;
        this.c = null;
    }
}

