import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Parcel;
import android.util.Base64;
import com.google.android.gms.auth.appcert.be.AppCertChimeraService;
import com.google.android.gms.chimera.modules.auth.account.base.AppContextProvider;
import java.io.IOException;

public final class aigc extends wby implements aigd {
    private final aige a;

    public aigc() {
        super("com.google.android.gms.auth.appcert.IAppCertService");
    }

    public aigc(aige aige0) {
        super("com.google.android.gms.auth.appcert.IAppCertService");
        this.a = aige0;
    }

    @Override  // aigd
    public final String a(String s) {
        ProtoLiteBuilder hftp1;
        byte[] arr_b;
        batl.t(s, "Package name cannot be null!");
        addw.d(AppContextProvider.a());
        if(!hpfi.m()) {
            AppCertChimeraService.a.j("DeviceKey is turned off", new Object[0]);
            return null;
        }
        aige aige0 = this.a;
        batl.t(s, "Package name cannot be null!");
        if(!hpfi.m()) {
            aige.a.f("DeviceKey is turned off", new Object[0]);
            return null;
        }
        synchronized(aige0.e) {
            aigf aigf0 = aige0.d;
            hkww hkww0 = aigf0.b();
            if(hkww0 == null) {
                aige0.b();
                hkww0 = aigf0.b();
            }
            if(hkww0 != null && ((hkww0.b & 8) == 0 || hkww0.e.size() == 0)) {
                aige.a.f("Invalid device key.", new Object[0]);
                return null;
            }
            try {
                arr_b = bbmq.ac(aige0.c.b, s);
            }
            catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
                aige.a.g("Invalid package name!", packageManager$NameNotFoundException0, new Object[0]);
                return null;
            }
            if(arr_b == null) {
                aige.a.f("Unable to get package certificate hash.", new Object[0]);
                return null;
            }
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gdix.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gdix gdix0 = (gdix)hftp0.b_message;
            s.getClass();
            gdix0.b |= 1;
            gdix0.c = s;
            String s1 = Base64.encodeToString(arr_b, 2);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gdix gdix1 = (gdix)hftp0.b_message;
            s1.getClass();
            gdix1.b |= 2;
            gdix1.d = s1;
            hftp1 = ((ProtoLiteMessage)gdiy.a).v_newBuilder();
            if(hkww0 == null) {
                long v3 = bbmq.d(aige0.c.b);
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                gdiy gdiy2 = (gdiy)hftp1.b_message;
                gdiy2.b |= 4;
                gdiy2.e = v3;
            }
            else {
                long v1 = hkww0.d;
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp1.b_message;
                ((gdiy)hftv0).b |= 4;
                ((gdiy)hftv0).e = v1;
                long v2 = hkww0.c;
                if(!hftv0.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ProtoLiteMessage hftv1 = hftp1.b_message;
                ((gdiy)hftv1).b |= 8;
                ((gdiy)hftv1).f = v2;
                ByteString hfsf0 = hkww0.f;
                if(!hftv1.isImmutable()) {
                    hftp1.ensureMutable();
                }
                gdiy gdiy0 = (gdiy)hftp1.b_message;
                hfsf0.getClass();
                gdiy0.b |= 16;
                gdiy0.g = hfsf0;
                try {
                    ByteString hfsf1 = ByteString.copyFrom(aige0.c(hkww0, s + ((gdix)hftp0.b_message).d));
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    gdiy gdiy1 = (gdiy)hftp1.b_message;
                    gdiy1.b |= 2;
                    gdiy1.d = hfsf1;
                }
                catch(IOException | IllegalArgumentException exception0) {
                    aige.a.f(a.ab(exception0, "Error while creating spatula signature: "), new Object[0]);
                    return null;
                }
            }
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gdiy gdiy3 = (gdiy)hftp1.b_message;
            gdix gdix2 = (gdix)hftp0.N_build();
            gdix2.getClass();
            gdiy3.c = gdix2;
            gdiy3.b |= 1;
        }
        return Base64.encodeToString(((gdiy)hftp1.N_build()).toBytesArray(), 2);
    }

    @Override  // aigd
    public final boolean b() {
        addw.d(AppContextProvider.a());
        if(!hpfi.m()) {
            AppCertChimeraService.a.j("DeviceKey is turned off", new Object[0]);
            return false;
        }
        return this.a.b();
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        switch(v) {
            case 1: {
                boolean z = this.b();
                parcel1.writeNoException();
                parcel1.writeInt(((int)z));
                return true;
            }
            case 2: {
                String s = parcel0.readString();
                aigc.gr(parcel0);
                String s1 = this.a(s);
                parcel1.writeNoException();
                parcel1.writeString(s1);
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

