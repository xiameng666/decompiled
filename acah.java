import com.google.android.gms.apperrors.PackageNameAndVersion;
import com.google.android.gms.apperrors.SetFilterParameters;
import j..util.DesugarCollections;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;

public final class acah implements gfsi {
    public final SetFilterParameters a;

    public acah(SetFilterParameters setFilterParameters0) {
        this.a = setFilterParameters0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((acab)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((acab)object0))));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        SetFilterParameters setFilterParameters0 = this.a;
        ((acab)hftp0.b_message).b().clear();
        List list0 = setFilterParameters0.a;
        int v = Math.min(list0.size(), ((int)hyle.a.b().g()));
        for(int v1 = 0; v1 < v; ++v1) {
            PackageNameAndVersion packageNameAndVersion0 = (PackageNameAndVersion)list0.get(v1);
            String s = packageNameAndVersion0.a;
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)acac.a).v_newBuilder();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp1.b_message;
            s.getClass();
            ((acac)hftv0).b = s;
            int v2 = packageNameAndVersion0.b;
            if(!hftv0.isImmutable()) {
                hftp1.ensureMutable();
            }
            ((acac)hftp1.b_message).c = v2;
            acac acac0 = (acac)hftp1.N_build();
            s.getClass();
            acac0.getClass();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((acab)hftp0.b_message).b().put(s, acac0);
        }
        for(Object object1: DesugarCollections.unmodifiableMap(((acab)object0).d).entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object1;
            String s1 = (String)map$Entry0.getKey();
            s1.getClass();
            Map map0 = DesugarCollections.unmodifiableMap(((acab)hftp0.b_message).c);
            acac acac1 = map0.containsKey(s1) ? ((acac)map0.get(s1)) : null;
            if(acac1 == null || acac1.c != ((acac)map$Entry0.getValue()).c) {
                String s2 = (String)map$Entry0.getKey();
                s2.getClass();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((acab)hftp0.b_message).c().remove(s2);
            }
        }
        hfwn hfwn0 = hfyn.h(System.currentTimeMillis() + ((long)setFilterParameters0.b) * 86400000L);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        acab acab0 = (acab)hftp0.b_message;
        hfwn0.getClass();
        acab0.e = hfwn0;
        acab0.b |= 1;
        return (acab)hftp0.N_build();
    }
}

