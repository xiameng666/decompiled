public final class azks {
    public final azkp a;
    public final int b;
    public final int c;

    public azks() {
        throw null;
    }

    public azks(azkp azkp0, int v, int v1) {
        this.a = azkp0;
        this.b = v;
        this.c = v1;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof azks) && this.a.equals(((azks)object0).a) && this.b == ((azks)object0).b && this.c == ((azks)object0).c;
    }

    @Override
    public final int hashCode() {
        return this.c ^ ((this.a.hashCode() ^ 1000003) * 1000003 ^ this.b) * 1000003;
    }

    @Override
    public final String toString() {
        return "ReportKey{projectKey=" + this.a.toString() + ", metricId=" + this.b + ", reportId=" + this.c + "}";
    }
}

