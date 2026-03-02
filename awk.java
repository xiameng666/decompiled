import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.ZslDisablerQuirk;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.Executor;

final class awk {
    public final awp a;
    public final Executor b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    bdm g;
    public bka h;
    awj i;
    final brf j;

    public awk(awp awp0, Executor executor0) {
        boolean z = false;
        super();
        boolean z1 = false;
        this.c = false;
        this.d = false;
        this.e = false;
        this.f = false;
        this.a = awp0;
        this.b = executor0;
        int[] arr_v = (int[])awp0.c(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        if(arr_v != null) {
            for(int v = 0; v < arr_v.length; ++v) {
                if(arr_v[v] == 4) {
                    z = true;
                    break;
                }
            }
        }
        this.e = z;
        if(axv.a(ZslDisablerQuirk.class) != null) {
            z1 = true;
        }
        this.f = z1;
        this.j = new brf();
    }

    public final bcn a() {
        try {
            return (bcn)this.j.a();
        }
        catch(NoSuchElementException unused_ex) {
            bcs.a("ZslControlImpl", "dequeueImageFromBuffer no such element");
            return null;
        }
    }

    public final void b() {
        bdm bdm0 = this.g;
        if(bdm0 != null) {
            bdm0.h();
            this.g = null;
        }
        awj awj0 = this.i;
        if(awj0 != null) {
            awj0.a();
            this.i = null;
        }
        this.c();
        bka bka0 = this.h;
        if(bka0 != null) {
            bka0.d();
            this.h = null;
        }
    }

    public final void c() {
        while(true) {
            brf brf0 = this.j;
            synchronized(brf0.b) {
            }
            if(brf0.a.isEmpty()) {
                break;
            }
            ((bcn)brf0.a()).close();
        }
    }

    public static final Map d(awp awp0) {
        StreamConfigurationMap streamConfigurationMap0;
        try {
            streamConfigurationMap0 = (StreamConfigurationMap)awp0.c(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        }
        catch(AssertionError assertionError0) {
            bcs.a("ZslControlImpl", "Failed to retrieve StreamConfigurationMap, error = " + assertionError0.getMessage());
            streamConfigurationMap0 = null;
        }
        if(streamConfigurationMap0 != null && streamConfigurationMap0.getInputFormats() != null) {
            Map map0 = new HashMap();
            int[] arr_v = streamConfigurationMap0.getInputFormats();
            for(int v = 0; v < arr_v.length; ++v) {
                int v1 = arr_v[v];
                Size[] arr_size = streamConfigurationMap0.getInputSizes(v1);
                if(arr_size != null) {
                    Arrays.sort(arr_size, new bnl(true));
                    map0.put(Integer.valueOf(v1), arr_size[0]);
                }
            }
            return map0;
        }
        return new HashMap();
    }
}

