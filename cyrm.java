public final class cyrm implements Runnable {
    public final cyrp a;
    public final cyjq b;

    public cyrm(cyrp cyrp0, cyjq cyjq0) {
        this.a = cyrp0;
        this.b = cyjq0;
    }

    @Override
    public final void run() {
        this.a.a.getContentResolver().notifyChange(cyrp.b(this.b.c), null);
    }
}

