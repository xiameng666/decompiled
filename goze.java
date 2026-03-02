import android.text.TextUtils;

public final class goze implements goxo {
    public boolean a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public boolean h;
    public String i;

    @Override  // goxo
    public final MessageLite a() {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gdin.a).v_newBuilder();
        if(this.a) {
            String s = this.b;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            s.getClass();
            ((gdin)hftv0).b |= 2;
            ((gdin)hftv0).d = s;
            String s1 = this.c;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            gdin gdin0 = (gdin)hftp0.b_message;
            s1.getClass();
            gdin0.b |= 16;
            gdin0.g = s1;
        }
        else if(TextUtils.isEmpty(this.f)) {
            String s4 = this.d;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv2 = hftp0.b_message;
            s4.getClass();
            ((gdin)hftv2).b |= 1;
            ((gdin)hftv2).c = s4;
            String s5 = this.e;
            if(!hftv2.isImmutable()) {
                hftp0.ensureMutable();
            }
            gdin gdin2 = (gdin)hftp0.b_message;
            s5.getClass();
            gdin2.b |= 4;
            gdin2.e = s5;
        }
        else {
            String s2 = this.f;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv1 = hftp0.b_message;
            s2.getClass();
            ((gdin)hftv1).b |= 8;
            ((gdin)hftv1).f = s2;
            String s3 = this.b;
            if(!hftv1.isImmutable()) {
                hftp0.ensureMutable();
            }
            gdin gdin1 = (gdin)hftp0.b_message;
            s3.getClass();
            gdin1.b |= 2;
            gdin1.d = s3;
        }
        String s6 = this.g;
        if(s6 != null) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gdin gdin3 = (gdin)hftp0.b_message;
            gdin3.b |= 0x20;
            gdin3.h = s6;
        }
        if(!this.h) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gdin)hftp0.b_message).i = 2;
            ((gdin)hftp0.b_message).b |= 0x40;
        }
        String s7 = this.i;
        if(s7 != null) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gdin gdin4 = (gdin)hftp0.b_message;
            gdin4.b |= 0x80;
            gdin4.j = s7;
        }
        return (gdin)hftp0.N_build();
    }
}

