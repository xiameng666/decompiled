import com.google.android.gms.nearby.sharing.ModuleInitializer;
import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import java.util.concurrent.Callable;

public final class dcgf implements Callable {
    public final NearbySharingChimeraService a;

    public dcgf(NearbySharingChimeraService nearbySharingChimeraService0) {
        this.a = nearbySharingChimeraService0;
    }

    @Override
    public final Object call() {
        NearbySharingChimeraService nearbySharingChimeraService0 = this.a;
        if(!ModuleInitializer.a(nearbySharingChimeraService0)) {
            dcvz.a.a().p("Cannot opt in, because Nearby Share is not available.", new Object[0]);
            return (int)35501;
        }
        if(cjpd.i(((cjpc)nearbySharingChimeraService0.al.get()), "opt_in", false)) {
            return (int)35500;
        }
        cjpa cjpa0 = ((cjpc)nearbySharingChimeraService0.al.get()).c();
        cjpa0.e("opt_in", true);
        if(dcww.a(nearbySharingChimeraService0) != null || !hvqz.a.b().aC()) {
            cjpa0.e("migration_acknowledged", true);
            nearbySharingChimeraService0.aC();
        }
        cjpd.g(cjpa0);
        nearbySharingChimeraService0.N();
        dcpn dcpn0 = nearbySharingChimeraService0.P;
        gzat gzat0 = nearbySharingChimeraService0.B();
        ProtoLiteBuilder hftp0 = dcpt.L(2);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gysp)hftp0.b_message).e = 1;
        ((gysp)hftp0.b_message).b |= 1;
        gyqc gyqc0 = gyqc.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gysp gysp0 = (gysp)hftp0.b_message;
        gyqc0.getClass();
        gysp0.f = gyqc0;
        gysp0.b |= 4;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gyqv.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((gyqv)hftp1.b_message).c = gzat0.j;
        ((gyqv)hftp1.b_message).b |= 1;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gysp gysp1 = (gysp)hftp0.b_message;
        gyqv gyqv0 = (gyqv)hftp1.N_build();
        gyqv0.getClass();
        gysp1.Y = gyqv0;
        gysp1.c |= 0x800000;
        dcpn0.i(new dcow(((gysp)hftp0.N_build())));
        dcpu dcpu0 = new dcpu();
        dcpu0.b = 1;
        dcpu0.a = 5;
        nearbySharingChimeraService0.Q(new dcpv(dcpu0));
        nearbySharingChimeraService0.Y();
        dcvz.a.b().p("NearbySharing was opted in", new Object[0]);
        return (int)0;
    }
}

