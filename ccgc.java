public final class ccgc implements gftc {
    public final String a;
    public final cccq b;
    public final int c;

    public ccgc(String s, cccq cccq0, int v) {
        this.a = s;
        this.b = cccq0;
        this.c = v;
    }

    @Override  // gftc
    public final boolean a(Object object0) {
        return ((fnan)object0).f.equals(this.a) ? ((ProtoLiteMessage)(((fnan)object0).c == 13 ? ((fnah)((fnan)object0).d) : fnah.a)).equals(this.b.c()) && ((fnan)object0).g == this.c : false;
    }
}

