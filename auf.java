import android.hardware.camera2.CameraCharacteristics;

public final class auf implements ibth {
    public final aui a;

    public auf(aui aui0) {
        this.a = aui0;
    }

    @Override  // ibth
    public final Object a() {
        int[] arr_v = (int[])this.a.b.c(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        if(arr_v != null) {
            for(int v = 0; v < arr_v.length; ++v) {
                if(arr_v[v] == 9) {
                    return Boolean.valueOf(true);
                }
            }
        }
        return Boolean.valueOf(false);
    }
}

