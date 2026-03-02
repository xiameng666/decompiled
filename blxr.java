import com.google.android.gms.fido.u2f.api.common.ProtocolVersion;
import j..util.Objects;
import java.io.IOException;
import java.util.concurrent.ExecutionException;

public final class blxr extends blxz {
    public static final bboh a;
    public static final byte[] b;
    public static final byte[] c;

    static {
        blxr.a = bnaa.d("NfcSecurityKey");
        blxr.b = new byte[]{(byte)0xE1, 4};
        blxr.c = new byte[]{0, 1, (byte)0xD0};
    }

    public blxr(bnae bnae0, bmaz bmaz0, bnao bnao0) {
        super(bnae0, bmaz0, bnao0);
    }

    @Override  // blxz
    protected final ProtocolVersion a(ByteString hfsf0) {
        ProtocolVersion protocolVersion0;
        try {
            if(Objects.equals(blxz.d, hfsf0)) {
                bmbd bmbd0 = new bmbd(1);
                bmbb bmbb0 = new bmbb(0, -92, bmbd0.d);
                bmbb0.e(4);
                bmbb0.c(bmbd.b);
                bmbb0.d(bmbd0.c);
                blzd blzd0 = this.f;
                if(((bmbc)((glyq)blzd0.d(bmbb0)).u()).a != 0xFFFF9000) {
                    throw new bmbf();
                }
                bmbc bmbc0 = (bmbc)((glyq)blzd0.d(bmbd0.b())).u();
                switch(bmbc0.a) {
                    case 0xFFFF9000: {
                        protocolVersion0 = ProtocolVersion.a(bmbc0.b());
                        break;
                    }
                    case 0x6D00: {
                        protocolVersion0 = ProtocolVersion.b;
                        break;
                    }
                    default: {
                        throw new bmbf();
                    }
                }
            }
            else {
                bmbd bmbd1 = new bmbd(1);
                bmbb bmbb1 = new bmbb(0, -92, bmbd1.d);
                bmbb1.e(4);
                bmbb1.c(bmbd.a);
                bmbb1.d(bmbd1.c);
                blzd blzd1 = this.f;
                bmbc bmbc1 = (bmbc)((glyq)blzd1.d(bmbb1)).u();
                if(bmbc1.a == 0x6A82 || bmbc1.a == 0x6D00) {
                    bmbc1 = (bmbc)((glyq)blzd1.d(bmbd1.b())).u();
                    if(bmbc1.a != 0xFFFF9000) {
                        throw new bmbf();
                    }
                }
                protocolVersion0 = ProtocolVersion.a(bmbc1.b());
            }
            if(protocolVersion0 != ProtocolVersion.a) {
                ((ggtj)((ggtj)blxr.a.h()).ar(0xE0A)).B("Got version %s", protocolVersion0);
            }
            return protocolVersion0;
        }
        catch(IOException | ExecutionException | InterruptedException exception1) {
            this.g.b(this.h, blgt.l);
            throw new blyb(0x6F00, exception1);
        }
        catch(bndq | bmbf exception0) {
            this.g.b(this.h, blgt.l);
            throw new blyb(0x6D00, exception0);
        }
    }

    @Override  // blxz
    protected final int b() {
        return 1;
    }
}

