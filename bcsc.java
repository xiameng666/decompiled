import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.provider.Telephony.Sms.Inbox;
import android.text.TextUtils;
import android.util.Patterns;
import com.google.android.gms.chimera.modules.constellation.AppContextProvider;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public final class bcsc implements bcsg {
    private static final baun a;
    private final hofs b;
    private final bbxx c;
    private final bcrd d;
    private final List e;
    private final bcsi f;

    static {
        bcsc.a = bcrh.a("registered_sms_verifier");
    }

    public bcsc(hofs hofs0, bbxx bbxx0, bcrd bcrd0) {
        hoer hoer0 = hofs0.c == 4 ? ((hoer)hofs0.d) : hoer.a;
        hobj hobj0 = hoer0.c == null ? hobj.a : hoer0.c;
        hfuo hfuo0 = (hobj0.c == 7 ? ((hoce)hobj0.d) : hoce.a).b;
        bcpt.a();
        super();
        this.b = hofs0;
        this.c = bbxx0;
        this.d = bcrd0;
        this.e = hfuo0;
        this.f = new bcsi(bcqx.a(AppContextProvider.a()));
    }

    @Override  // bcsg
    public final hofs a() {
        gged_interceptors gged0;
        Cursor cursor1;
        long v8;
        long v3;
        Cursor cursor0;
        baun baun0 = bcsc.a;
        baun0.h("do verification", new Object[0]);
        long v = ((bcbs)bbzr.b().a(AppContextProvider.a())).c.getLong("previous_session_sync_timestamp_millis", 1000000L);
        long v1 = System.currentTimeMillis();
        Context context0 = AppContextProvider.a();
        bcrd bcrd0 = this.d;
        bcrk bcrk0 = bcrk.b(context0, bcrd0);
        AppContextProvider.a();
        Map map0 = bcrk0.f();
        Map map1 = bbzc.b().g();
        HashMap hashMap0 = new HashMap();
        Integer integer0 = (int)-1;
        if(map0 != null && !map0.isEmpty()) {
            for(Object object0: map1.entrySet()) {
                Map.Entry map$Entry0 = (Map.Entry)object0;
                String s = (String)((List)map$Entry0.getValue()).get(0);
                if(!TextUtils.isEmpty(s) && map0.containsKey(s)) {
                    hashMap0.put(((Integer)map0.get(s)), ((String)map$Entry0.getKey()));
                }
                else {
                    baun0.m("Missing imsi:%s from imsiSubIdMap:%s", new Object[]{s, map0});
                    this.f.a(bcrd0, this.b, gmfz.ap);
                }
            }
        }
        else if(!map1.keySet().isEmpty()) {
            hashMap0.put(integer0, ((String)map1.keySet().toArray()[0]));
        }
        List list0 = this.e;
        hrfs hrfs0 = hrfs.a;
        if(hrfs0.e().r()) {
            if(hrfs0.e().p() || v1 - v > TimeUnit.HOURS.toMillis(0xA8L)) {
                v = v1 - TimeUnit.HOURS.toMillis(0xA8L);
            }
            long v2 = v1 - TimeUnit.HOURS.toMillis(hrfs0.e().a());
            if(v2 < v) {
                bcpt.a.h("Sync window end is earlier than window start. Start(ms): %d. End(ms):%d.", new Object[]{v, v2});
                gged0 = ggna.a;
            }
            else {
                try {
                    cursor0 = AppContextProvider.a().getContentResolver().query(Telephony.Sms.Inbox.CONTENT_URI, new String[]{"date", "address", "body", "sub_id"}, "type = 1 AND date > ? AND date < ?", new String[]{String.valueOf(v), String.valueOf(v2)}, "date DESC");
                    v3 = v;
                }
                catch(SQLiteException | SecurityException exception0) {
                    v3 = v;
                    bcpt.a.f("Error reading SMS logs.", new Object[0]);
                    bcqx.a(AppContextProvider.a()).e(bcrd0, gmfz.ay, exception0);
                    cursor0 = null;
                }
                if(cursor0 == null) {
                    gged0 = ggna.a;
                }
                else {
                    bcpt.a.h("Retrieved filtered SMS from client.", new Object[0]);
                    baun baun1 = bcpt.a;
                    int v4 = (int)hrfs.a.e().c();
                    ArrayList arrayList0 = new ArrayList();
                    int v5 = (int)hrfs.a.e().b();
                    HashSet hashSet0 = new HashSet();
                    for(Object object1: list0) {
                        hashSet0.add(((hocc)object1).b);
                    }
                    int v6 = 0;
                    while(cursor0.moveToNext() && v6 < v4) {
                        String s1 = cursor0.getString(cursor0.getColumnIndex("address"));
                        gftb.check(s1);
                        ByteString hfsf0 = bcpt.b(s1);
                        long v7 = cursor0.getLong(cursor0.getColumnIndex("date"));
                        if(hashSet0.contains(hfsf0) && v7 < v2 && v7 > v3) {
                            v8 = v2;
                            long v9 = v7 - v7 % (TimeUnit.HOURS.toMillis(((long)v5)) / 2L);
                            int v10 = cursor0.getInt(cursor0.getColumnIndex("sub_id"));
                            if(hashMap0.containsKey(integer0)) {
                                v10 = -1;
                            }
                            String s2 = cursor0.getString(cursor0.getColumnIndex("body"));
                            gftb.check(s2);
                            if(!Patterns.WEB_URL.matcher(s2).find()) {
                                Integer integer1 = v10;
                                if(hashMap0.containsKey(integer1)) {
                                    String s3 = (String)hashMap0.get(integer1);
                                    gftb.check(s3);
                                    ByteString hfsf1 = bcpt.b(s3);
                                    String s4 = cursor0.getString(cursor0.getColumnIndex("body"));
                                    gftb.check(s4);
                                    cursor1 = cursor0;
                                    ghga ghga0 = ghge.a.h().m(Long.toString(v9), StandardCharsets.UTF_8);
                                    ghga0.l(hfsf1.toByteArray());
                                    ghga0.l(hfsf0.toByteArray());
                                    byte[] arr_b = ghga0.m(s4, StandardCharsets.UTF_8).s().e();
                                    gftb.check(arr_b);
                                    ByteString hfsf2 = ByteString.copyFrom(arr_b);
                                    ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hoca.a).v_newBuilder();
                                    ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hobz.a).v_newBuilder();
                                    if(!hftp1.b_message.isImmutable()) {
                                        hftp1.ensureMutable();
                                    }
                                    ((hobz)hftp1.b_message).b = hfsf2;
                                    if(!hftp0.b_message.isImmutable()) {
                                        hftp0.ensureMutable();
                                    }
                                    hoca hoca0 = (hoca)hftp0.b_message;
                                    hobz hobz0 = (hobz)hftp1.N_build();
                                    hobz0.getClass();
                                    hoca0.c = hobz0;
                                    hoca0.b |= 1;
                                    arrayList0.add(((hoca)hftp0.N_build()));
                                    ++v6;
                                    goto label_108;
                                }
                            }
                            cursor1 = cursor0;
                        }
                        else {
                            cursor1 = cursor0;
                            v8 = v2;
                        }
                    label_108:
                        v4 = v4;
                        cursor0 = cursor1;
                        v2 = v8;
                    }
                    baun1.h(a.aA(arrayList0, "Found ", " valid messages."), new Object[0]);
                    cursor0.close();
                    gged0 = arrayList0;
                }
            }
        }
        else {
            bcpt.a.h("A2P is not enabled for this client.", new Object[0]);
            gged0 = ggna.a;
        }
        bbxx bbxx0 = this.c;
        bcrd bcrd1 = this.d;
        hofs hofs0 = this.b;
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)hobo.a).v_newBuilder();
        ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)hocf.a).v_newBuilder();
        if(!hftp3.b_message.isImmutable()) {
            hftp3.ensureMutable();
        }
        hocf hocf0 = (hocf)hftp3.b_message;
        hfuo hfuo0 = hocf0.b;
        if(!hfuo0.c()) {
            hocf0.b = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(gged0, hocf0.b);
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        hobo hobo0 = (hobo)hftp2.b_message;
        hocf hocf1 = (hocf)hftp3.N_build();
        hocf1.getClass();
        hobo0.c = hocf1;
        hobo0.b = 6;
        hofs hofs1 = bbxx0.j(bcrd1, hofs0, ((hobo)hftp2.N_build()));
        bcrg.e();
        if(bcrg.c(hofs1)) {
            hoer hoer0 = hofs1.c == 4 ? ((hoer)hofs1.d) : hoer.a;
            hobj hobj0 = hoer0.c == null ? hobj.a : hoer0.c;
            String s5 = (hobj0.e == null ? hobk.a : hobj0.e).b;
            hoer hoer1 = hofs0.c == 4 ? ((hoer)hofs0.d) : hoer.a;
            hobj hobj1 = hoer1.c == null ? hobj.a : hoer1.c;
            if(s5.equals((hobj1.e == null ? hobk.a : hobj1.e).b)) {
                bcsc.a.f("Registered SMS Verifier timed out.", new Object[0]);
                bcsi bcsi0 = this.f;
                bcsi0.a(bcrd1, hofs0, gmfz.y);
                if(hrel.c() && hofs1 != null) {
                    bcrg.e();
                    if(bcrg.d(hofs1)) {
                        bcsi0.f(bcrd1, 6, System.currentTimeMillis());
                    }
                }
            }
        }
        return hofs1;
    }

    @Override  // bcsg
    public final hofs b() {
        return this.b;
    }

    @Override  // bcsg
    public final String c() {
        hoer hoer0 = this.b.c == 4 ? ((hoer)this.b.d) : hoer.a;
        hobj hobj0 = hoer0.c == null ? hobj.a : hoer0.c;
        return (hobj0.e == null ? hobk.a : hobj0.e).b;
    }

    @Override  // bcsg
    public final void d() {
        if(hrel.c()) {
            this.f.e(this.d, 6);
        }
    }
}

