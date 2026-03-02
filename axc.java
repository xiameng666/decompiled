import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.DynamicRangeProfiles;
import android.os.Build.VERSION;

public final class axc {
    public final axb a;

    public axc(axb axb0) {
        this.a = axb0;
    }

    public final DynamicRangeProfiles a() {
        kay.d(Build.VERSION.SDK_INT >= 33, "DynamicRangesCompat can only be converted to DynamicRangeProfiles on API 33 or higher.");
        return this.a.a();
    }

    public static axc b(awp awp0) {
        axc axc0 = null;
        if(Build.VERSION.SDK_INT >= 33) {
            DynamicRangeProfiles dynamicRangeProfiles0 = aas..ExternalSyntheticApiModelOutline0.m(awp0.c(CameraCharacteristics.REQUEST_AVAILABLE_DYNAMIC_RANGE_PROFILES));
            if(dynamicRangeProfiles0 != null) {
                kay.d(Build.VERSION.SDK_INT >= 33, "DynamicRangeProfiles can only be converted to DynamicRangesCompat on API 33 or higher.");
                axc0 = new axc(new axd(dynamicRangeProfiles0));
            }
        }
        return axc0 == null ? axe.a : axc0;
    }
}

