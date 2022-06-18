package ss0_On_luyen_code;

public class SapXepChon implements SapXepInterface {
    @Override
    public void SApXepTang(double[] arr) {
        int i, j, min_idx;
        int n = arr.length;
        for (i = 0; i < n - 1; i++) {
            min_idx = i;
            for (j = i + 1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;
            double temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
    @Override
    public void SapXepGiam(double[] arr) {
        int i, j, min_idx;
        int n = arr.length;
        for (i = 0; i < n - 1; i++) {
            min_idx = i;
            for (j = i + 1; j < n; j++)
                if (arr[j] > arr[min_idx])
                    min_idx = j;
            double temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
}
