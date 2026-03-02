import android.text.TextUtils;
import j..util.DesugarTimeZone;
import java.util.TimeZone;

public final class bcuy implements bcug {
    public static final TimeZone a;
    public final hevm b;

    static {
        bcuy.a = DesugarTimeZone.getTimeZone("UTC");
    }

    public bcuy(hevm hevm0) {
        batl.s(hevm0);
        this.b = hevm0;
    }

    @Override  // bcug
    public final int a() {
        return this.b.g ? 45 : -1;
    }

    public static hevm b(hevl hevl0, TimeZone timeZone0, long v, long v1) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hevm.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hevm)hftp0.b_message).c = hevl0.n;
        ((hevm)hftp0.b_message).b |= 1;
        if(timeZone0 != null && !TextUtils.isEmpty(timeZone0.getID())) {
            String s = timeZone0.getID();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            s.getClass();
            ((hevm)hftv0).b |= 2;
            ((hevm)hftv0).d = s;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            hevm hevm0 = (hevm)hftp0.b_message;
            hevm0.b |= 0x20;
            hevm0.g = false;
        }
        else {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hevm hevm1 = (hevm)hftp0.b_message;
            hevm1.b |= 0x20;
            hevm1.g = true;
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((hevm)hftv1).b |= 4;
        ((hevm)hftv1).e = v;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        hevm hevm2 = (hevm)hftp0.b_message;
        hevm2.b |= 8;
        hevm2.f = v1;
        return (hevm)hftp0.N_build();
    }
}

