import android.os.Bundle;

public final class amx {
    public final Integer a;

    public amx(Integer integer0) {
        this.a = integer0;
    }

    public final Bundle a() {
        Bundle bundle0 = new Bundle();
        Integer integer0 = this.a;
        if(integer0 != null) {
            bundle0.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", integer0.intValue());
        }
        return bundle0;
    }
}

