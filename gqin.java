public final class gqin {
    public gqgf a;
    public boolean b;
    public byte c;
    private boolean d;

    public final gqio a() {
        if(this.c != 3) {
            StringBuilder stringBuilder0 = new StringBuilder();
            if((this.c & 1) == 0) {
                stringBuilder0.append(" keepRawInput");
            }
            if((this.c & 2) == 0) {
                stringBuilder0.append(" stripNationalPrefixAfterCountryCode");
            }
            throw new IllegalStateException("Missing required properties:" + stringBuilder0.toString());
        }
        return new gqio(this.a, this.d, this.b);
    }

    public final void b(boolean z) {
        this.d = z;
        this.c = (byte)(this.c | 1);
    }
}

