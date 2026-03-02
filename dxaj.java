public final class dxaj {
    public String a;
    public String b;
    public String c;
    public String d;

    public dxaj(String s, String s1) {
        ibuq.f(s, "cardTitle");
        ibuq.f(s1, "cardDescription");
        super();
        this.a = s;
        this.b = s1;
        this.c = null;
        this.d = null;
    }

    public final void a(String s) {
        ibuq.f(s, "<set-?>");
        this.b = s;
    }

    public final void b(String s) {
        ibuq.f(s, "<set-?>");
        this.a = s;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof dxaj)) {
            return false;
        }
        if(!ibuq.m(this.a, ((dxaj)object0).a)) {
            return false;
        }
        if(!ibuq.m(this.b, ((dxaj)object0).b)) {
            return false;
        }
        return ibuq.m(this.c, ((dxaj)object0).c) ? ibuq.m(this.d, ((dxaj)object0).d) : false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode() * 0x1F + this.b.hashCode();
        int v1 = 0;
        int v2 = this.c == null ? 0 : this.c.hashCode();
        String s = this.d;
        if(s != null) {
            v1 = s.hashCode();
        }
        return (v * 0x1F + v2) * 0x1F + v1;
    }

    @Override
    public final String toString() {
        return "PassNameAndDescription(cardTitle=" + this.a + ", cardDescription=" + this.b + ", validationTitleError=" + this.c + ", validationDescriptionError=" + this.d + ")";
    }
}

