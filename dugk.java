public final class dugk implements Runnable {
    public final dugz a;
    public final int b;

    public dugk(dugz dugz0, int v) {
        this.a = dugz0;
        this.b = v;
    }

    @Override
    public final void run() {
        dugz dugz0 = this.a;
        if(!dugz0.aw) {
            dugz0.E(0x7F151D5E);  // string:pay_drivers_license_nfc_ble_timeout_message "Did not send. Please try again."
            dugz0.al.g(4, 3, 0, 5, this.b, dugz0.au);
        }
    }
}

