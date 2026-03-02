import java.util.List;

public final class blx {
    public bka a;
    public List b;
    public Integer c;
    private Integer d;
    private bat e;

    public final bly a() {
        String s = this.a == null ? " surface" : "";
        if(this.b == null) {
            s = s + " sharedSurfaces";
        }
        if(this.d == null) {
            s = s + " mirrorMode";
        }
        if(this.c == null) {
            s = s + " surfaceGroupId";
        }
        if(this.e == null) {
            s = s + " dynamicRange";
        }
        if(s.isEmpty()) {
            return new bly(this.a, this.b, ((int)this.d), this.e);
        }
        throw new IllegalStateException("Missing required properties:" + s);
    }

    public final void b(bat bat0) {
        if(bat0 == null) {
            throw new NullPointerException("Null dynamicRange");
        }
        this.e = bat0;
    }

    public final void c(int v) {
        this.d = v;
    }
}

