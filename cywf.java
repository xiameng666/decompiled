public final class cywf implements Runnable {
    public final cyww a;

    public cywf(cyww cyww0) {
        this.a = cyww0;
    }

    @Override
    public final void run() {
        cyww cyww0 = this.a;
        cyck cyck0 = cyww0.i();
        if(cyck0 == null) {
            cyjh.a.g().B("%s: Failed to get leAudioProfileWrapper for updateCachedTempBondDevices!", "TempBondManager");
            return;
        }
        cyww0.k(cyck0);
    }
}

