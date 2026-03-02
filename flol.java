import java.util.HashMap;

public final class flol implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        Object object1 = new HashMap();
        ((HashMap)object1).put("DECORATION_ID", ((fmgg)object0).b);
        ((HashMap)object1).put("RENDER_CRITERIA", Integer.valueOf(((fmgg)object0).a.c));
        fmgd fmgd0 = ((fmgg)object0).c;
        HashMap hashMap0 = new HashMap();
        hashMap0.put("TYPE", Integer.valueOf(0));
        if(fmgc.a.equals(fmgc.a)) {
            HashMap hashMap1 = new HashMap();
            hashMap1.put("PROMPT_TEXT", flpn.d(((fmcj)fmgd0).a.a));
            floo floo0 = new floo();
            hashMap1.put("BUTTONS", flbp.d(((fmcj)fmgd0).a.b, floo0));
            hashMap0.put("DECORATION_CONTENT", hashMap1);
        }
        ((HashMap)object1).put("CONTENT", hashMap0);
        return object1;
    }
}

