import android.content.Context;
import android.content.Intent;

public final class blsy implements blso {
    public final Context a;
    public final blsm b;
    public final Intent c;
    public static final int d;
    private final bnae e;

    static {
        bnaa.a("MessageValidationStageHandler");
    }

    public blsy(Context context0, bnae bnae0, Intent intent0) {
        blsm blsm0 = new blsm(context0);
        new aytt(context0, "FIDO").a();
        super();
        this.a = context0;
        this.e = bnae0;
        this.b = blsm0;
        this.c = intent0;
    }

    @Override  // blso
    public final void a() {
    }

    public final void b(blhc blhc0) {
        if(hsts.c()) {
            bnae bnae0 = this.e;
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)blgo.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            ((blgo)hftv0).b |= 1;
            ((blgo)hftv0).c = bnae0.a;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((blgo)hftp0.b_message).d = 300;
            ((blgo)hftp0.b_message).b |= 2;
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)blhd.a).v_newBuilder();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ((blhd)hftp1.b_message).c = blhc0.aH;
            ((blhd)hftp1.b_message).b |= 1;
            blhd blhd0 = (blhd)hftp1.N_build();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            blgo blgo0 = (blgo)hftp0.b_message;
            blhd0.getClass();
            blgo0.x = blhd0;
            blgo0.b |= 0x400000;
            byte[] arr_b = bnae0.b;
            if(arr_b != null) {
                ByteString hfsf0 = ByteString.copyFrom(arr_b);
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                blgo blgo1 = (blgo)hftp0.b_message;
                blgo1.b |= 0x400;
                blgo1.m = hfsf0;
            }
            ceva.v().j(((ProtoLiteMessage)(((blgo)hftp0.N_build()))));
        }
    }
}

