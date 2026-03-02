import com.google.android.gms.nearby.connection.ConnectionOptions;

public final class czbg implements azys {
    public final String a;
    public final cuwd b;
    public final cuwd c;
    public final azyf d;
    public final ConnectionOptions e;

    public czbg(String s, cuwd cuwd0, cuwd cuwd1, azyf azyf0, ConnectionOptions connectionOptions0) {
        this.a = s;
        this.b = cuwd0;
        this.c = cuwd1;
        this.d = azyf0;
        this.e = connectionOptions0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        czdq czdq0 = new czdq(((evqp)object1));
        byte[] arr_b = this.b.g();
        com.google.android.gms.nearby.internal.connection.ConnectionOptions connectionOptions0 = com.google.android.gms.nearby.internal.connection.ConnectionOptions.a(this.e);
        ((czbf)object0).W(czdq0, this.a, arr_b, this.c, this.d, connectionOptions0);
    }
}

