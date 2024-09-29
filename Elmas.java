public class Elmas {
    public static void main(String[] args) {
        int n = 5; // Elmasın yarı yüksekliği

        // Üst kısmı
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" "); // Boşluk
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*"); // Yıldız
            }
            System.out.println(); // Yeni satıra geç
        }

        // Alt kısmı
        for (int i = n - 1; i >= 1; i--) {
            for (int j = n; j > i; j--) {
                System.out.print(" "); // Boşluk
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*"); // Yıldız
            }
            System.out.println(); // Yeni satıra geç
        }
    }
}
