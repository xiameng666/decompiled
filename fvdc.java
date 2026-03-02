import android.content.Context;
import android.net.Uri;
import com.google.android.gms.mdd.FileGroupResponse;
import com.google.android.gms.mdd.MddFile;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class fvdc implements fvdd {
    private final frga a;
    private final fvdq b;
    private final frbw c;
    private final cpvn d;

    static {
        bboh.a("DeviceMLModelMdd");
    }

    public fvdc(Context context0, fvdq fvdq0) {
        ccsd ccsd0 = hrnt.f() ? new ccsd(new csnw(context0)) : new csnw(context0);
        cpvn cpvn0 = new cpvn(context0);
        frfm frfm0 = new frfm();
        super();
        this.a = ccsd0;
        this.d = cpvn0;
        this.c = frfm0;
        this.b = fvdq0;
    }

    @Override  // fvdd
    public final ByteBuffer a() {
        this.d.e("location_bluesky_deviceml");
        evql evql0 = this.d.f("location_bluesky_deviceml");
        try {
            evrg.o(evql0, 2000L, TimeUnit.MILLISECONDS);
        }
        catch(ExecutionException | TimeoutException | InterruptedException exception0) {
            throw new IOException(exception0);
        }
        FileGroupResponse fileGroupResponse0 = (FileGroupResponse)evql0.j();
        List list0 = fileGroupResponse0.c;
        if(list0.isEmpty()) {
            return null;
        }
        this.b.ab(fileGroupResponse0.d);
        return (ByteBuffer)new frbx(Arrays.asList(new frga[]{this.a})).d(Uri.parse(((MddFile)list0.get(0)).b), this.c);
    }
}

