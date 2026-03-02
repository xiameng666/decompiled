public final class czrp implements Runnable {
    public final czrr a;

    public czrp(czrr czrr0) {
        this.a = czrr0;
    }

    @Override
    public final void run() {
        czrr czrr0 = this.a;
        czrr0.g = null;
        if(!czrr0.d) {
            return;
        }
        czrr0.d = false;
        bsaq bsaq0 = czrr0.b;
        if(bsaq0 != null) {
            bsaq0.o();
        }
        czkq.a.d().h("%s Bluetooth Scanning stopped.", "[BluetoothClassicScanner]");
        czro czro0 = new czro(czrr0);
        long v = hvog.r() - hvog.s();
        czrr0.g = cumn.d(czkq.a, czro0, v, czrr0.e);
    }
}

