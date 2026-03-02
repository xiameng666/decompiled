import android.content.Context;

public final class aqsh {
    public static final baun a;
    public final aqsg b;
    public final Context c;

    static {
        aqsh.a = new baun("Backup", new String[]{"InternalPeopleServiceGrpcClient"});
    }

    public aqsh(Context context0) {
        batl.s(context0);
        this.c = context0;
        this.b = new aqsg(new bbfe_BaseGrpcServer(context0, "people-pa.googleapis.com", 443, context0.getApplicationInfo().uid, 0x405));
    }
}

