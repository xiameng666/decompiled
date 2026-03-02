public final class aatr implements Runnable {
    public final aatv a;

    public aatr(aatv aatv0) {
        this.a = aatv0;
    }

    @Override
    public final void run() {
        aatv aatv0 = this.a;
        zlg zlg0 = aatv0.e;
        if(zlg0 == null) {
            ibuq.j("resourceRepository");
            zlg0 = null;
        }
        zlg0.c(aatv0.a, aatv0.b, aatv0.c);
    }
}

