import android.os.Process;
import android.os.RemoteException;
import android.os.SystemClock;
import android.os.UserHandle;
import com.google.android.gms.appsearch.aidl.GetSchemaAidlRequest;

public final class acft implements azys {
    public final acgm a;
    public final String b;

    public acft(acgm acgm0, String s) {
        this.a = acgm0;
        this.b = s;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        acjz acjz0 = (acjz)object0;
        acgi acgi0 = new acgi(this.a, ((evqp)object1));
        try {
            acjk acjk0 = (acjk)acjz0.H();
            UserHandle userHandle0 = Process.myUserHandle();
            long v = SystemClock.elapsedRealtime();
            acjk0.a(new GetSchemaAidlRequest(this.a.b, this.a.a, this.b, userHandle0, v, false), acgi0);
        }
        catch(RemoteException remoteException0) {
            ackn.a(remoteException0);
            ((evqp)object1).a(remoteException0);
        }
    }
}

