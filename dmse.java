public final class dmse implements evqc {
    public final dmsn a;
    public final String b;
    public final hkid c;
    public final hkhr d;

    public dmse(dmsn dmsn0, String s, hkid hkid0, hkhr hkhr0) {
        this.a = dmsn0;
        this.b = s;
        this.c = hkid0;
        this.d = hkhr0;
    }

    @Override  // evqc
    public final void gv(Exception exception0) {
        ((ggtj)((ggtj)((ggtj)dmsn.a.i()).s(exception0)).ar(9274)).B("Failed to delete token: %s", this.b);
        String s = this.c == hkid.l ? this.a.c.getString(0x7F151E26, new Object[]{this.d.h}) : this.a.c.getString(0x7F151E35);  // string:pay_fops_payment_method_not_deleted_message "Failed to remove %1$s"
        edpc.b(this.a.c.getView(), s);
    }
}

