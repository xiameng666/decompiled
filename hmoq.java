import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONObject;

public final class hmoq {
    public byte[] a;
    public boolean b;
    public boolean c;
    public byte d;
    public List e;
    public int f;
    public JSONObject g;
    public boolean h;
    public boolean i;
    public final List j;
    public String k;
    public int l;

    public hmoq() {
        this.a = new byte[7];
        this.d = 15;
        this.e = new LinkedList();
        this.f = 0x100;
        this.l = 5;
        this.h = false;
        this.i = false;
        this.j = new ArrayList();
        this.k = "DESFireEV2";
    }

    public final void a(boolean z) {
        this.h = z;
        this.j.add("isAuthVCMandatory");
    }

    public final void b(boolean z) {
        this.i = z;
        this.j.add("isPCMandatory");
    }
}

