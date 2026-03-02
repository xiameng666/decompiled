import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.os.Bundle;
import android.provider.Settings.Secure;
import android.view.View;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;
import j..util.StringJoiner;

public final class aqby {
    public static final ComponentName a;
    public static final gged_interceptors b;
    public static final ComponentName c;

    static {
        bboh.b("AutofillImeUtils", bbcu.cD);
        aqby.a = new ComponentName("com.google.android.gms", "com.google.android.gms.autofill.service.AutofillInputMethodServiceProxy");
        aqby.b = gged_interceptors.m("com.google.android.gms.autofill.service.AutofillInputMethodServiceProxy", "com.google.android.gms.autofill.service.AutofillImeCoreService");
        aqby.c = new ComponentName("com.google.android.gms", "com.google.android.gms.autofill.service.AutofillService");
    }

    // Detected as a lambda impl.
    static void a(Context context0, View view0, int v, aphl aphl0, int v1) {
        InputMethodManager inputMethodManager0 = (InputMethodManager)context0.getSystemService("input_method");
        if(inputMethodManager0 == null) {
            aphl0.d(v, null);
            return;
        }
        String s = Settings.Secure.getString(context0.getContentResolver(), "default_input_method");
        ComponentName componentName0 = s == null ? null : ComponentName.unflattenFromString(s);
        if(componentName0 != null && componentName0.equals(aqby.a)) {
            aphl0.d(v, null);
            return;
        }
        hqaw hqaw0 = hqaw.a;
        if(((long)v1) >= hqaw0.c().b()) {
            aphl0.d(v, null);
            return;
        }
        inputMethodManager0.sendAppPrivateCommand(view0, "gms.autofill.action", new Bundle());
        view0.postDelayed(new aqbw(context0, view0, v, aphl0, v1), hqaw0.c().c());
    }

    public static void b(Context context0) {
        ContentResolver contentResolver0 = context0.getContentResolver();
        String s = Settings.Secure.getString(contentResolver0, "enabled_input_methods");
        StringJoiner stringJoiner0 = new StringJoiner(":");
        if(!gfta.c(s)) {
            for(Object object0: gfud.g(":").l(s)) {
                String s1 = (String)object0;
                Object object1 = gfud.g(";").l(s1).iterator().next();
                if(!((String)object1).equals("com.google.android.gms/.autofill.service.AutofillInputMethodServiceProxy")) {
                    stringJoiner0.add(s1);
                }
            }
        }
        Settings.Secure.putString(contentResolver0, "enabled_input_methods", stringJoiner0.toString());
    }

    public static void c(Context context0) {
        ContentResolver contentResolver0 = context0.getContentResolver();
        String s = Settings.Secure.getString(contentResolver0, "enabled_input_methods");
        StringJoiner stringJoiner0 = new StringJoiner(":");
        if(!gfta.c(s)) {
            for(Object object0: gfud.g(":").l(s)) {
                Object object1 = gfud.g(";").l(((String)object0)).iterator().next();
                if(((String)object1).equals("com.google.android.gms/.autofill.service.AutofillInputMethodServiceProxy")) {
                    return;
                }
                stringJoiner0.add(((String)object0));
            }
        }
        stringJoiner0.add("com.google.android.gms/.autofill.service.AutofillInputMethodServiceProxy");
        Settings.Secure.putString(contentResolver0, "enabled_input_methods", stringJoiner0.toString());
    }

    public static void d(Context context0, View view0, int v, aphl aphl0) {
        view0.requestFocus();
        aqby.a(context0, view0, v, aphl0, 0);
    }

    public static boolean e(Context context0) {
        String s = Settings.Secure.getString(context0.getContentResolver(), "autofill_service");
        if(s == null) {
            return false;
        }
        ComponentName componentName0 = ComponentName.unflattenFromString(s);
        return componentName0 == null ? false : componentName0.equals(aqby.c);
    }

    public static final boolean f(Context context0) {
        return bbmq.a(context0, "com.google.android.gms.autofill.service.AutofillInputMethodServiceProxy") == 1;
    }

    public static final void g() {
        gged_interceptors gged0 = aqby.b;
        int v = ((ggna)gged0).c;
        for(int v1 = 0; v1 < v; ++v1) {
            bbmq.L(((String)gged0.get(v1)), 2);
        }
    }

    public static final void h() {
        gged_interceptors gged0 = aqby.b;
        int v = ((ggna)gged0).c;
        for(int v1 = 0; v1 < v; ++v1) {
            bbmq.L(((String)gged0.get(v1)), 1);
        }
    }

    public static void i(Context context0) {
        InputMethodManager inputMethodManager0 = (InputMethodManager)context0.getSystemService("input_method");
        if(inputMethodManager0 != null) {
            String s = null;
            for(Object object0: inputMethodManager0.getInputMethodList()) {
                InputMethodInfo inputMethodInfo0 = (InputMethodInfo)object0;
                if(inputMethodInfo0.getComponent().getClassName().equals("com.google.android.gms.autofill.service.AutofillInputMethodServiceProxy")) {
                    s = inputMethodInfo0.getId();
                    break;
                }
            }
            if(s != null) {
                Settings.Secure.putString(context0.getContentResolver(), "default_input_method", s);
            }
        }
    }
}

