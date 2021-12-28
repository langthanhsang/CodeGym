package battap1.manager;

import battap1.model.Human;

import java.util.ArrayList;
import java.util.Scanner;

public class HumanManager {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Human> humans = new ArrayList<>();

    public Human creatHuman() {
        System.out.println("nhập tên người vào : ");
        String name = scanner.nextLine();
        System.out.println("nhập ngày tháng năm sinh : ");
        String dob = scanner.nextLine();
        String idCard = scanner.nextLine();
        for (Human human : humans) {
            if (human.getIdCard().equals(idCard)) {
                System.out.println("id trùng nhập lại: ");
                return null;
            }
        }
        Human human = new Human(name, dob, idCard);
        humans.add(human);
        return human;
    }

    public void deleteHuman(String idCard) {
        Human human = null;
        for (Human h : humans) {
            if (human.getIdCard().equals(idCard)) {
                human = h;
            }
        }
        boolean check = humans.remove(human);
        if (check) {
            System.out.println("xoá thành cồng: ");
        } else {
            System.out.println("xoá không thành công");
        }
    }

    public void displayHuman(String idCard) {
        Human human = null;
        for (Human h : humans) {
            if (human.getIdCard().equals(idCard)) {
                human = h;
            }
        }
        if (human != null) {
            System.out.println(human);
        } else {
            System.out.println("số idCard không tồn tại : ");
        }
    }
    public void displayAll(){
        for (Human human: humans) {
            System.out.println(human);
        }
    }
    public Human getHuman(String idCard) {
        Human human = null;
        for (Human h: humans) {
          if(human.getIdCard().equals(idCard)){
              human = h;
          }
        }
        return  human;
    }

}
