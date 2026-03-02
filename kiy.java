import android.os.Bundle;

public final class kiy extends kis {
    public final String i;
    public final String j;

    public kiy(String s, String s1, boolean z, kir kir0, String s2, boolean z1, Bundle bundle0, Bundle bundle1) {
        super("android.credentials.TYPE_PASSWORD_CREDENTIAL", bundle0, bundle1, false, z, kir0, s2, z1);
        this.i = s;
        this.j = s1;
        if(s1.length() > 0) {
            return;
        }
        throw new IllegalArgumentException("password should not be empty");
    }
}

