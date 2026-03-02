import android.os.PersistableBundle;
import android.os.Process;
import android.os.UserHandle;
import com.google.android.gms.auth.managed.services.UserRestrictionsService;
import j..util.function.Function.-CC;
import java.util.function.Function;

public final class aklq implements Function {
    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        akrj akrj0 = akrj.f(((UserRestrictionsService)object0));
        UserHandle userHandle0 = Process.myUserHandle();
        String s = akrj0.g();
        if(s == null) {
            s = "";
        }
        UserHandle userHandle1 = akrj0.c.getProfileParent(userHandle0);
        String s1 = userHandle1 == null ? null : Integer.toString(userHandle1.getIdentifier());
        ((ggtj)akrj.a.h()).X("Logging system restrictions. user=%s parent=%s packageName=%s", userHandle0, userHandle1, s);
        PersistableBundle persistableBundle0 = akrj0.d(userHandle0);
        for(Object object1: persistableBundle0.keySet()) {
            boolean z = ((String)object1).equals(s1);
            PersistableBundle persistableBundle1 = akrj.b(persistableBundle0, ((String)object1));
            for(Object object2: persistableBundle1.keySet()) {
                int v = persistableBundle1.getInt(((String)object2));
                akrd akrd0 = akrj0.d;
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)icxu.a).v_newBuilder();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp0.b_message;
                ((String)object2).getClass();
                ((icxu)hftv0).b |= 1;
                ((icxu)hftv0).c = (String)object2;
                if(!hftv0.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv1 = hftp0.b_message;
                ((icxu)hftv1).b |= 2;
                ((icxu)hftv1).d = v;
                if(!hftv1.isImmutable()) {
                    hftp0.ensureMutable();
                }
                icxu icxu0 = (icxu)hftp0.b_message;
                icxu0.b |= 4;
                icxu0.e = z;
                icxu icxu1 = (icxu)hftp0.N_build();
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)icxv.a).v_newBuilder();
                icxn icxn0 = akrd.b();
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ProtoLiteMessage hftv2 = hftp1.b_message;
                icxn0.getClass();
                ((icxv)hftv2).c = icxn0;
                ((icxv)hftv2).b |= 1;
                if(!hftv2.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ProtoLiteMessage hftv3 = hftp1.b_message;
                ((icxv)hftv3).d = 29;
                ((icxv)hftv3).b |= 2;
                if(!hftv3.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ProtoLiteMessage hftv4 = hftp1.b_message;
                ((icxv)hftv4).b |= 16;
                ((icxv)hftv4).g = s;
                if(!hftv4.isImmutable()) {
                    hftp1.ensureMutable();
                }
                icxv icxv0 = (icxv)hftp1.b_message;
                icxu1.getClass();
                icxv0.l = icxu1;
                icxv0.b |= 0x400;
                akrd0.k(((icxv)hftp1.N_build()), akrd0.a, 30);
            }
        }
        return (int)0;
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

