import com.google.android.gms.identitycredentials.credentialexchange.CredentialExchangeFormat.Account;
import com.google.android.gms.identitycredentials.credentialexchange.CredentialExchangeFormat.AndroidAppCertificateFingerprint;
import com.google.android.gms.identitycredentials.credentialexchange.CredentialExchangeFormat.AndroidAppId;
import com.google.android.gms.identitycredentials.credentialexchange.CredentialExchangeFormat.Credential.BasicAuthCredential;
import com.google.android.gms.identitycredentials.credentialexchange.CredentialExchangeFormat.Credential.NoteCredential;
import com.google.android.gms.identitycredentials.credentialexchange.CredentialExchangeFormat.Credential.PasskeyCredential;
import com.google.android.gms.identitycredentials.credentialexchange.CredentialExchangeFormat.CredentialScope;
import com.google.android.gms.identitycredentials.credentialexchange.CredentialExchangeFormat.EditableField;
import com.google.android.gms.identitycredentials.credentialexchange.CredentialExchangeFormat.Fido2Extensions;
import com.google.android.gms.identitycredentials.credentialexchange.CredentialExchangeFormat.Fido2HmacCredentials;
import com.google.android.gms.identitycredentials.credentialexchange.CredentialExchangeFormat.Fido2LargeBlob;
import com.google.android.gms.identitycredentials.credentialexchange.CredentialExchangeFormat.Header;
import com.google.android.gms.identitycredentials.credentialexchange.CredentialExchangeFormat.Item;
import com.google.android.gms.identitycredentials.credentialexchange.CredentialExchangeFormat.Version;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public final class bxwm {
    public static final bboh a;
    public final hmys b;
    public final bxwx c;

    static {
        bxwm.a = bboh.b("CXFormatProcessor", bbcu.cX);
    }

    public bxwm(hmys hmys0, bxwx bxwx0) {
        this.b = hmys0;
        this.c = bxwx0;
    }

    public final String a(List list0) {
        CredentialExchangeFormat.Fido2LargeBlob credentialExchangeFormat$Fido2LargeBlob0;
        Iterator iterator4;
        CredentialExchangeFormat.Fido2HmacCredentials credentialExchangeFormat$Fido2HmacCredentials0;
        CredentialExchangeFormat.CredentialScope credentialExchangeFormat$CredentialScope0;
        ibuq.f(list0, "accounts");
        CredentialExchangeFormat.Version credentialExchangeFormat$Version0 = new CredentialExchangeFormat.Version(1, 0);
        ArrayList arrayList0 = new ArrayList(ibpo.q(list0, 10));
        Iterator iterator0 = list0.iterator();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            String s = ((bxwh)object0).a;
            List list1 = ((bxwh)object0).c;
            ibuq.f(s, "<this>");
            MessageDigest messageDigest0 = MessageDigest.getInstance("SHA-256");
            ibuq.e(messageDigest0, "getInstance(...)");
            byte[] arr_b = s.getBytes(ibyo.a);
            ibuq.e(arr_b, "getBytes(...)");
            byte[] arr_b1 = messageDigest0.digest(arr_b);
            ibuq.e(arr_b1, "digest(...)");
            String s1 = bxwi.b(arr_b1);
            ibps ibps0 = ibps.a;
            ArrayList arrayList1 = new ArrayList(ibpo.q(((bxwh)object0).b, 10));
            for(Object object1: ((bxwh)object0).b) {
                String s2 = bxwi.b(((bxwt)object1).a);
                String s3 = ((bxwt)object1).b;
                ibuq.f(s3, "signonRealm");
                ibuq.f(s3, "<this>");
                String s4 = s3.toLowerCase(Locale.ROOT);
                ibuq.e(s4, "toLowerCase(...)");
                if(ibzk.W(s4, "android://")) {
                    List list2 = ibzk.S(ibzk.v(ibzk.w(s3, "android://", s3), "/"), new char[]{'@'}, 2, 2);
                    if(list2.size() == 2) {
                        String s5 = (String)list2.get(0);
                        credentialExchangeFormat$CredentialScope0 = new CredentialExchangeFormat.CredentialScope(null, ibpo.b(new CredentialExchangeFormat.AndroidAppId(((String)list2.get(1)), new CredentialExchangeFormat.AndroidAppCertificateFingerprint(s5, bxwd.b), null, 4, null)), 1, null);
                        goto label_34;
                    }
                }
                credentialExchangeFormat$CredentialScope0 = new CredentialExchangeFormat.CredentialScope(ibqg.b(s3), null, 2, null);
            label_34:
                Long long0 = ((bxwt)object1).f;
                Long long1 = ((bxwt)object1).g;
                String s6 = ((bxwt)object1).d;
                List list3 = ibpo.b(new CredentialExchangeFormat.Credential.BasicAuthCredential((s6 == null ? null : new CredentialExchangeFormat.EditableField(null, bxwc.a, s6, null, null, 25, null)), new CredentialExchangeFormat.EditableField(null, bxwc.b, ((bxwt)object1).e, null, null, 25, null)));
                ArrayList arrayList2 = new ArrayList(ibpo.q(((bxwt)object1).h, 10));
                for(Object object2: ((bxwt)object1).h) {
                    arrayList2.add(new CredentialExchangeFormat.Credential.NoteCredential(new CredentialExchangeFormat.EditableField(null, bxwc.a, ((String)object2), null, null, 25, null)));
                }
                arrayList1.add(new CredentialExchangeFormat.Item(s2, long0, long1, s3, null, null, credentialExchangeFormat$CredentialScope0, ibpo.ak(list3, arrayList2), null, null, 0x330, null));
                iterator0 = iterator0;
            }
            ArrayList arrayList3 = new ArrayList(ibpo.q(list1, 10));
            Iterator iterator3 = list1.iterator();
            while(iterator3.hasNext()) {
                Object object3 = iterator3.next();
                bxws bxws0 = (bxws)object3;
                byte[] arr_b2 = bxws0.i;
                if(arr_b2 != null) {
                    if(arr_b2.length == 0) {
                        arr_b2 = null;
                    }
                    if(arr_b2 != null) {
                        String s7 = bxwi.b(arr_b2);
                        String s8 = bxwi.b(arr_b2);
                        credentialExchangeFormat$Fido2HmacCredentials0 = new CredentialExchangeFormat.Fido2HmacCredentials(bxwb.a, s7, s8);
                        goto label_62;
                    }
                }
                credentialExchangeFormat$Fido2HmacCredentials0 = null;
            label_62:
                String s9 = bxws0.j == null ? null : bxwi.b(bxws0.j);
                byte[] arr_b3 = bxws0.k;
                if(arr_b3 != null) {
                    Long long2 = bxws0.l;
                    if(long2 != null) {
                        iterator4 = iterator3;
                        credentialExchangeFormat$Fido2LargeBlob0 = new CredentialExchangeFormat.Fido2LargeBlob(((int)long2.longValue()), bxwi.b(arr_b3));
                        goto label_72;
                    }
                }
                iterator4 = iterator3;
                credentialExchangeFormat$Fido2LargeBlob0 = null;
            label_72:
                CredentialExchangeFormat.Fido2Extensions credentialExchangeFormat$Fido2Extensions0 = credentialExchangeFormat$Fido2HmacCredentials0 != null || s9 != null || credentialExchangeFormat$Fido2LargeBlob0 != null || bxws0.m != null ? new CredentialExchangeFormat.Fido2Extensions(credentialExchangeFormat$Fido2HmacCredentials0, s9, credentialExchangeFormat$Fido2LargeBlob0, bxws0.m) : null;
                String s10 = bxwi.b(bxws0.a);
                String s11 = bxwi.b(bxws0.b);
                String s12 = bxwi.b(bxws0.d);
                String s13 = bxwi.b(bxws0.h);
                List list4 = ibpo.b(new CredentialExchangeFormat.Credential.PasskeyCredential(s11, bxws0.c, bxws0.e, bxws0.f, s12, s13, credentialExchangeFormat$Fido2Extensions0));
                arrayList3.add(new CredentialExchangeFormat.Item(s10, bxws0.g, ibzw.j(ibzy.i(System.currentTimeMillis(), ibzz.c)), bxws0.c, null, null, null, list4, null, null, 880, null));
                iterator3 = iterator4;
            }
            arrayList0.add(new CredentialExchangeFormat.Account(s1, "", s, null, ibps0, ibpo.ak(arrayList1, arrayList3), null, 72, null));
            iterator0 = iterator0;
        }
        CredentialExchangeFormat.Header credentialExchangeFormat$Header0 = new CredentialExchangeFormat.Header(credentialExchangeFormat$Version0, "passwords.google.com", "Google Password Manager", ibzw.j(ibzy.i(System.currentTimeMillis(), ibzz.c)), arrayList0);
        try {
            hmxq hmxq0 = this.b.a(CredentialExchangeFormat.Header.class);
            idlm idlm0 = new idlm();
            try {
                hmxq0.b(new hmyc(idlm0), credentialExchangeFormat$Header0);
            }
            catch(IOException iOException0) {
                throw new AssertionError(iOException0);
            }
            return idlm0.s();
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            a.ae(bxwm.a.j(), "Error generating Json for export payload", illegalArgumentException0);
            return null;
        }
    }
}

