import android.accounts.Account;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import com.google.android.gms.chromesync.zeroparty.CrossUserSharingPrivateKey;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class bfdz {
    public static final bboh a;
    public final ibrt b;
    public final bdbt c;
    public final bdbt d;
    public final beat e;
    private final bfet f;
    private final bfer g;

    static {
        bfdz.a = bboh.b("IncomingPasswordInvitationsProcessor", bbcu.cX);
    }

    public bfdz(ibrt ibrt0, bdbt bdbt0, beat beat0, bdbt bdbt1, bfet bfet0, bfer bfer0) {
        this.b = ibrt0;
        this.c = bdbt0;
        this.e = beat0;
        this.d = bdbt1;
        this.f = bfet0;
        this.g = bfer0;
    }

    public final Object a(bfdu bfdu0, bdcd bdcd0, ibrl ibrl0) {
        bfdx bfdx0;
        if((ibrl0 instanceof bfdx)) {
            bfdx0 = (bfdx)ibrl0;
            int v = bfdx0.c;
            if((v & 0x80000000) == 0) {
                bfdx0 = new bfdx(this, ibrl0);
            }
            else {
                bfdx0.c = v - 0x80000000;
            }
        }
        else {
            bfdx0 = new bfdx(this, ibrl0);
        }
        Object object0 = bfdx0.a;
        Object object1 = ibrx.a;
        switch(bfdx0.c) {
            case 0: {
                ibnx.b(object0);
                List list0 = hsbc.a.b().b() ? ibpo.ak(bfdu0.b, bfdu0.e) : bfdu0.b;
                if(!list0.isEmpty()) {
                    evql evql0 = bdcd0.f(ggdx.a(list0));
                    bfdx0.c = 1;
                    return ictn.b(evql0, bfdx0) == object1 ? object1 : Boolean.valueOf(true);
                }
                return Boolean.valueOf(false);
            }
            case 1: {
                ibnx.b(object0);
                return Boolean.valueOf(true);
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    public final Object b(String s, hepk hepk0, bdbr bdbr0, bdcd bdcd0, becz becz0, ibrl ibrl0) {
        if((ibrl0 instanceof bfdy)) {
            bfdy bfdy0 = (bfdy)ibrl0;
            int v = bfdy0.h;
            if((v & 0x80000000) == 0) {
                bfdy0 = new bfdy(this, ibrl0);
            }
            else {
                bfdy0.h = v - 0x80000000;
            }
        }
        else {
            bfdy0 = new bfdy(this, ibrl0);
        }
        Object object0 = bfdy0.f;
        ibrx ibrx0 = ibrx.a;
        int v1 = bfdy0.h;
        switch(v1) {
            case 0: {
                ibnx.b(object0);
                bfdy0.a = s;
                bfdy0.b = hepk0;
                bfdy0.c = bdcd0;
                bfdy0.d = becz0;
                bfdy0.h = 1;
                object0 = bdbr.b(bdbr0, hepk0.e, bfdy0);
                if(object0 == ibrx0) {
                    goto label_106;
                }
                hepk hepk1 = hepk0;
                becz becz2 = becz0;
                String s1 = s;
                bdcd bdcd1 = bdcd0;
                goto label_37;
            }
            case 1: {
                becz2 = (becz)bfdy0.d;
                bdcd1 = (bdcd)bfdy0.c;
                hepk1 = (hepk)bfdy0.b;
                s1 = (String)bfdy0.a;
                ibnx.b(object0);
            label_37:
                if(((CrossUserSharingPrivateKey)object0) == null) {
                    ((ggtj)bfdz.a.j()).x("Recipient encryption private key with invitation version is missing");
                    return Boolean.valueOf(false);
                }
                byte[] arr_b = hepk1.d.toByteArray();
                ibuq.e(arr_b, "toByteArray(...)");
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)heow.a).v_newBuilder();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                heow heow0 = (heow)hftp0.b_message;
                heow0.b |= 1;
                heow0.c = ((CrossUserSharingPrivateKey)object0).a;
                ByteString hfsf0 = ByteString.copyFrom(((CrossUserSharingPrivateKey)object0).b);
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                heow heow1 = (heow)hftp0.b_message;
                heow1.b |= 2;
                heow1.d = hfsf0;
                ProtoLiteMessage hftv0 = hftp0.N_build();
                ibuq.e(hftv0, "build(...)");
                herj herj0 = hepk1.c == null ? herj.a : hepk1.c;
                heox heox0 = herj0.e == null ? heox.a : herj0.e;
                ibuq.e(heox0, "getCrossUserSharingPublicKey(...)");
                ibuq.f(arr_b, "encryptedData");
                ibuq.f(((heow)hftv0), "recipientPrivateKey");
                ibuq.f(heox0, "senderPublicKey");
                byte[] arr_b1 = ((heow)hftv0).d.toByteArray();
                ibuq.e(arr_b1, "toByteArray(...)");
                gmwa gmwa0 = bfdn.a(arr_b1);
                byte[] arr_b2 = heox0.c.toByteArray();
                ibuq.e(arr_b2, "toByteArray(...)");
                gmwi gmwi0 = bfdn.b(arr_b2);
                if(!gmwa0.d().equals(gmwi0.a)) {
                    goto label_109;
                }
                gmvz gmvz0 = gmwa0.d();
                gmvx gmvx0 = gmvz0.a;
                gmyf gmyf0 = gmyj.b(gmvx0);
                gmxz gmxz0 = gmyj.c(gmvz0.b);
                gmyb gmyb0 = gmyj.a(gmvz0.c);
                if(gmvx0 == gmvx.f) {
                    int v2 = 0x20;
                    goto label_85;
                }
                else if(gmvx0 == gmvx.a) {
                    v2 = 65;
                    goto label_85;
                }
                else if(gmvx0 == gmvx.b) {
                    v2 = 97;
                    goto label_85;
                }
                else {
                    if(gmvx0 == gmvx.c) {
                        v2 = 0x85;
                    label_85:
                        gmyi gmyi0 = gmyh.a(gmwa0);
                        if(arr_b.length >= v2) {
                            byte[] arr_b3 = Arrays.copyOf(arr_b, v2);
                            byte[] arr_b4 = Arrays.copyOfRange(arr_b, v2, arr_b.length);
                            byte[] arr_b5 = gmyf0.c(arr_b3, gmyi0, gmwi0.b.c());
                            byte[] arr_b6 = gmyc.c(gmyo.b, arr_b3, arr_b5, gmyf0, gmxz0, gmyb0, new byte[0]).b(arr_b4, 0, gmze.a);
                            ProtoLiteMessage hftv1 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)hepw.a), arr_b6, 0, arr_b6.length, hftc.a);
                            ProtoLiteMessage.P_makeImmutable(hftv1);
                            ibuq.e(((hepw)hftv1), "parseFrom(...)");
                            evql evql0 = bdcd1.c();
                            bfdy0.a = s1;
                            bfdy0.b = hepk1;
                            bfdy0.c = bdcd1;
                            bfdy0.d = becz2;
                            bfdy0.e = (hepw)hftv1;
                            bfdy0.h = 2;
                            object0 = ictn.b(evql0, bfdy0);
                            if(object0 != ibrx0) {
                                hepw hepw0 = (hepw)hftv1;
                                bdcd bdcd2 = bdcd1;
                                goto label_121;
                            }
                        label_106:
                            return ibrx0;
                        }
                        throw new GeneralSecurityException("Ciphertext is too short.");
                    }
                    throw new IllegalArgumentException("Unable to determine KEM-encoding length for " + gmvx0.toString());
                label_109:
                    throw new IllegalArgumentException("Sender HPKE params do not match the recipient\'s params.");
                }
                goto label_121;
            }
            case 2: {
                hepw hepw1 = (hepw)bfdy0.e;
                becz becz3 = (becz)bfdy0.d;
                bdcd bdcd3 = (bdcd)bfdy0.c;
                hepk hepk2 = (hepk)bfdy0.b;
                String s2 = (String)bfdy0.a;
                ibnx.b(object0);
                hepw0 = hepw1;
                becz2 = becz3;
                bdcd2 = bdcd3;
                hepk1 = hepk2;
                s1 = s2;
            label_121:
                herj herj1 = hepk1.c == null ? herj.a : hepk1.c;
                herh herh0 = herj1.d == null ? herh.a : herj1.d;
                ibuq.e(herh0, "getUserDisplayInfo(...)");
                ibuq.c(((gged_interceptors)object0));
                ibuq.f(hepw0, "<this>");
                ibuq.f(herh0, "senderInfo");
                hfuo hfuo0 = (hepw0.c == null ? hepu.a : hepw0.c).e;
                ibuq.e(hfuo0, "getElementDataList(...)");
                ArrayList arrayList0 = new ArrayList(ibpo.q(hfuo0, 10));
                Iterator iterator0;
                for(iterator0 = hfuo0.iterator(); iterator0.hasNext(); iterator0 = iterator0) {
                    Object object1 = iterator0.next();
                    heqd heqd0 = heqc.a(((ProtoLiteMessage)heqb.a).v_newBuilder());
                    String s3 = (hepw0.c == null ? hepu.a : hepw0.c).c;
                    ibuq.e(s3, "getUsernameValue(...)");
                    heqd0.j(s3);
                    String s4 = (hepw0.c == null ? hepu.a : hepw0.c).d;
                    ibuq.e(s4, "getPasswordValue(...)");
                    heqd0.f(s4);
                    heqd0.g(((hepv)object1).c);
                    String s5 = ((hepv)object1).d;
                    ibuq.e(s5, "getSignonRealm(...)");
                    heqd0.h(s5);
                    String s6 = ((hepv)object1).e;
                    ibuq.e(s6, "getOrigin(...)");
                    heqd0.e(s6);
                    String s7 = ((hepv)object1).f;
                    ibuq.e(s7, "getUsernameElement(...)");
                    ibuq.f(s7, "value");
                    ProtoLiteBuilder hftp1 = heqd0.a;
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    heqb heqb0 = (heqb)hftp1.b_message;
                    s7.getClass();
                    heqb0.b |= 16;
                    heqb0.f = s7;
                    String s8 = ((hepv)object1).g;
                    ibuq.e(s8, "getPasswordElement(...)");
                    ibuq.f(s8, "value");
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    heqb heqb1 = (heqb)hftp1.b_message;
                    s8.getClass();
                    heqb1.b |= 0x40;
                    heqb1.h = s8;
                    String s9 = ((hepv)object1).h;
                    ibuq.e(s9, "getDisplayName(...)");
                    ibuq.f(s9, "value");
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    heqb heqb2 = (heqb)hftp1.b_message;
                    s9.getClass();
                    heqb2.b |= 0x4000;
                    heqb2.o = s9;
                    String s10 = ((hepv)object1).i;
                    ibuq.e(s10, "getAvatarUrl(...)");
                    ibuq.f(s10, "value");
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    heqb heqb3 = (heqb)hftp1.b_message;
                    s10.getClass();
                    heqb3.b |= 0x8000;
                    heqb3.p = s10;
                    heqd0.i(5);
                    heqd0.b(bgnf.a());
                    String s11 = herh0.b;
                    ibuq.e(s11, "getEmail(...)");
                    ibuq.f(s11, "value");
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    heqb heqb4 = (heqb)hftp1.b_message;
                    s11.getClass();
                    heqb4.b |= 0x200000;
                    heqb4.v = s11;
                    String s12 = herh0.c;
                    ibuq.e(s12, "getDisplayName(...)");
                    ibuq.f(s12, "value");
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    heqb heqb5 = (heqb)hftp1.b_message;
                    s12.getClass();
                    heqb5.b |= 0x400000;
                    heqb5.w = s12;
                    String s13 = herh0.d;
                    ibuq.e(s13, "getProfileImageUrl(...)");
                    ibuq.f(s13, "value");
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    heqb heqb6 = (heqb)hftp1.b_message;
                    s13.getClass();
                    heqb6.b |= 0x2000000;
                    heqb6.z = s13;
                    long v3 = bgnf.a();
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    ProtoLiteMessage hftv2 = hftp1.b_message;
                    ((heqb)hftv2).b |= 0x800000;
                    ((heqb)hftv2).x = v3;
                    if(!hftv2.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    heqb heqb7 = (heqb)hftp1.b_message;
                    heqb7.b |= 0x1000000;
                    heqb7.y = false;
                    arrayList0.add(heqd0.a());
                    becz2 = becz2;
                    ibrx0 = ibrx0;
                    bdcd2 = bdcd2;
                    hepw0 = hepw0;
                }
                ArrayList arrayList1 = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for(Object object2: arrayList0) {
                    heqb heqb8 = (heqb)object2;
                    ibuq.f(heqb8, "<this>");
                    String s14 = heqb8.i;
                    ibuq.e(s14, "getPasswordValue(...)");
                    if(s14.length() > 0) {
                        String s15 = heqb8.e;
                        ibuq.e(s15, "getOrigin(...)");
                        if(s15.length() > 0) {
                            String s16 = heqb8.d;
                            ibuq.e(s16, "getSignonRealm(...)");
                            if(s16.length() > 0) {
                                String s17 = heqb8.f;
                                ibuq.e(s17, "getUsernameElement(...)");
                                if(bfdv.b(s17)) {
                                    String s18 = heqb8.g;
                                    ibuq.e(s18, "getUsernameValue(...)");
                                    if(bfdv.b(s18)) {
                                        String s19 = heqb8.h;
                                        ibuq.e(s19, "getPasswordElement(...)");
                                        if(bfdv.b(s19)) {
                                            String s20 = heqb8.i;
                                            ibuq.e(s20, "getPasswordValue(...)");
                                            if(bfdv.b(s20)) {
                                                String s21 = heqb8.d;
                                                ibuq.e(s21, "getSignonRealm(...)");
                                                if(bfdv.b(s21)) {
                                                    String s22 = heqb8.o;
                                                    ibuq.e(s22, "getDisplayName(...)");
                                                    if(bfdv.b(s22)) {
                                                        String s23 = heqb8.w;
                                                        ibuq.e(s23, "getSenderName(...)");
                                                        if(bfdv.b(s23)) {
                                                            arrayList1.add(object2);
                                                            continue;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    arrayList2.add(object2);
                }
                ibns ibns0 = new ibns(arrayList1, arrayList2);
                List list0 = (List)ibns0.b;
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                Iterator iterator2 = ((List)ibns0.a).iterator();
            label_277:
                while(iterator2.hasNext()) {
                    Object object3 = iterator2.next();
                    heqb heqb9 = (heqb)object3;
                    ibuq.f(heqb9, "<this>");
                    ibuq.f(((gged_interceptors)object0), "list");
                    if(!(((gged_interceptors)object0) instanceof Collection) || !((gged_interceptors)object0).isEmpty()) {
                        for(Object object4: ((gged_interceptors)object0)) {
                            if(bfdv.a(((heqb)object4), heqb9)) {
                                arrayList4.add(object3);
                                continue label_277;
                            }
                            else {
                                continue;
                            }
                            break;
                        }
                    }
                    arrayList3.add(object3);
                }
                ibns ibns1 = new ibns(arrayList3, arrayList4);
                List list1 = (List)ibns1.a;
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                Iterator iterator4 = ((List)ibns1.b).iterator();
            label_297:
                while(iterator4.hasNext()) {
                    Object object5 = iterator4.next();
                    heqb heqb10 = (heqb)object5;
                    ibuq.f(heqb10, "<this>");
                    ibuq.f(((gged_interceptors)object0), "list");
                    if(!(((gged_interceptors)object0) instanceof Collection) || !((gged_interceptors)object0).isEmpty()) {
                        for(Object object6: ((gged_interceptors)object0)) {
                            heqb heqb11 = (heqb)object6;
                            if(bfdv.a(heqb11, heqb10) && ibuq.m(heqb11.i, heqb10.i)) {
                                arrayList5.add(object5);
                                continue label_297;
                            }
                            else {
                                continue;
                            }
                            break;
                        }
                    }
                    arrayList6.add(object5);
                }
                ibns ibns2 = new ibns(arrayList5, arrayList6);
                List list2 = (List)ibns2.a;
                ArrayList arrayList7 = new ArrayList();
                ArrayList arrayList8 = new ArrayList();
                Iterator iterator6 = ((List)ibns2.b).iterator();
                while(iterator6.hasNext()) {
                    Object object7 = iterator6.next();
                    heqb heqb12 = (heqb)object7;
                    ibuq.f(heqb12, "<this>");
                    ibuq.f(((gged_interceptors)object0), "list");
                    if(!(((gged_interceptors)object0) instanceof Collection) || !((gged_interceptors)object0).isEmpty()) {
                        for(Object object8: ((gged_interceptors)object0)) {
                            heqb heqb13 = (heqb)object8;
                            if(!bfdv.a(heqb13, heqb12)) {
                                continue;
                            }
                            Iterator iterator8 = iterator6;
                            if(heqb13.m != 5 && !ibuq.m(heqb13.i, heqb12.i)) {
                                arrayList7.add(object7);
                                goto label_337;
                            }
                            else {
                                iterator6 = iterator8;
                                continue;
                            }
                            break;
                        }
                    }
                    iterator8 = iterator6;
                    arrayList8.add(object7);
                label_337:
                    iterator6 = iterator8;
                }
                ibns ibns3 = new ibns(arrayList7, arrayList8);
                List list3 = (List)ibns3.a;
                ArrayList arrayList9 = new ArrayList();
                ArrayList arrayList10 = new ArrayList();
                Iterator iterator9 = ((List)ibns3.b).iterator();
                while(iterator9.hasNext()) {
                    Object object9 = iterator9.next();
                    heqb heqb14 = (heqb)object9;
                    ibuq.f(heqb14, "<this>");
                    ibuq.f(((gged_interceptors)object0), "list");
                    if(!(((gged_interceptors)object0) instanceof Collection) || !((gged_interceptors)object0).isEmpty()) {
                        for(Object object10: ((gged_interceptors)object0)) {
                            heqb heqb15 = (heqb)object10;
                            if(!bfdv.a(heqb15, heqb14)) {
                                continue;
                            }
                            Iterator iterator11 = iterator9;
                            if(heqb15.m == 5 && ibuq.m(heqb15.v, heqb14.v) && !ibuq.m(heqb15.i, heqb14.i)) {
                                arrayList9.add(object9);
                                goto label_363;
                            }
                            else {
                                iterator9 = iterator11;
                                continue;
                            }
                            break;
                        }
                    }
                    iterator11 = iterator9;
                    arrayList10.add(object9);
                label_363:
                    iterator9 = iterator11;
                }
                ibns ibns4 = new ibns(arrayList9, arrayList10);
                bfdu0 = new bfdu(list0, list1, list2, list3, ((List)ibns4.a), ((List)ibns4.b));
                bfdy0.a = s1;
                bfdy0.b = hepk1;
                becz1 = becz2;
                bfdy0.c = becz1;
                bfdy0.d = hepw0;
                bfdy0.e = bfdu0;
                bfdy0.h = 3;
                bfdz bfdz0 = this;
                Object object11 = bfdz0.a(bfdu0, bdcd2, bfdy0);
                Object object12 = ibrx0;
                if(object11 != object12) {
                    hepw hepw2 = hepw0;
                    object0 = object11;
                    goto label_392;
                }
                goto label_567;
            }
            case 3: {
                bfdu bfdu1 = (bfdu)bfdy0.e;
                hepw hepw3 = (hepw)bfdy0.d;
                becz becz4 = (becz)bfdy0.c;
                hepk1 = (hepk)bfdy0.b;
                s1 = (String)bfdy0.a;
                ibnx.b(object0);
                object12 = ibrx0;
                hepw2 = hepw3;
                bfdz0 = this;
                bfdu0 = bfdu1;
                becz1 = becz4;
            label_392:
                if(!((Boolean)object0).booleanValue()) {
                    goto label_554;
                }
                bfet bfet0 = bfdz0.f;
                String s24 = hepk1.b;
                ibuq.e(s24, "getGuid(...)");
                herj herj2 = hepk1.c == null ? herj.a : hepk1.c;
                String s25 = (herj2.d == null ? herh.a : herj2.d).c;
                ibuq.e(s25, "getDisplayName(...)");
                herj herj3 = hepk1.c == null ? herj.a : hepk1.c;
                String s26 = (herj3.d == null ? herh.a : herj3.d).d;
                ibuq.e(s26, "getProfileImageUrl(...)");
                bfer bfer0 = bfdz0.g;
                hfuo hfuo1 = (hepw2.c == null ? hepu.a : hepw2.c).e;
                ibuq.e(hfuo1, "getElementDataList(...)");
                ArrayList arrayList11 = new ArrayList(ibpo.q(hfuo1, 10));
                for(Object object13: hfuo1) {
                    String s27 = ((hepv)object13).d;
                    ibuq.e(s27, "getSignonRealm(...)");
                    arrayList11.add(s27);
                }
                bfdy0.a = becz1;
                bfdy0.b = bfdu0;
                bfdy0.c = bfet0;
                bfdy0.d = s24;
                bfdy0.e = s25;
                bfdy0.i = s26;
                bfdy0.h = 4;
                ibuq.f(s1, "accountName");
                ibuq.f(s1, "accountName");
                Context context0 = bfer0.c.a.a;
                bdbk bdbk0 = new bdbk((bdim.a(s1) ? new azts(context0, axzj.b()) : ayss.h(context0, new Account(s1, "com.google"))));
                ArrayList arrayList12 = new ArrayList(ibpo.q(arrayList11, 10));
                for(Object object14: arrayList11) {
                    arrayList12.add(bgmt.b(((String)object14)));
                }
                ArrayList arrayList13 = new ArrayList();
                for(Object object15: arrayList12) {
                    if((object15 instanceof bedw)) {
                        arrayList13.add(object15);
                    }
                    bfdu0 = bfdu0;
                }
                Iterator iterator15 = arrayList13.iterator();
                while(true) {
                    if(iterator15.hasNext()) {
                        Object object16 = iterator15.next();
                        bedw bedw0 = (bedw)object16;
                        Intent intent0 = bfer0.a.getPackageManager().getLaunchIntentForPackage(bedw0.a);
                        if(intent0 != null) {
                            intent0.addFlags(0x10000000);
                            Object object17 = bfer0.c(bedw0, s1, bdbk0, intent0, bfdy0);
                            break;
                        }
                        iterator15 = iterator15;
                        continue;
                    }
                    ArrayList arrayList14 = new ArrayList();
                    Iterator iterator16 = arrayList12.iterator();
                    while(true) {
                        object17 = null;
                        if(!iterator16.hasNext()) {
                            break;
                        }
                        Object object18 = iterator16.next();
                        if(!(object18 instanceof bedy)) {
                            continue;
                        }
                        arrayList14.add(object18);
                    }
                    if(!arrayList14.isEmpty()) {
                        object17 = bfer0.b(((bedy)ibpo.R(arrayList14)), s1, bdbk0, bfdy0);
                        break;
                    }
                    else if(arrayList13.isEmpty()) {
                    label_467:
                        break;
                    }
                    else {
                        bedw bedw1 = (bedw)ibpo.R(arrayList13);
                        Intent intent1 = new Intent("android.intent.action.VIEW");
                        intent1.addFlags(0x10000000);
                        intent1.setData(Uri.parse(("market://details?id=" + bedw1.a)));
                        object17 = bfer0.c(bedw1, s1, bdbk0, intent1, bfdy0);
                        goto label_467;
                    }
                    goto label_567;
                }
                if(object17 != object12) {
                    bfet bfet1 = bfet0;
                    object0 = object17;
                    bfdu bfdu2 = bfdu0;
                    goto label_486;
                }
                goto label_567;
            }
            case 4: {
                break;
            }
            default: {
                if(v1 == 5) {
                    bfdu bfdu0 = (bfdu)bfdy0.b;
                    becz becz1 = (becz)bfdy0.a;
                    ibnx.b(object0);
                    goto label_554;
                }
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        String s28 = bfdy0.i;
        String s29 = (String)bfdy0.e;
        String s30 = (String)bfdy0.d;
        bfet1 = (bfet)bfdy0.c;
        bfdu bfdu3 = (bfdu)bfdy0.b;
        becz becz5 = (becz)bfdy0.a;
        ibnx.b(object0);
        s25 = s29;
        becz1 = becz5;
        object12 = ibrx0;
        s24 = s30;
        s26 = s28;
        bfdu2 = bfdu3;
    label_486:
        bfdy0.a = becz1;
        bfdy0.b = bfdu2;
        bfdy0.c = null;
        bfdy0.d = null;
        bfdy0.e = null;
        bfdy0.i = null;
        bfdy0.h = 5;
        if(((bfen)object0) == null) {
            ((ggtj)bfet.a.j()).x("Missing notification info, notification is not displayed.");
            ibom ibom0 = ibom.a;
            bfdu bfdu4 = bfdu2;
            becz becz6 = becz1;
        }
        else {
            Context context1 = bfet1.b;
            bayn bayn0 = bayn.f(context1);
            if(bayn0 == null) {
                ibom0 = ibom.a;
                bfdu4 = bfdu2;
                becz6 = becz1;
            }
            else {
                bgmb.a(bayn0, context1);
                if(bayn0.c("com.google.android.gms.notifications::password_sharing") == null) {
                    NotificationChannel notificationChannel0 = new NotificationChannel("com.google.android.gms.notifications::password_sharing", "Password Sharing", 3);
                    notificationChannel0.setImportance(4);
                    notificationChannel0.setGroup("CREDENTIAL_MANAGER_CHANNEL_GROUP_ID");
                    bayn0.p(notificationChannel0);
                }
                int v4 = s24.hashCode() - 0x57AC393;
                evuh evuh0 = evuh.cD;
                ibuq.f(s25, "senderDisplayName");
                ibuq.f(s26, "senderAvatarUrl");
                ibuq.e("Password shared with you", "getString(...)");
                bfdu4 = bfdu2;
                becz6 = becz1;
                String s31 = context1.getResources().getString(0x7F15279F, new Object[]{s25});  // string:pwm_sharing_received_password_notification_short_description "%1$s shared 
                                                                                                // a password"
                ibuq.e(s31, "getString(...)");
                String s32 = context1.getResources().getString(0x7F15279D, new Object[]{s25, ((bfen)object0).c});  // string:pwm_sharing_received_password_notification_long_description "%1$s shared 
                                                                                                                   // a password for %2$s"
                ibuq.e(s32, "getString(...)");
                String s33 = context1.getResources().getString(0x7F15279C, new Object[]{((bfen)object0).c});  // string:pwm_sharing_received_password_notification_go_to_action_title "Go to %1$s"
                ibuq.e(s33, "getString(...)");
                juo juo0 = new juo(context1, "com.google.android.gms.notifications::password_sharing");
                juo0.D("Password shared with you");
                juo0.k(s31);
                juk juk0 = new juk();
                juk0.e(s32);
                juo0.v(juk0);
                juo0.s(0x7F080A73);
                ibuq.f(s26, "senderAvatarUrl");
                Bitmap bitmap0 = (Bitmap)((txx)txc.d(context1).b().h(s26).q()).l().get();
                if(bitmap0 == null) {
                    bitmap0 = BitmapFactory.decodeResource(context1.getResources(), 0x7F080A73);
                    ibuq.e(bitmap0, "decodeResource(...)");
                }
                juo0.H(bitmap0);
                juo0.h(true);
                juo0.m = 1;
                juo0.h = bfes.a(context1, ((bfen)object0).a, ((bfen)object0).b);
                juo0.d(0, "Manage Password", bfes.a(context1, ((bfen)object0).a, ((bfen)object0).b));
                ibuq.f(((bfen)object0).d, "<this>");
                PendingIntent pendingIntent0 = cjok.a(context1, 0, ((bfen)object0).d, 0xC000000);
                ibuq.e(pendingIntent0, "getActivity(...)");
                juo0.d(0, s33, pendingIntent0);
                Notification notification0 = juo0.a();
                ibuq.e(notification0, "build(...)");
                bayn0.y("password_sharing_notification_tag", v4, evuh0, notification0);
                ibom0 = ibom.a;
                object12 = object12;
            }
        }
        if(ibom0 != object12) {
            bfdu0 = bfdu4;
            becz1 = becz6;
        label_554:
            bfdo bfdo0 = new bfdo();
            bfdv.c(bfdu0.a, bfdo0);
            bfdp bfdp0 = new bfdp(becz1);
            bfdv.c(bfdu0.b, bfdp0);
            bfdq bfdq0 = new bfdq(becz1);
            bfdv.c(bfdu0.c, bfdq0);
            bfdr bfdr0 = new bfdr(becz1);
            bfdv.c(bfdu0.d, bfdr0);
            bfds bfds0 = new bfds(becz1);
            bfdv.c(bfdu0.f, bfds0);
            bfdt bfdt0 = new bfdt(becz1);
            bfdv.c(bfdu0.e, bfdt0);
            return Boolean.valueOf(true);
        }
    label_567:
        return object12;
    }
}

