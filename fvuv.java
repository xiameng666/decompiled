public final class fvuv {
    public final Object a;
    public final Object b;
    public final Object c;

    public fvuv(Object object0, Object object1, Object object2) {
        this.a = object0;
        this.b = object1;
        this.c = object2;
    }

    private static boolean a(Object object0, Object object1) {
        return object0 == object1 ? true : object0 != null && object0.equals(object1);
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        return (object0 instanceof fvuv) ? fvuv.a(this.a, ((fvuv)object0).a) && fvuv.a(this.b, ((fvuv)object0).b) && fvuv.a(this.c, ((fvuv)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = this.a == null ? 0 : this.a.hashCode();
        int v2 = this.b == null ? 0 : this.b.hashCode();
        Object object0 = this.c;
        if(object0 != null) {
            v = object0.hashCode();
        }
        return ((v1 + 0x20F) * 0x1F + v2) * 0x1F + v;
    }
}

