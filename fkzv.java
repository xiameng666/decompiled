public final class fkzv {
    public final hfuc a;
    public final Enum b;

    public fkzv(hfuc hfuc0) {
        Enum enum0 = (Enum)hfuc0.a(0);
        if(enum0 == null) {
            throw new IllegalArgumentException("EnumMap must have a value for number 0");
        }
        this.a = hfuc0;
        this.b = enum0;
    }
}

