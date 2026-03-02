import android.content.Intent;

public final class dtyr {
    public static final Intent a;

    static {
        dmqm dmqm0 = new dmqm();
        dmqm0.h(7);
        dtyr.a = dmqm0.c().setFlags(0x10008000);
    }

    public static void a(Intent intent0, String s, hkoy hkoy0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gjdg.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gjdg gjdg0 = (gjdg)hftp0.b_message;
        gjdg0.d = hkoy0.a();
        gjdg0.c = 5;
        int v = s.hashCode();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gjdg gjdg1 = (gjdg)hftp0.b_message;
        gjdg1.b |= 2;
        gjdg1.h = v;
        String s1 = fsdw.g.r;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gjdg gjdg2 = (gjdg)hftp0.b_message;
        s1.getClass();
        gjdg2.b |= 1;
        gjdg2.g = s1;
        fsdz.a(intent0, 0, ((gjdg)hftp0.N_build()), new fsef(fsee.a));
    }
}

