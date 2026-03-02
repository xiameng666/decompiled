import android.content.Context;
import java.util.concurrent.TimeUnit;

public final class egke {
    public final int a;
    public final egkd b;
    public final egkc c;

    public egke(Context context0, int v) {
        this(context0, context0.getApplicationInfo().uid, v);
    }

    public egke(Context context0, int v, int v1) {
        this(context0, v, v1, null);
    }

    public egke(Context context0, int v, int v1, String s) {
        this(context0, v, v1, hxgf.a.j().U(), ((int)hxgf.a.j().o()), s);
    }

    public egke(Context context0, int v, int v1, String s, int v2, String s1) {
        bbfe_BaseGrpcServer bbfe0 = new bbfe_BaseGrpcServer(context0, s, v2, v, v1);
        if(s1 != null) {
            bbfe0.g = s1;
        }
        this.b = new egkd(bbfe0);
        this.c = new egkc(bbfe0);
        egiv.R();
        int v3 = (int)hwzc.a.c().o();
        Integer.valueOf(v3).getClass();
        this.a = Math.max(1000, v3);
    }

    public static egke a(Context context0, int v) {
        egiv.R();
        boolean z = hwzc.a.c().aq();
        Boolean.valueOf(z).getClass();
        if(z) {
            return egiv.i().booleanValue() ? new egke(context0, v, 5380, hwzc.f(), ((int)egiv.M()), hwzc.e()) : new egke(context0, v, 5380, hwzc.f(), ((int)egiv.M()), null);
        }
        return egiv.i().booleanValue() ? new egke(context0, v, 5380, hwzc.e()) : new egke(context0, v, 5380);
    }

    public final gssv b(baqr baqr0, gssr gssr0) {
        try {
            return new egkd(this.b, cmlp.a, cksq.b).b(baqr0, gssr0, ((long)this.a));
        }
        catch(acse | iapl exception0) {
            egig.c("InternalPeopleServiceGrpcClient", "Error making Grpc request.", exception0);
            throw exception0;
        }
    }

    public final gssx c(baqr baqr0, gssy gssy0) {
        try {
            egkd egkd0 = new egkd(this.b, cmlp.a, cksr.b);
            long v = (long)this.a;
            if(egkd.l == null) {
                ibjh ibjh0 = new ibjh(((MessageLite)gssy.a));
                ibjh ibjh1 = new ibjh(((MessageLite)gssx.a));
                egkd.l = new gRPCMethodDescriptor(gRPCMethodType.a, "google.internal.people.v2.InternalPeopleService/GetPersonPhotoEncoded", ((gRPCMarshaller)ibjh0), ((gRPCMarshaller)ibjh1), false);
            }
            return (gssx)egkd0.o.callUnaryWithAuth(egkd.l, baqr0, gssy0, v, TimeUnit.MILLISECONDS, egkd0.p);
        }
        catch(acse | iapl exception0) {
            egig.c("InternalPeopleServiceGrpcClient", "Error making Grpc request.", exception0);
            throw exception0;
        }
    }

    public final gsuo d(baqr baqr0, gsun gsun0) {
        try {
            egkd egkd0 = new egkd(this.b, cmlp.a, cktb.b);
            long v = (long)this.a;
            if(egkd.m == null) {
                ibjh ibjh0 = new ibjh(((MessageLite)gsun.a));
                ibjh ibjh1 = new ibjh(((MessageLite)gsuo.a));
                egkd.m = new gRPCMethodDescriptor(gRPCMethodType.a, "google.internal.people.v2.InternalPeopleService/UpdatePersonPhoto", ((gRPCMarshaller)ibjh0), ((gRPCMarshaller)ibjh1), false);
            }
            return (gsuo)egkd0.o.callUnaryWithAuth(egkd.m, baqr0, gsun0, v, TimeUnit.MILLISECONDS, egkd0.p);
        }
        catch(acse | iapl exception0) {
            egig.c("InternalPeopleServiceGrpcClient", "Error making Grpc request.", exception0);
            throw exception0;
        }
    }
}

