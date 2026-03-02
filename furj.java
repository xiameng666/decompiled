import android.util.Log;
import android.view.ViewGroup;
import android.view.ViewOverlay;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class furj implements ibts {
    public final Method a;

    public furj(Method method0) {
        this.a = method0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ViewOverlay viewOverlay0 = (ViewOverlay)object0;
        ibuq.f(viewOverlay0, "$this$lazy");
        try {
            Object object1 = this.a == null ? null : this.a.invoke(viewOverlay0, null);
            if((object1 instanceof ViewGroup)) {
                return (ViewGroup)object1;
            }
        }
        catch(IllegalAccessException illegalAccessException0) {
            Log.w(furx.a, "Couldn\'t access view group overlay", illegalAccessException0);
        }
        catch(InvocationTargetException invocationTargetException0) {
            Log.w(furx.a, "Couldn\'t access view group overlay", invocationTargetException0);
        }
        return null;
    }
}

