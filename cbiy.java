public final class cbiy implements Runnable {
    public final String a;
    public final cbiz b;

    public cbiy(String s, cbiz cbiz0) {
        this.a = s;
        this.b = cbiz0;
    }

    @Override
    public final void run() {
        this.b.a.evaluateJavascript(this.a, null);
    }
}

