public final class ehhu {
    public Thread a;
    public final ehhs b;
    public final ehic c;
    public final egzp d;

    public ehhu(ehhs ehhs0, egzp egzp0, ehic ehic0) {
        this.b = ehhs0;
        this.d = egzp0;
        this.c = ehic0;
    }

    public final void a() {
        Thread thread0 = this.a;
        if(thread0 != null) {
            egig.m("FSA2_AsyncDataPopulator", "Thread was not removed correctly: %d", new Object[]{thread0.getId()});
            this.a = null;
        }
        this.b.getClass();
        this.a = new Thread(new ehht(this));
        this.d.a(this.a);
        this.a.start();
    }

    static void b(ehhu ehhu0) {
        ehhu0.a = null;
    }
}

