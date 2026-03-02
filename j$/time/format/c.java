package j$.time.format;

public final class c implements e {
    public final char a;

    public c(char c) {
        this.a = c;
    }

    @Override  // j$.time.format.e
    public final boolean g(x x0, StringBuilder stringBuilder0) {
        stringBuilder0.append(this.a);
        return true;
    }

    @Override  // j$.time.format.e
    public final int i(v v0, CharSequence charSequence0, int v1) {
        if(v1 == charSequence0.length()) {
            return ~v1;
        }
        int v2 = charSequence0.charAt(v1);
        return v2 == this.a || !v0.b && (Character.toUpperCase(((char)v2)) == Character.toUpperCase(this.a) || Character.toLowerCase(((char)v2)) == Character.toLowerCase(this.a)) ? v1 + 1 : ~v1;
    }

    @Override
    public final String toString() {
        return this.a == 39 ? "\'\'" : "\'" + this.a + "\'";
    }
}

