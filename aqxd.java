import android.content.Context;

public final class aqxd {
    public static final int a;
    private static final baun b;

    static {
        aqxd.b = aqql.a("SwitchTransportTaskFactory");
    }

    public static final aqxc a(aqxb aqxb0, String s, String s1, Context context0, aqjk aqjk0, arem arem0) {
        aqze.i();
        aqxd.b.j("Using Post-O selectBackupTransport API", new Object[0]);
        ProtoLiteBuilder hftp0 = arem0.l;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hkyg hkyg0 = (hkyg)hftp0.b_message;
        hkyg0.b |= 4;
        hkyg0.h = true;
        return new aqxf(context0, aqjk0, aqxb0, s, s1);
    }
}

