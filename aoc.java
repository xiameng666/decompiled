import android.hardware.camera2.CameraCharacteristics.Key;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.os.Build.VERSION;
import android.util.Range;

final class aoc implements awb {
    private final awp a;
    private final Range b;
    private float c;
    private boolean d;

    public aoc(awp awp0) {
        this.c = 1.0f;
        boolean z = false;
        this.d = false;
        this.a = awp0;
        this.b = (Range)awp0.c(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE);
        if(Build.VERSION.SDK_INT >= 34) {
            CameraCharacteristics.Key cameraCharacteristics$Key0 = CameraCharacteristics.CONTROL_AVAILABLE_SETTINGS_OVERRIDES;
            int[] arr_v = (int[])awp0.b.a(cameraCharacteristics$Key0);
            if(arr_v != null) {
                for(int v = 0; v < arr_v.length; ++v) {
                    if(arr_v[v] == 1) {
                        z = true;
                        break;
                    }
                }
            }
        }
        this.d = z;
    }

    @Override  // awb
    public final float a() {
        return (float)(((Float)this.b.getUpper()));
    }

    @Override  // awb
    public final float b() {
        return (float)(((Float)this.b.getLower()));
    }

    @Override  // awb
    public final void c(ans ans0) {
        bjs bjs0 = bjs.c;
        ans0.e(CaptureRequest.CONTROL_ZOOM_RATIO, Float.valueOf(this.c), bjs0);
        if(this.d) {
            ibuq.f(bjs0, "priority");
            if(Build.VERSION.SDK_INT >= 34) {
                ans0.e(CaptureRequest.CONTROL_SETTINGS_OVERRIDE, Integer.valueOf(1), bjs0);
            }
        }
    }

    @Override  // awb
    public final void d() {
        this.c = 1.0f;
    }

    @Override  // awb
    public final void e() {
    }
}

