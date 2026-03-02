import android.util.Base64;
import com.google.android.gms.pay.pass.valuable.model.prompt.UserDataPrompt;

public final class dvmu implements gfsi {
    public final String a;

    public dvmu(String s) {
        this.a = s;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        gftb.z(((UserDataPrompt)object0).h, "Value must be set on userDataPrompt");
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)guxn.a).v_newBuilder();
        Integer integer0 = ((UserDataPrompt)object0).a;
        guxo guxo0 = guxo.b(Math.abs(integer0.intValue()));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        guxn guxn0 = (guxn)hftp0.b_message;
        guxn0.c = guxo0.a();
        String s = gfta.b(((UserDataPrompt)object0).e);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((guxn)hftp0.b_message).g = s;
        if(((UserDataPrompt)object0).b == dvmx.d) {
            String s1 = gfta.b(((UserDataPrompt)object0).h).trim();
            if(!gfta.c(s1)) {
                String s2 = this.a;
                if(s2 != null) {
                    gtlg gtlg0 = dvmv.c(s2, s1);
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    guxn guxn1 = (guxn)hftp0.b_message;
                    gtlg0.getClass();
                    guxn1.e = gtlg0;
                    guxn1.b |= 1;
                    return (guxn)hftp0.N_build();
                }
            }
        }
        else if(((int)integer0) != 3) {
            String s4 = gfta.b(((UserDataPrompt)object0).h);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((guxn)hftp0.b_message).d = s4;
        }
        else if(!gfta.c(((UserDataPrompt)object0).h)) {
            String s3 = ((UserDataPrompt)object0).h;
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)guut.a).v_newBuilder();
            try {
                hftp1.A(Base64.decode(s3, 0), hftc.a());
            }
            catch(hfur hfur0) {
                throw new RuntimeException("Failed to deserialize barcode.", hfur0);
            }
            guut guut0 = (guut)hftp1.N_build();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            guxn guxn2 = (guxn)hftp0.b_message;
            guut0.getClass();
            guxn2.f = guut0;
            guxn2.b |= 2;
            return (guxn)hftp0.N_build();
        }
        return (guxn)hftp0.N_build();
    }
}

