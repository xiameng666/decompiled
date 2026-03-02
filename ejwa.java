import android.content.Context;
import com.google.android.gms.reminders.CreateReminderOptionsInternal;
import com.google.android.gms.reminders.model.TaskEntity;
import java.util.ArrayList;

public final class ejwa extends ejvt {
    private final TaskEntity h;
    private final CreateReminderOptionsInternal i;
    private String j;

    public ejwa(ejtq ejtq0, String s, String s1, TaskEntity taskEntity0, CreateReminderOptionsInternal createReminderOptionsInternal0, azug azug0) {
        super(ejtq0, s, s1, "CreateReminder", azug0);
        this.h = taskEntity0;
        this.i = createReminderOptionsInternal0;
    }

    @Override  // ejvt
    protected final int b() {
        return 6001;
    }

    @Override  // ejvt
    public final void f(Context context0) {
        if(this.n(context0, false)) {
            ejvq.a().c(this.j, this.g);
            ejws.f(this.d);
        }
    }

    @Override  // ejvt
    protected final void k(ArrayList arrayList0) {
        gedm gedm0;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)geed.a).v_newBuilder();
        gefy gefy0 = ejxi.g(this.h);
        ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)gefy0).jf(5, null);
        hftp1.X(((ProtoLiteMessage)gefy0));
        gefy gefy1 = (gefy)hftp1.b_message;
        if((gefy1.b & 4) != 0) {
            gegc gegc0 = gefy1.e == null ? gegc.a : gefy1.e;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            geed geed0 = (geed)hftp0.b_message;
            gegc0.getClass();
            geed0.d = gegc0;
            geed0.b |= 2;
        }
        gefz gefz0 = this.d();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        geed geed1 = (geed)hftp0.b_message;
        gefz0.getClass();
        geed1.c = gefz0;
        geed1.b |= 1;
        gefy gefy2 = (gefy)hftp1.b_message;
        if((gefy2.b & 1) == 0) {
            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gedm.a).v_newBuilder();
            String s = this.j;
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            gedm gedm1 = (gedm)hftp2.b_message;
            s.getClass();
            gedm1.b |= 2;
            gedm1.c = s;
            gedm0 = (gedm)hftp2.N_build();
        }
        else {
            gedm0 = gefy2.c;
            if(gedm0 == null) {
                gedm0 = gedm.a;
            }
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        geed geed2 = (geed)hftp0.b_message;
        gedm0.getClass();
        geed2.e = gedm0;
        geed2.b |= 4;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        ((gefy)hftv0).c = null;
        ((gefy)hftv0).b &= -2;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp1.b_message;
        ((gefy)hftv1).e = null;
        ((gefy)hftv1).b &= -5;
        if(!hftv1.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp1.b_message;
        ((gefy)hftv2).b &= 0xFFFFFF7F;
        boolean z = false;
        ((gefy)hftv2).j = false;
        if(!hftv2.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv3 = hftp1.b_message;
        ((gefy)hftv3).t = null;
        ((gefy)hftv3).b &= 0xFFFBFFFF;
        if(!hftv3.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((gefy)hftp1.b_message).d = null;
        ((gefy)hftp1.b_message).b &= -3;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        geed geed3 = (geed)hftp0.b_message;
        gefy gefy3 = (gefy)hftp1.N_build();
        gefy3.getClass();
        geed3.f = gefy3;
        geed3.b |= 8;
        CreateReminderOptionsInternal createReminderOptionsInternal0 = this.i;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        geed geed4 = (geed)hftp0.b_message;
        geed4.b |= 16;
        geed4.g = createReminderOptionsInternal0.d;
        String s1 = createReminderOptionsInternal0.c;
        boolean z1 = s1 != null && !s1.isEmpty();
        String s2 = createReminderOptionsInternal0.b;
        if(s2 != null && !s2.isEmpty()) {
            z = true;
        }
        if(z1 || z) {
            ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)henv.a).v_newBuilder();
            if(s2 != null) {
                if(!hftp3.b_message.isImmutable()) {
                    hftp3.ensureMutable();
                }
                henv henv0 = (henv)hftp3.b_message;
                henv0.b |= 1;
                henv0.c = s2;
            }
            if(s1 != null) {
                if(!hftp3.b_message.isImmutable()) {
                    hftp3.ensureMutable();
                }
                henv henv1 = (henv)hftp3.b_message;
                henv1.b |= 2;
                henv1.d = s1;
            }
            ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)geca.a).v_newBuilder();
            if(!hftp4.b_message.isImmutable()) {
                hftp4.ensureMutable();
            }
            geca geca0 = (geca)hftp4.b_message;
            henv henv2 = (henv)hftp3.N_build();
            henv2.getClass();
            geca0.c = henv2;
            geca0.b |= 1;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            geed geed5 = (geed)hftp0.b_message;
            geca geca1 = (geca)hftp4.N_build();
            geca1.getClass();
            geed5.h = geca1;
            geed5.b |= 0x80;
        }
        arrayList0.add(this.c(1, ((MessageLite)(((geed)hftp0.N_build())))));
    }

    @Override  // ejvt
    protected final void m(ArrayList arrayList0) {
        this.j = this.e(arrayList0, this.h);
    }
}

