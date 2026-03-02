public final class dngw implements ibts {
    public final dnhi a;
    public final dxev b;

    public dngw(dnhi dnhi0, dxev dxev0) {
        this.a = dnhi0;
        this.b = dxev0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        Void void0 = (Void)object0;
        String s = this.a.a.getString(0x7F1521EE, new Object[]{(this.b.c == null ? hkhr.b : this.b.c).h});  // string:pay_set_default_card_confirmation "%1$s is now your default card"
        ibuq.e(s, "getString(...)");
        edpc.b(this.a.a.requireView(), s);
        return ibom.a;
    }
}

