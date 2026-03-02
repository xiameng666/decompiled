package j$.time.format;

public final class m extends n {
    @Override  // j$.time.format.n
    public final boolean b(char c, char c1) {
        return v.b(c, c1);
    }

    @Override  // j$.time.format.n
    public final n d(String s, String s1, n n0) {
        return __alloc_invoke__ m, n(s, s1, n0);  // Mismatched object-allocation/constructor-invocation, likely indicating an inlined constructor call
    }

    @Override  // j$.time.format.n
    public final boolean e(CharSequence charSequence0, int v, int v1) {
        int v2 = this.a.length();
        if(v2 > v1 - v) {
            return false;
        }
        for(int v3 = 0; v2 > 0; ++v3) {
            if(!v.b(this.a.charAt(v3), charSequence0.charAt(v))) {
                return false;
            }
            ++v;
            --v2;
        }
        return true;
    }
}

