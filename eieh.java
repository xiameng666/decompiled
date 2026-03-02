import android.content.Context;
import com.google.android.gms.personalsafety.ringing.FinderRingingIntentOperation;
import j..util.Objects;
import java.util.List;

public final class eieh implements gmbg {
    final Context a;
    final String b;
    final eiex c;
    final FinderRingingIntentOperation d;

    public eieh(FinderRingingIntentOperation finderRingingIntentOperation0, Context context0, String s, eiex eiex0) {
        this.a = context0;
        this.b = s;
        this.c = eiex0;
        Objects.requireNonNull(finderRingingIntentOperation0);
        this.d = finderRingingIntentOperation0;
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        bboh bboh0 = eicd.a;
        a.e(bboh0.j(), "%s Failed to ring.", "[S]", throwable0);
        FinderRingingIntentOperation finderRingingIntentOperation0 = this.d;
        if(eihl.c(finderRingingIntentOperation0.getApplicationContext())) {
            Long long0 = finderRingingIntentOperation0.a.e;
            if(long0 != null && System.currentTimeMillis() - ((long)long0) <= hrtd.z() && ((long)finderRingingIntentOperation0.c) < hrtd.B()) {
                ((ggtj)bboh0.j()).P("%s Starting retry attempt %s", "[S]", finderRingingIntentOperation0.c + 1);
                finderRingingIntentOperation0.b(this.c);
                return;
            }
        }
        eiet.a(this.a, Integer.valueOf(5), this.b, "com.google.android.personalsafety.internal.ringing.UNSPECIFIED_RINGING_FAILURE_INTENT_ACTION");
        List list0 = finderRingingIntentOperation0.b;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gwmq.a).v_newBuilder();
        long v = System.currentTimeMillis();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gwmq)hftv0).b |= 1;
        ((gwmq)hftv0).c = v;
        gwmp gwmp0 = gwmp.g;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gwmq)hftp0.b_message).d = gwmp0.h;
        ((gwmq)hftp0.b_message).b |= 2;
        list0.add(((gwmq)hftp0.N_build()));
        finderRingingIntentOperation0.a(this.c);
    }

    @Override  // gmbg
    public final void b(Object object0) {
        Long long0 = (Long)object0;
        eiet.a(this.a, Integer.valueOf(5), this.b, "com.google.android.personalsafety.internal.ringing.RINGING_SUCCESS_INTENT_ACTION");
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gwmq.a).v_newBuilder();
        long v = System.currentTimeMillis();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gwmq)hftv0).b |= 1;
        ((gwmq)hftv0).c = v;
        gwmp gwmp0 = gwmp.f;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gwmq)hftp0.b_message).d = gwmp0.h;
        ((gwmq)hftp0.b_message).b |= 2;
        gwmq gwmq0 = (gwmq)hftp0.N_build();
        this.d.b.add(gwmq0);
        this.d.a(this.c);
    }
}

