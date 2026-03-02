public final class fokg {
    public final String a;

    public fokg(String s) {
        this.a = s;
    }

    public static fokg a(fokg fokg0, fokg fokg1) {
        return new fokg(fokg0.a + fokg1.a);
    }

    public static fokg b(Class class0) {
        return new fokg(class0.getSimpleName());
    }

    public static String c(fokg fokg0) {
        return fokg0 == null ? null : fokg0.a;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof fokg) ? this.a.equals(((fokg)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final String toString() {
        return this.a;
    }
}

