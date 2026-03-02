public final class dmsl implements evqc {
    public final dmsn a;
    public final eflz b;
    public final String c;

    public dmsl(dmsn dmsn0, eflz eflz0, String s) {
        this.a = dmsn0;
        this.b = eflz0;
        this.c = s;
    }

    @Override  // evqc
    public final void gv(Exception exception0) {
        this.b.dismiss();
        ((ggtj)((ggtj)((ggtj)dmsn.a.i()).s(exception0)).ar(9278)).B("Failed to delete SE card token: %s", this.c);
        String s = this.a.c.getString(0x7F151E35);  // string:pay_fops_token_not_deleted_message "Failed to disable tap to pay"
        edpc.b(this.a.c.getView(), s);
    }
}

