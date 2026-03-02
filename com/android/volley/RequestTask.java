package com.android.volley;

public abstract class RequestTask implements Runnable {
    public final Request d;

    public RequestTask(Request request0) {
        this.d = request0;
    }

    public int compareTo(RequestTask requestTask0) {
        return this.d.compareTo(requestTask0.d);
    }
}

