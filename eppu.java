public final class eppu implements Runnable {
    public final String a;

    public eppu(String s) {
        this.a = s;
    }

    @Override
    public final void run() {
        epqa.a.m("Loading url=%s in the webview", new Object[]{this.a});
    }
}

