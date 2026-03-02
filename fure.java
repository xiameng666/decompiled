import android.content.BroadcastReceiver.PendingResult;

final class fure extends ibsl implements ibtw {
    final furg a;
    final BroadcastReceiver.PendingResult b;

    public fure(furg furg0, BroadcastReceiver.PendingResult broadcastReceiver$PendingResult0, ibrl ibrl0) {
        this.a = furg0;
        this.b = broadcastReceiver$PendingResult0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((fure)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new fure(this.a, this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        ibuq.c(this.b);
        furg.a(this.b);
        return ibom.a;
    }
}

