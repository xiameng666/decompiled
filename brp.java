public final class brp implements Runnable {
    public final jqt a;

    public brp(jqt jqt0) {
        this.a = jqt0;
    }

    @Override
    public final void run() {
        Exception exception0 = new Exception("Failed to snapshot: OpenGLRenderer not ready.");
        this.a.c(exception0);
    }
}

