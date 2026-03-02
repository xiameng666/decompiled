import java.util.HashMap;

public final class floh {
    public static gfsx a(HashMap hashMap0) {
        fmfg fmfg0 = fmfh.a();
        try {
            fmfg0.d(((byte[])hashMap0.get("ICON")));
            fmfg0.f(((Integer)hashMap0.get("ICON_WIDTH")).intValue());
            fmfg0.c(((Integer)hashMap0.get("ICON_HEIGHT")).intValue());
            fmfg0.e(((String)hashMap0.get("TALK_BACK_DESCRIPTION")));
            if(hashMap0.containsKey("ICON_COLOR")) {
                fmfg0.b(((Integer)hashMap0.get("ICON_COLOR")).intValue());
                return gfsx.m(fmfg0.a());
            }
        }
        catch(NullPointerException nullPointerException0) {
            flbj.d("LitIconConv", "failed to convert Map to LighterIcon", nullPointerException0);
            return gfqx.a;
        }
        return gfsx.m(fmfg0.a());
    }

    public static HashMap b(fmfh fmfh0) {
        HashMap hashMap0 = new HashMap();
        hashMap0.put("ICON", fmfh0.a);
        hashMap0.put("ICON_WIDTH", Integer.valueOf(fmfh0.b));
        hashMap0.put("ICON_HEIGHT", Integer.valueOf(fmfh0.c));
        hashMap0.put("TALK_BACK_DESCRIPTION", fmfh0.e);
        gfsx gfsx0 = fmfh0.d;
        if(gfsx0.i()) {
            hashMap0.put("ICON_COLOR", gfsx0.d());
        }
        return hashMap0;
    }
}

