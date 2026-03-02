public final class czro implements Runnable {
    public final czrr a;

    public czro(czrr czrr0) {
        this.a = czrr0;
    }

    @Override
    public final void run() {
        czrr czrr0 = this.a;
        czrr0.g = null;
        if(czrr0.d) {
            return;
        }
        if(czrr0.b != null && czrr0.b.z()) {
            czkq.a.d().h("%s Bluetooth Scanning started.", "[BluetoothClassicScanner]");
            czrr0.d = true;
            czrr0.f(czrr0.f);
            czrp czrp0 = new czrp(czrr0);
            long v = hvog.s();
            czrr0.g = cumn.d(czkq.a, czrp0, v, czrr0.e);
            return;
        }
        czkq.a.b().h("%s Failed to start bluetooth discover.", "[BluetoothClassicScanner]");
    }
}

