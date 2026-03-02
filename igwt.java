import java.util.Locale;

public class igwt extends igvx {
    public short e;
    private String f;

    public igwt(igvt igvt0) {
        this(igvt0, "RemoveDate", 8);
    }

    public igwt(igvt igvt0, String s, short v) {
        super(igvt0, s);
        igvt0.f();
        if(igvt0.b) {
            throw new igvu(2);
        }
        short v2 = 0;
        for(int v1 = 0; v1 < v; ++v1) {
            v2 = (short)(((short)(v2 + v2)) | igvt0.b());
        }
        this.e = v2;
        this.f = "%1$s";
        this.c = igvt0.c;
    }

    @Override  // igvx
    public Object b() {
        return (short)this.e;
    }

    @Override  // igvx
    public String toString() {
        return String.format(Locale.UK, this.f, ((short)this.e));
    }
}

