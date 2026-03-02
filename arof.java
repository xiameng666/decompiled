import com.google.android.gms.nearby.connection.ConnectionOptions;

public final class arof implements evpo {
    public final aroh a;
    public final String b;

    public arof(aroh aroh0, String s) {
        this.a = aroh0;
        this.b = s;
    }

    @Override  // evpo
    public final Object a(evql evql0) {
        if(evql0.n()) {
            aroc aroc0 = new aroc(this.a.b, this.a.a);
            ConnectionOptions connectionOptions0 = (ConnectionOptions)evql0.j();
            return this.a.b.b.h("wifi_d2d_source", this.b, aroc0, connectionOptions0);
        }
        return evrg.c(evql0.i());
    }
}

