import android.view.View;

public final class fuop {
    public static final void a(fuok fuok0, View view0) {
        ibuq.f(fuok0, "<this>");
        ibuq.f(view0, "view");
        fuop.g(fuok0, view0);
    }

    public static final void b(fuok fuok0, View view0) {
        ibuq.f(fuok0, "<this>");
        ibuq.f(view0, "view");
        fuop.h(fuok0, view0);
    }

    public static final void c(fuok fuok0, View view0, int v) {
        ibuq.f(fuok0, "<this>");
        ibuq.f(view0, "view");
        fuok.b(view0, new fuom(view0, v));
    }

    public static final void d(fuok fuok0, View view0) {
        ibuq.f(fuok0, "<this>");
        ibuq.f(view0, "view");
        fuop.i(fuok0, view0);
    }

    public static final void e(fuok fuok0, View view0, int v) {
        ibuq.f(fuok0, "<this>");
        ibuq.f(view0, "view");
        fuok.b(view0, new fuoo(view0, v));
    }

    public static final void f(fuok fuok0, View view0, boolean z) {
        ibuq.f(fuok0, "<this>");
        ibuq.f(view0, "rootView");
        kex.b(view0, new fuol(z, view0));
        view0.requestApplyInsets();
    }

    public static void g(fuok fuok0, View view0) {
        ibuq.f(fuok0, "<this>");
        ibuq.f(view0, "view");
        fuok.b(view0, new fuon(view0));
    }

    public static void h(fuok fuok0, View view0) {
        fuop.c(fuok0, view0, 0);
    }

    public static void i(fuok fuok0, View view0) {
        fuop.e(fuok0, view0, 0);
    }
}

