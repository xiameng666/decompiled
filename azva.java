import com.google.android.gms.common.ConnectionResult;

public final class azva {
    public final bxd a;
    public final evqp b;
    private final bxd c;
    private int d;
    private boolean e;

    public azva(Iterable iterable0) {
        this.c = new bxd();
        this.b = new evqp();
        this.e = false;
        this.a = new bxd();
        for(Object object0: iterable0) {
            azux azux0 = ((aztx)object0).ga();
            this.a.put(azux0, null);
        }
        this.d = this.a.d_num;
    }

    public final void a(azux azux0, ConnectionResult connectionResult0, String s) {
        bxd bxd0 = this.a;
        bxd0.put(azux0, connectionResult0);
        bxd bxd1 = this.c;
        bxd1.put(azux0, s);
        --this.d;
        if(!connectionResult0.d()) {
            this.e = true;
        }
        if(this.d == 0) {
            if(this.e) {
                aztg aztg0 = new aztg(bxd0);
                this.b.a(aztg0);
                return;
            }
            this.b.b(bxd1);
        }
    }
}

