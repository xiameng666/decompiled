import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.people.sync.focus.progressupdate.portal.SyncProgressPortalChimeraService;

public final class eheh {
    public int a;
    public volatile boolean b;
    public int c;
    private static volatile eheh d;
    private static final Object e;

    static {
        eheh.e = new Object();
    }

    private eheh() {
        this.c = 1;
        this.a = 0;
        this.b = true;
    }

    public static eheh a() {
        eheh eheh0 = eheh.d;
        if(eheh0 != null) {
            return eheh0;
        }
        synchronized(eheh.e) {
            if(eheh.d == null) {
                eheh.d = new eheh();
            }
        }
        return eheh.d;
    }

    public final void b(Context context0, String s, int v) {
        synchronized(this) {
            int v2 = this.c;
            if(v2 == 2) {
                egig.e("FSA2_PortalServiceRegister", "Portal already registered.");
                return;
            }
            if(v2 == 3) {
                egig.e("FSA2_PortalServiceRegister", "Portal registration in progress.");
                return;
            }
            egig.e("FSA2_PortalServiceRegister", "Registering Portal progress.");
            this.c = 3;
            this.a = v;
            this.d(context0, s, true);
        }
    }

    public final void c(Context context0, String s) {
        synchronized(this) {
            egig.e("FSA2_PortalServiceRegister", "First registration failed, try re-registering it again.");
            this.b = false;
            this.b(context0, s, this.a);
        }
    }

    public final void d(Context context0, String s, boolean z) {
        synchronized(this) {
            SyncProgressPortalChimeraService.a = z;
            gaef gaef0 = SyncProgressPortalChimeraService.c;
            if(!z && gaef0 != null) {
                try {
                    gaef0.c(0, 5);
                    this.c = 4;
                    if(!hxcv.d()) {
                        this.a = 0;
                    }
                    egig.e("FSA2_PortalServiceRegister", "Set pending reason PROGRESS_REQUEST_REMOVED to remove task from Portal UI.");
                }
                catch(RemoteException remoteException0) {
                    egig.c("FSA2_PortalServiceRegister", "Failed to set pending reason to remove task", remoteException0);
                }
                return;
            }
            if(hxcv.d() && this.a == 0) {
                egig.k("FSA2_PortalServiceRegister", "Display name resource id is not available.");
                return;
            }
            Intent intent0 = new Intent().setClassName("com.google.android.gms", "com.google.android.gms.people.sync.focus.progressupdate.portal.SyncProgressPortalService").setAction("com.google.android.gms.people.sync.focus.progressupdate.portal.BIND_SYNC_PROGRESS_PORTAL");
            int v1 = this.a;
            eheg eheg0 = new eheg(this, z, context0, s);
            gaeq.b(context0, gaes.a("com.google.android.gms", "FsaPortal_" + s.hashCode(), false, true, 0L, v1, 0x7F080CE5, intent0, ehdn.c(context0, s)), eheg0);
        }
    }

    public final void e(Context context0, String s) {
        synchronized(this) {
            egig.e("FSA2_PortalServiceRegister", "Start unregistering Portal progress.");
            if(hxcv.d() && this.a == 0) {
                this.a = ehef.a(context0, 0x7F15253F);  // string:people_contacts_sync_progress_title_in_portal "Syncing with Google Contacts"
            }
            this.d(context0, s, false);
        }
    }
}

