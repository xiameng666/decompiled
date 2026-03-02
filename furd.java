import android.content.BroadcastReceiver.PendingResult;
import java.util.concurrent.TimeUnit;

final class furd extends ibsl implements ibtw {
    final BroadcastReceiver.PendingResult a;
    final String b;
    final furg c;
    final long d;
    final long e;
    final furb f;

    public furd(BroadcastReceiver.PendingResult broadcastReceiver$PendingResult0, String s, furg furg0, long v, long v1, furb furb0, ibrl ibrl0) {
        this.a = broadcastReceiver$PendingResult0;
        this.b = s;
        this.c = furg0;
        this.d = v;
        this.e = v1;
        this.f = furb0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((furd)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new furd(this.a, this.b, this.c, this.d, this.e, this.f, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        this.a.setResultData(this.b);
        this.a.setResultCode(-1);
        ibuq.c(this.a);
        furg.a(this.a);
        TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - this.d);
        return new Integer(0);
    }
}

