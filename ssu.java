final class ssu extends idsd {
    private final int d;
    private final int e;

    public ssu(int v, int v1, idsd idsd0) {
        super(idsd0.b);
        this.d = v;
        this.e = v1;
    }

    final ssy a() {
        int v = this.d;
        if((v & 0x1F) == 0x1F) {
            int v1 = this.e;
            if((v1 & 0x80) == 0) {
                return new ssy((v << 8) + v1);
            }
            throw new stt("Seos supports max two byte tags");
        }
        return new ssy(v);
    }
}

