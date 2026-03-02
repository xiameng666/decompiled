public final class cqhw implements evqc {
    @Override  // evqc
    public final void gv(Exception exception0) {
        if((exception0 instanceof aztg)) {
            a.ae(cqhx.a.j(), "SPOT API unavailable.", exception0);
            return;
        }
        a.ae(cqhx.a.j(), "Failed to update FMD enabled state.", exception0);
    }
}

