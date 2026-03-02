import com.google.android.gms.nearby.internal.connection.RejectConnectionRequestParams;

public final class czcl implements czdn {
    public final String a;

    public czcl(String s) {
        this.a = s;
    }

    @Override  // czdn
    public final void a(czbf czbf0, azvd azvd0) {
        czft czft0 = (czft)czbf0.H();
        RejectConnectionRequestParams rejectConnectionRequestParams0 = new RejectConnectionRequestParams();
        rejectConnectionRequestParams0.a = new czbc(azvd0);
        rejectConnectionRequestParams0.b = this.a;
        czft0.m(rejectConnectionRequestParams0);
    }
}

