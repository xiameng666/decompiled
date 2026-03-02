import android.content.Context;
import android.nfc.NfcAdapter;
import android.util.Log;
import com.google.android.gms.ocr.OcrAvailabilityRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class gbhu implements gbhm {
    public dkhw a;
    private final Context b;

    public gbhu(Context context0) {
        ibuq.f(context0, "appContext");
        super();
        this.b = context0;
    }

    @Override  // gbhm
    public final int a() {
        return 4;
    }

    @Override  // gbhm
    public final long b() {
        return 0L;
    }

    @Override  // gbhm
    public final Object c() {
        return this.e();
    }

    @Override  // gbhm
    public final void d(Object object0, Object object1) {
        ibuq.f(object0, "setter");
        ((gbhv)object0).c(((gbht)object1).a);
        ((gbhv)object0).U(((gbht)object1).a.contains(hcja.b));
    }

    public final gbht e() {
        hcja hcja0;
        List list0;
        dklu dklu0 = new dklu(this.b);
        this.a = dklu0;
        try {
            evql evql0 = dklu0.b(new OcrAvailabilityRequest(0L));
            gaxl.a();
            int[] arr_v = (int[])evrg.o(evql0, hvud.b(), TimeUnit.MILLISECONDS);
            ibuq.c(arr_v);
            list0 = new ArrayList(arr_v.length);
            for(int v = 0; v < arr_v.length; ++v) {
                switch(arr_v[v]) {
                    case 1: {
                        hcja0 = hcja.b;
                        break;
                    }
                    case 2: {
                        hcja0 = hcja.c;
                        break;
                    }
                    default: {
                        hcja0 = hcja.a;
                    }
                }
                list0.add(hcja0);
            }
        }
        catch(ExecutionException executionException0) {
            Log.w("ocrDataLoader", "Availability check via ocr service failed: ", executionException0);
            return new gbht(this.f());
        }
        catch(InterruptedException interruptedException0) {
            Log.w("ocrDataLoader", "Availability check via ocr service failed: ", interruptedException0);
            return new gbht(this.f());
        }
        catch(TimeoutException timeoutException0) {
            Log.w("ocrDataLoader", "Availability check via ocr service failed: ", timeoutException0);
            return new gbht(this.f());
        }
        return new gbht(list0);
    }

    private final List f() {
        ibqm ibqm0 = new ibqm(null);
        Context context0 = this.b;
        ibuq.f(context0, "<this>");
        NfcAdapter nfcAdapter0 = NfcAdapter.getDefaultAdapter(context0);
        if(nfcAdapter0 != null && nfcAdapter0.isEnabled()) {
            ibqm0.add(hcja.c);
        }
        if(new dkhl(context0).a() != null) {
            ibqm0.add(hcja.b);
        }
        return ibpo.a(ibqm0);
    }
}

