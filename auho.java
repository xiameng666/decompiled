import java.util.Locale;

public final class auho implements Runnable {
    public final auhx a;

    public auho(auhx auhx0) {
        this.a = auhx0;
    }

    @Override
    public final void run() {
        auhx auhx0 = this.a;
        Integer integer0 = (int)auhx0.e;
        avjh avjh0 = auhx0.c;
        avjh0.d("TcpProberDeviceController %s timed out.", new Object[]{integer0});
        auhy auhy0 = auhx0.a(false);
        if(auhy0 == null) {
            avjh0.f("TcpProberDeviceController has already been deactivated", new Object[0]);
            return;
        }
        auhx0.l.a(auhy0, 3, String.format(Locale.ROOT, "TcpProberDeviceController %s timed out.", integer0), auhx0.w);
    }
}

