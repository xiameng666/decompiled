import j..util.Base64.Decoder;
import j..util.Base64;
import java.security.InvalidParameterException;
import java.security.Key;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONException;
import org.json.JSONObject;

public final class qug implements fsay {
    public fsax a;
    public fsbc b;
    public JSONObject c;
    private fsaw e;

    @Override  // fsay
    public final fsat a(fsaw fsaw0) {
        return fsay.d;
    }

    @Override  // fsay
    public final fsat b(String s, JSONObject jSONObject0, fsas fsas0, fsbc fsbc0, fsaw fsaw0) {
        fsat fsat0;
        int v3;
        int v;
        byte[] arr_b8;
        byte[] arr_b6;
        int v2;
        String s3;
        JSONObject jSONObject1;
        SecretKey secretKey3;
        ibns ibns0;
        int v1;
        byte[] arr_b2;
        byte[] arr_b1;
        boolean z;
        ibuq.f(s, "isoAid");
        this.e = fsaw0;
        this.b = fsbc0;
        try {
            Decoder base64$Decoder0 = Base64.getDecoder();
            if(jSONObject0.has("version")) {
                String s1 = jSONObject0.getString("version");
                ibuq.e(s1, "getString(...)");
                Integer integer0 = ibzk.f(s1);
                if(integer0 != null && ((int)integer0) == 2) {
                    v = 2;
                label_12:
                    byte[] arr_b = base64$Decoder0.decode(jSONObject0.getString("encryptedCardData"));
                    ibuq.e(arr_b, "decode(...)");
                    if(v == 1) {
                        fsbb[] arr_fsbb = fsas0.a();
                        ibuq.e(arr_fsbb, "getHceSecuredKeys(...)");
                        z = arr_fsbb.length == 0;
                        goto label_43;
                    }
                    else {
                        z = fsas0.a().length < 3;
                        if(jSONObject0.has("encryptedNoTourData")) {
                            String s2 = jSONObject0.getString("encryptedNoTourData");
                            ibuq.e(s2, "getString(...)");
                            ibuq.f(s2, "<this>");
                            try {
                                if(s2.length() % 2 != 0) {
                                    throw new IllegalStateException("Check failed.");
                                }
                                List list0 = ibzk.ad(s2, 2);
                                ArrayList arrayList0 = new ArrayList(ibpo.q(list0, 10));
                                for(Object object0: list0) {
                                    arrayList0.add(Byte.valueOf(((byte)Integer.parseInt(((String)object0), 16))));
                                }
                                arr_b1 = ibpo.aC(arrayList0);
                            }
                            catch(Exception unused_ex) {
                                arr_b1 = null;
                            }
                            if(arr_b1 == null) {
                                arr_b2 = null;
                            }
                            else if(!ibuq.m(s2, "")) {
                                arr_b2 = arr_b1;
                            }
                            else {
                            label_43:
                                arr_b2 = null;
                            }
                            if(z) {
                                InvalidParameterException invalidParameterException9 = new InvalidParameterException();
                                fsbc0.a(qul.k.w, invalidParameterException9);
                            }
                            else {
                                byte[] arr_b3 = null;
                                SecretKey secretKey0 = null;
                                SecretKey secretKey1 = null;
                                byte[] arr_b4 = null;
                                SecretKey secretKey2 = null;
                                Iterator iterator1 = ibug.a(fsas0.a());
                                while(true) {
                                    if(!iterator1.hasNext()) {
                                        if(v != 2) {
                                            v1 = 1;
                                            goto label_61;
                                        }
                                        if(secretKey1 != null) {
                                            if(secretKey2 != null) {
                                                if(arr_b4 != null) {
                                                    v1 = 2;
                                                label_61:
                                                    if(secretKey0 != null) {
                                                        if(arr_b3 == null) {
                                                            InvalidParameterException invalidParameterException0 = new InvalidParameterException();
                                                            fsbc0.a(qul.o.w, invalidParameterException0);
                                                            ibns0 = new ibns(null, qum.b);
                                                            goto label_157;
                                                        }
                                                        ibns0 = new ibns(new quk(String.valueOf(v1), v1, arr_b2, arr_b, arr_b3, secretKey0, secretKey1, arr_b4, secretKey2), null);
                                                        goto label_157;
                                                    }
                                                    InvalidParameterException invalidParameterException1 = new InvalidParameterException();
                                                    fsbc0.a(qul.n.w, invalidParameterException1);
                                                    ibns0 = new ibns(null, qum.b);
                                                    goto label_157;
                                                }
                                                InvalidParameterException invalidParameterException2 = new InvalidParameterException();
                                                fsbc0.a(qul.q.w, invalidParameterException2);
                                                ibns0 = new ibns(null, qum.b);
                                                goto label_157;
                                            }
                                            InvalidParameterException invalidParameterException3 = new InvalidParameterException();
                                            fsbc0.a(qul.p.w, invalidParameterException3);
                                            ibns0 = new ibns(null, qum.b);
                                            goto label_157;
                                        }
                                        InvalidParameterException invalidParameterException4 = new InvalidParameterException();
                                        fsbc0.a(qul.m.w, invalidParameterException4);
                                        ibns0 = new ibns(null, qum.b);
                                        goto label_157;
                                    }
                                    Object object1 = iterator1.next();
                                    fsbb fsbb0 = (fsbb)object1;
                                    try {
                                        if(fsbb0.a.size() == 1 && fsbb0.a.contains(fsaz.a) && (fsbb0.b.size() == 1 && fsbb0.b.contains(fsba.a))) {
                                            Key key0 = fsbb0.c;
                                            if((key0 instanceof SecretKey)) {
                                                secretKey3 = (SecretKey)key0;
                                            }
                                            else {
                                                if(key0.getEncoded() == null) {
                                                    InvalidParameterException invalidParameterException5 = new InvalidParameterException();
                                                    fsbc0.a(qul.i.w, invalidParameterException5);
                                                    ibns0 = new ibns(null, qum.b);
                                                    goto label_157;
                                                }
                                                secretKey3 = new SecretKeySpec(key0.getEncoded(), 0, key0.getEncoded().length, "AES");
                                            }
                                            try {
                                                jSONObject1 = new JSONObject(fsbb0.d);
                                            }
                                            catch(JSONException unused_ex) {
                                                InvalidParameterException invalidParameterException6 = new InvalidParameterException();
                                                fsbc0.a(qul.r.w, invalidParameterException6);
                                                ibns0 = new ibns(null, qum.b);
                                                goto label_157;
                                            }
                                            if(v == 2) {
                                                s3 = jSONObject1.getString("keyInput");
                                                v2 = 2;
                                            }
                                            else {
                                                s3 = jSONObject1.getString("diversifiedKeyInput");
                                                v2 = 1;
                                            }
                                            ibuq.c(s3);
                                            String s4 = v2 == 2 ? jSONObject1.getString("name") : "credentialKey";
                                            ibuq.c(s4);
                                            switch(s4) {
                                                case "credentialKey": {
                                                    try {
                                                        byte[] arr_b5 = s3.getBytes(ibyo.a);
                                                        ibuq.e(arr_b5, "getBytes(...)");
                                                        arr_b6 = base64$Decoder0.decode(arr_b5);
                                                    }
                                                    catch(Exception unused_ex) {
                                                        arr_b3 = null;
                                                        secretKey0 = secretKey3;
                                                        break;
                                                    }
                                                    arr_b3 = arr_b6;
                                                    secretKey0 = secretKey3;
                                                    break;
                                                }
                                                case "noTourKey": {
                                                    try {
                                                        byte[] arr_b7 = s3.getBytes(ibyo.a);
                                                        ibuq.e(arr_b7, "getBytes(...)");
                                                        arr_b8 = base64$Decoder0.decode(arr_b7);
                                                    }
                                                    catch(Exception unused_ex) {
                                                        arr_b4 = null;
                                                        secretKey2 = secretKey3;
                                                        break;
                                                    }
                                                    arr_b4 = arr_b8;
                                                    secretKey2 = secretKey3;
                                                    break;
                                                }
                                                case "privacyKey": {
                                                    secretKey1 = secretKey3;
                                                }
                                            }
                                            continue;
                                        }
                                        InvalidParameterException invalidParameterException7 = new InvalidParameterException();
                                        fsbc0.a(qul.h.w, invalidParameterException7);
                                        ibns0 = new ibns(null, qum.b);
                                        goto label_157;
                                    }
                                    catch(Exception unused_ex) {
                                    }
                                    break;
                                }
                                InvalidParameterException invalidParameterException8 = new InvalidParameterException();
                                fsbc0.a(qul.l.w, invalidParameterException8);
                            }
                        }
                        ibns0 = new ibns(null, qum.b);
                    }
                }
                else {
                    InvalidParameterException invalidParameterException10 = new InvalidParameterException();
                    fsbc0.a(qul.j.w, invalidParameterException10);
                    ibns0 = new ibns(null, qum.b);
                }
            }
            else {
                v = 1;
                goto label_12;
            }
        }
        catch(Exception exception0) {
            fsbc0.a("Failed to parsed credential payload", exception0);
            ibns0 = new ibns(null, qum.b);
        }
    label_157:
        quk quk0 = (quk)ibns0.a;
        if(quk0 == null) {
            fsbc0.b("The application was unable to properly parse a CredentialPayload");
            this.c(qum.b);
            quk0 = new quk(null);
            v3 = 0;
        }
        else {
            v3 = 1;
        }
        try {
            fsat0 = new quf(fsbc0, this, quk0, ((boolean)(v3 ^ 1)), jSONObject0);
        }
        catch(Exception exception1) {
            fsbc0.a("An unexpected error occurred while attempting initialization of ContactlessHCESessionImpl", exception1);
            this.c(qum.i);
            fsat0 = null;
        }
        if(fsat0 == null) {
            ibuq.j("contactlessHCESession");
            return null;
        }
        return fsat0;
    }

