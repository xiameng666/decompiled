import android.os.Bundle;

public final class dueo implements fs {
    public final duew a;

    public dueo(duew duew0) {
        this.a = duew0;
    }

    @Override  // fs
    public final void a(String s, Bundle bundle0) {
        duew duew0 = this.a;
        fm fm0 = duew0.getChildFragmentManager();
        ca ca0 = new ca(fm0);
        ducy ducy0 = (ducy)fm0.h("TAG_BOTTOM_SHEET_FRAGMENT");
        if(ducy0 != null) {
            ca0.o(ducy0);
            ca0.g();
        }
        duew0.aG.K();
    }
}

