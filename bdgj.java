import java.util.Arrays;

public final class bdgj implements ibts {
    public final String a;

    public bdgj(String s) {
        this.a = s;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        heqb heqb0 = ((bedg)object0).e;
        String s = "";
        String s1 = (heqb0.b & 4) == 0 ? "" : heqb0.e;
        ibuq.c(s1);
        String s2 = (heqb0.b & 0x20) == 0 ? "" : heqb0.g;
        ibuq.c(s2);
        if((heqb0.b & 0x80) != 0) {
            s = heqb0.i;
        }
        ibuq.c(s);
        String s3 = bgms.b((heqb0.u == null ? heqa.a : heqb0.u));
        String s4 = bglt.a(s2);
        String s5 = bglt.a(s);
        String s6 = bglt.a(s3);
        Object object1 = String.format("%s,%s,%s,%s,%s\n", Arrays.copyOf(new Object[]{this.a, s1, s4, s5, s6}, 5));
        ibuq.e(object1, "format(...)");
        return object1;
    }
}