    public final void c(qum qum0) {
        ibuq.f(qum0, "reason");
        switch(qum0.ordinal()) {
            case 0: {
                this.e(new quh(fsau.f, this.c));
                return;
            }
            case 1: {
                this.e(new quh(fsau.f, this.c));
                return;
            }
            case 2: {
                this.e(new quh(fsau.f, this.c));
                return;
            }
            case 3: {
                this.e(new quh(fsau.g, this.c));
                return;
            }
            case 4: {
                this.e(new quh(fsau.g, this.c));
                return;
            }
            case 5: {
                this.e(new quh(fsau.c, this.c));
                return;
            }
            case 6: {
                this.e(new quh(fsau.e, this.c));
                return;
            }
            case 7: {
                this.e(new quh(fsau.g, this.c));
                return;
            }
            case 8: {
                this.e(new quh(fsau.a, this.c));
                return;
            }
            default: {
                throw new ibnq();
            }
        }
    }

    @Override  // fsay
    public final void d(fsax fsax0) {
        if(this.b != null) {
            Objects.toString(fsax0);
        }
        this.a = fsax0;
        if(this.b != null) {
            Objects.toString(fsax0);
        }
    }

    private final void e(fsav fsav0) {
        fsaw fsaw0 = this.e;
        if(fsaw0 != null) {
            fsaw0.a(fsav0);
            return;
        }
        fsbc fsbc0 = this.b;
        if(fsbc0 != null) {
            fsbc0.b("No ResultCallback was available when attempting to communicate a session result");
        }
    }
}

