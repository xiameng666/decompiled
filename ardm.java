public final class ardm implements Runnable {
    public final argf a;

    public ardm(argf argf0) {
        this.a = argf0;
    }

    @Override
    public final void run() {
        aqql aqql0 = argf.a;
        aqql0.d("The user has been authenticated via lock screen.", new Object[0]);
        argf argf0 = this.a;
        int v = argf0.j;
        if(v != 0) {
            switch(v) {
                case 3: {
                    argf0.j = 4;
                    argf0.r.d();
                    return;
                }
                case 5: {
                    aqql0.j("proceedAfterScreenUnlock was called after the cable was unplugged, not proceeding with authorization.", new Object[0]);
                    return;
                }
                default: {
                    aqql0.d("proceedAfterScreenUnlock was called in an unexpected state: %d", new Object[]{v});
                    return;
                }
            }
        }
        aqql0.j("Expected state: AUTHORIZATION_REQUESTED, reported state: INITIAL. Changing state to AWAITING_USB.", new Object[0]);
        argf0.j = 5;
        argf0.e();
    }
}

