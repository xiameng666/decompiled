import android.content.LocusId;

public final class jwi {
    public final LocusId a;
    private final String b;

    public jwi(String s) {
        kay.k(s);
        this.b = s;
        this.a = new LocusId(s);
    }

    public static jwi a(LocusId locusId0) {
        kay.j(locusId0, "locusId cannot be null");
        String s = locusId0.getId();
        kay.k(s);
        return new jwi(s);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 == null) {
            return false;
        }
        if(this.getClass() != object0.getClass()) {
            return false;
        }
        return this.b == null ? ((jwi)object0).b == null : this.b.equals(((jwi)object0).b);
    }

    @Override
    public final int hashCode() {
        return this.b == null ? 0x1F : this.b.hashCode() + 0x1F;
    }

    @Override
    public final String toString() {
        return "LocusIdCompat[" + (this.b.length() + "_chars") + "]";
    }
}

