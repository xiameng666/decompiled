import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.reminders.ReindexDueDatesOptions;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

public final class ejvx extends ejvr {
    private final String b;
    private final ReindexDueDatesOptions c;

    public ejvx(ejtq ejtq0, String s, ReindexDueDatesOptions reindexDueDatesOptions0, azug azug0) {
        super(ejtq0, "CheckReindexDueDatesNeeded", azug0);
        this.b = s;
        this.c = reindexDueDatesOptions0;
    }

    @Override  // cjtm
    public final void f(Context context0) {
        String s = this.b;
        if(ejte.b(context0, s) != null) {
            Object object0 = null;
            boolean z = true;
            if(hxsx.k()) {
                int v = (int)hxsx.b();
                Integer integer0 = v;
                Objects.toString(integer0);
                integer0.getClass();
                if(v >= 0) {
                    integer0.getClass();
                    if(v != 1) {
                        z = false;
                    }
                    object0 = Boolean.valueOf(z);
                }
            }
            else {
                ejwt ejwt0 = ejws.d(context0);
                baqr baqr0 = ejws.c(context0, s);
                gedy gedy0 = gedy.a;
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gedy0).v_newBuilder();
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gedn.a).v_newBuilder();
                ReindexDueDatesOptions reindexDueDatesOptions0 = this.c;
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                gedn gedn0 = (gedn)hftp1.b_message;
                reindexDueDatesOptions0.a.getClass();
                gedn0.b |= 1;
                gedn0.c = reindexDueDatesOptions0.a;
                gedn gedn1 = (gedn)hftp1.N_build();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gedy gedy1 = (gedy)hftp0.b_message;
                gedn1.getClass();
                gedy1.c = gedn1;
                gedy1.b |= 1;
                try {
                    ejwt ejwt1 = new ejwt(ejwt0, cmlp.a, cktp.b);
                    gedy gedy2 = (gedy)hftp0.N_build();
                    if(ejwt.n == null) {
                        ibjh ibjh0 = new ibjh(((MessageLite)gedy0));
                        ibjh ibjh1 = new ibjh(((MessageLite)gedz.a));
                        ejwt.n = new gRPCMethodDescriptor(gRPCMethodType.a, "caribou.tasks.service.TasksApiService/CheckReindexDueDatesNeeded", ((gRPCMarshaller)ibjh0), ((gRPCMarshaller)ibjh1), false);
                    }
                    object0 = ((gedz)ejwt1.o.callUnaryWithAuth(ejwt.n, baqr0, gedy2, ((long)ejwt.a), TimeUnit.MILLISECONDS, ejwt1.p)).b ? Boolean.valueOf(true) : Boolean.valueOf(false);
                }
                catch(iapl iapl0) {
                    Log.e("RemindersApiOp", String.format("NetworkError %s", ejxg.a()), iapl0);
                }
                catch(acse acse0) {
                    Log.e("RemindersApiOp", String.format("AuthError %s", ejxg.a()), acse0);
                }
            }
            if(object0 != null) {
                Objects.toString(object0);
                this.a.a(((Boolean)object0).booleanValue(), new Status(0), cckf.d(bbdp.ex));
                return;
            }
            this.a.a(false, new Status(6013), cckf.d(bbdp.ex));
            return;
        }
        this.a.d(new Status(6000), ApiMetadata.b);
    }
}

