import android.bluetooth.BluetoothSocket;

public final class fehk implements glzm {
    public final fesc a;

    public fehk(fesc fesc0) {
        this.a = fesc0;
    }

    @Override  // glzm
    public final gmcd a() {
        this.a.b("Terminating the offloaded connection");
        this.a.a();
        feqm feqm0 = (feqm)this.a.d;
        feob feob0 = (feob)feqm0.j.getAndSet(null);
        String s = feob0 == null ? "null" : feob0;
        ffmn.a("McuManager", "stopOffloadConnection: connectionId=%s", new Object[]{s});
        BluetoothSocket bluetoothSocket0 = (BluetoothSocket)feqm0.n.getAndSet(null);
        if(bluetoothSocket0 != null) {
            ffmn.a("McuManager", "setOffloadedSocket: close and disconnect %s", new Object[]{bluetoothSocket0});
            feqm.d(bluetoothSocket0);
            feqi feqi0 = (feqi)feqm0.l.getAndSet(null);
            if(feqi0 != null) {
                feqi0.b();
            }
        }
        feqm0.m.set(null);
        if(feob0 == null) {
            ffmn.f("McuManager", "stopOffloadConnection: no current connectionId", new Object[0]);
            return gmbx.a;
        }
        feqi feqi1 = (feqi)feqm0.l.getAndSet(null);
        if(feqi1 == null) {
            ffmn.b("McuManager", "acceptAbort:%s; no disconnect handler", new Object[]{"stop offload connection"});
        }
        else {
            feqi1.a("stop offload connection");
        }
        feqd feqd0 = (feqd)feqm0.p.getAndSet(null);
        if(feqd0 == null) {
            ffmn.a("McuManager", "stopAcceptLoop: no accept looper running", new Object[0]);
        }
        else {
            feqd0.a();
        }
        fepy fepy0 = new fepy(feqm0, feob0);
        return glzd.f(gmbu.j(feqm0.h.a(fepy0)), new fepz(feqm0), gmap.a);
    }
}

