import com.google.android.gms.identitycredentials.credentialexchange.CredentialExchangeFormat.Account;
import com.google.android.gms.identitycredentials.credentialexchange.CredentialExchangeFormat.AndroidAppCertificateFingerprint;
import com.google.android.gms.identitycredentials.credentialexchange.CredentialExchangeFormat.AndroidAppId;
import com.google.android.gms.identitycredentials.credentialexchange.CredentialExchangeFormat.Credential.BasicAuthCredential;
import com.google.android.gms.identitycredentials.credentialexchange.CredentialExchangeFormat.Credential.GeneratedPasswordCredential;
import com.google.android.gms.identitycredentials.credentialexchange.CredentialExchangeFormat.Credential.NoteCredential;
import com.google.android.gms.identitycredentials.credentialexchange.CredentialExchangeFormat.Credential.PasskeyCredential;
import com.google.android.gms.identitycredentials.credentialexchange.CredentialExchangeFormat.CredentialScope;
import com.google.android.gms.identitycredentials.credentialexchange.CredentialExchangeFormat.EditableField;
import com.google.android.gms.identitycredentials.credentialexchange.CredentialExchangeFormat.Fido2Extensions;
import com.google.android.gms.identitycredentials.credentialexchange.CredentialExchangeFormat.Fido2HmacCredentials;
import com.google.android.gms.identitycredentials.credentialexchange.CredentialExchangeFormat.Fido2LargeBlob;
import com.google.android.gms.identitycredentials.credentialexchange.CredentialExchangeFormat.Header;
import com.google.android.gms.identitycredentials.credentialexchange.CredentialExchangeFormat.Item;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

public final class bdjs {
    private static final bboh a;
    private final String b;
    private final bxwm c;
    private final bdkb d;
    private final beih e;
    private final begp f;
    private final bdoe g;
    private final bdnq h;

    static {
        bdjs.a = bboh.b("CredentialImporter", bbcu.cX);
    }

    public bdjs(String s, bdog bdog0, bdns bdns0, bxwm bxwm0, bdkb bdkb0, beih beih0, begp begp0) {
        ibuq.f(bdog0, "passwordStorageFactory");
        ibuq.f(bdns0, "passkeyStorageFactory");
        ibuq.f(beih0, "passwordDataRepository");
        ibuq.f(begp0, "passkeyDataRepository");
        super();
        this.b = s;
        this.c = bxwm0;
        this.d = bdkb0;
        this.e = beih0;
        this.f = begp0;
        this.g = bdog0.a(s);
        this.h = bdns0.a(s);
    }

