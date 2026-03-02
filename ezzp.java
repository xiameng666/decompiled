import android.content.Context;
import android.os.Build;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map.Entry;

public final class ezzp extends ezyn {
    private static final baun g;
    private static final fagl h;
    private final Context i;
    private final ezxs j;
    private final fagt k;

    static {
        ezzp.g = fabk.e("PreDownloadValidateAction");
        ezzp.h = new fagl("network_error_attempts", ((int)0));
    }

    public ezzp(Context context0, fagj fagj0) {
        super("pre-download-validate", fagj0);
        this.i = context0;
        this.j = (ezxs)ezxs.l.b();
        this.k = (fagt)fagt.a.b();
    }

    @Override  // ezyj
    public final ezyi a() {
        ezyi ezyi1;
        gfsx gfsx5;
        ezyi ezyi0;
        hlnn hlnn0;
        File file1;
        Object object0;
        gfsx gfsx2;
        File file0;
        int v;
        gfsx gfsx0;
        if(!ezwj.c().booleanValue() && !hvyr.c()) {
            gfsx0 = gfsx.m(ezzp.f());
        }
        else {
            ezxs ezxs0 = this.j;
            if(gfta.c(ezxs0.b().a)) {
                ezxs0.u(0, -1.0);
                gfsx0 = gfsx.m(ezzp.h());
            }
            else {
                boolean z = ezwc.f();
                if(ezwd.d() && !z) {
                    ezzp.g.f("Unable to perform StreamingDownloadAction for non-AB device.", new Object[0]);
                    gfsx0 = gfsx.m(ezzp.h());
                }
                else {
                    gfsx0 = gfqx.a;
                }
            }
        }
        if(gfsx0.i()) {
            return (ezyi)gfsx0.d();
        }
        ezxs ezxs1 = this.j;
        ezxs1.u(23, -1.0);
        boolean z1 = ((Boolean)((fagt)fagt.a.b()).a(ezyq.o).b).booleanValue();
        try {
            try {
                if(ezwc.f() && ezwj.c().booleanValue()) {
                    if(!z1) {
                        String s = ezxs1.b().a;
                        z1 = faac.a(this.i, s);
                    }
                    if(!z1 || !((Boolean)ezwo.d(hvzy.l, Boolean.class)).booleanValue()) {
                        v = 1;
                    }
                    else {
                        file0 = hrnt.i() ? new File(ccsb.a.d(faab.b().getAbsolutePath(), "payload_metadata.bin")) : new File(faab.b().getAbsolutePath(), "payload_metadata.bin");
                        faab.f(file0);
                        goto label_28;
                    }
                }
                else {
                    goto label_40;
                }
                goto label_41;
            }
            catch(IOException iOException0) {
                goto label_97;
            }
            try {
            label_28:
                fabh fabh0 = (fabh)fabh.b.b();
                String s1 = file0.getAbsolutePath();
                fabh.a.h("verifyPayloadMetadata()", new Object[0]);
                v = ((Boolean)fabh0.f(new fabb(fabh0, s1))).booleanValue();
                if(v) {
                    ((ezxl)ezxl.h.b()).j.c(new fagn[]{ezxl.f});
                }
                else {
                    ezzp.g.f("UpdateEngine.verifyPayloadMetadata() failed.", new Object[0]);
                    ((ezxl)ezxl.h.b()).j.e(new fagh[]{new fagh(ezxl.f, Build.FINGERPRINT)});
                }
                goto label_41;
            }
            catch(Exception exception0) {
                try {
                    ezzp.g.g("UpdateEngine.verifyPayloadMetadata() exception.", exception0, new Object[0]);
                label_40:
                    v = 1;
                label_41:
                    gfsx gfsx1 = gfqx.a;
                    if(hvyr.c()) {
                        gfsx2 = faag.a("metadata.pb");
                        if(!gfsx2.i()) {
                            ezzp.g.h("Cannot find metadata.pb extent. Falling back on legacy metadata.", new Object[0]);
                        }
                    }
                    else {
                        gfsx2 = gfsx1;
                    }
                    if(gfsx2.i()) {
                        gfsx1 = gfsx2;
                    }
                    else {
                        gfsx2 = faag.a("metadata");
                        if(gfsx2.i()) {
                            gfsx1 = gfsx2;
                        }
                        else {
                            ezzp.g.m("Could not get metadata extent.", new Object[0]);
                        }
                    }
                    if(gfsx1.i()) {
                        ezws ezws0 = (ezws)gfsx1.d();
                        Context context0 = this.i;
                        boolean z2 = ezwd.c();
                        ezzy ezzy0 = new ezzy(context0, ezws0.a, "", z2);
                        ggdy ggdy0 = new ggdy();
                        ggdy0.k(faaa.b(context0));
                        if(ezwj.c().booleanValue()) {
                            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)fafw.a).v_newBuilder();
                            if(!hftp0.b_message.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            fafw fafw0 = (fafw)hftp0.b_message;
                            fafw0.b |= 1;
                            fafw0.c = v ^ 1;
                            ggdy0.i(new kau("X-Package-Validation-Info", bbmu.b(((fafw)hftp0.N_build()).toBytesArray())));
                        }
                        String s2 = this.j.b().a;
                        ezzz ezzz0 = new ezzz();
                        gged_interceptors gged0 = ggdy0.h();
                        gfsx gfsx3 = fabl.a(context0, s2, ezzy0, 0L, ezws0.b, ezws0.c, gged0, 0, ezzz0, null).d();
                        if(hvyr.c()) {
                            if(gfsx3.i()) {
                                object0 = gfsx3.d();
                                file1 = hrnt.i() ? new File(ccsb.a.a(((String)object0))) : new File(((String)object0));
                                hlnn0 = ezwr.b(file1);
                            }
                            else {
                                hlnn0 = ezwr.c(faab.b().getAbsolutePath());
                            }
                            goto label_86;
                        }
                        goto label_90;
                    }
                    ezyi0 = ezzp.f();
                    goto label_152;
                }
                catch(IOException iOException0) {
                    goto label_97;
                }
            }
            try {
                hlnn0 = ezwr.b(file1);
                goto label_86;
            }
            catch(IOException iOException1) {
                try {
                    ezwr.a.g("Error parsing %s as binary metadata, falling back on parsing as text metadata.", iOException1, new Object[]{object0});
                    hlnn0 = ezwr.e(file1);
                label_86:
                    fagh[] arr_fagh = new fagh[1];
                    gfsx gfsx4 = gfsx.m(hlnn0);
                    arr_fagh[0] = new fagh(ezyq.h, gfsx4);
                    this.k.e(arr_fagh);
                }
                catch(IOException iOException0) {
                    goto label_97;
                }
            }
        }
        catch(Throwable throwable0) {
            ((fagt)fagt.a.b()).e(new fagh[]{new fagh(ezyq.o, Boolean.valueOf(z1))});
            throw throwable0;
        }
    label_90:
        ((fagt)fagt.a.b()).e(new fagh[]{new fagh(ezyq.o, Boolean.valueOf(z1))});
        return ezzp.f();
        try {
            try {
                ezyi0 = ezzp.f();
                goto label_152;
            label_97:
                if((iOException0 instanceof fabo)) {
                    goto label_98;
                }
                else {
                    goto label_128;
                }
                goto label_152;
            }
            catch(IOException iOException0) {
                goto label_97;
            }
        label_98:
            baun baun0 = ezzp.g;
            baun0.g("Failed to download.", iOException0, new Object[0]);
            Iterator iterator0 = ((fabo)iOException0).a.v().iterator();
            while(true) {
                if(!iterator0.hasNext()) {
                    break;
                }
                Object object1 = iterator0.next();
                Map.Entry map$Entry0 = (Map.Entry)object1;
                if(!((String)map$Entry0.getKey()).equalsIgnoreCase("X-Package-Validation-Error-Details")) {
                    continue;
                }
                gfsx5 = gfsx.m(((String)map$Entry0.getValue()));
                goto label_108;
            }
            gfsx5 = gfqx.a;
        label_108:
            if(gfsx5.i()) {
                Object object2 = gfsx5.d();
                try {
                    byte[] arr_b = bbmu.d(((String)object2));
                    ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)faft.a), arr_b, 0, arr_b.length, hftc.a);
                    ProtoLiteMessage.P_makeImmutable(hftv0);
                    faft faft0 = (faft)hftv0;
                    baun0.f("Failed to validate package, with resolution=%s.", new Object[]{(fafs.a(faft0.b) == 0 || fafs.a(faft0.b) == 1 ? "UNKNOWN" : "REJECT")});
                    if((fafs.a(faft0.b) == 0 ? 1 : fafs.a(faft0.b)) - 1 == 1) {
                        this.j.u(22, -1.0);
                        ezyi0 = ezzp.h();
                    }
                    else {
                        baun0.d("Unknown package validation resolution.", new Object[0]);
                        ezyi0 = ezzp.f();
                    }
                }
                catch(hfur hfur0) {
                    ezzp.g.g("Unable to parse the proto value for ErrorDetails proto.", hfur0, new Object[0]);
                    ezyi0 = ezzp.f();
                }
            }
            else {
                ezyi0 = this.g();
                goto label_152;
            label_128:
                if((iOException0 instanceof fabp)) {
                    goto label_142;
                }
                else {
                    if((iOException0 instanceof fabn)) {
                        ezzp.g.g("Failed to download.", iOException0, new Object[0]);
                        ezyi0 = new ezyi("pre-download-validate", this.b().a().a());
                        goto label_152;
                    }
                    ezzp.g.g("File IO exception.", iOException0, new Object[0]);
                    goto label_134;
                }
            }
            goto label_152;
        }
        catch(Throwable throwable0) {
            ((fagt)fagt.a.b()).e(new fagh[]{new fagh(ezyq.o, Boolean.valueOf(z1))});
            throw throwable0;
        }
        try {
        label_134:
            faab.e(this.i);
            ezyi1 = this.g();
        }
        catch(Throwable throwable0) {
            z1 = false;
            ((fagt)fagt.a.b()).e(new fagh[]{new fagh(ezyq.o, Boolean.valueOf(z1))});
            throw throwable0;
        }
        ((fagt)fagt.a.b()).e(new fagh[]{new fagh(ezyq.o, Boolean.valueOf(false))});
        return ezyi1;
        try {
        label_142:
            ezzp.g.g("Unable to create the file.", iOException0, new Object[0]);
            this.j.u(278, -1.0);
            ezze ezze0 = new ezze();
            ezze0.f(hvzt.c());
            ezze0.d("pre-download-validate", this.b().a().a());
            ezze0.e(gfsx.m(ezyy.g()));
            ezyi0 = ezze0.a();
        }
        catch(Throwable throwable0) {
            ((fagt)fagt.a.b()).e(new fagh[]{new fagh(ezyq.o, Boolean.valueOf(z1))});
            throw throwable0;
        }
    label_152:
        ((fagt)fagt.a.b()).e(new fagh[]{new fagh(ezyq.o, Boolean.valueOf(z1))});
        return ezyi0;
    }

    private static ezyi f() {
        return ezwd.d() ? new ezyi("streaming-download", fagj.b(new fagh[0])) : new ezyi("non-streaming-download", fagj.b(new fagh[0]));
    }

    private final ezyi g() {
        fagi fagi0 = this.b().a();
        Integer integer0 = (int)(((int)(((Integer)this.c(ezzp.h)))) + 1);
        fagi0.e(ezzp.h, integer0);
        fagj fagj0 = fagi0.a();
        this.j.u(278, -1.0);
        ezzb ezzb0 = new ezzb();
        ezzb0.f(hvzt.d(), ezwi.d().longValue());
        ezzb0.g(hvzt.b());
        ezzb0.h(((Integer)this.c(ezzp.h)).intValue());
        ezzb0.d("pre-download-validate", fagj0);
        ezzb0.e(gfsx.m(ezyy.g()));
        return ezzb0.a();
    }

    private static ezyi h() {
        return new ezyi("finished-execution", fagj.b(new fagh[0]));
    }
}

