import com.google.android.libraries.tapandpay.pay.pass.valuable.model.Valuable;
import java.nio.charset.StandardCharsets;

public final class douf {
    public static fhvp a(String s) {
        return fibi.a(ghft.a.d(s).c());
    }

    public static fhvp b(gjdw gjdw0) {
        return new fhvp(gjdr.a, gjdw0);
    }

    public static fhvp c(String s) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gjdw.a).v_newBuilder();
        long v = ghfs.a.c(s, StandardCharsets.UTF_8).c();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gjdw gjdw0 = (gjdw)hftp0.b_message;
        gjdw0.b |= 8;
        gjdw0.e = v;
        return douf.b(((gjdw)hftp0.N_build()));
    }

    public static fhvp d(Valuable valuable0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gjea.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gjea gjea0 = (gjea)hftp0.b_message;
        valuable0.b.getClass();
        gjea0.b |= 1;
        gjea0.c = valuable0.b;
        valuable0.bA();
        Object object0 = ((gftm)valuable0.bA()).a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gjea gjea1 = (gjea)hftp0.b_message;
        gjea1.b |= 2;
        gjea1.d = (String)object0;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gjdw.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gjdw gjdw0 = (gjdw)hftp1.b_message;
        gjea gjea2 = (gjea)hftp0.N_build();
        gjea2.getClass();
        gjdw0.n = gjea2;
        gjdw0.b |= 0x10000;
        return douf.b(((gjdw)hftp1.N_build()));
    }

    public static fhvp e(String s) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gjdw.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gjea.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gjea gjea0 = (gjea)hftp1.b_message;
        gjea0.b |= 2;
        gjea0.d = s;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gjdw gjdw0 = (gjdw)hftp0.b_message;
        gjea gjea1 = (gjea)hftp1.N_build();
        gjea1.getClass();
        gjdw0.n = gjea1;
        gjdw0.b |= 0x10000;
        return douf.b(((gjdw)hftp0.N_build()));
    }
}

