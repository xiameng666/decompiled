import android.os.SystemClock;
import j..util.Objects;

final class fvmo {
    public int a;
    final fvmp b;
    private long c;
    private long d;
    private long e;

    public fvmo(fvmp fvmp0) {
        Objects.requireNonNull(fvmp0);
        this.b = fvmp0;
        super();
        this.c = SystemClock.elapsedRealtime();
        this.d = 200L;
        this.a = 0;
        this.e = 0L;
    }

    public final void a() {
        synchronized(this) {
            this.c = SystemClock.elapsedRealtime();
            this.d = 200L;
            this.a = 0;
            this.e = 0L;
        }
    }

    public final boolean b() {
        int v6;
        int v4;
        int v2;
        synchronized(this) {
            long v1 = SystemClock.elapsedRealtime();
            if(Long.compare(v1 - this.e, this.d) > 0) {
                fvmp fvmp0 = this.b;
                gwvh gwvh0 = fvmp0.a;
                if(gwvh0 == null) {
                    v2 = 0;
                }
                else {
                    gwvi gwvi0 = (gwvi)((ProtoLiteBuilder)gwvh0).N_build();
                    if(((ProtoLiteMessage)gwvi0).isImmutable()) {
                        v2 = ((ProtoLiteMessage)gwvi0).t(null);
                        if(v2 < 0) {
                            throw new IllegalStateException("serialized size must be non-negative, was " + v2);
                        }
                    }
                    else {
                        int v3 = gwvi0.memoizedSerializedSize & 0x7FFFFFFF;
                        if(v3 == 0x7FFFFFFF) {
                            v3 = ((ProtoLiteMessage)gwvi0).t(null);
                            if(v3 < 0) {
                                throw new IllegalStateException("serialized size must be non-negative, was " + v3);
                            }
                            gwvi0.memoizedSerializedSize = gwvi0.memoizedSerializedSize & 0x80000000 | v3;
                        }
                        v2 = v3;
                    }
                }
                ProtoLiteBuilder hftp0 = fvmp0.c;
                if(hftp0 == null) {
                    v4 = 0;
                }
                else {
                    gwtl gwtl0 = (gwtl)hftp0.N_build();
                    if(((ProtoLiteMessage)gwtl0).isImmutable()) {
                        v4 = ((ProtoLiteMessage)gwtl0).t(null);
                        if(v4 < 0) {
                            throw new IllegalStateException("serialized size must be non-negative, was " + v4);
                        }
                    }
                    else {
                        int v5 = gwtl0.memoizedSerializedSize & 0x7FFFFFFF;
                        if(v5 == 0x7FFFFFFF) {
                            v5 = ((ProtoLiteMessage)gwtl0).t(null);
                            if(v5 < 0) {
                                throw new IllegalStateException("serialized size must be non-negative, was " + v5);
                            }
                            gwtl0.memoizedSerializedSize = gwtl0.memoizedSerializedSize & 0x80000000 | v5;
                        }
                        v4 = v5;
                    }
                }
                gwuu gwuu0 = fvmp0.b;
                if(gwuu0 == null) {
                    v6 = 0;
                    goto label_56;
                }
                else {
                    gwuv gwuv0 = (gwuv)((ProtoLiteBuilder)gwuu0).N_build();
                    if(((ProtoLiteMessage)gwuv0).isImmutable()) {
                        v6 = ((ProtoLiteMessage)gwuv0).t(null);
                        if(v6 >= 0) {
                            goto label_56;
                        }
                        throw new IllegalStateException("serialized size must be non-negative, was " + v6);
                    }
                    else {
                        int v7 = gwuv0.memoizedSerializedSize & 0x7FFFFFFF;
                        if(v7 == 0x7FFFFFFF) {
                            int v8 = ((ProtoLiteMessage)gwuv0).t(null);
                            if(v8 < 0) {
                                throw new IllegalStateException("serialized size must be non-negative, was " + v8);
                            }
                            gwuv0.memoizedSerializedSize = 0x80000000 & gwuv0.memoizedSerializedSize | v8;
                            v6 = v8;
                        label_56:
                            long v9 = this.d;
                            int v10 = v2 + v4 + v6;
                            if(Long.compare(v9, 100L) >= 0) {
                                long v11 = (long)this.a;
                                long v12 = v1 - this.e;
                                if(Long.compare(this.e, 0L) > 0) {
                                    double f = ((double)(((long)v10) - v11)) / ((double)v12);
                                    if((f > 0.0) && ((long)v10) < 0x32000L) {
                                        double f1 = ((double)(0x32000L - ((long)v10))) / f;
                                        v9 = Math.min(2000L, ((long)(f1 + f1)) / 3L);
                                    }
                                    else {
                                        v9 = 200L;
                                    }
                                }
                                else {
                                    v9 = 200L;
                                }
                            }
                            this.d = v9;
                            this.a = v10;
                            this.e = v1;
                        }
                        else {
                            v6 = v7;
                            goto label_56;
                        }
                    }
                }
            }
            if(((long)this.a) < 0x32000L && v1 - this.c <= 60000L) {
                return false;
            }
        }
        return true;
    }
}

