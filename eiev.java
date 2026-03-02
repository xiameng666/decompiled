import java.util.TreeSet;

public final class eiev {
    public Integer a;
    public Integer b;
    public gwog c;
    public String d;
    private String e;
    private Integer f;
    private Long g;
    private Long h;
    private TreeSet i;
    private Long j;

    public eiev() {
    }

    public eiev(eiex eiex0) {
        this.e = eiex0.a;
        this.f = eiex0.b;
        this.g = eiex0.c;
        this.a = eiex0.d;
        this.h = eiex0.e;
        this.i = eiex0.f;
        this.j = eiex0.g;
        this.b = eiex0.h;
        this.c = eiex0.i;
        this.d = eiex0.j;
    }

    public final eiex a() {
        String s = this.e;
        if(s != null) {
            TreeSet treeSet0 = this.i;
            if(treeSet0 != null) {
                return new eiex(s, this.f, this.g, this.a, this.h, treeSet0, this.j, this.b, this.c, this.d);
            }
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        if(this.e == null) {
            stringBuilder0.append(" macAddress");
        }
        if(this.i == null) {
            stringBuilder0.append(" ringingOperations");
        }
        throw new IllegalStateException("Missing required properties:" + stringBuilder0.toString());
    }

    public final void b(int v) {
        this.f = v;
    }

    public final void c(long v) {
        this.g = v;
    }

    public final void d(String s) {
        if(s == null) {
            throw new NullPointerException("Null macAddress");
        }
        this.e = s;
    }

    public final void e(long v) {
        this.j = v;
    }

    public final void f(long v) {
        this.h = v;
    }

    public final void g(TreeSet treeSet0) {
        if(treeSet0 == null) {
            throw new NullPointerException("Null ringingOperations");
        }
        this.i = treeSet0;
    }
}

