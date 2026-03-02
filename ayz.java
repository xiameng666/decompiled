public final class ayz implements Runnable {
    public final azc a;
    public final boolean b;

    public ayz(azc azc0, boolean z) {
        this.a = azc0;
        this.b = z;
    }

    @Override
    public final void run() {
        azc azc0 = this.a;
        boolean z = this.b;
        if(azc0.a != z) {
            azc0.a = z;
            if(!z) {
                goto label_8;
            }
            if(azc0.b) {
                azc0.c();
                return;
            label_8:
                azc0.a(new azq("The camera control has became inactive."));
            }
        }
    }
}

