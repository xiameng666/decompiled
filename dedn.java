final class dedn extends ibsl implements ibua {
    boolean a;
    boolean b;
    boolean c;
    boolean d;
    boolean e;
    final dcyu f;

    public dedn(dcyu dcyu0, ibrl ibrl0) {
        this.f = dcyu0;
        super(6, ibrl0);
    }

    @Override  // ibua
    public final Object b(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5) {
        dedn dedn0 = new dedn(this.f, ((ibrl)object5));
        dedn0.a = ((Boolean)object0).booleanValue();
        dedn0.b = ((Boolean)object1).booleanValue();
        dedn0.c = ((Boolean)object2).booleanValue();
        dedn0.d = ((Boolean)object3).booleanValue();
        dedn0.e = ((Boolean)object4).booleanValue();
        return dedn0.jI(ibom.a);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        boolean z = this.e;
        return new denh(this.a, this.b, ((boolean)(this.d ^ 1)), this.c, djbw.h(this.f.a), z);
    }
}

