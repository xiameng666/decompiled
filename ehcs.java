import android.content.Context;
import android.text.TextUtils;
import java.util.concurrent.TimeUnit;

public final class ehcs extends ehcl {
    private final Context h;

    public ehcs(Context context0, baqr baqr0, egke egke0, String s, bbng bbng0, gfug gfug0, ehim ehim0, gsts gsts0, ehje ehje0) {
        super(context0, baqr0, egke0, s, bbng0, gfug0, ehim0, gsts0, ehje0);
        this.h = context0;
    }

    public final byte[] a(String s) {
        clgr clgr0 = clgp.a(this.h);
        clgq clgq0 = clgr0.b(clgr0.a.a(byte[].class)).b(clcg.f(s, ckss.b, clbk.a, clbj.a));
        if(clgq0.b) {
            try(gdrc gdrc0 = clib.c.a("glide#submit")) {
                return (byte[])clgq0.a.l().get();
            }
        }
        return (byte[])clgq0.a.l().get();
    }

    public final byte[] b(String s, int v) {
        gssx gssx0;
        if(v != 2) {
            v = 1;
        }
        if(s != null) {
            egiv.R();
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gssy.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            ((gssy)hftv0).c = 3;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gssy)hftp0.b_message).d = s;
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gstx.a).v_newBuilder();
            if(v == 2) {
                hwzc hwzc0 = hwzc.a;
                int v1 = (int)hwzc0.c().D();
                Integer.valueOf(v1).getClass();
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ((gstx)hftp1.b_message).c = v1;
                int v2 = (int)hwzc0.c().E();
                Integer.valueOf(v2).getClass();
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ((gstx)hftp1.b_message).b = v2;
            }
            else {
                hwzc hwzc1 = hwzc.a;
                int v3 = (int)hwzc1.c().F();
                Integer.valueOf(v3).getClass();
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ((gstx)hftp1.b_message).c = v3;
                int v4 = (int)hwzc1.c().G();
                Integer.valueOf(v4).getClass();
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ((gstx)hftp1.b_message).b = v4;
            }
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gssy gssy0 = (gssy)hftp0.b_message;
            gstx gstx0 = (gstx)hftp1.N_build();
            gstx0.getClass();
            gssy0.e = gstx0;
            gssy0.b |= 1;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gssy.b(((gssy)hftp0.b_message));
            gsts gsts0 = this.f;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gssy gssy1 = (gssy)hftp0.b_message;
            gsts0.getClass();
            gssy1.f = gsts0;
            gssy1.b |= 2;
            if(hxde.c()) {
                gsrx gsrx0 = (gsrx)((ProtoLiteMessage)gsry.a).v_newBuilder();
                gsrx0.a();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gssy gssy2 = (gssy)hftp0.b_message;
                gsry gsry0 = (gsry)((ProtoLiteBuilder)gsrx0).N_build();
                gsry0.getClass();
                gssy2.g = gsry0;
                gssy2.b |= 4;
            }
            try {
                ehif ehif0 = this.d;
                ehif0.a();
                gssx0 = this.b.c(this.a, ((gssy)hftp0.N_build()));
                ehif0.c("FSA_getPersonPhotoEncoded", 1, ehcw.a(((MessageLite)gssx0)));
            }
            catch(acse acse0) {
                egig.c("FSA2_PhotoSyncGrpc", "readPhoto error", acse0);
                throw acse0;
            }
            catch(iapl iapl0) {
                egig.c("FSA2_PhotoSyncGrpc", "readPhoto error", iapl0);
                this.d.d("FSA_getPersonPhotoEncoded", iapl0);
                throw iapl0;
            }
            if(gssx0 != null) {
                return gssx0.c.toByteArray();
            }
            throw new ehfd(3);
        }
        egig.b("FSA2_PhotoSyncGrpc", "readPhoto() failed since contactID was null.");
        throw new ehfd(2);
    }

    public final ehcr c(String s, byte[] arr_b, int v) {
        gsuo gsuo0;
        if(!TextUtils.isEmpty(s) && arr_b != null) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gsun.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            ((gsun)hftv0).c = v - 2;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv1 = hftp0.b_message;
            s.getClass();
            ((gsun)hftv1).d = s;
            int v1 = arr_b[0] == 0xFFFFFF89 ? 4 : 3;
            if(!hftv1.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gsun)hftp0.b_message).j = v1 - 2;
            ByteString hfsf0 = ByteString.copyFrom(arr_b);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv2 = hftp0.b_message;
            ((gsun)hftv2).e = hfsf0;
            gsts gsts0 = this.f;
            if(!hftv2.isImmutable()) {
                hftp0.ensureMutable();
            }
            gsun gsun0 = (gsun)hftp0.b_message;
            gsts0.getClass();
            gsun0.f = gsts0;
            gsun0.b |= 2;
            gsun gsun1 = (gsun)hftp0.N_build();
            try {
                ehif ehif0 = this.d;
                ehif0.a();
                gsuo0 = this.b.d(this.a, gsun1);
                ehif0.c("FSA_updatePersonPhoto", 1, ehcw.a(((MessageLite)gsuo0)));
            }
            catch(acse acse0) {
                egig.c("FSA2_PhotoSyncGrpc", "writePhoto() failed.", acse0);
                throw acse0;
            }
            catch(iapl iapl0) {
                egig.c("FSA2_PhotoSyncGrpc", "writePhoto() failed.", iapl0);
                this.d.d("FSA_updatePersonPhoto", iapl0);
                throw iapl0;
            }
            if(gsuo0 != null && !gsuo0.b.isEmpty()) {
                return new ehcr(gsuo0.b, gsuo0.c);
            }
            if(gsuo0 == null) {
                ehcs.e("response is null.");
            }
            else {
                ehcs.e("photoToken is empty.");
            }
            throw new ehfd(3);
        }
        if(TextUtils.isEmpty(s)) {
            ehcs.e("contactId was null.");
        }
        else {
            ehcs.e("bytes[] was null.");
        }
        throw new ehfd(2);
    }

    public final void d(String s, int v) {
        gssg gssg0;
        if(s != null) {
            gssf gssf0 = gssf.a;
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gssf0).v_newBuilder();
            gsts gsts0 = this.f;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            gsts0.getClass();
            ((gssf)hftv0).e = gsts0;
            ((gssf)hftv0).b |= 1;
            switch(v - 2) {
                case 1: {
                    if(!hftv0.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    gssf gssf1 = (gssf)hftp0.b_message;
                    hfuo hfuo0 = gssf1.c;
                    if(!hfuo0.c()) {
                        gssf1.c = ProtoLiteMessage.E(hfuo0);
                    }
                    gssf1.c.add(s);
                    break;
                }
                case 4: {
                    if(!hftv0.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    gssf gssf2 = (gssf)hftp0.b_message;
                    hfuo hfuo1 = gssf2.d;
                    if(!hfuo1.c()) {
                        gssf2.d = ProtoLiteMessage.E(hfuo1);
                    }
                    gssf2.d.add(s);
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ((gssf)hftp0.b_message).f = 1;
                    break;
                }
                default: {
                    throw new ehfd(2);
                }
            }
            try {
                this.d.a();
                egke egke0 = this.b;
                baqr baqr0 = this.a;
                gssf gssf3 = (gssf)hftp0.N_build();
                try {
                    egkd egkd0 = new egkd(egke0.b, cmlp.a, ckso.b);
                    long v1 = (long)egke0.a;
                    if(egkd.k == null) {
                        ibjh ibjh0 = new ibjh(((MessageLite)gssf0));
                        ibjh ibjh1 = new ibjh(((MessageLite)gssg.a));
                        egkd.k = new gRPCMethodDescriptor(gRPCMethodType.a, "google.internal.people.v2.InternalPeopleService/DeletePersonPhoto", ((gRPCMarshaller)ibjh0), ((gRPCMarshaller)ibjh1), false);
                    }
                    gssg0 = (gssg)egkd0.o.callUnaryWithAuth(egkd.k, baqr0, gssf3, v1, TimeUnit.MILLISECONDS, egkd0.p);
                }
                catch(acse | iapl exception0) {
                    egig.c("InternalPeopleServiceGrpcClient", "Error making Grpc request.", exception0);
                    throw exception0;
                }
                this.d.c("FSA_deletePersonPhoto", 1, ehcw.a(((MessageLite)gssg0)));
                return;
            }
            catch(acse acse0) {
                egig.c("FSA2_PhotoSyncGrpc", "deletePersonPhoto() failed.", acse0);
                throw acse0;
            }
            catch(iapl iapl0) {
                egig.c("FSA2_PhotoSyncGrpc", "deletePersonPhoto() failed.", iapl0);
                this.d.d("FSA_deletePersonPhoto", iapl0);
                throw iapl0;
            }
        }
        egig.b("FSA2_PhotoSyncGrpc", "deletePersonPhoto() failed since contactId was null.");
        throw new ehfd(2);
    }

    private static final void e(String s) {
        egig.d("FSA2_PhotoSyncGrpc", "writePhoto() failed since %s", new Object[]{s});
    }
}

