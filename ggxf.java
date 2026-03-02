public final class ggxf {
    public static int a(ghae ghae0, ghae ghae1, ghae ghae2) {
        double f;
        try {
            ggxo ggxo0 = ggxo.c(ghae1.i, ghae2.j);
            ggxo ggxo1 = ggxo.c(ghae1.j, ghae2.i);
            ggxo ggxo2 = ggxo.c(ghae1.j, ghae2.h);
            ggxo ggxo3 = ggxo.c(ghae1.h, ghae2.j);
            ggxo ggxo4 = ggxo.c(ghae1.h, ghae2.i);
            ggxo ggxo5 = ggxo.c(ghae1.i, ghae2.h);
            ggxo ggxo6 = ggxo0.d(ggxo1);
            ggxo ggxo7 = ggxo2.d(ggxo3);
            ggxo ggxo8 = ggxo4.d(ggxo5);
            ggxo ggxo9 = ggxo6.b(ghae0.h);
            ggxo ggxo10 = ggxo7.b(ghae0.i);
            ggxo ggxo11 = ggxo8.b(ghae0.j);
            double[] arr_f = ggxo9.a(ggxo10).a(ggxo11).a;
            f = arr_f[arr_f.length - 1];
        }
        catch(ArithmeticException unused_ex) {
            return 0;
        }
        if((f > 0.0)) {
            return 1;
        }
        return f < 0.0 ? -1 : 0;
    }

    public static double b(double f) {
        return Math.IEEEremainder(f, 6.283185);
    }
}

