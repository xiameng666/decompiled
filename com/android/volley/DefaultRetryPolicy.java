package com.android.volley;

public class DefaultRetryPolicy implements RetryPolicy {
    public static final float DEFAULT_BACKOFF_MULT = 1.0f;
    public static final int DEFAULT_MAX_RETRIES = 1;
    public static final int DEFAULT_TIMEOUT_MS = 2500;
    private int a;
    private int b;
    private final int c;
    private final float d;

    public DefaultRetryPolicy() {
        this(2500, 1, 1.0f);
    }

    public DefaultRetryPolicy(int v, int v1, float f) {
        this.a = v;
        this.c = v1;
        this.d = f;
    }

    public float getBackoffMultiplier() {
        return this.d;
    }

    @Override  // com.android.volley.RetryPolicy
    public int getCurrentRetryCount() {
        return this.b;
    }

    @Override  // com.android.volley.RetryPolicy
    public int getCurrentTimeout() {
        return this.a;
    }

    protected boolean hasAttemptRemaining() {
        return this.b <= this.c;
    }

    @Override  // com.android.volley.RetryPolicy
    public void retry(VolleyError volleyError0) {
        ++this.b;
        this.a += (int)(((float)this.a) * this.d);
        if(this.hasAttemptRemaining()) {
            return;
        }
        throw volleyError0;
    }
}

