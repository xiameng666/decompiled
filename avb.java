import android.hardware.camera2.CameraCharacteristics;
import android.os.Build.VERSION;
import java.util.HashSet;
import java.util.List;

public final class avb implements ibth {
    public final avf a;
    public final List b;

    public avb(avf avf0, List list0) {
        this.a = avf0;
        this.b = list0;
    }

    @Override  // ibth
    public final Object a() {
        boolean z = false;
        if(Build.VERSION.SDK_INT >= 33) {
            long[] arr_v = (long[])this.a.a.c(CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES);
            if(arr_v != null && arr_v.length != 0) {
                HashSet hashSet0 = new HashSet();
                for(int v = 0; v < arr_v.length; ++v) {
                    hashSet0.add(Long.valueOf(arr_v[v]));
                }
                for(Object object0: this.b) {
                    if(!hashSet0.contains(Long.valueOf(((bmp)object0).f.h))) {
                        return Boolean.valueOf(false);
                    }
                }
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }
}

