import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.internal.RequestConnectionParcelable;
import j..util.Objects;
import j..util.Optional;

final class fflm extends ffee {
    final fdiy c;
    final RequestConnectionParcelable d;
    final fflv e;
    final fdis f;

    public fflm(fflv fflv0, fdiy fdiy0, RequestConnectionParcelable requestConnectionParcelable0, fdis fdis0) {
        this.c = fdiy0;
        this.d = requestConnectionParcelable0;
        this.f = fdis0;
        Objects.requireNonNull(fflv0);
        this.e = fflv0;
        super("requestConnection");
    }

    @Override  // ffee
    public final void a() {
        ffdt ffdt0;
        try {
            if(hzya.e() && hzya.f() && ffgp.m()) {
                if(hzya.a.b().h()) {
                    fenf fenf0 = this.e.H;
                    if(fenf0 != null) {
                        Optional optional0 = fenf0.a(this.d.a);
                        if(optional0.isPresent() && !((Boolean)optional0.flatMap(new ffll()).orElse(Boolean.valueOf(false))).booleanValue()) {
                            ffmn.f("WearableService", "Remote node doesn\'t support offload", new Object[0]);
                            Status status0 = fdlg.a(0xFAE);
                            this.c.a(status0);
                            return;
                        }
                    }
                }
                fflv fflv0 = this.e;
                fdis fdis0 = this.f;
                fdpl fdpl0 = fflv0.e;
                felm felm0 = fflv0.k;
                if(hzya.e() && hzya.f()) {
                    fehi fehi0 = felm0.B;
                    if(fehi0 == null) {
                        ffmn.f("ConnectionRequestMgr", "The BleOffloadConnectionEventNotifier is null", new Object[0]);
                        ffdt0 = null;
                    }
                    else {
                        ffdt0 = new ffdt(fdpl0, fehi0, fdis0);
                        fehi0.a(ffdt0);
                    }
                }
                else {
                    ffmn.f("ConnectionRequestMgr", "Offload is not enabled", new Object[0]);
                    ffdt0 = null;
                }
                if(ffdt0 == null) {
                    throw new fehz(new UnsupportedOperationException());
                }
                if(hzya.c()) {
                    fflv0.K.putIfAbsent(fdis0.a, ffdt0);
                }
                else {
                    fflv0.J.putIfAbsent(fdis0, ffdt0);
                }
                fdny.a(fdnm.a);
                felm0.h(this.d.a, (this.d.b == 0 ? 6 : 0), null);
                Status status1 = new Status(0);
                this.c.a(status1);
                return;
            }
            ffmn.f("WearableService", "Offload is not enabled on this device", new Object[0]);
            Status status2 = fdlg.a(0xFAE);
            this.c.a(status2);
        }
        catch(fehz fehz0) {
            ffmn.c("WearableService", fehz0, "requestConnection: exception during processing for %s", new Object[]{this.d.a});
            if((fehz0.getCause() instanceof UnsupportedOperationException)) {
                Status status3 = new Status(0xFAE);
                this.c.a(status3);
                return;
            }
            Status status4 = new Status(8);
            this.c.a(status4);
        }
    }
}

