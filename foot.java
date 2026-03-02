import j..util.Collection.-EL;
import j..util.Objects;
import java.util.List;

final class foot implements foob {
    final foou a;

    public foot(foou foou0) {
        Objects.requireNonNull(foou0);
        this.a = foou0;
        super();
    }

    @Override  // foob
    public final boolean a(fonn fonn0) {
        foou foou0 = this.a;
        int v = 0;
        if(((Boolean)foou0.c.get()).booleanValue()) {
            gfsx gfsx0 = foou0.a;
            if(gfsx0.i()) {
                int v1;
                for(v1 = 0; true; ++v1) {
                    if(v1 >= ((fonv)fonn0.b_message).e.size()) {
                        v1 = -1;
                        break;
                    }
                    if(((fono)((fonv)fonn0.b_message).e.get(v1)).b == 3) {
                        break;
                    }
                }
                if(v1 != -1) {
                    if(!fonn0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)fonn0).ensureMutable();
                    }
                    fonv fonv0 = (fonv)fonn0.b_message;
                    fonv0.b();
                    fonv0.e.remove(v1);
                }
                fonq fonq0 = (fonq)((ProtoLiteMessage)font.a).v_newBuilder();
                if(!fonq0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)fonq0).ensureMutable();
                }
                ((font)fonq0.b_message).e = 1;
                ((font)fonq0.b_message).b |= 2;
                hfwn hfwn0 = hfyg.b(foou0.b.d());
                if(!fonq0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)fonq0).ensureMutable();
                }
                font font0 = (font)fonq0.b_message;
                hfwn0.getClass();
                font0.d = hfwn0;
                font0.b |= 1;
                if(((Boolean)foou0.f.get()).booleanValue()) {
                    gged_interceptors gged0 = ((fpce)gfsx0.d()).a();
                    long v2 = (long)(((Long)foou0.d.get()));
                    long v3 = (long)(((Long)foou0.e.get()));
                    gged_interceptors gged1 = fopf.a(((List)Collection.-EL.stream(gged0).map(new foox()).collect(ggaf.a)), v2, v3);
                    int v4 = gged1.size();
                    while(v < v4) {
                        iddk iddk0 = (iddk)gged1.get(v);
                        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)iddc.a).v_newBuilder();
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        iddc iddc0 = (iddc)hftp0.b_message;
                        iddk0.getClass();
                        iddc0.d = iddk0;
                        iddc0.c = 3;
                        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)iddb.a).v_newBuilder();
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        iddb.b(((iddb)hftp1.b_message));
                        iddb iddb0 = (iddb)hftp1.N_build();
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        iddc iddc1 = (iddc)hftp0.b_message;
                        iddb0.getClass();
                        iddc1.e = iddb0;
                        iddc1.b |= 1;
                        fonq0.a(hftp0);
                        ++v;
                    }
                }
                else {
                    gged_interceptors gged2 = ((fpce)gfsx0.d()).b();
                    long v5 = (long)(((Long)foou0.d.get()));
                    long v6 = (long)(((Long)foou0.e.get()));
                    gged_interceptors gged3 = fopf.a(((List)Collection.-EL.stream(gged2).map(new foow()).collect(ggaf.a)), v5, v6);
                    int v7 = gged3.size();
                    while(v < v7) {
                        idbj idbj0 = (idbj)gged3.get(v);
                        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)iddc.a).v_newBuilder();
                        if(!hftp2.b_message.isImmutable()) {
                            hftp2.ensureMutable();
                        }
                        iddc iddc2 = (iddc)hftp2.b_message;
                        idbj0.getClass();
                        iddc2.d = idbj0;
                        iddc2.c = 1;
                        ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)iddb.a).v_newBuilder();
                        if(!hftp3.b_message.isImmutable()) {
                            hftp3.ensureMutable();
                        }
                        iddb.b(((iddb)hftp3.b_message));
                        iddb iddb1 = (iddb)hftp3.N_build();
                        if(!hftp2.b_message.isImmutable()) {
                            hftp2.ensureMutable();
                        }
                        iddc iddc3 = (iddc)hftp2.b_message;
                        iddb1.getClass();
                        iddc3.e = iddb1;
                        iddc3.b |= 1;
                        fonq0.a(hftp2);
                        ++v;
                    }
                }
                ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)fono.a).v_newBuilder();
                font font1 = (font)((ProtoLiteBuilder)fonq0).N_build();
                if(!hftp4.b_message.isImmutable()) {
                    hftp4.ensureMutable();
                }
                fono fono0 = (fono)hftp4.b_message;
                font1.getClass();
                fono0.c = font1;
                fono0.b = 3;
                fonn0.a(hftp4);
                return true;
            }
        }
        return false;
    }
}

