import com.google.android.gms.nearby.connection.ConnectionListeningOptions;
import com.google.android.gms.nearby.internal.connection.StartListeningParams;

public final class czbl implements azys {
    public final String a;
    public final azyf b;
    public final ConnectionListeningOptions c;

    public czbl(String s, azyf azyf0, ConnectionListeningOptions connectionListeningOptions0) {
        this.a = s;
        this.b = azyf0;
        this.c = connectionListeningOptions0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        czdr czdr0 = new czdr(((evqp)object1));
        com.google.android.gms.nearby.internal.connection.ConnectionListeningOptions connectionListeningOptions0 = new com.google.android.gms.nearby.internal.connection.ConnectionListeningOptions();
        ConnectionListeningOptions connectionListeningOptions1 = this.c;
        connectionListeningOptions0.a = connectionListeningOptions1.a;
        connectionListeningOptions0.b = connectionListeningOptions1.b;
        connectionListeningOptions0.c = connectionListeningOptions1.c;
        connectionListeningOptions0.d = connectionListeningOptions1.d;
        connectionListeningOptions0.f = connectionListeningOptions1.f;
        connectionListeningOptions0.g = connectionListeningOptions1.g;
        connectionListeningOptions0.h = connectionListeningOptions1.h;
        connectionListeningOptions0.i = connectionListeningOptions1.i;
        connectionListeningOptions0.j = connectionListeningOptions1.j;
        connectionListeningOptions0.l = connectionListeningOptions1.l;
        connectionListeningOptions0.m = connectionListeningOptions1.m;
        connectionListeningOptions0.n = connectionListeningOptions1.n;
        connectionListeningOptions0.o = connectionListeningOptions1.o;
        int[] arr_v = connectionListeningOptions1.e;
        if(arr_v != null) {
            connectionListeningOptions0.e = arr_v;
        }
        int[] arr_v1 = connectionListeningOptions1.k;
        if(arr_v1 != null) {
            connectionListeningOptions0.k = arr_v1;
        }
        cyzw cyzw0 = new cyzw(this.b);
        ((czbf)object0).g.add(cyzw0);
        czft czft0 = (czft)((czbf)object0).H();
        StartListeningParams startListeningParams0 = new StartListeningParams();
        startListeningParams0.a = new czbc(new cyyq(((czbf)object0)));
        startListeningParams0.e = new czge(czdr0);
        startListeningParams0.b = this.a;
        startListeningParams0.c = connectionListeningOptions0;
        startListeningParams0.d = cyzw0;
        czft0.x(startListeningParams0);
    }
}

