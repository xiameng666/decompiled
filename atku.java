import android.content.Context;
import android.text.TextUtils;
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Map;

public final class atku extends atkd {
    final atju b;
    private final atkg c;
    private boolean d;
    private boolean e;

    public atku(Context context0, String s, arad arad0) {
        super(arad0);
        File file5;
        File file4;
        File file3;
        File file2;
        File file0 = context0.getFilesDir();
        if(TextUtils.isEmpty(s) || s.contains(File.separator)) {
            throw new IllegalArgumentException("invalid dir name: " + s);
        }
        File file1 = hrnt.i() ? new File(ccsb.a.d(file0 + File.separator + "backup_data_store", s)) : new File(file0 + File.separator + "backup_data_store", s);
        file2 = atju.a(file1, "all_chunk_hashes");
        file3 = atju.a(file1, "new_chunks_content");
        file4 = atju.a(file1, "chunk_data_presence");
        file5 = atju.a(file1, "format_version");
        try(DataOutputStream dataOutputStream0 = new DataOutputStream(new FileOutputStream(file5))) {
            dataOutputStream0.writeInt(1);
        }
        atju atju0 = new atju(file2, file3, file4, file5, "rw", false);
        this.b = atju0;
        atki atki0 = atki.a(atju0);
        atlb atlb0 = new atlb(atju0.d());
        this.c = new atkg(atki0, (hqlt.y() ? new BufferedOutputStream(atlb0, ((int)hqlt.g())) : new BufferedOutputStream(atlb0, 0x2000)));
    }

    @Override  // atkd
    public final long a() {
        this.e();
        gftb.r(((boolean)(this.c.e ^ 1)), "already closed");
        this.c.b.flush();
        gftb.r(((boolean)(this.c.a.c ^ 1)), "already closed");
        this.c.a.a.flush();
        int v = this.c.a.b.length() + 7;
        return ((long)this.c.a.a.size()) + ((long)(v / 8)) + ((long)this.c.b.size());
    }

    @Override  // atkd
    public final atke b() {
        this.e();
        this.c.close();
        atke atke0 = new atkv(this);
        this.e = true;
        return atke0;
    }

    @Override
    public final void close() {
        if(!this.d) {
            this.d = true;
            if(!this.e) {
                this.b.close();
            }
        }
    }

    @Override  // atkd
    public final void d(atjy atjy0) {
        int v;
        this.e();
        this.c(atjy0);
        athu athu0 = atjy0.a;
        if(this.a.c(athu0)) {
            gftb.r(((boolean)(this.c.e ^ 1)), "already closed");
            atkc atkc0 = new atkc(athu0, gfqx.a);
            this.c.a.b(atkc0);
            return;
        }
        atkg atkg0 = this.c;
        atjv atjv0 = (atjv)atjy0.b;
        gftb.r(((boolean)(atkg0.e ^ 1)), "already closed");
        Map map0 = atkg0.c;
        if(map0.containsKey(athu0)) {
            v = (int)(((Integer)map0.get(athu0)));
        }
        else {
            atkg0.b.writeInt(atjv0.a.length);
            atkg0.b.write(atjv0.a);
            long v1 = atkg0.d.getValue();
            atkg0.b.writeLong(v1);
            atkg0.d.reset();
            v = atkg0.b.size();
        }
        Integer integer0 = v;
        atkc atkc1 = new atkc(athu0, gfsx.m(integer0));
        atkg0.a.b(atkc1);
        map0.put(athu0, integer0);
    }

    private final void e() {
        gftb.r(((boolean)(this.d ^ 1)), "already closed");
        gftb.r(((boolean)(this.e ^ 1)), "already built");
    }
}

