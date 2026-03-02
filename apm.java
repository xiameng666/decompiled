import android.text.TextUtils;
import android.util.Rational;
import android.util.Size;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class apm implements Runnable {
    public final aqi a;
    public final List b;

    public apm(aqi aqi0, List list0) {
        this.a = aqi0;
        this.b = list0;
    }

    @Override
    public final void run() {
        aqi aqi0;
        try {
            aqi0 = this.a;
            bmy bmy0 = aqi0.a;
            boolean z = bmy0.c().isEmpty();
            ArrayList arrayList0 = new ArrayList();
            Rational rational0 = null;
            for(Object object0: this.b) {
                aqh aqh0 = (aqh)object0;
                String s = aqh0.a;
                if(!bmy0.j(s)) {
                    bmy0.g(s, aqh0.c, aqh0.d, aqh0.f, aqh0.g);
                    arrayList0.add(s);
                    if(aqh0.b == bdf.class) {
                        Size size0 = aqh0.e;
                        if(size0 != null) {
                            rational0 = new Rational(size0.getWidth(), size0.getHeight());
                        }
                    }
                }
            }
            if(!arrayList0.isEmpty()) {
                TextUtils.join(", ", arrayList0);
                aqi0.O();
                boolean z1 = true;
                if(z) {
                    aqi0.f.q(true);
                    aqi0.f.o();
                }
                aqi0.m();
                aqi0.E();
                aqi0.D();
                aqi0.C();
                aqi0.N();
                if(aqi0.A == 10) {
                    aqi0.w();
                }
                else {
                    int v1 = aqi0.A - 1;
                    if(aqi0.A == 0) {
                        throw null;
                    }
                    switch(v1) {
                        case 2: 
                        case 3: 
                        case 4: {
                            aqi0.A(false);
                            break;
                        }
                        case 5: {
                            aqi0.J(8);
                            if(!aqi0.I() && !aqi0.s && aqi0.j == 0) {
                                if(aqi0.i == null) {
                                    z1 = false;
                                }
                                kay.d(z1, "Camera Device should be open if session close is not complete");
                                aqi0.J(10);
                                aqi0.w();
                            }
                            break;
                        }
                        default: {
                            Objects.toString(aqc.a(aqi0.A));
                            aqi0.O();
                        }
                    }
                }
                if(rational0 != null) {
                    aqi0.f.t(rational0);
                }
            }
        }
        finally {
            aqi0.f.m();
        }
    }
}

