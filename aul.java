import android.hardware.camera2.CameraCharacteristics;
import android.os.Build.VERSION;
import java.util.concurrent.atomic.AtomicInteger;

final class aul {
    public final Object a;
    public boolean b;
    public boolean c;
    final aov d;
    private final aow e;
    private final boolean f;

    public aul(aow aow0, awp awp0) {
        new AtomicInteger(-1);
        this.a = new Object();
        this.b = false;
        this.e = aow0;
        boolean z = aul.a(awp0);
        this.f = z;
        new lqi(((int)-1));
        auk auk0 = new auk();
        this.d = auk0;
        if(z) {
            aow0.h(auk0);
        }
    }

    static boolean a(awp awp0) {
        if(Build.VERSION.SDK_INT <= 34) {
            return false;
        }
        int[] arr_v = (int[])awp0.c(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES);
        if(arr_v != null) {
            for(int v = 0; v < arr_v.length; ++v) {
                if(arr_v[v] == 6) {
                    return true;
                }
            }
        }
        return false;
    }
}

