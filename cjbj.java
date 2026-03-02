public final class cjbj implements Runnable {
    public final cjbk a;
    public final int b;
    public final CharSequence c;

    public cjbj(cjbk cjbk0, int v, CharSequence charSequence0) {
        this.a = cjbk0;
        this.b = v;
        this.c = charSequence0;
    }

    @Override
    public final void run() {
        cjbq.F(this.b, this.c).showNow(this.a.a, "IdentityCheckGenericErrorDialogFragment");
    }
}

