import java.util.concurrent.ExecutionException;

public final class arre {
    public static final baun a;

    static {
        arre.a = aqql.a("WalletHelper");
    }

    public static fsxb a(long v, Iterable iterable0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)fsxb.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)fszp.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        ((fszp)hftv0).b = v;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        fszp fszp0 = (fszp)hftp1.b_message;
        hfuo hfuo0 = fszp0.c;
        if(!hfuo0.c()) {
            fszp0.c = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(iterable0, fszp0.c);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        fsxb fsxb0 = (fsxb)hftp0.b_message;
        fszp fszp1 = (fszp)hftp1.N_build();
        fszp1.getClass();
        fsxb0.c = fszp1;
        fsxb0.b = 2;
        return (fsxb)hftp0.N_build();
    }

    public static fsxc b(fsxb fsxb0, azts azts0) {
        evql evql0 = azts0.aY(fsxb0.toBytesArray());
        try {
            byte[] arr_b = (byte[])evrg.n(evql0);
            hftc hftc0 = hftc.a();
            ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)fsxc.a), arr_b, 0, arr_b.length, hftc0);
            ProtoLiteMessage.P_makeImmutable(hftv0);
            if(((fsxc)hftv0).b == 1) {
                baun baun0 = arre.a;
                fswz fswz0 = fswz.b(((fsxa)((fsxc)hftv0).c).b);
                if(fswz0 == null) {
                    fswz0 = fswz.j;
                }
                baun0.m("Error returned from pay API: %s", new Object[]{fswz0});
                return null;
            }
            return (fsxc)hftv0;
        }
        catch(ExecutionException | InterruptedException exception0) {
            arre.a.n("Framework failure while invoking Pay API", exception0, new Object[0]);
            return null;
        }
        catch(hfur hfur0) {
            arre.a.n("Could not parse Pay API response object", hfur0, new Object[0]);
            return null;
        }
    }
}

