import java.util.List;

public class fvvi extends fvvj {
    public final long a;
    private final List b;
    private final List c;
    private final List d;
    private final List e;
    private final List f;
    private final List g;
    private final List h;
    private final List i;

    protected fvvi(long v, List list0, List list1, List list2, List list3, List list4, List list5, List list6, List list7) {
        boolean z = true;
        gftb.b(((ggna)list0).c == ((ggna)list1).c, "Lists must have the same size!");
        gftb.b(((ggna)list0).c == ((ggna)list2).c, "Lists must have the same size!");
        if(list3 != null) {
            gftb.b(((ggna)list0).c == ((ggna)list3).c, "Lists must have the same size!");
        }
        gftb.b(((ggna)list0).c == ((ggna)list4).c, "Lists must have the same size!");
        gftb.b(((ggna)list0).c == ((ggna)list5).c, "Lists must have the same size!");
        gftb.b(((ggna)list0).c == ((ggna)list6).c, "Lists must have the same size!");
        if(((ggna)list0).c != ((ggna)list7).c) {
            z = false;
        }
        gftb.b(z, "Lists must have the same size!");
        this.a = v;
        this.b = list0;
        this.c = list1;
        this.d = list2;
        this.e = list3;
        this.f = list4;
        this.g = list5;
        this.h = list6;
        this.i = list7;
    }

    @Override  // fvvj
    public final byte a(int v) {
        return 0;
    }

    @Override  // fvvj
    public final byte b(int v) {
        return (byte)(((Byte)this.d.get(v)));
    }

    public final double c(int v) {
        return ((double)this.e(v)) * 0.01;
    }

    @Override  // hecq
    public final int d() {
        return ((ggna)this.b).c;
    }

    @Override  // fvvj
    public final int e(int v) {
        return (int)(((Integer)this.f.get(v)));
    }

    @Override  // fvvj
    public final int f(int v) {
        return (int)(((Integer)this.g.get(v)));
    }

    @Override  // fvvj
    public final int g(int v) {
        List list0 = this.e;
        if(list0 != null) {
            return (int)(((Integer)list0.get(v)));
        }
        if(v <= this.d() - 1) {
            return 0;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override  // fvvj
    public final int h(int v) {
        return (int)(((Integer)this.i.get(v)));
    }

    @Override  // fvvj
    public final int i(int v) {
        return (int)(((Integer)this.h.get(v)));
    }

    @Override  // fvvj
    public final int j(int v) {
        throw new UnsupportedOperationException();
    }

    @Override  // fvvj
    public final int k(int v) {
        return -1;
    }

    @Override  // hecq
    public final long l(int v) {
        return (long)(((Long)this.b.get(v)));
    }

    @Override  // hecp
    public final long m() {
        return this.a;
    }

    @Override  // hecp
    public final long n(int v) {
        return (long)(((Long)this.c.get(v)));
    }

    @Override  // fvvj
    public final fvvg[] o() {
        return null;
    }

    public final double q(int v) {
        return ((double)this.f(v)) * 0.01;
    }

    public final boolean r() {
        return this.d() > 0;
    }
}

