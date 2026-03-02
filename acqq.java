import java.util.UUID;

public final class acqq {
    public static gqud a() {
        UUID uUID0 = UUID.randomUUID();
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gqud.a).v_newBuilder();
        long v = uUID0.getMostSignificantBits();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gqud gqud0 = (gqud)hftp0.b_message;
        gqud0.b |= 1;
        gqud0.c = v;
        long v1 = uUID0.getLeastSignificantBits();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gqud gqud1 = (gqud)hftp0.b_message;
        gqud1.b |= 2;
        gqud1.d = v1;
        return (gqud)hftp0.N_build();
    }
}

