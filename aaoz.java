public final class aaoz {
    public final String a;
    public final grwd b;
    public final String c;
    public final grxw d;

    public aaoz() {
        throw null;
    }

    public aaoz(String s, grwd grwd0, String s1, grxw grxw0) {
        if(s == null) {
            throw new NullPointerException("Null title");
        }
        this.a = s;
        this.b = grwd0;
        this.c = s1;
        if(grxw0 == null) {
            throw new NullPointerException("Null resourceKey");
        }
        this.d = grxw0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if((object0 instanceof aaoz) && this.a.equals(((aaoz)object0).a)) {
            grwd grwd0 = this.b;
            if(grwd0 != null) {
                if(grwd0.equals(((aaoz)object0).b)) {
                label_8:
                    String s = this.c;
                    if(s == null) {
                        return ((aaoz)object0).c == null ? ((ProtoLiteMessage)this.d).equals(((aaoz)object0).d) : false;
                    }
                    return s.equals(((aaoz)object0).c) ? ((ProtoLiteMessage)this.d).equals(((aaoz)object0).d) : false;
                }
            }
            else if(((aaoz)object0).b == null) {
                goto label_8;
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode() ^ 1000003;
        int v1 = 0;
        int v2 = this.b == null ? 0 : this.b.hashCode();
        String s = this.c;
        if(s != null) {
            v1 = s.hashCode();
        }
        grxw grxw0 = this.d;
        if(((ProtoLiteMessage)grxw0).isImmutable()) {
            return ((ProtoLiteMessage)grxw0).s() ^ ((v * 1000003 ^ v2) * 1000003 ^ v1) * 1000003;
        }
        int v3 = grxw0.memoizedHashCode;
        if(v3 == 0) {
            v3 = ((ProtoLiteMessage)grxw0).s();
            grxw0.memoizedHashCode = v3;
        }
        return v3 ^ ((v * 1000003 ^ v2) * 1000003 ^ v1) * 1000003;
    }

    @Override
    public final String toString() {
        return "PageItem{title=" + this.a + ", icon=" + this.b + ", iconUrl=" + this.c + ", resourceKey=" + this.d.toString() + "}";
    }
}

