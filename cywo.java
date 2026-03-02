import android.bluetooth.BluetoothDevice;
import java.util.LinkedHashSet;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public final class cywo {
    public final LinkedHashSet a;
    public final int b;
    public final cywp c;
    public Long d;
    public boolean e;
    public gynl f;
    final cyww g;
    private final boolean h;
    private final Long i;
    private ScheduledFuture j;

    public cywo(cyww cyww0, LinkedHashSet linkedHashSet0, int v, cywp cywp0, Long long0, boolean z, Long long1, int v1) {
        ibuq.f(cywp0, "tempBondType");
        this.g = cyww0;
        super();
        this.a = linkedHashSet0;
        this.b = v;
        this.c = cywp0;
        if((v1 & 8) != 0) {
            long0 = null;
        }
        this.d = long0;
        this.h = ((v1 & 16) == 0 ? 1 : 0) ^ 1 | ((int)z);
        if((v1 & 0x20) != 0) {
            long1 = null;
        }
        this.i = long1;
        this.c();
    }

    public final String a() {
        cywn cywn0 = new cywn();
        String s = ibpo.aK(this.a, null, null, null, cywn0, 0x1F);
        return "[" + this.b + ":" + s + "]";
    }

    public final void b() {
        ScheduledFuture scheduledFuture0 = this.j;
        if(scheduledFuture0 != null) {
            scheduledFuture0.cancel(false);
        }
        this.j = null;
    }

    public final void c() {
        Long long0 = this.d;
        if(long0 != null) {
            this.b();
            cyww cyww0 = this.g;
            long v = ((long)long0) - cyww0.d.b();
            if(v <= 0L) {
                cywo.e(this);
                return;
            }
            cywl cywl0 = () -> this.d(cywq.a);
            this.j = ((cuuh)cyww0.g).g(cywl0, v, TimeUnit.MILLISECONDS);
        }
    }

    public final void d(cywq cywq0) {
        gynl gynl0;
        ibuq.f(cywq0, "reason");
        this.b();
        this.e = true;
        cyww cyww0 = this.g;
        cyww0.l.remove(Integer.valueOf(this.b));
        BluetoothDevice bluetoothDevice0 = (BluetoothDevice)ibpo.Q(this.a);
        if(bluetoothDevice0.getBondState() == 10) {
            cyjh.a.d().X("%s: %s is removed from cachedTempBondDevices because %s", "TempBondManager", this.a(), cywq0.name());
        }
        else {
            String s = bluetoothDevice0.getName();
            cywm cywm0 = new cywm(this);
            cygb.j(cyww0.a, cycj.class, cywm0);
            cust cust0 = cyjh.a;
            cust0.d().R("%s: Ready to unpair %s", "TempBondManager", cywk.c(bluetoothDevice0));
            boolean z = bluetoothDevice0.removeBond();
            if(z) {
                ibuq.c(s);
                cyww0.c.accept(s);
            }
            cust0.d().Y("%s: %s is unpaired because %s. Result=%b", "TempBondManager", this.a(), cywq0.name(), Boolean.valueOf(z));
        }
        cyww0.l();
        Long long0 = this.i;
        if(long0 != null) {
            long v = long0.longValue();
            long v1 = cyww0.d.b() - v;
            cxya cxya0 = cyww0.f;
            int v2 = cywq0.ordinal();
            switch(v2) {
                case 0: {
                    gynl0 = this.f;
                    if(gynl0 == null) {
                        gynl0 = gynl.e;
                    }
                    break;
                }
                case 1: {
                    gynl0 = gynl.d;
                    break;
                }
                default: {
                    if(v2 != 2) {
                        throw new ibnq();
                    }
                    gynl0 = gynl.b;
                    break;
                }
            }
            boolean z1 = this.h;
            ibuq.f(gynl0, "endReason");
            if(!hvpg.bk()) {
                cyjh.a.d().x("AudioShareLogger: flag disabled!");
                return;
            }
            gyng gyng0 = gynf.a(((ProtoLiteMessage)gynm.a).v_newBuilder());
            ProtoLiteBuilder hftp0 = gyng0.a;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gynm gynm0 = (gynm)hftp0.b_message;
            gynm0.b |= 0x400;
            gynm0.q = (int)v1;
            ibuq.f(gynl0, "value");
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gynm)hftp0.b_message).r = gynl0.g;
            ((gynm)hftp0.b_message).b |= 0x800;
            gyng0.b((z1 ? gynj.b : gynj.c));
            gynm gynm1 = gyng0.a();
            ggtj ggtj0 = cyjh.a.d();
            gynj gynj0 = gynj.b(gynm1.s) == null ? gynj.a : gynj.b(gynm1.s);
            ggtj0.X("AudioShareLogger: uploadSessionEndLog, duration=%ds, endReason=%s, entry=%s", Integer.valueOf(gynm1.q / 1000), gynl0.name(), gynj0.name());
            cxya0.a.a(((MessageLite)gynm1), gyyx.bK.bY, 0);
            cxya0.d = new ibns(System.currentTimeMillis(), gynm1);
            return;
        }
        cyjh.a.d().R("%s: device %s missing sessionStartElapsedRealtime, ignored", "TempBondManager", cywk.c(bluetoothDevice0));
    }

    @Override
    public final String toString() {
        String s = this.a();
        Long long0 = this.d;
        if(long0 != null) {
            String s1 = ", Unpair timeout:" + (long0.longValue() - this.g.d.b());
            return "Group:" + s + ", type:" + this.c.b + s1;
        }
        return "Group:" + s + ", type:" + this.c.b + ", Active";
    }
}

