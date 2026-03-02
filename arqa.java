import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public final class arqa implements arrf {
    public final arqb a;
    public final asby b;

    public arqa(arqb arqb0, asby asby0) {
        this.a = arqb0;
        this.b = asby0;
    }

    @Override  // arrf
    public final InputStream a() {
        arqb arqb0 = this.a;
        arfk arfk0 = arqb0.c;
        arfk0.c();
        asby asby0 = this.b;
        if(arqb.i(asby0.e)) {
            if(hqhq.l()) {
                hkzb hkzb0 = arqb0.f();
                arqb.a.j("Sms/mms stats before backup: %s", new Object[]{((ProtoLiteMessage)hkzb0).toString()});
                arqb0.d.q(hkzb0);
            }
            File file0 = arqb0.f.b("com.android.providers.telephony");
            try {
                arqb0.b.a(file0, arqb0.b.b);
                arqb.a.d("Telephony backup done.", new Object[0]);
                arqb0.d.i("com.android.providers.telephony", 0);
            }
            catch(aqwq aqwq0) {
                arqb.a.g("Couldn\'t get telephony data.", aqwq0, new Object[0]);
                arqb0.d.i("com.android.providers.telephony", 8);
            }
            finally {
                if(hqhq.l() && hqml.d()) {
                    hkzb hkzb1 = arqb0.f();
                    arqb.a.j("Sms/mms stats after backup: %s", new Object[]{((ProtoLiteMessage)hkzb1).toString()});
                    arqb0.d.q(hkzb1);
                }
            }
            return new FileInputStream(file0);
        }
        if(!arfk0.h(asby0.e)) {
            throw new arrg("Unable to perform backup " + asby0.e);
        }
        File file1 = arqb0.f.b(asby0.e);
        if("@pm@".equals(asby0.e)) {
            arqb0.h(file1);
        }
        return new FileInputStream(file1);
    }
}

