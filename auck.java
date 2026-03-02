public final class auck implements Runnable {
    public final aucp a;

    public auck(aucp aucp0) {
        this.a = aucp0;
    }

    @Override
    public final void run() {
        aucp aucp0 = this.a;
        if(aucp0.k == null) {
            return;
        }
        if(aucp0.n != null) {
            aucp0.h.n("Timeout when discovering the new endpoint of %s.", aucp0.e);
        }
        else if(aucp0.q()) {
            aucp0.h.n("Timeout when connecting to the new endpoint of %s.", aucp0.e);
        }
        else if(aucp0.p()) {
            aucp0.h.n("Timeout when joining the app on new endpoint of %s.", aucp0.e);
        }
        aucp0.n = null;
        aucp0.B(0x907);
    }
}

