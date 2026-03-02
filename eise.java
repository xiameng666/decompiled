import android.content.Context;
import com.google.android.gms.common.api.Status;
import java.util.HashSet;

public final class eise extends eiqt {
    private final eiqg a;
    private final eisf b;

    public eise(eiqg eiqg0, gocn[] arr_gocn) {
        super("BulkRegisterOperationCall", hlse.d);
        batl.s(eiqg0);
        this.a = eiqg0;
        this.b = new eisf(arr_gocn);
    }

    @Override  // eiqt
    public final hlrh b() {
        gnzv gnzv0 = gnzv.a;
        eisf eisf0 = this.b;
        eisn[] arr_eisn = eisf0.b;
        String s = null;
        if(arr_eisn != null) {
            for(int v1 = 0; v1 < arr_eisn.length; ++v1) {
                eisn eisn0 = arr_eisn[v1];
                if(eisn0 != null) {
                    gnzv gnzv1 = eisn0.b;
                    if(gnzv1.x > gnzv0.x) {
                        s = eisn0.a;
                        gnzv0 = gnzv1;
                    }
                }
            }
        }
        hlrg hlrg0 = (hlrg)((ProtoLiteMessage)hlrh.a).v_newBuilder();
        if(s != null) {
            if(!hlrg0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hlrg0).ensureMutable();
            }
            hlrh hlrh0 = (hlrh)hlrg0.b_message;
            hlrh0.b |= 1;
            hlrh0.c = s;
        }
        if(hxmc.d()) {
            gocn[] arr_gocn = eisf0.a;
            for(int v = 0; v < arr_gocn.length; ++v) {
                if(arr_gocn[v].g.startsWith("com.google.android.platform.")) {
                    if(!hlrg0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)hlrg0).ensureMutable();
                    }
                    hlrh hlrh1 = (hlrh)hlrg0.b_message;
                    hlrh1.b |= 0x1000;
                    hlrh1.m = true;
                    break;
                }
            }
        }
        int v2 = gnzv0.x;
        if(!hlrg0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hlrg0).ensureMutable();
        }
        hlrh hlrh2 = (hlrh)hlrg0.b_message;
        hlrh2.b |= 0x100;
        hlrh2.j = v2;
        return (hlrh)((ProtoLiteBuilder)hlrg0).N_build();
    }

    @Override  // eiqt
    public final void i(Context context0, eiox eiox0) {
        String s9;
        String s8;
        String s7;
        String s6;
        String s4;
        gocn gocn2;
        String s2;
        int v3;
        eisf eisf0 = this.b;
        gocn[] arr_gocn = eisf0.a;
        eisn[] arr_eisn = new eisn[arr_gocn.length];
        ggfn ggfn0 = new ggfn();
        for(int v = 0; true; ++v) {
            String s = "";
            if(v >= arr_gocn.length) {
                break;
            }
            gocn gocn0 = arr_gocn[v];
            if(gocn0.e == 7) {
                s = (String)gocn0.f;
            }
            ggfn0.i(s);
        }
        gful_cronetEngineProvider gful0 = gfus.a(((gful_cronetEngineProvider)new eism(context0, ggfn0.h())));
        try(eiop eiop0 = eiox0.a().b()) {
            HashSet hashSet0 = new HashSet();
            int v2 = 0;
            for(int v1 = 0; true; ++v1) {
                v3 = 1;
                if(v1 >= arr_gocn.length) {
                    break;
                }
                gocn gocn1 = arr_gocn[v1];
                if(gocm.a(gocn1.m) == 3) {
                    gocn2 = gocn1;
                }
                else {
                    ggeo ggeo0 = (ggeo)gful0.mr();
                    String s1 = gocn1.g;
                    s2 = gocn1.e == 7 ? ((String)gocn1.f) : "";
                    gocn2 = (gocn)ggeo0.get(new eiso(s1, s2));
                }
                try {
                    eisn eisn0 = eisq.c(context0, eiox0, eiop0, gocn1, null, gocn2);
                    arr_eisn[v1] = eisn0;
                    if(!eisn0.c.a && !gocn1.l) {
                        v3 = 0;
                    }
                    v2 |= v3;
                    if(hxln.d() && (arr_eisn[v1].c.a || gocn1.l)) {
                        if(gocn1.g.startsWith("__internal.")) {
                            eirf eirf0 = eirf.a;
                            String s3 = gocn1.g;
                            s4 = gocn1.e == 7 ? ((String)gocn1.f) : "";
                            eirf0.d(eiox0, eiop0, eipn.c(s3, s4), arr_eisn[v1].c.b);
                        }
                        else {
                            eirf eirf1 = eirf.a;
                            String s5 = gocn1.g;
                            s6 = gocn1.e == 7 ? ((String)gocn1.f) : "";
                            eirf1.c(eiox0, eiop0, eipn.c(s5, s6), arr_eisn[v1].c.b);
                        }
                    }
                    if(!eiop0.f()) {
                        s7 = gocn1.e == 7 ? ((String)gocn1.f) : "";
                        if(!hashSet0.contains(s7)) {
                            s8 = gocn1.e == 7 ? ((String)gocn1.f) : "";
                            eitg.b(context0, eiop0, s8);
                            s9 = gocn1.e == 7 ? ((String)gocn1.f) : "";
                            hashSet0.add(s9);
                        }
                    }
                }
                catch(eipa | eioz exception0) {
                    String s10 = exception0.getMessage();
                    if(s10 == null) {
                        ((ggtj)((ggtj)eisq.a.j()).s(exception0)).B("Failed to register %s. Continuing bulk register.", new gpnd(gpnc.b, gocn1.g));
                    }
                    else if(!s10.contains("Storage info not created for GMS or Play Store")) {
                        ((ggtj)((ggtj)eisq.a.j()).s(exception0)).B("Failed to register %s. Continuing bulk register.", new gpnd(gpnc.b, gocn1.g));
                    }
                }
            }
            eiop0.e();
        }
        if(v2 != 0 && !hxln.d()) {
            eirf.a.e();
        }
        eisf0.b = arr_eisn;
        eisn[] arr_eisn1 = eisf0.b;
        gnzv gnzv0 = gnzv.a;
        String s11 = null;
        gnzv gnzv1 = gnzv0;
        for(int v4 = 0; v4 < arr_eisn1.length; ++v4) {
            eisn eisn1 = arr_eisn1[v4];
            if(eisn1 == null) {
                v3 = 0;
            }
            else {
                gnzv gnzv2 = eisn1.b;
                if(gnzv2.x > gnzv1.x) {
                    String s12 = eisn1.a;
                    if(eish.a(s12, gnzv2)) {
                        s11 = s12;
                        gnzv1 = gnzv2;
                    }
                }
            }
        }
        if(gnzv1 != gnzv0) {
            eitp.b(context0, gnzv1, s11);
        }
        if(v3 == 0) {
            Status status0 = new Status(29507);
            this.a.j(status0);
            return;
        }
        this.a.j(Status.b);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.a.j(status0);
    }

    @Override  // eiqt
    public final hlrh[] l() {
        eisf eisf0 = this.b;
        if(hxmc.d()) {
            gocn[] arr_gocn = eisf0.a;
            int v1 = 0;
            for(int v = 0; v < arr_gocn.length; ++v) {
                if(!arr_gocn[v].g.startsWith("com.google.android.platform.")) {
                    ++v1;
                }
            }
            hlrh[] arr_hlrh = new hlrh[v1];
            int v3 = 0;
            for(int v2 = 0; v2 < arr_gocn.length; ++v2) {
                gocn gocn0 = arr_gocn[v2];
                if(!gocn0.g.startsWith("com.google.android.platform.")) {
                    hlrg hlrg0 = (hlrg)((ProtoLiteMessage)hlrh.a).v_newBuilder();
                    String s = gocn0.g;
                    if(!hlrg0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)hlrg0).ensureMutable();
                    }
                    hlrh hlrh0 = (hlrh)hlrg0.b_message;
                    s.getClass();
                    hlrh0.b |= 1;
                    hlrh0.c = s;
                    int v4 = gocn0.c == 2 ? ((int)(((Integer)gocn0.d))) : 0;
                    if(!hlrg0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)hlrg0).ensureMutable();
                    }
                    hlrh hlrh1 = (hlrh)hlrg0.b_message;
                    hlrh1.b |= 2;
                    hlrh1.d = v4;
                    hlrg0.a(gocn0.i);
                    hlrg0.k(gocn0.j);
                    int v5 = gock.a(gocn0.n) == 0 ? 1 : gock.a(gocn0.n);
                    if(!hlrg0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)hlrg0).ensureMutable();
                    }
                    ((hlrh)hlrg0.b_message).l = v5 - 1;
                    ((hlrh)hlrg0.b_message).b |= 0x800;
                    arr_hlrh[v3] = (hlrh)((ProtoLiteBuilder)hlrg0).N_build();
                    ++v3;
                }
            }
            return arr_hlrh;
        }
        gocn[] arr_gocn1 = eisf0.a;
        hlrh[] arr_hlrh1 = new hlrh[arr_gocn1.length];
        int v6 = 0;
        for(int v7 = 0; v6 < arr_gocn1.length; ++v7) {
            gocn gocn1 = arr_gocn1[v6];
            hlrg hlrg1 = (hlrg)((ProtoLiteMessage)hlrh.a).v_newBuilder();
            String s1 = gocn1.g;
            if(!hlrg1.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hlrg1).ensureMutable();
            }
            hlrh hlrh2 = (hlrh)hlrg1.b_message;
            s1.getClass();
            hlrh2.b |= 1;
            hlrh2.c = s1;
            int v8 = gocn1.c == 2 ? ((int)(((Integer)gocn1.d))) : 0;
            if(!hlrg1.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hlrg1).ensureMutable();
            }
            hlrh hlrh3 = (hlrh)hlrg1.b_message;
            hlrh3.b |= 2;
            hlrh3.d = v8;
            hlrg1.a(gocn1.i);
            hlrg1.k(gocn1.j);
            int v9 = gock.a(gocn1.n) == 0 ? 1 : gock.a(gocn1.n);
            if(!hlrg1.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hlrg1).ensureMutable();
            }
            ((hlrh)hlrg1.b_message).l = v9 - 1;
            ((hlrh)hlrg1.b_message).b |= 0x800;
            arr_hlrh1[v7] = (hlrh)((ProtoLiteBuilder)hlrg1).N_build();
            ++v6;
        }
        return arr_hlrh1;
    }
}

