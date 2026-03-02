public final class dvol implements Runnable {
    public final dvom a;
    public final String[] b;

    public dvol(dvom dvom0, String[] arr_s) {
        this.a = dvom0;
        this.b = arr_s;
    }

    @Override
    public final void run() {
        this.a.a.a(this.b);
    }
}

