public final class jem {
    public final int a;

    @ibni
    public jem(int v) {
        this.a = v;
    }

    public static String a(int v) {
        switch(v) {
            case 0: {
                return "Normal";
            }
            case 1: {
                return "Italic";
            }
            default: {
                return "Invalid";
            }
        }
    }

    public static final boolean b(int v, int v1) {
        return v == v1;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof jem) && this.a == ((jem)object0).a;
    }

    @Override
    public final int hashCode() {
        return this.a;
    }

    @Override
    public final String toString() {
        return jem.a(this.a);
    }
}

