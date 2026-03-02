public final class cyre implements Runnable {
    public final cyrp a;
    public final String b;

    public cyre(cyrp cyrp0, String s) {
        this.a = cyrp0;
        this.b = s;
    }

    @Override
    public final void run() {
        this.a.a.getContentResolver().notifyChange(cyrp.b(this.b), null);
    }
}

