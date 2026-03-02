public final class ftqk implements Runnable {
    public final ftql a;
    public final ftqf b;

    public ftqk(ftql ftql0, ftqf ftqf0) {
        this.a = ftql0;
        this.b = ftqf0;
    }

    @Override
    public final void run() {
        ftqm ftqm0 = this.a.a;
        if(!ftqm0.l) {
            ftqm0.n = null;
            return;
        }
        ftqf ftqf0 = this.b;
        ftqm0.n = ftqf0;
        ftqg ftqg0;
        while((ftqg0 = (ftqg)ftqm0.k.poll()) != null) {
            ftqm0.q(ftqf0, ftqg0);
        }
    }
}

