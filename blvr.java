import com.google.android.gms.fido.sourcedevice.SourceStartDirectTransferOptions;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public final class blvr implements glzn {
    public final blwa a;
    public final bmae b;
    public final gfsx c;
    public final bnae d;

    public blvr(blwa blwa0, bmae bmae0, gfsx gfsx0, bnae bnae0) {
        this.a = blwa0;
        this.b = bmae0;
        this.c = gfsx0;
        this.d = bnae0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        blwa blwa0 = this.a;
        SourceStartDirectTransferOptions sourceStartDirectTransferOptions0 = blwa0.f;
        int v = 0;
        hhrp hhrp0 = null;
        if(sourceStartDirectTransferOptions0.d && sourceStartDirectTransferOptions0.a == 1) {
            try {
                hhro[] arr_hhro = new hhro[1];
                hhrq hhrq0 = new hhrq(sourceStartDirectTransferOptions0.e);
                arr_hhro[0] = new hhro(bmjm.F, hhrq0);
                hhrp0 = hhrs.o(arr_hhro);
            }
            catch(hhrh hhrh0) {
                throw new IllegalStateException(hhrh0);
            }
        }
        bmae bmae0 = this.b;
        long v1 = (long)(((Long)object0));
        MessageDigest messageDigest0 = blzb.a();
        messageDigest0.update(bmae0.k.getBytes(StandardCharsets.UTF_8));
        byte[] arr_b = messageDigest0.digest();
        if(bmae0.p) {
            v = 4;
        }
        else if(bmae0.o) {
            v = 1;
        }
        if(hhrp0 != null) {
            v |= 0xFFFFFF80;
        }
        bmbo bmbo0 = new bmbo(arr_b, ((byte)v), v1, null, hhrp0);
        gfsx gfsx0 = gfsx.m(glwl.d(new byte[][]{bmbo0.b(), bmae0.l}));
        gfsx gfsx1 = gfsx.m(bmbo0);
        return blwa0.b(this.c, bmae0, gfsx0, gfsx1, this.d);
    }
}

