public final class bdtr implements bdtu {
    public final String a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;

    public bdtr(String s, String s1, int v) {
        if(1 == (v & 1)) {
            s = null;
        }
        this(s, s1, false, false, false, false, false);
    }

    public bdtr(String s, String s1, boolean z, boolean z1, boolean z2, boolean z3, boolean z4) {
        ibuq.f(s1, "userEmail");
        super();
        this.a = s;
        this.b = s1;
        this.c = z;
        this.d = z1;
        this.e = z2;
        this.f = z3;
        this.g = z4;
    }

    public final bdtr a() {
        return bdtr.c(this, null, false, false, false, false, false, 0x7B);
    }

    public final bdtr b() {
        return bdtr.c(this, null, false, false, false, false, true, 0x3F);
    }

    public static bdtr c(bdtr bdtr0, String s, boolean z, boolean z1, boolean z2, boolean z3, boolean z4, int v) {
        if((v & 1) != 0) {
            s = bdtr0.a;
        }
        String s1 = (v & 2) == 0 ? null : bdtr0.b;
        if((v & 4) != 0) {
            z = bdtr0.c;
        }
        if((v & 8) != 0) {
            z1 = bdtr0.d;
        }
        if((v & 16) != 0) {
            z2 = bdtr0.e;
        }
        if((v & 0x20) != 0) {
            z3 = bdtr0.f;
        }
        if((v & 0x40) != 0) {
            z4 = bdtr0.g;
        }
        ibuq.f(s1, "userEmail");
        return new bdtr(s, s1, z, z1, z2, z3, z4);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof bdtr)) {
            return false;
        }
        if(!ibuq.m(this.a, ((bdtr)object0).a)) {
            return false;
        }
        if(!ibuq.m(this.b, ((bdtr)object0).b)) {
            return false;
        }
        if(this.c != ((bdtr)object0).c) {
            return false;
        }
        if(this.d != ((bdtr)object0).d) {
            return false;
        }
        if(this.e != ((bdtr)object0).e) {
            return false;
        }
        return this.f == ((bdtr)object0).f ? this.g == ((bdtr)object0).g : false;
    }

    @Override
    public final int hashCode() {
        return this.a == null ? ((((this.b.hashCode() * 0x1F + bdtq.a(this.c)) * 0x1F + bdtq.a(this.d)) * 0x1F + bdtq.a(this.e)) * 0x1F + bdtq.a(this.f)) * 0x1F + bdtq.a(this.g) : (((((this.a.hashCode() * 0x1F + this.b.hashCode()) * 0x1F + bdtq.a(this.c)) * 0x1F + bdtq.a(this.d)) * 0x1F + bdtq.a(this.e)) * 0x1F + bdtq.a(this.f)) * 0x1F + bdtq.a(this.g);
    }

    @Override
    public final String toString() {
        return "PreviewState(avatarUrl=" + this.a + ", userEmail=" + this.b + ", loadingIndicator=" + this.c + ", showInstallPasswordManagerDialog=" + this.d + ", showNoCredentialsImportedDialog=" + this.e + ", showOnlyConflictingCredentialsImportedDialog=" + this.f + ", showGenericErrorDialog=" + this.g + ")";
    }
}

