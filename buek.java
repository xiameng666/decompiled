public final class buek implements ibts {
    public final String a;
    public final String b;

    public buek(String s, String s1) {
        this.a = s;
        this.b = s1;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        try(owg owg0 = ((oxi)object0).a("UPDATE OR REPLACE storage_card_eligibility SET accountName=? WHERE accountName = ?")) {
            owg0.h(1, this.a);
            owg0.h(2, this.b);
            owg0.k();
        }
        return ibom.a;
    }
}

