import com.google.android.gms.nearby.sharing.ShareTarget;
import j..util.Objects;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

final class dfyy implements PropertyChangeListener {
    final ShareTarget a;
    final Runnable b;
    final dfzz c;
    final dfyq d;

    public dfyy(dfzz dfzz0, ShareTarget shareTarget0, Runnable runnable0, dfyq dfyq0) {
        this.a = shareTarget0;
        this.b = runnable0;
        this.d = dfyq0;
        Objects.requireNonNull(dfzz0);
        this.c = dfzz0;
        super();
    }

    @Override
    public final void propertyChange(PropertyChangeEvent propertyChangeEvent0) {
        Object object0 = propertyChangeEvent0.getNewValue();
        if(object0 == null) {
            return;
        }
        this.c.aU(new dfyx(this, this.a, object0.toString(), this.b, this.d));
    }
}

