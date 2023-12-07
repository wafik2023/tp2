



public class livre1test {
    public livre1test() {
    }

    public static void main(String[] args) {
        livre1 lv1 = new livre1(0, "naili", "hounaida", 5.2);

        System.out.println("id=" + lv1.getId() + "/nom auteur=" + lv1.getNomaut() + "/prenom auteur=" + lv1.getPrenomaut() + "/prix livre=" + lv1.getPrix());
        System.out.println("dernier id = "+lv1.getId());
        lv1.setId(4);
        System.out.println("le nouveau id =" + lv1.getId());
    }
}

