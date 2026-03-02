import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.internal.OnTransferUpdateParams;

public final class ddul extends ddpq {
    private azyf a;

    public ddul(azyf azyf0) {
        this.a = azyf0;
    }

    @Override  // ddpr
    public final void a(OnTransferUpdateParams onTransferUpdateParams0) {
        synchronized(this) {
            if(this.a != null) {
                ShareTarget shareTarget0 = onTransferUpdateParams0.c == null ? onTransferUpdateParams0.a : ((ShareTarget)ddst.b(onTransferUpdateParams0.c.a, ShareTarget.CREATOR));
                if(onTransferUpdateParams0.b.e) {
                    ddun ddun0 = ddun.a();
                    azyf azyf0 = this.a;
                    batl.s(azyf0);
                    ddun0.d(shareTarget0, azyf0);
                }
                else {
                    ddun ddun1 = ddun.a();
                    azyf azyf1 = this.a;
                    batl.s(azyf1);
                    ddun1.b(shareTarget0, azyf1);
                }
                azyf azyf2 = this.a;
                batl.s(azyf2);
                azyf2.b(new dduk(this, shareTarget0, onTransferUpdateParams0));
            }
        }
    }

    public final void c() {
        synchronized(this) {
            ddun ddun0 = ddun.a();
            azyf azyf0 = this.a;
            batl.s(azyf0);
            ddun0.c(azyf0);
            this.a = null;
        }
    }
}

