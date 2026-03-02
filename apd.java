import java.util.List;

public final class apd implements Runnable {
    public final aqi a;
    public final String b;
    public final bmb c;
    public final bnc d;
    public final bmi e;
    public final List f;

    public apd(aqi aqi0, String s, bmb bmb0, bnc bnc0, bmi bmi0, List list0) {
        this.a = aqi0;
        this.b = s;
        this.c = bmb0;
        this.d = bnc0;
        this.e = bmi0;
        this.f = list0;
    }

    @Override
    public final void run() {
        aqi aqi0 = this.a;
        aqi0.O();
        aqi0.a.i(this.b, this.c, this.d, this.e, this.f);
        aqi0.m();
        aqi0.N();
        aqi0.C();
        if(aqi0.A == 10) {
            aqi0.w();
        }
    }
}

