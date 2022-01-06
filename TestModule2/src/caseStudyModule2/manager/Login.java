package caseStudyModule2.manager;

import caseStudyModule2.IOOFile.IOOFile;
import caseStudyModule2.Regex.UserPassRegex;

import java.util.List;
import java.util.Scanner;

public class Login {
    public static User loginUser;
    public static List<User> userList = IOOFile.readUserFile();
    static Scanner scanner = new Scanner(System.in);

    public static void login() {
        while ( true ) {
            System.out.println("****************************************************");
            System.out.println("* CHÀO MỪNG ĐẾN VỚI CHƯƠNG TRÌNH QUẢN LÝ HỌC SINH! *");
            System.out.println("*                    1. đăng nhập                  *");
            System.out.println("*                    2 . đăng ký                   *");
            System.out.println("*                    0. thoát                      *");
            System.out.println("*                    mời bạn chọn                  *");
            System.out.println("*****************************************************");
            int choice = 99;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
            }
            switch (choice) {
                case 1:
                    while ( true ) {
                        System.out.println("************************************");
                        System.out.println("* 1. đằng nhập bằng tài khoản Amin *");
                        System.out.println("* 2. đăng nhập bằng USER           *");
                        System.out.println("* 3. thoát                         *");
                        System.out.println("*    mời bạn chọn!                 *");
                        System.out.println("************************************");
                        int choice1 = 99;
                        try {
                            choice1 = Integer.parseInt(scanner.nextLine());
                        } catch (Exception e) {
                        }
                        if (choice == 3) {
                            login();
                        }
                        switch (choice1) {
                            case 1:
                                longInAdmin();
                                break;
                            case 2:
                               logInUser();
                               break;
                            default:
                                System.out.println("vui lòng nhập đúng!");
                        }
                    }
                case 2:
                    System.out.println("đăng ký người dùng mới!");
                    String user = getUserName();
                    String pass = getPassword();
                    userList.add(new User(user,pass));
                    IOOFile.writeFile();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("vui lòng nhập đúng!");
            }
        }
    }

    private static void logInUser() {
        while ( true ) {
            System.out.println("***********************");
            System.out.println("*        menu         *");
            System.out.println("* 1.  tiếp tục        *");
            System.out.println("* 2.   thoát          *");
            System.out.println("***********************");
            int choice = 100;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
            }
            if (choice == 2) {
                return;
            }
            switch (choice) {
                case 1:
                    System.out.println("tài khoản :");
                    String username = scanner.nextLine();
                    System.out.println("mật khẩu : ");
                    String password = scanner.nextLine();
                    boolean login = false;
                    for (User user : userList) {
                        if (user.getUsername().equalsIgnoreCase(username) && user.getPassword().equals(password)) {
                            System.out.println("xin chào " + user.getUsername());
                            login = true;
                            loginUser = user;
                            StudentManager.redFile();
                        }
                    }
                    if (login) {
                        Menu.menuUser();
                    } else {
                        System.out.println("sai tài khoản hoăc mật khẩu!");
                    }
                    break;
                default:
                    System.out.println("vui lòng chon đúng");
            }
        }

    }

    private static void longInAdmin() {
        while ( true ) {
            System.out.println("***********************");
            System.out.println("*        menu         *");
            System.out.println("* 1.  tiếp tục        *");
            System.out.println("* 2.   thoát          *");
            System.out.println("***********************");
            int choice = 100;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
            }
            if (choice == 2) {
                return;
            }
            switch (choice) {
                case 1:
                    System.out.println("tài khoản : ");
                    String uername = scanner.nextLine();
                    System.out.println("mật khẩu!");
                    String password = scanner.nextLine();
                    boolean login = false;

                    if (uername.equalsIgnoreCase("admin") && password.equals("admin")) {
                        System.out.println("xin chào" + uername);
                        login = true;
                        StudentManager.redFile();
                    }
                    if (login) {
                        Menu.menuAmin();
                    } else {
                        System.out.println("sai tài khoản mật khẩu!");
                    }
                    break;
                default:
                    System.out.println("vui lòng chon đúng");
            }
        }
    }

    private static String getUserName() {
        while ( true ) {
            try {
                System.out.println(" tài khoản!");
                String username = scanner.nextLine();
                if (UserPassRegex.validate(username)) {
                    boolean exit = false;
                    for (User user : userList) {
                        if (user.getUsername().equalsIgnoreCase(username)) {
                            System.out.println("tài khoản đã tồn tại!");
                            exit = true;
                        }
                    }
                    if (!exit) {
                        return username;
                    }
                } else throw new Exception();
            } catch (Exception e) {
                System.out.println("tài khoản có it nhất 1 kí tự");
            }
        }
    }

    private static String getPassword() {
        while ( true ) {
            try {
                System.out.println("mật khẩu: ");
                String password = scanner.nextLine();
                if (UserPassRegex.validate(password)) {
                    return password;
                } else throw new Exception();
            } catch (Exception e) {
                System.out.println("mật khẩu ít nhất phải có 1 kí tự!");
            }
        }
    }
}