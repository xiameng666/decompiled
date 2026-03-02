import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.util.Pair;
import android.util.Size;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

public final class aqj implements bik {
    public final String a;
    public final awp b;
    public final azd c;
    public final Object d;
    public aow e;
    public List f;
    public final blp g;
    public final bog h;

    public aqj(String s, awt awt0) {
        this.d = new Object();
        this.f = null;
        kay.i(s);
        this.a = s;
        awp awp0 = awt0.b(s);
        this.b = awp0;
        this.c = new azd(this);
        this.g = axs.a(awp0);
        new HashMap();
        try {
            Integer.parseInt(s);
        }
        catch(NumberFormatException unused_ex) {
            bcs.d("Camera2EncoderProfilesProvider", a.a(s, "Camera id is not an integer: ", ", unable to create Camera2EncoderProfilesProvider"));
        }
        this.h = new bog(new bae(5, null));
    }

    @Override  // azz
    public final int a() {
        Integer integer0 = (Integer)this.b.c(CameraCharacteristics.LENS_FACING);
        kay.b(integer0 != null, "Unable to get the lens facing of the camera.");
        int v = (int)integer0;
        switch(v) {
            case 0: {
                return 0;
            }
            case 1: {
                return 1;
            }
            default: {
                if(v == 2) {
                    return 2;
                }
                throw new IllegalArgumentException(a.f(v, "The given lens facing integer: ", " can not be recognized."));
            }
        }
    }

    @Override  // azz
    public final int b() {
        return this.c(0);
    }

    @Override  // azz
    public final int c(int v) {
        Integer integer0 = (Integer)this.b.c(CameraCharacteristics.SENSOR_ORIENTATION);
        kay.i(integer0);
        return bnk.a(bnk.b(v), integer0.intValue(), this.a() == 1);
    }

    final int d() {
        Integer integer0 = (Integer)this.b.c(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        kay.i(integer0);
        return (int)integer0;
    }

    @Override  // bik
    public final Rect e() {
        Rect rect0 = (Rect)this.b.c(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        if("robolectric".equals(Build.FINGERPRINT) && rect0 == null) {
            return new Rect(0, 0, 4000, 3000);
        }
        kay.i(rect0);
        return rect0;
    }

    @Override  // bik
    public final bik f() {
        return this;
    }

    @Override  // bik
    public final blp g() {
        return this.g;
    }

    @Override  // azz
    public final lqd h() {
        return this.h;
    }

    @Override  // bik
    public final Object i() {
        return this.b.b.a;
    }

    @Override  // bik
    public final String j() {
        return this.a;
    }

    @Override  // azz
    public final String k() {
        return this.d() == 2 ? "androidx.camera.camera2.legacy" : "androidx.camera.camera2";
    }

    @Override  // bik
    public final List l(int v) {
        Size[] arr_size = this.b.b().b(v);
        return arr_size == null ? Collections.EMPTY_LIST : Arrays.asList(arr_size);
    }

    @Override  // bik
    public final Set m() {
        Set set0 = new HashSet();
        int[] arr_v = (int[])this.b.c(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        if(arr_v != null) {
            for(int v = 0; v < arr_v.length; ++v) {
                set0.add(Integer.valueOf(arr_v[v]));
            }
        }
        return set0;
    }

    @Override  // bik
    public final Set n() {
        int[] arr_v1;
        awz awz0 = this.b.b().b;
        int[] arr_v = null;
        try {
            arr_v1 = awz0.a.getOutputFormats();
        }
        catch(NullPointerException | IllegalArgumentException exception0) {
            bcs.e("StreamConfigurationMapCompatBaseImpl", "Failed to get output formats from StreamConfigurationMap", exception0);
            arr_v1 = null;
        }
        if(arr_v1 != null) {
            arr_v = (int[])arr_v1.clone();
        }
        if(arr_v == null) {
            return new HashSet();
        }
        Set set0 = new HashSet();
        for(int v = 0; v < arr_v.length; ++v) {
            set0.add(Integer.valueOf(arr_v[v]));
        }
        return set0;
    }

    @Override  // bik
    public final void o(Executor executor0, bhl bhl0) {
        synchronized(this.d) {
            aow aow0 = this.e;
            if(aow0 == null) {
                if(this.f == null) {
                    this.f = new ArrayList();
                }
                this.f.add(new Pair(bhl0, executor0));
                return;
            }
            aow0.j(executor0, bhl0);
        }
    }

    @Override  // bik
    public final void p(bhl bhl0) {
        synchronized(this.d) {
            aow aow0 = this.e;
            if(aow0 == null) {
                List list0 = this.f;
                if(list0 == null) {
                    return;
                }
                Iterator iterator0 = list0.iterator();
                while(iterator0.hasNext()) {
                    Object object1 = iterator0.next();
                    if(((Pair)object1).first == bhl0) {
                        iterator0.remove();
                    }
                }
                return;
            }
            aon aon0 = new aon(aow0, bhl0);
            aow0.b.execute(aon0);
        }
    }

    @Override  // bik
    public final void q(bag bag0) {
        ibuq.f(bag0, "<set-?>");
    }
}

