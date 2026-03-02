import android.content.Context;
import android.os.TransactionTooLargeException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.phenotype.Configuration;
import com.google.android.gms.phenotype.Configurations;
import com.google.android.gms.phenotype.Flag;
import java.util.ArrayList;
import jeb.synthetic.TWR;

public final class eirh extends eiqt {
    public static final int a;
    private static final gful_cronetEngineProvider b;
    private final eiqg c;
    private final eirj d;
    private final String e;

    static {
        eirh.b = gfus.a(((gful_cronetEngineProvider)new eirg()));
    }

    public eirh(eiqg eiqg0, String s, String s1) {
        super("GetCommittedConfigurationOperationCall", hlse.o);
        batl.s(eiqg0);
        this.c = eiqg0;
        this.d = new eirj(s, s1);
        this.e = s;
    }

    @Override  // eiqt
    public final hlrh b() {
        hlrg hlrg0 = (hlrg)((ProtoLiteMessage)hlrh.a).v_newBuilder();
        String s = this.d.a;
        if(s != null) {
            if(!hlrg0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hlrg0).ensureMutable();
            }
            hlrh hlrh0 = (hlrh)hlrg0.b_message;
            hlrh0.b |= 1;
            hlrh0.c = s;
        }
        return (hlrh)((ProtoLiteBuilder)hlrg0).N_build();
    }

    @Override  // eiqt
    public final void i(Context context0, eiox eiox0) {
        Configurations configurations0;
        String s1;
        eirj eirj0 = this.d;
        if(eirj0.a != null) {
            try(eiog eiog0 = eiox0.a().a()) {
                String s = "SELECT config_packages.name, config_packages.version, android_packages.name\nFROM config_packages\nINNER JOIN android_packages\n    USING (android_package_id);\n";
                eirj0.a = eipn.c(eirj0.a, eirj0.b);
                if("all".equals(eirj0.a)) {
                    if(!eiog0.f()) {
                        s = "SELECT packageName, version, androidPackageName FROM Packages;";
                    }
                    eioe eioe0 = ((eioh)eiog0).g(s).e(new String[]{"Packages", "config_packages"}).f();
                    TWR.declareResource(eioe0);
                    TWR.useResource$NT(eioe0);
                    ArrayList arrayList0 = new ArrayList();
                    while(true) {
                        TWR.useResource$NT(eioe0);
                        if(!eioe0.b()) {
                            break;
                        }
                        TWR.useResource$NT(eioe0);
                        goci goci0 = (goci)((ProtoLiteMessage)gocn.a).v_newBuilder();
                        String s2 = eioe0.g(0);
                        gftb.check(s2);
                        if(!goci0.b_message.isImmutable()) {
                            TWR.useResource$NT(eioe0);
                            ((ProtoLiteBuilder)goci0).ensureMutable();
                        }
                        TWR.useResource$NT(eioe0);
                        gocn gocn0 = (gocn)goci0.b_message;
                        gocn0.b |= 1;
                        gocn0.g = s2;
                        int v = (int)eioe0.f(1);
                        if(!goci0.b_message.isImmutable()) {
                            TWR.useResource$NT(eioe0);
                            ((ProtoLiteBuilder)goci0).ensureMutable();
                        }
                        TWR.useResource$NT(eioe0);
                        ((gocn)goci0.b_message).c = 2;
                        ((gocn)goci0.b_message).d = v;
                        String s3 = eioe0.g(2);
                        gftb.check(s3);
                        if(!goci0.b_message.isImmutable()) {
                            TWR.useResource$NT(eioe0);
                            ((ProtoLiteBuilder)goci0).ensureMutable();
                        }
                        TWR.useResource$NT(eioe0);
                        ((gocn)goci0.b_message).e = 7;
                        ((gocn)goci0.b_message).f = s3;
                        gocn gocn1 = (gocn)((ProtoLiteBuilder)goci0).N_build();
                        arrayList0.add(new Flag(gocn1.g, gocn1.toBytesArray(), 0));
                    }
                    TWR.useResource$NT(eioe0);
                    configurations0 = new Configurations("", "", new Configuration[]{new Configuration(0, ((Flag[])arrayList0.toArray(new Flag[0])), new String[0])}, false, null, 0L);
                }
                else {
                    s1 = eiog0.f() ? "SELECT EXISTS (SELECT NULL FROM config_packages WHERE name = ?1);" : "SELECT EXISTS (SELECT NULL FROM Packages WHERE packageName=?)";
                    if(!((eioh)eiog0).g(s1).h(new Object[]{eirj0.a}).g()) {
                        throw new eipa(0x733F);
                    }
                    configurations0 = eiog0.f() ? eirj.b(eiog0, eirj0.a, true) : eirj.a(eiog0, eirj0.a);
                }
                eiog0.e();
            }
            try {
                this.c.e(Status.b, configurations0);
                return;
            }
            catch(TransactionTooLargeException transactionTooLargeException0) {
                ((ggtj)((bboh)eirh.b.mr()).i()).B("Configuration snapshot too large %s", new gpnd(gpnc.b, this.e));
                throw new eioz(0x7349, "Committed configuration snapshot too large. See go/ph-configuration-snapshot-too-large. Config package: " + this.e, transactionTooLargeException0);
            }
        }
        throw new eipa(29500, "No package name");
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.c.e(status0, null);
    }
}

