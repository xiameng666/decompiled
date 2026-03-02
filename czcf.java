import com.google.android.gms.nearby.connection.ConnectionOptions;

public final class czcf implements azys {
    public final String a;
    public final cuwd b;
    public final azyf c;
    public final ConnectionOptions d;

    public czcf(String s, cuwd cuwd0, azyf azyf0, ConnectionOptions connectionOptions0) {
        this.a = s;
        this.b = cuwd0;
        this.c = azyf0;
        this.d = connectionOptions0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        czdq czdq0 = new czdq(((evqp)object1));
        com.google.android.gms.nearby.internal.connection.ConnectionOptions connectionOptions0 = com.google.android.gms.nearby.internal.connection.ConnectionOptions.a(this.d);
        ((czbf)object0).W(czdq0, this.a, null, this.b, this.c, connectionOptions0);
    }
}

