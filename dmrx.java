public final class dmrx implements evqf {
    public final dmsn a;
    public final eflz b;

    public dmrx(dmsn dmsn0, eflz eflz0) {
        this.a = dmsn0;
        this.b = eflz0;
    }

    @Override  // evqf
    public final void gw(Object object0) {
        Void void0 = (Void)object0;
        this.b.dismiss();
        String s = this.a.c.getString(0x7F151E34);  // string:pay_fops_token_deleted_message "Tap to pay was deactivated"
        edpc.b(this.a.c.getView(), s);
    }
}

