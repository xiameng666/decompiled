import com.google.android.gms.common.api.Status;
import j..util.Objects;
import j..util.concurrent.ConcurrentMap.-EL;

final class ffln extends ffee {
    final fdiy c;
    final fflv d;
    final fdis e;

    public ffln(fflv fflv0, fdiy fdiy0, fdis fdis0) {
        this.c = fdiy0;
        this.e = fdis0;
        Objects.requireNonNull(fflv0);
        this.d = fflv0;
        super("releaseConnectionRequest");
    }

    @Override  // ffee
    public final void a() {
        try {
            if(hzya.e() && (hzya.f() && ffgp.m())) {
                fdny.a(fdnm.b);
                fflv fflv0 = this.d;
                felm felm0 = fflv0.k;
                if(!hzya.e() || !hzya.f()) {
                    ffmn.f("Wear_ConnectionMgr", "Offload is not enabled", new Object[0]);
                }
                else if(!felm0.y) {
                    ffmn.f("Wear_ConnectionMgr", "Auxiliary connections may only be removed on watches", new Object[0]);
                }
                else {
                    ffmn.a("Wear_ConnectionMgr", "Removing auxiliary connection for type %s", new Object[]{((int)6)});
                    fekt fekt0 = new fekt(felm0);
                    felm0.h.post(fekt0);
                }
                fdis fdis0 = this.e;
                if(hzya.c()) {
                    ffha ffha0 = new ffha();
                    ConcurrentMap.-EL.computeIfPresent(fflv0.K, fdis0.a, ffha0);
                }
                else {
                    ffhc ffhc0 = new ffhc();
                    ConcurrentMap.-EL.computeIfPresent(fflv0.J, fdis0, ffhc0);
                }
                Status status0 = new Status(0);
                this.c.a(status0);
                return;
            }
            ffmn.f("WearableService", "Offload is not enabled", new Object[0]);
            Status status1 = fdlg.a(0xFAE);
            this.c.a(status1);
        }
        catch(fehz fehz0) {
            ffmn.c("WearableService", fehz0, "releaseConnectionRequest: exception during processing for", new Object[0]);
            Status status2 = new Status(8);
            this.c.a(status2);
        }
    }
}

