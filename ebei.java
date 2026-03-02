import android.util.Base64;
import j..util.DesugarCollections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class ebei {
    public static final fsyh a(JSONObject jSONObject0, long v) {
        hkvc hkvc0;
        hkva hkva0;
        hkuz hkuz0;
        gtln gtln0;
        String s = jSONObject0.getString("protocol");
        ibuq.e(s, "getString(...)");
        switch(s) {
            case "ALIRO": {
                gtln0 = gtln.g;
                break;
            }
            case "ALLEGION": {
                gtln0 = gtln.f;
                break;
            }
            case "LEGIC": {
                gtln0 = gtln.d;
                break;
            }
            case "MIFARE": {
                gtln0 = gtln.b;
                break;
            }
            case "PIV": {
                gtln0 = gtln.c;
                break;
            }
            case "SEOS": {
                gtln0 = gtln.e;
                break;
            }
            default: {
                gtln0 = gtln.a;
            }
        }
        fsxy fsxy0 = (fsxy)((ProtoLiteMessage)fsyh.a).v_newBuilder();
        ibuq.f(fsxy0, "builder");
        if(!fsxy0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)fsxy0).ensureMutable();
        }
        ((fsyh)fsxy0.b_message).v = true;
        int v1 = 0;
        if(jSONObject0.has("isoAid")) {
            String s1 = jSONObject0.getString("isoAid");
            ibuq.e(s1, "getString(...)");
            ibuq.f(s1, "value");
            if(!fsxy0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)fsxy0).ensureMutable();
            }
            fsyh fsyh0 = (fsyh)fsxy0.b_message;
            s1.getClass();
            fsyh0.d = s1;
        }
        else if(jSONObject0.has("isoAids")) {
            JSONArray jSONArray0 = jSONObject0.getJSONArray("isoAids");
            ibuq.e(jSONArray0, "getJSONArray(...)");
            int v2 = jSONArray0.length();
            for(int v3 = 0; v3 < v2; ++v3) {
                String s2 = jSONArray0.getString(v3);
                List list0 = DesugarCollections.unmodifiableList(((fsyh)fsxy0.b_message).e);
                ibuq.e(list0, "getIsoAidsList(...)");
                new hfxu(list0);
                ibuq.c(s2);
                ibuq.f(s2, "value");
                if(!fsxy0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)fsxy0).ensureMutable();
                }
                fsyh fsyh1 = (fsyh)fsxy0.b_message;
                s2.getClass();
                fsyh1.b();
                fsyh1.e.add(s2);
            }
        }
        if(!fsxy0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)fsxy0).ensureMutable();
        }
        ((fsyh)fsxy0.b_message).c = v;
        fsye fsye0 = fsye.b;
        ibuq.f(fsye0, "value");
        if(!fsxy0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)fsxy0).ensureMutable();
        }
        fsyh fsyh2 = (fsyh)fsxy0.b_message;
        fsyh2.h = fsye0.a();
        fsyg fsyg0 = fsyg.b;
        ibuq.f(fsyg0, "value");
        if(!fsxy0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)fsxy0).ensureMutable();
        }
        fsyh fsyh3 = (fsyh)fsxy0.b_message;
        fsyh3.u = fsyg0.a();
        ftcj ftcj0 = ftcj.c;
        ibuq.f(ftcj0, "value");
        if(!fsxy0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)fsxy0).ensureMutable();
        }
        fsyh fsyh4 = (fsyh)fsxy0.b_message;
        fsyh4.n = ftcj0.a();
        ibuq.f(gtln0, "value");
        if(!fsxy0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)fsxy0).ensureMutable();
        }
        fsyh fsyh5 = (fsyh)fsxy0.b_message;
        fsyh5.r = gtln0.a();
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)fsyd.a).v_newBuilder();
        ibuq.f(hftp0, "builder");
        String s3 = jSONObject0.getString("bundleId");
        ibuq.e(s3, "getString(...)");
        ibuq.f(s3, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        fsyd fsyd0 = (fsyd)hftp0.b_message;
        s3.getClass();
        fsyd0.c = s3;
        if(gtln0.ordinal() == 6) {
            JSONArray jSONArray1 = jSONObject0.getJSONArray("aliroReaderConfigs");
            ibuq.e(jSONArray1, "getJSONArray(...)");
            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)hkuw.a).v_newBuilder();
            ibuq.f(hftp2, "builder");
            ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)hkuo.a).v_newBuilder();
            ibuq.f(hftp3, "builder");
            int v4 = jSONArray1.length();
            while(v1 < v4) {
                JSONObject jSONObject1 = jSONArray1.getJSONObject(v1);
                List list1 = DesugarCollections.unmodifiableList(((hkuo)hftp3.b_message).b);
                ibuq.e(list1, "getReaderGroupConfigurationsList(...)");
                new hfxu(list1);
                ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)hkur.b).v_newBuilder();
                ibuq.f(hftp4, "builder");
                String s5 = jSONObject1.getString("readerGroupIdBase64");
                ibuq.e(s5, "getString(...)");
                ibuq.f(s5, "value");
                if(!hftp4.b_message.isImmutable()) {
                    hftp4.ensureMutable();
                }
                hkur hkur0 = (hkur)hftp4.b_message;
                s5.getClass();
                hkur0.d = s5;
                if(jSONObject1.has("readerSystemIssuerCaPublicKeyBase64")) {
                    ProtoLiteBuilder hftp5 = ((ProtoLiteMessage)hkuu.a).v_newBuilder();
                    ibuq.f(hftp5, "builder");
                    String s6 = jSONObject1.getString("readerSystemIssuerCaPublicKeyBase64");
                    ibuq.e(s6, "getString(...)");
                    ibuq.f(s6, "value");
                    if(!hftp5.b_message.isImmutable()) {
                        hftp5.ensureMutable();
                    }
                    hkuu hkuu0 = (hkuu)hftp5.b_message;
                    s6.getClass();
                    hkuu0.b = s6;
                    ProtoLiteMessage hftv1 = hftp5.N_build();
                    ibuq.e(hftv1, "build(...)");
                    ibuq.f(((hkuu)hftv1), "value");
                    if(!hftp4.b_message.isImmutable()) {
                        hftp4.ensureMutable();
                    }
                    hkur hkur1 = (hkur)hftp4.b_message;
                    ((hkuu)hftv1).getClass();
                    hkur1.e = (hkuu)hftv1;
                    hkur1.c |= 1;
                }
                ProtoLiteMessage hftv2 = hftp4.N_build();
                ibuq.e(hftv2, "build(...)");
                ibuq.f(((hkur)hftv2), "value");
                if(!hftp3.b_message.isImmutable()) {
                    hftp3.ensureMutable();
                }
                hkuo hkuo0 = (hkuo)hftp3.b_message;
                ((hkur)hftv2).getClass();
                hfuo hfuo0 = hkuo0.b;
                if(!hfuo0.c()) {
                    hkuo0.b = ProtoLiteMessage.E(hfuo0);
                }
                hkuo0.b.add(((hkur)hftv2));
                ++v1;
                jSONArray1 = jSONArray1;
            }
            ProtoLiteMessage hftv3 = hftp3.N_build();
            ibuq.e(hftv3, "build(...)");
            ibuq.f(((hkuo)hftv3), "value");
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            hkuw hkuw0 = (hkuw)hftp2.b_message;
            ((hkuo)hftv3).getClass();
            hkuw0.c = (hkuo)hftv3;
            hkuw0.b = 1;
            ProtoLiteMessage hftv4 = hftp2.N_build();
            ibuq.e(hftv4, "build(...)");
            ByteString hfsf0 = ((hkuw)hftv4).getDefaultInstanceForType();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((fsyd)hftp0.b_message).h = hfsf0;
        }
        else {
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)fsyf.a).v_newBuilder();
            ibuq.f(hftp1, "builder");
            byte[] arr_b = Base64.decode(jSONObject0.getString("cardPayload"), 0);
            ibuq.e(arr_b, "decode(...)");
            String s4 = ibzk.h(arr_b);
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ((fsyf)hftp1.b_message).b = s4;
            ProtoLiteMessage hftv0 = hftp1.N_build();
            ibuq.e(hftv0, "build(...)");
            ibuq.f(((fsyf)hftv0), "value");
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            fsyd fsyd1 = (fsyd)hftp0.b_message;
            ((fsyf)hftv0).getClass();
            fsyd1.g = (fsyf)hftv0;
            fsyd1.b |= 2;
        }
        ProtoLiteMessage hftv5 = hftp0.N_build();
        ibuq.e(hftv5, "build(...)");
        ibuq.f(((fsyd)hftv5), "value");
        if(!fsxy0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)fsxy0).ensureMutable();
        }
        fsyh fsyh6 = (fsyh)fsxy0.b_message;
        ((fsyd)hftv5).getClass();
        fsyh6.i = (fsyd)hftv5;
        fsyh6.b |= 1;
        if(gtln0 != gtln.g) {
            ProtoLiteBuilder hftp6 = ((ProtoLiteMessage)fsxv.a).v_newBuilder();
            ibuq.f(hftp6, "builder");
            fsxw fsxw0 = (fsxw)((ProtoLiteMessage)fsxx.a).v_newBuilder();
            ibuq.f(fsxw0, "builder");
            JSONArray jSONArray2 = jSONObject0.getJSONArray("keySet");
            ibuq.e(jSONArray2, "getJSONArray(...)");
            int v5 = jSONArray2.length();
            int v6 = 0;
            while(v6 < v5) {
                JSONObject jSONObject2 = jSONArray2.getJSONObject(v6);
                List list2 = DesugarCollections.unmodifiableList(((fsxx)fsxw0.b_message).b);
                ibuq.e(list2, "getHceSecureKeyList(...)");
                new hfxu(list2);
                ibuq.c(jSONObject2);
                ProtoLiteBuilder hftp7 = ((ProtoLiteMessage)hkve.a).v_newBuilder();
                ibuq.f(hftp7, "builder");
                String s7 = jSONObject2.getString("securedKeyMaterial");
                ibuq.e(s7, "getString(...)");
                ibuq.f(s7, "value");
                if(!hftp7.b_message.isImmutable()) {
                    hftp7.ensureMutable();
                }
                hkve hkve0 = (hkve)hftp7.b_message;
                s7.getClass();
                hkve0.c = s7;
                String s8 = jSONObject2.getString("securedKeyMetadata");
                ibuq.e(s8, "getString(...)");
                ibuq.f(s8, "value");
                if(!hftp7.b_message.isImmutable()) {
                    hftp7.ensureMutable();
                }
                hkve hkve1 = (hkve)hftp7.b_message;
                s8.getClass();
                hkve1.e = s8;
                hkvb hkvb0 = (hkvb)((ProtoLiteMessage)hkvd.c).v_newBuilder();
                ibuq.f(hkvb0, "builder");
                JSONObject jSONObject3 = jSONObject2.getJSONObject("securedKeyCryptoParams");
                ibuq.e(jSONObject3, "getJSONObject(...)");
                switch(jSONObject3.getString("algorithm")) {
                    case "AES": {
                        hkuz0 = hkuz.b;
                        break;
                    }
                    case "DESede": {
                        hkuz0 = hkuz.c;
                        break;
                    }
                    default: {
                        hkuz0 = hkuz.a;
                    }
                }
                ibuq.f(hkuz0, "value");
                if(!hkvb0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)hkvb0).ensureMutable();
                }
                hkvd hkvd0 = (hkvd)hkvb0.b_message;
                hkvd0.d = hkuz0.a();
                JSONArray jSONArray3 = jSONObject3.getJSONArray("blockModesRequired");
                ibuq.e(jSONArray3, "getJSONArray(...)");
                JSONArray jSONArray4 = jSONObject3.getJSONArray("paddingsRequired");
                ibuq.e(jSONArray4, "getJSONArray(...)");
                int v7 = jSONArray3.length();
                int v8 = 0;
                while(v8 < v7) {
                    Object object0 = jSONArray3.get(v8);
                    new hfxu(new hfuh(((hkvd)hkvb0.b_message).e, hkvd.a));
                    if(ibuq.m(object0, "CBC")) {
                        hkva0 = hkva.b;
                    }
                    else {
                        hkva0 = ibuq.m(object0, "ECB") ? hkva.c : hkva.a;
                    }
                    ibuq.f(hkva0, "value");
                    hkvb0.a(hkva0);
                    ++v8;
                    jSONArray3 = jSONArray3;
                    v5 = v5;
                    v6 = v6;
                }
                int v9 = jSONArray4.length();
                for(int v10 = 0; v10 < v9; ++v10) {
                    Object object1 = jSONArray4.get(v10);
                    new hfxu(new hfuh(((hkvd)hkvb0.b_message).f, hkvd.b));
                    if(ibuq.m(object1, "NONE")) {
                        hkvc0 = hkvc.b;
                    }
                    else {
                        hkvc0 = ibuq.m(object1, "PKCS7") ? hkvc.c : hkvc.b;
                    }
                    ibuq.f(hkvc0, "value");
                    hkvb0.k(hkvc0);
                }
                ProtoLiteMessage hftv6 = ((ProtoLiteBuilder)hkvb0).N_build();
                ibuq.e(hftv6, "build(...)");
                ibuq.f(((hkvd)hftv6), "value");
                if(!hftp7.b_message.isImmutable()) {
                    hftp7.ensureMutable();
                }
                hkve hkve2 = (hkve)hftp7.b_message;
                ((hkvd)hftv6).getClass();
                hkve2.d = (hkvd)hftv6;
                hkve2.b |= 1;
                ProtoLiteMessage hftv7 = hftp7.N_build();
                ibuq.e(hftv7, "build(...)");
                ibuq.f(((hkve)hftv7), "value");
                fsxw0.a(((hkve)hftv7));
                ++v6;
                jSONArray2 = jSONArray2;
                v5 = v5;
            }
            ProtoLiteMessage hftv8 = ((ProtoLiteBuilder)fsxw0).N_build();
            ibuq.e(hftv8, "build(...)");
            ibuq.f(((fsxx)hftv8), "value");
            if(!hftp6.b_message.isImmutable()) {
                hftp6.ensureMutable();
            }
            fsxv fsxv0 = (fsxv)hftp6.b_message;
            ((fsxx)hftv8).getClass();
            fsxv0.c = (fsxx)hftv8;
            fsxv0.b = 2;
            ProtoLiteMessage hftv9 = hftp6.N_build();
            ibuq.e(hftv9, "build(...)");
            ibuq.f(((fsxv)hftv9), "value");
            if(!fsxy0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)fsxy0).ensureMutable();
            }
            fsyh fsyh7 = (fsyh)fsxy0.b_message;
            ((fsxv)hftv9).getClass();
            fsyh7.o = (fsxv)hftv9;
            fsyh7.b |= 8;
        }
        ProtoLiteMessage hftv10 = ((ProtoLiteBuilder)fsxy0).N_build();
        ibuq.e(hftv10, "build(...)");
        return (fsyh)hftv10;
    }
}

