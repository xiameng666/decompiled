import android.hardware.camera2.CameraCharacteristics.Key;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build.VERSION;
import java.util.HashMap;
import java.util.Map;

public final class awp {
    public final String a;
    public final awo b;
    private final Map c;
    private awy d;

    public awp(CameraCharacteristics cameraCharacteristics0, String s) {
        this.c = new HashMap();
        this.d = null;
        this.b = new awo(cameraCharacteristics0);
        this.a = s;
    }

    public final int a() {
        Integer integer0 = !this.d() || Build.VERSION.SDK_INT < 35 ? null : ((Integer)this.c(CameraCharacteristics.FLASH_TORCH_STRENGTH_DEFAULT_LEVEL));
        return integer0 == null ? 1 : ((int)integer0);
    }

    public final awy b() {
        StreamConfigurationMap streamConfigurationMap0;
        if(this.d == null) {
            try {
                streamConfigurationMap0 = (StreamConfigurationMap)this.c(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
            }
            catch(NullPointerException | AssertionError throwable0) {
                throw new IllegalArgumentException(throwable0.getMessage());
            }
            if(streamConfigurationMap0 == null) {
                throw new IllegalArgumentException("StreamConfigurationMap is null!");
            }
            this.d = new awy(streamConfigurationMap0, new ayf(this.a));
            return this.d;
        }
        return this.d;
    }

    public final Object c(CameraCharacteristics.Key cameraCharacteristics$Key0) {
        Object object1;
        if(cameraCharacteristics$Key0.equals(CameraCharacteristics.SENSOR_ORIENTATION)) {
            return this.b.a(cameraCharacteristics$Key0);
        }
        synchronized(this) {
            Map map0 = this.c;
            Object object0 = map0.get(cameraCharacteristics$Key0);
            if(object0 != null) {
                return object0;
            }
            object1 = this.b.a(cameraCharacteristics$Key0);
            if(object1 != null) {
                map0.put(cameraCharacteristics$Key0, object1);
            }
        }
        return object1;
    }

    public final boolean d() {
        Boolean boolean0 = (Boolean)this.c(CameraCharacteristics.FLASH_INFO_AVAILABLE);
        return boolean0 != null && boolean0.booleanValue();
    }
}

