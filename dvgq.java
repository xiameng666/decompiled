import android.text.TextUtils;
import j..util.Objects;
import j..util.Optional;

public final class dvgq {
    public final dmhi a;
    public final ggfp b;
    public final dmkl c;

    public dvgq(dmhi dmhi0, ggfp ggfp0, dmkl dmkl0) {
        this.a = dmhi0;
        this.b = ggfp0;
        this.c = dmkl0;
    }

    public final void a(String s, Optional optional0, Optional optional1, Optional optional2, dpug dpug0, dpuf dpuf0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)guxu.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        s.getClass();
        ((guxu)hftv0).c = s;
        ggfp ggfp0 = this.b;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        guxu guxu0 = (guxu)hftp0.b_message;
        hfuf hfuf0 = guxu0.e;
        if(!hfuf0.c()) {
            guxu0.e = ProtoLiteMessage.C(hfuf0);
        }
        for(Object object0: ggfp0) {
            guxu0.e.i(((guwh)object0).a());
        }
        Objects.requireNonNull(hftp0);
        optional0.ifPresent(new dvgn(hftp0));
        Objects.requireNonNull(hftp0);
        optional1.ifPresent(new dvgo(hftp0));
        Objects.requireNonNull(hftp0);
        optional2.ifPresent(new dvgp(hftp0));
        ProtoLiteMessage hftv1 = hftp0.N_build();
        dptv.m(this.a, dpuj.bi, ((MessageLite)hftv1), ((MessageLite)guxv.a), dpug0, dpuf0);
    }

    public final void b(guut guut0, String s, String s1, Integer integer0, gged_interceptors gged0, guwc guwc0, dpue dpue0) {
        guxq guxq0 = (guxq)((ProtoLiteMessage)guxs.a).v_newBuilder();
        guxq0.k(this.b);
        if(!guxq0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)guxq0).ensureMutable();
        }
        guxs guxs0 = (guxs)guxq0.b_message;
        s.getClass();
        guxs0.b |= 2;
        guxs0.e = s;
        if(!guxq0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)guxq0).ensureMutable();
        }
        ((guxs)guxq0.b_message).g = 1;
        ((guxs)guxq0.b_message).b |= 8;
        guxq0.a(gged0);
        if(guut0 != null) {
            if(!guxq0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)guxq0).ensureMutable();
            }
            ((guxs)guxq0.b_message).d = guut0;
            ((guxs)guxq0.b_message).b |= 1;
        }
        if(integer0 != null) {
            int v = (int)integer0;
            if(!guxq0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)guxq0).ensureMutable();
            }
            guxs guxs1 = (guxs)guxq0.b_message;
            guxs1.b |= 16;
            guxs1.h = v;
        }
        if(!TextUtils.isEmpty(s1)) {
            if(!guxq0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)guxq0).ensureMutable();
            }
            guxs guxs2 = (guxs)guxq0.b_message;
            s1.getClass();
            guxs2.b |= 4;
            guxs2.f = s1;
        }
        if(!guxq0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)guxq0).ensureMutable();
        }
        guxs guxs3 = (guxs)guxq0.b_message;
        guxs3.m = guwc0.a();
        guxs3.b |= 0x80;
        ProtoLiteMessage hftv0 = ((ProtoLiteBuilder)guxq0).N_build();
        dptv.l(this.a, dpuj.aS, ((MessageLite)hftv0), ((MessageLite)guxt.a), dpue0);
    }
}

