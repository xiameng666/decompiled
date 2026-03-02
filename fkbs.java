import java.util.Arrays;

public final class fkbs implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        glnz[] arr_glnz = new glnz[1];
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)glnz.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        glnz glnz0 = (glnz)hftp0.b_message;
        ((glpl)object0).getClass();
        glnz0.F = (glpl)object0;
        glnz0.c |= 0x2000;
        arr_glnz[0] = (glnz)hftp0.N_build();
        return Arrays.asList(arr_glnz);
    }
}

