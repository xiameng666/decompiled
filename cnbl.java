public final class cnbl implements evqc {
    @Override  // evqc
    public final void gv(Exception exception0) {
        if((exception0 instanceof RuntimeException)) {
            throw (RuntimeException)exception0;
        }
        throw new AssertionError(exception0);
    }
}

