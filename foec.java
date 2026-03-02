public final class foec {
    public final String a;
    public final boolean b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final boolean g;
    public final String h;
    public final String i;
    public final int j;
    public final int k;
    private final int l;

    public foec() {
        throw null;
    }

    public foec(String s, boolean z, String s1, String s2, String s3, String s4, boolean z1, int v, int v1, String s5, String s6, int v2) {
        this.a = s;
        this.b = z;
        this.c = s1;
        this.d = s2;
        this.e = s3;
        this.f = s4;
        this.g = z1;
        this.j = v;
        this.k = v1;
        this.h = s5;
        this.i = s6;
        this.l = v2;
    }

    public static foea a() {
        foea foea0 = new foea();
        foea0.c(false);
        foea0.e(1);
        foea0.d(true);
        foea0.h = 1;
        foea0.g = 1;
        return foea0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if((object0 instanceof foec) && this.a.equals(((foec)object0).a) && this.b == ((foec)object0).b) {
            String s = this.c;
            if(s != null) {
                if(s.equals(((foec)object0).c)) {
                label_8:
                    String s1 = this.d;
                    if(s1 != null) {
                        if(s1.equals(((foec)object0).d)) {
                        label_13:
                            String s2 = this.e;
                            if(s2 != null) {
                                if(s2.equals(((foec)object0).e)) {
                                label_18:
                                    String s3 = this.f;
                                    if(s3 != null) {
                                        if(s3.equals(((foec)object0).f)) {
                                        label_23:
                                            if(this.g == ((foec)object0).g) {
                                                int v = this.j;
                                                int v1 = ((foec)object0).j;
                                                if(v == 0) {
                                                    throw null;
                                                }
                                                if(v == v1) {
                                                    int v2 = this.k;
                                                    int v3 = ((foec)object0).k;
                                                    if(v2 == 0) {
                                                        throw null;
                                                    }
                                                    if(v2 == v3) {
                                                        String s4 = this.h;
                                                        if(s4 != null) {
                                                            if(s4.equals(((foec)object0).h)) {
                                                            label_37:
                                                                String s5 = this.i;
                                                                if(s5 != null) {
                                                                    if(s5.equals(((foec)object0).i)) {
                                                                    label_42:
                                                                        int v4 = this.l;
                                                                        int v5 = ((foec)object0).l;
                                                                        if(v4 != 0) {
                                                                            return v4 == v5;
                                                                        }
                                                                        throw null;
                                                                    }
                                                                }
                                                                else if(((foec)object0).i == null) {
                                                                    goto label_42;
                                                                }
                                                            }
                                                        }
                                                        else if(((foec)object0).h == null) {
                                                            goto label_37;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    else if(((foec)object0).f == null) {
                                        goto label_23;
                                    }
                                }
                            }
                            else if(((foec)object0).e == null) {
                                goto label_18;
                            }
                        }
                    }
                    else if(((foec)object0).d == null) {
                        goto label_13;
                    }
                }
            }
            else if(((foec)object0).c == null) {
                goto label_8;
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode() ^ 1000003;
        int v1 = 0;
        int v2 = this.c == null ? 0 : this.c.hashCode();
        int v3 = 0x4D5;
        int v4 = this.b ? 0x4CF : 0x4D5;
        int v5 = this.d == null ? 0 : this.d.hashCode();
        int v6 = this.e == null ? 0 : this.e.hashCode();
        int v7 = this.f == null ? 0 : this.f.hashCode();
        if(this.g) {
            v3 = 0x4CF;
        }
        foeb.b(this.j);
        foeb.b(this.k);
        int v8 = ((((((((v * 1000003 ^ v4) * 1000003 ^ v2) * 1000003 ^ v5) * 1000003 ^ v6) * 1000003 ^ v7) * 1000003 ^ v3) * 1000003 ^ this.j) * 1000003 ^ this.k) * 1000003;
        int v9 = this.h == null ? 0 : this.h.hashCode();
        String s = this.i;
        if(s != null) {
            v1 = s.hashCode();
        }
        int v10 = this.l;
        if(v10 != 0) {
            return v10 ^ ((v8 ^ v9) * 1000003 ^ v1) * 1000003;
        }
        throw null;
    }

    @Override
    public final String toString() {
        switch(this.l) {
            case 1: {
                return "GoogleOwner{accountName=" + this.a + ", isMetadataAvailable=" + this.b + ", displayName=" + this.c + ", givenName=" + this.d + ", familyName=" + this.e + ", obfuscatedGaiaId=" + this.f + ", isG1User=" + this.g + ", isDasherUser=" + foeb.a(this.j) + ", isUnicornUser=" + foeb.a(this.k) + ", avatarUrl=" + this.h + ", defaultAvatarUrl=" + this.i + ", ageRange=" + "UNKNOWN" + "}";
            }
            case 2: {
                return "GoogleOwner{accountName=" + this.a + ", isMetadataAvailable=" + this.b + ", displayName=" + this.c + ", givenName=" + this.d + ", familyName=" + this.e + ", obfuscatedGaiaId=" + this.f + ", isG1User=" + this.g + ", isDasherUser=" + foeb.a(this.j) + ", isUnicornUser=" + foeb.a(this.k) + ", avatarUrl=" + this.h + ", defaultAvatarUrl=" + this.i + ", ageRange=" + "LESS_THAN_EIGHTEEN" + "}";
            }
            case 3: {
                return "GoogleOwner{accountName=" + this.a + ", isMetadataAvailable=" + this.b + ", displayName=" + this.c + ", givenName=" + this.d + ", familyName=" + this.e + ", obfuscatedGaiaId=" + this.f + ", isG1User=" + this.g + ", isDasherUser=" + foeb.a(this.j) + ", isUnicornUser=" + foeb.a(this.k) + ", avatarUrl=" + this.h + ", defaultAvatarUrl=" + this.i + ", ageRange=" + "EIGHTEEN_TO_TWENTY" + "}";
            }
            case 4: {
                return "GoogleOwner{accountName=" + this.a + ", isMetadataAvailable=" + this.b + ", displayName=" + this.c + ", givenName=" + this.d + ", familyName=" + this.e + ", obfuscatedGaiaId=" + this.f + ", isG1User=" + this.g + ", isDasherUser=" + foeb.a(this.j) + ", isUnicornUser=" + foeb.a(this.k) + ", avatarUrl=" + this.h + ", defaultAvatarUrl=" + this.i + ", ageRange=" + "TWENTY_ONE_OR_OLDER" + "}";
            }
            default: {
                return "GoogleOwner{accountName=" + this.a + ", isMetadataAvailable=" + this.b + ", displayName=" + this.c + ", givenName=" + this.d + ", familyName=" + this.e + ", obfuscatedGaiaId=" + this.f + ", isG1User=" + this.g + ", isDasherUser=" + foeb.a(this.j) + ", isUnicornUser=" + foeb.a(this.k) + ", avatarUrl=" + this.h + ", defaultAvatarUrl=" + this.i + ", ageRange=" + "null" + "}";
            }
        }
    }
}

