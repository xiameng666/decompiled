public final class hfta {
    final MessageLite a;
    public final Object b;
    final MessageLite c;
    public final hftu d;

    public hfta() {
        throw null;
    }

    public hfta(MessageLite hfvm0, Object object0, MessageLite hfvm1, hftu hftu0) {
        if(hfvm0 == null) {
            throw new IllegalArgumentException("Null containingTypeDefaultInstance");
        }
        if(hftu0.b == hfxe.k && hfvm1 == null) {
            throw new IllegalArgumentException("Null messageDefaultInstance");
        }
        this.a = hfvm0;
        this.b = object0;
        this.c = hfvm1;
        this.d = hftu0;
    }

    public final int a() {
        return this.d.a;
    }

    public final hfxe b() {
        return this.d.b;
    }

    public final Object c(Object object0) {
        return this.d(object0);
    }

    public final Object d(Object object0) {
        return this.d.a() == hfxf.h ? gzhh.b(((Integer)object0).intValue()) : object0;
    }
}

