public final class fvta {
    public final fvtc a;
    public final fvtm b;
    final long c;

    public fvta(fvtc fvtc0, fvtm fvtm0) {
        this.a = fvtc0;
        this.b = fvtm0;
        this.c = fvtc0.a == null || fvtc0.a.m() <= fvtm0.f ? fvtm0.f : fvtc0.a.m();
    }

    public fvta(fvvj fvvj0, fvtm fvtm0) {
        this(new fvtc(fvvj0, 1), fvtm0);
    }

    public final fvvj a() {
        return this.a.a;
    }
}

