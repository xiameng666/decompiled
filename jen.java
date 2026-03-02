public final class jen {
    public final int a;

    public jen(int v) {
        this.a = v;
    }

    public static String a(int v) {
        switch(v) {
            case 0: {
                return "None";
            }
            case 1: {
                return "Weight";
            }
            case 2: {
                return "Style";
            }
            case 0xFFFF: {
                return "All";
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
        return (object0 instanceof jen) && this.a == ((jen)object0).a;
    }

    @Override
    public final int hashCode() {
        return this.a;
    }

    @Override
    public final String toString() {
        return jen.a(this.a);
    }
}

