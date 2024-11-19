import java.util.Scanner;

public class P__STAFF_MANAGEMENT{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soNhanVien = Integer.parseInt(scanner.nextLine());
        int luongCaoNhat = Integer.parseInt(scanner.nextLine());
        int luongCoBan = Integer.parseInt(scanner.nextLine());
        int heSoLuongBatDau = Integer.parseInt(scanner.nextLine());
        int heSoLuongTangThem = Integer.parseInt(scanner.nextLine());
        String[] tenNhanVien = new String[soNhanVien];
        int[] namSinh = new int[soNhanVien];
        int[] soNamCongTac = new int[soNhanVien];
        int[] luongHienTai = new int[soNhanVien];

        int tongLuong = 0;
        for (int i = 0; i < soNhanVien; i++) {
            tenNhanVien[i] = scanner.nextLine();
            namSinh[i] = Integer.parseInt(scanner.nextLine());
            soNamCongTac[i] = Integer.parseInt(scanner.nextLine());
            if (soNamCongTac[i] < 10) {
                int heSoTangThem = (soNamCongTac[i] / 5) * heSoLuongTangThem;
                luongHienTai[i] = (luongCoBan * heSoLuongBatDau) + (luongCoBan * heSoTangThem);
            } else {
                luongHienTai[i] = 16000000;

                if (soNamCongTac[i] > 10) {
                    int heSoTangThem = ((soNamCongTac[i] / 5) - 1) * heSoLuongTangThem; 
                    luongHienTai[i] += (luongCoBan * heSoTangThem);
                }
            }

            if (luongHienTai[i] > luongCaoNhat) {
                luongHienTai[i] = luongCaoNhat;
            }

            tongLuong += luongHienTai[i];
        }

        for (int i = 0; i < soNhanVien; i++) {
            System.out.print(tenNhanVien[i] + " " + namSinh[i] + " " + soNamCongTac[i] + " " + luongHienTai[i] + " ");
        }

        System.out.println(tongLuong);
    }
}
hung.nt225633@sis.hust.edu.vn   Dinohex123hung