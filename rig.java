public final class rig implements Runnable {
    public final rip a;
    public final rio b;

    public rig(rip rip0, rio rio0) {
        this.a = rip0;
        this.b = rio0;
    }

    @Override
    public final void run() {
        rip rip0 = this.a;
        rip0.a.lock();
        rio rio0 = this.b;
        try {
            new rhf(rip0.b, rio0.e, rio0.f);
            throw new UnsupportedOperationException("Not implemented yet");
        }
        catch(rhb rhb0) {
            rie rie0 = new rie(rhb0);
            ((eonu)rio0.i).b(rie0);
        }
        finally {
            rip0.a.unlock();
        }
    }
}

