package j$.time.format;

import j..time.DateTimeException;

public final class l implements e {
    public final e a;
    public final int b;
    public final char c;

    public l(e e0, int v, char c) {
        this.a = e0;
        this.b = v;
        this.c = c;
    }

    @Override  // j$.time.format.e
    public final boolean g(x x0, StringBuilder stringBuilder0) {
        int v = stringBuilder0.length();
        if(!this.a.g(x0, stringBuilder0)) {
            return false;
        }
        int v2 = stringBuilder0.length() - v;
        int v3 = this.b;
        if(v2 > v3) {
            throw __alloc_invoke__ DateTimeException, RuntimeException("Cannot print as output of " + v2 + " characters exceeds pad width of " + v3);  // Mismatched object-allocation/constructor-invocation, likely indicating an inlined constructor call
        }
        for(int v1 = 0; v1 < v3 - v2; ++v1) {
            stringBuilder0.insert(v, this.c);
        }
        return true;
    }

    @Override  // j$.time.format.e
    public final int i(v v0, CharSequence charSequence0, int v1) {
        boolean z = v0.c;
        if(v1 > charSequence0.length()) {
            throw new IndexOutOfBoundsException();
        }
        if(v1 == charSequence0.length()) {
            return ~v1;
        }
        int v2 = this.b + v1;
        if(v2 > charSequence0.length()) {
            if(z) {
                return ~v1;
            }
            v2 = charSequence0.length();
        }
        int v3;
        for(v3 = v1; v3 < v2 && v0.a(charSequence0.charAt(v3), this.c); ++v3) {
        }
        CharSequence charSequence1 = charSequence0.subSequence(0, v2);
        int v4 = this.a.i(v0, charSequence1, v3);
        return v4 == v2 || !z ? v4 : ~(v1 + v3);
    }

    @Override
    public final String toString() {
        String s = String.valueOf(this.a);
        return this.c == 0x20 ? "Pad(" + s + "," + this.b + ")" : "Pad(" + s + "," + this.b + (",\'" + this.c + "\')");
    }
}

