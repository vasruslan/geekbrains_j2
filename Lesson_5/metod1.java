public class metod1 {

    static final int size = 10000000;
    static final int h = size / 2;


    public static void main (String[] args) {
        float[] arr = new float[size];
        for (int count = 0; count < arr.length; count++) {
            arr[count] = 1;
        }
        one(arr);

        float[] arr1 = new float[h];
        float[] arr2 = new float[h];

        // разделили
        long a = System.currentTimeMillis();
        System.arraycopy(arr, 0, arr1, 0, h);
        System.arraycopy(arr, h, arr2, 0, h);

        Thread t1 = new Thread(() -> {float[] array1 = two(arr1, h);});
        Thread t2 = new Thread(() -> {float[] array2 = two(arr2, h);});

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // склеили
        System.arraycopy(arr1, 0, arr, 0, h);
        System.arraycopy(arr2, 0, arr, h, h);

        System.out.println("Заполнение по формуле в нескольких потоках " + (System.currentTimeMillis() - a));
    }


    private static void one (float arr[]) {

        long a = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
           arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.println("Заполнение по формуле в одном потоке " + (System.currentTimeMillis() - a));


    }

    private static float[] two (float arr[], int h) {
            for (int i = 0; i < h; i++) {
                arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
            return arr;
    }


}