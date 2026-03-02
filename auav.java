import android.text.TextUtils;

public final class auav {
    public static gehl a(String s, String s1, Object object0) {
        if(object0 != null) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gehl.a).v_newBuilder();
            gehk gehk0 = gehk.a;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            ((gehl)hftv0).c = gehk0.f;
            ((gehl)hftv0).b |= 1;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            gehl gehl0 = (gehl)hftp0.b_message;
            s1.getClass();
            gehl0.b |= 2;
            gehl0.d = s1;
            String s2 = aurr.b;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv1 = hftp0.b_message;
            s2.getClass();
            ((gehl)hftv1).b |= 4;
            ((gehl)hftv1).e = s2;
            if(!hftv1.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv2 = hftp0.b_message;
            s.getClass();
            ((gehl)hftv2).b |= 8;
            ((gehl)hftv2).f = s;
            if((object0 instanceof String)) {
                if(!TextUtils.isEmpty(((String)object0))) {
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ProtoLiteMessage hftv3 = hftp0.b_message;
                    ((gehl)hftv3).g = 0;
                    ((gehl)hftv3).b |= 16;
                    if(!hftv3.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    gehl gehl1 = (gehl)hftp0.b_message;
                    gehl1.b |= 0x20;
                    gehl1.h = (String)object0;
                    return (gehl)hftp0.N_build();
                }
            }
            else if((object0 instanceof byte[])) {
                if(!hftv2.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((gehl)hftp0.b_message).g = 1;
                ((gehl)hftp0.b_message).b |= 16;
                ByteString hfsf0 = ByteString.copyFrom(((byte[])object0));
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gehl gehl2 = (gehl)hftp0.b_message;
                gehl2.b |= 0x40;
                gehl2.i = hfsf0;
                return (gehl)hftp0.N_build();
            }
        }
        return null;
    }
}

