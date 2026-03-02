import android.content.Context;
import android.graphics.BitmapFactory;
import android.util.Base64;
import com.google.android.libraries.messaging.lighter.model..AutoValue_ConversationId;
import com.google.android.libraries.messaging.lighter.model.AccountContext;
import com.google.android.libraries.messaging.lighter.model.ContactId;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import j..util.DesugarCollections;
import j..util.Objects;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public final class flxc {
    public static final int a;
    private static final ggeo b;

    static {
        flxc.b = ggeo.m(hnsv.d, "photos", hnsv.j, "rich_card");
    }

    public static ContactId a(hnub hnub0) {
        ContactId contactId0 = flxa.a((hnub0.k == null ? hnry.a : hnub0.k));
        return hnub0.c == 5 ? flxa.a(((hnry)hnub0.d)) : contactId0;
    }

    public static gfsx b(hnwb hnwb0) {
        int v = hnwb0.e;
        int v1 = 2;
        int v2 = 1;
        if(v != 0) {
            switch(v) {
                case 1: {
                    v1 = 3;
                    break;
                }
                case 2: {
                    v1 = 4;
                    break;
                }
                case 3: {
                    break;
                }
                case 4: {
                    v1 = 6;
                    break;
                }
                case 5: {
                    v1 = 7;
                    break;
                }
                case 7: {
                    v1 = 9;
                    break;
                }
                default: {
                    v1 = 0;
                }
            }
        }
        if(v1 != 0) {
            v2 = v1;
        }
        return v2 != 4 && v2 != 7 ? gfsx.m(hnwb0.b) : gfqx.a;
    }

    public static gfsx c(gfsx gfsx0, AccountContext accountContext0, Context context0, Map map0, flsl flsl0) {
        int v14;
        gfsx gfsx6;
        hnsd hnsd0;
        int v11;
        hnqu hnqu0;
        int v9;
        gfsx gfsx4;
        hnug hnug0;
        int v7;
        hnui hnui0;
        gfsx gfsx3;
        int v4;
        int v3;
        if(gfsx0.i()) {
            Object object0 = gfsx0.d();
            flbj.a("MsgProtoConverter", "LighterMessage received: " + object0.toString());
            hnrr hnrr0 = ((hnub)object0).l;
            if(hnrr0 == null) {
                hnrr0 = hnrr.a;
            }
            ConversationId conversationId0 = flwy.a(accountContext0, hnrr0);
            ContactId contactId0 = flxc.a(((hnub)object0));
            fmfm fmfm0 = fmga.a();
            fmfm0.h(((hnub)object0).t);
            int v = 0;
            int v1 = 2;
            int v2 = 1;
            switch(((hnub)object0).t) {
                case 0: {
                    v3 = 2;
                    break;
                }
                case 1: {
                    v3 = 3;
                    break;
                }
                case 2: {
                    v3 = 4;
                    break;
                }
                default: {
                    v3 = 0;
                }
            }
            if(v3 == 0) {
                v3 = 1;
            }
            switch(v3 - 2) {
                case 0: {
                    fmfm0.c = fmct.a;
                    break;
                }
                case 1: {
                    fmfm0.c = fmcw.a;
                    break;
                }
                case 2: {
                    fmfv fmfv0 = fmfw.a();
                    hnsl hnsl0 = ((hnub)object0).g == 0x97 ? ((hnsl)((hnub)object0).h) : hnsl.a;
                    hnrp hnrp0 = hnsl0.c == null ? hnrp.a : hnsl0.c;
                    gfsx gfsx1 = gfsx.m(((hnub)object0).i);
                    gfsx gfsx2 = flwo.b(hnrp0, gfqx.a, gfsx1);
                    fmbb fmbb0 = fmbi.c();
                    fmbb0.r();
                    fmfv0.b(((fmbi)gfsx2.f(fmbb0.a())));
                    fmfv0.d((((hnub)object0).g == 0x97 ? ((hnsl)((hnub)object0).h) : hnsl.a).d);
                    fmfv0.k((((hnub)object0).g == 0x97 ? ((hnsl)((hnub)object0).h) : hnsl.a).f);
                    fmfv0.e((((hnub)object0).g == 0x97 ? ((hnsl)((hnub)object0).h) : hnsl.a).e);
                    TimeUnit timeUnit0 = TimeUnit.MILLISECONDS;
                    flba.a();
                    hnsl hnsl1 = ((hnub)object0).g == 0x97 ? ((hnsl)((hnub)object0).h) : hnsl.a;
                    fmfv0.f(((int)(timeUnit0.toSeconds(System.currentTimeMillis()) + ((long)hnsl1.f))));
                    hnsl hnsl2 = ((hnub)object0).g == 0x97 ? ((hnsl)((hnub)object0).h) : hnsl.a;
                    fmfv0.i(flwz.a((hnsl2.g == null ? hnrx.a : hnsl2.g)));
                    fmfv0.j((((hnub)object0).g == 0x97 ? ((hnsl)((hnub)object0).h) : hnsl.a).h);
                    fmfv0.h((((hnub)object0).g == 0x97 ? ((hnsl)((hnub)object0).h) : hnsl.a).i);
                    fmfv0.c((((hnub)object0).g == 0x97 ? ((hnsl)((hnub)object0).h) : hnsl.a).k);
                    fmfv0.g((((hnub)object0).g == 0x97 ? ((hnsl)((hnub)object0).h) : hnsl.a).j);
                    fmfm0.c = fmcy.a(fmfv0.a());
                    break;
                }
                default: {
                    fmfm0.p();
                }
            }
            if(!flce.c().a().contains(Integer.valueOf(((hnub)object0).s)) && ((hnub)object0).s != 0) {
                hnsv hnsv0 = hnsv.b(((hnub)object0).n);
                if(hnsv0 == null) {
                    hnsv0 = hnsv.k;
                }
                if(hnsv0 != hnsv.i && (((hnub)object0).t != 2 || (((hnub)object0).g == 0x97 ? ((hnsl)((hnub)object0).h) : hnsl.a).h == 1)) {
                    hnuc hnuc0 = ((hnub)object0).u;
                    if(hnuc0 == null) {
                        hnuc0 = hnuc.a;
                    }
                    switch(hnuc0.b) {
                        case 0: {
                            v4 = 2;
                            break;
                        }
                        case 1: {
                            v4 = 3;
                            break;
                        }
                        default: {
                            v4 = 0;
                        }
                    }
                    if(v4 == 0) {
                        v4 = 1;
                    }
                    if(v4 - 2 != 1) {
                        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hnqr.a).v_newBuilder();
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        hnqr hnqr0 = (hnqr)hftp0.b_message;
                        hnqr0.c = (hnub)object0;
                        hnqr0.b |= 1;
                        fmfm0.r(ByteString.copyFrom(Base64.encode(((hnqr)hftp0.N_build()).toBytesArray(), 8)));
                        fmfm0.c(((hnub)object0).s);
                        return gfsx.m(flxc.g(fmfm0, ((hnub)object0), contactId0, conversationId0, accountContext0, flsl0));
                    }
                    flbj.a("MsgProtoConverter", "Message dropped due to unsupported capability: " + ((hnub)object0).s);
                    fmai fmai0 = fmaj.a();
                    fmai0.g(15);
                    fmai0.p(((hnub)object0).i);
                    fmai0.n(accountContext0.c().f());
                    fmai0.o(accountContext0.d().toStringUtf8());
                    fmai0.f(57);
                    flsl0.b(fmai0.a());
                    return gfqx.a;
                }
            }
            else {
                fmfm0.c(-1);
                int v5 = ((hnub)object0).n;
                if((hnsv.b(v5) == null ? hnsv.k : hnsv.b(v5)) == hnsv.g) {
                    hntz hntz0 = ((hnub)object0).e == 105 ? ((hntz)((hnub)object0).f) : hntz.a;
                    switch((hntc.b(hntz0.c) == 0 ? 1 : hntc.b(hntz0.c)) - 2) {
                        case 2: {
                            hnrr hnrr1 = ((hnub)object0).l;
                            if(hnrr1 == null) {
                                hnrr1 = hnrr.a;
                            }
                            ConversationId conversationId1 = flwy.a(accountContext0, hnrr1);
                            ContactId contactId1 = flxc.a(((hnub)object0));
                            if(((.AutoValue_ConversationId)conversationId1).a.equals(contactId1)) {
                                gfsx3 = gfqx.a;
                            }
                            else {
                                try {
                                    hntz hntz1 = ((hnub)object0).e == 105 ? ((hntz)((hnub)object0).f) : hntz.a;
                                    ByteString hfsf0 = (hntz1.d == null ? hfrn.a : hntz1.d).c;
                                    hftc hftc0 = hftc.a();
                                    hfsl hfsl0 = hfsf0.k();
                                    ProtoLiteMessage hftv0 = ((ProtoLiteMessage)hnui.a).x_newMutableInstance();
                                    try {
                                        hfwc hfwc0 = hfvu.a.c(hftv0);
                                        hfwc0.l(hftv0, hfsm.p(hfsl0), hftc0);
                                        hfwc0.g(hftv0);
                                    }
                                    catch(hfur hfur1) {
                                        if(hfur1.b) {
                                            hfur1 = new hfur(hfur1);
                                        }
                                        hfur1.a = hftv0;
                                        throw hfur1;
                                    }
                                    catch(hfwr hfwr0) {
                                        hfur hfur2 = hfwr0.a();
                                        hfur2.a = hftv0;
                                        throw hfur2;
                                    }
                                    catch(IOException iOException0) {
                                        if((iOException0.getCause() instanceof hfur)) {
                                            throw (hfur)iOException0.getCause();
                                        }
                                        hfur hfur3 = new hfur(iOException0);
                                        hfur3.a = hftv0;
                                        throw hfur3;
                                    }
                                    catch(RuntimeException runtimeException0) {
                                        if((runtimeException0.getCause() instanceof hfur)) {
                                            throw (hfur)runtimeException0.getCause();
                                        }
                                        throw runtimeException0;
                                    }
                                    try {
                                        hfsl0.z(0);
                                    }
                                    catch(hfur hfur4) {
                                        hfur4.a = hftv0;
                                        throw hfur4;
                                    }
                                    ProtoLiteMessage.P_makeImmutable(hftv0);
                                    hnui0 = (hnui)hftv0;
                                }
                                catch(hfur hfur0) {
                                    flbj.d("TypingIndicatorProtos", "Failed to parse typing indicator", hfur0);
                                    gfsx3 = gfqx.a;
                                    goto label_168;
                                }
                                switch(hnui0.b) {
                                    case 0: {
                                        v7 = 2;
                                        break;
                                    }
                                    case 1: {
                                        v7 = 3;
                                        break;
                                    }
                                    case 2: {
                                        v7 = 4;
                                        break;
                                    }
                                    default: {
                                        v7 = 0;
                                    }
                                }
                                if(v7 == 0) {
                                    v7 = 1;
                                }
                                switch(v7 - 2) {
                                    case 1: {
                                        v = 1;
                                        break;
                                    }
                                    case 2: {
                                        v = 2;
                                    }
                                }
                                fluc fluc0 = new fluc();
                                fluc0.e(((hnub)object0).i);
                                fluc0.b(conversationId1);
                                fluc0.a = contactId1;
                                fluc0.f(v);
                                fluc0.c(hnui0.c);
                                fluc0.d(((hnub)object0).j);
                                gfsx3 = gfsx.m(fluc0.a());
                            }
                        label_168:
                            if(gfsx3.i()) {
                                flty flty0 = new flty();
                                Object object1 = gfsx3.d();
                                Objects.requireNonNull(object1);
                                flty0.b = new fltb(((flud)object1));
                                flty0.b(true);
                                return gfsx.m(flty0.a());
                            }
                            return gfqx.a;
                        }
                        case 4: {
                            try {
                                hntz hntz2 = ((hnub)object0).e == 105 ? ((hntz)((hnub)object0).f) : hntz.a;
                                ByteString hfsf1 = (hntz2.d == null ? hfrn.a : hntz2.d).c;
                                hftc hftc1 = hftc.a();
                                hfsl hfsl1 = hfsf1.k();
                                ProtoLiteMessage hftv1 = ((ProtoLiteMessage)hnug.a).x_newMutableInstance();
                                try {
                                    hfwc hfwc1 = hfvu.a.c(hftv1);
                                    hfwc1.l(hftv1, hfsm.p(hfsl1), hftc1);
                                    hfwc1.g(hftv1);
                                }
                                catch(hfur hfur6) {
                                    if(hfur6.b) {
                                        hfur6 = new hfur(hfur6);
                                    }
                                    hfur6.a = hftv1;
                                    throw hfur6;
                                }
                                catch(hfwr hfwr1) {
                                    hfur hfur7 = hfwr1.a();
                                    hfur7.a = hftv1;
                                    throw hfur7;
                                }
                                catch(IOException iOException1) {
                                    if((iOException1.getCause() instanceof hfur)) {
                                        throw (hfur)iOException1.getCause();
                                    }
                                    hfur hfur8 = new hfur(iOException1);
                                    hfur8.a = hftv1;
                                    throw hfur8;
                                }
                                catch(RuntimeException runtimeException1) {
                                    if((runtimeException1.getCause() instanceof hfur)) {
                                        throw (hfur)runtimeException1.getCause();
                                    }
                                    throw runtimeException1;
                                }
                                try {
                                    hfsl1.z(0);
                                }
                                catch(hfur hfur9) {
                                    hfur9.a = hftv1;
                                    throw hfur9;
                                }
                                ProtoLiteMessage.P_makeImmutable(hftv1);
                                hnug0 = (hnug)hftv1;
                            }
                            catch(hfur hfur5) {
                                flbj.d("ReceiptProtos", "Failed to parse receipt", hfur5);
                                gfsx4 = gfqx.a;
                                goto label_259;
                            }
                            int v8 = hnug0.c;
                            switch(v8) {
                                case 0: {
                                    v9 = 2;
                                    break;
                                }
                                case 1: {
                                    v9 = 3;
                                    break;
                                }
                                case 2: {
                                    v9 = 4;
                                    break;
                                }
                                default: {
                                    v9 = v8 == 3 ? 5 : 0;
                                }
                            }
                            if(v9 == 0) {
                                v9 = 1;
                            }
                            switch(v9 - 2) {
                                case 1: {
                                label_238:
                                    hnry hnry0 = ((hnub)object0).k;
                                    if(hnry0 == null) {
                                        hnry0 = hnry.a;
                                    }
                                    ContactId contactId2 = flxa.a(hnry0);
                                    hnrr hnrr2 = ((hnub)object0).l;
                                    if(hnrr2 == null) {
                                        hnrr2 = hnrr.a;
                                    }
                                    ConversationId conversationId2 = flwy.a(accountContext0, hnrr2);
                                    ArrayList arrayList0 = new ArrayList();
                                    for(Object object2: hnug0.b) {
                                        arrayList0.add(((hnuf)object2).b);
                                    }
                                    fltv fltv0 = new fltv();
                                    fltv0.d(((hnub)object0).i);
                                    fltv0.c(arrayList0);
                                    fltv0.b(conversationId2);
                                    fltv0.e(v);
                                    fltv0.a = contactId2;
                                    gfsx4 = gfsx.m(fltv0.a());
                                    break;
                                }
                                case 2: {
                                    v = 2;
                                    goto label_238;
                                }
                                default: {
                                    if(v9 - 2 == 3) {
                                        v = 1;
                                        goto label_238;
                                    }
                                    else {
                                        flbj.a("ReceiptProtos", "Unrecognized receipt type " + ((hnub)object0).i);
                                        gfsx4 = gfqx.a;
                                    }
                                }
                            }
                        label_259:
                            if(gfsx4.i()) {
                                flty flty1 = new flty();
                                Object object3 = gfsx4.d();
                                Objects.requireNonNull(object3);
                                flty1.b = new flta(((fltw)object3));
                                flty1.b(((hnub)object0).q);
                                return gfsx.m(flty1.a());
                            }
                            return gfqx.a;
                        }
                        case 9: {
                            try {
                                hntz hntz3 = ((hnub)object0).e == 105 ? ((hntz)((hnub)object0).f) : hntz.a;
                                ByteString hfsf2 = (hntz3.d == null ? hfrn.a : hntz3.d).c;
                                hftc hftc2 = hftc.a();
                                hfsl hfsl2 = hfsf2.k();
                                ProtoLiteMessage hftv2 = ((ProtoLiteMessage)hnqu.a).x_newMutableInstance();
                                try {
                                    hfwc hfwc2 = hfvu.a.c(hftv2);
                                    hfwc2.l(hftv2, hfsm.p(hfsl2), hftc2);
                                    hfwc2.g(hftv2);
                                }
                                catch(hfur hfur11) {
                                    if(hfur11.b) {
                                        hfur11 = new hfur(hfur11);
                                    }
                                    hfur11.a = hftv2;
                                    throw hfur11;
                                }
                                catch(hfwr hfwr2) {
                                    hfur hfur12 = hfwr2.a();
                                    hfur12.a = hftv2;
                                    throw hfur12;
                                }
                                catch(IOException iOException2) {
                                    if((iOException2.getCause() instanceof hfur)) {
                                        throw (hfur)iOException2.getCause();
                                    }
                                    hfur hfur13 = new hfur(iOException2);
                                    hfur13.a = hftv2;
                                    throw hfur13;
                                }
                                catch(RuntimeException runtimeException2) {
                                    if((runtimeException2.getCause() instanceof hfur)) {
                                        throw (hfur)runtimeException2.getCause();
                                    }
                                    throw runtimeException2;
                                }
                                try {
                                    hfsl2.z(0);
                                }
                                catch(hfur hfur14) {
                                    hfur14.a = hftv2;
                                    throw hfur14;
                                }
                                ProtoLiteMessage.P_makeImmutable(hftv2);
                                hnqu0 = (hnqu)hftv2;
                            }
                            catch(hfur hfur10) {
                                flbj.d("MsgProtoConverter", "Error parsing CloudUpdate LighterMessage: ", hfur10);
                                fmai fmai1 = fmaj.a();
                                fmai1.g(10033);
                                flsl0.b(fmai1.a());
                                return gfqx.a;
                            }
                            hnrr hnrr3 = ((hnub)object0).l;
                            if(hnrr3 == null) {
                                hnrr3 = hnrr.a;
                            }
                            ConversationId conversationId3 = flwy.a(accountContext0, hnrr3);
                            int v10 = hnqu0.b;
                            switch(v10) {
                                case 0: {
                                    v11 = 2;
                                    break;
                                }
                                case 1: {
                                    v11 = 3;
                                    break;
                                }
                                default: {
                                    v11 = 0;
                                }
                            }
                            if(v11 == 0) {
                                v11 = 1;
                            }
                            if(v11 - 2 != 1) {
                                flbj.c("MsgProtoConverter", "Unsupported CloudUpdate eventType: " + v10);
                                return gfqx.a;
                            }
                            try {
                                ByteString hfsf3 = (hnqu0.c == null ? hfrn.a : hnqu0.c).c;
                                hftc hftc3 = hftc.a();
                                hfsl hfsl3 = hfsf3.k();
                                ProtoLiteMessage hftv3 = ((ProtoLiteMessage)hnqq.a).x_newMutableInstance();
                                try {
                                    hfwc hfwc3 = hfvu.a.c(hftv3);
                                    hfwc3.l(hftv3, hfsm.p(hfsl3), hftc3);
                                    hfwc3.g(hftv3);
                                }
                                catch(hfur hfur16) {
                                    if(hfur16.b) {
                                        hfur16 = new hfur(hfur16);
                                    }
                                    hfur16.a = hftv3;
                                    throw hfur16;
                                }
                                catch(hfwr hfwr3) {
                                    hfur hfur17 = hfwr3.a();
                                    hfur17.a = hftv3;
                                    throw hfur17;
                                }
                                catch(IOException iOException3) {
                                    if((iOException3.getCause() instanceof hfur)) {
                                        throw (hfur)iOException3.getCause();
                                    }
                                    hfur hfur18 = new hfur(iOException3);
                                    hfur18.a = hftv3;
                                    throw hfur18;
                                }
                                catch(RuntimeException runtimeException3) {
                                    if((runtimeException3.getCause() instanceof hfur)) {
                                        throw (hfur)runtimeException3.getCause();
                                    }
                                    throw runtimeException3;
                                }
                                try {
                                    hfsl3.z(0);
                                }
                                catch(hfur hfur19) {
                                    hfur19.a = hftv3;
                                    throw hfur19;
                                }
                                ProtoLiteMessage.P_makeImmutable(hftv3);
                                fltl fltl0 = new fltl(conversationId3, ((hnqq)hftv3).b);
                                Objects.requireNonNull(fltl0);
                                fltj fltj0 = new fltj(new flso(fltl0));
                                flty flty2 = new flty();
                                Objects.requireNonNull(fltj0);
                                flty2.b = new flsw(fltj0);
                                flty2.b(true);
                                return gfsx.m(flty2.a());
                            }
                            catch(hfur hfur15) {
                                flbj.d("MsgProtoConverter", "Error parsing DeleteConversationEventDetails: ", hfur15);
                                fmai fmai2 = fmaj.a();
                                fmai2.g(10034);
                                flsl0.b(fmai2.a());
                                return gfqx.a;
                            }
                        }
                        case 11: {
                            try {
                                hntz hntz4 = ((hnub)object0).e == 105 ? ((hntz)((hnub)object0).f) : hntz.a;
                                ByteString hfsf4 = (hntz4.d == null ? hfrn.a : hntz4.d).c;
                                hftc hftc4 = hftc.a();
                                hfsl hfsl4 = hfsf4.k();
                                ProtoLiteMessage hftv4 = ((ProtoLiteMessage)hnue.a).x_newMutableInstance();
                                try {
                                    hfwc hfwc4 = hfvu.a.c(hftv4);
                                    hfwc4.l(hftv4, hfsm.p(hfsl4), hftc4);
                                    hfwc4.g(hftv4);
                                }
                                catch(hfur hfur21) {
                                    if(hfur21.b) {
                                        hfur21 = new hfur(hfur21);
                                    }
                                    hfur21.a = hftv4;
                                    throw hfur21;
                                }
                                catch(hfwr hfwr4) {
                                    hfur hfur22 = hfwr4.a();
                                    hfur22.a = hftv4;
                                    throw hfur22;
                                }
                                catch(IOException iOException4) {
                                    if((iOException4.getCause() instanceof hfur)) {
                                        throw (hfur)iOException4.getCause();
                                    }
                                    hfur hfur23 = new hfur(iOException4);
                                    hfur23.a = hftv4;
                                    throw hfur23;
                                }
                                catch(RuntimeException runtimeException4) {
                                    if((runtimeException4.getCause() instanceof hfur)) {
                                        throw (hfur)runtimeException4.getCause();
                                    }
                                    throw runtimeException4;
                                }
                                try {
                                    hfsl4.z(0);
                                }
                                catch(hfur hfur24) {
                                    hfur24.a = hftv4;
                                    throw hfur24;
                                }
                                ProtoLiteMessage.P_makeImmutable(hftv4);
                                hnsd0 = ((hnue)hftv4).b;
                                if(hnsd0 == null) {
                                    hnsd0 = hnsd.a;
                                }
                            }
                            catch(hfur hfur20) {
                                flbj.d("MsgProtoConverter", "Unable to parse profileUpdate proto.", hfur20);
                                return gfqx.a;
                            }
                            hnrr hnrr4 = ((hnub)object0).l;
                            if(hnrr4 == null) {
                                hnrr4 = hnrr.a;
                            }
                            fltx fltx0 = new fltx(flwy.a(accountContext0, hnrr4), flxd.a(accountContext0, context0, hnsd0, flsl0, ((hnub)object0).j));
                            flty flty3 = new flty();
                            Objects.requireNonNull(fltx0);
                            flty3.b = new flsy(fltx0);
                            flty3.b(((hnub)object0).q);
                            return gfsx.m(flty3.a());
                        }
                        default: {
                            int v6 = hntc.b((((hnub)object0).e == 105 ? ((hntz)((hnub)object0).f) : hntz.a).c);
                            if(v6 != 0) {
                                v2 = v6;
                            }
                            flbj.a("MsgProtoConverter", "UNKNOWN EVENT type LighterMessage received :" + Integer.toString(v2 - 2));
                            return gfqx.a;
                        }
                    }
                }
                switch((hnsv.b(v5) == null ? hnsv.k : hnsv.b(v5)).ordinal()) {
                    case 0: {
                        flbj.c("MsgProtoConverter", "UNKNOWN type LighterMessage received");
                        return gfqx.a;
                    }
                    case 2: {
                        fmfm0.s((((hnub)object0).e == 102 ? ((hnuh)((hnub)object0).f) : hnuh.a).b);
                        goto label_493;
                    }
                    case 3: {
                        try {
                            flxc.f(hnsv.d, fmfm0, map0, ((hnub)object0), accountContext0);
                        }
                        catch(flwq unused_ex) {
                            flbj.c("MsgProtoConverter", "Photos handler threw an exception it didn\'t need to");
                            fmfm0.r(ByteString.b);
                            fmfm0.c(-1);
                        }
                        goto label_493;
                    }
                    case 6: {
                        break;
                    }
                    case 7: {
                        if(((hnub)object0).e == 106) {
                            fmhm fmhm0 = flxs.b(accountContext0, context0, ((hnve)((hnub)object0).f), ((hnub)object0).i, flsl0);
                            fmfm0.i(fmhm0);
                            fmai fmai3 = fmaj.a();
                            fmai3.g(23);
                            fmai3.p(((hnub)object0).i);
                            fmai3.n(accountContext0.c().f());
                            fmai3.o(accountContext0.d().toStringUtf8());
                            if(!fmhm0.c) {
                                synchronized(fmhm0) {
                                    if(!fmhm0.c) {
                                        boolean z = false;
                                        gged_interceptors gged0 = fmhm0.a;
                                        int v12 = ((ggna)gged0).c;
                                        int v13 = 0;
                                        while(v13 < v12) {
                                            boolean z1 = ((fmgx)gged0.get(v13)).f();
                                            ++v13;
                                            if(z1) {
                                                z = true;
                                                break;
                                            }
                                        }
                                        fmhm0.b = z;
                                        fmhm0.c = true;
                                    }
                                }
                            }
                            fmai3.f((fmhm0.b ? 0x70 : 0x6F));
                            flsl0.b(fmai3.a());
                        }
                        else {
                            fmfm0.r(ByteString.b);
                        }
                        goto label_493;
                    }
                    case 8: {
                        fmfm0.o();
                        fmfm0.c(-1);
                        goto label_493;
                    }
                    case 9: {
                        try {
                            boolean z2 = flxc.f(hnsv.j, fmfm0, map0, ((hnub)object0), accountContext0);
                        }
                        catch(flwq flwq0) {
                            flbj.d("MsgProtoConverter", "Got unsupported rich card content.", flwq0);
                            fmai fmai4 = fmaj.a();
                            fmai4.g(10015);
                            fmai4.p(((hnub)object0).i);
                            fmai4.n(accountContext0.c().f());
                            fmai4.o(accountContext0.d().toStringUtf8());
                            fmai4.f(flwq0.a);
                            flsl0.b(fmai4.a());
                            fmfm0.r(ByteString.b);
                            fmfm0.c(-1);
                            goto label_493;
                        }
                        if(z2) {
                            fmai fmai5 = fmaj.a();
                            fmai5.g(10014);
                            fmai5.p(((hnub)object0).i);
                            fmai5.n(accountContext0.c().f());
                            fmai5.o(accountContext0.d().toStringUtf8());
                            flsl0.b(fmai5.a());
                        }
                    label_493:
                        flty flty4 = new flty(flxc.g(fmfm0, ((hnub)object0), contactId0, conversationId0, accountContext0, flsl0));
                        if((((hnub)object0).b & 16) != 0) {
                            hnqm hnqm0 = ((hnub)object0).r;
                            if(hnqm0 == null) {
                                hnqm0 = hnqm.a;
                            }
                            String s = ((hnub)object0).i;
                            hfuo hfuo0 = hnqm0.d;
                            String s1 = hnqm0.b;
                            ggdy ggdy0 = new ggdy();
                            for(Object object4: hfuo0) {
                                hnql hnql0 = (hnql)object4;
                                gfsx gfsx5 = flwo.b((hnql0.f == null ? hnrp.a : hnql0.f), gfsx.m(s1), gfsx.m(s));
                                if(gfsx5.i()) {
                                    fmho fmho0 = fmhp.a();
                                    fmho0.c(hnql0.b);
                                    fmho0.f(hnql0.c);
                                    fmho0.b(((fmbi)gfsx5.d()));
                                    fmho0.e(hnql0.e);
                                    if(!(hnql0.d == null ? hnrx.a : hnql0.d).c.isEmpty()) {
                                        fmfg fmfg0 = fmfh.a();
                                        fmfg0.d((hnql0.d == null ? hnrx.a : hnql0.d).c.toByteArray());
                                        fmfg0.f((hnql0.d == null ? hnrx.a : hnql0.d).e);
                                        fmfg0.c((hnql0.d == null ? hnrx.a : hnql0.d).d);
                                        fmfg0.e((hnql0.d == null ? hnrx.a : hnql0.d).g);
                                        hnrx hnrx0 = hnql0.d;
                                        if(((hnrx0 == null ? hnrx.a : hnrx0).b & 1) != 0) {
                                            if(hnrx0 == null) {
                                                hnrx0 = hnrx.a;
                                            }
                                            fmfg0.b(flwp.a((hnrx0.f == null ? hjie.a : hnrx0.f)));
                                        }
                                        fmho0.d(fmfg0.a());
                                    }
                                    ggdy0.i(fmho0.a());
                                }
                            }
                            gged_interceptors gged1 = ggdy0.h();
                            if(gged1.isEmpty()) {
                                gfsx6 = gfqx.a;
                            }
                            else {
                                switch(hnqm0.e) {
                                    case 0: {
                                        v14 = 2;
                                        break;
                                    }
                                    case 1: {
                                        v14 = 3;
                                        break;
                                    }
                                    case 2: {
                                        v14 = 4;
                                        break;
                                    }
                                    default: {
                                        v14 = 0;
                                    }
                                }
                                if(v14 == 0) {
                                    v14 = 1;
                                }
                                switch(v14 - 2) {
                                    case 1: {
                                        v1 = 1;
                                        break;
                                    }
                                    case 2: {
                                        break;
                                    }
                                    default: {
                                        gfsx6 = gfqx.a;
                                        goto label_554;
                                    }
                                }
                                fmhq fmhq0 = fmhr.a();
                                fmhq0.f(gged1);
                                fmhq0.c(hnqm0.b);
                                fmhq0.e(v1);
                                if(!hnqm0.c.isEmpty()) {
                                    s = hnqm0.c;
                                }
                                fmhq0.d(s);
                                fmhq0.b(hnqm0.f);
                                gfsx6 = gfsx.m(fmhq0.a());
                            }
                        label_554:
                            if(gfsx6.i()) {
                                Object object5 = gfsx6.d();
                                fmai fmai6 = fmaj.a();
                                fmai6.g(10025);
                                fmai6.n(accountContext0.c().f());
                                fmai6.o(accountContext0.d().toStringUtf8());
                                fmai6.p(((hnub)object0).i);
                                flsl0.b(fmai6.a());
                                flty4.a = (fmhr)object5;
                            }
                        }
                        return gfsx.m(flty4.a());
                    }
                    case 1: 
                    case 4: 
                    case 5: 
                    case 10: {
                        flbj.e("MsgProtoConverter", "UNSUPPORTED type LighterMessage received");
                        fmfm0.r(ByteString.b);
                        goto label_493;
                    }
                    default: {
                        goto label_493;
                    }
                }
            }
        }
        return gfqx.a;
    }

    public static gfsx d(hnwb hnwb0, AccountContext accountContext0, Context context0, Map map0, flsl flsl0) {
        gfsx gfsx1;
        gfsx gfsx0;
        hnub hnub0;
        int v5;
        fltu fltu3;
        hnsf hnsf1;
        int v3;
        int v2;
        hnwa hnwa0;
        int v;
        switch(hnwb0.c) {
            case 0: {
                v = 2;
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
            case 3: {
                v = 5;
                break;
            }
            case 4: {
                v = 6;
                break;
            }
            case 5: {
                v = 7;
                break;
            }
            case 6: {
                v = 8;
                break;
            }
            case 7: {
                v = 9;
                break;
            }
            case 8: {
                v = 10;
                break;
            }
            case 9: {
                v = 11;
                break;
            }
            case 10: {
                v = 12;
                break;
            }
            case 11: {
                v = 13;
                break;
            }
            case 12: {
                v = 14;
                break;
            }
            case 13: {
                v = 15;
                break;
            }
            case 14: {
                v = 16;
                break;
            }
            case 15: {
                v = 17;
                break;
            }
            case 16: {
                v = 18;
                break;
            }
            case 17: {
                v = 19;
                break;
            }
            case 18: {
                v = 20;
                break;
            }
            case 19: {
                v = 21;
                break;
            }
            case 20: {
                v = 22;
                break;
            }
            case 21: {
                v = 23;
                break;
            }
            case 22: {
                v = 24;
                break;
            }
            case 23: {
                v = 25;
                break;
            }
            case 24: {
                v = 26;
                break;
            }
            case 25: {
                v = 27;
                break;
            }
            case 26: {
                v = 28;
                break;
            }
            case 27: {
                v = 29;
                break;
            }
            case 28: {
                v = 30;
                break;
            }
            case 29: {
                v = 0x1F;
                break;
            }
            case 30: {
                v = 0x20;
                break;
            }
            case 0x1F: {
                v = 33;
                break;
            }
            case 0x20: {
                v = 34;
                break;
            }
            case 33: {
                v = 35;
                break;
            }
            case 34: {
                v = 36;
                break;
            }
            case 35: {
                v = 37;
                break;
            }
            case 36: {
                v = 38;
                break;
            }
            case 37: {
                v = 39;
                break;
            }
            case 38: {
                v = 40;
                break;
            }
            case 39: {
                v = 41;
                break;
            }
            case 40: {
                v = 42;
                break;
            }
            case 41: {
                v = 43;
                break;
            }
            case 42: {
                v = 44;
                break;
            }
            case 43: {
                v = 45;
                break;
            }
            case 44: {
                v = 46;
                break;
            }
            case 45: {
                v = 0x2F;
                break;
            }
            case 46: {
                v = 0x30;
                break;
            }
            case 0x2F: {
                v = 49;
                break;
            }
            default: {
                v = 0;
            }
        }
        int v1 = 1;
        if(v == 0) {
            v = 1;
        }
        hnsf hnsf0 = null;
    alab1:
        switch(v - 2) {
            case 5: {
                try {
                    ByteString hfsf1 = hnwb0.d;
                    hftc hftc1 = hftc.a();
                    hfsl hfsl1 = hfsf1.k();
                    ProtoLiteMessage hftv1 = ((ProtoLiteMessage)hnwa.a).x_newMutableInstance();
                    try {
                        hfwc hfwc1 = hfvu.a.c(hftv1);
                        hfwc1.l(hftv1, hfsm.p(hfsl1), hftc1);
                        hfwc1.g(hftv1);
                    }
                    catch(hfur hfur6) {
                        if(hfur6.b) {
                            hfur6 = new hfur(hfur6);
                        }
                        hfur6.a = hftv1;
                        throw hfur6;
                    }
                    catch(hfwr hfwr1) {
                        hfur hfur7 = hfwr1.a();
                        hfur7.a = hftv1;
                        throw hfur7;
                    }
                    catch(IOException iOException1) {
                        if((iOException1.getCause() instanceof hfur)) {
                            throw (hfur)iOException1.getCause();
                        }
                        hfur hfur8 = new hfur(iOException1);
                        hfur8.a = hftv1;
                        throw hfur8;
                    }
                    catch(RuntimeException runtimeException1) {
                        if((runtimeException1.getCause() instanceof hfur)) {
                            throw (hfur)runtimeException1.getCause();
                        }
                        throw runtimeException1;
                    }
                    try {
                        hfsl1.z(0);
                    }
                    catch(hfur hfur9) {
                        hfur9.a = hftv1;
                        throw hfur9;
                    }
                    ProtoLiteMessage.P_makeImmutable(hftv1);
                    hnwa0 = (hnwa)hftv1;
                    v2 = hnwa0.d;
                    v3 = hnvz.a(v2);
                }
                catch(hfur hfur5) {
                    flbj.d("MsgProtoConverter", "Error parsing GroupMessage", hfur5);
                    gfsx1 = gfqx.a;
                    break;
                }
                if(v3 == 0) {
                    v3 = 1;
                }
                switch(v3 - 2) {
                    case 5: {
                        hnxs hnxs0 = hnwa0.b == 105 ? ((hnxs)hnwa0.c) : hnxs.a;
                        flbj.a("MsgProtoConverter", "CreateGroupPush received: " + hnxs0);
                        if(((hnxs0.b == null ? hnxt.a : hnxs0.b).b & 1) != 0 && ((hnxs0.b == null ? hnxt.a : hnxs0.b).b & 2) != 0) {
                            fltr fltr0 = new fltr();
                            fltr0.b(hnwb0.b);
                            hnxt hnxt0 = hnxs0.b == null ? hnxt.a : hnxs0.b;
                            fmeu fmeu0 = fmev.a();
                            fmeu0.g(flwu.b((hnxt0.c == null ? hnxb.a : hnxt0.c), accountContext0));
                            fmeu0.q((hnxt0.d == null ? hnxi.a : hnxt0.d).b);
                            fmeu0.k((hnxt0.d == null ? hnxi.a : hnxt0.d).c);
                            fmeu0.l(false);
                            fmeu0.c(false);
                            fmeu0.i(-1L);
                            if((hnxt0.d == null ? hnxi.a : hnxt0.d).d.toByteArray().length > 0) {
                                fmeu0.j(BitmapFactory.decodeByteArray((hnxt0.d == null ? hnxi.a : hnxt0.d).d.toByteArray(), 0, (hnxt0.d == null ? hnxi.a : hnxt0.d).d.toByteArray().length));
                            }
                            try {
                                ByteString hfsf2 = (hnxt0.d == null ? hnxi.a : hnxt0.d).e;
                                hftc hftc2 = hftc.a();
                                hfsl hfsl2 = hfsf2.k();
                                ProtoLiteMessage hftv2 = ((ProtoLiteMessage)hnsf.a).x_newMutableInstance();
                                try {
                                    hfwc hfwc2 = hfvu.a.c(hftv2);
                                    hfwc2.l(hftv2, hfsm.p(hfsl2), hftc2);
                                    hfwc2.g(hftv2);
                                }
                                catch(hfur hfur11) {
                                    if(hfur11.b) {
                                        hfur11 = new hfur(hfur11);
                                    }
                                    hfur11.a = hftv2;
                                    throw hfur11;
                                }
                                catch(hfwr hfwr2) {
                                    hfur hfur12 = hfwr2.a();
                                    hfur12.a = hftv2;
                                    throw hfur12;
                                }
                                catch(IOException iOException2) {
                                    if((iOException2.getCause() instanceof hfur)) {
                                        throw (hfur)iOException2.getCause();
                                    }
                                    hfur hfur13 = new hfur(iOException2);
                                    hfur13.a = hftv2;
                                    throw hfur13;
                                }
                                catch(RuntimeException runtimeException2) {
                                    if((runtimeException2.getCause() instanceof hfur)) {
                                        throw (hfur)runtimeException2.getCause();
                                    }
                                    throw runtimeException2;
                                }
                                try {
                                    hfsl2.z(0);
                                }
                                catch(hfur hfur14) {
                                    hfur14.a = hftv2;
                                    throw hfur14;
                                }
                                ProtoLiteMessage.P_makeImmutable(hftv2);
                                hnsf0 = (hnsf)hftv2;
                            }
                            catch(hfur hfur10) {
                                flbj.d("MsgProtoConverter", "Error parsing AppData", hfur10);
                            }
                            if(hnsf0 != null) {
                                HashMap hashMap0 = new HashMap();
                                Map map1 = DesugarCollections.unmodifiableMap(hnsf0.b);
                                for(Object object0: map1.keySet()) {
                                    hashMap0.put(((String)object0), ((hfrn)map1.get(((String)object0))).toBytesArray());
                                }
                                fmeu0.b(hashMap0);
                            }
                            gfsx gfsx2 = gfqx.a;
                            fmev fmev0 = fmeu0.a();
                            hfuo hfuo0 = hnxt0.e;
                            ArrayList arrayList0 = new ArrayList();
                            for(Object object1: hfuo0) {
                                hnxv hnxv0 = (hnxv)object1;
                                if((hnxv0.b & 1) != 0) {
                                    ContactId contactId0 = flwu.a((hnxv0.c == null ? hnxb.a : hnxv0.c));
                                    if(contactId0 == null) {
                                        flbj.c("MsgProtoConverter", "Failed to convert Id: " + (hnxv0.c == null ? hnxb.a : hnxv0.c).d + " to ContactId");
                                    }
                                    else {
                                        arrayList0.add(contactId0);
                                    }
                                }
                            }
                            if(!arrayList0.isEmpty()) {
                                fltm fltm0 = new fltm();
                                fltm0.b(arrayList0);
                                gfsx2 = gfsx.m(fltm0.a());
                            }
                            fltk fltk0 = new fltk(fmev0, gfsx2);
                            Objects.requireNonNull(fltk0);
                            fltr0.a = new flst(fltk0);
                            fltu fltu0 = fltr0.a();
                            flty flty0 = new flty();
                            flty0.c(fltu0);
                            gfsx1 = gfsx.m(flty0.a());
                        }
                        else {
                            gfsx1 = gfqx.a;
                        }
                        break alab1;
                    }
                    case 6: {
                        hnxo hnxo0 = hnwa0.b == 106 ? ((hnxo)hnwa0.c) : hnxo.a;
                        flbj.a("MsgProtoConverter", "AddGroupUsersPush received: " + hnxo0);
                        if(((hnxo0.b == null ? hnxt.a : hnxo0.b).b & 1) != 0 && !hnxo0.c.isEmpty()) {
                            fltr fltr1 = new fltr();
                            fltr1.b(hnwb0.b);
                            hnxt hnxt1 = hnxo0.b == null ? hnxt.a : hnxo0.b;
                            flsn flsn0 = flxc.e(accountContext0, (hnxt1.c == null ? hnxb.a : hnxt1.c), hnxo0.c);
                            Objects.requireNonNull(flsn0);
                            fltr1.a = new flsq(flsn0);
                            fltu fltu1 = fltr1.a();
                            flty flty1 = new flty();
                            flty1.c(fltu1);
                            gfsx1 = gfsx.m(flty1.a());
                        }
                        else {
                            gfsx1 = gfqx.a;
                        }
                        break alab1;
                    }
                    case 7: {
                        hnxw hnxw0 = hnwa0.b == 107 ? ((hnxw)hnwa0.c) : hnxw.a;
                        flbj.a("MsgProtoConverter", "KickGroupUsersPush received: " + hnxw0);
                        if(((hnxw0.b == null ? hnxt.a : hnxw0.b).b & 1) != 0 && !hnxw0.c.isEmpty()) {
                            fltr fltr2 = new fltr();
                            fltr2.b(hnwb0.b);
                            hnxt hnxt2 = hnxw0.b == null ? hnxt.a : hnxw0.b;
                            flsn flsn1 = flxc.e(accountContext0, (hnxt2.c == null ? hnxb.a : hnxt2.c), hnxw0.c);
                            Objects.requireNonNull(flsn1);
                            fltr2.a = new flsu(flsn1);
                            fltu fltu2 = fltr2.a();
                            flty flty2 = new flty();
                            flty2.c(fltu2);
                            gfsx1 = gfsx.m(flty2.a());
                        }
                        else {
                            gfsx1 = gfqx.a;
                        }
                        break alab1;
                    }
                    case 8: {
                        hnxr hnxr0 = hnwa0.b == 108 ? ((hnxr)hnwa0.c) : hnxr.a;
                        flbj.a("MsgProtoConverter", "ChangeGroupProfilePush received: " + hnxr0);
                        flty flty3 = new flty();
                        String s = hnwb0.b;
                        fltr fltr3 = new fltr();
                        fltr3.b(s);
                        flte flte0 = new flte(null);
                        flte0.b(false);
                        if((hnxr0.b & 4) != 0) {
                            if(((hnxr0.d == null ? hnxg.a : hnxr0.d).b & 16) == 0) {
                                hnsf1 = null;
                            }
                            else {
                                try {
                                    hnxg hnxg0 = hnxr0.d == null ? hnxg.a : hnxr0.d;
                                    ByteString hfsf3 = (hnxg0.e == null ? hfsg.a : hnxg0.e).b;
                                    hftc hftc3 = hftc.a();
                                    hfsl hfsl3 = hfsf3.k();
                                    ProtoLiteMessage hftv3 = ((ProtoLiteMessage)hnsf.a).x_newMutableInstance();
                                    try {
                                        hfwc hfwc3 = hfvu.a.c(hftv3);
                                        hfwc3.l(hftv3, hfsm.p(hfsl3), hftc3);
                                        hfwc3.g(hftv3);
                                    }
                                    catch(hfur hfur16) {
                                        if(hfur16.b) {
                                            hfur16 = new hfur(hfur16);
                                        }
                                        hfur16.a = hftv3;
                                        throw hfur16;
                                    }
                                    catch(hfwr hfwr3) {
                                        hfur hfur17 = hfwr3.a();
                                        hfur17.a = hftv3;
                                        throw hfur17;
                                    }
                                    catch(IOException iOException3) {
                                        if((iOException3.getCause() instanceof hfur)) {
                                            throw (hfur)iOException3.getCause();
                                        }
                                        hfur hfur18 = new hfur(iOException3);
                                        hfur18.a = hftv3;
                                        throw hfur18;
                                    }
                                    catch(RuntimeException runtimeException3) {
                                        if((runtimeException3.getCause() instanceof hfur)) {
                                            throw (hfur)runtimeException3.getCause();
                                        }
                                        throw runtimeException3;
                                    }
                                    try {
                                        hfsl3.z(0);
                                    }
                                    catch(hfur hfur19) {
                                        hfur19.a = hftv3;
                                        throw hfur19;
                                    }
                                    ProtoLiteMessage.P_makeImmutable(hftv3);
                                    hnsf1 = (hnsf)hftv3;
                                }
                                catch(hfur hfur15) {
                                    hnsf1 = null;
                                    goto label_380;
                                }
                                try {
                                    if(hnsf1.b.containsKey("Lighter")) {
                                        flte0.b(true);
                                    }
                                    goto label_383;
                                }
                                catch(hfur hfur15) {
                                }
                            label_380:
                                flbj.d("MsgProtoConverter", "Error parsing AppData", hfur15);
                            }
                        label_383:
                            if(((hnxr0.c == null ? hnxt.a : hnxr0.c).b & 1) != 0) {
                                hnxt hnxt3 = hnxr0.c == null ? hnxt.a : hnxr0.c;
                                flte0.a = gfsx.m(flwu.b((hnxt3.c == null ? hnxb.a : hnxt3.c), accountContext0));
                                fltp fltp0 = new fltp(null);
                                fltp0.f("");
                                fltp0.b("");
                                fltp0.e(new HashMap());
                                hnxg hnxg1 = hnxr0.d;
                                if((1 & (hnxg1 == null ? hnxg.a : hnxg1).b) != 0) {
                                    if(hnxg1 == null) {
                                        hnxg1 = hnxg.a;
                                    }
                                    fltp0.f((hnxg1.c == null ? hfwi.a : hnxg1.c).b);
                                }
                                hnxg hnxg2 = hnxr0.d;
                                if(((hnxg2 == null ? hnxg.a : hnxg2).b & 0x20) != 0) {
                                    if(hnxg2 == null) {
                                        hnxg2 = hnxg.a;
                                    }
                                    fltp0.c((hnxg2.f == null ? hfwi.a : hnxg2.f).b);
                                }
                                else if(((hnxg2 == null ? hnxg.a : hnxg2).b & 4) != 0) {
                                    if(hnxg2 == null) {
                                        hnxg2 = hnxg.a;
                                    }
                                    fltp0.b((hnxg2.d == null ? hnxe.a : hnxg2.d).c);
                                    hnxg hnxg3 = hnxr0.d == null ? hnxg.a : hnxr0.d;
                                    fltp0.g((hnxg3.d == null ? hnxe.a : hnxg3.d).b.toByteArray());
                                }
                                if(hnsf1 != null) {
                                    HashMap hashMap1 = new HashMap();
                                    Map map2 = DesugarCollections.unmodifiableMap(hnsf1.b);
                                    for(Object object2: map2.keySet()) {
                                        hashMap1.put(((String)object2), ((hfrn)map2.get(((String)object2))).toBytesArray());
                                    }
                                    fltp0.e(hashMap1);
                                }
                                fltp0.d(ggna.a);
                                fltp0.h(ggna.a);
                                flte0.b = gfsx.m(fltp0.a());
                            }
                        }
                        fltr3.c(flte0.a());
                        fltu3 = fltr3.a();
                        flty3.c(fltu3);
                        gfsx1 = gfsx.m(flty3.a());
                        break alab1;
                    }
                    default: {
                        int v4 = hnvz.a(v2) == 0 ? 1 : hnvz.a(v2);
                        if(v4 == 1) {
                            throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
                        }
                        flbj.c("MsgProtoConverter", "UNSUPPORTED " + (v4 - 2) + "type GroupMessage received");
                        gfsx1 = gfqx.a;
                        break alab1;
                    }
                }
            }
            case 7: {
                try {
                    ByteString hfsf4 = hnwb0.d;
                    hftc hftc4 = hftc.a();
                    hfsl hfsl4 = hfsf4.k();
                    ProtoLiteMessage hftv4 = ((ProtoLiteMessage)hnwx.a).x_newMutableInstance();
                    try {
                        hfwc hfwc4 = hfvu.a.c(hftv4);
                        hfwc4.l(hftv4, hfsm.p(hfsl4), hftc4);
                        hfwc4.g(hftv4);
                    }
                    catch(hfur hfur21) {
                        if(hfur21.b) {
                            hfur21 = new hfur(hfur21);
                        }
                        hfur21.a = hftv4;
                        throw hfur21;
                    }
                    catch(hfwr hfwr4) {
                        hfur hfur22 = hfwr4.a();
                        hfur22.a = hftv4;
                        throw hfur22;
                    }
                    catch(IOException iOException4) {
                        if((iOException4.getCause() instanceof hfur)) {
                            throw (hfur)iOException4.getCause();
                        }
                        hfur hfur23 = new hfur(iOException4);
                        hfur23.a = hftv4;
                        throw hfur23;
                    }
                    catch(RuntimeException runtimeException4) {
                        if((runtimeException4.getCause() instanceof hfur)) {
                            throw (hfur)runtimeException4.getCause();
                        }
                        throw runtimeException4;
                    }
                    try {
                        hfsl4.z(0);
                    }
                    catch(hfur hfur24) {
                        hfur24.a = hftv4;
                        throw hfur24;
                    }
                    ProtoLiteMessage.P_makeImmutable(hftv4);
                    hnwx hnwx0 = (hnwx)hftv4;
                }
                catch(hfur hfur20) {
                    flbj.d("MsgProtoConverter", "Error parsing UserDataMessage", hfur20);
                    gfsx1 = gfqx.a;
                    break;
                }
                fltr fltr4 = new fltr();
                fltr4.b(hnwb0.b);
                switch(hnwx0.b) {
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
                    case 3: {
                        v5 = 5;
                        break;
                    }
                    case 4: {
                        v5 = 6;
                        break;
                    }
                    case 5: {
                        v5 = 7;
                        break;
                    }
                    case 6: {
                        v5 = 8;
                        break;
                    }
                    case 7: {
                        v5 = 9;
                        break;
                    }
                    case 8: {
                        v5 = 10;
                        break;
                    }
                    case 9: {
                        v5 = 11;
                        break;
                    }
                    case 10: {
                        v5 = 12;
                        break;
                    }
                    case 11: {
                        v5 = 13;
                        break;
                    }
                    case 12: {
                        v5 = 14;
                        break;
                    }
                    case 13: {
                        v5 = 15;
                        break;
                    }
                    case 14: {
                        v5 = 16;
                        break;
                    }
                    case 15: {
                        v5 = 17;
                        break;
                    }
                    case 16: {
                        v5 = 18;
                        break;
                    }
                    case 17: {
                        v5 = 19;
                        break;
                    }
                    case 18: {
                        v5 = 20;
                        break;
                    }
                    case 19: {
                        v5 = 21;
                        break;
                    }
                    case 20: {
                        v5 = 22;
                        break;
                    }
                    default: {
                        v5 = 0;
                    }
                }
                if(v5 != 0) {
                    v1 = v5;
                }
                if(v1 - 2 != 13 && v1 - 2 != 14 && v1 - 2 != 15) {
                    flbj.c("MsgProtoConverter", "UNSUPPORTED type UserDataMessage received");
                    gfsx1 = gfqx.a;
                }
                else {
                    fltd fltd0 = new fltd(null);
                    Objects.requireNonNull(fltd0);
                    fltr4.a = new flsr(fltd0);
                    flty flty4 = new flty();
                    flty4.c(fltr4.a());
                    gfsx1 = gfsx.m(flty4.a());
                }
                break;
            }
            default: {
                if(v - 2 != 24) {
                    fmai fmai0 = fmaj.a();
                    fmai0.g(15);
                    fmai0.n(accountContext0.c().f());
                    fmai0.o(accountContext0.d().toStringUtf8());
                    fmai0.p(hnwb0.b);
                    fmai0.f(52);
                    flsl0.b(fmai0.a());
                    flbj.c("MsgProtoConverter", "Unsupported InboxMessage received: " + hnwb0.b);
                    return gfqx.a;
                }
                try {
                    ByteString hfsf0 = hnwb0.d;
                    hftc hftc0 = hftc.a();
                    hfsl hfsl0 = hfsf0.k();
                    ProtoLiteMessage hftv0 = ((ProtoLiteMessage)hnub.a).x_newMutableInstance();
                    try {
                        hfwc hfwc0 = hfvu.a.c(hftv0);
                        hfwc0.l(hftv0, hfsm.p(hfsl0), hftc0);
                        hfwc0.g(hftv0);
                    }
                    catch(hfur hfur1) {
                        if(hfur1.b) {
                            hfur1 = new hfur(hfur1);
                        }
                        hfur1.a = hftv0;
                        throw hfur1;
                    }
                    catch(hfwr hfwr0) {
                        hfur hfur2 = hfwr0.a();
                        hfur2.a = hftv0;
                        throw hfur2;
                    }
                    catch(IOException iOException0) {
                        if((iOException0.getCause() instanceof hfur)) {
                            throw (hfur)iOException0.getCause();
                        }
                        hfur hfur3 = new hfur(iOException0);
                        hfur3.a = hftv0;
                        throw hfur3;
                    }
                    catch(RuntimeException runtimeException0) {
                        if((runtimeException0.getCause() instanceof hfur)) {
                            throw (hfur)runtimeException0.getCause();
                        }
                        throw runtimeException0;
                    }
                    try {
                        hfsl0.z(0);
                    }
                    catch(hfur hfur4) {
                        hfur4.a = hftv0;
                        throw hfur4;
                    }
                    ProtoLiteMessage.P_makeImmutable(hftv0);
                    hnub0 = (hnub)hftv0;
                }
                catch(hfur hfur0) {
                    flbj.d("MsgProtoConverter", "Error parsing LighterMessage", hfur0);
                    gfsx0 = gfqx.a;
                    goto label_153;
                }
                gfsx0 = gfsx.m(hnub0);
            label_153:
                gfsx1 = flxc.c(gfsx0, accountContext0, context0, map0, flsl0);
            }
        }
        if(!gfsx1.i()) {
            fmai fmai1 = fmaj.a();
            fmai1.g(15);
            fmai1.n(accountContext0.c().f());
            fmai1.o(accountContext0.d().toStringUtf8());
            fmai1.p(hnwb0.b);
            fmai1.f(53);
            flsl0.b(fmai1.a());
        }
        return gfsx1;
    }

    private static flsn e(AccountContext accountContext0, hnxb hnxb0, List list0) {
        ConversationId conversationId0 = flwu.b(hnxb0, accountContext0);
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: list0) {
            hnxb hnxb1 = (hnxb)object0;
            ContactId contactId0 = flwu.a(hnxb1);
            if(contactId0 == null) {
                flbj.a("MsgProtoConverter", "Failed to convert Id: " + hnxb1.d + " to ContactId");
            }
            else {
                arrayList0.add(contactId0);
            }
        }
        fltm fltm0 = new fltm();
        fltm0.b(arrayList0);
        return new flsn(conversationId0, fltm0.a());
    }

    private static boolean f(hnsv hnsv0, fmfm fmfm0, Map map0, hnub hnub0, AccountContext accountContext0) {
        String s = (String)flxc.b.get(hnsv0);
        if(map0.containsKey(s)) {
            fmfm0.b = ((flws)map0.get(s)).a().a(accountContext0, hnub0);
            return true;
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hnqr.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hnqr)hftp0.b_message).c = hnub0;
        ((hnqr)hftp0.b_message).b |= 1;
        fmfm0.r(ByteString.copyFrom(Base64.encode(((hnqr)hftp0.N_build()).toBytesArray(), 8)));
        fmfm0.c(hnub0.s);
        return false;
    }

    private static flub g(fmfm fmfm0, hnub hnub0, ContactId contactId0, ConversationId conversationId0, AccountContext accountContext0, flsl flsl0) {
        HashMap hashMap0 = new HashMap();
        Map map0 = DesugarCollections.unmodifiableMap(hnub0.o);
        for(Object object0: map0.keySet()) {
            hashMap0.put(((String)object0), ((hfrn)map0.get(((String)object0))).getDefaultInstanceForType());
        }
        fmfm0.l(hashMap0);
        fmfm0.f(hnub0.m);
        hnry hnry0 = hnub0.k == null ? hnry.a : hnub0.k;
        ContactId contactId1 = ((.AutoValue_ConversationId)conversationId0).a;
        ContactId contactId2 = flxa.a(hnry0);
        boolean z = false;
        int v = contactId0.equals(contactId1) || contactId2.equals(contactId1) ? 1 : 0;
        fmfm0.g((v != 0 || hnub0.q ? 1 : 0));
        fmfm0.j(hnub0.i);
        fmfm0.f = 1 == v ? 2 : 1;
        fmfm0.k((v == 0 ? fmft.b : fmft.h));
        fmfm0.n(hnub0.p);
        fmfm0.a = contactId0;
        fmfm0.e(conversationId0);
        fmfm0.m(hnub0.j);
        fmga fmga0 = fmfm0.a();
        int v1 = fmga0.j;
        if(v1 != -1) {
            fmai fmai0 = fmaj.a();
            fmai0.g(10011);
            fmai0.n(accountContext0.c().f());
            fmai0.o(accountContext0.d().toStringUtf8());
            fmai0.p(hnub0.i);
            fmai0.q(v1);
            flsl0.b(fmai0.a());
        }
        flty flty0 = new flty();
        Objects.requireNonNull(fmga0);
        flty0.b = new flsx(fmga0);
        if(v != 0 || hnub0.q) {
            z = true;
        }
        flty0.b(z);
        return flty0.a();
    }
}

