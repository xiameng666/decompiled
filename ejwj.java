import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.reminders.ReindexDueDatesOptions;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

public final class ejwj extends ejvt {
    private final ReindexDueDatesOptions h;

    public ejwj(ejtq ejtq0, String s, String s1, ReindexDueDatesOptions reindexDueDatesOptions0, azug azug0) {
        super(ejtq0, s, s1, "ReindexDueDates", azug0);
        this.h = reindexDueDatesOptions0;
    }

    @Override  // ejvt
    public final void f(Context context0) {
        String s = this.b;
        if(ejte.b(context0, s) != null) {
            if(hxsx.k()) {
                int v = (int)hxsx.b();
                Integer integer0 = v;
                Objects.toString(integer0);
                integer0.getClass();
                if(v == 1) {
                    goto label_53;
                }
            }
            else {
                ejwt ejwt0 = ejws.d(context0);
                baqr baqr0 = ejws.c(context0, s);
                gefr gefr0 = gefr.a;
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gefr0).v_newBuilder();
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gedn.a).v_newBuilder();
                ReindexDueDatesOptions reindexDueDatesOptions0 = this.h;
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                gedn gedn0 = (gedn)hftp1.b_message;
                reindexDueDatesOptions0.a.getClass();
                gedn0.b |= 1;
                gedn0.c = reindexDueDatesOptions0.a;
                gedn gedn1 = (gedn)hftp1.N_build();
                gefz gefz0 = ejxc.b(context0, this.d());
                ProtoLiteBuilder hftp2 = (ProtoLiteBuilder)((ProtoLiteMessage)gefz0).jf(5, null);
                hftp2.X(((ProtoLiteMessage)gefz0));
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                gefz gefz1 = (gefz)hftp2.b_message;
                gedn1.getClass();
                gefz1.c = gedn1;
                gefz1.b |= 1;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gefr gefr1 = (gefr)hftp0.b_message;
                gefz gefz2 = (gefz)hftp2.N_build();
                gefz2.getClass();
                gefr1.c = gefz2;
                gefr1.b |= 1;
                try {
                    ejwt ejwt1 = new ejwt(ejwt0, cmlp.a, ckub.b);
                    gefr gefr2 = (gefr)hftp0.N_build();
                    if(ejwt.m == null) {
                        ibjh ibjh0 = new ibjh(((MessageLite)gefr0));
                        ibjh ibjh1 = new ibjh(((MessageLite)gefs.a));
                        ejwt.m = new gRPCMethodDescriptor(gRPCMethodType.a, "caribou.tasks.service.TasksApiService/ReindexDueDates", ((gRPCMarshaller)ibjh0), ((gRPCMarshaller)ibjh1), false);
                    }
                    gefs gefs0 = (gefs)ejwt1.o.callUnaryWithAuth(ejwt.m, baqr0, gefr2, ((long)ejwt.a), TimeUnit.MILLISECONDS, ejwt1.p);
                    goto label_53;
                }
                catch(iapl iapl0) {
                    Log.e("RemindersApiOp", String.format("NetworkError %s", ejxg.a()), iapl0);
                }
                catch(acse acse0) {
                    Log.e("RemindersApiOp", String.format("AuthError %s", ejxg.a()), acse0);
                }
            }
            this.g.d(new Status(6014), ApiMetadata.b);
            return;
        label_53:
            this.g.d(new Status(0), ApiMetadata.b);
            return;
        }
        this.g.d(new Status(6000), ApiMetadata.b);
    }

    @Override  // ejvt
    protected final void k(ArrayList arrayList0) {
    }

    @Override  // ejvt
    protected final void m(ArrayList arrayList0) {
    }
}