    static Object a(bdjs bdjs0, ibrl ibrl0) {
        Object object15;
        Iterator iterator11;
        bxwm bxwm1;
        byte[] arr_b8;
        byte[] arr_b7;
        byte[] arr_b6;
        Long long3;
        CredentialExchangeFormat.Fido2Extensions credentialExchangeFormat$Fido2Extensions0;
        byte[] arr_b4;
        String s11;
        String s10;
        byte[] arr_b3;
        String s9;
        byte[] arr_b2;
        byte[] arr_b1;
        String s8;
        String s5;
        CredentialExchangeFormat.AndroidAppId credentialExchangeFormat$AndroidAppId1;
        Object object7;
        CredentialExchangeFormat.CredentialScope credentialExchangeFormat$CredentialScope0;
        byte[] arr_b;
        bboh bboh1;
        Object object6;
        String s4;
        String s3;
        bxwj bxwj0;
        CredentialExchangeFormat.Header credentialExchangeFormat$Header0;
        bdjq bdjq0;
        bdjs bdjs1 = bdjs0;
        if((ibrl0 instanceof bdjq)) {
            bdjq0 = (bdjq)ibrl0;
            int v = bdjq0.c;
            if((v & 0x80000000) == 0) {
                bdjq0 = new bdjq(bdjs1, ibrl0);
            }
            else {
                bdjq0.c = v - 0x80000000;
            }
        }
        else {
            bdjq0 = new bdjq(bdjs1, ibrl0);
        }
        Object object0 = bdjq0.a;
        Object object1 = ibrx.a;
        switch(bdjq0.c) {
            case 0: {
                ibnx.b(object0);
                ((ggtj)bdjs.a.h()).x("Requesting importing credentials");
                bdjq0.d = bdjs1;
                bdjq0.c = 1;
                object0 = bdkb.a(bdjs1.d, bdjq0);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                bdjs1 = bdjq0.d;
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if((((bdjz)object0) instanceof bdjy)) {
            String s = ((bdjy)(((bdjz)object0))).a;
            bxwm bxwm0 = bdjs1.c;
            try {
                hmxq hmxq0 = bxwm0.b.a(CredentialExchangeFormat.Header.class);
                idlm idlm0 = new idlm();
                idlm0.ag(s);
                hmya hmya0 = new hmya(idlm0);
                Object object2 = hmxq0.a(hmya0);
                if(hmya0.q() != 10) {
                    throw new hmxs("JSON document was not fully consumed.");
                }
                credentialExchangeFormat$Header0 = (CredentialExchangeFormat.Header)object2;
                if(credentialExchangeFormat$Header0 == null) {
                    bxwj0 = bxwj.a;
                }
                else {
                    goto label_49;
                }
            }
            catch(IllegalArgumentException illegalArgumentException0) {
                a.ae(bxwm.a.j(), "Illegal argument parsing export response json", illegalArgumentException0);
                bxwj0 = bxwj.a;
            }
            catch(IOException iOException0) {
                a.ae(bxwm.a.j(), "IO error parsing export response json", iOException0);
                bxwj0 = bxwj.a;
            }
            catch(hmxs hmxs0) {
                a.ae(bxwm.a.j(), "Syntax error parsing export response json", hmxs0);
                bxwj0 = bxwj.a;
            }
            goto label_269;
        label_49:
            bboh bboh0 = bxwm.a;
            ((ggtj)bboh0.h()).x("Parsed export response Json");
            ArrayList arrayList0 = new ArrayList(ibpo.q(credentialExchangeFormat$Header0.e, 10));
            for(Object object3: credentialExchangeFormat$Header0.e) {
                String s1 = ((CredentialExchangeFormat.Account)object3).c;
                List list0 = ((CredentialExchangeFormat.Account)object3).f;
                ArrayList arrayList1 = new ArrayList();
                for(Object object4: list0) {
                    CredentialExchangeFormat.Item credentialExchangeFormat$Item0 = (CredentialExchangeFormat.Item)object4;
                    ArrayList arrayList2 = new ArrayList();
                    for(Object object5: credentialExchangeFormat$Item0.h) {
                        bxvy bxvy0 = (bxvy)object5;
                        if((bxvy0 instanceof CredentialExchangeFormat.Credential.BasicAuthCredential)) {
                            CredentialExchangeFormat.EditableField credentialExchangeFormat$EditableField0 = ((CredentialExchangeFormat.Credential.BasicAuthCredential)bxvy0).b;
                            String s2 = credentialExchangeFormat$EditableField0 == null ? null : credentialExchangeFormat$EditableField0.c;
                            if(s2 != null && s2.length() != 0) {
                                CredentialExchangeFormat.EditableField credentialExchangeFormat$EditableField1 = ((CredentialExchangeFormat.Credential.BasicAuthCredential)bxvy0).a;
                                s3 = credentialExchangeFormat$EditableField1 == null ? null : credentialExchangeFormat$EditableField1.c;
                                s4 = credentialExchangeFormat$EditableField0.c;
                                goto label_87;
                            }
                            else {
                                ((ggtj)bboh0.h()).x("Encountered BasicAuthCredential without a password");
                                object6 = null;
                                bboh1 = bboh0;
                                goto label_164;
                            }
                            goto label_79;
                        }
                        else {
                        label_79:
                            if((bxvy0 instanceof CredentialExchangeFormat.Credential.GeneratedPasswordCredential)) {
                                s4 = ((CredentialExchangeFormat.Credential.GeneratedPasswordCredential)bxvy0).a;
                                if(s4.length() == 0) {
                                    ((ggtj)bboh0.h()).x("Encountered GeneratedPasswordCredential without a password");
                                    object6 = null;
                                    bboh1 = bboh0;
                                    goto label_164;
                                }
                                else {
                                    s3 = "";
                                }
                                try {
                                label_87:
                                    arr_b = bxwi.a(credentialExchangeFormat$Item0.a);
                                    credentialExchangeFormat$CredentialScope0 = credentialExchangeFormat$Item0.g;
                                }
                                catch(IllegalArgumentException illegalArgumentException1) {
                                    bboh1 = bboh0;
                                    a.ae(bxwm.a.j(), "Error base64 decoding password data", illegalArgumentException1);
                                    goto label_163;
                                }
                                if(credentialExchangeFormat$CredentialScope0 != null) {
                                    List list1 = credentialExchangeFormat$CredentialScope0.b;
                                    if(list1 != null) {
                                        Iterator iterator3 = list1.iterator();
                                        while(true) {
                                            if(iterator3.hasNext()) {
                                                object7 = iterator3.next();
                                                CredentialExchangeFormat.AndroidAppId credentialExchangeFormat$AndroidAppId0 = (CredentialExchangeFormat.AndroidAppId)object7;
                                                bboh1 = bboh0;
                                                if(credentialExchangeFormat$AndroidAppId0.a.length() == 0 || (credentialExchangeFormat$AndroidAppId0.b == null || credentialExchangeFormat$AndroidAppId0.b.a.length() == 0)) {
                                                    bboh0 = bboh1;
                                                    continue;
                                                }
                                                else {
                                                    break;
                                                }
                                            }
                                            bboh1 = bboh0;
                                            object7 = null;
                                            break;
                                        }
                                        credentialExchangeFormat$AndroidAppId1 = (CredentialExchangeFormat.AndroidAppId)object7;
                                        goto label_112;
                                    }
                                }
                                bboh1 = bboh0;
                                credentialExchangeFormat$AndroidAppId1 = null;
                            label_112:
                                if(credentialExchangeFormat$AndroidAppId1 != null) {
                                    CredentialExchangeFormat.AndroidAppCertificateFingerprint credentialExchangeFormat$AndroidAppCertificateFingerprint0 = credentialExchangeFormat$AndroidAppId1.b;
                                    if(credentialExchangeFormat$AndroidAppCertificateFingerprint0 != null) {
                                        s5 = "android://" + credentialExchangeFormat$AndroidAppCertificateFingerprint0.a + "@" + credentialExchangeFormat$AndroidAppId1.a + "/";
                                        goto label_138;
                                    }
                                }
                                if(credentialExchangeFormat$CredentialScope0 != null) {
                                    Set set0 = credentialExchangeFormat$CredentialScope0.a;
                                    if(set0 != null) {
                                        for(Object object8: set0) {
                                            URI uRI0 = bxwp.a(((String)object8));
                                            if(uRI0 == null || uRI0.getScheme() == null) {
                                                continue;
                                            }
                                            String s6 = uRI0.getHost();
                                            if(s6 == null) {
                                                continue;
                                            }
                                            String s7 = s6.toLowerCase(Locale.ROOT);
                                            ibuq.e(s7, "toLowerCase(...)");
                                            if(s7 == null || s7.length() <= 0 || ibzk.W(s7, ".") || ibzk.J(s7, ".")) {
                                                continue;
                                            }
                                            s5 = (String)object8;
                                            goto label_135;
                                        }
                                        object8 = null;
                                        s5 = (String)object8;
                                        goto label_135;
                                    }
                                }
                                s5 = null;
                            label_135:
                                if(s5 == null) {
                                    s8 = null;
                                }
                                else {
                                label_138:
                                    s8 = s5;
                                }
                                if(s8 != null && s8.length() != 0) {
                                    Long long0 = credentialExchangeFormat$Item0.b;
                                    Long long1 = credentialExchangeFormat$Item0.c;
                                    ArrayList arrayList3 = new ArrayList();
                                    for(Object object9: credentialExchangeFormat$Item0.h) {
                                        bxvy bxvy1 = (bxvy)object9;
                                        CredentialExchangeFormat.Credential.NoteCredential credentialExchangeFormat$Credential$NoteCredential0 = (bxvy1 instanceof CredentialExchangeFormat.Credential.NoteCredential) ? ((CredentialExchangeFormat.Credential.NoteCredential)bxvy1) : null;
                                        if(credentialExchangeFormat$Credential$NoteCredential0 != null) {
                                            arrayList3.add(credentialExchangeFormat$Credential$NoteCredential0);
                                        }
                                        long0 = long0;
                                    }
                                    ArrayList arrayList4 = new ArrayList(ibpo.q(arrayList3, 10));
                                    for(Object object10: arrayList3) {
                                        arrayList4.add(((CredentialExchangeFormat.Credential.NoteCredential)object10).a.c);
                                    }
                                    object6 = new bxwt(arr_b, s8, s8, s3, s4, long0, long1, arrayList4);
                                    goto label_164;
                                }
                                else {
                                    ((ggtj)bxwm.a.h()).x("Skipping credential due to empty or invalid scope");
                                    goto label_163;
                                }
                                goto label_162;
                            }
                            else {
                            label_162:
                                bboh1 = bboh0;
                            }
                        }
                    label_163:
                        object6 = null;
                    label_164:
                        if(object6 != null) {
                            arrayList2.add(object6);
                        }
                        bboh0 = bboh1;
                    }
                    ibpo.D(arrayList1, arrayList2);
                }
                ArrayList arrayList5 = new ArrayList();
                for(Object object11: list0) {
                    CredentialExchangeFormat.Item credentialExchangeFormat$Item1 = (CredentialExchangeFormat.Item)object11;
                    ArrayList arrayList6 = new ArrayList();
                    for(Object object12: credentialExchangeFormat$Item1.h) {
                        bxvy bxvy2 = (bxvy)object12;
                        CredentialExchangeFormat.Credential.PasskeyCredential credentialExchangeFormat$Credential$PasskeyCredential0 = (bxvy2 instanceof CredentialExchangeFormat.Credential.PasskeyCredential) ? ((CredentialExchangeFormat.Credential.PasskeyCredential)bxvy2) : null;
                        if(credentialExchangeFormat$Credential$PasskeyCredential0 != null) {
                            arrayList6.add(credentialExchangeFormat$Credential$PasskeyCredential0);
                        }
                    }
                    ArrayList arrayList7 = new ArrayList(ibpo.q(arrayList6, 10));
                    for(Object object13: arrayList6) {
                        arrayList7.add(new ibns(((CredentialExchangeFormat.Credential.PasskeyCredential)object13), credentialExchangeFormat$Item1));
                    }
                    ibpo.D(arrayList5, arrayList7);
                }
                ArrayList arrayList8 = new ArrayList();
                Iterator iterator10 = arrayList5.iterator();
                while(iterator10.hasNext()) {
                    Object object14 = iterator10.next();
                    CredentialExchangeFormat.Credential.PasskeyCredential credentialExchangeFormat$Credential$PasskeyCredential1 = (CredentialExchangeFormat.Credential.PasskeyCredential)((ibns)object14).a;
                    CredentialExchangeFormat.Item credentialExchangeFormat$Item2 = (CredentialExchangeFormat.Item)((ibns)object14).b;
                    try {
                        arr_b1 = new byte[16];
                        bxwm0.c.a.nextBytes(arr_b1);
                        arr_b2 = bxwi.a(credentialExchangeFormat$Credential$PasskeyCredential1.a);
                        s9 = credentialExchangeFormat$Credential$PasskeyCredential1.b;
                        arr_b3 = bxwi.a(credentialExchangeFormat$Credential$PasskeyCredential1.e);
                        s10 = credentialExchangeFormat$Credential$PasskeyCredential1.c;
                        s11 = credentialExchangeFormat$Credential$PasskeyCredential1.d;
                        Long long2 = credentialExchangeFormat$Item2.b;
                        arr_b4 = bxwi.a(credentialExchangeFormat$Credential$PasskeyCredential1.f);
                        credentialExchangeFormat$Fido2Extensions0 = credentialExchangeFormat$Credential$PasskeyCredential1.g;
                        if(credentialExchangeFormat$Fido2Extensions0 == null) {
                            long3 = long2;
                        }
                        else {
                            CredentialExchangeFormat.Fido2HmacCredentials credentialExchangeFormat$Fido2HmacCredentials0 = credentialExchangeFormat$Fido2Extensions0.a;
                            if(credentialExchangeFormat$Fido2HmacCredentials0 == null) {
                                long3 = long2;
                            }
                            else {
                                byte[] arr_b5 = bxwi.a(credentialExchangeFormat$Fido2HmacCredentials0.b);
                                long3 = long2;
                                if(arr_b5.length == 0) {
                                    arr_b5 = null;
                                }
                                if(arr_b5 == null) {
                                    arr_b5 = bxwi.a(credentialExchangeFormat$Fido2HmacCredentials0.c);
                                    if(arr_b5.length != 0) {
                                        arr_b6 = arr_b5;
                                        goto label_226;
                                    }
                                }
                                else {
                                    arr_b6 = arr_b5;
                                    goto label_226;
                                }
                            }
                        }
                        arr_b6 = null;
                    label_226:
                        if(credentialExchangeFormat$Fido2Extensions0 != null) {
                            String s12 = credentialExchangeFormat$Fido2Extensions0.b;
                            if(s12 != null) {
                                arr_b7 = bxwi.a(s12);
                                goto label_232;
                            }
                        }
                        arr_b7 = null;
                    label_232:
                        if(credentialExchangeFormat$Fido2Extensions0 != null) {
                            CredentialExchangeFormat.Fido2LargeBlob credentialExchangeFormat$Fido2LargeBlob0 = credentialExchangeFormat$Fido2Extensions0.c;
                            if(credentialExchangeFormat$Fido2LargeBlob0 != null) {
                                String s13 = credentialExchangeFormat$Fido2LargeBlob0.b;
                                if(s13 != null) {
                                    arr_b8 = bxwi.a(s13);
                                    goto label_240;
                                }
                            }
                        }
                        arr_b8 = null;
                    label_240:
                        if(credentialExchangeFormat$Fido2Extensions0 != null) {
                            goto label_246;
                        }
                        goto label_252;
                    }
                    catch(IllegalArgumentException illegalArgumentException2) {
                        bxwm1 = bxwm0;
                        iterator11 = iterator10;
                        goto label_258;
                    }
                label_246:
                    CredentialExchangeFormat.Fido2LargeBlob credentialExchangeFormat$Fido2LargeBlob1 = credentialExchangeFormat$Fido2Extensions0.c;
                    if(credentialExchangeFormat$Fido2LargeBlob1 == null) {
                        goto label_252;
                    }
                    else {
                        try {
                            bxwm1 = bxwm0;
                            iterator11 = iterator10;
                            Long long4 = (long)(((long)credentialExchangeFormat$Fido2LargeBlob1.a) & 0xFFFFFFFFL);
                            object15 = new bxws(arr_b1, arr_b2, s9, arr_b3, s10, s11, long3, arr_b4, arr_b6, arr_b7, arr_b8, long4, (credentialExchangeFormat$Fido2Extensions0 == null ? null : credentialExchangeFormat$Fido2Extensions0.d));
                            goto label_260;
                        label_252:
                            bxwm1 = bxwm0;
                            iterator11 = iterator10;
                            long4 = null;
                            object15 = new bxws(arr_b1, arr_b2, s9, arr_b3, s10, s11, long3, arr_b4, arr_b6, arr_b7, arr_b8, long4, (credentialExchangeFormat$Fido2Extensions0 == null ? null : credentialExchangeFormat$Fido2Extensions0.d));
                            goto label_260;
                        }
                        catch(IllegalArgumentException illegalArgumentException2) {
                        }
                    }
                label_258:
                    a.ae(bxwm.a.j(), "Error base64 decoding passkey data", illegalArgumentException2);
                    object15 = null;
                label_260:
                    if(object15 != null) {
                        arrayList8.add(object15);
                    }
                    bxwm0 = bxwm1;
                    iterator10 = iterator11;
                }
                arrayList0.add(new bxwh(s1, arrayList1, arrayList8));
                bboh0 = bboh0;
            }
            bxwj0 = new bxwk(arrayList0);
        label_269:
            if((bxwj0 instanceof bxwk)) {
                List list2 = ((bxwk)bxwj0).a;
                ArrayList arrayList9 = new ArrayList();
                for(Object object16: list2) {
                    ibpo.D(arrayList9, ((bxwh)object16).b);
                }
                ArrayList arrayList10 = new ArrayList();
                for(Object object17: list2) {
                    ibpo.D(arrayList10, ((bxwh)object17).c);
                }
                ((ggtj)bdjs.a.h()).F("Parsed %d passwords and %d passkeys from the import response", arrayList9.size(), arrayList10.size());
                return new bdji(arrayList9, arrayList10);
            }
            if((bxwj0 instanceof bxwj)) {
                return bdjf.a;
            }
            throw new ibnq();
        }
        if((((bdjz)object0) instanceof bdjx)) {
            return bdjh.a;
        }
        if(!(((bdjz)object0) instanceof bdjw)) {
            throw new ibnq();
        }
        ggtj ggtj0 = (ggtj)bdjs.a.j();
        bdjw bdjw0 = (bdjw)(((bdjz)object0));
        throw null;
    }

    static Object b(bdjs bdjs0, List list0, List list1, ibrl ibrl0) {
        Object object11;
        Object object10;
        aztb aztb3;
        aztb aztb1;
        Object object9;
        bdjs bdjs2;
        Object object8;
        Object object7;
        Object object6;
        Object object4;
        Object object2;
        bdjr bdjr0;
        if((ibrl0 instanceof bdjr)) {
            bdjr0 = (bdjr)ibrl0;
            int v = bdjr0.h;
            if((v & 0x80000000) == 0) {
                bdjr0 = new bdjr(bdjs0, ibrl0);
            }
            else {
                bdjr0.h = v - 0x80000000;
            }
        }
        else {
            bdjr0 = new bdjr(bdjs0, ibrl0);
        }
        Object object0 = bdjr0.f;
        Object object1 = ibrx.a;
        switch(bdjr0.h) {
            case 0: {
                ibnx.b(object0);
                bdjr0.a = bdjs0;
                bdjr0.b = list1;
                bdjr0.h = 1;
                object0 = bdoe.b(bdjs0.g, list0, bdjr0);
                if(object0 == object1) {
                    return object1;
                }
                goto label_23;
            }
            case 1: {
                list1 = bdjr0.b;
                bdjs0 = (bdjs)bdjr0.a;
                ibnx.b(object0);
            label_23:
                if((((bdob)object0) instanceof bdnz)) {
                    object2 = ((bdnz)(((bdob)object0))).a;
                    List list2 = ((bdnz)(((bdob)object0))).b;
                    bdjr0.a = bdjs0;
                    bdjr0.b = object2;
                    bdjr0.c = list2;
                    bdjr0.h = 2;
                    Object object3 = bdnq.d(bdjs0.h, list1, bdjr0);
                    if(object3 == object1) {
                        return object1;
                    }
                    object0 = object3;
                    object4 = list2;
                    goto label_46;
                }
                if((((bdob)object0) instanceof bdny)) {
                    return bdjl.a;
                }
                if((((bdob)object0) instanceof bdoa)) {
                    return new bdjo(((bdoa)(((bdob)object0))).a);
                }
                throw new ibnq();
            }
            case 2: {
                Object object5 = bdjr0.c;
                object2 = bdjr0.b;
                bdjs bdjs1 = (bdjs)bdjr0.a;
                ibnx.b(object0);
                object4 = object5;
                bdjs0 = bdjs1;
            label_46:
                object6 = object2;
                if(!(((bdnl)object0) instanceof bdnk)) {
                    goto label_68;
                }
                object7 = ((bdnk)(((bdnl)object0))).a;
                object8 = ((bdnk)(((bdnl)object0))).b;
                if(!((Collection)object6).isEmpty()) {
                    try {
                        evql evql0 = bdjs0.e.f();
                        bdjr0.a = bdjs0;
                        bdjr0.b = object6;
                        bdjr0.c = object4;
                        bdjr0.d = object7;
                        bdjr0.e = object8;
                        bdjr0.h = 3;
                        if(ictn.b(evql0, bdjr0) == object1) {
                            return object1;
                        }
                    }
                    catch(aztb aztb0) {
                        bdjs2 = bdjs0;
                        object9 = object8;
                        aztb1 = aztb0;
                        goto label_83;
                    }
                    bdjs2 = bdjs0;
                    object9 = object8;
                    goto label_80;
                label_68:
                    if((((bdnl)object0) instanceof bdnj)) {
                        return new bdjo(((bdnj)(((bdnl)object0))).a);
                    }
                    if(!(((bdnl)object0) instanceof bdni)) {
                        throw new ibnq();
                    }
                    ((ggtj)bdjs.a.j()).x("Error storing passkeys");
                    return bdjk.a;
                }
                goto label_86;
            }
            case 3: {
                object9 = bdjr0.e;
                object7 = bdjr0.d;
                object4 = bdjr0.c;
                object6 = bdjr0.b;
                bdjs2 = (bdjs)bdjr0.a;
                try {
                    ibnx.b(object0);
                label_80:
                    ((ggtj)bdjs.a.h()).x("Refreshed passwords");
                    goto label_84;
                }
                catch(aztb aztb1) {
                }
            label_83:
                a.ae(bdjs.a.j(), "API error refreshing passwords", aztb1);
            label_84:
                object8 = object9;
                bdjs0 = bdjs2;
            label_86:
                if(!((Collection)object7).isEmpty()) {
                    try {
                        evql evql1 = bdjs0.f.b();
                        bdjr0.a = object6;
                        bdjr0.b = object4;
                        bdjr0.c = object7;
                        bdjr0.d = object8;
                        bdjr0.e = null;
                        bdjr0.h = 4;
                        if(ictn.b(evql1, bdjr0) != object1) {
                            object10 = object8;
                            object11 = object6;
                            goto label_110;
                        }
                        return object1;
                    }
                    catch(aztb aztb2) {
                        aztb3 = aztb2;
                        object10 = object8;
                        object11 = object6;
                        a.ae(bdjs.a.j(), "API error refreshing passkeys", aztb3);
                        object8 = object10;
                        object6 = object11;
                        return new bdjn(((List)object6), ((List)object7), ((List)object4), ((List)object8));
                    }
                    object10 = object8;
                    object11 = object6;
                    goto label_110;
                }
                return new bdjn(((List)object6), ((List)object7), ((List)object4), ((List)object8));
            }
            case 4: {
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        object10 = bdjr0.d;
        object7 = bdjr0.c;
        object4 = bdjr0.b;
        object11 = (List)bdjr0.a;
        try {
            ibnx.b(object0);
        label_110:
            ((ggtj)bdjs.a.h()).x("Refreshed passkeys");
            object8 = object10;
            object6 = object11;
            return new bdjn(((List)object6), ((List)object7), ((List)object4), ((List)object8));
        }
        catch(aztb aztb3) {
        }
        a.ae(bdjs.a.j(), "API error refreshing passkeys", aztb3);
        object8 = object10;
        object6 = object11;
        return new bdjn(((List)object6), ((List)object7), ((List)object4), ((List)object8));
    }
}

