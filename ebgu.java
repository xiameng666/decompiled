import android.content.Context;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;

public final class ebgu extends ebhb {
    dmce a;
    private final String b;

    static {
        bboh.b("Pay", bbcu.cZ);
    }

    private ebgu(String s) {
        this.b = s;
    }

    @Override  // ebhb
    public final ftcg a() {
        try {
            dmce dmce0 = this.a;
            SQLiteDatabase sQLiteDatabase0 = dmhk.d(dmce0.h).c();
            String s = String.valueOf(dlud.c.a());
            long v = DatabaseUtils.queryNumEntries(sQLiteDatabase0, "BulletinInteractions", dmce.b, new String[]{dmce0.i, dmce0.j, this.b, s});
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ftcg.a).v_newBuilder();
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)ftbh.a).v_newBuilder();
            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)ftbg.a).v_newBuilder();
            boolean z = Long.compare(v, 0L) == 0;
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            ftbg ftbg0 = (ftbg)hftp2.b_message;
            ftbg0.b |= 1;
            ftbg0.c = z;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ftbh ftbh0 = (ftbh)hftp1.b_message;
            ftbg ftbg1 = (ftbg)hftp2.N_build();
            ftbg1.getClass();
            ftbh0.c = ftbg1;
            ftbh0.b = 1;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ftcg ftcg0 = (ftcg)hftp0.b_message;
            ftbh ftbh1 = (ftbh)hftp1.N_build();
            ftbh1.getClass();
            ftcg0.c = ftbh1;
            ftcg0.b = 4;
            return (ftcg)hftp0.N_build();
        }
        catch(dmhl dmhl0) {
            throw new cjuh(8, "GetClientState: Error retrieving mdoc state", null, dmhl0);
        }
    }

    public static ebgu d(Context context0, ftcd ftcd0) {
        ftbf ftbf0 = ftcd0.c == 15 ? ((ftbf)ftcd0.d) : ftbf.a;
        String s = (ftbf0.b == 1 ? ((ftbe)ftbf0.c) : ftbe.a).c;
        gftb.b(((boolean)(gfta.c(s) ^ 1)), "GetClientState received an invalid request fields");
        ebfx ebfx0 = new ebfx(ebgu.f(context0, ftcd0));
        ebgu ebgu0 = new ebgu(s);
        ebfx0.inject(ebgu0);
        return ebgu0;
    }
}

