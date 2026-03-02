import j..util.Objects;
import java.util.List;

public final class blzn implements blzl {
    public final blzo a;
    public final byte[] b;
    private final String c;

    public blzn(blzo blzo0, String s, byte[] arr_b) {
        gftb.check(blzo0);
        this.a = blzo0;
        gftb.check(s);
        this.c = s;
        gftb.check(arr_b);
        this.b = arr_b;
    }

    @Override  // blzl
    public final blzo a() {
        return this.a;
    }

    @Override  // blzl
    public final String b() {
        gfss gfss0 = gfss.d('.');
        String s = ghjc.d.o(this.b);
        return gfss0.g(Byte.valueOf(this.a.d), s, new Object[]{this.c});
    }

    public static blzn c(String s, blzp blzp0) {
        return new blzn(blzp0.a(), s, blzp0.d());
    }

    public static blzn d(String s) {
        blzo blzo0;
        List list0 = gfud.e('.').c(3).n(s);
        gftb.b(list0.size() == 3, "Invalid credential identifier.");
        try {
            blzo0 = blzo.a(Byte.parseByte(((String)list0.get(0))));
        }
        catch(NumberFormatException numberFormatException0) {
            throw new IllegalArgumentException("Key type is not a decimal byte value.", numberFormatException0);
        }
        String s1 = (String)list0.get(2);
        CharSequence charSequence0 = (CharSequence)list0.get(1);
        return new blzn(blzo0, s1, ghjc.d.q(charSequence0));
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof blzn) ? this.b().equals(((blzl)object0).b()) : false;
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{this.b()});
    }

    @Override
    public final String toString() {
        return this.b();
    }
}

