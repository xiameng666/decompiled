import com.google.android.gms.mdisync.CallerInfo;
import com.google.android.gms.mdisync.internal.SyncRequest;
import com.google.android.gms.mdisync.internal.TeleportingSyncRequest;

public final class cqec implements azys {
    public final boolean a;
    public final SyncRequest b;
    public final CallerInfo c;

    public cqec(boolean z, SyncRequest syncRequest0, CallerInfo callerInfo0) {
        this.a = z;
        this.b = syncRequest0;
        this.c = callerInfo0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        cqdx cqdx0 = new cqdx(((evqp)object1));
        cqeb cqeb0 = (cqeb)((cqef)object0).H();
        SyncRequest syncRequest0 = this.b;
        CallerInfo callerInfo0 = this.c;
        if(this.a) {
            cqeb0.b(cqdx0, new TeleportingSyncRequest(syncRequest0), callerInfo0, cclr.b(((cqef)object0).r));
            return;
        }
        cqeb0.a(cqdx0, syncRequest0, callerInfo0, cclr.b(((cqef)object0).r));
    }
}

