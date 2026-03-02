public final class fclc implements evqc {
    public final fcln a;

    public fclc(fcln fcln0) {
        this.a = fcln0;
    }

    @Override  // evqc
    public final void gv(Exception exception0) {
        fcln.a.g("Failed to get restore state. Fallback to start restore flow", exception0, new Object[0]);
        this.a.b(fclm.a);
    }
}

