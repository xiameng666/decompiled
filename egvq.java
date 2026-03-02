import com.google.android.gms.people.contactssync.model.ImportSimContactsRequest;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

final class egvq extends lqi implements evpz {
    public final egwa a;
    public ImportSimContactsRequest h;
    public evql i;
    public evql j;
    private final ScheduledExecutorService k;
    private final long l;
    private ScheduledFuture m;

    public egvq(ScheduledExecutorService scheduledExecutorService0, egwa egwa0) {
        this.k = scheduledExecutorService0;
        this.a = egwa0;
        this.l = Math.max(16L, hwyp.a.c().b());
    }

    final void b() {
        synchronized(this) {
            ((ggtj)egvs.a.h()).x("startProgressPolling");
            if(this.m == null) {
                egvp egvp0 = new egvp(this);
                this.m = ((bbll)this.k).a(egvp0, this.l, this.l, TimeUnit.MILLISECONDS);
            }
        }
    }

    @Override  // lqd
    public final void c() {
        ((ggtj)egvs.a.h()).x("onActive");
        if(this.p() && !this.i.m()) {
            this.b();
        }
    }

    @Override  // lqd
    public final void d() {
        ((ggtj)egvs.a.h()).x("onInactive");
        this.o();
    }

    @Override  // evpz
    public final void hF(evql evql0) {
        if(evql0 == this.i) {
            this.o();
            if(this.i.n()) {
                this.ii(new egvr(0x7F15254A, 0x7F080B58, 10000, ((int)(((Integer)this.i.j()))), 3, this.h.b));  // string:people_contacts_sync_sim_contacts_imported "Contacts imported"
                return;
            }
            a.ae(egvs.a.i(), "Failed to import SIM contacts", this.i.i());
            this.ii(new egvr(0x7F152548, 0x7F080B68, -1, 0, 4, null));  // string:people_contacts_sync_sim_contacts_import_failed "Failed to import contacts"
            return;
        }
        if(!this.i.m() && evql0.n()) {
            int v = (int)(((Integer)evql0.j()));
            if(v >= 0) {
                this.ii(new egvr(0x7F152539, 0x7F080B5B, v, 0, 2, null));  // string:people_contacts_sync_importing_sim_contacts "Importing contacts"
            }
        }
    }

    final void o() {
        synchronized(this) {
            ScheduledFuture scheduledFuture0 = this.m;
            if(scheduledFuture0 != null) {
                ((ggtj)egvs.a.h()).x("cancelling progress future");
                scheduledFuture0.cancel(false);
                this.m = null;
            }
        }
    }

    final boolean p() {
        return this.i != null;
    }
}

