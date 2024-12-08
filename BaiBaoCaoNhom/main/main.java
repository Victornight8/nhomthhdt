package main;

import java.util.Scanner;

import services.HospitalService;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HospitalService manager = new HospitalService();
		manager.initDepartments();
		int choose;

		while (true) {
			System.out.println("\n+---------------------------------------------+");
			System.out.println("|        HỆ THỐNG QUẢN LÍ BỆNH VIỆN           |");
			System.out.println("+---------------------------------------------+");
			System.out.println("| 1. QUẢN LÍ THÔNG TIN BỆNH NHÂN              |");
			System.out.println("| 2. QUẢN LÍ THÔNG TIN BÁC SĨ                 |");
			System.out.println("| 3. QUẢN LÍ LỊCH HẸN, PHÒNG KHÁM             |");
			System.out.println("| 4. QUẢN LÍ THUỐC VÀ ĐIỀU TRỊ                |");
			System.out.println("| 5. XEM BÁO CÁO THỐNG KÊ                     |");
			System.out.println("| 6. THOÁT                                    |");
			System.out.println("+---------------------------------------------+");
			System.out.print("Lựa chọn chức năng: ");
			try {
				choose = sc.nextInt();
				switch (choose) {
				case 1:
					int luaChonC1;
					boolean flag = true;
					while (flag) {
						System.out.println("\n+-----------------------------------------------+");
						System.out.println("|       QUẢN LÍ THÔNG TIN BỆNH NHÂN             |");
						System.out.println("+-----------------------------------------------+");
						System.out.println("| 1. Thêm bệnh nhân                             |");
						System.out.println("| 2. Xóa bệnh nhân                              |");
						System.out.println("| 3. Sửa thông tin bệnh nhân                    |");
						System.out.println("| 4. Xem danh sách bệnh nhân					|");
						System.out.println("| 5. Thoát                                      |");
						System.out.println("+-----------------------------------------------+");
						System.out.print("Nhập lựa chọn: ");

						try {
							luaChonC1 = sc.nextInt();
							switch (luaChonC1) {
							case 1:
								manager.addPerson("patient");
								break;
							case 2:
								manager.removePatient();
								break;
							case 3:
								manager.editPatient();
								break;
							case 4:
								manager.showListPatient();
								break;
							case 5:
								System.out.println("Thoát thành công!");
								flag = false;
								break;
							}
						} catch (Exception e) {
							System.out.println("Lỗi nhập dữ liệu, vui lòng thử lại.");
							sc.nextLine();
						}
					}
					break;
				case 2:
					while (true) {
						System.out.println("\n+-----------------------------------------------+");
						System.out.println("|       QUẢN LÍ THÔNG TIN BÁC SĨ                |");
						System.out.println("+-----------------------------------------------+");
						System.out.println("| 1. Thêm bác sĩ                                |");
						System.out.println("| 2. Xóa bác sĩ                                 |");
						System.out.println("| 3. Sửa thông tin bác sĩ                       |");
						System.out.println("| 4. Xem danh sách bác sĩ                       |");
						System.out.println("| 5. Thoát                                      |");
						System.out.println("+-----------------------------------------------+");
						System.out.print("Nhập lựa chọn: ");
						int luaChonC2 = sc.nextInt();
						try {
							switch (luaChonC2) {
							case 1:
								manager.addPerson("doctor");
								break;
							case 2:
								manager.removeDoctor();
								break;
							case 3:
								manager.editDoctor();
								break;
							case 4:
								manager.showListDoctor();
								break;
							case 5:
								System.out.println("Đã thoát");
								return;
							}
						} catch (Exception e) {
							System.out.println("Lỗi nhập dữ liệu, vui lòng thử lại.");
							sc.nextLine();
						}
					}
				case 3:
					// Các chức năng cho mục 3
					break;
				case 4:
                                   while (true) {
                                        System.out.println("\n+-----------------------------------------------+");
                                        System.out.println("|       QUẢN LÍ ĐƠN THUỐC                       |");
                                        System.out.println("+-----------------------------------------------+");
                                        System.out.println("| 1. Thêm đơn thuốc                             |");
                                        System.out.println("| 2. Sửa đơn thuốc                              |");
                                        System.out.println("| 3. Xóa đơn thuốc                              |");
                                        System.out.println("| 4. Xem danh sách đơn thuốc                    |");
                                        System.out.println("| 5. Thoát                                      |");
                                        System.out.println("+-----------------------------------------------+");
                                        System.out.printf("Lựa chọn chức năng: ");
                                        int choice = sc.nextInt();

                                        switch (choice) {
                                            case 1:
                                                manager.addPrescription();
                                                break;
                                            case 2:
                                                manager.editPrescription();
                                                break;
                                            case 3:
                                                 manager.removePrescription();
                                                break;
                                            case 4:
                                                manager.showListPrescriptions();
                                                break;
                                            case 5:
                                                return;
                                            default:
                                                System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                                        }
                                    }
                                    
				case 5:
					// Các chức năng cho mục 5
					return;
				case 6:
					System.out.println("Thoát chương trình.");
					sc.close();
					return;
				default:
					System.out.println("Lựa chọn không hợp lệ. Vui lòng nhập lại.");
				}
			} catch (Exception e) {
				System.out.println("Lỗi nhập dữ liệu, vui lòng thử lại.");
			}
		}
	}
}
