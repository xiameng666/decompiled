public final class eael implements ibth {
    public final eaeu a;
    public final dzzl b;

    public eael(eaeu eaeu0, dzzl dzzl0) {
        this.a = eaeu0;
        this.b = dzzl0;
    }

    @Override  // ibth
    public final Object a() {
        eaeu eaeu0 = this.a;
        if(eaeu0.A().n().isEmpty()) {
            ((ggtj)eaeu.a.h()).x("User try to continue without selecting any cards.");
            edpc.b(eaeu0.requireView(), eaeu0.getString(0x7F1521E4));  // string:pay_select_card_to_continue "Select any available card to continue"
            return ibom.a;
        }
        this.b.d.a();
        return ibom.a;
    }
}

