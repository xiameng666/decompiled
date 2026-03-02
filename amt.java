import java.util.Arrays;

public final class amt {
    public final int a;
    public final CharSequence b;

    public amt(int v, CharSequence charSequence0) {
        this.a = v;
        this.b = charSequence0;
    }

    private static String a(CharSequence charSequence0) {
        return charSequence0 == null ? null : charSequence0.toString();
    }

    @Override
    public final boolean equals(Object object0) {
        if((object0 instanceof amt) && this.a == ((amt)object0).a) {
            String s = amt.a(this.b);
            String s1 = amt.a(((amt)object0).b);
            return s == null && s1 == null || s != null && s.equals(s1);
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{((int)this.a), amt.a(this.b)});
    }
}

