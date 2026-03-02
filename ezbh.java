import android.os.RemoteException;
import java.util.ArrayList;

public final class ezbh implements Runnable {
    public final ezbn a;
    public final Object b;
    public final String c;

    public ezbh(ezbn ezbn0, Object object0, String s) {
        this.a = ezbn0;
        this.b = object0;
        this.c = s;
    }

    @Override
    public final void run() {
        synchronized(this.a.b) {
            ezbf ezbf0 = this.a.e;
            if(ezbf0 == null) {
                ((ggtj)((ggtj)ezbn.a.j()).ar(0x4373)).x("[PreferenceServiceClient] Failed to push value to SharedPreferenceService.Preference service is null.");
                return;
            }
            try {
                Object object1 = this.b;
                String s = this.c;
                if(object1 == null) {
                    ezbf0.g(s);
                }
                else if((object1 instanceof String)) {
                    ezbf0.e(s, ((String)object1));
                }
                else if((object1 instanceof Boolean)) {
                    ezbf0.b(s, ((Boolean)object1).booleanValue());
                }
                else if((object1 instanceof ezbm)) {
                    ezbf0.f(s, new ArrayList(((ezbm)object1)));
                }
                else if((object1 instanceof Long)) {
                    ezbf0.d(s, ((Long)object1).longValue());
                }
                else if((object1 instanceof Integer)) {
                    ezbf0.c(s, ((Integer)object1).intValue());
                }
                else {
                    ((ggtj)((ggtj)ezbn.a.j()).ar(0x4371)).R("[PreferenceServiceClient] Invalid type for preference value. Ignored. (key: %s  value: %s).", s, object1);
                }
            }
            catch(RemoteException remoteException0) {
                ((ggtj)((ggtj)((ggtj)ezbn.a.j()).s(remoteException0)).ar(0x4372)).x("[PreferenceServiceClient] Failed to access preference service.");
            }
        }
    }
}

