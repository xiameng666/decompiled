public final class bueo implements ibts {
    public final String a;
    public final budu b;

    public bueo(String s, budu budu0) {
        this.a = s;
        this.b = budu0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        try(owg owg0 = ((oxi)object0).a("DELETE FROM storage_card_eligibility WHERE accountName = ? AND subscriptionStatus != ?")) {
            owg0.h(1, this.a);
            owg0.h(2, buer.h(this.b));
            owg0.k();
        }
        return ibom.a;
    }
}

