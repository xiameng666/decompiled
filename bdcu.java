import java.util.List;

final class bdcu extends ibuo implements ibts {
    public bdcu(Object object0) {
        super(1, object0, bdea.class, "setPasswords", "setPasswords(Ljava/util/List;)V", 0);
    }

    @Override  // ibts
    public final Object a(Object object0) {
        List list0 = (List)object0;
        ibuq.f(list0, "p0");
        bdea bdea0 = (bdea)this.e;
        ibuq.f(list0, "selectedPasswords");
        bdea0.e.a(list0);
        return ibom.a;
    }
}

