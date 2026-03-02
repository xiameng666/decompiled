import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.icing.nativeindex.NativeIndex;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class bwsn extends bwsh {
    private final String[] a;
    private final long b;

    public bwsn(String[] arr_s, long v) {
        super(bwst.a(arr_s), 5);
        this.a = arr_s;
        this.b = v;
    }

    @Override  // bwse
    protected final void c(bwmx bwmx0, bwud bwud0, NativeIndex nativeIndex0, bwuc bwuc0, bwuj bwuj0) {
        String[] arr_s = this.a;
        if(arr_s != null) {
            String s = bwud0.e;
            bwne.r("Processing remove (%d Things) synchronously for package %s.", Integer.valueOf(arr_s.length), s);
            bwst.i(bwmx0.b, bwmx0.r, 5);
            int v = 0;
            while(v < arr_s.length) {
                String s1 = arr_s[v];
                bwst.f(s, s1, null, bwmx0, nativeIndex0, bwuc0, bwuj0, false);
                bwne.r("Synchronously removed Thing (pkg: %s, url: %s)", s, s1);
                ++v;
                nativeIndex0 = nativeIndex0;
                bwuj0 = bwuj0;
            }
            nativeIndex0.v();
            if(hubg.h().b.contains(s)) {
                glzd.g(bwmx0.j(), new bwsm(arr_s, bwmx0, this.b, s), gmap.a);
            }
        }
    }

    @Override  // bwsh
    public final bwsg g(SQLiteDatabase sQLiteDatabase0, bwqt bwqt0, bwud bwud0, bwtc bwtc0) {
        HashSet hashSet0;
        List list0;
        String[] arr_s = this.a;
        if(arr_s == null) {
            return new bwsg(null, null);
        }
        batl.l(sQLiteDatabase0.inTransaction());
        Set set0 = bwqs.a(sQLiteDatabase0, bwud0.e, bwtc0);
        if("com.google.android.apps.messaging".equals(bwud0.e) && hubg.a.j().M()) {
            HashMap hashMap0 = new HashMap();
            hashMap0.put("Message", new bwqr(bwqt.e(set0, "Message")));
            hashMap0.put("Conversation", new bwqr(bwqt.e(set0, "Conversation")));
            hashMap0.put("Person", new bwqr(bwqt.e(set0, "Person")));
            hashMap0.put("DigitalDocument", new bwqr(bwqt.e(set0, "DigitalDocument")));
            hashMap0.put("LocalBusiness", new bwqr(bwqt.e(set0, "LocalBusiness")));
            int v = 0;
            while(v < arr_s.length) {
                String s = arr_s[v];
                if(s.startsWith("messages", 44)) {
                    list0 = Arrays.asList(new String[]{"Message"});
                }
                else if(s.startsWith("conversations", 44)) {
                    list0 = Arrays.asList(new String[]{"Conversation"});
                }
                else if(s.startsWith("participants", 44)) {
                    list0 = Arrays.asList(new String[]{"Person"});
                }
                else if(s.startsWith("annotations", 44)) {
                    list0 = Arrays.asList(new String[]{"LocalBusiness", "DigitalDocument"});
                }
                else {
                    bwne.f("Unknown url format from com.google.android.apps.messaging. Falling back to fanout");
                    list0 = Collections.EMPTY_LIST;
                }
                if(!list0.isEmpty()) {
                    for(Object object0: list0) {
                        bwqr bwqr0 = (bwqr)hashMap0.get(((String)object0));
                        if(bwqr0 == null) {
                            hashSet0 = null;
                            goto label_53;
                        }
                        if(bwqr0.b == null) {
                            bwqr0.b = new ArrayList();
                        }
                        bwqr0.b.add(s);
                    }
                    ++v;
                    continue;
                }
                hashSet0 = null;
                goto label_53;
            }
            hashSet0 = new HashSet();
            for(Object object1: hashMap0.values()) {
                bwqr bwqr1 = (bwqr)object1;
                List list1 = bwqr1.b;
                if(list1 != null) {
                    bwqt0.i(sQLiteDatabase0, ((String[])list1.toArray(new String[0])), bwqr1.a);
                    hashSet0.addAll(bwqr1.a);
                }
            }
        label_53:
            if(hashSet0 != null) {
                return new bwsg(hashSet0, null);
            }
        }
        bwqt0.i(sQLiteDatabase0, arr_s, set0);
        return new bwsg(set0, null);
    }

    @Override  // bwsi
    public final void h(bwmx bwmx0, bwud bwud0, bwrc bwrc0) {
        String[] arr_s = this.a;
        if(arr_s != null) {
            for(int v = 0; v < arr_s.length; ++v) {
                String s = arr_s[v];
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)bwlq.a).v_newBuilder();
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)bwls.a).v_newBuilder();
                String s1 = bwud0.e;
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp1.b_message;
                ((bwls)hftv0).b = s1;
                if(!hftv0.isImmutable()) {
                    hftp1.ensureMutable();
                }
                bwls bwls0 = (bwls)hftp1.b_message;
                s.getClass();
                bwls0.c = s;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                bwlq bwlq0 = (bwlq)hftp0.b_message;
                bwls bwls1 = (bwls)hftp1.N_build();
                bwls1.getClass();
                bwlq0.c = bwls1;
                bwlq0.b = 3;
                long v1 = this.b;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((bwlq)hftp0.b_message).d = v1;
                int v2 = bwud0.a();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((bwlq)hftp0.b_message).e = v2;
                bwrc0.a(((bwlq)hftp0.N_build()));
            }
        }
    }

    @Override  // bwsi
    public final void i(bwud bwud0, bwmx bwmx0, bwtc bwtc0) {
        String[] arr_s = this.a;
        if(arr_s == null) {
            throw new bwsy("URLs cannot be null.", glrs.t);
        }
        if(arr_s.length > 1000) {
            throw new bwsy("Providing more than 1000 URLs in one remove call is not allowed.", glrs.u);
        }
        int v = 0;
        while(v < arr_s.length) {
            String s = arr_s[v];
            if(s == null) {
                throw new bwsy("URL cannot be null.", glrs.t);
            }
            try {
                bwtj.b(s);
                ++v;
            }
            catch(IllegalArgumentException illegalArgumentException0) {
                throw new bwsy((illegalArgumentException0.getMessage() == null ? illegalArgumentException0.toString() : illegalArgumentException0.getMessage()), glrs.v);
            }
            continue;
        }
    }
}

