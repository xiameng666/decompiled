public final class cqtj implements Runnable {
    public final cqtn a;

    public cqtj(cqtn cqtn0) {
        this.a = cqtn0;
    }

    @Override
    public final void run() {
        cqtn cqtn0 = this.a;
        byte[] arr_b = cqtn0.f;
        if(arr_b != null) {
            cqtn0.c(arr_b, cqtn0.m);
        }
    }
}

