import android.hardware.camera2.CameraCharacteristics;
import android.os.Build.VERSION;
import j..util.Objects;

final class avy {
    public final aow a;
    public final lqi b;
    public boolean c;
    public final int d;
    jqt e;
    boolean f;
    private final lqi g;
    private final boolean h;

    public avy(aow aow0, awp awp0) {
        boolean z1;
        Integer integer0 = null;
        super();
        this.a = aow0;
        Objects.requireNonNull(awp0);
        boolean z = ayb.a(new avw(awp0));
        this.h = z;
        if(awp0.d() && Build.VERSION.SDK_INT >= 35) {
            if(awp0.d() && Build.VERSION.SDK_INT >= 35) {
                integer0 = (Integer)awp0.c(CameraCharacteristics.FLASH_TORCH_STRENGTH_MAX_LEVEL);
            }
            z1 = true;
            if(integer0 == null || ((int)integer0) <= 1) {
                z1 = false;
            }
        }
        else {
            z1 = false;
        }
        int v = !z || !z1 ? 0 : awp0.a();
        this.d = v;
        this.g = new lqi(((int)0));
        this.b = new lqi(v);
        aow0.h(new avx(this));
    }

    final void a(jqt jqt0, int v) {
        boolean z = false;
        if(!this.h) {
            if(jqt0 == null) {
                return;
            }
            jqt0.c(new IllegalStateException("No flash unit"));
            return;
        }
        if(!this.c) {
            this.b(0);
            if(jqt0 != null) {
                jqt0.c(new azq("Camera is not active."));
            }
            return;
        }
        aow aow0 = this.a;
        if(v != 0) {
            z = true;
        }
        this.f = z;
        aow0.n(v);
        this.b(v);
        jqt jqt1 = this.e;
        if(jqt1 != null) {
            jqt1.c(new azq("There is a new enableTorch being set"));
        }
        this.e = jqt0;
    }

    public final void b(int v) {
        avy.c(this.g, Integer.valueOf((v == 1 ? 1 : 0)));
    }

    public static final void c(lqi lqi0, Object object0) {
        if(boj.d()) {
            lqi0.l(object0);
            return;
        }
        lqi0.ii(object0);
    }
}

