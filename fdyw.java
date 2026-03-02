import android.os.Bundle;
import android.util.Log;
import j..util.Objects;

public final class fdyw implements Runnable {
    public final fdyy a;
    public final Bundle b;

    public fdyw(fdyy fdyy0, Bundle bundle0) {
        this.a = fdyy0;
        this.b = bundle0;
    }

    @Override
    public final void run() {
        Bundle bundle0 = this.b;
        fdvw fdvw0 = fdyy.b(bundle0.getString("path"), Objects.equals(bundle0.getString("isChannel"), "1"), bundle0.getString("pkgName"));
        fdyy fdyy0 = this.a;
        fdvx fdvx0 = fdyy0.f;
        fdvx0.a(fdvw0, "chunksRecv", 1);
        ffbw ffbw0 = fdyy0.d.a(bundle0);
        if(ffbw0 == null) {
            fdny.b(fdnv.b, fdvw0.b);
            fdyy0.g.c("INCHUNK", " DROPPED unable to parse");
            return;
        }
        fdvx0.a(fdvw0, "msgsRecv", 1);
        fdvx0.a(fdvw0, "bytesRecv", ffbw0.h.size());
        if(!ffgp.b().E()) {
            if(Log.isLoggable("rpctransport", 2)) {
                Log.v("rpctransport", "Cloud sync isn\'t started yet. Ignore cloud rpc: " + bundle0);
            }
            fdny.b(fdnv.b, ffbw0.d);
            fdyy0.g.f(fdsl.a.a, ffbw0, "not connected to cloud");
            fdyy0.m(ffbw0, 8);
            return;
        }
        String s = fdyy0.i;
        if(s != null) {
            if(Log.isLoggable("rpctransport", 2)) {
                Log.v("rpctransport", String.format("Cloud sync is ignored due to active migrate node:%s, Ignore cloud rpc: %s", s, bundle0));
            }
            fdny.b(fdnv.b, ffbw0.d);
            fdyy0.g.f(fdsl.a.a, ffbw0, "active migration");
            fdyy0.m(ffbw0, 11);
            return;
        }
        if(Log.isLoggable("rpctransport", 2)) {
            Log.v("rpctransport", "handleCloudRpc: " + bundle0);
        }
        String s1 = bundle0.getString("networkId");
        String s2 = fdyy0.c.a();
        if(s2 == null) {
            Log.d("rpctransport", "handleCloudRpc: error, the cloud network isn\'t configured");
            fdny.b(fdnv.b, ffbw0.d);
            fdyy0.g.f(fdsl.a.a, ffbw0, "cloud network not configured");
            fdyy0.m(ffbw0, 10);
            return;
        }
        if(!s2.equals(s1)) {
            Log.d("rpctransport", a.d(s2, s1, "handleCloudRpc: error, the networkId (", " != the configured cloud network (", ")"));
            fdny.b(fdnv.b, ffbw0.d);
            fdyy0.g.f(fdsl.a.a, ffbw0, a.l(s1, s2, "the networkIds doesn\'t match, expected ", ", was "));
            fdyy0.m(ffbw0, 13);
            return;
        }
        if(Log.isLoggable("rpctransport", 2)) {
            Log.v("rpctransport", "handleCloudRpc: " + ffda.a(ffbw0));
        }
        if(fdyy.k(ffbw0.f)) {
            ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)ffbw0).jf(5, null);
            hftp0.X(((ProtoLiteMessage)ffbw0));
            String s3 = fdyy0.j.a().a;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ffbw ffbw1 = (ffbw)hftp0.b_message;
            s3.getClass();
            ffbw1.b |= 8;
            ffbw1.f = s3;
            ffbw0 = (ffbw)hftp0.N_build();
        }
        fdyy0.g.d(fdsl.a.a, ffbw0);
        if(fdyy0.l(fdsl.a.a, ffbw0)) {
            fdny.b(fdnv.a, ffbw0.d);
            return;
        }
        fdny.b(fdnv.b, ffbw0.d);
    }
}

