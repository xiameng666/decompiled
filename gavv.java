import android.util.Log;

public final class gavv {
    public static final void a(String s, gaym gaym0, ibts ibts0, ibth ibth0) {
        String s1;
        ibuq.f(ibts0, "addMoreInfo");
        if(ibth0 == null) {
            s1 = "N/A";
        }
        else {
            s1 = (String)ibth0.a();
            if(s1 == null) {
                s1 = "N/A";
            }
        }
        Log.w("Bender3Warning", a.l(s1, s, "[", "] "));
        if(gaym0 != null) {
            gayy.i(gaym0, s, gavs.c, ibts0);
        }
    }

    public static void b(String s, gaym gaym0, ibth ibth0, int v) {
        ibts ibts0 = (v & 4) == 0 ? null : gavs.a;
        if((v & 8) != 0) {
            ibth0 = null;
        }
        gavv.a(s, gaym0, ibts0, ibth0);
    }
}

