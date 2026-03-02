import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public final class aifp {
    public static Set a(Set set0) {
        Set set1 = new HashSet(set0);
        if(set1.remove(bsba.a)) {
            set1.add(bsba.b);
        }
        return set1;
    }

    public static boolean b(GoogleSignInOptions googleSignInOptions0) {
        return hyel.a.b().a() ? !bbmt.e(googleSignInOptions0.c(), new Scope("https://www.googleapis.com/auth/plus.login")) : false;
    }

    public static ghon c(String s, int v, Integer integer0, GoogleSignInOptions googleSignInOptions0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ghvc.a).v_newBuilder();
        if(!TextUtils.isEmpty(s)) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ghvc ghvc0 = (ghvc)hftp0.b_message;
            s.getClass();
            ghvc0.b |= 1;
            ghvc0.c = s;
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((ghvc)hftp0.b_message).d = v - 1;
        ((ghvc)hftp0.b_message).b |= 2;
        int v1 = (int)integer0;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ghvc ghvc1 = (ghvc)hftp0.b_message;
        ghvc1.b |= 4;
        ghvc1.e = v1;
        if(googleSignInOptions0 != null) {
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)ghvd.a).v_newBuilder();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp1.b_message;
            ((ghvd)hftv0).b |= 2;
            ((ghvd)hftv0).d = false;
            if(!hftv0.isImmutable()) {
                hftp1.ensureMutable();
            }
            ProtoLiteMessage hftv1 = hftp1.b_message;
            ((ghvd)hftv1).b |= 4;
            ((ghvd)hftv1).e = false;
            if(!hftv1.isImmutable()) {
                hftp1.ensureMutable();
            }
            ghvd ghvd0 = (ghvd)hftp1.b_message;
            ghvd0.b |= 1;
            ghvd0.c = false;
            ArrayList arrayList0 = googleSignInOptions0.a();
            int v2 = arrayList0.size();
            int v4 = 0;
            for(int v3 = 0; v3 < v2; ++v3) {
                switch(((Scope)arrayList0.get(v3)).b) {
                    case "email": {
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        ghvd ghvd3 = (ghvd)hftp1.b_message;
                        ghvd3.b |= 2;
                        ghvd3.d = true;
                        break;
                    }
                    case "openid": {
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        ghvd ghvd1 = (ghvd)hftp1.b_message;
                        ghvd1.b |= 1;
                        ghvd1.c = true;
                        break;
                    }
                    case "profile": {
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        ghvd ghvd2 = (ghvd)hftp1.b_message;
                        ghvd2.b |= 4;
                        ghvd2.e = true;
                        break;
                    }
                    default: {
                        ++v4;
                    }
                }
            }
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ProtoLiteMessage hftv2 = hftp1.b_message;
            ((ghvd)hftv2).b |= 8;
            ((ghvd)hftv2).f = v4;
            boolean z = googleSignInOptions0.k;
            if(!hftv2.isImmutable()) {
                hftp1.ensureMutable();
            }
            ProtoLiteMessage hftv3 = hftp1.b_message;
            ((ghvd)hftv3).b |= 16;
            ((ghvd)hftv3).g = z;
            boolean z1 = googleSignInOptions0.l;
            if(!hftv3.isImmutable()) {
                hftp1.ensureMutable();
            }
            ProtoLiteMessage hftv4 = hftp1.b_message;
            ((ghvd)hftv4).b |= 0x20;
            ((ghvd)hftv4).h = z1;
            boolean z2 = googleSignInOptions0.m;
            if(!hftv4.isImmutable()) {
                hftp1.ensureMutable();
            }
            ghvd ghvd4 = (ghvd)hftp1.b_message;
            ghvd4.b |= 0x40;
            ghvd4.i = z2;
            ArrayList arrayList1 = googleSignInOptions0.p;
            int v5 = arrayList1.size();
            for(int v6 = 0; v6 < v5; ++v6) {
                int v7 = ((GoogleSignInOptionsExtensionParcelable)arrayList1.get(v6)).b;
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ghvd ghvd5 = (ghvd)hftp1.b_message;
                hfuf hfuf0 = ghvd5.j;
                if(!hfuf0.c()) {
                    ghvd5.j = ProtoLiteMessage.C(hfuf0);
                }
                ghvd5.j.i(v7);
            }
            ghvd ghvd6 = (ghvd)hftp1.N_build();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ghvc ghvc2 = (ghvc)hftp0.b_message;
            ghvd6.getClass();
            ghvc2.f = ghvd6;
            ghvc2.b |= 8;
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ghvc ghvc3 = (ghvc)hftp0.b_message;
        ghvc3.b |= 16;
        ghvc3.g = false;
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)ghon.a).v_newBuilder();
        ghom ghom0 = ghom.o;
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        ProtoLiteMessage hftv5 = hftp2.b_message;
        ((ghon)hftv5).e = ghom0.av;
        ((ghon)hftv5).b |= 1;
        if(!hftv5.isImmutable()) {
            hftp2.ensureMutable();
        }
        ghon ghon0 = (ghon)hftp2.b_message;
        ghvc ghvc4 = (ghvc)hftp0.N_build();
        ghvc4.getClass();
        ghon0.s = ghvc4;
        ghon0.b |= 0x10000;
        return (ghon)hftp2.N_build();
    }
}

