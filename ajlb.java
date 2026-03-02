import android.accounts.Account;
import com.google.android.gms.auth.proximity.ConnectionInfo;
import com.google.android.gms.auth.proximity.RemoteDevice;
import java.util.HashSet;

public final class ajlb implements Runnable {
    public final ajlf a;

    public ajlb(ajlf ajlf0) {
        this.a = ajlf0;
    }

    @Override
    public final void run() {
        HashSet hashSet0 = new HashSet();
        ajlf ajlf0 = this.a;
        synchronized(ajlf0.b.b) {
            HashSet hashSet1 = new HashSet();
            for(Object object1: ajlf0.b.b()) {
                hashSet1.add(((ConnectionInfo)object1).b);
            }
        }
        for(Object object2: hashSet1) {
            hashSet0.add(new Account(((RemoteDevice)object2).d, "com.google"));
        }
        for(Object object3: hashSet0) {
            ajlf0.g.f(((Account)object3));
        }
    }
}

