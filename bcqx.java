import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.auth.UserRecoverableAuthException;
import j..util.Collection.-EL;
import j..util.DesugarCollections;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public final class bcqx {
    public static final baun a;
    private static WeakReference b;
    private final bcqw c;

    static {
        bcqx.b = new WeakReference(null);
        bcqx.a = bcrh.a("usage_statistics");
    }

    private bcqx(Context context0) {
        this.c = new bcqw(context0, new aytt(context0.getApplicationContext(), "CONSTELLATION").a(), new azts(context0, new faig()));
    }

    public final void A(bcrd bcrd0) {
        gmfc gmfc0 = (gmfc)((ProtoLiteMessage)gmfd.a).v_newBuilder();
        if(!gmfc0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gmfc0).ensureMutable();
        }
        ((gmfd)gmfc0.b_message).c = 4;
        ((gmfd)gmfc0.b_message).b |= 1;
        gmfd gmfd0 = (gmfd)((ProtoLiteBuilder)gmfc0).N_build();
        this.D(bcrd0, gmfz.h, gmfd0);
    }

    public final void B(bcrd bcrd0, hoei hoei0) {
        gmfz gmfz0 = gmfz.i;
        gmfc gmfc0 = (gmfc)((ProtoLiteMessage)gmfd.a).v_newBuilder();
        if(!gmfc0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gmfc0).ensureMutable();
        }
        ((gmfd)gmfc0.b_message).c = 4;
        boolean z = true;
        ((gmfd)gmfc0.b_message).b |= 1;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gmel.a).v_newBuilder();
        hodu hodu0 = hoei0.c == null ? hodu.a : hoei0.c;
        boolean z1 = (hodo.b(hodu0.b) == null ? hodo.e : hodo.b(hodu0.b)) == hodo.b;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gmel)hftv0).b |= 1;
        ((gmel)hftv0).c = z1;
        switch(hodr.a((hoei0.c == null ? hodu.a : hoei0.c).c)) {
            case 0: {
                z = false;
                break;
            }
            case 3: {
                break;
            }
            default: {
                z = false;
            }
        }
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        gmel gmel0 = (gmel)hftp0.b_message;
        gmel0.b |= 2;
        gmel0.d = z;
        if(!gmfc0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gmfc0).ensureMutable();
        }
        gmfd gmfd0 = (gmfd)gmfc0.b_message;
        gmel gmel1 = (gmel)hftp0.N_build();
        gmel1.getClass();
        gmfd0.d = gmel1;
        gmfd0.b |= 2;
        this.D(bcrd0, gmfz0, ((gmfd)((ProtoLiteBuilder)gmfc0).N_build()));
    }

    public final void C(bcrd bcrd0, Throwable throwable0, gmfd gmfd0, hofs hofs0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)gmfd0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)gmfd0));
        if(hofs0 != null) {
            if(!((gmfc)hftp0).b_message.isImmutable()) {
                ((ProtoLiteBuilder)(((gmfc)hftp0))).ensureMutable();
            }
            ((gmfd)((gmfc)hftp0).b_message).e = hfvv.a;
            ((gmfc)hftp0).a(bcqx.O(hofs0));
        }
        ProtoLiteBuilder hftp1 = bcqx.M(throwable0);
        this.r(bcqx.Z(bcrd0.a, gmfz.j, null, ((gmfc)hftp0), hftp1));
    }

    public final void D(bcrd bcrd0, gmfz gmfz0, gmfd gmfd0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)gmfd0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)gmfd0));
        this.r(bcqx.R(bcrd0.a, gmfz0, ((gmfc)hftp0)));
    }

    public final void E(bcrd bcrd0, hofk hofk0) {
        gmfc gmfc0 = (gmfc)((ProtoLiteMessage)gmfd.a).v_newBuilder();
        if(!gmfc0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gmfc0).ensureMutable();
        }
        ((gmfd)gmfc0.b_message).c = 5;
        ((gmfd)gmfc0.b_message).b |= 1;
        if(hofk0.d.size() > 0) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gmek.a).v_newBuilder();
            hoev hoev0 = hofk0.c == null ? hoev.a : hofk0.c;
            int v = 2;
            switch((hoev0.c == null ? hodi.a : hoev0.c).o) {
                case 0: {
                    break;
                }
                case 1: {
                    v = 3;
                    break;
                }
                case 2: {
                    v = 4;
                    break;
                }
                default: {
                    v = 0;
                }
            }
            if(v == 0) {
                v = 1;
            }
            int v1 = gmej.a(hodh.a(v));
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gmek gmek0 = (gmek)hftp0.b_message;
            if(v1 == 0) {
                throw null;
            }
            gmek0.c = v1 - 1;
            gmek0.b |= 1;
            if(!gmfc0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)gmfc0).ensureMutable();
            }
            gmfd gmfd0 = (gmfd)gmfc0.b_message;
            gmek gmek1 = (gmek)hftp0.N_build();
            gmek1.getClass();
            gmfd0.h = gmek1;
            gmfd0.b |= 8;
            for(Object object0: hofk0.d) {
                gmfc0.a(bcqx.O(((hofs)object0)));
            }
        }
        gmfd gmfd1 = (gmfd)((ProtoLiteBuilder)gmfc0).N_build();
        this.D(bcrd0, gmfz.h, gmfd1);
    }

    public final void F(bcrd bcrd0, hofl hofl0) {
        gmfc gmfc0 = (gmfc)((ProtoLiteMessage)gmfd.a).v_newBuilder();
        if(!gmfc0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gmfc0).ensureMutable();
        }
        ((gmfd)gmfc0.b_message).c = 5;
        ((gmfd)gmfc0.b_message).b |= 1;
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: hofl0.d) {
            hofv hofv0 = (hofv)object0;
            if((hofv0.b & 2) != 0) {
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gmef.a).v_newBuilder();
                gmfx gmfx0 = gmfx.b((hofv0.d == null ? hebz.a : hofv0.d).c);
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gmef gmef0 = (gmef)hftp0.b_message;
                gmef0.c = gmfx0.a();
                gmef0.b |= 1;
                String s = (hofv0.d == null ? hebz.a : hofv0.d).d;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gmef gmef1 = (gmef)hftp0.b_message;
                s.getClass();
                gmef1.b |= 2;
                gmef1.d = s;
                arrayList0.add(((gmef)hftp0.N_build()));
            }
            gmfc0.a(bcqx.O((hofv0.c == null ? hofs.a : hofv0.c)));
        }
        if((hofl0.b & 2) != 0 && ((hofl0.e == null ? hogd.a : hofl0.e).b & 1) != 0) {
            hogd hogd0 = hofl0.e == null ? hogd.a : hofl0.e;
            long v = bcql.a((hogd0.c == null ? hfwn.a : hogd0.c));
            if(!gmfc0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)gmfc0).ensureMutable();
            }
            gmfd gmfd0 = (gmfd)gmfc0.b_message;
            gmfd0.b |= 4;
            gmfd0.f = v;
        }
        if(!arrayList0.isEmpty()) {
            if(!gmfc0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)gmfc0).ensureMutable();
            }
            gmfd gmfd1 = (gmfd)gmfc0.b_message;
            hfuo hfuo0 = gmfd1.g;
            if(!hfuo0.c()) {
                gmfd1.g = ProtoLiteMessage.E(hfuo0);
            }
            hfrj.E(arrayList0, gmfd1.g);
        }
        gmfd gmfd2 = (gmfd)((ProtoLiteBuilder)gmfc0).N_build();
        this.D(bcrd0, gmfz.i, gmfd2);
    }

    public static boolean G(gmfd gmfd0) {
        return bcqx.I(gmfd0.e);
    }

    public static boolean H(gmfh gmfh0) {
        return (gmfh0.b & 1) != 0 || (gmfh0.b & 2) != 0 || gmfh0.f.size() > 0 || ((gmfh0.b & 16) != 0 || (gmfh0.b & 0x20) != 0);
    }

    public static boolean I(List list0) {
        return Collection.-EL.stream(list0).anyMatch(new bcqs());
    }

    public final void J(UUID uUID0, int v, Throwable throwable0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gmef.a).v_newBuilder();
        if((throwable0 instanceof bcrc)) {
            gmfx gmfx0 = ((bcrc)throwable0).a;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gmef gmef0 = (gmef)hftp0.b_message;
            gmef0.c = gmfx0.a();
            gmef0.b |= 1;
        }
        else {
            gmfx gmfx1 = gmfx.P;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gmef gmef1 = (gmef)hftp0.b_message;
            gmef1.c = gmfx1.a();
            gmef1.b |= 1;
        }
        if(!TextUtils.isEmpty(throwable0.getMessage())) {
            String s = throwable0.getMessage();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gmef gmef2 = (gmef)hftp0.b_message;
            s.getClass();
            gmef2.b |= 2;
            gmef2.d = s;
        }
        String s1 = uUID0.toString();
        gmfz gmfz0 = gmfz.d;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gmed.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gmed gmed0 = (gmed)hftp1.b_message;
        gmed0.c = gmgy.a(v);
        gmed0.b |= 1;
        gmen gmen0 = (gmen)((ProtoLiteMessage)gmeo.a).v_newBuilder();
        if(!gmen0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gmen0).ensureMutable();
        }
        gmeo gmeo0 = (gmeo)gmen0.b_message;
        s1.getClass();
        gmeo0.b |= 1;
        gmeo0.c = s1;
        if(!gmen0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gmen0).ensureMutable();
        }
        ((gmeo)gmen0.b_message).d = 1;
        ((gmeo)gmen0.b_message).b |= 2;
        gmeg gmeg0 = (gmeg)((ProtoLiteMessage)gmeh.a).v_newBuilder();
        if(!gmeg0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gmeg0).ensureMutable();
        }
        gmeh gmeh0 = (gmeh)gmeg0.b_message;
        gmeh0.c = gmfz0.a();
        gmeh0.b |= 1;
        if(!gmeg0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gmeg0).ensureMutable();
        }
        gmeh gmeh1 = (gmeh)gmeg0.b_message;
        gmed gmed1 = (gmed)hftp1.N_build();
        gmed1.getClass();
        gmeh1.e = gmed1;
        gmeh1.b |= 4;
        if(!gmeg0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gmeg0).ensureMutable();
        }
        gmeh gmeh2 = (gmeh)gmeg0.b_message;
        gmef gmef3 = (gmef)hftp0.N_build();
        gmef3.getClass();
        gmeh2.g = gmef3;
        gmeh2.b |= 16;
        gmen0.a(gmeg0);
        this.r(((gmeo)((ProtoLiteBuilder)gmen0).N_build()));
    }

    public final void K(UUID uUID0, int v, boolean z) {
        String s = uUID0.toString();
        gmfz gmfz0 = gmfz.c;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gmed.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gmed gmed0 = (gmed)hftp0.b_message;
        gmed0.c = gmgy.a(v);
        gmed0.b |= 1;
        gmgd gmgd0 = z ? gmgd.c : gmgd.b;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gmed gmed1 = (gmed)hftp0.b_message;
        gmed1.d = gmgd0.a();
        gmed1.b |= 2;
        this.r(bcqx.N(s, gmfz0, hftp0));
    }

    public final void L(UUID uUID0, int v) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gmed.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gmed gmed0 = (gmed)hftp0.b_message;
        gmed0.c = gmgy.a(v);
        gmed0.b |= 1;
        this.r(bcqx.N(uUID0.toString(), gmfz.b, hftp0));
    }

    static ProtoLiteBuilder M(Throwable throwable0) {
        gmfx gmfx0 = gmfx.aA;
        if((throwable0 instanceof iapl)) {
            gmfx0 = gmfx.b(((iapl)throwable0).a.t.r);
        }
        else if(!(throwable0 instanceof acse)) {
            if((throwable0 instanceof IOException)) {
                gmfx0 = gmfx.C;
            }
            else if((throwable0 instanceof azqj)) {
                gmfx0 = gmfx.D;
            }
            else if((throwable0 instanceof azqi)) {
                gmfx0 = gmfx.E;
            }
            else if((throwable0 instanceof RemoteException)) {
                gmfx0 = gmfx.F;
            }
            else if((throwable0 instanceof InvocationTargetException)) {
                gmfx0 = gmfx.x;
            }
            else if((throwable0 instanceof NoSuchMethodException)) {
                gmfx0 = gmfx.y;
            }
            else if((throwable0 instanceof IllegalAccessException)) {
                gmfx0 = gmfx.z;
            }
            else if((throwable0 instanceof fprv)) {
                gmfx0 = gmfx.A;
            }
            else if((throwable0 instanceof InvalidKeyException)) {
                gmfx0 = gmfx.L;
            }
            else if((throwable0 instanceof SignatureException)) {
                gmfx0 = gmfx.M;
            }
            else if((throwable0 instanceof NoSuchAlgorithmException)) {
                gmfx0 = gmfx.J;
            }
            else if((throwable0 instanceof NoSuchProviderException)) {
                gmfx0 = gmfx.K;
            }
            else if((throwable0 instanceof SecurityException)) {
                gmfx0 = gmfx.aD;
            }
            else if((throwable0 instanceof InvalidKeySpecException)) {
                gmfx0 = gmfx.N;
            }
            else if((throwable0 instanceof bcrb)) {
                gmfx0 = gmfx.s;
            }
            else if((throwable0 instanceof bcqz)) {
                gmfx0 = gmfx.t;
            }
            else if((throwable0 instanceof bcrc)) {
                gmfx0 = ((bcrc)throwable0).a;
            }
            else if((throwable0 instanceof InterruptedException)) {
                gmfx0 = gmfx.aE;
            }
            else if((throwable0 instanceof ExecutionException)) {
                gmfx0 = gmfx.aF;
            }
            else if((throwable0 instanceof TimeoutException)) {
                gmfx0 = gmfx.aG;
            }
        }
        else if((throwable0 instanceof UserRecoverableAuthException)) {
            gmfx0 = gmfx.H;
        }
        else {
            gmfx0 = gmfx.G;
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gmef.a).v_newBuilder();
        String s = (String)MoreObjects.firstNonNull(throwable0.getMessage(), "");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gmef)hftv0).b |= 2;
        ((gmef)hftv0).d = s;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        gmef gmef0 = (gmef)hftp0.b_message;
        gmef0.c = gmfx0.a();
        gmef0.b |= 1;
        return hftp0;
    }

    public static gmeo N(String s, gmfz gmfz0, ProtoLiteBuilder hftp0) {
        return bcqx.X(s, gmfz0, null, hftp0);
    }

    public static final gmfk O(hofs hofs0) {
        int v12;
        int v6;
        int v5;
        int v4;
        int v2;
        gmfh gmfh0;
        String s;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gmfk.a).v_newBuilder();
        if(hofs0 != null) {
            switch((hofs0.e == null ? hoft.a : hofs0.e).b) {
                case 1: {
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ((gmfk)hftp0.b_message).d = 1;
                    ((gmfk)hftp0.b_message).b |= 2;
                    hoft hoft0 = hofs0.e == null ? hoft.a : hofs0.e;
                    hofa hofa0 = hoft0.b == 1 ? ((hofa)hoft0.c) : hofa.a;
                    if((hofa0.c == null ? hofc.a : hofa0.c).b.size() > 0) {
                        hoft hoft1 = hofs0.e == null ? hoft.a : hofs0.e;
                        hofa hofa1 = hoft1.b == 1 ? ((hofa)hoft1.c) : hofa.a;
                        s = (String)(hofa1.c == null ? hofc.a : hofa1.c).b.get(0);
                    }
                    else {
                        s = null;
                    }
                    if((hofs0.b & 2) != 0) {
                        hoft hoft2 = hofs0.e == null ? hoft.a : hofs0.e;
                        hofa hofa2 = hoft2.b == 1 ? ((hofa)hoft2.c) : hofa.a;
                        hogi hogi0 = hofs0.g == null ? hogi.a : hofs0.g;
                        if(hogi0 == null) {
                            gmfh0 = null;
                        }
                        else {
                            gmfg gmfg0 = (gmfg)((ProtoLiteMessage)gmfh.a).v_newBuilder();
                            if(!hrel.f()) {
                                String s1 = (hofa2.c == null ? hofc.a : hofa2.c).c;
                                if(!TextUtils.isEmpty(s1)) {
                                    if(!gmfg0.b_message.isImmutable()) {
                                        ((ProtoLiteBuilder)gmfg0).ensureMutable();
                                    }
                                    gmfh gmfh1 = (gmfh)gmfg0.b_message;
                                    s1.getClass();
                                    gmfh1.b |= 1;
                                    gmfh1.c = s1;
                                }
                                if(!TextUtils.isEmpty(s)) {
                                    String s2 = bcqx.U(s);
                                    if(!gmfg0.b_message.isImmutable()) {
                                        ((ProtoLiteBuilder)gmfg0).ensureMutable();
                                    }
                                    gmfh gmfh2 = (gmfh)gmfg0.b_message;
                                    s2.getClass();
                                    gmfh2.b |= 2;
                                    gmfh2.d = s2;
                                    if(!gmfg0.b_message.isImmutable()) {
                                        ((ProtoLiteBuilder)gmfg0).ensureMutable();
                                    }
                                    gmfh gmfh3 = (gmfh)gmfg0.b_message;
                                    s.getClass();
                                    hfuo hfuo0 = gmfh3.f;
                                    if(!hfuo0.c()) {
                                        gmfh3.f = ProtoLiteMessage.E(hfuo0);
                                    }
                                    gmfh3.f.add(s);
                                }
                            }
                            if((hofa2.b & 2) != 0) {
                                int v = (hofa2.d == null ? hofd.a : hofa2.d).c;
                                if(!gmfg0.b_message.isImmutable()) {
                                    ((ProtoLiteBuilder)gmfg0).ensureMutable();
                                }
                                gmfh gmfh4 = (gmfh)gmfg0.b_message;
                                gmfh4.b |= 8;
                                gmfh4.h = v;
                                int v1 = (hofa2.d == null ? hofd.a : hofa2.d).b;
                                if(!gmfg0.b_message.isImmutable()) {
                                    ((ProtoLiteBuilder)gmfg0).ensureMutable();
                                }
                                gmfh gmfh5 = (gmfh)gmfg0.b_message;
                                gmfh5.b |= 4;
                                gmfh5.g = v1;
                            }
                            gmff gmff0 = gmff.a;
                            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gmff0).v_newBuilder();
                            if(!hftp1.b_message.isImmutable()) {
                                hftp1.ensureMutable();
                            }
                            ProtoLiteMessage hftv0 = hftp1.b_message;
                            ((gmff)hftv0).c = 3;
                            ((gmff)hftv0).b |= 1;
                            switch(hogi0.d) {
                                case 0: {
                                    v2 = 2;
                                    break;
                                }
                                case 1: {
                                    v2 = 3;
                                    break;
                                }
                                case 2: {
                                    v2 = 4;
                                    break;
                                }
                                case 3: {
                                    v2 = 5;
                                    break;
                                }
                                default: {
                                    v2 = 0;
                                }
                            }
                            if(v2 == 0) {
                                v2 = 1;
                            }
                            switch(v2 - 2) {
                                case 1: {
                                    if(!hftv0.isImmutable()) {
                                        hftp1.ensureMutable();
                                    }
                                    ((gmff)hftp1.b_message).d = 1;
                                    ((gmff)hftp1.b_message).b |= 2;
                                    break;
                                }
                                case 2: {
                                    if(!hftv0.isImmutable()) {
                                        hftp1.ensureMutable();
                                    }
                                    ((gmff)hftp1.b_message).d = 2;
                                    ((gmff)hftp1.b_message).b |= 2;
                                    break;
                                }
                                case 3: {
                                    if(!hftv0.isImmutable()) {
                                        hftp1.ensureMutable();
                                    }
                                    ((gmff)hftp1.b_message).d = 3;
                                    ((gmff)hftp1.b_message).b |= 2;
                                    break;
                                }
                                default: {
                                    if(!hftv0.isImmutable()) {
                                        hftp1.ensureMutable();
                                    }
                                    ((gmff)hftp1.b_message).d = 0;
                                    ((gmff)hftp1.b_message).b |= 2;
                                }
                            }
                            gmfg0.a(hftp1);
                            bcqx.W(gmfg0, 6, hogi0.e);
                            if((hogi0.b & 1) != 0) {
                                bcqx.W(gmfg0, 7, (hogi0.f == null ? hoge.a : hogi0.f).b);
                                bcqx.W(gmfg0, 8, (hogi0.f == null ? hoge.a : hogi0.f).c);
                                bcqx.W(gmfg0, 9, (hogi0.f == null ? hoge.a : hogi0.f).d);
                            }
                            if((hogi0.b & 2) != 0) {
                                bcqx.W(gmfg0, 10, (hogi0.g == null ? hoge.a : hogi0.g).b);
                                bcqx.W(gmfg0, 11, (hogi0.g == null ? hoge.a : hogi0.g).c);
                                bcqx.W(gmfg0, 12, (hogi0.g == null ? hoge.a : hogi0.g).d);
                            }
                            bcqx.V(gmfg0, 13, (hogg.b(hogi0.h) == 0 ? 1 : hogg.b(hogi0.h)));
                            bcqx.V(gmfg0, 15, (hogg.b(hogi0.i) == 0 ? 1 : hogg.b(hogi0.i)));
                            bcqx.W(gmfg0, 17, String.valueOf(hogi0.n));
                            bcqx.W(gmfg0, 16, String.valueOf(hogi0.m));
                            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gmff0).v_newBuilder();
                            if(!hftp2.b_message.isImmutable()) {
                                hftp2.ensureMutable();
                            }
                            ProtoLiteMessage hftv1 = hftp2.b_message;
                            ((gmff)hftv1).c = 12;
                            ((gmff)hftv1).b |= 1;
                            int v3 = hogi0.j;
                            switch(v3) {
                                case 0: {
                                    v4 = 2;
                                    break;
                                }
                                case 1: {
                                    v4 = 3;
                                    break;
                                }
                                case 2: {
                                    v4 = 4;
                                    break;
                                }
                                case 3: {
                                    v4 = 5;
                                    break;
                                }
                                default: {
                                    v4 = v3 == 4 ? 6 : 0;
                                }
                            }
                            if(v4 == 0) {
                                v4 = 1;
                            }
                            switch(v4 - 2) {
                                case 1: {
                                    if(!hftv1.isImmutable()) {
                                        hftp2.ensureMutable();
                                    }
                                    ((gmff)hftp2.b_message).d = 5;
                                    ((gmff)hftp2.b_message).b |= 2;
                                    break;
                                }
                                case 2: {
                                    if(!hftv1.isImmutable()) {
                                        hftp2.ensureMutable();
                                    }
                                    ((gmff)hftp2.b_message).d = 4;
                                    ((gmff)hftp2.b_message).b |= 2;
                                    break;
                                }
                                case 3: {
                                    if(!hftv1.isImmutable()) {
                                        hftp2.ensureMutable();
                                    }
                                    ((gmff)hftp2.b_message).d = 6;
                                    ((gmff)hftp2.b_message).b |= 2;
                                    break;
                                }
                                default: {
                                    if(v4 - 2 == 4) {
                                        if(!hftv1.isImmutable()) {
                                            hftp2.ensureMutable();
                                        }
                                        ((gmff)hftp2.b_message).d = 13;
                                    }
                                    else {
                                        if(!hftv1.isImmutable()) {
                                            hftp2.ensureMutable();
                                        }
                                        ((gmff)hftp2.b_message).d = 7;
                                    }
                                    ((gmff)hftp2.b_message).b |= 2;
                                }
                            }
                            gmfg0.a(hftp2);
                            ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)gmff0).v_newBuilder();
                            if(!hftp3.b_message.isImmutable()) {
                                hftp3.ensureMutable();
                            }
                            ProtoLiteMessage hftv2 = hftp3.b_message;
                            ((gmff)hftv2).c = 17;
                            ((gmff)hftv2).b |= 1;
                            switch(hogi0.l) {
                                case 0: {
                                    v5 = 2;
                                    break;
                                }
                                case 1: {
                                    v5 = 3;
                                    break;
                                }
                                case 2: {
                                    v5 = 4;
                                    break;
                                }
                                default: {
                                    v5 = 0;
                                }
                            }
                            if(v5 == 0) {
                                v5 = 1;
                            }
                            switch(v5 - 2) {
                                case 1: {
                                    if(!hftv2.isImmutable()) {
                                        hftp3.ensureMutable();
                                    }
                                    ((gmff)hftp3.b_message).d = 16;
                                    ((gmff)hftp3.b_message).b |= 2;
                                    break;
                                }
                                case 2: {
                                    if(!hftv2.isImmutable()) {
                                        hftp3.ensureMutable();
                                    }
                                    ((gmff)hftp3.b_message).d = 15;
                                    ((gmff)hftp3.b_message).b |= 2;
                                    break;
                                }
                                default: {
                                    if(!hftv2.isImmutable()) {
                                        hftp3.ensureMutable();
                                    }
                                    ((gmff)hftp3.b_message).d = 14;
                                    ((gmff)hftp3.b_message).b |= 2;
                                }
                            }
                            gmfg0.a(hftp3);
                            ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)gmff0).v_newBuilder();
                            if(!hftp4.b_message.isImmutable()) {
                                hftp4.ensureMutable();
                            }
                            ProtoLiteMessage hftv3 = hftp4.b_message;
                            ((gmff)hftv3).c = 18;
                            ((gmff)hftv3).b |= 1;
                            switch(hogi0.c) {
                                case 0: {
                                    v6 = 2;
                                    break;
                                }
                                case 1: {
                                    v6 = 3;
                                    break;
                                }
                                case 2: {
                                    v6 = 4;
                                    break;
                                }
                                default: {
                                    v6 = 0;
                                }
                            }
                            if(v6 == 0) {
                                v6 = 1;
                            }
                            switch(v6 - 2) {
                                case 1: {
                                    if(!hftv3.isImmutable()) {
                                        hftp4.ensureMutable();
                                    }
                                    ((gmff)hftp4.b_message).d = 19;
                                    ((gmff)hftp4.b_message).b |= 2;
                                    break;
                                }
                                case 2: {
                                    if(!hftv3.isImmutable()) {
                                        hftp4.ensureMutable();
                                    }
                                    ((gmff)hftp4.b_message).d = 18;
                                    ((gmff)hftp4.b_message).b |= 2;
                                    break;
                                }
                                default: {
                                    if(!hftv3.isImmutable()) {
                                        hftp4.ensureMutable();
                                    }
                                    ((gmff)hftp4.b_message).d = 17;
                                    ((gmff)hftp4.b_message).b |= 2;
                                }
                            }
                            if((hogi0.b & 2) != 0) {
                                hftp4 = ((ProtoLiteMessage)gmff0).v_newBuilder();
                                if(!hftp4.b_message.isImmutable()) {
                                    hftp4.ensureMutable();
                                }
                                ((gmff)hftp4.b_message).c = 19;
                                ((gmff)hftp4.b_message).b |= 1;
                                String s3 = String.valueOf((hogi0.g == null ? hoge.a : hogi0.g).e);
                                if(!hftp4.b_message.isImmutable()) {
                                    hftp4.ensureMutable();
                                }
                                gmff gmff1 = (gmff)hftp4.b_message;
                                s3.getClass();
                                gmff1.b |= 4;
                                gmff1.e = s3;
                            }
                            gmfg0.a(hftp4);
                            gmfh0 = (gmfh)((ProtoLiteBuilder)gmfg0).N_build();
                        }
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        gmfk gmfk0 = (gmfk)hftp0.b_message;
                        gmfh0.getClass();
                        gmfk0.c = gmfh0;
                        gmfk0.b |= 1;
                    }
                    break;
                }
                case 2: {
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ((gmfk)hftp0.b_message).d = 2;
                    ((gmfk)hftp0.b_message).b |= 2;
                }
            }
            switch((hofr.b(hofs0.f) == 0 ? 1 : hofr.b(hofs0.f)) - 2) {
                case 1: {
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ((gmfk)hftp0.b_message).e = 1;
                    ((gmfk)hftp0.b_message).b |= 4;
                    break;
                }
                case 2: {
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ((gmfk)hftp0.b_message).e = 2;
                    ((gmfk)hftp0.b_message).b |= 4;
                    break;
                }
                case 3: {
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ((gmfk)hftp0.b_message).e = 3;
                    ((gmfk)hftp0.b_message).b |= 4;
                }
            }
            int v7 = hofs0.c;
            if(v7 == 4) {
                hoer hoer0 = (hoer)hofs0.d;
                if((hoer0.b & 1) != 0) {
                    hobj hobj0 = hoer0.c == null ? hobj.a : hoer0.c;
                    if((hobj0.b & 1) != 0 && !(hobj0.e == null ? hobk.a : hobj0.e).b.isEmpty()) {
                        String s4 = (hobj0.e == null ? hobk.a : hobj0.e).b;
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        gmfk gmfk1 = (gmfk)hftp0.b_message;
                        s4.getClass();
                        gmfk1.b |= 0x100;
                        gmfk1.i = s4;
                    }
                    String s5 = "UNRECOGNIZED";
                    int v8 = (hobl.b(hobj0.f) == null ? hobl.i : hobl.b(hobj0.f)).ordinal();
                    switch(v8) {
                        case 1: {
                            if(!hftp0.b_message.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            ((gmfk)hftp0.b_message).f = 1;
                            ((gmfk)hftp0.b_message).b |= 8;
                            if(hobj0.c == 3) {
                                if(!hrel.f()) {
                                    String s9 = (hobj0.c == 3 ? ((hobt)hobj0.d) : hobt.a).c;
                                    if(!hftp0.b_message.isImmutable()) {
                                        hftp0.ensureMutable();
                                    }
                                    gmfk gmfk5 = (gmfk)hftp0.b_message;
                                    s9.getClass();
                                    gmfk5.b |= 16;
                                    gmfk5.g = s9;
                                }
                                if(((hobj0.c == 3 ? ((hobt)hobj0.d) : hobt.a).b & 1) != 0) {
                                    if(!hftp0.b_message.isImmutable()) {
                                        hftp0.ensureMutable();
                                    }
                                    ((gmfk)hftp0.b_message).f = 2;
                                    ((gmfk)hftp0.b_message).b |= 8;
                                }
                                String s10 = (hobj0.c == 3 ? ((hobt)hobj0.d) : hobt.a).d;
                                if(!hftp0.b_message.isImmutable()) {
                                    hftp0.ensureMutable();
                                }
                                gmfk gmfk6 = (gmfk)hftp0.b_message;
                                s10.getClass();
                                gmfk6.b |= 0x400;
                                gmfk6.j = s10;
                                return (gmfk)hftp0.N_build();
                            }
                            break;
                        }
                        case 2: {
                            if(!hftp0.b_message.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            ProtoLiteMessage hftv4 = hftp0.b_message;
                            ((gmfk)hftv4).f = 3;
                            ((gmfk)hftv4).b |= 8;
                            if(hobj0.c == 6) {
                                String s11 = ((hobw)hobj0.d).b;
                                if(!hftv4.isImmutable()) {
                                    hftp0.ensureMutable();
                                }
                                gmfk gmfk7 = (gmfk)hftp0.b_message;
                                s11.getClass();
                                gmfk7.b |= 0x400;
                                gmfk7.j = s11;
                                return (gmfk)hftp0.N_build();
                            }
                            break;
                        }
                        default: {
                            if(v8 == 3) {
                                if(!hftp0.b_message.isImmutable()) {
                                    hftp0.ensureMutable();
                                }
                                ((gmfk)hftp0.b_message).f = 4;
                                ((gmfk)hftp0.b_message).b |= 8;
                                if(hobj0.c == 4) {
                                    String s8 = ((hobh)hobj0.d).c + "::" + ((hobh)hobj0.d).b;
                                    if(!hftp0.b_message.isImmutable()) {
                                        hftp0.ensureMutable();
                                    }
                                    gmfk gmfk4 = (gmfk)hftp0.b_message;
                                    gmfk4.b |= 0x400;
                                    gmfk4.j = s8;
                                    return (gmfk)hftp0.N_build();
                                }
                            }
                            else {
                                switch(v8) {
                                    case 6: {
                                        if(!hftp0.b_message.isImmutable()) {
                                            hftp0.ensureMutable();
                                        }
                                        ((gmfk)hftp0.b_message).f = 5;
                                        ((gmfk)hftp0.b_message).b |= 8;
                                        if(hobj0.c == 8) {
                                            hobr hobr0 = (hobr)hobj0.d;
                                            int v9 = hobq.b(hobr0.c);
                                            if(v9 != 0) {
                                                switch(v9) {
                                                    case 2: {
                                                        s5 = "UNKNOWN";
                                                        break;
                                                    }
                                                    case 3: {
                                                        s5 = "PREPARING";
                                                        break;
                                                    }
                                                    default: {
                                                        if(v9 == 4) {
                                                            s5 = "VERIFYING";
                                                        }
                                                        else {
                                                            switch(v9) {
                                                                case 5: {
                                                                    s5 = "VERIFIED";
                                                                    break;
                                                                }
                                                                case 6: {
                                                                    s5 = "FAILED";
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            hfuo hfuo1 = hobr0.d;
                                            String s6 = s5 + "::";
                                            for(int v10 = 0; v10 < hfuo1.size(); ++v10) {
                                                s6 = s6 + ((hobk)hfuo1.get(v10)).b + (v10 >= hfuo1.size() - 1 ? "::" : ",");
                                            }
                                            hfuo hfuo2 = hobr0.b;
                                            for(int v11 = 0; v11 < hfuo2.size(); ++v11) {
                                                hocd hocd0 = (hocd)hfuo2.get(v11);
                                                s6 = s6 + hocd0.b + hocd0.c + "[" + hocd0.e + "-" + hocd0.d + "]" + (v11 >= hfuo2.size() - 1 ? "" : ",");
                                            }
                                            if(!hftp0.b_message.isImmutable()) {
                                                hftp0.ensureMutable();
                                            }
                                            gmfk gmfk2 = (gmfk)hftp0.b_message;
                                            gmfk2.b |= 0x400;
                                            gmfk2.j = s6;
                                            return (gmfk)hftp0.N_build();
                                        }
                                        break;
                                    }
                                    case 7: {
                                        if(!hftp0.b_message.isImmutable()) {
                                            hftp0.ensureMutable();
                                        }
                                        ((gmfk)hftp0.b_message).f = 7;
                                        ((gmfk)hftp0.b_message).b |= 8;
                                        if(hobj0.c == 12) {
                                            hock hock0 = (hock)hobj0.d;
                                            switch((hock0.e == null ? gmea.a : hock0.e).b) {
                                                case 0: {
                                                    v12 = 2;
                                                    break;
                                                }
                                                case 1: {
                                                    v12 = 3;
                                                    break;
                                                }
                                                case 2: {
                                                    v12 = 4;
                                                    break;
                                                }
                                                case 3: {
                                                    v12 = 5;
                                                    break;
                                                }
                                                case 4: {
                                                    v12 = 6;
                                                    break;
                                                }
                                                case 5: {
                                                    v12 = 7;
                                                    break;
                                                }
                                                case 6: {
                                                    v12 = 8;
                                                    break;
                                                }
                                                case 7: {
                                                    v12 = 9;
                                                    break;
                                                }
                                                case 8: {
                                                    v12 = 10;
                                                    break;
                                                }
                                                case 9: {
                                                    v12 = 11;
                                                    break;
                                                }
                                                case 10: {
                                                    v12 = 12;
                                                    break;
                                                }
                                                case 11: {
                                                    v12 = 13;
                                                    break;
                                                }
                                                case 12: {
                                                    v12 = 14;
                                                    break;
                                                }
                                                case 13: {
                                                    v12 = 15;
                                                    break;
                                                }
                                                case 14: {
                                                    v12 = 16;
                                                    break;
                                                }
                                                case 15: {
                                                    v12 = 17;
                                                    break;
                                                }
                                                case 16: {
                                                    v12 = 18;
                                                    break;
                                                }
                                                case 17: {
                                                    v12 = 19;
                                                    break;
                                                }
                                                case 18: {
                                                    v12 = 20;
                                                    break;
                                                }
                                                case 19: {
                                                    v12 = 21;
                                                    break;
                                                }
                                                case 20: {
                                                    v12 = 22;
                                                    break;
                                                }
                                                default: {
                                                    v12 = 0;
                                                }
                                            }
                                            if(v12 != 0) {
                                                switch(v12) {
                                                    case 2: {
                                                        s5 = "TS43_INTEGRATOR_UNSPECIFIED";
                                                        break;
                                                    }
                                                    case 3: {
                                                        s5 = "JIO";
                                                        break;
                                                    }
                                                    case 4: {
                                                        s5 = "TELUS";
                                                        break;
                                                    }
                                                    case 5: {
                                                        s5 = "ERICSSON";
                                                        break;
                                                    }
                                                    case 6: {
                                                        s5 = "HPE";
                                                        break;
                                                    }
                                                    case 7: {
                                                        s5 = "TMO";
                                                        break;
                                                    }
                                                    case 8: {
                                                        s5 = "TELENOR";
                                                        break;
                                                    }
                                                    case 9: {
                                                        s5 = "RCS_CIS_PROXY";
                                                        break;
                                                    }
                                                    case 10: {
                                                        s5 = "MOBI_US";
                                                        break;
                                                    }
                                                    case 11: {
                                                        s5 = "SFR";
                                                        break;
                                                    }
                                                    case 12: {
                                                        s5 = "SASKTEL_CANADA";
                                                        break;
                                                    }
                                                    case 13: {
                                                        s5 = "MOTIVE";
                                                        break;
                                                    }
                                                    case 14: {
                                                        s5 = "DT";
                                                        break;
                                                    }
                                                    case 15: {
                                                        s5 = "GLIDE";
                                                        break;
                                                    }
                                                    case 16: {
                                                        s5 = "GLIDE_GETPHONENUMBER";
                                                        break;
                                                    }
                                                    case 17: {
                                                        s5 = "NETLYNC";
                                                        break;
                                                    }
                                                    case 18: {
                                                        s5 = "ORANGE_FRANCE";
                                                        break;
                                                    }
                                                    case 19: {
                                                        s5 = "TMO_SERVER";
                                                        break;
                                                    }
                                                    case 20: {
                                                        s5 = "AMDOCS";
                                                        break;
                                                    }
                                                    case 21: {
                                                        s5 = "DT_SERVER";
                                                        break;
                                                    }
                                                    default: {
                                                        s5 = "IPIFICATION";
                                                    }
                                                }
                                            }
                                            String s7 = s5 + "::" + hock0.f + "::" + (hock0.i == null ? hocg.a : hock0.i).c + "::" + (hock0.i == null ? hocg.a : hock0.i).j;
                                            if(!hftp0.b_message.isImmutable()) {
                                                hftp0.ensureMutable();
                                            }
                                            gmfk gmfk3 = (gmfk)hftp0.b_message;
                                            gmfk3.b |= 0x400;
                                            gmfk3.j = s7;
                                            return (gmfk)hftp0.N_build();
                                        }
                                        break;
                                    }
                                    default: {
                                        if(!hftp0.b_message.isImmutable()) {
                                            hftp0.ensureMutable();
                                        }
                                        ((gmfk)hftp0.b_message).f = 0;
                                        ((gmfk)hftp0.b_message).b |= 8;
                                        return (gmfk)hftp0.N_build();
                                    }
                                }
                            }
                        }
                    }
                }
            }
            else if(v7 == 3 && !hrel.f()) {
                String s12 = (hofs0.c == 3 ? ((hofu)hofs0.d) : hofu.a).c;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gmfk gmfk8 = (gmfk)hftp0.b_message;
                s12.getClass();
                gmfk8.b |= 0x20;
                gmfk8.h = s12;
            }
        }
        return (gmfk)hftp0.N_build();
    }

    public final void P(UUID uUID0, int v, String s) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gmed.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gmed gmed0 = (gmed)hftp0.b_message;
        gmed0.c = gmgy.a(v);
        gmed0.b |= 1;
        this.r(bcqx.X(uUID0.toString(), gmfz.b, s, hftp0));
    }

    private static gmeo Q(String s, gmfz gmfz0) {
        gmen gmen0 = (gmen)((ProtoLiteMessage)gmeo.a).v_newBuilder();
        if(!gmen0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gmen0).ensureMutable();
        }
        gmeo gmeo0 = (gmeo)gmen0.b_message;
        s.getClass();
        gmeo0.b |= 1;
        gmeo0.c = s;
        if(!gmen0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gmen0).ensureMutable();
        }
        ((gmeo)gmen0.b_message).d = 1;
        ((gmeo)gmen0.b_message).b |= 2;
        gmeg gmeg0 = (gmeg)((ProtoLiteMessage)gmeh.a).v_newBuilder();
        if(!gmeg0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gmeg0).ensureMutable();
        }
        gmeh gmeh0 = (gmeh)gmeg0.b_message;
        gmeh0.c = gmfz0.a();
        gmeh0.b |= 1;
        gmen0.a(gmeg0);
        return (gmeo)((ProtoLiteBuilder)gmen0).N_build();
    }

    private static gmeo R(String s, gmfz gmfz0, gmfc gmfc0) {
        gmen gmen0 = (gmen)((ProtoLiteMessage)gmeo.a).v_newBuilder();
        if(!gmen0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gmen0).ensureMutable();
        }
        gmeo gmeo0 = (gmeo)gmen0.b_message;
        s.getClass();
        gmeo0.b |= 1;
        gmeo0.c = s;
        if(!gmen0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gmen0).ensureMutable();
        }
        ((gmeo)gmen0.b_message).d = 1;
        ((gmeo)gmen0.b_message).b |= 2;
        gmeg gmeg0 = (gmeg)((ProtoLiteMessage)gmeh.a).v_newBuilder();
        if(!gmeg0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gmeg0).ensureMutable();
        }
        gmeh gmeh0 = (gmeh)gmeg0.b_message;
        gmeh0.c = gmfz0.a();
        gmeh0.b |= 1;
        if(!gmeg0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gmeg0).ensureMutable();
        }
        gmeh gmeh1 = (gmeh)gmeg0.b_message;
        gmfd gmfd0 = (gmfd)((ProtoLiteBuilder)gmfc0).N_build();
        gmfd0.getClass();
        gmeh1.f = gmfd0;
        gmeh1.b |= 8;
        gmen0.a(gmeg0);
        return (gmeo)((ProtoLiteBuilder)gmen0).N_build();
    }

    private final void S(String s, gmfz gmfz0, hofs hofs0, gmfx gmfx0, String s1) {
        this.m(s, gmfz0, null, hofs0, gmfx0, s1);
    }

    private final void T(String s, gmes gmes0) {
        gmen gmen0 = (gmen)((ProtoLiteMessage)gmeo.a).v_newBuilder();
        if(!gmen0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gmen0).ensureMutable();
        }
        gmeo gmeo0 = (gmeo)gmen0.b_message;
        s.getClass();
        gmeo0.b |= 1;
        gmeo0.c = s;
        if(!gmen0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gmen0).ensureMutable();
        }
        ((gmeo)gmen0.b_message).d = 1;
        ((gmeo)gmen0.b_message).b |= 2;
        gmeg gmeg0 = (gmeg)((ProtoLiteMessage)gmeh.a).v_newBuilder();
        gmfz gmfz0 = gmfz.aA;
        if(!gmeg0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gmeg0).ensureMutable();
        }
        gmeh gmeh0 = (gmeh)gmeg0.b_message;
        gmeh0.c = gmfz0.a();
        gmeh0.b |= 1;
        if(!gmeg0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gmeg0).ensureMutable();
        }
        gmeh gmeh1 = (gmeh)gmeg0.b_message;
        gmes0.getClass();
        gmeh1.h = gmes0;
        gmeh1.b |= 0x20;
        gmen0.a(gmeg0);
        this.r(((gmeo)((ProtoLiteBuilder)gmen0).N_build()));
    }

    private static final String U(String s) {
        byte[] arr_b;
        try {
            arr_b = new byte[0];
            arr_b = MessageDigest.getInstance("SHA-1").digest(s.getBytes());
        }
        catch(NoSuchAlgorithmException unused_ex) {
        }
        if(arr_b.length == 0) {
            return "";
        }
        int v = arr_b[arr_b.length - 1] & 0xFF;
        if(arr_b.length >= 2) {
            v += (arr_b[arr_b.length - 2] & 0xFF) * 0x100;
        }
        return Integer.toString(v % 10000);
    }

    private static final void V(gmfg gmfg0, int v, int v1) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gmff.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gmff)hftv0).c = v - 2;
        ((gmff)hftv0).b |= 1;
        switch(v1 - 2) {
            case 1: {
                if(!hftv0.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((gmff)hftp0.b_message).d = 10;
                ((gmff)hftp0.b_message).b |= 2;
                break;
            }
            case 2: {
                if(!hftv0.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((gmff)hftp0.b_message).d = 9;
                ((gmff)hftp0.b_message).b |= 2;
                break;
            }
            default: {
                if(!hftv0.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((gmff)hftp0.b_message).d = 8;
                ((gmff)hftp0.b_message).b |= 2;
            }
        }
        gmfg0.a(hftp0);
    }

    private static final void W(gmfg gmfg0, int v, String s) {
        if(TextUtils.isEmpty(s)) {
            return;
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gmff.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gmff)hftv0).c = v - 2;
        ((gmff)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        gmff gmff0 = (gmff)hftp0.b_message;
        s.getClass();
        gmff0.b |= 4;
        gmff0.e = s;
        gmfg0.a(hftp0);
    }

    private static gmeo X(String s, gmfz gmfz0, String s1, ProtoLiteBuilder hftp0) {
        gmeg gmeg0 = (gmeg)((ProtoLiteMessage)gmeh.a).v_newBuilder();
        if(!gmeg0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gmeg0).ensureMutable();
        }
        gmeh gmeh0 = (gmeh)gmeg0.b_message;
        gmeh0.c = gmfz0.a();
        gmeh0.b |= 1;
        if(!gmeg0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gmeg0).ensureMutable();
        }
        gmeh gmeh1 = (gmeh)gmeg0.b_message;
        gmed gmed0 = (gmed)hftp0.N_build();
        gmed0.getClass();
        gmeh1.e = gmed0;
        gmeh1.b |= 4;
        if(s1 != null) {
            if(!gmeg0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)gmeg0).ensureMutable();
            }
            gmeh gmeh2 = (gmeh)gmeg0.b_message;
            gmeh2.b |= 2;
            gmeh2.d = s1;
        }
        gmen gmen0 = (gmen)((ProtoLiteMessage)gmeo.a).v_newBuilder();
        if(!gmen0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gmen0).ensureMutable();
        }
        gmeo gmeo0 = (gmeo)gmen0.b_message;
        s.getClass();
        gmeo0.b |= 1;
        gmeo0.c = s;
        if(!gmen0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gmen0).ensureMutable();
        }
        ((gmeo)gmen0.b_message).d = 1;
        ((gmeo)gmen0.b_message).b |= 2;
        gmen0.a(gmeg0);
        return (gmeo)((ProtoLiteBuilder)gmen0).N_build();
    }

    private static gmeo Y(String s, gmfz gmfz0, String s1, ProtoLiteBuilder hftp0) {
        gmeg gmeg0 = (gmeg)((ProtoLiteMessage)gmeh.a).v_newBuilder();
        if(!gmeg0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gmeg0).ensureMutable();
        }
        gmeh gmeh0 = (gmeh)gmeg0.b_message;
        gmeh0.c = gmfz0.a();
        gmeh0.b |= 1;
        if(!gmeg0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gmeg0).ensureMutable();
        }
        gmeh gmeh1 = (gmeh)gmeg0.b_message;
        gmef gmef0 = (gmef)hftp0.N_build();
        gmef0.getClass();
        gmeh1.g = gmef0;
        gmeh1.b |= 16;
        if(s1 != null) {
            if(!gmeg0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)gmeg0).ensureMutable();
            }
            gmeh gmeh2 = (gmeh)gmeg0.b_message;
            gmeh2.b |= 2;
            gmeh2.d = s1;
        }
        gmen gmen0 = (gmen)((ProtoLiteMessage)gmeo.a).v_newBuilder();
        if(!gmen0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gmen0).ensureMutable();
        }
        gmeo gmeo0 = (gmeo)gmen0.b_message;
        s.getClass();
        gmeo0.b |= 1;
        gmeo0.c = s;
        if(!gmen0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gmen0).ensureMutable();
        }
        ((gmeo)gmen0.b_message).d = 1;
        ((gmeo)gmen0.b_message).b |= 2;
        gmen0.a(gmeg0);
        return (gmeo)((ProtoLiteBuilder)gmen0).N_build();
    }

    private static gmeo Z(String s, gmfz gmfz0, String s1, gmfc gmfc0, ProtoLiteBuilder hftp0) {
        gmeg gmeg0 = (gmeg)((ProtoLiteMessage)gmeh.a).v_newBuilder();
        if(!gmeg0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gmeg0).ensureMutable();
        }
        gmeh gmeh0 = (gmeh)gmeg0.b_message;
        gmeh0.c = gmfz0.a();
        gmeh0.b |= 1;
        if(!gmeg0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gmeg0).ensureMutable();
        }
        gmeh gmeh1 = (gmeh)gmeg0.b_message;
        gmfd gmfd0 = (gmfd)((ProtoLiteBuilder)gmfc0).N_build();
        gmfd0.getClass();
        gmeh1.f = gmfd0;
        gmeh1.b |= 8;
        if(!gmeg0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gmeg0).ensureMutable();
        }
        gmeh gmeh2 = (gmeh)gmeg0.b_message;
        gmef gmef0 = (gmef)hftp0.N_build();
        gmef0.getClass();
        gmeh2.g = gmef0;
        gmeh2.b |= 16;
        if(s1 != null) {
            if(!gmeg0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)gmeg0).ensureMutable();
            }
            gmeh gmeh3 = (gmeh)gmeg0.b_message;
            gmeh3.b |= 2;
            gmeh3.d = s1;
        }
        gmen gmen0 = (gmen)((ProtoLiteMessage)gmeo.a).v_newBuilder();
        if(!gmen0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gmen0).ensureMutable();
        }
        gmeo gmeo0 = (gmeo)gmen0.b_message;
        s.getClass();
        gmeo0.b |= 1;
        gmeo0.c = s;
        if(!gmen0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gmen0).ensureMutable();
        }
        ((gmeo)gmen0.b_message).d = 1;
        ((gmeo)gmen0.b_message).b |= 2;
        gmen0.a(gmeg0);
        return (gmeo)((ProtoLiteBuilder)gmen0).N_build();
    }

    public static bcqx a(Context context0) {
        bcqx bcqx0;
        synchronized(bcqx.class) {
            bcqx0 = (bcqx)bcqx.b.get();
            if(bcqx0 == null) {
                bcqx bcqx1 = new bcqx(context0);
                bcqx.b = new WeakReference(bcqx1);
                return bcqx1;
            }
        }
        return bcqx0;
    }

    public static gmeo b(String s, gmeh gmeh0) {
        gmen gmen0 = (gmen)((ProtoLiteMessage)gmeo.a).v_newBuilder();
        if(!gmen0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gmen0).ensureMutable();
        }
        gmeo gmeo0 = (gmeo)gmen0.b_message;
        s.getClass();
        gmeo0.b |= 1;
        gmeo0.c = s;
        if(!gmen0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gmen0).ensureMutable();
        }
        ((gmeo)gmen0.b_message).d = 1;
        ((gmeo)gmen0.b_message).b |= 2;
        if(!gmen0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gmen0).ensureMutable();
        }
        gmeo gmeo1 = (gmeo)gmen0.b_message;
        gmeh0.getClass();
        gmeo1.b();
        gmeo1.e.add(gmeh0);
        return (gmeo)((ProtoLiteBuilder)gmen0).N_build();
    }

    public static gmeo c(String s, gmfz gmfz0, String s1) {
        gmeg gmeg0 = (gmeg)((ProtoLiteMessage)gmeh.a).v_newBuilder();
        if(!gmeg0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gmeg0).ensureMutable();
        }
        gmeh gmeh0 = (gmeh)gmeg0.b_message;
        gmeh0.c = gmfz0.a();
        gmeh0.b |= 1;
        if(s1 != null) {
            if(!gmeg0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)gmeg0).ensureMutable();
            }
            gmeh gmeh1 = (gmeh)gmeg0.b_message;
            gmeh1.b |= 2;
            gmeh1.d = s1;
        }
        gmen gmen0 = (gmen)((ProtoLiteMessage)gmeo.a).v_newBuilder();
        if(!gmen0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gmen0).ensureMutable();
        }
        gmeo gmeo0 = (gmeo)gmen0.b_message;
        s.getClass();
        gmeo0.b |= 1;
        gmeo0.c = s;
        if(!gmen0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gmen0).ensureMutable();
        }
        ((gmeo)gmen0.b_message).d = 1;
        ((gmeo)gmen0.b_message).b |= 2;
        gmen0.a(gmeg0);
        return (gmeo)((ProtoLiteBuilder)gmen0).N_build();
    }

    public final void d(bcrd bcrd0, gmfz gmfz0, gmfx gmfx0) {
        this.l(bcrd0, null, gmfz0, gmfx0, null);
    }

    public final void e(bcrd bcrd0, gmfz gmfz0, Throwable throwable0) {
        ProtoLiteBuilder hftp0 = bcqx.M(throwable0);
        this.r(bcqx.Y(bcrd0.a, gmfz0, null, hftp0));
    }

    public final void f(UUID uUID0, gmfz gmfz0, gmfx gmfx0) {
        this.S(uUID0.toString(), gmfz0, null, gmfx0, null);
    }

    public final void g(bcrd bcrd0, gmfz gmfz0, gmfx gmfx0, String s) {
        this.l(bcrd0, null, gmfz0, gmfx0, s);
    }

    public final void h(String s, gmfz gmfz0, gmfx gmfx0, String s1) {
        this.S(s, gmfz0, null, gmfx0, s1);
    }

    public final void i(String s, gmfz gmfz0, String s1, gmfx gmfx0) {
        this.m(s, gmfz0, s1, null, gmfx0, null);
    }

    public final void j(UUID uUID0, gmfz gmfz0, gmfx gmfx0, String s) {
        this.S(uUID0.toString(), gmfz0, null, gmfx0, s);
    }

    public final void k(UUID uUID0, gmfz gmfz0, String s, gmfx gmfx0) {
        this.i(uUID0.toString(), gmfz0, s, gmfx0);
    }

    public final void l(bcrd bcrd0, hofs hofs0, gmfz gmfz0, gmfx gmfx0, String s) {
        this.S(bcrd0.a, gmfz0, hofs0, gmfx0, s);
    }

    final void m(String s, gmfz gmfz0, String s1, hofs hofs0, gmfx gmfx0, String s2) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gmef.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gmef gmef0 = (gmef)hftp0.b_message;
        gmef0.c = gmfx0.a();
        gmef0.b |= 1;
        if(!TextUtils.isEmpty(s2)) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gmef gmef1 = (gmef)hftp0.b_message;
            s2.getClass();
            gmef1.b |= 2;
            gmef1.d = s2;
        }
        if(hofs0 != null) {
            gmfc gmfc0 = (gmfc)((ProtoLiteMessage)gmfd.a).v_newBuilder();
            gmfc0.a(bcqx.O(hofs0));
            this.r(bcqx.Z(s, gmfz0, s1, gmfc0, hftp0));
            return;
        }
        this.r(bcqx.Y(s, gmfz0, s1, hftp0));
    }

    public final void n(String s, gmfz gmfz0, gmgd gmgd0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gmed.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gmed gmed0 = (gmed)hftp0.b_message;
        gmed0.d = gmgd0.a();
        gmed0.b |= 2;
        this.r(bcqx.N(s, gmfz0, hftp0));
    }

    public final void o(UUID uUID0, gmfz gmfz0, gmgd gmgd0) {
        String s = uUID0.toString();
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gmed.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gmed gmed0 = (gmed)hftp0.b_message;
        gmed0.d = gmgd0.a();
        gmed0.b |= 2;
        this.r(bcqx.N(s, gmfz0, hftp0));
    }

    public final void p(String s, gmfz gmfz0, String s1, gmgd gmgd0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gmed.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gmed gmed0 = (gmed)hftp0.b_message;
        gmed0.d = gmgd0.a();
        gmed0.b |= 2;
        this.r(bcqx.X(s, gmfz0, s1, hftp0));
    }

    public final void q(UUID uUID0, gmfz gmfz0, String s, gmgd gmgd0) {
        this.p(uUID0.toString(), gmfz0, s, gmgd0);
    }

    public final void r(gmeo gmeo0) {
        if(hrel.f()) {
            ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)gmeo0).jf(5, null);
            hftp0.X(((ProtoLiteMessage)gmeo0));
            if((((gmeo)((gmen)hftp0).b_message).b & 16) != 0) {
                if(!((gmen)hftp0).b_message.isImmutable()) {
                    ((ProtoLiteBuilder)(((gmen)hftp0))).ensureMutable();
                }
                gmeo gmeo1 = (gmeo)((gmen)hftp0).b_message;
                gmeo1.b &= -17;
                gmeo1.g = gmeo.a.g;
            }
            if(Collection.-EL.stream(DesugarCollections.unmodifiableList(((gmeo)((gmen)hftp0).b_message).e)).anyMatch(new bcqr())) {
                gged_interceptors gged0 = (gged_interceptors)Collection.-EL.stream(DesugarCollections.unmodifiableList(((gmeo)((gmen)hftp0).b_message).e)).map(new bcqp()).collect(ggaf.a);
                if(!((gmen)hftp0).b_message.isImmutable()) {
                    ((ProtoLiteBuilder)(((gmen)hftp0))).ensureMutable();
                }
                ((gmeo)((gmen)hftp0).b_message).e = hfvv.a;
                if(!((gmen)hftp0).b_message.isImmutable()) {
                    ((ProtoLiteBuilder)(((gmen)hftp0))).ensureMutable();
                }
                gmeo gmeo2 = (gmeo)((gmen)hftp0).b_message;
                gmeo2.b();
                hfrj.E(gged0, gmeo2.e);
            }
            gmeo0 = (gmeo)((ProtoLiteBuilder)(((gmen)hftp0))).N_build();
        }
        int v = 0;
        if(hrdh.a.c().b()) {
            if(!gmeo0.e.isEmpty()) {
                gmfz gmfz0 = gmfz.b(((gmeh)gmeo0.e.get(0)).c);
                if(gmfz0 == null) {
                    gmfz0 = gmfz.a;
                }
                v = gmfz0.a();
            }
            cczb cczb0 = cecb.v().c(((ProtoLiteMessage)gmeo0));
            cczb0.c = v;
            cczb0.a();
            return;
        }
        bcqw bcqw0 = this.c;
        boolean z = bcqw0.c;
        if(z && !bcqw0.d.get()) {
            return;
        }
        ayuc ayuc0 = bcqw0.b.i(((MessageLite)gmeo0));
        gmfz gmfz1 = gmfz.b(((gmeh)gmeo0.e.get(0)).c);
        if(gmfz1 == null) {
            gmfz1 = gmfz.a;
        }
        ayuc0.k(gmfz1.a());
        if(hrel.a.b().g() && z) {
            gmeb gmeb0 = new gmeb();
            ayuc0.o = fhbe.b(bcqw0.a, gmeb0);
        }
        ayuc0.d();
    }

    public final void s(bcrd bcrd0, gmfz gmfz0) {
        this.v(bcrd0, null, gmfz0);
    }

    public final void t(String s, gmfz gmfz0) {
        this.w(s, null, gmfz0);
    }

    public final void u(bcrd bcrd0, gmfz gmfz0, String s) {
        this.r(bcqx.c(bcrd0.a, gmfz0, s));
    }

    public final void v(bcrd bcrd0, hofs hofs0, gmfz gmfz0) {
        this.w(bcrd0.a, hofs0, gmfz0);
    }

    public final void w(String s, hofs hofs0, gmfz gmfz0) {
        if(hofs0 != null) {
            gmfc gmfc0 = (gmfc)((ProtoLiteMessage)gmfd.a).v_newBuilder();
            gmfc0.a(bcqx.O(hofs0));
            this.r(bcqx.R(s, gmfz0, gmfc0));
            return;
        }
        this.r(bcqx.Q(s, gmfz0));
    }

    public final void x(bcrd bcrd0, gmfz gmfz0, String s) {
        if(!hrel.f()) {
            String s1 = bcrd0.a;
            gmeg gmeg0 = (gmeg)((ProtoLiteMessage)gmeh.a).v_newBuilder();
            if(!gmeg0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)gmeg0).ensureMutable();
            }
            gmeh gmeh0 = (gmeh)gmeg0.b_message;
            gmeh0.c = gmfz0.a();
            gmeh0.b |= 1;
            gmeg0.a(gged_interceptors.l(s));
            this.r(bcqx.b(s1, ((gmeh)((ProtoLiteBuilder)gmeg0).N_build())));
            return;
        }
        this.r(bcqx.Q(bcrd0.a, gmfz0));
    }

    public final void y(bcrd bcrd0, gmes gmes0) {
        this.T(bcrd0.a, gmes0);
    }

    public final void z(UUID uUID0, gmes gmes0) {
        this.T(uUID0.toString(), gmes0);
    }
}

