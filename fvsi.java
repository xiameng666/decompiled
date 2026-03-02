public final class fvsi {
    public final String a;
    public final Thread b;

    public fvsi(String s) {
        this(s, Thread.currentThread());
    }

    public fvsi(String s, Thread thread0) {
        this.a = s;
        this.b = thread0;
    }

    public final void a() {
        if(huvd.t()) {
            Thread thread0 = this.b;
            Thread thread1 = Thread.currentThread();
            if(thread0.getId() != thread1.getId()) {
                throw new fvsj(this.a, thread0, thread1);
            }
        }
    }
}

