public final class bueh implements ibts {
    public final String a;
    public final buds b;

    public bueh(String s, buds buds0) {
        this.a = s;
        this.b = buds0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        try(owg owg0 = ((oxi)object0).a("DELETE FROM storage_card_eligibility WHERE accountName = ? AND storageConsumption > ?")) {
            owg0.h(1, this.a);
            owg0.h(2, buer.f(this.b));
            owg0.k();
        }
        return ibom.a;
    }
}

