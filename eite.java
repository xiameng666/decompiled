public final class eite {
    public final String a;
    public final String b;
    public final int c;
    public final long d;
    public final String e;
    public final String f;
    public final String g;
    public final boolean h;
    public final long i;
    public final long j;
    public final long k;
    public final boolean l;

    public eite() {
        throw null;
    }

    public eite(String s, String s1, int v, long v1, String s2, String s3, String s4, boolean z, long v2, long v3, long v4, boolean z1) {
        if(s == null) {
            throw new NullPointerException("Null user");
        }
        this.a = s;
        if(s1 == null) {
            throw new NullPointerException("Null source");
        }
        this.b = s1;
        this.c = v;
        this.d = v1;
        if(s2 == null) {
            throw new NullPointerException("Null configHash");
        }
        this.e = s2;
        if(s3 == null) {
            throw new NullPointerException("Null target");
        }
        this.f = s3;
        if(s4 == null) {
            throw new NullPointerException("Null committedConfigHash");
        }
        this.g = s4;
        this.h = z;
        this.i = v2;
        this.j = v3;
        this.k = v4;
        this.l = z1;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof eite) && this.a.equals(((eite)object0).a) && this.b.equals(((eite)object0).b) && this.c == ((eite)object0).c && this.d == ((eite)object0).d && this.e.equals(((eite)object0).e) && this.f.equals(((eite)object0).f) && this.g.equals(((eite)object0).g) && this.h == ((eite)object0).h && this.i == ((eite)object0).i && this.j == ((eite)object0).j && this.k == ((eite)object0).k && this.l == ((eite)object0).l;
    }

    @Override
    public final int hashCode() {
        int v = 0x4D5;
        int v1 = (((((((((((this.a.hashCode() ^ 1000003) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c) * 1000003 ^ ((int)(this.d ^ this.d >>> 0x20))) * 1000003 ^ this.e.hashCode()) * 1000003 ^ this.f.hashCode()) * 1000003 ^ this.g.hashCode()) * 1000003 ^ (this.h ? 0x4CF : 0x4D5)) * 1000003 ^ ((int)(this.i ^ this.i >>> 0x20))) * 1000003 ^ ((int)(this.j ^ this.j >>> 0x20))) * 1000003 ^ ((int)(this.k ^ this.k >>> 0x20))) * 1000003;
        if(this.l) {
            v = 0x4CF;
        }
        return v1 ^ v;
    }

    @Override
    public final String toString() {
        return "ParsedSnapshotToken{user=" + this.a + ", source=" + this.b + ", version=" + this.c + ", changeCount=" + this.d + ", configHash=" + this.e + ", target=" + this.f + ", committedConfigHash=" + this.g + ", isDeltaOrDidNotSpecify=" + this.h + ", experimentStateToCommit=" + this.i + ", committedExperimentState=" + this.j + ", latestExperimentState=" + this.k + ", phixitToken=" + this.l + "}";
    }
}

