import android.bluetooth.BluetoothDevice;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

final class cyqp extends cyqh {
    private final gxxu l;
    private final long m;
    private final cxtn n;

    public cyqp(BluetoothDevice bluetoothDevice0, kba kba0, jqt jqt0, ScheduledExecutorService scheduledExecutorService0, gxxu gxxu0, bbng bbng0, hfub hfub0, cxtn cxtn0) {
        super(bluetoothDevice0, kba0, jqt0, scheduledExecutorService0, bbng0, hfub0);
        this.l = gxxu0;
        this.n = cxtn0;
        this.m = bbng0.b();
    }

    @Override  // cyqh
    protected final String b() {
        return "RevertToDisconnect";
    }

    @Override  // cyqh
    protected final void d(boolean z) {
        if(!this.i() && !z) {
            this.h(cyqm.a, null);
        }
    }

    @Override  // cyqh
    protected final void e(boolean z, int v, byte[] arr_b) {
        hfub hfub0 = this.e;
        if(((fgmh)hfub0).p == v) {
            cust cust0 = cyjh.a;
            ((ggtj)cust0.d().ar(8036)).X("%s: onEventStreamResponse with event %s, isAck=%b", this.a(), ((Enum)hfub0).name(), Boolean.valueOf(z));
            if(!z) {
                goto label_19;
            }
            if(hvpg.a.aY().ht()) {
                cxtn cxtn0 = this.n;
                if(cxtn0 != null) {
                    ggqj ggqj0 = cxtn0.a(this.a).om();
                    while(ggqj0.hasNext()) {
                        Object object0 = ggqj0.next();
                        boolean z1 = this.l.o(((BluetoothDevice)object0));
                        ((ggtj)cust0.d().ar(8038)).X("%s: onEventStreamResponse, disconnect CsipGroupDevice %s result %b", this.a(), ((BluetoothDevice)object0), Boolean.valueOf(z1));
                    }
                    return;
                }
                BluetoothDevice bluetoothDevice0 = this.a;
                boolean z2 = this.l.o(bluetoothDevice0);
                ((ggtj)cust0.d().ar(8037)).X("%s: onEventStreamResponse, disconnect %s result %b", this.a(), bluetoothDevice0, Boolean.valueOf(z2));
                return;
            label_19:
                this.f(arr_b);
            }
        }
    }

    @Override  // cyqh
    protected final void g() {
        long v = this.d.b() - this.m;
        BluetoothDevice bluetoothDevice0 = this.a;
        if(this.l.p(bluetoothDevice0)) {
            this.c();
            hvpg hvpg0 = hvpg.a;
            if(v >= hvpg0.aY().dg()) {
                ((ggtj)cyjh.a.d().ar(8041)).X("%s: Device %s is busy, but already timeout (%d)", this.a(), fgjo.c(bluetoothDevice0), Long.valueOf(v));
                goto label_13;
            }
            ((ggtj)cyjh.a.d().ar(8040)).R("%s: Device %s is busy, reschedule check", this.a(), fgjo.c(bluetoothDevice0));
            this.j = ((cuuh)this.c).g(new cyqo(this), hvpg0.aY().df(), TimeUnit.MILLISECONDS);
            this.k(4);
            return;
        }
        else {
            ((ggtj)cyjh.a.d().ar(8039)).X("%s: Device %s is not busy, delay time %d", this.a(), fgjo.c(bluetoothDevice0), Long.valueOf(v));
        }
    label_13:
        super.g();
    }
}

