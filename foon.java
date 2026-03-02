import android.os.Build.VERSION;
import j..util.Objects;

final class foon implements foob {
    final fooo a;

    public foon(fooo fooo0) {
        Objects.requireNonNull(fooo0);
        this.a = fooo0;
        super();
    }

    @Override  // foob
    public final boolean a(fonn fonn0) {
        fooo fooo0 = this.a;
        if(!((Boolean)fooo0.d.get()).booleanValue()) {
            return false;
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)fonu.a).v_newBuilder();
        fotw fotw0 = (fotw)fooo0.a;
        if(fotw0.a() != null) {
            String s = fotw0.a();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            fonu fonu0 = (fonu)hftp0.b_message;
            s.getClass();
            fonu0.b |= 1;
            fonu0.c = s;
        }
        fotu fotu0 = (fotu)fooo0.b;
        if(((int)fotu0.a()) > 0) {
            int v = (int)fotu0.a();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            fonu fonu1 = (fonu)hftp0.b_message;
            fonu1.b |= 2;
            fonu1.d = v;
        }
        ibnf ibnf0 = fooo0.c;
        if(((int)(((Integer)ibnf0.get()))) > 0) {
            int v1 = (int)(((Integer)ibnf0.get()));
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            fonu fonu2 = (fonu)hftp0.b_message;
            fonu2.b |= 4;
            fonu2.e = v1;
        }
        int v2 = Build.VERSION.SDK_INT;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        fonu fonu3 = (fonu)hftp0.b_message;
        fonu3.b |= 8;
        fonu3.f = v2;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)fono.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        fono fono0 = (fono)hftp1.b_message;
        fonu fonu4 = (fonu)hftp0.N_build();
        fonu4.getClass();
        fono0.c = fonu4;
        fono0.b = 4;
        fono fono1 = (fono)hftp1.N_build();
        if(!fonn0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)fonn0).ensureMutable();
        }
        fonv fonv0 = (fonv)fonn0.b_message;
        fono1.getClass();
        fonv0.b();
        fonv0.e.add(fono1);
        return true;
    }
}

