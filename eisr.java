import android.content.Context;
import com.google.android.gms.common.api.Status;
import jeb.synthetic.TWR;

public final class eisr extends eiqt {
    private final eiqg a;
    private final String b;
    private final eiss c;

    public eisr(eiqg eiqg0, String s, byte[] arr_b, String s1) {
        super("SetAppSpecificPropertiesOperationCall", hlse.e);
        batl.s(eiqg0);
        this.a = eiqg0;
        this.b = s;
        this.c = new eiss(s, arr_b, s1);
    }

    @Override  // eiqt
    public final hlrh b() {
        hlrg hlrg0 = (hlrg)((ProtoLiteMessage)hlrh.a).v_newBuilder();
        eiss eiss0 = this.c;
        String s = eiss0.c;
        if(!hlrg0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hlrg0).ensureMutable();
        }
        hlrh hlrh0 = (hlrh)hlrg0.b_message;
        s.getClass();
        hlrh0.b |= 1;
        hlrh0.c = s;
        int v = eiss0.d == 1 ? 16 : 0;
        if(!hlrg0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hlrg0).ensureMutable();
        }
        hlrh hlrh1 = (hlrh)hlrg0.b_message;
        hlrh1.b |= 0x100;
        hlrh1.j = v;
        return (hlrh)((ProtoLiteBuilder)hlrg0).N_build();
    }

    @Override  // eiqt
    public final void i(Context context0, eiox eiox0) {
        int v1;
        int v;
        eiss eiss0;
        eiop eiop0;
        try(eiop0 = eiox0.a().b()) {
            eiss0 = this.c;
            String s = eiss0.a;
            eiss0.c = eipn.c(eiss0.c, s);
            if(eiop0.f()) {
                if(((eioh)eiop0).g("    SELECT NOT EXISTS(\n      SELECT NULL\n      FROM config_packages\n      INNER JOIN android_packages\n        USING (android_package_id)\n      WHERE\n        config_packages.name = ?1\n        AND android_packages.name = ?2\n    );\n").h(new Object[]{eiss0.c, s}).g()) {
                    throw new eipa(0x733F);
                }
            }
            else if(((eioh)eiop0).g("SELECT NOT EXISTS(SELECT NULL FROM Packages WHERE packageName = ? AND androidPackageName = ?)").h(new Object[]{eiss0.c, s}).g()) {
                throw new eipa(0x733F);
            }
            v = eiop0.f() ? eiop0.c("    UPDATE config_packages\n    SET dynamic_params = CASE\n      WHEN (params IS ?1) AND dynamic_params NOT NULL THEN NULL\n      ELSE ?1\n      END\n    WHERE\n      name = ?2\n      AND CASE\n        WHEN params IS ?1 THEN dynamic_params NOT NULL\n        ELSE NOT (dynamic_params IS ?1)\n      END;\n").g(new Object[]{eiss0.b, eiss0.c}).b() : eiop0.c("UPDATE Packages\nSET dynamicParams = CASE\n  WHEN (params IS ?1) AND dynamicParams NOT NULL THEN\n    NULL\n  ELSE\n    ?1\n  END\nWHERE\n  packageName = ?2\n  AND\n  CASE \n    WHEN params IS ?1 THEN\n      dynamicParams NOT NULL\n    ELSE \n      NOT (dynamicParams IS ?1)\n   END").g(new Object[]{eiss0.b, eiss0.c}).b();
            eiop0.e();
        }
        v1 = v == 0 ? 2 : 1;
        TWR.useResource$NT(eiop0);
        eiss0.d = v1;
        if(v1 == 1) {
            String s1 = this.b;
            gnzv gnzv0 = gnzv.q;
            if(eish.a(s1, gnzv0)) {
                eitp.b(context0, gnzv0, s1);
            }
        }
        this.a.k(Status.b);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.a.k(status0);
    }
}

