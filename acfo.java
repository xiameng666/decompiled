import android.os.Process;
import android.os.RemoteException;
import android.os.SystemClock;
import android.os.UserHandle;
import com.google.android.gms.appsearch.aidl.SetSchemaAidlRequest;
import java.util.List;

public final class acfo implements azys {
    public final acgm a;
    public final String b;
    public final List c;
    public final List d;
    public final acip e;

    public acfo(acgm acgm0, String s, List list0, List list1, acip acip0) {
        this.a = acgm0;
        this.b = s;
        this.c = list0;
        this.d = list1;
        this.e = acip0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        acjz acjz0 = (acjz)object0;
        acgm acgm0 = this.a;
        acgb acgb0 = new acgb(acgm0, ((evqp)object1));
        try {
            acjk acjk0 = (acjk)acjz0.H();
            UserHandle userHandle0 = Process.myUserHandle();
            long v = SystemClock.elapsedRealtime();
            acjk0.b(new SetSchemaAidlRequest(acgm0.b, this.b, this.c, this.d, this.e.f, this.e.g, userHandle0, v, 0), acgb0);
        }
        catch(RemoteException remoteException0) {
            ackn.a(remoteException0);
            ((evqp)object1).a(remoteException0);
        }
        acgm0.d = true;
    }
}

