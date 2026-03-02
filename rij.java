public final class rij implements Runnable {
    public final rip a;
    public final rin b;

    public rij(rip rip0, rin rin0) {
        this.a = rip0;
        this.b = rin0;
    }

    @Override
    public final void run() {
        rip rip0 = this.a;
        rip0.a.lock();
        rin rin0 = this.b;
        try {
            new rhf(rip0.b, rin0.a, rin0.b);
            throw new UnsupportedOperationException("Not implemented yet");
        }
        catch(rhb rhb0) {
            rie rie0 = new rie(rhb0);
            ((eont)rin0.e).b(rie0);
        }
        finally {
            rip0.a.unlock();
        }
    }
}

