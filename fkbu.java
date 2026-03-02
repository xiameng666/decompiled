import java.util.Arrays;

public final class fkbu implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        glnz[] arr_glnz = new glnz[1];
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)glnz.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        glnz glnz0 = (glnz)hftp0.b_message;
        ((glph)object0).getClass();
        glnz0.H = (glph)object0;
        glnz0.c |= 0x10000;
        arr_glnz[0] = (glnz)hftp0.N_build();
        return Arrays.asList(arr_glnz);
    }
}

