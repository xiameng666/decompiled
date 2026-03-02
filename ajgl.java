import android.accounts.Account;
import com.google.android.gms.auth.cryptauth.SignCryptedBlob;
import java.io.IOException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.util.List;

public final class ajgl {
    private static final baun a;
    private final ajga b;
    private final yhb c;
    private final ajgj d;
    private final ajgb e;
    private final ajiy f;

    static {
        ajgl.a = new baun(new String[]{"ShareGroupPrivateKeyController"}, null);
    }

    public ajgl(ajga ajga0, yhb yhb0, ajgj ajgj0, ajgb ajgb0, ajiy ajiy0) {
        this.b = ajga0;
        this.c = yhb0;
        this.d = ajgj0;
        this.e = ajgb0;
        this.f = ajiy0;
    }

    public final void a(Account account0, String s, List list0, int v) {
        gmjx gmjx0;
        SignCryptedBlob signCryptedBlob0;
        gmka gmka0;
        gftb.q(((boolean)(this.b.b() ^ 1)));
        if(!list0.isEmpty()) {
            try {
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gmkk.a).v_newBuilder();
                gmkj gmkj0 = gmkj.k;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gmkk gmkk0 = (gmkk)hftp0.b_message;
                gmkk0.b = gmkj0.a();
                gmkk gmkk1 = (gmkk)hftp0.N_build();
                gmka0 = this.d.a(s, gmkk1);
            }
            catch(ajgo ajgo0) {
                ajgl.b(11, v);
                throw new ajgm("Failed to create request context", ajgo0);
            }
            yhc yhc0 = this.c.a(s, account0.name);
            if(yhc0 != null) {
                PrivateKey privateKey0 = yhc0.d;
                if(privateKey0 != null) {
                    byte[] arr_b = hhtk.c(yhc0.c);
                    long v1 = ghgc.a.a(arr_b).c();
                    String s1 = this.e.a();
                    ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gmkb.a).v_newBuilder();
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    gmkb gmkb0 = (gmkb)hftp1.b_message;
                    gmka0.getClass();
                    gmkb0.c = gmka0;
                    gmkb0.b |= 1;
                    for(Object object0: list0) {
                        gmjv gmjv0 = (gmjv)object0;
                        try {
                            PublicKey publicKey0 = hhtk.b(gmjv0.e.toByteArray());
                            byte[] arr_b1 = hhtk.e(privateKey0);
                            signCryptedBlob0 = this.f.f(publicKey0, arr_b1);
                        }
                        catch(InvalidKeySpecException | ajgp exception0) {
                            ajgl.b(15, v);
                            throw new ajgm("Couldn\'t encrypt group key", exception0);
                        }
                        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gmjz.a).v_newBuilder();
                        ByteString hfsf0 = ByteString.copyFrom(signCryptedBlob0.c);
                        if(!hftp2.b_message.isImmutable()) {
                            hftp2.ensureMutable();
                        }
                        ProtoLiteMessage hftv0 = hftp2.b_message;
                        ((gmjz)hftv0).d = hfsf0;
                        if(!hftv0.isImmutable()) {
                            hftp2.ensureMutable();
                        }
                        ProtoLiteMessage hftv1 = hftp2.b_message;
                        ((gmjz)hftv1).e = v1;
                        if(!hftv1.isImmutable()) {
                            hftp2.ensureMutable();
                        }
                        ProtoLiteMessage hftv2 = hftp2.b_message;
                        s1.getClass();
                        ((gmjz)hftv2).c = s1;
                        String s2 = gmjv0.b;
                        if(!hftv2.isImmutable()) {
                            hftp2.ensureMutable();
                        }
                        gmjz gmjz0 = (gmjz)hftp2.b_message;
                        s2.getClass();
                        gmjz0.b = s2;
                        gmjz gmjz1 = (gmjz)hftp2.N_build();
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        gmkb gmkb1 = (gmkb)hftp1.b_message;
                        gmjz1.getClass();
                        hfuo hfuo0 = gmkb1.d;
                        if(!hfuo0.c()) {
                            gmkb1.d = ProtoLiteMessage.E(hfuo0);
                        }
                        gmkb1.d.add(gmjz1);
                    }
                    try {
                        gmkb gmkb2 = (gmkb)hftp1.N_build();
                        try {
                            gmjx0 = this.b.a.c();
                        }
                        catch(acse | IOException exception1) {
                            throw new ygb("failed to create stub", exception1, 5);
                        }
                        try {
                            gmjx gmjx1 = (gmjx)gmjx0.q(cmlp.a, cjzg.b);
                            iakr iakr0 = gmjx1.a;
                            gRPCMethodDescriptor iaoj0 = gmjy.b;
                            if(iaoj0 == null) {
                                synchronized(gmjy.class) {
                                    gRPCMethodDescriptor iaoj1 = gmjy.b;
                                    if(iaoj1 == null) {
                                        gRPCMethodDescriptorBuilder iaog0 = gRPCMethodDescriptor.newBuilder();
                                        iaog0.methodType = gRPCMethodType.a;
                                        iaog0.fullMethodName = gRPCMethodDescriptor.generateFullMethodName("google.cryptauth.devicesync.v1.DeviceSync", "ShareGroupPrivateKey");
                                        iaog0.setSampledToLocalTracing();
                                        iaog0.requestMarshaller = new ibjh(((MessageLite)gmkb.a));
                                        iaog0.responseMarshaller = new ibjh(((MessageLite)gmkc.a));
                                        iaoj1 = iaog0.build();
                                        gmjy.b = iaoj1;
                                    }
                                    iaoj0 = iaoj1;
                                }
                            }
                            gmkc gmkc0 = (gmkc)ibjw.b(iakr0, iaoj0, gmjx1.b, gmkb2);
                        }
                        catch(iapn iapn0) {
                            throw new ygb("Failed to make ShareGroupPrivateKeyRequest", iapn0, ajga.c(iapn0.a.t));
                        }
                        ajgl.b(2, v);
                        return;
                    }
                    catch(ygb ygb0) {
                        ajgl.b(ygb0.a, v);
                        throw new ajgm("Failed to share group key", ygb0);
                    }
                }
            }
            ajgl.b(7, v);
            throw new ajgm("Missing group key for " + s);
        }
        ajgl.a.m("Sharing group private key with empty recipient list!", new Object[0]);
    }

    private static final void b(int v, int v1) {
        ajir.a(new ajiq(4, v, null, v1));
    }
}

