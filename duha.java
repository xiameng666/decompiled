public final class duha implements Runnable {
    public final duhq a;
    public final int b;

    public duha(duhq duhq0, int v) {
        this.a = duhq0;
        this.b = v;
    }

    @Override
    public final void run() {
        duhq duhq0 = this.a;
        if(!duhq0.ao) {
            duhq0.G(0x7F151D5E);  // string:pay_drivers_license_nfc_ble_timeout_message "Did not send. Please try again."
            duhq0.ah.g(4, 3, 0, 5, this.b, duhq0.am);
        }
    }
}

