import android.content.Context;

final class rux extends ibsl implements ibts {
    int a;
    final rve b;
    final Context c;
    final Object d;

    public rux(rve rve0, Context context0, Object object0, ibrl ibrl0) {
        this.b = rve0;
        this.c = context0;
        this.d = object0;
        super(1, ibrl0);
    }

    @Override  // ibts
    public final Object a(Object object0) {
        return new rux(this.b, this.c, this.d, ((ibrl)object0)).jI(ibom.a);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v != 0) {
            return object0;
        }
        this.a = 1;
        Object object2 = this.b.j(this.c, this.d, this);
        return object2 == object1 ? object1 : object2;
    }
}

