import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri;
import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.Executor;

public final class crjb extends crjn {
    private Executor a;

    public crjb(crqq crqq0) {
        super(crqq0);
    }

    @Override  // crjn
    public final void b(crca crca0, Map map0, crjk crjk0) {
        int v;
        this.aJ().k.b("Fetching config with GmsCore network library. app", crca0.t());
        this.n();
        this.aA();
        String s = crca0.y();
        if(!TextUtils.isEmpty(s)) {
            clbc clbc0 = new clbc(null);
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)crrd.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            crrd crrd0 = (crrd)hftp0.b_message;
            s.getClass();
            crrd0.b |= 1;
            crrd0.c = s;
            clbc0.d(((MessageLite)(((crrd)hftp0.N_build()))), ckjh.e, crcx.a);
            clbd clbd0 = new clbd(clbc0);
            clba clba0 = new clba(null);
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)crrb.a).v_newBuilder();
            String s1 = String.valueOf(this.am().i());
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            crrb crrb0 = (crrb)hftp1.b_message;
            s1.getClass();
            hfuo hfuo0 = crrb0.b;
            if(!hfuo0.c()) {
                crrb0.b = ProtoLiteMessage.E(hfuo0);
            }
            crrb0.b.add(s1);
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            crrb crrb1 = (crrb)hftp1.b_message;
            hfuo hfuo1 = crrb1.c;
            if(!hfuo1.c()) {
                crrb1.c = ProtoLiteMessage.E(hfuo1);
            }
            crrb1.c.add("0");
            clba0.c(((MessageLite)(((crrb)hftp1.N_build()))), ckjh.d, crcw.a);
            clba0.a("platform", "android");
            clcf clcf0 = clcg.b(clbd0, new cldm(clba0), ckjh.b);
            try {
                String s2 = crca0.t();
                v = bbsr.b(this.aj()).d(s2, 0).uid;
            }
            catch(PackageManager.NameNotFoundException unused_ex) {
                this.aJ().h.b("Failed to get uid, app", crca0.t());
                v = -1;
            }
            ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
            crja crja0 = new crja(this, crca0.t(), "CONFIG", crjk0, byteArrayOutputStream0);
            if(this.a == null) {
                this.a = new criw(this);
            }
            Executor executor0 = this.a;
            clcj clcj0 = clbv.a(this.aj()).e(clcf0, crja0, executor0, v, 0x3300);
            clcj0.n("GET");
            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)crrc.a).v_newBuilder();
            if(map0 != null) {
                if(map0.containsKey("If-Modified-Since")) {
                    String s3 = (String)map0.get("If-Modified-Since");
                    if(!hftp2.b_message.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    crrc crrc0 = (crrc)hftp2.b_message;
                    s3.getClass();
                    hfuo hfuo2 = crrc0.b;
                    if(!hfuo2.c()) {
                        crrc0.b = ProtoLiteMessage.E(hfuo2);
                    }
                    crrc0.b.add(s3);
                }
                if(map0.containsKey("If-None-Match")) {
                    String s4 = (String)map0.get("If-None-Match");
                    if(!hftp2.b_message.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    crrc crrc1 = (crrc)hftp2.b_message;
                    s4.getClass();
                    hfuo hfuo3 = crrc1.c;
                    if(!hfuo3.c()) {
                        crrc1.c = ProtoLiteMessage.E(hfuo3);
                    }
                    crrc1.c.add(s4);
                }
            }
            claw claw0 = new claw(null);
            claw0.b(((MessageLite)(((crrc)hftp2.N_build()))), ckjh.c, crcv.a);
            clcj0.m(new clax(claw0));
            clcj0.e().a();
        }
    }

    @Override  // crjn
    protected final void c(String s) {
        int v = -1;
        try {
            v = bbsr.b(this.aj()).d(s, 0).uid;
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
        }
        if(v == -1) {
            bbfj.b(0x3300);
            return;
        }
        bbfj.c(0x3300, v);
    }

    @Override  // crjn
    protected final void d() {
        bbfj.a();
    }

    @Override  // crjn
    public final void e(String s, crqd crqd0, crss crss0, crjk crjk0) {
        int v;
        String s4;
        this.aJ().k.b("Uploading bundle with GmsCore network library. app", s);
        this.n();
        this.aA();
        String s1 = crqd0.a;
        String s2 = Uri.parse(s1).getHost();
        String s3 = "";
        if(s2 == null) {
            s4 = "";
        }
        else {
            String[] arr_s = s2.split("\\.");
            if(arr_s.length >= 3) {
                batl.s(arr_s);
                s4 = TextUtils.join(".", Arrays.copyOfRange(arr_s, 0, arr_s.length - 2));
            }
            else {
                s4 = "";
            }
        }
        if(!TextUtils.isEmpty(s4)) {
            s4 = s4 + ".";
        }
        String s5 = Uri.parse(s1).getPath();
        if(s5 != null) {
            s3 = s5;
        }
        if(TextUtils.isEmpty(s3)) {
            this.aJ().h.c("Must have URL path. app, url", s, s1);
            return;
        }
        if(s3.startsWith("/")) {
            s3 = s3.substring(1);
        }
        clbc clbc0 = new clbc(null);
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)crra.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        s4.getClass();
        ((crra)hftv0).b |= 1;
        ((crra)hftv0).c = s4;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        crra crra0 = (crra)hftp0.b_message;
        s3.getClass();
        crra0.b |= 2;
        crra0.d = s3;
        clbc0.d(((MessageLite)(((crra)hftp0.N_build()))), ckjg.e, crcq.a);
        clcf clcf0 = clcg.b(new clbd(clbc0), new cldm(new clba(null)), ckjg.b);
        try {
            v = bbsr.b(this.aj()).d(s, 0).uid;
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
            this.aJ().h.b("Failed to get uid, app", s);
            v = -1;
        }
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        crja crja0 = new crja(this, s, crqd0.b.name(), crjk0, byteArrayOutputStream0);
        if(this.a == null) {
            this.a = new crix(this);
        }
        Executor executor0 = this.a;
        clcj clcj0 = clbv.a(this.aj()).e(clcf0, crja0, executor0, v, 0x3300);
        clcj0.n("POST");
        Map map0 = crqd0.a();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)crqz.a).v_newBuilder();
        if(map0 != null) {
            if(map0.containsKey("x-sgtm-server-info")) {
                String s6 = (String)map0.get("x-sgtm-server-info");
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                crqz crqz0 = (crqz)hftp1.b_message;
                s6.getClass();
                hfuo hfuo0 = crqz0.b;
                if(!hfuo0.c()) {
                    crqz0.b = ProtoLiteMessage.E(hfuo0);
                }
                crqz0.b.add(s6);
            }
            if(map0.containsKey("x-gtm-server-preview")) {
                String s7 = (String)map0.get("x-gtm-server-preview");
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                crqz crqz1 = (crqz)hftp1.b_message;
                s7.getClass();
                hfuo hfuo1 = crqz1.c;
                if(!hfuo1.c()) {
                    crqz1.c = ProtoLiteMessage.E(hfuo1);
                }
                crqz1.c.add(s7);
            }
        }
        claw claw0 = new claw(null);
        claw0.a("Content-Type", "application/x-www-form-urlencoded");
        claw0.b(((MessageLite)(((crqz)hftp1.N_build()))), ckjg.d, crcp.a);
        clcj0.m(new clax(claw0));
        clcj0.s(this.aj(), ((MessageLite)crss0), ckjg.c);
        clcj0.j();
        clcj0.e().a();
    }
}

