import java.util.Timer;

public final class hmhc {
    public final hmhb a;
    public int b;
    private final int c;
    private Timer d;

    public hmhc(int v, hmhb hmhb0) {
        this.c = v;
        this.a = hmhb0;
        hmhe.a();
    }

    public final void a() {
        Timer timer0 = this.d;
        if(timer0 != null) {
            timer0.cancel();
        }
    }

    public final void b() {
        Timer timer0 = this.d;
        if(timer0 != null) {
            timer0.cancel();
        }
        Timer timer1 = new Timer();
        this.d = timer1;
        this.b = this.c;
        timer1.scheduleAtFixedRate(new hmha(this), 1000L, 1000L);
    }
}

