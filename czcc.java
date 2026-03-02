import com.google.android.gms.nearby.internal.connection.AcceptConnectionRequestParams;

public final class czcc implements azys {
    public final czdu a;
    public final String b;
    public final azyf c;

    public czcc(czdu czdu0, String s, azyf azyf0) {
        this.a = czdu0;
        this.b = s;
        this.c = azyf0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        czbf czbf0 = (czbf)object0;
        czds czds0 = new czds(this.a, ((evqp)object1));
        czaw czaw0 = new czaw(czbf0.r, this.c, czbf0.h);
        czbf0.e.add(czaw0);
        czft czft0 = (czft)czbf0.H();
        AcceptConnectionRequestParams acceptConnectionRequestParams0 = new AcceptConnectionRequestParams();
        acceptConnectionRequestParams0.a = new czbc(czds0);
        acceptConnectionRequestParams0.c = this.b;
        acceptConnectionRequestParams0.e = czaw0;
        czft0.d(acceptConnectionRequestParams0);
    }
}

