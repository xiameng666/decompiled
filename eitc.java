import android.content.Context;
import com.google.android.gms.common.api.Status;
import jeb.synthetic.TWR;

public final class eitc extends eiqt {
    private final azxs a;
    private final String b;
    private final eitd c;

    public eitc(azxs azxs0, String s, byte[] arr_b, String s1) {
        super("SetRuntimePropertiesOperationCall", hlse.E);
        batl.s(azxs0);
        this.a = azxs0;
        this.b = s;
        this.c = new eitd(s, arr_b, s1);
    }

    @Override  // eiqt
    public final hlrh b() {
        hlrg hlrg0 = (hlrg)((ProtoLiteMessage)hlrh.a).v_newBuilder();
        if(!hlrg0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hlrg0).ensureMutable();
        }
        eitd eitd0 = this.c;
        hlrh hlrh0 = (hlrh)hlrg0.b_message;
        eitd0.b.getClass();
        hlrh0.b |= 4;
        hlrh0.e = eitd0.b;
        String s = eitd0.a;
        if(!hlrg0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hlrg0).ensureMutable();
        }
        hlrh hlrh1 = (hlrh)hlrg0.b_message;
        s.getClass();
        hlrh1.b |= 1;
        hlrh1.c = s;
        int v = eitd0.d == 2 ? 16 : 0;
        if(!hlrg0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hlrg0).ensureMutable();
        }
        hlrh hlrh2 = (hlrh)hlrg0.b_message;
        hlrh2.b |= 0x100;
        hlrh2.j = v;
        return (hlrh)((ProtoLiteBuilder)hlrg0).N_build();
    }

    @Override  // eiqt
    public final void i(Context context0, eiox eiox0) {
        try(eiop eiop0 = eiox0.a().b()) {
            eitd eitd0 = this.c;
            String s = eitd0.b;
            eitd0.a = eipn.c(eitd0.a, s);
            if(eiop0.f()) {
                if(((eioh)eiop0).g("    SELECT NOT EXISTS (\n      SELECT NULL\n      FROM config_packages\n      INNER JOIN android_packages\n        USING (android_package_id)\n      WHERE\n        config_packages.name = ?1\n        AND android_packages.name = ?2\n    );\n").h(new Object[]{eitd0.a, s}).g()) {
                    throw new eipa(0x733F);
                }
                eitd0.d = eiop0.c("    UPDATE config_packages\n    SET runtime_properties = ?2\n    WHERE\n      name = ?1\n      AND runtime_properties IS NOT ?2;\n").g(new Object[]{eitd0.a, eitd0.c}).b() > 0 ? 2 : 3;
            }
            else {
                eiod eiod0 = ((eioh)eiop0).g("SELECT runtimeProperties = ? FROM Packages WHERE packageName = ? AND androidPackageName = ? LIMIT 1");
                byte[] arr_b = eitd0.c;
                eiok eiok0 = eiod0.h(new Object[]{arr_b, eitd0.a, s}).i();
                TWR.declareResource(eiok0);
                if(eiok0 == null) {
                    TWR.useResource$NT(null);
                    throw new eipa(0x733F);
                }
                TWR.useResource$NT(eiok0);
                if(eiok0.c() == 0L) {
                    TWR.useResource$NT(eiok0);
                    eiop0.c("UPDATE OR REPLACE Packages SET runtimeProperties = ? WHERE packageName = ?").g(new Object[]{arr_b, eitd0.a}).d();
                    eitd0.d = 2;
                }
                else {
                    TWR.useResource$NT(eiok0);
                    eitd0.d = 3;
                }
            }
            eiop0.e();
        }
        if(eitd0.d == 2) {
            String s1 = this.b;
            gnzv gnzv0 = gnzv.q;
            if(eish.a(s1, gnzv0)) {
                eitp.b(context0, gnzv0, s1);
            }
        }
        this.a.a(Status.b);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.a.a(status0);
    }
}

