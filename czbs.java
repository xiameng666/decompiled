import com.google.android.gms.nearby.internal.connection.SendConnectionRequestParams;

public final class czbs implements azys {
    public final czdu a;
    public final String b;
    public final String c;
    public final azyf d;

    public czbs(czdu czdu0, String s, String s1, azyf azyf0) {
        this.a = czdu0;
        this.b = s;
        this.c = s1;
        this.d = azyf0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        czbf czbf0 = (czbf)object0;
        czds czds0 = new czds(this.a, ((evqp)object1));
        cyzp cyzp0 = new cyzp(this.d);
        czbf0.f.add(cyzp0);
        czft czft0 = (czft)czbf0.H();
        SendConnectionRequestParams sendConnectionRequestParams0 = new SendConnectionRequestParams();
        sendConnectionRequestParams0.a = new czbc(czds0);
        sendConnectionRequestParams0.d = this.b;
        sendConnectionRequestParams0.e = this.c;
        sendConnectionRequestParams0.g = cyzp0;
        czft0.n(sendConnectionRequestParams0);
    }
}

