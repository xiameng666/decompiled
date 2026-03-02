public final class dmta implements evqf {
    public final dmtl a;
    public final eflz b;
    public final dxev c;

    public dmta(dmtl dmtl0, eflz eflz0, dxev dxev0) {
        this.a = dmtl0;
        this.b = eflz0;
        this.c = dxev0;
    }

    @Override  // evqf
    public final void gw(Object object0) {
        Void void0 = (Void)object0;
        this.b.dismiss();
        String s = this.a.b.getString(0x7F1521ED, new Object[]{(this.c.c == null ? hkhr.b : this.c.c).h});  // string:pay_set_active_card_confirmation "%1$s is now active"
        edpc.b(this.a.b.getView(), s);
        this.a.h(5, this.c);
    }
}

