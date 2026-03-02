import com.google.android.gms.personalsafety.detection.FinderTagInfo;

public final class ehuj implements gfsi {
    public final String a;

    public ehuj(String s) {
        this.a = s;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        Boolean boolean0 = Boolean.valueOf(false);
        String s = (((gtbf)object0).b == 6 ? ((gszz)((gtbf)object0).c) : gszz.a).b;
        String s1 = bboy.c(((gtbf)object0).f.toByteArray());
        String s2 = ((gtbf)object0).j;
        hfuo hfuo0 = ((gtbf)object0).k;
        Boolean boolean1 = Boolean.valueOf(((gtbf)object0).e);
        return ((gtbf)object0).i.isEmpty() ? new FinderTagInfo(this.a, ((gtbf)object0).g, s, s1, s2, boolean1, hfuo0, null, null, null, null, boolean0) : new FinderTagInfo(this.a, ((gtbf)object0).i, s, s1, s2, boolean1, hfuo0, null, null, null, null, boolean0);
    }
}

