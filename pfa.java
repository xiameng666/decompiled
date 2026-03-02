import android.content.ContentResolver;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings.Global;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

public final class pfa implements ibts {
    @Override  // ibts
    public final Object a(Object object0) {
        gra gra0 = pff.e;
        if(gra0.a() == null) {
            ContentResolver contentResolver0 = ((Context)gpq.b(((gzk)object0), AndroidCompositionLocals_androidKt.b)).getApplicationContext().getContentResolver();
            pfc pfc0 = new pfc(contentResolver0, Handler.createAsync(Looper.getMainLooper()));
            contentResolver0.registerContentObserver(Settings.Global.getUriFor("reduce_motion"), false, pfc0);
            gra0.b(Boolean.valueOf(pff.a(contentResolver0)));
        }
        Object object1 = gra0.a();
        ibuq.c(object1);
        ((Boolean)object1).booleanValue();
        return (Boolean)object1;
    }
}

