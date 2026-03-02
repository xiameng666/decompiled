public final class buei implements ibts {
    public final String a;

    public buei(String s) {
        this.a = s;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        try(owg owg0 = ((oxi)object0).a("DELETE FROM storage_card_eligibility WHERE accountName = ?")) {
            owg0.h(1, this.a);
            owg0.k();
        }
        return ibom.a;
    }
}

