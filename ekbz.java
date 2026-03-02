import android.database.Cursor;
import j..util.Map.-EL;
import java.util.HashMap;
import java.util.Map;

public final class ekbz extends ekeo {
    static final ggfp a;
    final Map b;
    public static final int c;
    private static final ggeo e;
    private final Map f;

    static {
        ekbz.a = ggfp.O("raw_contact_id", "mimetype", "data1", "data2", "data3", "data4", new String[]{"data5"});
        ggek ggek0 = new ggek();
        ggek0.i("data1", hiln.b);
        ggek0.i("data2", hiln.c);
        ggek0.i("data3", hiln.d);
        ggek0.i("data4", hiln.e);
        ggek0.i("data5", hiln.f);
        ekbz.e = ggek0.b();
    }

    public ekbz(Map map0) {
        super("match_all_mimetype");
        this.b = new HashMap();
        this.f = map0;
    }

    @Override  // ekcc
    public final ggfp a() {
        return ekbz.a;
    }

    @Override  // ekcc
    public final void b(Cursor cursor0) {
        int v = cursor0.getColumnCount();
        int v1 = cursor0.getColumnIndex("raw_contact_id");
        batl.p(v1, v, "RawContactId index not found.");
        long v2 = cursor0.getLong(v1);
        int v3 = cursor0.getColumnIndex("mimetype");
        batl.p(v3, v, "Mimetype index not found.");
        String s = cursor0.getString(v3);
        hilv hilv0 = (hilv)this.f.get(s);
        if(hilv0 == null) {
            return;
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hild.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hild)hftp0.b_message).c = hilv0.x;
        ((hild)hftp0.b_message).b |= 1;
        ggeo ggeo0 = ekbz.e;
        ggqj ggqj0 = ggeo0.w().om();
        while(ggqj0.hasNext()) {
            Object object0 = ggqj0.next();
            String s1 = (String)object0;
            int v4 = cursor0.getColumnIndex(s1);
            batl.p(v4, v, "DataColumn index not found.");
            String s2 = cursor0.getString(v4);
            if(s2 != null) {
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hilo.a).v_newBuilder();
                hiln hiln0 = (hiln)ggeo0.get(s1);
                batl.s(hiln0);
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp1.b_message;
                ((hilo)hftv0).c = hiln0.p;
                ((hilo)hftv0).b |= 1;
                if(!hftv0.isImmutable()) {
                    hftp1.ensureMutable();
                }
                hilo hilo0 = (hilo)hftp1.b_message;
                hilo0.b |= 2;
                hilo0.d = s2;
                hilo hilo1 = (hilo)hftp1.N_build();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                hild hild0 = (hild)hftp0.b_message;
                hilo1.getClass();
                hfuo hfuo0 = hild0.d;
                if(!hfuo0.c()) {
                    hild0.d = ProtoLiteMessage.E(hfuo0);
                }
                hild0.d.add(hilo1);
            }
        }
        ekby ekby0 = new ekby();
        hild hild1 = (hild)hftp0.N_build();
        ((ggdy)Map.-EL.computeIfAbsent(this.b, Long.valueOf(v2), ekby0)).i(hild1);
    }
}

