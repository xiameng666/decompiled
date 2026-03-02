import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.phenotype.ExperimentTokens;
import java.util.List;
import jeb.synthetic.TWR;

public final class eisw extends eiqt {
    private final azxs a;
    private final eisx b;

    public eisw(azxs azxs0, String s, String s1, List list0) {
        super("SetExternalExperimentsOperationCall", hlse.y);
        gftb.check(azxs0);
        this.a = azxs0;
        this.b = new eisx(s, s1, list0);
    }

    @Override  // eiqt
    public final hlrh b() {
        hlrg hlrg0 = (hlrg)((ProtoLiteMessage)hlrh.a).v_newBuilder();
        if(!hlrg0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hlrg0).ensureMutable();
        }
        eisx eisx0 = this.b;
        hlrh hlrh0 = (hlrh)hlrg0.b_message;
        eisx0.a.getClass();
        hlrh0.b |= 4;
        hlrh0.e = eisx0.a;
        if(!hlrg0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hlrg0).ensureMutable();
        }
        hlrh hlrh1 = (hlrh)hlrg0.b_message;
        hlrh1.b |= 1;
        hlrh1.c = eisx0.d;
        return (hlrh)((ProtoLiteBuilder)hlrg0).N_build();
    }

    @Override  // eiqt
    public final void i(Context context0, eiox eiox0) {
        String s4;
        gocn gocn5;
        String s3;
        eisx eisx0 = this.b;
        List list0 = eisx0.b;
        if(list0 != null) {
            try(eiop eiop0 = eiox0.a().b()) {
                if(eiop0.f()) {
                    byte[][] arr2_b = (byte[][])list0.toArray(new byte[0][]);
                    ExperimentTokens experimentTokens0 = new ExperimentTokens("", null, new byte[0][], new byte[0][], new byte[0][], new byte[0][], new int[0], null, arr2_b);
                    eiod eiod0 = ((eioh)eiop0).g("SELECT IFNULL(MAX(namespace_id), -1)\nFROM external_experiments\nWHERE namespace = ?1;\n");
                    String s8 = eisx0.c;
                    long v = eiod0.h(new Object[]{s8}).b();
                    if(v == -1L) {
                        long v1 = eisq.a(eiop0, eisx0.a);
                        eiop0.c("INSERT INTO external_experiments\n  (namespace, external_token, android_package_id)\nVALUES (?1, ?2, ?3);\n").g(new Object[]{s8, experimentTokens0.h(), v1}).d();
                    }
                    else {
                        eiop0.c("UPDATE external_experiments SET external_token=?2\nWHERE namespace_id=?1 AND external_token IS NOT ?2;\n").g(new Object[]{v, experimentTokens0.h()}).d();
                    }
                }
                else {
                    goci goci0 = (goci)((ProtoLiteMessage)gocn.a).v_newBuilder();
                    if(!goci0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)goci0).ensureMutable();
                    }
                    gocn gocn0 = (gocn)goci0.b_message;
                    gocn0.b |= 8;
                    gocn0.l = true;
                    if(!goci0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)goci0).ensureMutable();
                    }
                    ((gocn)goci0.b_message).m = 1;
                    ((gocn)goci0.b_message).b |= 16;
                    String s = eisx0.a;
                    if(!goci0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)goci0).ensureMutable();
                    }
                    gocn gocn1 = (gocn)goci0.b_message;
                    s.getClass();
                    gocn1.e = 7;
                    gocn1.f = s;
                    String s1 = eisx0.d;
                    if(!goci0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)goci0).ensureMutable();
                    }
                    String s2 = "";
                    gocn gocn2 = (gocn)goci0.b_message;
                    gocn2.b |= 1;
                    gocn2.g = s1;
                    gocn gocn3 = (gocn)((ProtoLiteBuilder)goci0).N_build();
                    if(gocn3 == null) {
                        throw new IllegalArgumentException("Null RegistrationInfo");
                    }
                    if(gocm.a(gocn3.m) == 3) {
                        gocn5 = gocn3;
                    }
                    else {
                        gdqb gdqb0 = gdsp.e("com/google/android/gms/phenotype/service/operations/RegistrationCommon", "register", 309, "Read Single Resource");
                        TWR.declareResource(gdqb0);
                        TWR.useResource$NT(gdqb0);
                        fprr fprr0 = new fprr(context0.getPackageManager());
                        if(gocn3.e == 7) {
                            TWR.useResource$NT(gdqb0);
                            s3 = (String)gocn3.f;
                        }
                        else {
                            TWR.useResource$NT(gdqb0);
                            s3 = "";
                        }
                        TWR.useResource$NT(gdqb0);
                        gocn gocn4 = fprr0.b(s3, gocn3.g);
                        gocn5 = gocn4;
                    }
                    eisn eisn0 = eisq.c(context0, eiox0, eiop0, gocn3, null, gocn5);
                    if(!eiop0.f() && !gocn3.g.startsWith("__internal.")) {
                        try {
                            s4 = gocn3.e == 7 ? ((String)gocn3.f) : "";
                            eitg.b(context0, eiop0, s4);
                        }
                        catch(eioz eioz0) {
                            String s5 = eioz0.getMessage();
                            if(s5 == null) {
                                a.e(eisq.a.j(), "Failed to create storageInfo for %s.", new gpnd(gpnc.b, gocn3.g), eioz0);
                            }
                            else if(!s5.contains("Storage info not created for GMS or Play Store")) {
                                a.e(eisq.a.j(), "Failed to create storageInfo for %s.", new gpnd(gpnc.b, gocn3.g), eioz0);
                            }
                        }
                    }
                    eisp eisp0 = eisn0.c;
                    if(eisp0.a || gocn3.l) {
                        if(!hxln.d()) {
                            eirf.a.e();
                        }
                        else if(gocn3.g.startsWith("__internal.")) {
                            eirf eirf0 = eirf.a;
                            String s6 = gocn3.g;
                            if(gocn3.e == 7) {
                                s2 = (String)gocn3.f;
                            }
                            eirf0.d(eiox0, eiop0, eipn.c(s6, s2), eisp0.b);
                        }
                        else {
                            eirf eirf1 = eirf.a;
                            String s7 = gocn3.g;
                            if(gocn3.e == 7) {
                                s2 = (String)gocn3.f;
                            }
                            eirf1.c(eiox0, eiop0, eipn.c(s7, s2), eisp0.b);
                        }
                    }
                    eiop0.c("INSERT OR REPLACE INTO ExternalExperimentTokens (packageName, experimentToken) VALUES (?, ?)").g(new Object[]{s1, new ExperimentTokens("", null, new byte[0][], new byte[0][], new byte[0][], new byte[0][], new int[0], null, ((byte[][])list0.toArray(new byte[list0.size()][]))).f()}).d();
                }
                eiop0.e();
            }
        }
        this.a.a(Status.b);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.a.a(status0);
    }
}

