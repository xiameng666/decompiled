import android.security.advancedprotection.AdvancedProtectionManager.Callback;
import android.security.advancedprotection.AdvancedProtectionManager;
import java.util.HashMap;
import java.util.concurrent.Executor;

public final class ccif implements ibts {
    public final ccim a;
    public final ccik b;
    public final Executor c;

    public ccif(ccim ccim0, ccik ccik0, Executor executor0) {
        this.a = ccim0;
        this.b = ccik0;
        this.c = executor0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((AdvancedProtectionManager)object0), "it");
        HashMap hashMap0 = this.a.b;
        ccik ccik0 = this.b;
        Executor executor0 = this.c;
        synchronized(hashMap0) {
            Object object1 = hashMap0.get(ccik0);
            if(object1 == null) {
                object1 = new ccii(ccik0);
                hashMap0.put(ccik0, object1);
            }
            ((AdvancedProtectionManager)object0).registerAdvancedProtectionCallback(executor0, ((AdvancedProtectionManager.Callback)object1));
        }
        return ibom.a;
    }
}

