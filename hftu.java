final class hftu implements Comparable {
    final int a;
    final hfxe b;

    public hftu(int v, hfxe hfxe0) {
        this.a = v;
        this.b = hfxe0;
    }

    public final hfxf a() {
        return this.b.s;
    }

    public static final void b(Object object0, Object object1) {
        ((ProtoLiteBuilder)object0).X(((ProtoLiteMessage)object1));
    }

    @Override
    public final int compareTo(Object object0) {
        return this.a - ((hftu)object0).a;
    }
}

