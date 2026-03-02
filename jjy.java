public final class jjy {
    public final int a;

    public jjy(int v) {
        this.a = v;
    }

    public static String a(int v) {
        switch(v) {
            case 0: {
                return "Unspecified";
            }
            case 1: {
                return "Left";
            }
            case 2: {
                return "Right";
            }
            case 3: {
                return "Center";
            }
            case 4: {
                return "Justify";
            }
            case 5: {
                return "Start";
            }
            case 6: {
                return "End";
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
        return (object0 instanceof jjy) && this.a == ((jjy)object0).a;
    }

    @Override
    public final int hashCode() {
        return this.a;
    }

    @Override
    public final String toString() {
        return jjy.a(this.a);
    }
}

