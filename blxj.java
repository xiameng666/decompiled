import android.util.Pair;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsPrfOutputs;
import com.google.android.gms.fido.fido2.api.common.PrfExtension;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.PublicKey;
import java.util.List;

public final class blxj {
    public final boolean a;
    public boolean b;
    private final blxc c;
    private final blxk d;
    private final List e;
    private byte[] f;

    public blxj(blxc blxc0, bmao bmao0, List list0) {
        boolean z = false;
        this.b = false;
        blxk blxk0 = null;
        this.f = null;
        this.c = blxc0;
        List list1 = bmao0.D;
        if(list1 != null && !list1.isEmpty()) {
            if(list1.contains(Integer.valueOf(2))) {
                blxk0 = new blxm();
            }
            else if(list1.contains(Integer.valueOf(1))) {
                blxk0 = new blxl();
            }
        }
        this.d = blxk0;
        if(blxk0 != null && bmao0.w.contains("hmac-secret")) {
            z = true;
        }
        this.a = z;
        this.e = list0;
    }

    public final gfsx a(PrfExtension prfExtension0) {
        if(this.a) {
            List list0 = this.e;
            byte[] arr_b = null;
            if(list0 != null && !list0.isEmpty()) {
                for(Object object0: list0) {
                    byte[] arr_b1 = blxj.d(prfExtension0, ((PublicKeyCredentialDescriptor)object0).e());
                    if(arr_b1 != null) {
                        arr_b = arr_b1;
                        break;
                    }
                }
            }
            else {
                arr_b = blxj.d(prfExtension0, null);
            }
            if(arr_b != null) {
                this.b = true;
                gftb.check(this.d);
                try {
                    int v = this.d.a();
                    PublicKey publicKey0 = this.c.b(v);
                    Pair pair0 = this.d.b(publicKey0);
                    byte[] arr_b2 = (byte[])pair0.second;
                    this.f = arr_b2;
                    byte[] arr_b3 = bmbv.b(((PublicKey)pair0.first)).d();
                    byte[] arr_b4 = this.d.e(arr_b2, arr_b);
                    byte[] arr_b5 = this.d.c(arr_b2, arr_b4);
                    int v1 = this.d.a();
                    gftb.check(arr_b3);
                    ByteString hfsf0 = ByteString.copyFrom(arr_b3);
                    gftb.check(arr_b4);
                    return gfsx.m(bmic.a(hfsf0, ByteString.copyFrom(arr_b4), ByteString.copyFrom(arr_b5), v1));
                }
                catch(GeneralSecurityException | IOException exception0) {
                    throw bxma.g(8, exception0);
                }
            }
        }
        return gfqx.a;
    }

    public final gfsx b(byte[] arr_b) {
        if(this.b) {
            hhrs hhrs0 = blxj.c(arr_b);
            if(hhrs0 != null) {
                try {
                    byte[] arr_b1 = hhrs0.j().d();
                    gftb.check(this.d);
                    byte[] arr_b2 = this.f;
                    gftb.check(arr_b2);
                    return gfsx.m(new AuthenticationExtensionsPrfOutputs(true, this.d.d(arr_b2, arr_b1)));
                }
                catch(hhrr | GeneralSecurityException exception0) {
                    throw bxma.g(8, exception0);
                }
            }
        }
        return gfqx.a;
    }

    public static hhrs c(byte[] arr_b) {
        boolean z = true;
        gftb.checkTrue(arr_b.length >= 37);
        if((arr_b[0x20] & 0x80) == 0) {
            return null;
        }
        try {
            ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(arr_b, 37, arr_b.length - 37);
            if((arr_b[0x20] & 0x40) != 0) {
                gftb.checkTrue(arr_b.length > 55);
                int v = glwy.d(((byte)0), ((byte)0), arr_b[53], arr_b[54]);
                if(arr_b.length <= v + 55) {
                    z = false;
                }
                gftb.checkTrue(z);
                byteArrayInputStream0.skip(((long)(v + 18)));
                hhrs.r(byteArrayInputStream0);
            }
            return (hhrs)hhrs.r(byteArrayInputStream0).m().a.get(bmjm.B);
        }
        catch(hhrl | hhrr exception0) {
            throw bxma.g(8, exception0);
        }
    }

    private static byte[] d(PrfExtension prfExtension0, byte[] arr_b) {
        gfsx gfsx0 = arr_b == null ? prfExtension0.d() : prfExtension0.c(arr_b);
        if(!gfsx0.i()) {
            return null;
        }
        byte[] arr_b1 = (byte[])((Pair)gfsx0.d()).first;
        return ((gfsx)((Pair)gfsx0.d()).second).i() ? glwl.d(new byte[][]{arr_b1, ((byte[])((gfsx)((Pair)gfsx0.d()).second).d())}) : arr_b1;
    }
}

