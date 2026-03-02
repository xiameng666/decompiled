import com.google.android.gms.nearby.internal.connection.SetDownloadsDirectoryParams;

public final class czcp implements azys {
    public final czdu a;
    public final String b;

    public czcp(czdu czdu0, String s) {
        this.a = czdu0;
        this.b = s;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        czbf czbf0 = (czbf)object0;
        czds czds0 = new czds(this.a, ((evqp)object1));
        czft czft0 = (czft)czbf0.H();
        SetDownloadsDirectoryParams setDownloadsDirectoryParams0 = new SetDownloadsDirectoryParams();
        setDownloadsDirectoryParams0.a = new czak(czbf0, czds0, this.b);
        setDownloadsDirectoryParams0.b = this.b;
        czft0.s(setDownloadsDirectoryParams0);
    }
}

