import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;

public class azxx {
    protected final azxy e;

    protected azxx(azxy azxy0) {
        this.e = azxy0;
    }

    public void a(String s, FileDescriptor fileDescriptor0, PrintWriter printWriter0, String[] arr_s) {
    }

    public void d() {
    }

    public void e() {
    }

    public void i(int v, int v1, Intent intent0) {
    }

    public void j(Bundle bundle0) {
    }

    public void k(Bundle bundle0) {
    }

    public void n() {
    }

    public final Activity o() {
        Activity activity0 = this.e.a();
        batl.s(activity0);
        return activity0;
    }

    public static azxy p(Activity activity0) {
        return azxx.q(new azxw(activity0));
    }

    public static azxy q(azxw azxw0) {
        azxy azxy1;
        Object object0 = azxw0.a;
        if(!(object0 instanceof ea)) {
            WeakReference weakReference0 = (WeakReference)azxz.a.get(object0);
            if(weakReference0 != null) {
                azxy azxy0 = (azxz)weakReference0.get();
                if(azxy0 != null) {
                    return azxy0;
                }
            }
            try {
                azxy1 = (azxz)((Activity)object0).getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
            }
            catch(ClassCastException classCastException0) {
                throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", classCastException0);
            }
            if(azxy1 == null || ((azxz)azxy1).isRemoving()) {
                azxy1 = new azxz();
                ((Activity)object0).getFragmentManager().beginTransaction().add(((Fragment)azxy1), "LifecycleFragmentImpl").commitAllowingStateLoss();
            }
            WeakReference weakReference1 = new WeakReference(azxy1);
            azxz.a.put(object0, weakReference1);
            return azxy1;
        }
        return azyz.y(((ea)azxw0.a), ((ea)azxw0.a).getSupportFragmentManager());
    }
}

