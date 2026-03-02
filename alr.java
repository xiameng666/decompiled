public final class alr implements Runnable {
    public final amf a;
    public final int b;
    public final CharSequence c;

    public alr(amf amf0, int v, CharSequence charSequence0) {
        this.a = amf0;
        this.b = v;
        this.c = charSequence0;
    }

    @Override
    public final void run() {
        this.a.a.a().a(this.b, this.c);
    }
}

