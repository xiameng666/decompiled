import java.util.Objects;

public final class apf implements Runnable {
    public final aqi a;
    public final jqt b;

    public apf(aqi aqi0, jqt jqt0) {
        this.a = aqi0;
        this.b = jqt0;
    }

    @Override
    public final void run() {
        aqi aqi0 = this.a;
        boolean z = true;
        if(aqi0.m == null) {
            aqi0.m = aqi0.A == 1 ? bpt.b(null) : jqy.a(new apb(aqi0));
        }
        gmcd gmcd0 = aqi0.m;
        int v = aqi0.A - 1;
        if(aqi0.A == 0) {
            throw null;
        }
        switch(v) {
            case 2: 
            case 3: 
            case 4: {
                if(aqi0.i != null) {
                    z = false;
                }
                kay.c(z);
                aqi0.J(2);
                kay.c(aqi0.I());
                aqi0.o();
                break;
            }
            case 1: 
            case 5: 
            case 6: 
            case 7: 
            case 8: {
                if(!aqi0.g.c() && !aqi0.z.b()) {
                    z = false;
                }
                aqi0.z.a();
                aqi0.J(2);
                if(z) {
                    kay.c(aqi0.I());
                    aqi0.o();
                }
                break;
            }
            case 9: {
                aqi0.J(2);
                aqi0.M();
                break;
            }
            default: {
                Objects.toString(aqc.a(aqi0.A));
                aqi0.O();
            }
        }
        bpt.k(gmcd0, this.b);
    }
}

