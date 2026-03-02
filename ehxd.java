public final class ehxd implements Runnable {
    public final ehxh a;

    public ehxd(ehxh ehxh0) {
        this.a = ehxh0;
    }

    @Override
    public final void run() {
        this.a.b = false;
        ehws ehws0 = new ehws(null);
        ehws0.b(ehwt.e);
        ehwv ehwv0 = ehws0.a();
        this.a.a.ii(ehwv0);
    }
}

