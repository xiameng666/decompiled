import j..util.Objects;
import java.util.function.Supplier;

public final class fcli implements Supplier {
    public final fcln a;

    public fcli(fcln fcln0) {
        this.a = fcln0;
    }

    @Override
    public final Object get() {
        fcgf fcgf0 = fcln.a;
        fcgf0.j("Watch is ready to start restore.", new Object[0]);
        fcln fcln0 = this.a;
        if(Objects.equals(fcln0.h.ij(), fclm.g)) {
            fcgf0.j("Phone is in waiting for charging state, start restore", new Object[0]);
            fcln0.c();
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ffbm.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ffbm ffbm0 = (ffbm)hftp0.b_message;
            ffbm0.b |= 1;
            ffbm0.c = true;
            return (ffbm)hftp0.N_build();
        }
        fcgf0.j("Phone is not in waiting for charging state, don\'t start restore", new Object[0]);
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)ffbm.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ffbm ffbm1 = (ffbm)hftp1.b_message;
        ffbm1.b |= 1;
        ffbm1.c = false;
        return (ffbm)hftp1.N_build();
    }
}

