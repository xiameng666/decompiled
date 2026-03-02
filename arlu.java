public final class arlu implements Runnable {
    public final arlx a;

    public arlu(arlx arlx0) {
        this.a = arlx0;
    }

    @Override
    public final void run() {
        arlx arlx0 = this.a;
        if(arlx0.f != null) {
            arlx0.c(2);
        }
    }
}

