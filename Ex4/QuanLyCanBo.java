package Ex4;

import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLyCanBo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CanBo canBo = new CanBo();
        while (1 > 0) {
            System.out.println("Hay chon mot trong nhung lua chon sau: ");
            System.out.println("1.Them moi can bo.");
            System.out.println("2.Tim kiem theo ho ten.");
            System.out.println("3.Hien thi thong tin ve danh sach cac can bo.");
            System.out.println("4.Thoat");
            int ch = sc.nextInt();
            switch (ch) {
                case 1: {
                    System.out.println("Ban muon them nguoi o chuc vu gi: ");
                    System.out.println("1. Cong nhan ");
                    System.out.println("2. Ky Su ");
                    System.out.println("3. Nhan Vien ");
                    System.out.println("4. Thoat");
                    int ch1 = sc.nextInt();
                    switch (ch1) {
                        case 1: {
                            System.out.println("Nhap ten cua cong nhan:");
                            String name1 = sc.next();
                            System.out.println("Nhap tuoi cua cong nhan");
                            int age1 = sc.nextInt();
                            System.out.println("Nhap gioi tinh cua cong nhan");
                            String gender1 = sc.next();
                            System.out.println("Nhap dia chi cua cong nhan");
                            String address1 = sc.next();
                            System.out.println("Nhap cap bac cua cong nhan");
                            int level = sc.nextInt();
                            CongNhan congNhan = new CongNhan (name1,age1,gender1,address1,level);
                            canBo.AddCanBo(congNhan);
                            break;
                        }
                        case 2:{
                            System.out.println("Nhap ten cua ky su:");
                            String name2 = sc.next();
                            System.out.println("Nhap tuoi cua ky su");
                            int age2 = sc.nextInt();
                            System.out.println("Nhap gioi tinh cua ky su");
                            String gender2 = sc.next();
                            System.out.println("Nhap dia chi cua ky su");
                            String address2 = sc.next();
                            System.out.println("Nhap nganh dao tao cua ky su");
                            String nganhdaotao = sc.nextLine();
                            KySu kySu = new KySu (name2,age2,gender2,address2,nganhdaotao);
                            canBo.AddCanBo(kySu);
                            break;
                        }
                        case 3:{
                            System.out.println("Nhap ten cua nhan vien:");
                            String name3 = sc.next();
                            System.out.println("Nhap tuoi cua nhan vien");
                            int age3 = sc.nextInt();
                            System.out.println("Nhap gioi tinh cua nhan vien");
                            String gender3 = sc.next();
                            System.out.println("Nhap dia chi cua nhan vien");
                            String address3 = sc.next();
                            System.out.println("Nhap congviec cua nhan vien");
                            String congviec = sc.next();
                            NhanVien nhanVien = new NhanVien (name3,age3,gender3,address3,congviec);
                            canBo.AddCanBo(nhanVien);
                            break;
                        }
                        default:
                            break;
                    }
                    break;

                }
                case 2: {
                    System.out.println("Nhap ten nguoi ban muon tim: ");
                    String name = sc.next();
                    canBo.FindCanBo(name);
                    break;
                }
                case 3: {
                    canBo.ShowListCanBo();
                    break;
                }
                case 4:{
                    break;
                }
                default:
                    System.out.println("Vui Long Kiem Tra Lai!");
                    continue;
            }
        }
    }
}

