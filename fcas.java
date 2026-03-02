import android.accounts.Account;
import android.content.Context;
import com.google.android.wallet.ui.document.DownloadedDocument;
import j..util.Map.-EL;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class fcas implements gden {
    private final gcso a;
    private clcn b;
    private final gdee c;

    public fcas(String s, gddz gddz0, Account account0, String s1, Context context0, gdee gdee0) {
        clby clby0;
        this.c = gdee0;
        gcso gcso0 = new gcso();
        this.a = gcso0;
        try {
            clcj clcj0 = clbv.a(context0).e(gcsp.b(new gcsg(gddz0.b, ckzv.b)), gcso0, clhl.b.b(clhr.b), -1, 0x1B00);
            bxd bxd0 = gdea.a(Integer.toString(0xF1B18AD));
            try {
                gdea.c(account0, s1, context0, bxd0);
                clby0 = gcsp.a(bxd0);
            }
            catch(gcqt gcqt0) {
                throw new gcqw(gcqt0);
            }
            clcj0.m(clby0);
            clcj0.n(s);
            clcj0.q(context0, ByteBuffer.wrap(gdea.b(gddz0)), clbk.a, clbj.a);
            this.b = clcj0.e();
        }
        catch(gcqw gcqw0) {
            this.c.a(gcqw0);
        }
    }

    @Override  // gden
    public final void a() {
        clcn clcn0 = this.b;
        if(clcn0 != null) {
            clcn0.b();
        }
    }

    @Override  // gden
    public final void b() {
        String s;
        clcn clcn0 = this.b;
        if(clcn0 != null) {
            try {
                clcn0.a().get(25000L, TimeUnit.MILLISECONDS);
                Map map0 = this.a.b;
                try {
                    s = new String(this.a.a, gcvz.a(map0, "utf-8"));
                }
                catch(UnsupportedEncodingException unsupportedEncodingException0) {
                    throw new gcqx(unsupportedEncodingException0);
                }
                DownloadedDocument downloadedDocument0 = new DownloadedDocument(s, ((String)Map.-EL.getOrDefault(map0, "Content-Type", "text/html; charset=utf-8")));
                this.c.b(downloadedDocument0);
            }
            catch(ExecutionException | InterruptedException | TimeoutException | gcqx exception0) {
                gcqw gcqw0 = new gcqw(exception0);
                this.c.a(gcqw0);
            }
        }
    }
}

