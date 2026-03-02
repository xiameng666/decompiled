public class cjdy {
    private int a;
    private float b;

    public cjdy() {
        this.a = 0;
        this.b = 0.0f;
    }

    public float a() {
        return this.b;
    }

    public int b() {
        return this.a;
    }

    public void c(float f) {
        this.b += f;
        int v = this.a + 1;
        this.a = v;
        if(v < 0) {
            this.a = 1;
            this.b = f;
        }
    }
}

