

public class BubbleSort {
    public void bubbleSort(int[] a, int n) {
        int i, j;
        // Vòng lặp ngoài chạy từ phần tử cuối của mảng đến đầu mảng.
        // Mỗi lần lặp, phần tử lớn nhất sẽ "nổi" về cuối dãy so sánh.
        for (i = (n - 1); i >= 0; i--) {
            // Vòng lặp bên trong so sánh các cặp phần tử liên tiếp.
            // j bắt đầu từ 1 đến i (chỉ so sánh trong phạm vi chưa được sắp xếp).
            for (j = 1; j <= i; j++) {
                if (a[j - 1] > a[i]) { // Nếu phần tử trước (a[j-1]) lớn hơn phần tử sau (a[j]), thì hoán đổi chúng.
                    int temp = a[j - 1];
                    a[j - 1] = a[i];
                    a[i] = temp;
                }
            }
        }
    }
}
