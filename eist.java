import android.content.Context;
import com.google.android.gms.common.api.Status;

public final class eist extends eiqt {
    private final azxs a;
    private final eisu b;

    public eist(azxs azxs0, byte[] arr_b, String s) {
        super("SetAppWidePropertiesOperationCall", hlse.D);
        batl.s(azxs0);
        this.a = azxs0;
        this.b = new eisu(arr_b, s);
    }

    @Override  // eiqt
    public final hlrh b() {
        hlrg hlrg0 = (hlrg)((ProtoLiteMessage)hlrh.a).v_newBuilder();
        String s = this.b.a;
        if(s != null) {
            if(!hlrg0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hlrg0).ensureMutable();
            }
            hlrh hlrh0 = (hlrh)hlrg0.b_message;
            hlrh0.b |= 4;
            hlrh0.e = s;
        }
        return (hlrh)((ProtoLiteBuilder)hlrg0).N_build();
    }

    @Override  // eiqt
    public final void i(Context context0, eiox eiox0) {
        eisu eisu0 = this.b;
        if(hxjz.c()) {
            try(eiop eiop0 = eiox0.a().b()) {
                String s = eisu0.a;
                byte[] arr_b = eisu0.b;
                if(!eiop0.f()) {
                    eiop0.c("INSERT OR REPLACE INTO AppWideProperties(androidPackageName, appWideProperties) VALUES (?1, ?2)").g(new Object[]{s, arr_b}).d();
                }
                else if(((eioh)eiop0).g("SELECT EXISTS (\nSELECT NULL\nFROM android_packages\nWHERE name = ?1);\n").h(new Object[]{s}).g()) {
                    eiop0.c("UPDATE android_packages\nSET app_wide_properties = ?1\nWHERE name = ?2\n  AND app_wide_properties IS NOT ?1;\n").g(new Object[]{arr_b, s}).d();
                }
                else {
                    eiop0.c("INSERT INTO android_packages(name, app_wide_properties, secret, device_encrypted_secret) VALUES (?1, ?2, ?3, ?4)").g(new Object[]{s, arr_b, fplb.c(), fplb.c()}).d();
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

