import android.content.Context;

public final class crzd {
    public Context a;
    public String b;
    public Long c;
    public String d;
    public boolean e;
    public Integer f;
    public Long g;
    public int h;

    public crzd() {
    }

    public crzd(crze crze0) {
        this.a = crze0.a;
        this.b = crze0.b;
        this.c = (long)crze0.c;
        this.d = crze0.d;
        this.e = crze0.e;
        this.h = crze0.h;
        this.f = (int)crze0.f;
        this.g = (long)crze0.g;
    }

    public final crze a() {
        if(this.a != null && this.b != null && this.c != null && this.d != null && this.h != 0) {
            return new crze(this);
        }
        throw new IllegalArgumentException("Gcore Registration arguments are not set properly");
    }
}

