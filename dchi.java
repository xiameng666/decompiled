import android.os.RemoteException;
import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.TransferMetadata;
import com.google.android.gms.nearby.sharing.internal.OnTransferUpdateParams;
import j..util.Objects;

final class dchi implements dcnp {
    final ddpr a;
    final dchp b;
    private final cumy c;

    public dchi(dchp dchp0, ddpr ddpr0) {
        this.a = ddpr0;
        Objects.requireNonNull(dchp0);
        this.b = dchp0;
        super();
        this.c = new cumy(((int)hvqs.Q()));
    }

    @Override  // dcnp
    public final void e(ShareTarget shareTarget0, TransferMetadata transferMetadata0) {
        this.b.e.R(this.b.a, shareTarget0);
        if(hvrc.G()) {
            if(transferMetadata0.d) {
                if(transferMetadata0.m) {
                    curq curq0 = new curq();
                    this.c.i(Long.valueOf(shareTarget0.a), shareTarget0, curq0);
                }
                else if(transferMetadata0.e) {
                    curq curq1 = new curq();
                    this.c.c(Long.valueOf(shareTarget0.a), curq1);
                }
                else {
                    this.c.j(Long.valueOf(shareTarget0.a), shareTarget0);
                }
            }
            else if(transferMetadata0.e) {
                cumy cumy0 = this.c;
                Long long0 = (long)shareTarget0.a;
                if(cumy0.k(long0)) {
                    cumy0.c(long0, new curq());
                }
            }
            else {
                cumy cumy1 = this.c;
                Long long1 = (long)shareTarget0.a;
                if(cumy1.k(long1)) {
                    cumy1.j(long1, shareTarget0);
                }
                else {
                    cumy1.i(long1, shareTarget0, new curq());
                }
            }
        }
        try {
            OnTransferUpdateParams onTransferUpdateParams0 = new OnTransferUpdateParams();
            onTransferUpdateParams0.a = shareTarget0;
            onTransferUpdateParams0.b = transferMetadata0;
            this.a.a(onTransferUpdateParams0);
        }
        catch(RemoteException remoteException0) {
            dcvz.a.e().f(remoteException0).p("Failed to invoke onTransferUpdate on registered receive surface.", new Object[0]);
        }
    }
}

