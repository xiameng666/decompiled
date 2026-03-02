import android.content.SharedPreferences.Editor;
import com.google.android.gms.chimera.modules.significant.places.AppContextProvider;
import com.google.android.gms.location.places.personalized.PlaceAlias;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Map;

final class epne implements frjg {
    private final icck a;

    public epne(icck icck0) {
        this.a = icck0;
    }

    @Override  // frjg
    public final gmcd a(frjm frjm0, MessageLite hfvm0) {
        hjij hjij1;
        epng epng0;
        ibuq.f(((epnt)hfvm0), "message");
        ArrayList arrayList0 = new ArrayList();
        ibqu ibqu0 = new ibqu();
        hfuo hfuo0 = ((epnt)hfvm0).b;
        ibuq.e(hfuo0, "getSignificantPlacesList(...)");
        LinkedHashMap linkedHashMap0 = new LinkedHashMap(ibwt.g(ibpz.a(ibpo.q(hfuo0, 10)), 16));
        for(Object object0: hfuo0) {
            linkedHashMap0.put(((epng)object0).c, object0);
        }
        ibqu0.putAll(linkedHashMap0);
        ggeo ggeo0 = frjm0.a();
        ibuq.e(ggeo0, "getAll(...)");
        for(Object object1: ggeo0.entrySet()) {
            Object object2 = ((Map.Entry)object1).getKey();
            ibuq.e(object2, "component1(...)");
            String s = (String)object2;
            Object object3 = ((Map.Entry)object1).getValue();
            if(ibzk.W(s, "auth_trust_agent_pref_trusted_place_enabled_") && ibuq.m(object3, Boolean.valueOf(true))) {
                String s1 = s.substring(44);
                ibuq.e(s1, "substring(...)");
                if(s1.length() == 0) {
                    ((ggtj)epon.a.j()).x("skipping trusted place migration with empty place id");
                }
                else {
                    String s2 = frjm0.c("auth_trust_agent_pref_trusted_place_name_" + s1);
                    String s3 = frjm0.c("auth_trust_agent_pref_trusted_place_address_" + s1);
                    if(s2 != null && s3 != null) {
                        String s4 = frjm0.c("auth_trust_agent_pref_trusted_place_account_" + s1);
                        epni epni0 = epnh.a(((ProtoLiteMessage)epng.a).v_newBuilder());
                        epni0.g(s1);
                        epni0.d(s2);
                        epni0.c(s3);
                        epni0.h(((float)hydt.b()));
                        if(s4 != null) {
                            ibuq.e(PlaceAlias.a.b, "getAlias(...)");
                            epni0.f(PlaceAlias.a.b);
                            epni0.b(s4);
                        }
                        epng0 = epni0.a();
                        goto label_44;
                    }
                    else {
                        ((ggtj)epon.a.j()).B("skipping trusted place migration without name or address (%s)", s1);
                    }
                }
                epng0 = null;
            label_44:
                if(epng0 != null) {
                    epng epng1 = (epng)ibqu0.remove(s1);
                    if(epng1 != null) {
                        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)epng0).jf(5, null);
                        hftp0.X(((ProtoLiteMessage)epng0));
                        float f = epng1.e;
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        epng epng2 = (epng)hftp0.b_message;
                        epng2.b |= 4;
                        epng2.e = f;
                        if((epng1.b & 2) == 0) {
                            hjij1 = null;
                        }
                        else {
                            hjij hjij0 = epng1.d;
                            hjij1 = hjij0 == null ? hjij.a : hjij0;
                        }
                        if(hjij1 != null) {
                            hjij hjij2 = epng1.d == null ? hjij.a : epng1.d;
                            if(!hftp0.b_message.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            epng epng3 = (epng)hftp0.b_message;
                            hjij2.getClass();
                            epng3.d = hjij2;
                            epng3.b |= 2;
                        }
                        epng0 = (epng)hftp0.N_build();
                    }
                    String s5 = epng0.c;
                    ibuq.e(s5, "getPlaceId(...)");
                    ibqu0.put(s5, epng0);
                    arrayList0.addAll(ibpo.g(new String[]{"auth_trust_agent_pref_trusted_place_enabled_" + s1, "auth_trust_agent_pref_trusted_place_name_" + s1, "auth_trust_agent_pref_trusted_place_address_" + s1, "auth_trust_agent_pref_trusted_place_account_" + s1}));
                }
            }
        }
        Map map0 = ibpz.b(ibqu0);
        ((ggtj)epon.a.h()).B("significant places migrated to: %s", map0);
        SharedPreferences.Editor sharedPreferences$Editor0 = AppContextProvider.a().getSharedPreferences("coffee_preferences", 0).edit();
        for(Object object4: arrayList0) {
            sharedPreferences$Editor0.remove(((String)object4));
        }
        sharedPreferences$Editor0.commit();
        epnd epnd0 = new epnd(((epnt)hfvm0), map0, null);
        return icpu.e(this.a, epnd0);
    }
}

