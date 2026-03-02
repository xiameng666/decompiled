public final class fduq {
    public final fdpl a;
    public fdun b;
    public boolean c;
    public boolean d;
    public String e;
    public long f;
    public long g;
    public long h;
    public boolean i;

    public fduq(fdpl fdpl0) {
        this.f = -1L;
        this.a = fdpl0;
    }

    public fduq(fduq fduq0) {
        this(fduq0, null, null);
    }

    public fduq(fduq fduq0, fdpl fdpl0, String s) {
        this.f = -1L;
        this.a = fdpl0 == null ? fduq0.a : fdpl0;
        this.c = fduq0.c;
        this.b = new fdun(fduq0.b, s);
        this.d = fduq0.d;
        this.e = fduq0.e;
        this.f = fduq0.f;
        this.g = fduq0.g;
        this.h = fduq0.h;
        this.i = fduq0.i;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("DataItemRecord[");
        stringBuilder0.append(ffmr.a(this.a.b));
        stringBuilder0.append(",");
        stringBuilder0.append(this.a.d);
        stringBuilder0.append(",");
        stringBuilder0.append(this.b.a(true));
        stringBuilder0.append(",sourceId=");
        stringBuilder0.append(this.e);
        stringBuilder0.append(",seqId=");
        stringBuilder0.append(this.f);
        stringBuilder0.append(",v1SeqId=");
        stringBuilder0.append(this.g);
        stringBuilder0.append(",lastModified=");
        stringBuilder0.append(this.h);
        stringBuilder0.append(",assetsAreReady=");
        stringBuilder0.append(this.d);
        if(this.i) {
            stringBuilder0.append(", encrypted");
        }
        if(this.c) {
            stringBuilder0.append(", DELETED");
        }
        stringBuilder0.append("]");
        return stringBuilder0.toString();
    }
}

