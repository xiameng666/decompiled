import android.content.Context;
import android.os.Parcel;
import com.google.firebase.appindexing.internal.Thing;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class bwrv {
    public static void a(Context context0, Map map0) {
        String s3;
        String s2;
        String s1;
        HashMap hashMap0 = new HashMap();
        HashMap hashMap1 = new HashMap();
        for(Object object0: map0.values()) {
            List list0 = (List)object0;
            int v = 0;
            while(v < list0.size()) {
                Thing thing0 = (Thing)list0.get(v);
                String s = thing0.c.c;
                if(!s.isEmpty()) {
                    Parcel parcel0 = Parcel.obtain();
                    goqx.a(thing0, parcel0, 0);
                    parcel0.setDataPosition(0);
                    Thing thing1 = (Thing)Thing.CREATOR.createFromParcel(parcel0);
                    list0.set(v, thing1);
                    if(hubu.a.b().n()) {
                        try {
                            s1 = acso.e(context0, s);
                        }
                        catch(acse | IOException unused_ex) {
                            bwne.t("Failed to get the obfuscated Gaia ID for account: %s", s);
                            return;
                        }
                        if(hashMap1.containsKey(s1)) {
                            s2 = (String)hashMap1.get(s1);
                            goto label_34;
                        }
                        else {
                            s3 = "__a_" + ghjc.d.o(s1.getBytes(StandardCharsets.UTF_8)) + "__";
                            hashMap1.put(s1, s3);
                            goto label_33;
                        }
                        goto label_27;
                    }
                    else {
                    label_27:
                        if(hashMap0.containsKey(s)) {
                            s2 = (String)hashMap0.get(s);
                            goto label_34;
                        }
                        else {
                            byte[] arr_b = elfy.a.c(s, StandardCharsets.UTF_8).e();
                            s3 = "__a_" + ghjc.d.o(arr_b) + "__";
                            hashMap0.put(s, s3);
                        }
                    }
                label_33:
                    s2 = s3;
                label_34:
                    ggdy ggdy0 = new ggdy();
                    String[] arr_s = thing1.i("keywords");
                    if(arr_s != null) {
                        ggdy0.j(arr_s);
                    }
                    ggdy0.i(s2);
                    String[] arr_s1 = (String[])ggdy0.h().toArray(new String[0]);
                    thing1.b.putStringArray("keywords", arr_s1);
                }
                ++v;
            }
        }
    }
}

