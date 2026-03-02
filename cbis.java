public final class cbis implements Runnable {
    public final String a;
    public final cbiu b;

    public cbis(String s, cbiu cbiu0) {
        this.a = s;
        this.b = cbiu0;
    }

    @Override
    public final void run() {
        this.b.b.evaluateJavascript("window.mpb.recv(\'" + this.a + "\')", null);
    }
}

