import com.google.firebase.auth.api.model.StringList;
import java.util.Arrays;
import java.util.List;

public final class goyp implements goxo {
    public String a;
    public String b;
    public String c;
    public String d;
    public final StringList e;
    public final StringList f;
    public String g;
    public String h;
    private String i;

    public goyp() {
        this.f = new StringList();
        this.e = new StringList();
    }

    @Override  // goxo
    public final MessageLite a() {
        gdiu gdiu0;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gdhz.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gdhz)hftv0).b |= 0x8000;
        ((gdhz)hftv0).j = true;
        List list0 = this.e.a;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        gdhz gdhz0 = (gdhz)hftp0.b_message;
        hfuo hfuo0 = gdhz0.k;
        if(!hfuo0.c()) {
            gdhz0.k = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(list0, gdhz0.k);
        List list1 = this.f.a;
        gdiu[] arr_gdiu = new gdiu[list1.size()];
        for(int v = 0; v < list1.size(); ++v) {
            switch(((String)list1.get(v))) {
                case "DISPLAY_NAME": {
                    gdiu0 = gdiu.c;
                    break;
                }
                case "EMAIL": {
                    gdiu0 = gdiu.b;
                    break;
                }
                case "PASSWORD": {
                    gdiu0 = gdiu.f;
                    break;
                }
                case "PHOTO_URL": {
                    gdiu0 = gdiu.e;
                    break;
                }
                default: {
                    gdiu0 = gdiu.a;
                }
            }
            arr_gdiu[v] = gdiu0;
        }
        List list2 = Arrays.asList(arr_gdiu);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gdhz gdhz1 = (gdhz)hftp0.b_message;
        hfuf hfuf0 = gdhz1.i;
        if(!hfuf0.c()) {
            gdhz1.i = ProtoLiteMessage.C(hfuf0);
        }
        for(Object object0: list2) {
            gdhz1.i.i(((gdiu)object0).h);
        }
        String s = this.i;
        if(s != null) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gdhz gdhz2 = (gdhz)hftp0.b_message;
            gdhz2.b |= 1;
            gdhz2.c = s;
        }
        String s1 = this.a;
        if(s1 != null) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gdhz gdhz3 = (gdhz)hftp0.b_message;
            gdhz3.b |= 8;
            gdhz3.e = s1;
        }
        String s2 = this.b;
        if(s2 != null) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gdhz gdhz4 = (gdhz)hftp0.b_message;
            gdhz4.b |= 16;
            gdhz4.f = s2;
        }
        String s3 = this.c;
        if(s3 != null) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gdhz gdhz5 = (gdhz)hftp0.b_message;
            gdhz5.b |= 4;
            gdhz5.d = s3;
        }
        String s4 = this.d;
        if(s4 != null) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gdhz gdhz6 = (gdhz)hftp0.b_message;
            gdhz6.b |= 0x4000;
            gdhz6.h = s4;
        }
        String s5 = this.g;
        if(s5 != null) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gdhz gdhz7 = (gdhz)hftp0.b_message;
            gdhz7.b |= 0x20;
            gdhz7.g = s5;
        }
        String s6 = this.h;
        if(s6 != null) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gdhz gdhz8 = (gdhz)hftp0.b_message;
            gdhz8.b |= 0x40000;
            gdhz8.l = s6;
        }
        return (gdhz)hftp0.N_build();
    }

    public final boolean b(String s) {
        batl.q(s);
        return this.f.a.contains(s);
    }

    public final void c(String s) {
        if(s == null) {
            this.f.a.add("EMAIL");
            return;
        }
        this.a = s;
    }

    public final void d(String s) {
        batl.q(s);
        this.i = s;
    }

    public final void e(String s) {
        if(s == null) {
            this.f.a.add("PASSWORD");
            return;
        }
        this.b = s;
    }
}

