import j..util.Objects;
import java.math.BigDecimal;
import java.math.BigInteger;

public final class gpzw extends gpzq {
    private final Object a;

    public gpzw(Boolean boolean0) {
        this.a = Objects.requireNonNull(boolean0);
    }

    public gpzw(Number number0) {
        this.a = Objects.requireNonNull(number0);
    }

    public gpzw(String s) {
        this.a = Objects.requireNonNull(s);
    }

    @Override  // gpzq
    public final int a() {
        return this.l() ? this.c().intValue() : Integer.parseInt(this.d());
    }

    public final double b() {
        return this.l() ? this.c().doubleValue() : Double.parseDouble(this.d());
    }

    public final Number c() {
        Object object0 = this.a;
        if((object0 instanceof Number)) {
            return (Number)object0;
        }
        if((object0 instanceof String)) {
            return new gqbl(((String)object0));
        }
        throw new UnsupportedOperationException("Primitive is neither a number nor a string");
    }

    @Override  // gpzq
    public final String d() {
        Object object0 = this.a;
        if((object0 instanceof String)) {
            return (String)object0;
        }
        if(this.l()) {
            return this.c().toString();
        }
        if(this.k()) {
            return ((Boolean)object0).toString();
        }
        throw new AssertionError("Unexpected value type: " + object0.getClass());
    }

    public final BigDecimal e() {
        return (this.a instanceof BigDecimal) ? ((BigDecimal)this.a) : gqbu.a(this.d());
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            if(this.getClass() != object0.getClass()) {
                return false;
            }
            Object object1 = this.a;
            if(object1 == null) {
                return ((gpzw)object0).a == null;
            }
            if(gpzw.m(this) && gpzw.m(((gpzw)object0))) {
                return (object1 instanceof BigInteger) || (((gpzw)object0).a instanceof BigInteger) ? this.f().equals(((gpzw)object0).f()) : this.c().longValue() == ((gpzw)object0).c().longValue();
            }
            if((object1 instanceof Number)) {
                Object object2 = ((gpzw)object0).a;
                if((object2 instanceof Number)) {
                    if((object1 instanceof BigDecimal) && (object2 instanceof BigDecimal)) {
                        return this.e().compareTo(((gpzw)object0).e()) == 0;
                    }
                    double f = this.b();
                    double f1 = ((gpzw)object0).b();
                    if(f != f1) {
                        return Double.isNaN(f) ? Double.isNaN(f1) : false;
                    }
                    return true;
                }
            }
            return object1.equals(((gpzw)object0).a);
        }
        return false;
    }

    public final BigInteger f() {
        Object object0 = this.a;
        if((object0 instanceof BigInteger)) {
            return (BigInteger)object0;
        }
        return gpzw.m(this) ? BigInteger.valueOf(this.c().longValue()) : gqbu.b(this.d());
    }

    @Override  // gpzq
    public final boolean g() {
        return this.k() ? ((Boolean)this.a).booleanValue() : Boolean.parseBoolean(this.d());
    }

    @Override
    public final int hashCode() {
        long v;
        Object object0 = this.a;
        if(object0 == null) {
            return 0x1F;
        }
        if(gpzw.m(this)) {
            v = this.c().longValue();
            return (int)(v ^ v >>> 0x20);
        }
        if((object0 instanceof Number)) {
            v = Double.doubleToLongBits(this.c().doubleValue());
            return (int)(v ^ v >>> 0x20);
        }
        return object0.hashCode();
    }

    public final boolean k() {
        return this.a instanceof Boolean;
    }

    public final boolean l() {
        return this.a instanceof Number;
    }

    private static boolean m(gpzw gpzw0) {
        return (gpzw0.a instanceof Number) ? (((Number)gpzw0.a) instanceof BigInteger) || (((Number)gpzw0.a) instanceof Long) || (((Number)gpzw0.a) instanceof Integer) || (((Number)gpzw0.a) instanceof Short) || (((Number)gpzw0.a) instanceof Byte) : false;
    }
}

