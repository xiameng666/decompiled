import android.os.Bundle;

public final class ahlo {
    public static Bundle a(ahlq ahlq0) {
        kvt kvt0 = ahlq0.d();
        if(kvt0 == null) {
            return null;
        }
        Bundle bundle0 = new Bundle();
        if(kvt0.c) {
            bundle0.putInt("authentication_result_type", kvt0.a.a);
            return bundle0;
        }
        bundle0.putInt("authentication_error_code", kvt0.b.a);
        CharSequence charSequence0 = kvt0.b.b;
        if(charSequence0 == null) {
            return bundle0;
        }
        bundle0.putString("authentication_error_message", charSequence0.toString());
        return bundle0;
    }
}

