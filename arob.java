public final class arob implements Runnable {
    public final aroc a;
    public final String b;
    public final cuvl c;

    public arob(aroc aroc0, String s, cuvl cuvl0) {
        this.a = aroc0;
        this.b = s;
        this.c = cuvl0;
    }

    @Override
    public final void run() {
        arod arod0 = new arod(this.b, this.c);
        this.a.a.q(arod0);
    }
}

