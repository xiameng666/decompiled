public final class fefr implements Runnable {
    public final feft a;

    public fefr(feft feft0) {
        this.a = feft0;
    }

    @Override
    public final void run() {
        int v1;
        long v = hztl.a.b().a();
        switch(hztl.a.b().b()) {
            case "BALANCED": {
                v1 = 2;
                break;
            }
            case "LOW_LATENCY": {
                v1 = 3;
                break;
            }
            default: {
                v1 = 1;
            }
        }
        this.a.c = this.a.a.c(v, v1 - 1);
    }
}

